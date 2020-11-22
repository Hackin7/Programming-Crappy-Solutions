# Setup
import graphics
import math
import time
import PyGif

# Constants
viewport_size = 600
spread = 20
active_hollusion = None
lastframe = None

Posn = graphics.Posn
Rgb = graphics.Rgb
draw_solid_polygon = graphics.draw_solid_polygon

graphics.init(viewport_size)
vp = graphics.open_viewport("ViewPort", 4/3*viewport_size, viewport_size)
lp = graphics.open_pixmap("LeftPort", 4/3*viewport_size, viewport_size)
rp = graphics.open_pixmap("RightPort", 4/3*viewport_size, viewport_size)

def clear_all():
	global active_hollusion
	global vp, lp, rp
	if(active_hollusion != None):
		active_hollusion("kill")
		active_hollusion = None
	graphics.clear_viewport(vp)
	graphics.clear_viewport(lp)
	graphics.clear_viewport(rp)

class Frame:
	def __init__(self, p0, p1, p2, z1, z2):
		self.orig = p0
		self.x = p1
		self.y = p2
		self.z1 = z1
		self.z2 = z2

unit_frame = Frame(Posn(1/6*viewport_size, 0),
                            Posn(viewport_size,0),
                            Posn(0,viewport_size),
                            0,
                            1)

def show(painter):
    return painter(vp, unit_frame)

def scale_vect(mult, p):
	return Posn(mult*p.x, mult*p.y)

def transform_posn(frame):
	def f(posn):
		return frame.orig + (scale_vect(posn.x/viewport_size, frame.x) + scale_vect(posn.y/viewport_size, frame.y))
	return f

def inverse_transform_posn(frame):
	a = frame.x.x
	b = frame.y.x
	c = frame.x.y
	d = frame.y.y
	det = a*d-b*c
	if(det == 0):
		raise Exception("somehow you managed to zero the determinent for your frame")
	inv_mat = ((d/det, -b/det), (-c/det, a/det))
	def function(posn):
		nonlocal inv_mat
		t = list(map(lambda m: m[0]*(posn.x-frame.orig.x) + m[1] * (posn.y-frame.orig.y), inv_mat)) #it's a matrix multiply
		return Posn(viewport_size*t[0], viewport_size*t[1])
	return function

# Helpers
def is_list(lst):
	return isinstance(lst, (list, tuple))

# Painters
def blank_bb(vp, frame):
	return

def sail_bb(vp, frame):
	p = [Posn(viewport_size/2, 0), Posn(viewport_size/2, viewport_size), Posn(viewport_size, viewport_size)]
	if(is_list(vp[0])):
		for count, port in enumerate(vp):
			draw_solid_polygon(port, map(transform_posn(frame), p),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
	elif (vp != None):
		draw_solid_polygon(vp, map(transform_posn(frame), p), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))

def corner_bb(vp, frame):
	p = [Posn(viewport_size/2, 0), Posn(viewport_size,0), Posn(viewport_size, viewport_size/2)]
	if(is_list(vp[0])):
		for count, port in enumerate(vp):
			draw_solid_polygon(port, map(transform_posn(frame), p),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
	elif (vp != None):
		draw_solid_polygon(vp, map(transform_posn(frame), p), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))

def black_bb(vp, frame):
	p = [Posn(0,0), Posn(viewport_size,0), Posn(viewport_size, viewport_size), Posn(0, viewport_size)]
	if(is_list(vp[0])):
		for count, port in enumerate(vp):
			draw_solid_polygon(port, map(transform_posn(frame), p),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
	elif (vp != None):
		draw_solid_polygon(vp, map(transform_posn(frame), p), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))

# center-and-fill will center and scale a 2x2 image to fill the entire viewport.
# This is used by circle-bb, spiral-bb, and ribbon-bb.
def center_and_fill(p):
	center = Posn(viewport_size/2,viewport_size/2)
	return center+scale_vect(viewport_size/2, p)

# same with the js version, this doesn't work.
def spiral_bb(vp, frame):
	theta_max = 30
	thickness = -1/theta_max
	offset = 0.1
	angle = 0
	p = []
	while(angle<theta_max):
		p.append(Posn( (offset+angle/theta_max)*math.cos(angle) , (offset+angle/theta_max)*math.sin(angle)))
		angle += offset
	if(is_list(vp[0])):
		for count, port in enumerate(vp):
			draw_solid_polygon(port, map(transform_posn(frame), map(center_and_fill, p)),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
	elif (vp != None):
		draw_solid_polygon(vp, map(transform_posn(frame), map(center_and_fill, p)), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))

