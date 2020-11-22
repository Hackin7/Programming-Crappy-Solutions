def countRange(listInput, minValue, maxValue):
    count = 0
    for i in listInput:
        if minValue <= i < maxValue:
            count += 1
    return count

import random
def generateIntTest(lower, upper, listLength):
    minValue = random.randint(lower, upper)
    maxValue = random.randint(lower, upper)
    while minValue == maxValue:
        maxValue = random.randint(lower, upper)        
    if not(minValue < maxValue):
        placeholder = minValue
        minValue = maxValue
        maxValue = placeholder
    ranListLength = random.randint(1,listLength)
    testList = [random.randint(lower, upper) for i in range(ranListLength)]

    print("Testing List of Integers:\n", testList)
    print(f"Minimum Value:{minValue}, Maximum Value: {maxValue}")

    count = countRange(testList, minValue, maxValue)
    print(f"Number of items between {minValue} and {maxValue} is {count}")

def randomFloat(lower, upper):
    return round(lower + random.random() * (upper-lower),2)

def generateFloatTest(lower, upper, listLength):
    minValue = randomFloat(lower, upper)
    maxValue = randomFloat(lower, upper)
    while minValue == maxValue:
        maxValue = random.randint(lower, upper)        
    if not(minValue < maxValue):
        placeholder = minValue
        minValue = maxValue
        maxValue = placeholder
        
    ranListLength = random.randint(1,listLength)
    testList = [randomFloat(lower, upper)\
                for i in range(ranListLength)]

    print("Testing List of Floating Point Numbers:\n", testList)
    print(f"Minimum Value:{minValue}, Maximum Value: {maxValue}")

    count = countRange(testList, minValue, maxValue)
    print(f"Number of items between {minValue} and {maxValue} is {count}")

generateIntTest(1,9,10)
generateFloatTest(1,9,10)
