sign_pos = "0"
sign_neg = "1"
exponent_de = "00000000000"
exponent_inf = "11111111111"
fraction_inf = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF".replace("F", "0")
fraction = "1111111111111111111111111111111111111111111111111111"
exponent_less_than_inf = "11111111110"

'''
def padding(val, length, pad="0"):
    return "0"*(length-len(val)) + val
def floatAsBytes(sign, exponent, fraction):
    e = '{0:b}'.format(exponent)
    f = '{0:b}'.format(int(fraction*(2**20)))
    return str(sign) + padding(e, 7+4) + padding(f, 4+8+8)
'''

positiveInfinity = sign_pos+exponent_inf+fraction_inf
negativeInfinity = sign_neg+exponent_inf+fraction_inf
positiveNan = sign_pos+exponent_inf+fraction
negativeNan = sign_neg+exponent_inf+fraction
large_double = sign_pos+exponent_less_than_inf+fraction
allOnes = "1"*64
for val in (positiveInfinity, negativeInfinity, positiveNan, negativeNan, large_double):
    print(int(val, 2))

# 4607182418800017408 -> 1
# 4607182418800017408 -> -1