def circle_bb(vp, frame):
	unit = 50
	p = []
	angle = 0
	while(angle<2*math.pi):
		p.append(Posn(math.cos(angle),math.sin(angle)))
		angle+= unit/viewport_size
	if(is_list(vp[0])):
		for count, port in enumerate(vp):
			draw_solid_polygon(port, map(transform_posn(frame), map(center_and_fill, p)),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
	elif (vp != None):
		draw_solid_polygon(vp, map(transform_posn(frame), map(center_and_fill, p)), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))

def pentagram_bb(vp, frame):
	unit_offset = viewport_size / 2
	s1 = math.sin(2*math.pi/5) * unit_offset
	c1 = math.cos(2*math.pi/5) * unit_offset
	s2 = math.sin(4*math.pi/5) * unit_offset
	c2 = math.cos(math.pi/5) * unit_offset
	a = s2 / (s1 + s2)
	a_ = 1-a
	p = [Posn(-s1 + unit_offset, -c1 + unit_offset),\
			Posn(s1+unit_offset, -c1 + unit_offset),\
			Posn(-s2+unit_offset, c2+unit_offset),\
			Posn(unit_offset, 0),\
			Posn(s2+unit_offset, c2+unit_offset)
			]
	#converted to 10 element form.
	p = [p[0],\
	p[3]*a+p[2]*a_,\
	p[2],\
	p[1]*a+p[2]*a_,\
	p[4],\
	p[2]*a+p[1]*a_,\
	p[1],\
	p[4]*a+p[3]*a_,\
	p[3],\
	p[2]*a+p[3]*a_]
	if(is_list(vp[0])):
		for count, port in enumerate(vp):
			draw_solid_polygon(port, map(transform_posn(frame), p),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
	elif (vp != None):
		draw_solid_polygon(vp, map(transform_posn(frame), p), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))

def heart_bb(vp, frame):
	k = math.sqrt(2)/2
	p = [Posn(viewport_size/2, (1-k)/(1+3*k) * viewport_size),\
		Posn((1-k)/(1+k) * viewport_size / 2, (1+k)/(1+3*k) * viewport_size),\
		Posn(viewport_size / 2, viewport_size),\
		Posn(viewport_size - (1-k)/(1+k) * viewport_size / 2, (1+k)/(1+3*k) * viewport_size)]
	#draws kite
	if(is_list(vp[0])):
		for count, port in enumerate(vp):
			draw_solid_polygon(port, map(transform_posn(frame), p),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
	elif (vp != None):
		draw_solid_polygon(vp, map(transform_posn(frame), p), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))
	#Draw the top of the heart
	heart_circle = stack_frac(2 / (1 + 3 * k), \
		quarter_turn_right(stack_frac(k / (1+k), blank_bb, circle_bb)), \
		blank_bb)
	heart_circle(vp, frame)
	flip_horiz(heart_circle)(vp, frame)

def rcross_bb(vp, frame):
	p1 = [Posn(0,0),\
		Posn(viewport_size / 4, viewport_size / 4),\
		Posn(3 * viewport_size / 4, viewport_size / 4),\
		Posn(3 * viewport_size / 4, 3 * viewport_size / 4),\
		Posn(viewport_size, viewport_size),\
		Posn(viewport_size, 0)]
	p2 = [Posn(viewport_size / 4, viewport_size / 4),\
		Posn(viewport_size / 4, 3 * viewport_size / 4),\
		Posn(3 * viewport_size / 4, 3 * viewport_size / 4)]
	if(is_list(vp[0])):
		for count, port in enumerate(vp):
			draw_solid_polygon(port, map(transform_posn(frame), p1),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
			draw_solid_polygon(port, map(transform_posn(frame), p2),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
	elif (vp != None):
		draw_solid_polygon(vp, map(transform_posn(frame), p1), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))
		draw_solid_polygon(vp, map(transform_posn(frame), p2), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))

