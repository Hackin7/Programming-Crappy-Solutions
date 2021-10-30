# 1 correct 99 TLE lol
def totalPairs(n, values):
    # Participants code will be here
    ans = 0
    for i in range(len(values)):
        inbetween = -1
        for j in range(i+1, len(values)):
            # nothing in between OR smaller than min height of two
            if inbetween == -1 or inbetween < min(values[i], values[j]): 
                ans += 1
                #print(values[i], values[j])
            inbetween = max(inbetween, values[j])
            
            
    return ans

if __name__ == "__main__":
    n = int(input())
    values = list(map(int, input().split()))
    answer = totalPairs(n, values)
    print(answer)
