# DOWNLOAD IMAGE FROM FILE
import urllib.request

img_link = "https://images-na.ssl-images-amazon.com/images/S/sgp-catalog-images/region_US/wb-883316329542-Full-Image_GalleryBackground-en-US-1484348613962._SX1080_.jpg"
img_title = "Tom and Jerry"
img_extension = "."+img_link.split(".")[-1]
img_filename = img_title + img_extension

with open (img_filename, "wb") as img_file:
  img_file.write(urllib.request.urlopen(img_link).read())

print("Saved {} successfully!".format(img_filename))

#################################################################################

# IMPORT LIBRARIES
import ___ as cv
from ___ import pyplot as plt

# READ IMAGE DATA
img = cv.___(img_filename,0)

# PERFORM CANNY EDGE DETECTION
edges = cv.Canny(img, ___, ___) # Experiment with the threshold!

# SHOW ORIGINAL PICTURE
plt.imshow(img, cmap = "gray")
plt.___("Original Image")
plt.___() # Shows the picture

# SHOW CANNY EDGE PICTURE
plt.imshow(edges,cmap = "gray")
plt.___("Edge Image")
plt.___() # Shows the picture