def ribbon_bb(vp, frame):
	theta_max = 30
	thickness = -1 / theta_max
	unit = 0.1
	p = []
	angle = 0
	#make ribbon
	while(angle<theta_max):
		p.append(Posn((angle / theta_max) * math.cos(angle), \
				(angle / theta_max) * math.sin(angle)))
		angle+= unit
	#close it
	while(angle>0):
		p.append(Posn(abs(math.cos(angle) * thickness) + (angle / theta_max * math.cos(angle)),\
				abs(math.sin(angle) * thickness) + (angle / theta_max * math.sin(angle))))
		angle -= unit
	if(is_list(vp[0])):
		for count, port in enumerate(vp):
			draw_solid_polygon(port, map(transform_posn(frame), map(center_and_fill, p)),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
	elif (vp != None):
		draw_solid_polygon(vp, map(transform_posn(frame), map(center_and_fill, p)), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))

def nova_bb(vp, frame):
	p = [Posn(viewport_size / 2, 0),\
				Posn(viewport_size / 4, viewport_size / 2),\
				Posn(viewport_size, viewport_size / 2),\
				Posn(viewport_size / 2, viewport_size / 4)]
	if(is_list(vp[0])):
		for count, port in enumerate(vp):
			draw_solid_polygon(port, map(transform_posn(frame), p),
				Posn((0.3 - frame.z1) * (spread * (((2 * count) / (len(vp) - 1)) - 1)), 0),
                Rgb(frame.z1, frame.z1, frame.z1))
	elif (vp != None):
		draw_solid_polygon(vp, map(transform_posn(frame), p), Posn(0,0), Rgb(frame.z1, frame.z1, frame.z1))

#frame transformation factory
def process_frame(op, frame):
	p0 = frame.orig
	p1 = frame.x
	p2 = frame.y
	z1 = frame.z1
	z2 = frame.z2

	if (op == "bottom_frac"):
		def function(frac):
			return Frame(p0 + scale_vect(1 - frac, p2), p1, scale_vect(frac, p2), z1, z2)
		return function
	elif (op == "top_frac"):
		def function(frac):
			return Frame(p0, p1, scale_vect(frac, p2), z1, z2)
		return function
	#unused
	elif (op == "left"):
		return Frame(p0, scale_vect(1/2, p1), p2, z1, z2)
	#unused
	elif (op == "right"):
		return Frame(p0+scale_vect(1/2, p1), scale_vect(1/2, p1), p2, z1, z2)
	elif (op == "flip_horiz"):
		return Frame(p0+p1, scale_vect(-1, p1), p2, z1, z2)
	elif (op == "flip_vert"):
		return Frame(p0+p2, p1, scale_vect(-1, p2), z1, z2)
	elif (op == "reduce_2"): # unused in original
		raise NotImplementedError("reduce_2 is not implemented")
	elif (op == "rotate"): #bug: Basically old rotate bug.
		def function(rad):
			cos_theta = math.cos(rad)
			sin_theta = math.sin(rad)
			def rotate_posn(p):
				return Posn(cos_theta*p.x + sin_theta * p.y, cos_theta * p.y - sin_theta * p.x)
			half_gradient = scale_vect(1/2, p1+p2)
			center = p0+half_gradient+ rotate_posn(scale_vect(-1, half_gradient))
			return Frame(center, rotate_posn(p1), rotate_posn(p2), z1, z2)
		return function
	elif (op == "rotate90"):
		return Frame(p0+p1, p2, scale_vect(-1, p1), z1, z2)
	elif (op == "deep_frac"):
		def function(frac):
			return Frame(p0, p1, p2, z1+((z2-z1)*frac),z2)
		return function
	elif (op == "shallow_frac"):
		def function(frac):
			return Frame(p0, p1, p2, z1, z1+((z2-z1)*frac))
		return function
	elif (op == "scale_independent"):
		def function(ratio_x, ratio_y):
			gradient = p1+p2
			scaled_gradient = Posn(((1-ratio_x)/2)* gradient.x, ((1-ratio_y)/2)*gradient.y)
			center = p0+scaled_gradient
			return Frame(center, scale_vect(ratio_x, p1), scale_vect(ratio_y, p2), z1, z2)
		return function
	elif (op == "translate"):
		def function(x,y):
			return Frame(p0+scale_vect(x,p1)+scale_vect(y,p2), p1,p2,z1,z2)
		return function

def stack_frac(frac, p1, p2):
	def function(vp, frame):
		uf = process_frame("top_frac", frame)(frac)
		lf = process_frame("bottom_frac", frame)(1-frac)
		p1(vp, uf)
		p2(vp, lf)
	return function

#top, bottom
def stack(p1, p2):
	return stack_frac(1/2, p1, p2)

def rotate(rad, painter):
	def function(vp, frame):
		painter(vp, process_frame("rotate", frame)(rad))
	return function

