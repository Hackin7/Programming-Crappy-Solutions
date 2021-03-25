#Q1
total = 0
for i in range(1000):
    if i%3 == 0: total+=i
    elif i%5 == 0: total += i
print(total)

#Q2
terms = [0,1]
total = 0
while terms[-1] < 4000000:
    terms.append(terms[-1]+terms[-2])
    if terms[-1]%2 == 0: total+=terms[-1]
    
print(total)

#Q3
def isPrime(n):
    for i in range(2,int(n**0.5)+1):
        if n%i == 0: return False
    return True
    
def findFactor(n):
    for i in range(2,int(n**0.5)+1):
        if n%i == 0: return i
    return -1

n = 600851475143
factor = 1
factors = []
while factor > 0:
    n /= factor
    factors.append(factor)
    factor = findFactor(n)
print(n, factors)

#Q4
def q4():
    data = 1000
    for i in range(999,99,-1):
        for j in range(999,99,-1):
            n = str(i*j)
            for k in range(int(len(n)/2)):
                if n[k] != n[-k-1]:
                    break
                if k == int(len(n)/2)-1:
                    data = max(data, int(n))
    print(data)
q4()
#Q5
def q5(n):
    for hello in range(1000000000):
        n +=1
        for i in range(1,21):
            if n%i != 0:
                break
            if i == 20:
                print(n)
                return
#q5(2520)
    
