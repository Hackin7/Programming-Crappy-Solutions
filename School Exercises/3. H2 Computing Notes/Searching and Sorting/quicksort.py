import random
def generate():
    return [random.randint(0,1000) for i in range(10)]
    
def quicksort(arr, s, e):
    if not s<e: 
        return
    pivot,l,r = arr[s],s+1,e
    while l <= r:
        while l <= r and arr[l] <= pivot:
            l+=1
        while l <= r and arr[r] >= pivot:
            r-=1
        if l<=r:
            temp = arr[l]
            arr[l] = arr[r]
            arr[r] = temp
            
    temp = arr[s]
    arr[s] = arr[r]
    arr[r] = temp
    
    print(arr,s,l,r,e)
    quicksort(arr,s,r-1)
    quicksort(arr,r+1,e)
            
arr = generate()
quicksort(arr,0,len(arr)-1)
print(arr)
            
            
            
