array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
def binarySearch(array, low, high, find):
    while low <= high:
        mid = int((low+high)/2)
        if array[mid] == find:
            return mid
        elif array[mid] > find:
            high = mid - 1
        elif array[mid] < find:
            low = mid + 1
    return -1

print(binarySearch(array, 0, 9, 2.5))
    
