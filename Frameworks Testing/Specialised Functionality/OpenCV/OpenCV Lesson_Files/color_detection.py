import cv2 # Importing cv2 library
import numpy as np # Importing numpy library
from time import sleep

cap = cv2.VideoCapture(0) #Choose to capture laptopcam or external webcam

while True: #continues forever
    retrieveval, frame = cap.read()
    hsv_frame = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV) #convert BGR to HSV

    #range for red color
    low_red = np.array([161,155,84]) #setting of lower boundaries
    high_red = np.array([179,255,255])#setting of higher boundaries

    red_mask = cv2.inRange(hsv_frame, low_red, high_red) #input lower and higher boundaries

    #finding the contours 
    contours, retrieveval = cv2.findContours(red_mask, cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)

    '''RETR_EXTERNAL --> retrieves only the extreme outer contours, concentric circles
    only outermost circle is taken

    RETR_LIST --> gives all the contours, even if found inside one another
    
    RETR_CCOMP --> gives all the contours, outer and inner
    
    RETR_TREE--> retrieves all of the contours and reconstructs a full rlnshp 
    of how all the contours are related to each other
       
    '''

    '''
    CV_CHAIN_APPROX_NONE stores absolutely all the contour points. 
    That is, any 2 subsequent points (x1,y1) and (x2,y2) of the contour will be 
    either horizontal, vertical or diagonal neighbors, that is, max(abs(x1-x2),abs(y2-y1))==1.

    CV_CHAIN_APPROX_SIMPLE compresses horizontal, vertical, and diagonal segments
    and leaves only their end points. For example, an up-right rectangular 
    contour is encoded with 4 points.

    CV_CHAIN_APPROX_TC89_L1,CV_CHAIN_APPROX_TC89_KCOS applies one of the 
    flavors of the Teh-Chin chain approximation algorithm. 
    
    '''

    #sorting of the contours in descending order
    #lambda + opencv sort function
    contours = sorted(contours, key = lambda x:cv2.contourArea(x), reverse=True)

    

    #if there are contours in the sorted array
    if len(contours)>0:

        #getting the dimensions of the rectangle
        (x,y,w,h) = cv2.boundingRect(contours[0]) #get the largest contour
        #print("X_mid:",x+w/2,"Y_mid:",y+h/2)

        #draw rectangle
        cv2.rectangle(frame,(x,y),(x+w,y+h), (0,255,0),2) #color of rectangle

        #cv2.line(frame, (int(x+w/2), 0), (int(x+w/2), 480), (0, 255, 0), 2)


    #Showing the frame and masks
    cv2.imshow("Tracking", frame)
    cv2.imshow("Mask over", red_mask)

    if cv2.waitKey(1) & 0xFF ==ord('q'):
        break

cap.release() #release resources
cv2.destroyAllWindows() #get rid of all live windows
