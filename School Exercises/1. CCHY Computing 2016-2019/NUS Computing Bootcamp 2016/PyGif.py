## Design decisions:
## 	Going to assume some things are available, in particular... 
##	PIL.Image because i need pixel access.
##	-Its also known that theirs works for rendering.
##  PIL._imaging - this is the compiled C code, which allows us to compress things in a fast manner.
## 		-This code hasn't been changed since 1999
		#ImageFile._save(imOut, fp, [("gif", (0,0)+im.size, 0, rawmode)])
			#this is written in C, so should be fast enough for encoding stuff
			# ImageFile._save(im, fp, [("gif", (0,0)+im.size, 0, RAWMODE[im.mode])])

#Some global config from PIL.GifImagePlugin.py
RAWMODE = {
    "1": "L",
    "L": "L",
    "P": "P",
}
			
## 
## A gif file is encoded in the following manner:
## Fixed length header,  Fixed length Logical Screen Descriptor
## Optional global color table, indicated by Global Color Table Flag
## [Image, Image Image, Image]
## 0x21(!) Extension block
## 0x3B(;) - which is the end of the file.

##Concepts:
## Data block, max 256 bytes. 1st byte denotes size, rest of blocks is data.
## Sequence of data blocks, terminated by empty block. 

## Logical Screen descriptor:
##   2 bytes, width in pixels, unsigned
##   2 bytes, height in pixels, unsigned.
##   1 byte, packed fields 
	##Global Color Table Flag       1 Bit
		##Flag indicating the presence of a Global Color Table; 
		##if the flag is set, the Global Color Table will
		##immediately follow the Logical Screen Descriptor.
	##Color Resolution              3 Bits
		##Number of bits per primary color available to the original image, minus 1.
		##Fix to 7, since modern computers.
	##Sort Flag                     1 Bit
		##Indicates whether the Global Color Table is sorted. 
		##If the flag is set, the Global Color Table is sorted, in order of decreasing importance.
		##Fix to 0, because modern computers don't need that optimization. And i'm lazy.
	##Size of Global Color Table    3 Bits
		##actual size: 2^(s+1)
		##Fix to 7, since modern computers.
##   1 byte, Background Color Index
	##Only used with Global Color Table.
##   1 byte, Pixel Aspect Ratio
	##Aspect Ratio = (Pixel Aspect Ratio + 15) / 64
	## Could set it to 0, which is not given, or set it to 1:1. 
	
## Global colour palette:
"""
      7 6 5 4 3 2 1 0        Field Name                    Type
     +===============+
  0  |               |       Red 0                         Byte
     +-             -+
  1  |               |       Green 0                       Byte
     +-             -+
  2  |               |       Blue 0                        Byte
     +-             -+
  3  |               |       Red 1                         Byte
     +-             -+
     |               |       Green 1                       Byte
     +-             -+
 up  |               |
     +-   . . . .   -+       ...
 to  |               |
     +-             -+
     |               |       Green 255                     Byte
     +-             -+
767  |               |       Blue 255                      Byte
     +===============+
"""

## Image Descriptor.
# a. Description. Each image in the Data Stream is composed of an Image
# Descriptor, an optional Local Color Table, and the image data.  Each
# image must fit within the boundaries of the Logical Screen, as defined
# in the Logical Screen Descriptor.

