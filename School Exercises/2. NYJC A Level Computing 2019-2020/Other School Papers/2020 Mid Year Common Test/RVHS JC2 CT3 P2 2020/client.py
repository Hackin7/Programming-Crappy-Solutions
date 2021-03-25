## Task 3

import socket
class SocketClient:
    def __init__(self, ip, port):
        self.conn = socket.socket()
        self.conn.connect((ip, port))
    
    def send(self, message):
        self.conn.sendall(message.encode())
    
    def receive(self):
        return self.conn.recv(1024).decode()
    
    def close(self):
        self.conn.close()


class CalculatorClient(SocketClient):
    def arithmetic(self, op, a, b):
        message = f"{op} {a} {b}\n"
        self.send(message)
        return self.receive().strip()
    
    def add(self, a, b):
        return self.arithmetic('ADD', a, b)
    def sub(self, a, b):
        return self.arithmetic('SUB', a, b)
    def mul(self, a, b):
        return self.arithmetic('MUL', a, b)
    def div(self, a, b):
        return self.arithmetic('DIV', a, b)
    
    # STO (store) 
    def sto(self):
        self.send('STO\n')
        output = self.receive()
        if output == "STO DONE\n":
            return None # Nothing to replace with
        else: # REPLACE Message
            data = output.strip().split(" ")
            replace = data[1]
            return replace
    
    def sto_respond_yes(self):
        self.send('YES\n')
        return self.receive().strip() # clear output for future use

    def sto_respond_no(self):
        self.send('NO\n')
        return self.receive().strip() # clear output for future use

    # RCL (Recall)
    def rcl(self):
        self.send("RCL\n")
        return self.receive().strip()
    
    def quit(self):
        self.send('QUIT\n')
    
class Menu:
    def __init__(self, ip, port):
        client = CalculatorClient(ip, port)
        Menu.show_menu_text()
        Menu.menu(client)
    
    def input_numbers():
        a = input("Key in No.1 operand: ").strip()
        a = Menu.validate_int(a, "Key in No.1 operand: ")
        b = input("Key in No.2 operand: ").strip()
        b = Menu.validate_int(b, "Key in No.2 operand: ")
        return a, b
        
    def validate_int(num_string, input_message):
        while not num_string.isdigit():
            print("You did not input in an integer: ")
            num_string = input(input_message)
        return int(num_string)
        
    def show_menu_text():
        menu_text = """\
Calculator Menu
1) ADD
2) SUB
3) MUL
4) DIV
5) STO
6) RCL
7) QUIT"""
        print(menu_text)
        
    def menu(client):
        option = "0" # Placeholder option
        while option != "7":
            option = input("\nChoose an option: ").strip()
            # Arithmetic
            if option == "1":
                a, b = Menu.input_numbers()
                print(client.add(a, b))
            elif option == "2":
                a, b = Menu.input_numbers()
                print(client.sub(a, b))
            elif option == "3":
                a, b = Menu.input_numbers()
                print(client.mul(a, b))
            elif option == "4":
                a, b = Menu.input_numbers()
                print(client.div(a, b))
                
            # Store
            elif option == "5":
                replace = client.sto()
                if replace == None:
                    print("STO DONE")
                else:
                    choice = input(f"Do you want to replace -> {replace} (Y/N)?").strip()
                    if choice == "Y":
                        print(client.sto_respond_yes())
                    else:
                        print(client.sto_respond_no())
                print("\n"*2) # Newlines

            # RCL
            elif option == "6":
                print(client.rcl())
                print("\n"*2) # Newlines

            # Quitting
            elif option == "7":
                print("Quitted!")

            # Invalid
            else:
                print("Invalid Option")
        
        client.close()
Menu('127.0.0.1', 12345)
