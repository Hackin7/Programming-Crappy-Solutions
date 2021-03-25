#100% solution
N = 0
S = 0
with open("whereami.in") as f:
    N = int(f.readline())
    S = f.readline()
#print(N,S)


seq = []
sub = ""
ans = N
# Brute Force
for i in range(1,N+1): #Length of Sequence
    seq.clear()
    for j in range(N-i+1): #indexing
        sub = S[j:j+i] 
        print(sub,end=" ")
        if sub in seq:
            break
        else:
            seq.append(sub);
            if (j==N-i):
                ans = i
                break
            
    print(seq)
    if (ans != N):break
        
print(sub,ans)        
with open("whereami.out", "w") as f:
    f.write(str(ans))
