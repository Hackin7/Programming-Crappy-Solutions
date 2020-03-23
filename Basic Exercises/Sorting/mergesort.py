def merge(arr,s,mid,e):
    left = arr[s:mid+1]
    right = arr[mid+1:e+1]
    l = 0
    r = 0
    for i in range(s,e+1):
        if r >= len(right) or (l < len(left) and left[l] <= right[r]):
            arr[i] = left[l]
            l += 1
        elif l >= len(left) or (r < len(right) and right[r] <= left[l]):
            arr[i] = right[r]
            r += 1
            
def mergesort(arr, s,e):
    if s >= e:
        return
    mid = (s+e)//2
    mergesort(arr,s,mid)
    mergesort(arr,mid+1,e)
    merge(arr,s,mid,e)
    
import random
def generate():
    return [random.randint(0,1000) for i in range(10)]
arr = generate()
print(arr)
mergesort(arr,0,len(arr)-1)
print(arr)
