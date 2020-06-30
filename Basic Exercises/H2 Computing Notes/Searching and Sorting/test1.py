import random
array = [random.randint(0,1000) for i in range(10)]
print(array)

def bubblesort(array):
    noSwaps = False
    while not noSwaps:
        noSwaps = True
        for i in range(len(array)-1):
            if array[i] > array[i+1]:
                noSwaps = False
                temp = array[i]
                array[i] = array[i+1]
                array[i+1] = temp

def insertionSort(array):
    for i in range(1, len(array)):
        key = array[i]
        j = i-1
        while j>=0:
            if array[j] > key:
                array[j+1] = array[j]
            else:
                array[j+1] = key
                j = -1
            j -= 1

def mergeSort(arr):
    #print(arr)
    array = arr
    if len(array) <= 1:
        return array
    else:
        midpos = int(len(arr)/2)
        #print(arr[:midpos], arr[midpos:])
        left = mergeSort(arr[:midpos])
        right = mergeSort(arr[midpos:])
        
        result = merge(left, right)
        #print(left, right,result)
        return result

def merge(left, right):
    result = []
    l = 0
    r = 0
    while l+r < len(left)+len(right):
        if (l < len(left) and r < len(right) and left[l] < right[r]) or r >= len(right):
            result.append(left[l])
            l += 1
        else:#if (l < len(left) and r < len(right) and right[r] < left[l]) or l >= len(left):
            result.append(right[r])
            r += 1
    return result


arr = mergeSort(array)
print(arr)
print(array)
    

def quicksort(array, low=0, high=0):
    if low >= high:
        return
    
    pivot = array[low]
    l = low+1
    r = high
    while l <= r:
        if (array[l]> pivot and array[r]<pivot):
            temp = array[l]
            array[l] = array[r]
            array[r] = temp
        elif array[l]<= pivot and array[r] <= pivot:
            l += 1
        elif array[l]> pivot and array[r] > pivot:
            r -= 1
        elif array[l]<= pivot and array[r] > pivot:
            l += 1
            r -= 1

    #Swap in pivot
    mid = r
    array[low]= array[mid]
    array[mid] = pivot
    
    quicksort(array, low, mid)
    quicksort(array, mid+1, high)
    

quicksort(array, 0, len(array)-1)
print(array)
