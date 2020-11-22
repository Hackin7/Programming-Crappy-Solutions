from tkinter import * #python 3 uses lower case for tkinter
import math
#assumption: VIEWPORT IS UNIQUE
master = Tk()
master.resizable(width=FALSE, height=FALSE)
visible = None
viewport_size = None;
image_buffer = None
img_antialias = 1 #off

try:
	from PIL import Image, ImageDraw, ImageTk # Import DNSPython
	PIL_available = True
except ImportError:
	PIL_available = False
	print("Warning: PIL was not loaded correctly")

def flatten_once(ls):
	return [element for tupl in ls for element in tupl]

def init(vp_size):
	global viewport_size
	viewport_size = vp_size
	master.geometry(str(viewport_size)+"x"+str(viewport_size)) #fixed window size
	return

# Graphics Auxiliary

class Posn:
	def __init__(self, x = None, y = None):
		if x is None:
			raise TypeError("Posn(x,y) - x must be a number")
		if y is None:
			raise TypeError("Posn(x,y) - y must be a number")
		self.x = x
		self.y = y
	def __add__(self, other): #huehuehue, operator overloading!
		return Posn(self.x+other.x, self.y+other.y)
	def __mul__(self, factor):
                return Posn(self.x*factor, self.y*factor)
##viewport/canvas capabilities

#a viewport is rendered bitmap buffer
def open_viewport(name, horiz, vert):
	vp, image = open_pixmap(name, horiz, vert)
	#vp.pack()
	show_viewport((vp, image))
	#vp.create_rectangle(0, 0, 600, 600, fill="white")
	return [vp, image]

#a pixmap is an unrendered pixmap buffer
	#how to do this is simple -
		#everything below a certain screening layer is unrendered.
		#everything above is. And make sure there's only 1 thing there.

def open_pixmap(name, horiz, vert):
	#Canvas(parent, [options...])
	global viewport_size, PIL_available
	vp = Canvas(master, width=horiz, height=vert)
	image = None
	if PIL_available:
		image = Image.new("RGB", (int(horiz), int(vert)), "white")
	vp.create_rectangle(viewport_size/6, 0, viewport_size+viewport_size/6, viewport_size, fill="white")
	vp.place(x=-(viewport_size/6))
	hide_viewport((vp, image))
	return [vp, image]

def show_viewport(vp):
	global visible #apparently no automatic closures.
	if vp == None:
		raise TypeError("show_viewport - vp cannot be None")
	if visible != None:
		hide_viewport(visible)
	visible = vp
	Misc.lift(vp[0], aboveThis = None)

def hide_viewport(vp):
	global visible #apparently no automatic closures.
	Misc.lower(vp[0], belowThis=None)
	if visible == vp and visible != None:
		visible = None

def clear_viewport(viewport):
	viewport[0].delete(ALL) #not nearly sure how this works.
	viewport[0].create_rectangle(viewport_size/6, 0, viewport_size+viewport_size/6, viewport_size, fill="white")
	if PIL_available:
		size = viewport[1].size #(width, height)
		viewport[1].paste("white", (0,0,size[0], size[1]))

#def copy_viewport(src, dest):
	#removed, because i can't figure out how to implement it.
	#however. i have no need to.
##color handling capabilities


##drawing capabilities

def draw_line(viewport, p1, p2, color):
	viewport[0].create_line(p1.x, p1.y, p2.x, p2.y, fill=color.hexcode())
	if PIL_available:
		draw = ImageDraw.Draw(viewport[1])
		draw.line(p1.x, p1.y, p2.x, p2.y, fill=color.hexcode())

#poly =  canvas.create_polygon(x0, y0, x1, y1, ..., option, ...)
#points is a list of point objects, need to map and unpack interior twice.
def draw_solid_polygon(viewport, points, offset, color):
	points = flatten_once(map(lambda q: (q.x+offset.x, q.y+offset.y), points))
	#print(*points)
	viewport[0].create_polygon(*points, fill=color.hexcode())
	if PIL_available:
		draw = ImageDraw.Draw(viewport[1])
		draw.polygon(points, fill=color.hexcode())


#draw_pixels is removed, wasn't used in the JS code.
	#probably because it was used only in the 3d rendering code, and that was rewritten.

