### Generate Primes  ###################################
MAX_VAL = 100006
prime = [True] * MAX_VAL 
def SieveOfEratosthenes(n):
    prime[1] = False
    p = 2
    while p * p <= n: # Loop through all numbers
        if prime[p]:
            # Multiples are all not prime
            for i in range(p*2, n , p):
                prime[i] = False
        p += 1
SieveOfEratosthenes(MAX_VAL)

### Sorting
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
    
    quicksort(arr,s,r-1)
    quicksort(arr,r+1,e)

### Driver code ######################################################
if __name__ == "__main__":
    ## Generate Primes
    arr = [4, 3, 2, 6, 100, 17]
    ans = []
    for i in arr:
        if prime[i]:
            ans.append(i) 
    quicksort(ans,0,len(ans)-1)
    
    # print the results.
    for i in range(0, len(ans)):
        print(ans[i], end = " ")
    
# This code is contributed by Rituraj Jain
