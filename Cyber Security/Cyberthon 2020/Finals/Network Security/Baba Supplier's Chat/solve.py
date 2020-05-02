import socket
import sys

# Create a TCP/IP socket
sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Connect the socket to the port on the server given by the caller
if len(sys.argv) < 3:
    print 'usage: client.py [server_address] [server_port]'
    sys.exit(1)  # abort because of error

    
server_port = int(sys.argv[2])
server_address = (sys.argv[1], server_port)

print >>sys.stderr, 'connecting to %s port %s' % server_address
try:
    sock.connect(server_address)
except socket.error, (value, message):
    print 'socket.error - ' + message + ' addr: ' , server_address


try:    
    #Standard login
    data = sock.recv(1024)
    print >>sys.stderr, 'received "%s"' % data
    print 'sending "%s" ' % "shake_baba"
    sock.sendall("shake_baba")
    data = sock.recv(1024)
    print >>sys.stderr, 'received "%s"' % data

    ### Basically change the code such that it runs many times ######
    while True:
	# Reply hash of the message send to login
	print 'sending hashed "%s" ' % str(data)
	sock.sendall(str(hash(data)))

	data = sock.recv(1024)
	print >>sys.stderr, 'received "%s"' % data
    ####################################################################

except socket.error, (value,message): 
    count = 0;
    print 'socket.error - ' + message + ' addr: ' , server_address 

finally:
    sock.close()

