# Practical 2

###Q1######################################################################

# Input both Numbers
num1 = int(input("Enter a number: "))
num2 = int(input("Enter another number: "))
Sum = abs(num1) + abs(num2) #Sum of absolute values of both numbers
print("The sum of the absolute values of both numbers are", Sum)

###Q2######################################################################
num1, num2, num3 = [int(i) # Convert to integer
                    for i in input("Input three different integers: ")\
                    .split(" ")] # For each input value
# Computation
Sum = num1 + num2 + num3
Average = int(Sum / 3)
Product = num1 * num2 * num3
#Smallest = min(num1, num2, num3)
if num1 <= num2 and num1 <= num3:
    Smallest = num1
elif num2 <= num2 and num2 <= num3:
    Smallest = num2
elif num3 <= num2 and num3 <= num1:
    Smallest = num3

#Largest = max(num1, num2, num3)
if num1 >= num2 and num1 >= num3:
    Largest = num1
elif num2 >= num2 and num2 >= num3:
    Largest = num1
elif num3 >= num2 and num3 >= num1:
    Largest = num3

#Output
print("Sum is     ", f"{str(Sum):>10s}")
print("Average is ", f"{str(Average):>10s}")
print("Product is ", f"{str(Product):>10s}")
print("Smallest is", f"{str(Smallest):>10s}")
print("Largest is ", f"{str(Largest):>10s}")
###Q3######################################################################
num1 = int(input("Enter num1: "))
num2 = int(input("Enter num2: "))
operation = input("Select an operation from the menu\n"
                  "D  Divide num1 by num2\n"
                  "M  Multiply num1 by num2\n"
                  "R  Obtain the remainder when num1 is divided by num2\n"
                  "Q  Quit\n"
                  ) # Chosen by user

# Control Statements
if operation == 'D':
    if num2 == 0:
        print("Since num2 is zero, num1 divided by zero is UNDEFINED")
    else:    
        value = num1 / num2
        print("num1 divided by num2 is",value)
elif operation == 'M':
    value = num1 * num2
    print("num1 multiplied by num2 is",value)
elif operation == 'R':
    if num2 == 0:
        print("Since num2 is zero, num1 divided by zero is UNDEFINED")
    else:
        value = num1 % num2
        print("Remainder of num1 divided by num2 is",value)
elif operation == 'Q': # Quit
    exit()
else:
    print("Operation input in not in menu")
###Q4######################################################################
import math
print("Quadratic Equation Solver\n"
      "  For a quadratic equation in the form of ax^2 + bx + c")
a = int(input("Input a: "))

# Validation Check if also quadratic equation
while a == 0:
    print("a cannot be zero, as the equation would no longer be quadratic")
    a = int(input("Input a: "))
    
b = int(input("Input b: "))
c = int(input("Input c: "))

# Calculation
try:
    x1 = (-b + math.sqrt(b**2 - 4*a*c))/(2*a)
    x2 = (-b - math.sqrt(b**2 - 4*a*c))/(2*a)
except: # If the values cannot be calculated
    # It is likely due to b^2-4ac<0, so it is complex
    x1 = "a complex number with an imaginary part"
    x2 = "a complex number with an imaginary part"

# Output
print("The first solution is:", x1)
print("The second solution is:", x2)
