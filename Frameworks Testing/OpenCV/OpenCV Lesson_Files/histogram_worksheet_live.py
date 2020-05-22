# Live Histogram

# Import relevant libraries
import cv2 # Open CV library
from matplotlib import pyplot as plt # Matplotlib library

# File name / recording Video goes here
cap = cv2.VideoCapture(0)

color = 'bgr'

# Number of intervals on the x-axis
bins = 256 # Color intensity values 0-255

# continues running while video is on
while True:
    read_success, img = cap.read() # Process the image from file
    if read_success:
        if color == 'bgr':  # Colored Images
            for i, col in enumerate(color):
                # create a column with index (bins) and the corresponding color
                # cv2.calcHist(images, channels, mask, histSize, ranges)
                histogram = cv2.calcHist([img], [i], None, [bins], [0,256])
                # plot graph using matplotlib, takes in the color 'b','g','r'
                plt.plot(histogram, color = col, alpha=1.0)
                plt.title('Histogram (RGB)') # Title of graph
    
        else: # Monochrome Image
            # changes the existing array to 1 dimension
            monochrome_img = img.ravel()
    
            # create a column with index (bins) but only 1 'color'
            histogram = cv2.calcHist([monochrome_img], [0], None, [bins], [0,256])
            plt.plot(histogram)
    
            # Title of graph
            plt.title('Histogram (B&W)')
    
        # gets total number of pixels and sets arbitrary value
        #### numpix =  int((img.shape[0]*img.shape[1])/30)
    
        #get current axis and set a limit on the y values
        #### plt.gca().set_ylim([0, numpix])
    
        # refreshes the graph by pausing the graph
        plt.pause(0.001)
    
    
        plt.xlabel("Bins") # Label the x-axis
        plt.ylabel("Frequency") # Label the y-axis
        cv2.imshow("Video",img)
        plt.clf # Clears the figure but keeps the window
        
        # Program exits when user presses the 'q' key
        if cv2.waitKey(1) == ord('q'):
            break
    else:
        break

# Release the camera
cap.release()
# Close all the windows
cv2.destroyAllWindows()
