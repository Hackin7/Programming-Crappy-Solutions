def find(set1_sum, set2_sum, arr):
    Y = [0]
    if set1_sum == set2_sum:
        Y += [set1_sum]

    if arr == []:
        return Y

    x = arr[0]


    if set1_sum + x <=  maxi:
       Y += find(set1_sum + x, set2_sum, arr[1:])

    if set2_sum + x <=  maxi:
        Y += find(set1_sum, set2_sum + x, arr[1:])


    Y += find(set1_sum, set2_sum, arr[1:]) 

    return Y
     
n = int(input())
arr = [int(i) for i in input().split()]

maxi = int(sum(arr)/2) #CHANGE THIS LINE (CRITICAL)
first = arr.pop()
found = find(first, 0, arr)

print(max(found))
