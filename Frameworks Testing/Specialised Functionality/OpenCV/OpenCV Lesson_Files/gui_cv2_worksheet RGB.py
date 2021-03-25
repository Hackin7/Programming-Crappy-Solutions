import cv2
import numpy as np

def nothing(x):
    pass 

# Create a window
frame = np.zeros((312,500,3), np.uint8)
cv2.namedWindow('trackbar')

# create trackbars for color change

# cv2.createTrackbar(trackbar_label, window_label, current_value, maximum_value, callback)

# Hue
## Values of hue range from 0-179
cv2.createTrackbar('lowR','trackbar',0,255,nothing)
cv2.createTrackbar('highR','trackbar',255,255,nothing)

# Saturation
cv2.createTrackbar('lowG','trackbar',0,255,nothing)
cv2.createTrackbar('highG','trackbar',255,255,nothing)

# Value
cv2.createTrackbar('lowB','trackbar',0,255,nothing)
cv2.createTrackbar('highB','trackbar',255,255,nothing)

cap = cv2.VideoCapture(0)

while(1):
    # read the image from the camera
    retrieveval, frame = cap.read()

    # flip the image horizontally, so that it will look like a mirror
    # only if you use front-facing webcam.
    frame = cv2.flip(frame, 1)

    # display the image
    cv2.imshow('Real',frame)

    # get current positions of three low trackbars
    h = cv2.getTrackbarPos('lowR','trackbar')
    s = cv2.getTrackbarPos('lowG','trackbar')
    v = cv2.getTrackbarPos('lowB','trackbar')
    
    low = np.array([h,s,v])
    
    # get current positions of three high trackbars
    h = cv2.getTrackbarPos('highR','trackbar')
    s = cv2.getTrackbarPos('highG','trackbar')
    v = cv2.getTrackbarPos('highB','trackbar')
    
    high = np.array([h,s,v])

    # convert the image from bgr to hsv format
    frame = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
    
    # create a "mask" to show which pixels should be preserved
    mask = cv2.inRange(frame, low, high)

    # apply the "mask" to the original capture using the bitwise AND operator
    res = cv2.bitwise_and(frame, frame, mask=mask)

    # convert the image back to bgr
    res = cv2.cvtColor(res, cv2.COLOR_RGB2BGR)

    cv2.imshow("mask", res)

    if cv2.waitKey(1) == ord('q'):
        break
    
cap.release()
cv2.destroyAllWindows()
