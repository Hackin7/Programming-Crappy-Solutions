```
[*] Service scan SMBClient (tcp/139/netbios-ssn/smbclient) ran a command which returned a non-zero exit code (1).
[-] Command: smbclient -L\\ -N -I 192.168.225.96 2>&1
[-] Error Output:


[*] Service scan Enum4Linux (tcp/139/netbios-ssn/enum4linux) ran a command which returned a non-zero exit code (1).
[-] Command: enum4linux -a -M -l -d 192.168.225.96 2>&1
[-] Error Output:


[*] Service scan rpcdump (tcp/49664/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49664 192.168.225.96
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49664' (choose from '135', '139', '443', '445', '593')


[*] Service scan rpcdump (tcp/49666/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49666 192.168.225.96
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49666' (choose from '135', '139', '443', '445', '593')


[*] Service scan rpcdump (tcp/49665/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49665 192.168.225.96
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49665' (choose from '135', '139', '443', '445', '593')


[*] Service scan rpcdump (tcp/49667/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49667 192.168.225.96
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49667' (choose from '135', '139', '443', '445', '593')


[*] Service scan rpcdump (tcp/49668/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49668 192.168.225.96
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49668' (choose from '135', '139', '443', '445', '593')


[*] Service scan rpcdump (tcp/49669/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49669 192.168.225.96
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49669' (choose from '135', '139', '443', '445', '593')



```