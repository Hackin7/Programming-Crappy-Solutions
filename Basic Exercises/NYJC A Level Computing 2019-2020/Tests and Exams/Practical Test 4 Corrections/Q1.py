import datetime
###Task 1.1##############
def readFile():
    ###Reading File##################
    dataFile = open("DATA.TXT", "r")
    data = dataFile.read()
    dataFile.close()

    values = data.split("\n")
    processedValues = []
    for i in range(len(values)):
        ###Processing each line of data#############
        valList = values[i].split("V")
        if len(valList) == 4: #In appropriate format
            ###Formatting Date###
            ref = datetime.date(1965, 8, 9)
            current = ref + datetime.timedelta(days=int(valList[0][1:]))
            DATE = current.strftime("%d%m%Y")
            ###Fromatting Other Values###
            VALUE1 = float(valList[1][1:])
            VALUE2 = float(valList[2][1:])
            VALUE3 = float(valList[3][1:])
            #print(DATE, VALUE1, VALUE2, VALUE3)
            processedValues.append((DATE, VALUE1, VALUE2, VALUE3))
    return processedValues
values = readFile()

###Task 1.2###################
def compare_means(val1, val2):
    mean1 = (val1[1] + val1[2] + val1[3])/3
    mean2 = (val2[1] + val2[2] + val2[3])/3
    #First few elements should be LARGER than next few elements
    return mean1 > mean2 #Descending

def insertion_sort_means(arr):
    l = 0
    r = len(arr)-1
    for i in range(1, r+1):
        #print(i)
        key = arr[i]
        j = i - 1 #Index of element to be shifted
        while j >= 0 and not compare_means(arr[j],key):#arr[j] < key:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = key #Fill in the empty space created
    #Once done sorting
    return arr
    #for i in range(len(arr)):
    #    print(arr[i])

#insertion_sort_means(values)
