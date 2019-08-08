#!/usr/bin/env python
    
lis = [0,2,4,3,1,5,2,4,5,4]
#lis = [0,2,4,3,1,5,2,4,5,1]
def bubblesort(toSort):
    lis = list(toSort)
    unsorted = True
    #for i in range(len(lis) - 1):
    while unsorted:
        unsorted = False
        for j in range(len(lis)-1):
            if lis[j] > lis[j+1]:
                temp = lis[j]
                lis[j] = lis[j+1]
                lis[j+1] = temp
                unsorted = True
    return lis
   
    
def bubblesortRecursive(lis, i, length):
    #Base Case
    if length == 0: return
    if i >= length-1: 
        bubblesortRecursive(lis, 0, length-1)
        return
    #Switch
    if lis[i] > lis[i+1]:
        temp = lis[i]
        lis[i] = lis[i+1]
        lis[i+1] = temp
    #Recursion Call
    bubblesortRecursive(lis,i+1, length)
    

bubblesortRecursive(lis,0, len(lis))
print("r",lis)
lis = [0,2,4,3,1,5,2,4,5,4]
def insertionsort(toSort):
    arr = list(toSort)
    for i in range(len(arr)):
        for j in range(i, len(arr)):
            if arr[j] < arr[i]:
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
    return arr

def insertionsortRecursive(arr, i, extract, sublength):
    print(arr, i, extract, sublength)
    #Base Case
    if sublength >= len(arr):
        return
    #Insertion
    if arr[i] > arr[extract]:
        #Swap
        temp = arr[extract]
        arr[extract] = arr[i]
        arr[i] = temp
        extract = i         
    #Recursive Call
    if i == 0: 
        insertionsortRecursive(arr, sublength-1, sublength, sublength+1)
    else:
        insertionsortRecursive(arr, i-1, extract, sublength)
        
insertionsortRecursive(lis,0,1, 2)
print("r",lis)
def merge(arr, low, middle, high):
    sortedArr = []
    lowPointer = low
    highPointer = middle+1
    #print("From",arr[low:middle+1],arr[middle+1:high+1])
    for i in range(low, high+1):
        #print("low",lowPointer,"high",highPointer)
        if highPointer > high and lowPointer > middle:
            break
        if highPointer > high:
            sortedArr.append(arr[lowPointer])
            lowPointer+=1
            
        elif lowPointer > middle:
            sortedArr.append(arr[highPointer])
            highPointer+=1
        elif highPointer <= high and lowPointer <= middle:
            if arr[lowPointer] < arr[highPointer]:
                sortedArr.append(arr[lowPointer])
                lowPointer+=1
            elif arr[lowPointer] >= arr[highPointer]:
                sortedArr.append(arr[highPointer])
                highPointer+=1
        
            
    #print(sortedArr)
    for i in range(high-low+1):
        arr[low+i] = sortedArr[i]
    #print(arr)

def mergesort(arr, low=0, high=-1):
    if high<0: high = len(arr)-1
    if high > low:
        middle = (low+high)//2
        mergesort(arr, low, middle)
        mergesort(arr, middle+1, high)
        merge(arr, low, middle, high)
        
    
def quicksort(lis, low=0, high=-1):
    arr = list(lis)
    if high<0: high = len(arr)-1
    if high > low:
        pivot = arr[high]
        #Partition
        lowerList = []
        higherList = []
        for i in range(len(arr)-1):
            if arr[i] < pivot:
                lowerList.append(arr[i])
            else:#if arr[i] > pivot:
                higherList.append(arr[i])
        #print("Arr",arr)
        #print(lowerList,pivot, higherList) 
        lowerList = quicksort(lowerList)
        higherList = quicksort(higherList)
        arr = lowerList + [pivot] + higherList
    return arr

print(lis)
print(bubblesort(lis))
print(quicksort(lis))
print(insertionsort(lis))
mergesort(lis)
print(lis)

def linearSearch(arr, find):
    for i in range(len(arr)):
        if arr[i] == find: return i
    return -1 #If cannot find
        
def binarySearch(arr, find, low=0, high=-1):
    if high< 0: high = len(arr)-1
    middle = (low+high)//2
    if not high > low: #If array has no elements left
        return -1 #Doesnt exist
    if arr[middle] == find:
        #Lower Bound 
        lowerbound = middle
        while arr[lowerbound] == find:
            lowerbound-=1
        #Upper Bound
        upperbound = middle
        while arr[upperbound] == find:
            upperbound+=1
        return lowerbound+1,upperbound-1
        
    elif arr[middle] > find: #To find in lower region
        return binarySearch(arr, find, low, middle)
    else:
        return binarySearch(arr, find, middle+1, high)


print(linearSearch(lis,-1))
print(binarySearch(lis,4))
