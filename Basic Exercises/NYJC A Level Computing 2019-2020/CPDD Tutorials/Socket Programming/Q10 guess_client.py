import socket

s = socket.socket()
s.connect(('127.0.0.1',9999))

data = b''
while True:
    while b'\n' not in data:
        data += s.recv(1024)
    received = data[:data.find(b'\n')]
    data = data[len(received) + 1:]
    if received == b'LOW':
        print('Your guess is too low.')
    elif received == b'HIGH':
        print('Your guess is too high.')
    elif received == b'GUESS':
        guess = int(input('Enter guess (1-100): '))
        s.sendall(str(guess).encode() + b'\n')
    elif received == b'WIN':
        print('You win!')
        break
    elif received == b'GAMEOVER':
        print('You ran out of tries! Game over.')
        break
    
s.close()
