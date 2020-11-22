arr = [5,6,7,8,9,1,2,3,4]
def cmp(a,b): #Sorting Comparator
    return a<b # a in front of b

def partition(arr,low,upper):
    pivot = low
    left = low + 1
    right = upper
    while left <= right:
        #Increment pointers until they do not fufil condition
        while cmp(arr[left],arr[pivot]) and left <= right and left <= upper:
            left += 1
        while cmp(arr[pivot],arr[right]) and left <= right:
            right -= 1
        #Swapping of values
        if left <= right:
            temp = arr[right]
            arr[right] = arr[left]
            arr[left] = temp
            print(arr,left,right, arr[pivot])
    #Swapping the pivot value
    #print(arr,left,right)
    temp = arr[right]
    arr[right] = arr[pivot] 
    arr[pivot] = temp #Swap in the lower boundary
    return right # The splitpoint

def quickSort(arr, low = 0, up = -1):
    if up < 0: #Invalid value
        up = len(arr) - 1
    #Base Case
    if (up - low) <= 1:
        print("rrr")
        return
    else: #Need Sorting
        splitPoint = partition(arr,low,up)
        print(low,splitPoint, splitPoint+1, up)
        quickSort(arr,low,splitPoint)
        quickSort(arr,splitPoint+1,up)
    
        
    
splitpoint = partition(arr,0,len(arr)-1)
print(arr, splitpoint,"OK")
quickSort(arr)
'''
def cmp(a,b): #Sorting Comparator
    return a<b # a in front of b
def bubbleSort(arr):
    lower = 0
    upper = len(arr)-1
    for j in range(lower, upper):
        for i in range(lower, upper):
            if not(cmp(arr[i],arr[i+1])): #If not sorted correctly
                #Swap the Values
                temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp
                #Do not terminate early
                
bubbleSort(arr)
print(arr)
'''
