# Practical 3

###Q1##################################################################
counter = 1
while counter <= 20:
    print(counter,end="")
    if (counter) % 5 == 0: #Enter newline after every 5 numbers
        print()
    else:
        print("\t",end="")
    counter+=1

###Q2##################################################################
for counter in range(1,21):
    print(counter,end="")
    if (counter) % 5 == 0:
        print()
    else:
        print("\t",end="")

###Q3##################################################################
for x in range(-3,4):
    denominator = (x**2-x-6)
    if denominator == 0:
        print("For x =",x,", y is UNDEFINED! (Division by 0)")
    else:
        print("For x =",x,", y =",(x+8)/denominator)    
    
###Q4a#################################################################
boundary1, boundary2 = 0, 10
# Output Header
print(f"{'Number':<10s}{'Square':<10s}{'Cube':<10s}")
# Loop through range
for x in range(boundary1, boundary2+1):
    print(f"{str(x):<10s}{str(x**2):<10s}{str(x**3):<10s}")

###Q4b#################################################################
boundary1 = int(input("Enter the lower boundary: "))

boundary2 = int(input("Enter the upper boundary: "))
# Validation check
while boundary1 > boundary2 :
    boundary2 = int(input("The upper boundary is not larger (or equal to) than the lower boundary\n"
                      "Enter the upper boundary again: "))

# Output Header
print(f"{'Number':<10s}{'Square':<10s}{'Cube':<10s}")
#Loop through range
for x in range(boundary1, boundary2+1): 
    print(f"{str(x):<10s}{str(x**2):<10s}{str(x**3):<10s}")

###Q4c#################################################################
x = int(input("Enter integer x: "))
y = int(input("Enter integer y: "))
print("x raised to the power of y is",pow(x,y))

###Q5##################################################################
number = int(input("Enter a positive 5 digit number: "))
while not(number // 10000  > 0 and \
          number // 10000 < 10):
    number = int(input("The number was not 5 digit\n"
                       "Enter a positive 5 digit number: "))
    
for i in range(5):
    print(number//(10**i)%10, end="\t") # Extract ith digit and print
print()    

###Q6##################################################################
n = int(input("Enter the number of prime numbers you want to get: "))
def isPrime(prime):
    if prime in [0,1]:
        return False
    for factor in range(2,int(prime**0.5+1)):
        if not prime % factor:
            return False
    return True
lastPrime = 0 # First prime to not start with
for p in range(n):
    prime = lastPrime
    while not isPrime(prime) or prime <= lastPrime:
        prime+=1
    lastPrime = prime
    print(prime)

       
###Q7##################################################################
#Prices for
product1 = 2.98
product2 = 4.50
product3 = 9.98
product4 = 4.49
product5 = 6.87

totalValue = 0
while True:
    productNo = int(input("Enter the product number (from 1-5) (-1 to exit): "))
    if productNo == -1: #Exiting Program
        break
    quantitySold = int(input("Enter the quantity sold for one day (-1 to exit): "))
    if quantitySold == -1: #Exiting Program
        break
    if productNo == 1:
        totalValue += product1 * quantitySold
    elif productNo == 2:
        totalValue += product2 * quantitySold
    elif productNo == 3:
        totalValue += product3 * quantitySold
    elif productNo == 4:
        totalValue += product4 * quantitySold
    elif productNo == 5:
        totalValue += product5 * quantitySold
print(f"The total retail value of all products sold last week is ${totalValue:.2f}")

###Q8##################################################################
binary = int(input("Enter a binary number: "))
denary = 0
for i in range(5):
    denary += (binary//(10**i)%10) * 2**i# Extract ith digit
print(denary)
###Q9##################################################################
print("The possible values of pythagorean triplets up to 500 are:")
for hypo in range(1,500): #Hypo is the largest side, so count using hypo
    for side2 in range(1,hypo): #side2 is larger
        for side1 in range(1,side2):
            if side1**2 + side2**2 == hypo**2: #Check for pythagorean triplet
                print(side1, side2, hypo)
                
###Q10#################################################################

piApprox = 0
for i in range(1000000000):
    if i % 2 == 0: 
        piApprox += (4/(2*i + 1))
    else:
        piApprox -= (4/(2*i + 1))
print(piApprox)
