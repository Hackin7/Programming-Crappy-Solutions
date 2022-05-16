# 16:15 from 16:02

N, T = [int(i) for i in input().split()]

names = []
balances = {} # Dictionary

for i in range(N):
    ui, bi = input().split()
    bi = int(bi)
    names.append(ui)
    balances[ui] = bi
    
names.sort()
for i in range(T):
    ua, ub, x = input().split()
    x = int(x)
    if x <= balances[ua]:
        balances[ua] -= x
        balances[ub] += x
    
for name in names:
    print(name, balances[name])
