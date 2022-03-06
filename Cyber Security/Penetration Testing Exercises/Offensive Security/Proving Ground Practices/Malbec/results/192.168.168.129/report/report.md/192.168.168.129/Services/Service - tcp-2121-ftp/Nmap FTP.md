```bash
nmap -vv --reason -Pn -T4 -sV -p 2121 --script="banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/tcp2121/tcp_2121_ftp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/tcp2121/xml/tcp_2121_ftp_nmap.xml" 192.168.168.129
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/tcp2121/tcp_2121_ftp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/tcp2121/tcp_2121_ftp_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Mar  5 09:00:56 2022 as: nmap -vv --reason -Pn -T4 -sV -p 2121 "--script=banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/tcp2121/tcp_2121_ftp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/tcp2121/xml/tcp_2121_ftp_nmap.xml" 192.168.168.129
Nmap scan report for 192.168.168.129
Host is up, received user-set (0.17s latency).
Scanned at 2022-03-05 09:00:56 EST for 3s

PORT     STATE SERVICE REASON         VERSION
2121/tcp open  ftp     syn-ack ttl 63 pyftpdlib 1.5.6
|_banner: 220 pyftpdlib 1.5.6 ready.
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
|_-rwxrwxrwx   1 carlos   carlos     108304 Jan 25  2021 malbec.exe [NSE: writeable]
| ftp-syst: 
|   STAT: 
| FTP server status:
|  Connected to: 192.168.168.129:2121
|  Waiting for username.
|  TYPE: ASCII; STRUcture: File; MODE: Stream
|  Data connection closed.
|_End of status.
|_sslv2-drown: 

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 09:00:59 2022 -- 1 IP address (1 host up) scanned in 3.58 seconds

```
