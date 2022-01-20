# Metallus

# Enumeration
```
[*] Finished scanning all targets in 30 minutes, 23 seconds!
[*] Don't forget to check out more commands to run manually in the _manual_commands.txt file in each target's scans directory!
[!] AutoRecon identified the following services, but could not match them to any plugins based on the service name. Please report these to Tib3rius: tcp/12000/cce4x/insecure, tcp/5040/unknown/insecure, tcp/12000/tcpwrapped/insecure, tcp/49670/tcpwrapped/insecure, tcp/49693/tcpwrapped/insecure, tcp/49718/tcpwrapped/insecure, tcp/49796/tcpwrapped/insecure, tcp/49797/tcpwrapped/insecure                                                                                                                      
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus]
└─$ 

```
## Nmap

### Vuln
```
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap --script vuln -p- 192.168.225.96
[sudo] password for kali: 
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-16 09:34 EST
Stats: 0:03:08 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 36.53% done; ETC: 09:43 (0:05:06 remaining)
Stats: 0:10:35 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 83.19% done; ETC: 09:47 (0:02:06 remaining)
Nmap scan report for 192.168.225.96
Host is up (0.24s latency).
Not shown: 65517 filtered ports
PORT      STATE SERVICE
135/tcp   open  msrpc
139/tcp   open  netbios-ssn
445/tcp   open  microsoft-ds
5040/tcp  open  unknown
12000/tcp open  cce4x
22222/tcp open  easyengine
40443/tcp open  unknown
49664/tcp open  unknown
49665/tcp open  unknown
49666/tcp open  unknown
49667/tcp open  unknown
49668/tcp open  unknown
49669/tcp open  unknown
49847/tcp open  unknown
49870/tcp open  unknown
49894/tcp open  unknown
49949/tcp open  unknown
49950/tcp open  unknown

Host script results:
|_samba-vuln-cve-2012-1182: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR
|_smb-vuln-ms10-054: false
|_smb-vuln-ms10-061: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR

Nmap done: 1 IP address (1 host up) scanned in 876.65 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

# Exploitation

# Others
OpenSSH
https://msrc.microsoft.com/update-guide/vulnerability/CVE-2020-1292
