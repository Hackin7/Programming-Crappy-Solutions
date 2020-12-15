from PIL import Image

f = open("pixelate.txt")

h = 349
w = 94
img = Image.new('RGB', (w, h), (255,255,255))
pixels = img.load()
for i in range(w):
    for j in range(h):
        data = f.readline().split(",")
        colour = int(data[1]),int(data[2]),int(data[3])
        pixels[-i,j] = colour


f.close()
img.show()