class Rgb:
	def __init__(self, r,g,b):
		self.r = round(r*255)
		self.g = round(g*255)
		self.b = round(b*255)
	def hexcode(self):
		return '#%02x%02x%02x' % (self.r, self.g, self.b)

#Import/export capabilities

#TODO: make higher quality
#Basically draws whatever is drawn to screen in parallel.
	#However, not pixel perfect.
import datetime
def saveImage(vp, filename=None):
	if PIL_available:
		if(filename == None):
			filename = datetime.datetime.now().strftime("%y%m%d-%H%M%S")
		vp[1].save(filename+".png", "PNG")
	else:
		print("PIL does not appear to be available")

def get_pixels(vp):
	if PIL_available:
		return vp[1].load()
	else:
		raise("PIL does not appear to be available")

def pixels_to_canvas(vp):
	if len(vp) == 2: #why? because PIL doesn't keep a copy of the image, so the moment the function goes out of scope, the image DISAPPEARS.
		vp.append(ImageTk.PhotoImage(vp[1]))
	else:
		vp[2] = ImageTk.PhotoImage(vp[1])
	vp[0].create_image(0,0,image = vp[2], anchor="nw") #else it forget, and diessss

def get_image(vp):
	return vp[1]

def square(x):
	return x*x

def distance(p1, p2):
	return math.sqrt(square(p1.x-p2.x)+square(p1.y-p2.y))

def blit_pixels(viewport, inv_transform, pixels, viewport_size, image_size, mono, zmin = 0, zmax = 1):
	MAX_X = viewport_size[0]
	MAX_Y = viewport_size[1]
	IMAX_X = image_size[0]
	IMAX_Y = image_size[1]
	viewport_pix = get_pixels(viewport)
	for y in range(MAX_Y):
		for x in range(MAX_X):
			src = inv_transform(Posn(x,y)) #this is the posn on the pixels
			srcx = src.x
			srcy = src.y
			#simple 2x2 weighted sampling.
				#weight is inversely proportional to distance.
				#don't try to use this code for your homework on other modules,
				#i haven't taken graphics and i wrote this off the top off my head.
			rsrcx = round(srcx)
			rsrcy = round(srcy)
			if(rsrcx>=0 and rsrcx<IMAX_X and rsrcy>=0 and rsrcy<IMAX_Y): #if the closest pixel is to be rendered
			#used for weighing
				dsrcx = srcx - rsrcx #+ve => right
				dsrcy = srcy - rsrcy #+ve => up
				#used to figure out which pixel we are actually weighing against.
				if(dsrcx>=0):
					esrcx = 1
				else:
					esrcx = -1
				if(dsrcy>=0):
					esrcy = 1
				else:
					esrcy = -1
				original = Posn(srcx, srcy)
				dtgt = 1/(distance(Posn(rsrcx, rsrcy),original)+0.01)
				dtgtdx = 1/(distance(Posn(rsrcx+esrcx, rsrcy),original)+0.01)
				dtgtdy = 1/(distance(Posn(rsrcx, rsrcy+esrcy),original)+0.01)
				dtgtdxdy = 1/(distance(Posn(rsrcx+esrcx, rsrcy+esrcy),original)+0.01)
				tgt = pixels[rsrcx, rsrcy]
				#try to get pixel colour values if possible
					#if not possible, disable the weight
				if(rsrcx+esrcx>= 0 and rsrcx+esrcx<IMAX_X):
					tgtdx = pixels[rsrcx+esrcx, rsrcy]
				else:
					dtgtdx = 0
					dtgtdxdy = 0
					tgtdx = (0,0,0)
				if(rsrcy+esrcy>= 0 and rsrcy+esrcy<IMAX_Y):
					tgtdy = pixels[rsrcx, rsrcy+esrcy]
				else:
					dtgtdy = 0
					dtgtdxdy = 0
					tgtdy = (0,0,0)
				if(dtgtdxdy!=0):
					tgtdxdy = pixels[rsrcx+esrcx, rsrcy+esrcy]
				else:
					tgtdxdy = (0,0,0)
				divisor = (dtgt + dtgtdx + dtgtdy + dtgtdxdy)
				tcolor = (round((dtgt*tgt[0]+dtgtdx*tgtdx[0]+dtgtdy*tgtdy[0]+dtgtdxdy*tgtdxdy[0])/divisor),\
				round((dtgt*tgt[1]+dtgtdx*tgtdx[1]+dtgtdy*tgtdy[1]+dtgtdxdy*tgtdxdy[1])/divisor), \
				round((dtgt*tgt[2]+dtgtdx*tgtdx[2]+dtgtdy*tgtdy[2]+dtgtdxdy*tgtdxdy[2])/divisor))
				def rescale(color):
					if color>=254:
						return 255
					else:
						return round(zmin*255 + (zmax-zmin)*color)
				tcolor = (rescale(tcolor[0]), rescale(tcolor[1]), rescale(tcolor[2]))
				viewport_pix[x,y] = (min(tcolor[0], viewport_pix[x,y][0]), min(tcolor[1], viewport_pix[x,y][1]), min(tcolor[2], viewport_pix[x,y][2]))
	pixels_to_canvas(viewport)