"""
   7 6 5 4 3 2 1 0        Field Name                    Type
     +---------------+
  0  |               |       Image Separator               Byte
     +---------------+
  1  |               |       Image Left Position           Unsigned
     +-             -+
  2  |               |
     +---------------+
  3  |               |       Image Top Position            Unsigned
     +-             -+
  4  |               |
     +---------------+
  5  |               |       Image Width                   Unsigned
     +-             -+
  6  |               |
     +---------------+
  7  |               |       Image Height                  Unsigned
     +-             -+
  8  |               |
     +---------------+
  9  | | | |   |     |       <Packed Fields>               See below
     +---------------+

     <Packed Fields>  =      Local Color Table Flag        1 Bit
                             Interlace Flag                1 Bit
                             Sort Flag                     1 Bit
                             Reserved                      2 Bits
                             Size of Local Color Table     3 Bits

           i) Image Separator - Identifies the beginning of an Image
           Descriptor. This field contains the fixed packedue 0x2C.

           ii) Image Left Position - Column number, in pixels, of the left edge
           of the image, with respect to the left edge of the Logical Screen.
           Leftmost column of the Logical Screen is 0.

           iii) Image Top Position - Row number, in pixels, of the top edge of
           the image with respect to the top edge of the Logical Screen. Top
           row of the Logical Screen is 0.

           iv) Image Width - Width of the image in pixels.

           v) Image Height - Height of the image in pixels.

           vi) Local Color Table Flag - Indicates the presence of a Local Color
           Table immediately following this Image Descriptor. (This field is
           the most significant bit of the byte.)


           packedues :    0 -   Local Color Table is not present. Use
                             Global Color Table if available.
                       1 -   Local Color Table present, and to follow
                             immediately after this Image Descriptor.

           vii) Interlace Flag - Indicates if the image is interlaced. An image
           is interlaced in a four-pass interlace pattern; see Appendix E for
           details.

           packedues :    0 - Image is not interlaced.
                       1 - Image is interlaced.

            viii) Sort Flag - Indicates whether the Local Color Table is
            sorted.  If the flag is set, the Local Color Table is sorted, in
            order of decreasing importance. Typically, the order would be
            decreasing frequency, with most frequent color first. This assists
            a decoder, with fewer available colors, in choosing the best subset
            of colors; the decoder may use an initial segment of the table to
            render the graphic.

            packedues :    0 -   Not ordered.
                        1 -   Ordered by decreasing importance, most
                              important color first.

            ix) Size of Local Color Table - If the Local Color Table Flag is
            set to 1, the packedue in this field is used to calculate the number
            of bytes contained in the Local Color Table. To determine that
            actual size of the color table, raise 2 to the packedue of the field
            + 1. This packedue should be 0 if there is no Local Color Table
            specified. (This field is made up of the 3 least significant bits
            of the byte.)
			
"""

## Animations:
"""
23. Graphic Control Extension.

      a. Description. The Graphic Control Extension contains parameters used
      when processing a graphic rendering block. The scope of this extension is
      the first graphic rendering block to follow. The extension contains only
      one data sub-block.

      This block is OPTIONAL; at most one Graphic Control Extension may precede
      a graphic rendering block. This is the only limit to the number of
      Graphic Control Extensions that may be contained in a Data Stream.

      b. Required Version.  89a.

      c. Syntax.

      7 6 5 4 3 2 1 0        Field Name                    Type
     +---------------+
  0  |               |       Extension Introducer          Byte
     +---------------+
  1  |               |       Graphic Control Label         Byte
     +---------------+

     +---------------+
  0  |               |       Block Size                    Byte
     +---------------+
  1  |     |     | | |       <Packed Fields>               See below
     +---------------+
  2  |               |       Delay Time                    Unsigned
     +-             -+
  3  |               |
     +---------------+
  4  |               |       Transparent Color Index       Byte
     +---------------+

     +---------------+
  0  |               |       Block Terminator              Byte
     +---------------+


      <Packed Fields>  =     Reserved                      3 Bits
                             Disposal Method               3 Bits
                             User Input Flag               1 Bit
                             Transparent Color Flag        1 Bit

            i) Extension Introducer - Identifies the beginning of an extension
            block. This field contains the fixed packedue 0x21.

            ii) Graphic Control Label - Identifies the current block as a
            Graphic Control Extension. This field contains the fixed packedue
            0xF9.

            iii) Block Size - Number of bytes in the block, after the Block
            Size field and up to but not including the Block Terminator.  This
            field contains the fixed packedue 4.

            iv) Disposal Method - Indicates the way in which the graphic is to
            be treated after being displayed.

            packedues :    0 -   No disposal specified. The decoder is
                              not required to take any action.
                        1 -   Do not dispose. The graphic is to be left
                              in place.
                        2 -   Restore to background color. The area used by the
                              graphic must be restored to the background color.
                        3 -   Restore to previous. The decoder is required to
                              restore the area overwritten by the graphic with
                              what was there prior to rendering the graphic.
                     4-7 -    To be defined.

            v) User Input Flag - Indicates whether or not user input is
            expected before continuing. If the flag is set, processing will
            continue when user input is entered. The nature of the User input
            is determined by the application (Carriage Return, Mouse Button
            Click, etc.).

            packedues :    0 -   User input is not expected.
                        1 -   User input is expected.

            When a Delay Time is used and the User Input Flag is set,
            processing will continue when user input is received or when the
            delay time expires, whichever occurs first.

            vi) Transparency Flag - Indicates whether a transparency index is
            given in the Transparent Index field. (This field is the least
            significant bit of the byte.)

            packedues :    0 -   Transparent Index is not given.
                        1 -   Transparent Index is given.

            vii) Delay Time - If not 0, this field specifies the number of
            hundredths (1/100) of a second to wait before continuing with the
            processing of the Data Stream. The clock starts ticking immediately
            after the graphic is rendered. This field may be used in
            conjunction with the User Input Flag field.

            viii) Transparency Index - The Transparency Index is such that when
            encountered, the corresponding pixel of the display device is not
            modified and processing goes on to the next pixel. The index is
            present if and only if the Transparency Flag is set to 1.

            ix) Block Terminator - This zero-length data block marks the end of
			the Graphic Control Extension.
"""

