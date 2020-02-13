# Practical 4
from random import randint

###Q1######################################################
def square(side):
    row =  "*" * side
    #For every row
    for i in range(side):
        print(row)
        
square(int(input("Enter the length of a side for the square: ")))
###Q2######################################################
def squareCustomChar(side, fillCharacter):
    row =  fillCharacter * side
    #For every row
    for i in range(side):
        print(row)
        
squareCustomChar(int(input("Enter the length of a side for the square: ")),\
                 input("Enter a custom character to use for the square: "))
###Q3######################################################
def reverseDigit(value):
    reversedValue = 0
    power = 0
    #Find Length
    while  value // (10**power)!=0: #While there are still more digits
        power+=1
    #Start from back
    for i in range(power):
        reversedValue += (value // (10**i) % 10) * (10**(power-i-1))
    return f'{reversedValue:0{power}d}'

def reverseDigitStr(string):
    return string[::-1]

print("The number with its digits reversed is",\
      reverseDigit(int(input("Enter an integer: "))))
###Q4######################################################
def gcd(a,b):
    #Exact algorithm can be found on google
    if a == 0 and b == 0: return "UNDEFINED, as both a and b are 0"
    if b == 0: return a #if is fully divisible
    return gcd(b, a%b)

def gcdWorse(a,b):
    if a > b: return gcdWorse(b,a)
    lastGCD = 1
    for i in range(2,a+1):
        if b % i == 0 and a % i == 0:
            lastGCD = i
    return lastGCD

print("The greatest common denominator of a and b is",\
      gcd(int(input("Enter an integer a: ")),\
          int(input("Enter an integer b: "))))
###Q5######################################################
def multiplyQuiz(lower, upper):
    # Change the range (Can be upper or lower)
    if lower > upper:
        a = lower
        lower = upper
        upper = a
    x, y = randint(lower,upper), randint(lower,upper)
    ans = x * y + 1
    while ans != -1:
        ans = int(input(f"How much is {x} times {y} (-1 to quit)? "))
        if x * y == ans:
            print("Very good!")
            x, y = randint(lower,upper), randint(lower,upper)
        elif ans == -1:
            print("Quitting Program")
        else:
            print("No. Please try again.")
            
multiplyQuiz(1, 6)#int(input("Enter a lower bound of numbers: ")),\
             #int(input("Enter an upper bound of numbers: "))))
###Q6######################################################
from random import randint
def multiplyQuizMotivative(lower, upper):
    x, y = randint(lower,upper), randint(lower,upper)
    ans = x * y + 1
    while ans != -1:
        ans = int(input(f"How much is {x} times {y} (-1 to quit)? "))
        motivation = randint(1,4)
        if x * y == ans:
            if motivation == 1:
                print("Very good!")
            elif motivation == 2:
                print("Excellent!")
            elif motivation == 3:
                print("Nice Work!")
            elif motivation == 4:
                print("Keep up the good work!")
            x, y = randint(lower,upper), randint(lower,upper)
        elif ans == -1:
            print("Quitting Program")
        else:
            if motivation == 1:
                print("No. Please try again.")
            elif motivation == 2:
                print("Wrong. Try once more.")
            elif motivation == 3:
                print("Don't give up!")
            elif motivation == 4:
                print("No. Keep trying.")

multiplyQuizMotivative(1, 6)#int(input("Enter a lower bound: ")),\
                       #int(input("Enter an upper bound: "))))         
###Q7######################################################

def isPrime(prime):
    if prime in [0,1]: #These are not primes
        return False
    for factor in range(2,int(prime**0.5 + 1)):
        if not prime % factor:
            return False
    return True

#Reverse the digits, from Q3
def reverseDigit(value): 
    reversedValue = 0
    power = 0
    #Find Length
    while  value // (10**power)!=0: #While there are still more digits
        power+=1
    #Start from back
    for i in range(power):
        reversedValue += (value // (10**i) % 10) * (10**(power - i - 1))
    return reversedValue

def isPrimePalindromic(n):
    return isPrime(n) and reverseDigit(n)==n

def primePalindromic(n=100):
    lastPrime = 0 # First prime to not start with
    for p in range(n):
        prime = lastPrime
        while not isPrimePalindromic(prime) or prime <= lastPrime:
            prime += 1
        lastPrime = prime
        print(f'{prime:>5d}', end=' ')
        if (p+1)%10==0:
            print("\n")
            
primePalindromic()
###Q8######################################################
def printMatrix(n):
    #For every row
    for i in range(n):
        row = ""
        for j in range(n):
            row += str(randint(0,1))
            if j != (n - 1) :
                row += " "
        print(row)
        
printMatrix(int(input("Enter n: ")))
