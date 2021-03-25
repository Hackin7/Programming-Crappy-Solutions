def parentheses(S):
    C = [0]*(len(S)+1)
    D = [0]*(len(S)+1)
    
    #Check if first digit is 0
    C[0] = int(S[0])
    
    for i in range(1,len(S)):
        diff = int(S[i-1])-int(S[i])
        if diff < 0:
            C[i]+=abs(diff)
        elif diff > 0:
            D[i]+=diff
    D[-1]=int(S[-1])
    output=""
    for i in range(len(S)):
        output += "("*C[i]+")"*D[i]+S[i]
    output+=")"*D[-1]
    return output

T = int(input())
for t in range(1,T+1):
    S = input()
    print(f"Case #{t}: {parentheses(S)}")
    
'''
4
0000
101
111000
1
'''
