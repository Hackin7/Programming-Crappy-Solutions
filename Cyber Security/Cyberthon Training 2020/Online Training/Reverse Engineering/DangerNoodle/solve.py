'''
The main solution to this challenge is just to decode the .pyc file and
 code a reversing function to reverse the thing
 
Flag : 
CTFSG{3GG1N3R1NG_M0D3_4CT1V4T3D}
'''

from sys import argv, exit

def encode(data):
    encoded = ''
    while data: #While the data is not empty
        current = data[0]
        count = 1
        for i in data[1:]:
            if i == current: #Truncate bytes that are duplicated
                count += 1
            else:
                break
            if count == 255:
                break

        encoded += ('{}{}').format(chr(~ord(current) & 255), chr(~count & 255))
        data = data[count:]

    return encoded

def decode(encoded):
    data = b''
    while encoded:
        current = encoded[0]
        count = ~ord(encoded[1]) & 255
        print(current,count)
        for i in range(count):
            data += ('{}').format(chr(~ord(current)&255))
        encoded = encoded[2:]
    
    return data


if __name__ == '__main__':
    ## Encode
    with open('test.jpg', 'r') as (f):data = f.read()
    with open('test.jpg.out','wb') as f:f.write(encode(data))
    
    with open('flag.jpg.out', 'rb') as (f):
        data = f.read()
    with open('sol.jpg', 'wb') as (f):
        f.write(decode(data))
