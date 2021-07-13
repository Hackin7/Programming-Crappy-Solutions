import ast
import pickle
from fickling.pickle import Pickled

def level1():
    flag = ''
    bytedata = []
    with open('level1/bytecode', 'r') as f:
        line = f.readline()
        for line in f:
            data = line.split()
            try:
                given_int = int(data[-1])

                if given_int > 255:
                    print(given_int)
                    print(data)
                else:
                    bytedata.append(given_int)
                    flag += chr(given_int)
            except: pass
        print(data)

    #print(str_data)
    with open('dump2.data', 'wb') as f:
        f.write(bytearray(bytedata))

def extract_bytes_from_bytecode(filename):
    with open(filename, 'r') as f:
        data = f.read().split()
    for i in range(len(data)):
        byte_data_as_string = ''
        if data[i] == 'BINBYTES':
            for j in range(1,10000):
                if data[i+j][-1] == ":":
                    return eval(byte_data_as_string)
                byte_data_as_string += data[i+j]

def level4():
    b = extract_bytes_from_bytecode('bytecode3')
    with open('dump4.data', 'wb') as f:
        f.write(b)

with open('dump4.data', 'rb') as f: data = f.read()
#5pickle.loads(data)
#print(ast.dump(Pickled.load(data).ast, indent=4))
