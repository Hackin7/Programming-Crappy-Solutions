def baseToDenary(number, base):
    mapping = {}
    for digit in range(0,9+1):
        mapping[str(digit)] = digit
    for value in range(0, 26):
        mapping[chr(65+value)] = 10+value
        mapping[chr(97+value)] = 10+value
        
    value = 0
    for i in range(len(number)):
        currDigit = number[-1-i]
        value += mapping[currDigit] * (base**i)

    return value

def denaryToBase(number, base):
    reference = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    ans = ""
    remaining = number
    while remaining // base > 0:
        currPlaceValue = remaining % base
        currDigit = reference[currPlaceValue]
        ans = currDigit + ans
        remaining = remaining // base
    # For the last place
    currPlaceValue = remaining % base
    if currPlaceValue != 0:
        currDigit = reference[currPlaceValue]
        ans = currDigit + ans
    
    return ans
