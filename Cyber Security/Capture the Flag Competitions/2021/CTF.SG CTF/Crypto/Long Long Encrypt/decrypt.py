with open('txt.enc', 'r') as f:
    exec(f.read())

def output():
    with open('n.txt', 'w') as f:
        f.write(str(n))

    with open('e.txt', 'w') as f:
        f.write(str(e))

    with open('c.txt', 'w') as f:
        f.write(str(c))



### https://github.com/cyberyouthsg/cysc19-ctf/blob/master/crypto/asymmetric-2.0/solution/solution.py
# Finding modular inverse: https://stackoverflow.com/questions/4798654/modular-multiplicative-inverse-function-in-python
from math import gcd

def egcd(a, b):
    if a == 0:
        return (b, 0, 1)
    else:
        g, y, x = egcd(b % a, a)
        return (g, x - (b // a) * y, y)

def modinv(a, m):
    g, x, y = egcd(a, m)
    if g != 1:
        raise Exception('modular inverse does not exist')
    else:
        return x % m


#e = 65537
#c = 6622134070245691926996690308636014521286935741634261181087265897986185018162369958862196354607409823650060083771844108483125982217500810571329331739793531038267151817809752836841785323152293094359142542286156837710367592316963064
#p = 3725388540036591041643678991347701532937995068972047889459827083352416094739748803290082375874981227998371945676111
#q = 6769093863386297883488638026341328618874310635474126545969024032791150452455022144768609227282398126000693285501811
#n = p*q
#phi = (p-1)*(q-1)



def decode():
    d = modinv(e,phi)
    try:
        # Get plaintext in integer format
        m = pow(c,d,n)
        # Convert the integer to bytes, then to a string
        flag = rev_bti(m)
        print(flag)
    except Exception:
        print("Decryption failed")

### Reverse bti
def rev_bti(out):
    s = ''
    while out > 0:
        s = chr(out%256) + s
        out //= 256
    return s
