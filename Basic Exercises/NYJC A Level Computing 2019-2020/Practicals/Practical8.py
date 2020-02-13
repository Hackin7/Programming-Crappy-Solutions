### Practical 8

###Q0###################################################################
#Count number of moves for Tower of Hanoi
def TowerOfHanoi(n, from_rod, to_rod, aux_rod):
    if n == 1:
        print("Move disk 1 from rod", from_rod,"to rod",to_rod)
        return 1 #Only need 1 move
    counter = 1 #Count number of moves
    counter += TowerOfHanoi(n-1, from_rod,aux_rod, to_rod)
    print("Move disk",n,"from rod", from_rod,"to rod",to_rod)
    counter += TowerOfHanoi(n-1, aux_rod, to_rod,  from_rod)
    return counter 

###Q1###################################################################
###a########################################
def fib(n):
    #Base Cases
    if n == 0:
        return 0
    elif n == 1:
        return 1
    return fib(n-1) + fib(n-2) #Recursive Call

###b########################################
def iter_fib(n): #Bottom_Up Approach
    fib = [0,1] #Base Cases
    for i in range(2,n+1):#Generate new fibonacci numbers to nth number
        fib.append(fib[i-1]+fib[i-2]) 
    return fib[n]

###Q2###################################################################
def power(base, exponent):
    #Base Cases
    if exponent == 1:
        return base
    return base * power(base,exponent-1) #Recursive Call

###Q3###################################################################
def listSum(lst):
    #Base Cases
    if len(lst) == 1:
        return lst[0]
    return lst[0] + listSum(lst[1:]) #Recursive Call: sum from front

###Q4###################################################################
def sum_series(n):
    #Base Cases
    if n<=0:
        return 0
    return n + sum_series(n-2) #Recursive Call

###Q5###################################################################
def reverse(string, isRecursiveCall = False):
    #Base Cases
    if len(string) == 0: #Nothing left to reverse
        return ""
    #Recursive Call: Last character at front first
    reversedString =  string[-1] + reverse(string[:-1], True)
    
    if not isRecursiveCall: #Print before and After
        print("Before reversal:",string)
        print("After reversal",reversedString)
        
    return reversedString

###Q6###################################################################
def intSum(n):
    #Base Cases
    if n < 10: #Single Digit
        return n
    return n % 10 + intSum(n // 10) #Recursive Call: Add from last digit

###Q7###################################################################
def maximum(lst):
    #Base Case
    if len(lst) == 1: 
        return lst[0]
    ###Recursive Call################
    maxOfRemaining = maximum(lst[1:])
    #Comparison
    if lst[0] >= maxOfRemaining:
        return lst[0]
    else:
        return maxOfRemaining

###Q8###################################################################
def baseConversion(num, base):
    digits = "0123456789ABCEDF" #Digits up to hexadecimal
    # Base case for last digit
    if num // base == 0:
        return digits[num]
    # Recursive Call
    return baseConversion(num // base, base) + digits[num % base]

###Q9###################################################################
def isPalindrome(sentence):
    #String Processing
    if not sentence[0].isalpha(): #First character not letter
        return isPalindrome(sentence[1:])
    elif not sentence[-1].isalpha(): #Last character not letter
        return isPalindrome(sentence[:-1])
    #Base Cases, at near end of string
    if len(sentence) <= 1: #Odd Lengths
        return True
    elif len(sentence) == 2: #Even Lengths
        #Stop recursion to prevent slicing error
        return sentence[0].lower() == sentence[1].lower() 
    
    #Recursive Call
    return sentence[0].lower() == sentence[-1].lower() and \
           isPalindrome(sentence[1:-1])

#Output Formatting
def showIsPalindrome(sentence):
    if isPalindrome(sentence):
        print(sentence, "is palindrome")
    else:
        print(sentence, "is not palindrome")
        

###Testing Outputs######################################################
if __name__ == '__main__':
    #Q0
    print("TowerOfHanoi(4, 'A', 'C', 'B')","is",TowerOfHanoi(4, 'A', 'C', 'B'))
    #Q1a
    print("fib(10)","is",fib(10))
    #Q1b
    print("iter_fib(10)","is",iter_fib(10))
    #Q2
    print("power(3,4)","is",power(3,4))
    #Q3
    print("listSum([2,4,5,6,7])","is",listSum([2,4,5,6,7]))
    #Q4
    print("sum_series(6)","is",sum_series(6))
    print("sum_series(7)","is",sum_series(7))    
    #Q5
    reverse("hello")
    #Q6
    print("intSum(345)","is",intSum(345))
    #Q7
    print("maximum([1,2,5,4,3])","is",maximum([1,2,5,4,3]))
    #Q8
    print("baseConversion(15,16)","is",baseConversion(15,16))
    print("baseConversion(2835,16)","is",baseConversion(2835,16))
    print("baseConversion(9,2)","is",baseConversion(9,2))
    #Q9
    print("Palindrome Checking Program:")
    showIsPalindrome("ABBA")
    showIsPalindrome("ABBA!")
    showIsPalindrome("Able was I, ere I saw Elba")
    showIsPalindrome("A man, a plan, a canal, Panama!")
    showIsPalindrome("ABC")
