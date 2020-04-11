from sys import argv, exit

def encode(data):
    encoded = ''
    while data: #While the data is not empty
        current = data[0]
        count = 1
        for i in data[1:]:
            if i == current: #Truncate bytes thar are duplicated
                count += 1
            else:
                break
            if count == 255:
                break

        encoded += ('{}{}').format(chr(~ord(current) & 255), chr(~count & 255))
        data = data[count:]

    return encoded

def decode(encoded):
    data = ''
    
    copy=False
    prev = None
    for i in encoded:
        #print(i)
        if copy:
            for j in range(i):
                data += str(prev)
        prev = i
        copy = not copy

    return data


if __name__ == '__main__':
    with open('download.jpeg', 'rb') as (f):
        data = f.read()
    with open('sol.out', 'wb') as (f):
        f.write(encode(data))
