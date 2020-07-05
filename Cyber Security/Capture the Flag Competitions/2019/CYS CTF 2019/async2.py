#!python3.2
primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
rsaNec = [
    [25217504705091327923619967258555558119954392409205403145472230327043451917476126598007137926101153343505134281980451910548993692600372974764947840497514641293355376605835961472754281773766335786262650066957605665435087046309937021,
     65537,
     6622134070245691926996690308636014521286935741634261181087265897986185018162369958862196354607409823650060083771844108483125982217500810571329331739793531038267151817809752836841785323152293094359142542286156837710367592316963064]
    ]

# Find prime factorization for N
def findPrimeFactors(N):
    return [(p, q) for p in primes for q in primes if p * q == N][0]

# Extended Euclidian Algorithm
def egcd(a, b):
    if a == 0:
        return (b, 0, 1)
    else:
        g, y, x = egcd(b % a, a)
        return (g, x - (b // a) * y, y)

# Compute the inverse modulo
def modinv(a, m):
    g, x, y = egcd(a, m)
    if g != 1:
        raise Exception('Modular inverse does not exist')
    else:
        return x % m

def decrypt(c,d,N):
    return pow(c,d,N)

# Decrypt and print RSA data
for Nec in rsaNec:
    N,e,c = Nec
    p, q = findPrimeFactors(N)
    n=(p-1)*(q-1)
    d=modinv(e, n)
    try:
        print(chr(decrypt(c,d,N)))
    except Exception:
        print('Error in decryption')
