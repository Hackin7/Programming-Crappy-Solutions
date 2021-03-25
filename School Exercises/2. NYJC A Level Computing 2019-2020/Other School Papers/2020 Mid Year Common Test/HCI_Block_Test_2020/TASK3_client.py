import socket
PORT_NO = 1234

def client(ip_addr='127.0.0.1', port=PORT_NO):
    client = socket.socket()
    client.connect((ip_addr, port))
    isPlaying = True
    while isPlaying:
        char = input("Enter guess (A-Z):")
        client.send(char.encode('ascii'))
        message = client.recv(1024).decode()
        print(message)
        if "You win!" in message:
            #print("Closed Socket")
            client.close()
            isPlaying = False
        

client()