def eighth_turn_left(painter):
	return rotate(math.pi/4, painter)

def quarter_turn_right(painter):
	def function(vp, frame):
		painter(vp, process_frame("rotate90", frame))
	return function

def flip_vert(painter):
	def function(vp, frame):
		painter(vp, process_frame("flip_vert", frame))
	return function

def flip_horiz(painter):
	def function(vp, frame):
		painter(vp, process_frame("flip_horiz", frame))
	return function

def overlay_frac(frac, p1, p2):
	def function(vp, frame):
		if(frac>1 or frac<0):
			raise ValueError("overlay_frac: 0 <= frac <= 1 is required")
		else:
			df = process_frame("deep_frac", frame)(frac)
			sf = process_frame("shallow_frac", frame)(frac)
			p2(vp, df)
			p1(vp, sf)
	return function

def overlay(p1, p2):
	return overlay_frac(1/2, p1, p2)

def scale_independent(ratio_x, ratio_y, painter):
	def function(vp, frame):
		painter(vp, process_frame("scale_independent", frame)(ratio_x, ratio_y))
	return function

def scale(ratio, rune):
	painter = rune
	return scale_independent(ratio, ratio, painter)

# Translate the painter. Note that positive x means right translate
# positive y means translate down.
# the amount is to be a fraction of viewport_size
def translate(x,y, painter):
	def function(vp, frame):
		painter(vp, process_frame("translate", frame)(x,y))
	return function

def turn_upside_down(painter):
	return quarter_turn_right(quarter_turn_right(painter))

def quarter_turn_left(painter):
	return turn_upside_down(quarter_turn_right(painter))

def beside(painter1, painter2):
	return quarter_turn_right(stack(quarter_turn_left(painter2), quarter_turn_left(painter1)));

def make_cross(painter):
	return stack(beside(quarter_turn_right(painter), turn_upside_down(painter)), beside(painter,quarter_turn_left(painter)))

def repeat_pattern(n, pat, pic):
	if(n==0):
		return pic
	else:
		return pat(repeat_pattern(n-1, pat, pic))

def stacker(n, rune):
    painter = rune
    result = painter
    for i in range(2,n+1):
            result = stack_frac(1/i, painter, result)
    return result

def tree(n, rune):
    result = rune
    counter = n
    while counter != 1:
        next_image = scale((counter - 1)/n, rune)
        result = overlay_frac(1/(n-counter+2), next_image, result)
        counter = counter - 1
    return result

def ring(n, rune):
    rune = scale(2/n, rune)
    res = blank_bb
    r = 1/2 - 1/n
    for tick in range(n):
        x = math.sin(tick/n * 2 * math.pi) * r
        y = math.cos(tick/n * 2 * math.pi) * r
        res = overlay_frac(0, res, translate(x,y,rune))
    return res

def hollusion(painter, ports=None):
	global active_hollusion
	frequency = 2
	MAX_X = round(4/3*viewport_size)
	MAX_Y = round(viewport_size)
	num = ports
	if ports == None or ports <= 2:
		num = 9 #because python is faster than scheme. Used to be 3
	buffers = list(map(lambda p: graphics.open_pixmap("buffer", 4/3*viewport_size,viewport_size), range(num)))
	stereo = vp

	def animation(cmd=None):
		ports = buffers
		kill = False
		curr = -1
		dir = 1
		def Self(msg):
			nonlocal kill
			nonlocal curr
			nonlocal Self
			nonlocal dir
			if msg == "next":
				curr = (curr+dir)
				if (curr == num or curr<0):
					dir = -dir
					curr += 2*dir
				graphics.show_viewport(buffers[curr])
				if(kill != True): #moved it here so you can happily next if the hollusion is dead.
					vp[0].after(round(1000/(frequency * len(ports))), lambda: Self("next"))
					#Timer(1/(frequency * len(ports)), Self, args=["next"]).start() #doesn't work because not thread safe
			elif msg == "kill":
				kill = True
			elif msg == "buffer":
				return ports
			else:
				return
		return Self
	painter(buffers, unit_frame)
	if(active_hollusion != None):
		active_hollusion("kill")
	active_hollusion = animation()
	active_hollusion("next")
	return active_hollusion

