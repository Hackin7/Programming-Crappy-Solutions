
# https://gist.github.com/trietptm/5cd60ed6add5adad6a34098ce255949a
rol = lambda val, r_bits, max_bits: \
    (val << r_bits%max_bits) & (2**max_bits-1) | \
    ((val & (2**max_bits-1)) >> (max_bits-(r_bits%max_bits)))
 
# Rotate right: 0b1001 --> 0b1100
ror = lambda val, r_bits, max_bits: \
    ((val & (2**max_bits-1)) >> r_bits%max_bits) | \
    (val << (max_bits-(r_bits%max_bits)) & (2**max_bits-1))

def decode(buf, key):
    r = list(buf)
    for i in range(8):
        v3 = rol(buf[i]^key[i],i, 8)
        result = v3-i
        r[i] = result
    return r

def getkey(buf,val):
    key = []
    for i in range(8):
        result = val[i]
        v3 = result + i
        v3m = ror(v3,i,8)
        print(v3, v3m)
        key.append(buf[i] ^ v3m)
    return key
    
with open("Files/capa.png.encrypted", "rb") as f:
    data = f.read()

print(data[:8])
pngheader = b"\x89\x50\x4e\x47\x0d\x0a\x1a\x0a"
key = getkey(data, pngheader)

print("### k #########################")
k=""
for i in key:
    k+=chr(i)
print(key)
print(k, len(k))

## Crosscheck ####### -> Function is working, check against capa_key-aaaaaaaa.png
print("### Crosscheck ################")
result = decode(data[:8], b"aaaaaaaa")
print([hex(i) for i in result])
    
result = decode(data[:8], key)
print([hex(i) for i in result])
