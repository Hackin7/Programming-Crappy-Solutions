#Not really Working
import time

import RPi.GPIO as gpio
gpio.setmode(gpio.BCM)
pin = 27 #Whatever gpio pin servo is attached to
gpio.setup(pin, gpio.OUT)
Servo = gpio.PWM(pin, 50) #Frequency must be 50Hz

#DutyCycle = PulseWidth/Period = PulseWidth*Freq
#DutyCycle = ((x)milliseconds*1second/1000milliseconds*50times/second)/0.01 Convert to pervent
#0 degrees = 1ms, 180 degrees = 2ms
def ServoPos(degree):
    timeon = 3*degree/38 + 3
    DutyCycle = (degree*0.001*50)/0.01
    print degree, timeon, DutyCycle
    return timeon

Servo.start(ServoPos(0))
print("Servo 0 degrees")
time.sleep(5) 

Servo.ChangeDutyCycle(ServoPos(90)) #input new frequency
print("Servo 90 degrees")
time.sleep(5) 

Servo.ChangeDutyCycle(ServoPos(180)) #input new frequency 18
print("Servo 180 degrees")
time.sleep(5) 

Servo.stop() #Stop Servo Comms
gpio.cleanup()
