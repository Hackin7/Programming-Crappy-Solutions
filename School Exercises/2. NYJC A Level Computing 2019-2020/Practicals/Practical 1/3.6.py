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
