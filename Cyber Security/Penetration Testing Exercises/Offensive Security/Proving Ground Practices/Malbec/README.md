# Malbec

https://www.reddit.com/r/oscp/comments/nigb7m/great_oscp_practice/

# Enumeration

## rustscan

```bash
┌──(kali㉿kali)-[~]
└─$ rustscan -a 192.168.140.129                         
.----. .-. .-. .----..---.  .----. .---.   .--.  .-. .-.
| {}  }| { } |{ {__ {_   _}{ {__  /  ___} / {} \ |  `| |
| .-. \| {_} |.-._} } | |  .-._} }\     }/  /\  \| |\  |
`-' `-'`-----'`----'  `-'  `----'  `---' `-'  `-'`-' `-'
The Modern Day Port Scanner.
________________________________________
: https://discord.gg/GFrQsGy           :
: https://github.com/RustScan/RustScan :
 --------------------------------------
🌍HACK THE PLANET🌍

[~] The config file is expected to be at "/home/kali/.rustscan.toml"
[!] File limit is lower than default batch size. Consider upping with --ulimit. May cause harm to sensitive servers
[!] Your file limit is very small, which negatively impacts RustScan's speed. Use the Docker image, or up the Ulimit with '--ulimit 5000'. 
Open 192.168.140.129:22
Open 192.168.140.129:2121
Open 192.168.140.129:7138
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-20 01:27 EST
Initiating Ping Scan at 01:27
Scanning 192.168.140.129 [2 ports]
Completed Ping Scan at 01:27, 0.18s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 01:27
Completed Parallel DNS resolution of 1 host. at 01:27, 0.02s elapsed
DNS resolution of 1 IPs took 0.02s. Mode: Async [#: 1, OK: 0, NX: 1, DR: 0, SF: 0, TR: 1, CN: 0]
Initiating Connect Scan at 01:27
Scanning 192.168.140.129 [3 ports]
Discovered open port 22/tcp on 192.168.140.129
Discovered open port 7138/tcp on 192.168.140.129
Discovered open port 2121/tcp on 192.168.140.129
Completed Connect Scan at 01:27, 0.17s elapsed (3 total ports)
Nmap scan report for 192.168.140.129
Host is up, received conn-refused (0.18s latency).
Scanned at 2022-02-20 01:27:07 EST for 1s

PORT     STATE SERVICE     REASON
22/tcp   open  ssh         syn-ack
2121/tcp open  ccproxy-ftp syn-ack
7138/tcp open  unknown     syn-ack

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 0.51 seconds

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

┌──(kali㉿kali)-[~]
└─$ ftp 192.168.140.129 2121
Connected to 192.168.140.129.
220 pyftpdlib 1.5.6 ready.
Name (192.168.140.129:kali): anonymous
331 Username ok, send password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
200 Active data connection established.
125 Data connection already open. Transfer starting.
-rwxrwxrwx   1 carlos   carlos     108304 Jan 25  2021 malbec.exe
226 Transfer complete.
ftp> lcd /tmp
Local directory now /tmp
ftp> get malbec.exe
local: malbec.exe remote: malbec.exe
200 Active data connection established.
125 Data connection already open. Transfer starting.
226 Transfer complete.
108304 bytes received in 0.53 secs (197.9851 kB/s)
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ cd /tmp
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ls     
18083.php         systemd-private-bf8dd2a961ea4823b98474c0ef35396e-colord.service-KMjGpj          Temp-4666b9a2-4a9c-42fa-885c-16abd009b55b
hsperfdata_root   systemd-private-bf8dd2a961ea4823b98474c0ef35396e-haveged.service-Tqlgvi         Temp-48eeedea-1786-443e-9889-de773a7f6118
lse.sh            systemd-private-bf8dd2a961ea4823b98474c0ef35396e-ModemManager.service-rDVa6g    wpscan
malbec.exe        systemd-private-bf8dd2a961ea4823b98474c0ef35396e-systemd-logind.service-JF3vti
ssh-Dsg221y7TxxH  systemd-private-bf8dd2a961ea4823b98474c0ef35396e-upower.service-BJLOZg
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ wine malbec.exe       
[+] Malbec started!
[*] Waiting for incoming connections!
^C                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

# Exploitation
