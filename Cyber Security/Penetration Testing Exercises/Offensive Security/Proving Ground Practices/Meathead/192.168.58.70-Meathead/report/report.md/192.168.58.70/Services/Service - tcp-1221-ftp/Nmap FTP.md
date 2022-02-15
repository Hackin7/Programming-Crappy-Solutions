```bash
nmap -vv --reason -Pn -T4 -sV -p 1221 --script="banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp1221/tcp_1221_ftp_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp1221/xml/tcp_1221_ftp_nmap.xml" 192.168.58.70
```

[/root/autorecon/results/192.168.58.70/scans/tcp1221/tcp_1221_ftp_nmap.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp1221/tcp_1221_ftp_nmap.txt):

```
# Nmap 7.92 scan initiated Wed Jan 19 18:49:57 2022 as: nmap -vv --reason -Pn -T4 -sV -p 1221 "--script=banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN /root/autorecon/results/192.168.58.70/scans/tcp1221/tcp_1221_ftp_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/tcp1221/xml/tcp_1221_ftp_nmap.xml 192.168.58.70
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-19 18:49:58 +08 for 4s

PORT     STATE SERVICE REASON          VERSION
1221/tcp open  ftp     syn-ack ttl 127 Microsoft ftpd
|_banner: 220 Microsoft FTP Service
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
| 04-27-20  07:02PM                18866 Elementum Supremum.docx
| 04-27-20  07:02PM               764176 file_example_MP3_700KB.mp3
| 04-27-20  07:02PM                15690 img.jpg
| 04-27-20  07:02PM                  302 MSSQL_BAK.rar
| 04-27-20  07:02PM                  548 palindromes.txt
|_04-27-20  07:02PM                45369 server.jpg
| ftp-syst: 
|_  SYST: Windows_NT
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 18:50:02 2022 -- 1 IP address (1 host up) scanned in 5.32 seconds

```
