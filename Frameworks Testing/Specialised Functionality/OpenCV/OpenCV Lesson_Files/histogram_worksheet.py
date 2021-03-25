# Static Histogram

import cv2  # Importing cv2 library
from matplotlib import pyplot as plt  # Importing matplotlib library

# File name and path goes here
file = "OpenCV_workshop_histogram.jpeg" # enter your file name

color = ''#'bgr'
# Number of intervals on the x-axis
bins = 256 # Color intensity values 0-255

if color == 'bgr':  # Colored Images
    img = cv2.imread(file) # Process the image from file

    for i, col in enumerate(color):
        # create a column with index (bins) and the corresponding color
        histogram = cv2.calcHist([img], [i], None, [bins], [0,256])

        #plot graph using matplotlib, takes in the color 'b','g','r'
        plt.plot(histogram, color = col, alpha=1.0)

        plt.title('Histogram (BGR)') # Title of graph

else: # Monochrome Image
    # read file as array, 0 represents  conversion to monochrome
    img = cv2.imread(file, 0)

    # changes the existing array to 1 dimension
    img = img.ravel()

    # create a column with index (bins) but only 1 'color'
    histogram = cv2.calcHist([img], [0], None, [bins], [0,256])
    
    plt.plot(histogram)

    # Title of graph
    plt.title('Histogram (B&W)')

plt.xlabel("Bin") # Label the x-axis
plt.ylabel("Frequency") # Label the y-axis
plt.show() # Show the graph by creating the window