#TODO: test how it renders out of range pixels
	#no one should up-sample with this algorithm -.-
# def blit_pixels(viewport, transform, pixels, viewport_size, image_size, mono):
	# global img_antialias
	# MAX_X = image_size[0]
	# MAX_Y = image_size[1]
	# tviewport = open_pixmap("temp", viewport_size[0]*img_antialias, viewport_size[1]*img_antialias)
	# bound_x = img_antialias*viewport_size[0]
	# bound_y = img_antialias*viewport_size[1]
	# target_pix = get_pixels(tviewport)
	# for y in range(MAX_Y):
		# for x in range(MAX_X):
			# p = Posn(x,y)
			# transposn = transform(p)
			# t_x = transposn.x
			# t_y = transposn.y
			# if(t_x>=0 and t_x<=bound_x and t_y>=0 and t_y<=bound_y):
				# if mono:
					# colour = pixels[x,y]
					# avg = round(colour[0]+colour[1]+colour[2]/3)
					# target_pix[t_x, t_y] = (avg, avg, avg)
				# else:
					# target_pix[t_x, t_y] = pixels[x,y]
	# vp_size = get_image_size(viewport)
	# MAX_X = vp_size[0]
	# MAX_Y = vp_size[1]
	##will leave some dots at the edge.
	##but MUAHAHAHAHAHHAHAHAHAHAHAHAHAHAHAHAH
	##DOES NOT CARE
	# white = (255,255,255)
	# for y in range(1,MAX_Y-1):
		# for x in range(1,MAX_X-1):
			# if(target_pix[x,y]== white):
				# up = target_pix[x,y-1]
				# down = target_pix[x,y+1]
				# left = target_pix[x-1, y]
				# right = target_pix[x+1, y]
				# ul = target_pix[x-1, y+1]
				# ur = target_pix[x+1, y+1]
				# dl = target_pix[x-1, y-1]
				# dr = target_pix[x-1, y-1]
				# if(up == white and down == white and left == white and right == white):
					# colour_r = (ul[0]+ur[0]+dl[0]+dr[0])/4
					# colour_g = (ul[1]+ur[1]+dl[1]+dr[1])/4
					# colour_b = (ul[2]+ur[2]+dl[2]+dr[2])/4
					# target_pix[x,y] = (round(colour_r), round(colour_g), round(colour_b))
				# else:
					# colour_r = (ul[0]+ur[0]+dl[0]+dr[0]+up[0]+down[0]+left[0]+right[0])/8
					# colour_g = (ul[1]+ur[1]+dl[1]+dr[1]+up[1]+down[1]+left[1]+right[1])/8
					# colour_b = (ul[2]+ur[2]+dl[2]+dr[2]+up[2]+down[2]+left[2]+right[2])/8
					# target_pix[x,y] = (round(colour_r), round(colour_g), round(colour_b))
	##TODO: enhancement, averaging for points which have been missed out
	# viewport[1] = tviewport[1].resize((viewport_size[0], viewport_size[1]), Image.ANTIALIAS)
	# pixels_to_canvas(viewport)

def get_image_size(img):
	return img[1].size
def load_image(filename): #returns a vp
	global img_antialias
	if PIL_available:
		img = Image.open(filename)
		img = img.convert('RGB')
		width, height = img.size
		img = img.resize((img_antialias*width, img_antialias*height), Image.BICUBIC)
		tkcanvas, pilcanvas = open_pixmap(filename, img_antialias*width, img_antialias*height)
		return (tkcanvas, img)
	else:
		raise("load_img requires that PIL be available")
