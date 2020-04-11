from sys import argv, exit

def encode(data):
    encoded = ''
    while data:
        current = data[0]
        count = 1
        for i in data[1:]:
            if i == current:
                count += 1
            else:
                break
            if count == 255:
                break

        encoded += ('{}{}').format(chr(~ord(current) & 255), chr(~count & 255))
        data = data[count:]

    return encoded


if __name__ == '__main__':
    if len(argv) < 2:
        print 'Please specify input file!'
        exit(0)
    with open(argv[1], 'rb') as (f):
        data = f.read()
    with open(argv[1] + '.out', 'wb') as (f):
        f.write(encode(data))
