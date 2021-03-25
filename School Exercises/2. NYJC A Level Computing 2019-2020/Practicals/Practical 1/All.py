###Q1#######################################################################

num1 = int(input("Enter num1:"))
num2 = int(input("Enter num2:"))
operation = input("Select the Operation\n"
                  "  + for addition\n"
                  "  -for subtraction\n"
                  "  X for multiplication\n"
                  "  / for dividing num1 against num2\n"
                  "  // for quotient of dividing num1 against num2\n"
                  "  / for remainder of dividing num1 against num2\n"
                  "  * for taking num1 to the power of num2\n:")
if operation == "+":
    print(num1,"+", num2, "=",num1+num2)
elif operation == "-":
    print(num1, "-", num2, "=",num1-num2)
elif operation == "X":
    print(num1, "X" ,num2,"=",num1*num2)
elif operation == "/":
    if num2!=0: print(num1,"/",num2, "=",num1/num2)
    else:print("num2 is 0, division not defined!")
elif operation == "//":
    if num2!=0:print("Floor division of",num1,"against",num2,"=",num1//num2)
    else:print("num2 is 0, division not defined!")
elif operation == "%":
    if num2!=0:print("Modulus (Remainder) of",num1,"//",num2,"=",num1%num2)
    else:print("num2 is 0, division not defined!")
elif operation == "*":
    print(num1,"to the power of",num2,"=",num1**num2)
else:
    print("Operation input not in menu!")

###Q2#######################################################################
print("a  a^2  a^3") # Table header

for a in range(1,4+1):
    square = str(a**2)+ "  "
    cube = str(a**3)
    # Add a spacing if it is only single digit,
    # so that the table is spaced properly
    if int(square) // 10 == 0:
        square+=' '
    print(str(a)+' ',square,cube)

###Q3#######################################################################

def celsius(fahrenheit):
    #Input fahrenheit and output celsius temperature
    return (5/9)*(fahrenheit-32) #Formula used

temp = int(input("Enter temperature in fahrenheit:"))
print(celsius(temp))

###Q4#######################################################################
age = int(input("Enter your age: "))
print("Your heart has pumped",
      age*365.25*24*60*60,
      "times")
# 1 year has 365.25 days, 1 day has 24 hours
# 1 hour has 60 minutes, 1 minute has 60 seconds
###Q5#######################################################################

num = int(input("Enter an integer: "))
if num % 2 == 1:  #If not fuly divisible by 2
    print("The integer is odd")
if num % 2 == 0: #If fully divisible by 2
    print("The integer is even")

###Q6#######################################################################

gender = input("Are you male(m/M) or female(f/F):")
if gender in ['f','F']: 
    print("Female")
elif gender in ['m','M']:
    print("Male")
else: #Other conditions
    print("Invalid character entered. \n"
          "Please enter 'm' or 'M' for male "
          "or 'f' or 'F' for female")  
###Q7#######################################################################

population = 312032486 #Population as in that year
secPerYear = 365*24*60*60 #Seconds per Year
for next in range(1,5+1):
    birth = secPerYear//7 #1 birth every 7 seconds
    death = secPerYear//13 #1 death every 13 seconds
    immigrant = secPerYear//45 #1 immigrant every 45 seconds
    population += birth + immigrant-death #Change the population
    print("The population in the next",next,"th year is",population)
    
###3.5######################################################################
    
binary = int(input("Enter a binary integer: "))
denary = 0 #Converted binary

# Finding length
length = 0
# Loop through powers of 10 until power of 10 bigger than input
while binary //(10**length) != 0:
    length+=1


for i in range(length):#len(binary)):
    #binary = int(binary)
    denary += (2**i) * binary // (10**i)%10
    #denary+=(2**i)*int(binary[-i-1])
print(denary)
###3.6######################################################################
def factorial(x):
    #Validation for non-negative integer
    if x < 0:
        print("Number input is negative!")
        exit()
    #Base case
    if x == 0:return 1
    #Recursion
    return x * factorial(x-1)

print("It's factorial is",\ #Output
      factorial(  #Conversion \
          int(input("Enter a non-negative integer: ")) #Input \ 
          )\
      )
