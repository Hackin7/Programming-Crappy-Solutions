import socket
#socket.AF_INET => Using IPv4
#socket.SOCK_STREAM => Using TCP
listen_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
#'127.0.0.1 loop back address, 2345 port number
listen_socket.bind(('127.0.0.1', 12345))
print("waiting connection...")
listen_socket.listen()
game_socket, addr = listen_socket.accept()
print("connection accepted:")


message_history = []
last_result = ""
memory = ""

done = False
while not done:
    # server always waits for client's msg
    rx_msg_str = ""
    while "\n" not in rx_msg_str:
        rx_msg_str += game_socket.recv(1024).decode()
    
    message_history.append(rx_msg_str[:-1])
    print(rx_msg_str)
    if rx_msg_str[:3] == "ADD":
        msg = "ADD"
        header, operand1, operand2 = rx_msg_str[:-1].split(' ')
        result = int(operand1) + int(operand2)
        msg += ' ' + str(result)
        msg += "\n"
        last_result = str(result)
        game_socket.send(msg.encode())
    elif rx_msg_str[:3] == "SUB":
        msg = "SUB"
        header, operand1, operand2 = rx_msg_str[:-1].split(' ')
        result = int(operand1) - int(operand2)
        msg += " " + str(result)
        msg += "\n"
        last_result = str(result)
        game_socket.send(msg.encode())
    elif rx_msg_str[:3] == "MUL":
        msg = "MUL"
        header, operand1, operand2 = rx_msg_str[:-1].split(' ')
        result = int(operand1) * int(operand2)
        msg += " " + str(result)
        msg += "\n"
        last_result = str(result)
        game_socket.send(msg.encode())
    elif rx_msg_str[:3] == "DIV":
        msg = "DIV"
        header, operand1, operand2 = rx_msg_str[:-1].split(' ')
        result = int(operand1) // int(operand2)
        msg += " " + str(result)
        msg += "\n"
        last_result = str(result)
        game_socket.send(msg.encode())
    elif rx_msg_str[:3] == "STO":
        msg = ""
        if len(memory) > 0:
            msg = "REPLACE"
            msg += " " + memory
            msg += "\n"
            game_socket.send(msg.encode())
            rx_msg_str = ""
            while "\n" not in rx_msg_str:
                rx_msg_str += game_socket.recv(1024).decode()
            if rx_msg_str[:3] == "YES":
                memory = last_result
                msg = "STO DONE"
            else:
                msg = "STO VOID"
                
        else:
            memory = last_result
            msg = "STO DONE"
        msg += "\n"
        game_socket.send(msg.encode())            
    elif rx_msg_str[:3] == "RCL":
        msg = "RCL"
        msg += " " + memory
        msg += "\n"
        game_socket.send(msg.encode()) 
    elif rx_msg_str[:3] == "HIS":
        msg = "HIS"
        for message in message_history:
            msg += "," + message
        msg += "\n"
        game_socket.send(msg.encode())    
    elif rx_msg_str[:-1] == "QUIT":
        done = True
        game_socket.send("QUIT\n".encode())
        print("User quits.")
    else:
        raise "Invalid command."
        
game_socket.close()
listen_socket.close()