def anaglyph(painter):
	if graphics.PIL_available:
		MAX_X = round(4/3*viewport_size)
		MAX_Y = viewport_size
		stereo = vp
		depth = graphics.open_pixmap("Depthmap Viewport", viewport_size, viewport_size)

		def get_depth(x,y, pix):
			return pix[x,y][0]

		painter([lp, rp], unit_frame)
		#really! if you use getdata(), you need to calculate the offset in the array
		#load() returns a "2d pixel array" or rather, whatever it returns acts like one for all intents and purposes
		lp_pix = graphics.get_pixels(lp)
		rp_pix = graphics.get_pixels(rp)
		pixels = graphics.get_pixels(stereo)
		for y in range(MAX_Y):
			for x in range(MAX_X):
				l = get_depth(x,y,lp_pix)
				r = get_depth(x,y,rp_pix)
				pixels[x,y] = (r,l,l)

		graphics.pixels_to_canvas(stereo)

	else:
		print("PIL does not appear to be available")

def function_to_painter(depth_fun):
	tolerance = 1/spread
	def get_depth(x, y, dir, frame): # lp -> dir = -1, rp -> dir = 1
		result = 1
		for c in range(0, spread):
			ox = round(x + (dir * ((-0.3 * spread) + c)))
			if (ox >= 0 and ox < viewport_size):
				curr = depth_fun(round(ox), round(y))
				if (curr != 1):
					curr = frame.z1 + ((frame.z2 - frame.z1) * curr)
				d = abs(curr - c/spread)
				if(d < tolerance):
					result = curr
		return result
	def painter(vp, frame):
		def ana_out_loop(port, count):
			inverse_transform = inverse_transform_posn(frame)
			tgtpixels = graphics.get_pixels(port)
			size = graphics.get_image_size(port)
			MAX_X = size[0]
			MAX_Y = size[1]
			tgtpixels = graphics.get_pixels(port)
			for y in range(MAX_Y):
				for x in range(MAX_X):
					posn = inverse_transform(Posn(x,y))
					col = get_depth(posn.x, posn.y, count, frame)
					if (col>1):
						col = 1
					col = round(col*255)
					if(col<255):
						#tgtpixels[x,y] = (col, col, col)
						tgtpixels[x,y] = (min(col, tgtpixels[x,y][0]), min(col, tgtpixels[x,y][1]), min(col, tgtpixels[x,y][2]))
			graphics.pixels_to_canvas(port)
		if(is_list(vp[0])):
			for count, port in enumerate(vp):
				ana_out_loop(port, ((2*count)/(len(vp)-1) - 1))
		else:
			inverse_transform = inverse_transform_posn(frame)
			tgtpixels = graphics.get_pixels(vp)
			size = graphics.get_image_size(vp)
			MAX_X = size[0]
			MAX_Y = size[1]
			for y in range(MAX_Y):
				for x in range(MAX_X):
					posn = inverse_transform(Posn(x,y))
					color = depth_fun(posn.x, posn.y)
					if(color != 1):
						color = frame.z1 + ((frame.z2 - frame.z1) * color)
					if (color>1):
						color = 1
					color = round(color*255)
					if(color<255): #assuming that white is the transparency color
						#tgtpixels[x,y] = (color, color, color)
						tgtpixels[x,y] = (min(color, tgtpixels[x,y][0]), min(color, tgtpixels[x,y][1]), min(color, tgtpixels[x,y][2]))
			graphics.pixels_to_canvas(vp)
	return painter


