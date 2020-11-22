import socket
import time
import random

listen_socket = socket.socket()
listen_socket.bind(('127.0.0.1',9999))
listen_socket.listen()
s, addr = listen_socket.accept()

number = random.randint(1,100)
print("Number to be guessed:", number)
tries = 0
try:
    while True:
        tries += 1
        if tries <= 5:
            s.send(b'GUESS\n')
        else:
            s.sendall( b'GAMEOVER\n')
            break
            
        ### Client receive code #########
        print('WAITING FOR CLIENT')
        data = b''
        while b'\n' not in data:
            data += s.recv(1024)
        print('CLIENT WROTE: ' + data.decode())
        #################################
        
        guessed = int(data.decode())
        if guessed < number:
            s.sendall(b'LOW\n')
        elif guessed == number:
            s.sendall(b'WIN\n')
            break
        elif guessed > number:
            s.sendall(b'HIGH\n')
            
        
except Exception as e:
    print("Error:", e)

time.sleep(1) # Wait for client to close
s.close()    
listen_socket.close()

