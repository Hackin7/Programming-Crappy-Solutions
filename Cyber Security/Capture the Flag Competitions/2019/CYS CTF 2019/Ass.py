e = 65537
n = 25217504705091327923619967258555558119954392409205403145472230327043451917476126598007137926101153343505134281980451910548993692600372974764947840497514641293355376605835961472754281773766335786262650066957605665435087046309937021
c = 6622134070245691926996690308636014521286935741634261181087265897986185018162369958862196354607409823650060083771844108483125982217500810571329331739793531038267151817809752836841785323152293094359142542286156837710367592316963064

def modinv(a, m):
    for x in range(1, m):
        if (a * x) % m == 1:
            return x
    return None

def phi(n) : 
    result = n   # Initialize result as n 
    # Consider all prime factors 
    # of n and for every prime 
    # factor p, multiply result with (1 - 1 / p) 
    p = 2
    while(p * p<= n) :
        print(p)
  
        # Check if p is a prime factor. 
        if (n % p == 0) : 
  
            # If yes, then update n and result 
            while (n % p == 0) : 
                n = n // p 
            result = result * (1.0 - (1.0 / (float) (p))) 
        p = p + 1
          
          
    # If n has a prime factor 
    # greater than sqrt(n) 
    # (There can be at-most one 
    # such prime factor) 
    if (n > 1) : 
        result = result * (1.0 - (1.0 / (float)(n))) 
   
    return (int)(result) 
      
p = phi(n)
#modinv(e,phi)
d = (p+1)/e
