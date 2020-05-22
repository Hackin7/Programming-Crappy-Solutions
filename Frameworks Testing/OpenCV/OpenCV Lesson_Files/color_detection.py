import ___  # Importing cv2 library
import _____ as np # Importing numpy library

cap = cv2.VideoCapture(___) #Choose to capture laptopcam or external webcam

while ____: #continues forever
    retrieveval, frame = cap.read()
    hsv_frame = cv2.cvtColor(______________) #convert BGR to HSV

    #range for red color
    ______________________________ #setting of lower boundaries
    _______________________________#setting of higher boundaries

    red_mask = cv2.inRange(hsv_frame, _________, __________) #input lower and higher boundaries

    #finding the contours 
    contours, retrieveval = cv2.findContours(red_mask, _________, ___________)

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
    contours = sorted(contours, key = lambda ____________, reverse=True)


    #if there are contours in the sorted array
    if len(contours)>________:

        #getting the dimensions of the rectangle
        (x,y,w,h) = cv2.boundingRect(___________) #get the largest contour

        cv2.rectangle(frame,(x,y),(x+w,y+h), _________,2) #color of rectangle

    #Showing the frame and masks
    cv2.imshow("Tracking", frame)
    cv2.imshow("Mask over", red_mask)

    if cv2.waitKey(1) & 0xFF == ord('q'):
        break


___.release() #release resources
cv2.________________ #get rid of all live windows