def image_to_painter(filename):
	img = graphics.load_image(filename)
	tolerance = 1/spread
	limit = 0.86
	#process
	def painter(vp, frame):
		if(is_list(vp[0])):
			def get_depth(x,y,dir):
				global spread
				nonlocal pixels
				for c in range(spread):
					ox = round(x+dir*(-0.3*spread+c))
					if(ox>=0 and ox<viewport_size):
						if type(pixels[ox,y]) is int: #this is a workaround for black/white pictures.
							curr = pixels[ox,y]
						else:
							curr = pixels[ox, y][0]
						d = abs(curr - 255*c/spread)
						if(d<=tolerance*255):
							return curr
				return 255
			def ana_out_loop(port, count):
				nonlocal img
				size = graphics.get_image_size(img)
				MAX_X = size[0]
				MAX_Y = size[1]
				tsize = graphics.get_image_size(port)
				TMAX_X = tsize[0]
				TMAX_Y = tsize[1]
				tgtpixels = graphics.get_pixels(port)
				inv_transform = inverse_transform_posn(frame)
				# for y in range(MAX_Y):
					# for x in range(MAX_X):
						# col = get_depth(x,y,count)
						# if(col>255*limit):
							# col = 999
						# else:
							# col = frame.z1 + (frame.z2 - frame.z1) * col
						# if col<=255:
							# transposn = transform(Posn(x,y))
							# if(transposn.x>=0 and transposn.y>=0 and transposn.x<TMAX_X and transposn.y<TMAX_Y):
								# tgtpixels[transposn.x, transposn.y] = (col,col,col)
				#sorry, no supersampling. Takes long enough as it is.
				for y in range(TMAX_Y):
					for x in range(TMAX_X):
						orig = inv_transform(Posn(x,y))
						rx = round(orig.x)
						ry = round(orig.y)
						if (rx>=0 and ry>=0 and rx<MAX_X and ry<MAX_Y): #within bounds
							col = get_depth(rx, ry, count)
							if(col>255*limit):
								col = 999
							else:
								col = round(frame.z1*255 + (frame.z2 - frame.z1) * col)
							if(col<=255):
								#tgtpixels[x,y] = (col, col, col)
								tgtpixels[x,y] = (min(col, tgtpixels[x,y][0]),min(col, tgtpixels[x,y][1]),min(col, tgtpixels[x,y][2]))
				graphics.pixels_to_canvas(port)
			pixels = graphics.get_pixels(img)
			for count, port in enumerate(vp):
				ana_out_loop(port, ((2*count)/(len(vp)-1) - 1))
		else:
			transform = inverse_transform_posn(frame)
			graphics.blit_pixels(vp, transform, graphics.get_pixels(img), graphics.get_image_size(vp), graphics.get_image_size(img), True, frame.z1, frame.z2) #block level image transfer
	return painter

from random import random

def stereogram(painter):
	E = 300 #distance between eyes in pixels
	D = 600 #distance between eyes and image plane in pixels
	delta = 40 #stereo separation
	MAX_X = round(4/3*viewport_size)
	MAX_Y = viewport_size
	MAX_Z = 0
	CENTRE = round(MAX_X/2)
	stereo = vp
	pixels = graphics.get_pixels(stereo)
	depthmap = graphics.open_pixmap("temp", 4/3*viewport_size, viewport_size)
	depth_pix = graphics.get_pixels(depthmap)
	painter(depthmap, unit_frame)
	Infinity = float("inf")

	depth_pix = graphics.get_pixels(depthmap)
	def get_depth(x,y):
		if((x>=(1/6*viewport_size)) and (x<(MAX_X-(1/6*viewport_size)))):
			return -100*depth_pix[x,y][0]/255 - 400
		else:
			return -500
	for y in range(MAX_Y):
		link_left = {}
		link_right = {}
		colours = {}
		for x in range(MAX_X):
			z = get_depth(x,y)
			s = delta + z*(E/(z-D)) #Determine distance between intersection of lines of sight on image
			left = x - round(s/2) #x is integer, left is integer
			right = left + round(s) #right is integer
			if (left>0 and right<MAX_X):
				if(( not(left in link_right) or s<link_right[left]) and (not(right in link_left) or s<link_left[right])):
					link_right[left] = round(s)
					link_left[right] = round(s)

		#constraint resolution
		for x in range(MAX_X):
			try:
				s = link_left[x]
			except KeyError:
				s = Infinity
			if(s != Infinity):
				s = x
			d = None
			if(x-s>0):
				d = link_right[x-s]
			else:
				d = Infinity
			if(s == Infinity or (s>d)):
				link_left[x] = 0

		#drawing step
		for x in range(MAX_X):
			s = link_left[x] #should be valid for [0, MAX_X-1]
			try:
				colour = colours[x-s]
			except KeyError:
				colour = (round(random()*10/9*255),round(random()*10/9*255),round(random()*10/9*255))
			pixels[x,y] = colour
			colours[x] = colour
	graphics.pixels_to_canvas(stereo)

def save_image(filename):
	graphics.saveImage(vp, filename)

def save_hollusion(filename):
	if graphics.PIL_available:
		if active_hollusion == None:
			raise("No hollusion active")
		else:
			filename += ".gif"
			frames = list(map(lambda vp: graphics.get_image(vp), active_hollusion("buffer")))
			rev = frames[1:len(frames)-1]
			rev.reverse()
			frames.extend(rev)
			PyGif.saveAnimated(filename, frames, 1/len(frames))
			#images2gif.writeGif(filename, frames, duration=1/len(frames), dither=0, subRectangles = False)
	else:
		print("PIL does not appear to be available")