from math import sqrt
from PIL import Image, ImageFile

#utility
def bool2int(packed):
	if packed:
		return 1
	else:
		return 0
		
def makeArray(x,y):
	arr = []
	for i in range(x):
		arr.append([None] * y)
	return arr

#PIL bindings
def getImgWidth(img): #assume it's a PIL image
	return img.size[0]
	
def getImgHeight(img):
	return img.size[1]

def getPixels(img):
	return img.load()
	
def show(img):
	return img.show()

class GCE:
	def __init__(self, delay, disposalMethod = 0):
		self.delay = round(delay)
		self.userInput = False
		self.transparencyIndex = None
		self.disposalMethod = disposalMethod
		
	def setUserInput(self, packed):
		assert(isinstance(packed, bool))
		self.userInput = packed
	
	def setTransparencyIndex(self, index):
		if index:
			assert(isinstance(index, int))
			self.transparencyIndex = index
		else:
			self.transparencyIndex = None
			
	def toBytes(self):
		ba = bytearray(8)
		#extension introducer
		ba[0] = 0x21
		#Graphic Control Label
		ba[1] = 0xF9
		
		#block size
		ba[2] = 4
		
		#packed fields
			# Reserved 3 Bits
			# Disposal Method               3 Bits
			# User Input Flag               1 Bit
			# Transparent Color Flag        1 Bit
		packed = 0
		packed+= self.disposalMethod
		packed*=2
		packed+= bool2int(self.userInput)
		packed*=2
		packed+= bool2int(self.transparencyIndex is not None)
		ba[3] = packed
		
		#delay time, 2 bytes unsigned, in millseconds.
		ba[5] = self.delay>>8
		ba[4] = self.delay%256
		#transparent color index
		if self.transparencyIndex is not None:
			ba[6] = self.transparencyIndex
		else:
			ba[6] = 0
			
		#block terminator
		ba[7] = 0
		return ba
		
class ID:
	def __init__(self, left, top, width, height, interlace = False, localPalette = None):
		self.left = left
		self.top = top
		self.width = width
		self.height = height
		self.interlace = interlace
		self.localPalette = localPalette
		
	def toBytes(self):
		ba = bytearray(10)
		#img separator
		ba[0] = 0x2C
		#img left
		ba[2] = self.left>>8
		ba[1] = self.left%256
		#img top
		ba[4] = self.top>>8
		ba[3] = self.top%256
		#width
		ba[6] = self.width>>8
		ba[5] = self.width%256
		#height
		ba[8] = self.height>>8
		ba[7] = self.height%256
		#packed fields
		packed = 0
		
		packed += 1 if self.localPalette else 0 #local palette present?
		
		packed *= 2
		packed += 1 if self.interlace else 0
		
		packed *= 64 # sort = 0, reserved 2 bits, color table 3 bits
		
		if self.localPalette:
			#actual size = 2^(f+1)
			packed+= round(log( len(self.localPalette) / 3 , 2)) - 1
		
		ba[9] = packed
		if self.localPalette:
			return ba + self.localPalette
		return ba
	
