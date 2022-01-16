import random
import argparse

def encrypt(path, path_out):
    #Reading the file and generating an array
    arr = []
    with open(path, 'rb') as file:
        while line := file.read(16):
            arr.append(bytearray(line))
    
    #Encrypting the data column by column
    for col in range(16):
        n = random.randint(0, 255)
        for row in range(len(arr)):
            try:
                arr[row][col] = (arr[row][col] + n)%256
            except Exception as e:
                continue
                #print(e)
                
    #Writing the output into a new file
    with open(path_out, 'wb') as file:
        for row in arr:
            file.write(bytearray(row))
    

def main():
    parser = argparse.ArgumentParser(description='Welcome to the wonderful file encryptor!')
    parser.add_argument('input', help='input file')
    parser.add_argument('output', help='output file')

    args = parser.parse_args()

    encrypt(args.input, args.output)

    print("Haha! Your file has been encrypted!")


if __name__ == "__main__":
    main()