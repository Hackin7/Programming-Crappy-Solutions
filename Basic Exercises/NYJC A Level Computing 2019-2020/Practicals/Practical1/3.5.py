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