class PyGif:
	# creates a blank image.
	# Note: only palettes with 256 colours are supported. Zero the rest if you want.
	def __init__(self, width, height):
		self.globalPalette = None
		self.bgColor = None
		self.Frames = [] #a frame has the following format: (GCE, ID, pixels)
		#i believe in failing early.
		assert(width == round(width))
		assert(height == round(height))
		assert(width<65536 and height<65536)
		#forces it to int
		self.width = round(width)
		self.height = round(height)
		self.PaletteGrayscale = self.makeGrayscalePalette()
		#self.PaletteWebSafe = 
		self.prevPalette = None
		self.cmapping = {}
		
	def makeGrayscalePalette(self):
		pal = bytearray(768)
		for i in range(0, 256):
			pal[i*3], pal[i*3+1], pal[i*3+2] = i,i,i
		return bytes(pal)
	
	#TODO: grab some algorithm from http://en.wikipedia.org/wiki/Color_difference
	def colorDistance(self, c1, c2): #where each color is in the format 0<=(r,g,b)<=255
		def sq(x):
			return x*x
		r1, g1, b1 = c1
		r2, g2, b2 = c2
		return sq(r1-r2)+sq(g1-g2)+sq(b1-b2)
	
	#TODO: rewrite using http://stackoverflow.com/questions/3114925/pil-convert-rgb-image-to-a-specific-8-bit-palette
	#TODO: write testing code to determine if frames are dithered correctly.
	def indexifyImage(self, img, palette = None): #assumes there's a global palette
		if palette is None:
			palette = globalPalette
		if palette is not self.prevPalette:
			self.cmapping = {} #this is used for memoization
			for i in range(0, 256):
				r,g,b = palette[i*3], palette[i*3+1], palette[i*3+2]
				self.cmapping[(r,g,b)] = i
			self.prevPalette = palette
		#TODO: dithering
		newpixels = makeArray(getImgWidth(img),getImgHeight(img))
		pixels = getPixels(img)
		for x in range(getImgWidth(img)):
			for y in range(getImgHeight(img)):
				color = pixels[x,y]
				if color not in self.cmapping:
				#determine closest color
					closestIndex = 0
					cdistance = self.colorDistance((palette[0], palette[1], palette[2]), color)
					for i in range(256):
						r1,g1,b1 = palette[i*3], palette[i*3+1], palette[i*3+2]
						distance = self.colorDistance((r1,g1,b1), color)
						if distance < cdistance:
							closestIndex = i
							cdistance = distance
					self.cmapping[color] = closestIndex #memoize
				newpixels[x][y] = self.cmapping[color]
		return newpixels
						
	#converting each image into palette is done at this step.
		#hopefully, your images with similar palettes are together.
		#else gg performance.
	def saveGif(self, filename):
		with open(filename, 'wb') as f:
			#TODO: check if file is writable?
			#Write the header
			f.write(self.headerBytes())
			#Write the screen descriptor
			f.write(self.screenDescriptorBytes())
			#write global colour palette, if any
			if self.globalPalette:
				assert(len(self.globalPalette) == 768)
				f.write(self.globalPalette)
			if len(self.Frames)>1:
					f.write(self.loopControlBytes())
			for GCE, ID, img in self.Frames:
				if len(self.Frames)>1:
					f.write(GCE.toBytes())
				f.write(ID.toBytes())
				#convert to new image.
				imOut = self.convertRGBtoIndexed(img, self.globalPalette)
				imOut.encoderconfig = (8, False) #no interlace.
				f.write(b'\x08')
				ImageFile._save(imOut, f, [("gif", (0,0)+imOut.size, 0, RAWMODE[imOut.mode])])
				f.write(b"\0") #end of image data.
			#Write end of file (0x3B)
			f.write(b';')
	
	#Should be a list in the following format: [(image, dt, <dx>, <dy>)]
	#Where dt is the time to transition to the next image
	#dx and dy are where to place this image relative to the canvas
	#Future extensions: Each set of images called by addImages should calculate its own palette.
	#convert into frames, which is an object in the following format: (GCE, ID, pixels)
	def addImages(self, images, delay = 100):
		
		for img in images:
			#generate a GCE
			gce = GCE(delay)
			#generate an ID
			id = ID(0,0, getImgWidth(img), getImgHeight(img))
			self.Frames.append((gce, id, img))
		
	#tries to come up with a GlobalPalette which everyone can use.
	#Try the median cut algorithm
	def calculateGlobalPalette(self):
		assert(False)
		
	def setGlobalPalette(self, Palette):
		#ensure its a palette, then use it.
		assert(len(Palette) == 768)
		self.globalPalette = Palette
		
	def setBgColor(self, index):
		assert(index is None or isinstance(index, int))
		assert(index is None or (index >= 0 and index < 256))
		self.bgColor = index
	
	def headerBytes(self):
		# Signature - Identifies the GIF Data Stream. This field contains
		# the fixed value 'GIF'.

		# ii) Version - Version number used to format the data stream.
		# Identifies the minimum set of capabilities necessary to a decoder
		# to fully process the contents of the Data Stream.

		# Version Numbers as of 10 July 1990 :       "87a" - May 1987
												   # "89a" - July 1989
		#return bytes("GIF89a", "ASCII")
		return b'GIF89a'
		
	def screenDescriptorBytes(self):
		ba = bytearray(7)
		##   2 bytes, width in pixels, unsigned
		ba[1] = self.width>>8
		ba[0] = self.width%256
		##   2 bytes, height in pixels, unsigned.
		ba[3] = self.height>>8
		ba[2] = self.height%256
		
		##   1 byte, packed fields 
		packed = 0
		## Global Color Table Flag       1 Bit
		if self.globalPalette:
			packed = 1
		
		## Color Resolution              3 Bits
		packed *= 8
		packed += 7 #since modern computers

		##Sort Flag                     1 Bit
		packed *= 2
		packed += 1 ##Fix to 0, because modern computers don't need that optimization. And i'm lazy.
		
		##Size of Global Color Table    3 Bits
				##actual size: 2^(s+1)
				##Fix to 7, since modern computers.
		packed *= 8
		packed += 7
		
		ba[4] = packed
				
		##   1 byte, Background Color Index
		ba[5] = bool2int(self.bgColor is not None and self.globalPalette is not None) #this is not correct.
			
		##   1 byte, Pixel Aspect Ratio
		ba[6] = 0 #i believe this is 1:1
			##Aspect Ratio = (Pixel Aspect Ratio + 15) / 64
			## Could set it to 0, which is not given, or set it to 1:1. 
		return ba
	
	#ref: http://www.vurdalakov.net/misc/gif/netscape-looping-application-extension
	def loopControlBytes(self):
		ba = bytearray(19)
		ba[0] = 0x21
		ba[1] = 0xFF
		ba[2] = 0x0B
		#application identifier
			#NETSCAPE2.0
		str = b'NETSCAPE2.0'
		ba[3:14] = str
		ba[14] = 0x03
		ba[15] = 0x01
		#loop count: 0 => infinite loop
		ba[16] = 0
		ba[17] = 0
		#terminating block
		ba[18] = 0
		return ba
	
	#this is for a single image.
	def convertRGBtoIndexed(self, img, palette): 
		pixels = img.load()
		newimg = Image.new('P', img.size, None)
		newimg.putpalette(tuple(palette))
		newimgpixels = newimg.load()
		width, height = img.size
		gif = PyGif(width, height)
		ipixels = gif.indexifyImage(img, palette)
		for i in range(img.size[0]):
			for j in range(img.size[1]):
				newimgpixels[i,j] = ipixels[i][j]
		return newimg
		
			
def saveAnimated(filename, imgs, delay):
	#determine size from first image
	width, height = imgs[0].size
	#assert that all images are the same size.
	for img in  imgs:
		w, h = img.size
		assert(w == width and h == height)
	gif = PyGif(width, height)
	gif.setGlobalPalette(gif.PaletteGrayscale)
	gif.addImages(imgs, delay)
	gif.saveGif(filename)
	print("Saved as "+filename)
	

#test code:

##img = Image.new( 'RGB', (255,255), "white") # create a new black image
##pixels = img.load() # create the pixel map
### 
##for i in range(img.size[0]):    # for every pixel:
##    for j in range(img.size[1]):
##        pixels[i,j] = (i, j, 100) # set the colour accordingly
##	
##gif = PyGif(255, 255)
##gif.setGlobalPalette(gif.PaletteGrayscale)
##gif.addImages([img])
##gif.saveGif("test.gif")
#img2 = gif.convertRGBtoIndexed(img, gif.PaletteGrayscale)

#img2.show()

""" TODO block:
Consider the following:
	Application extention. This part specifies the amount of loops.
	If loops is 0 or inf, it goes on infinitely.

	
"""
