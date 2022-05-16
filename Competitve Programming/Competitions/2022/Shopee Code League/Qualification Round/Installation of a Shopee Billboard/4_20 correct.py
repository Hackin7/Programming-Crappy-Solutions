def find(set1_sum, set2_sum, arr, ans):
    if set1_sum == set2_sum and set1_sum > ans:
        return find(set1_sum, set2_sum, arr, set1_sum)

    if arr == []:
        return ans

    x = arr.pop()

    if set1_sum + x <=  maxi:
        return find(set1_sum + x, set2_sum, arr, ans)

    if set2_sum + x <=  maxi:
        return find(set1_sum, set2_sum + x, arr, ans)


    return find(set1_sum, set2_sum, arr, ans) #throw away x

n = int(input())
arr = [int(i) for i in input().split()]

maxi = sum(arr)/2 #this is the max answer, with whole array divided into 2 disjoint set
first = arr.pop()
found = find(first, 0, arr, 0)

print(found)
