# Alt Method: https://hackin7.github.io/Generated/CTF_Writeups/2020/Whitehacks%202020/Crypto/RSB%20(2_4)/index.html
import math

def getModInverse(a, m):
    if math.gcd(a, m) != 1:
        return None
    u1, u2, u3 = 1, 0, a
    v1, v2, v3 = 0, 1, m

    while v3 != 0:
        q = u3 // v3
        v1, v2, v3, u1, u2, u3 = (
            u1 - q * v1), (u2 - q * v2), (u3 - q * v3), v1, v2, v3
    return u1 % m

def hexStringToString(hexString):
    return bytes.fromhex(hexString[2:]).decode('utf-8')#[::-1]
    
def main():

    n = 228430203128652625114739053365339856393

    # If dk, use an online tool to find prime factors of n
    # eg. factordb 
    p, q = 12546190522253739887 , 18207136478875858439
    
    e = 65537
    ct = 126721104148692049427127809839057445790

    # compute n
    n = p * q

    # Compute phi(n)
    phi = #(p - 1) * (q - 1)

    # Compute modular inverse of e
    d = getModInverse(e, phi)

    print("n:  " + str(d))

    # Decrypt ciphertext
    pt = pow(ct, d, n)
    print("pt: ", hex(pt))
    print(hexStringToString(hex(pt)[2:]))
main()

#lag{68ab82df34} => flag{68ab82df34}
