# Generate Admin Token
'''
Since we know the time the token was generated, which is the seed, we 
can generate the exact same token

Time when token was generated is 22nd of September 2022, at 09:41:17 SGT.
'''
import datetime, pytz
import random
def generateToken():
    #t = datetime.datetime.now(pytz.timezone('Asia/Singapore'))
    t = datetime.datetime(2022, 9, 22, 9, 41, 17) #, tzone=pytz.timezone('Asia/Singapore')) # Redundant
    print(t)
    seed = int(t.timestamp())
    random.seed(seed)
    token = ''.join(random.choices('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789', k=16))
    return token
    
print(generateToken())
# Token is rMwwbpMkzAwyRoWs


### Generate KEY ###################################################################################
'''
Since you can get the heatmap you can reverse the key probably
'''

### Admin Details

def hex_to_rgb(hex):
    h = hex.lstrip('#')
    return tuple(int(h[i:i+2], 16) for i in (0, 2, 4))

admin_token = generateToken()
adminName = 'j4g4h1ms3lf'
adminFrame = hex_to_rgb('#000000')
adminKeys = hex_to_rgb('#dcdedb')
adminText = hex_to_rgb('#000000')
adminKeys = hex_to_rgb('#98b5bb')

### Keyboard Details

def key(text, w=1):
    return {'t': text, 'w': w}
'''
keeb = [
    [key('Esc'), key('1'), key('2'), key('3'), key('4'), key('5'), key('6'), key('7'), key('8'), key('9'), key('0'), key('-'), key('='), key('Backspace', 2), key('Home')],
    [key('Tab', 1.5), key('Q'), key('W'), key('E'), key('R'), key('T'), key('Y'), key('U'), key('I'), key('O'), key('P'), key('['), key(']'), key('\\', 1.5), key('PgUp')],
    [key('Caps Lock', 1.75), key('A'), key('S'), key('D'), key('F'), key('G'), key('H'), key('J'), key('K'), key('L'), key(';'), key("'"), key('Enter', 2.25), key('PgDn')],
    [key('Shift', 2.25), key('Z'), key('X'), key('C'), key('V'), key('B'), key('N'), key('M'), key(','), key('.'), key('/'), key('Shift', 1.75), key('↑'), key('End')],
    [key('Ctrl', 1.25), key('Win', 1.25), key('Alt', 1.25), key('Space', 6.25), key('Alt'), key('Fn'), key('Ctrl'), key('←'), key('↓'), key('→')]
]
'''

keeb = [
    [key(''), key('1'), key('2'), key('3'), key('4'), key('5'), key('6'), key('7'), key('8'), key('9'), key('0'), key('-'), key('='), key('', 2), key('')],
    [key('', 1.5), key('Q'), key('W'), key('E'), key('R'), key('T'), key('Y'), key('U'), key('I'), key('O'), key('P'), key('['), key(']'), key('\\', 1.5), key('')],
    [key('', 1.75), key('A'), key('S'), key('D'), key('F'), key('G'), key('H'), key('J'), key('K'), key('L'), key(';'), key("'"), key('', 2.25), key('')],
    [key('', 2.25), key('Z'), key('X'), key('C'), key('V'), key('B'), key('N'), key('M'), key(','), key('.'), key('/'), key('', 1.75), key(''), key('')],
    [key('', 1.25), key('', 1.25), key('', 1.25), key('', 6.25), key(''), key(''), key(''), key(''), key(''), key('')]
] 

from PIL import ImageFont, ImageDraw, Image
import numpy as np
givenimg = Image.open("view.png")
img = givenimg
### Convert to Raw Data ############################
img_size = img.size
print(img_size)
pixels = img.load()
data = []
key_colour_mapping = {}
colour_key_mapping = {}


for i in range(img_size[0]):
    for j in range(img_size[1]):
        if pixels[i,j] == (255, 84, 84): print(i,j)
        data.append(pixels[i,j])

def draw_heatmap(name, frameColor, keyColor, textColor, specialColor, htext, keeb=keeb, height=580, width=1720, unit=100):

    ## Drawing Key
    def draw_key(image, key, x, y, w, h, color):
        x = int(x)
        y = int(y)
        text = key['t']
        if text == '':
            color = specialColor
        elif text in htext: # If a character is inside
            color = (255, 84, 84)
            
        ### Drawing on Image
        image[y:int(y+h), x:int(x+w)] = color
        img_pil = Image.fromarray(image)
        draw = ImageDraw.Draw(img_pil)
        
        ### Drawing Text
        font = ImageFont.truetype('Poppins-Regular.ttf', 20)
        textsize = font.getsize(text)
        textX = (w - textsize[0]) / 2
        textY = (h + textsize[1]) / 2
        draw.text((x+textX, y+textY), text, textColor, font=font, align='center')
        return np.array(img_pil)

    ### Initialising Empty Image
    image = np.zeros((height, width, 3), np.uint8)
    image[:] = frameColor
    img_pil = Image.fromarray(image)
    draw = ImageDraw.Draw(img_pil)
    ### Initialising text tools
    font = ImageFont.truetype('Poppins-Regular.ttf', 20)
    textsize = font.getsize(name)
    textX = (width - textsize[0]) / 2
    textY = height - 30
    draw.text((textX, textY), name, (255,255,255,255), font=font, align='center')
    image = np.array(img_pil)
    
    ### Handling keys
    x = 30
    y = 30
    for row in keeb:
        gap = (width - x * 2 - unit * sum([key['w'] for key in row])) / (len(row) - 1)
        for key in row:
            w = unit * key['w']
            h = unit
            image = draw_key(image, key, x, y, w, h, keyColor)
            ############### CUSTOM CODE HERE ###########################
            key_colour_mapping[key['t']] = pixels[x,y]
            retrieved_colour = pixels[x,y]
            if colour_key_mapping.get(retrieved_colour) == None:
              colour_key_mapping[retrieved_colour] = []
            colour_key_mapping[retrieved_colour].append(key['t'])
            ############################################################
            x += w + gap
            # draw gap
        x = 30
        y += unit + 5
    
    image = Image.fromarray(image)
    return image

def imageResize(img):
  imgSmall = img.resize((int(img.width / 100), int(img.height / 100)), Image.BILINEAR)
  result = imgSmall.resize(img.size, Image.NEAREST)
  return result

def percentage_similarity(img1, img2):
    correct, wrong = 0,0
    img_size = img1.size
    pixels1 = img1.load()
    pixels2 = img2.load()
    for i in range(img_size[0]):
        for j in range(img_size[1]):
            if pixels1[i,j] == pixels2[i,j]: correct += 1
            else: wrong += 1
    return correct / (correct + wrong)
          
img = draw_heatmap(adminName, adminFrame, adminKeys, adminText, adminKeys, "ASERTGHNIL")
#img.show()
#imageResize(img).show()
print(percentage_similarity(imageResize(img), givenimg))
#givenimg.show()

img.save("/tmp/img2.png")
givenimg.save("/tmp/img1.png")
#print(key_colour_mapping)
#print(colour_key_mapping)
