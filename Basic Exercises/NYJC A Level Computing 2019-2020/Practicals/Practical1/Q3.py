def celsius(fahrenheit):
    #Input fahrenheit and output celsius temperature
    return (5/9)*(fahrenheit-32) #Formula used

temp = int(input("Enter temperature in fahrenheit:"))
print(celsius(temp))

