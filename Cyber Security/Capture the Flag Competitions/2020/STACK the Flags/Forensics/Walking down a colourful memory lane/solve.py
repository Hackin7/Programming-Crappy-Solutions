  
from PIL import Image

img = Image.open("This is a png file.png")
def resizeImage(img, x=0, y=0):
    if x == 0 and y == 0:
        return None
    elif x == 0:
        hpercent = (y/float(img.size[1]))
        x = int((float(img.size[0])*float(hpercent)))
    elif y == 0:
        wpercent = (x/float(img.size[0]))
        y = int((float(img.size[1])*float(wpercent)))
    return img.resize((x,y), Image.ANTIALIAS)

# Show Big Image
#resizeImage(img, y=100).show()

### Convert to Raw Data ############################
img_size = img.size
print(img_size)
pixels = img.load()
data = []

for i in range(img_size[0]):
    for j in range(img_size[1]):
        data.append(pixels[i,j])

print(data)

### Flatten ##########################################
flatData = []
for i in data:
    for j in i:
        flatData.append(chr(j))

### Get String #######################################
flag = ""
for char in flatData:
    if ord(char) == 0: break
    flag += char

print(flag)


