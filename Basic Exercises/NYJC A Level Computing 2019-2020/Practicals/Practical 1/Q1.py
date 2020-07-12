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
