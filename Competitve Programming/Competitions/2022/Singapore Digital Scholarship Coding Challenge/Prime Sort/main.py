### Generate Primes  ###################################
MAX_VAL = 1000000
prime = [True] * MAX_VAL 
def prime_sieve(n):
    prime[1] = False
    p = 2
    while p * p <= n: # Loop through all numbers
        if prime[p]:
            # Multiples are all not prime
            for i in range(p*2, n , p):
                prime[i] = False
        p += 1
prime_sieve(MAX_VAL)

### Sorting ############################################

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

### Create a tree ######################################
class Node:
    def __init__(self, key):
        self.key = key
        self.primes = {}
        self.values = []
        
    ### Handling Prime Factorisation #################
    def add_prime(self, prime):
        self.primes[prime] = Node(prime)
    def get_prime(self, prime):
        if self.primes.get(prime) == None:
            self.add_prime(prime)
        return self.primes[prime]
    
    ### Handling Actual Values ########################
    def add_val(self, val):
        self.values.append(val)
    
    def display(self):     
        quicksort(self.values,0,len(self.values)-1)   
        for i in self.values:
            print(i)
            
        ### Traverse primes
        arr = list(self.primes.keys())
        #print(arr)
        quicksort(arr,0,len(arr)-1)
        for i in arr:
            self.primes[i].display()
    
tree = Node(1)

def add(tree, val):
    curr_node = tree
    remaining_val = val
    for p in range(2, MAX_VAL):
        if prime[p]:
            while remaining_val % p == 0:
                #print(remaining_val,p)
                remaining_val = remaining_val // p 
                curr_node = curr_node.get_prime(p)
                #print("Currnodekey", curr_node.key)
                #print(remaining_val,p)
    curr_node.add_val(val)

### Traverse based on primes ############################

N = int(input())
arr = [int(i) for i in input().split()]

for val in arr:
    #print("### Addding node ##########################")
    add(tree, val)
    
#print("###########################################")
tree.display()

'''
5
3 4 8 9 12
'''

