import time


import RPi.GPIO as gpio
gpio.setmode(gpio.BCM)

#Variables
pin = 27 #Whatever gpio pin goning to PWM with
freq = 0.25 #Original Frequency in Hz (how many oscilations per second)
duty = 25 #Original Duty cycle 
freqn = 50 #New Frequency
dutyn = 70 #New Duty cycle

gpio.setup(pin, gpio.OUT)
p = gpio.PWM(pin, freq) #input (channel, frequency) in here
p.start(duty) #input duty cycle in here (0.0 - 100.0) Higher = Brighter
print("PWM start")
time.sleep(5) #Delay Time for PWM to function

p.ChangeFrequency(freqn) #input new frequency
print("Change Frequency")
time.sleep(5) #Delay Time for PWM to function

p.ChangeDutyCycle(dutyn) #input new frequency
print("Change Duty Cycle")
time.sleep(5) #Delay Time for PWM to function

p.stop() #Stop PWM
gpio.cleanup()
