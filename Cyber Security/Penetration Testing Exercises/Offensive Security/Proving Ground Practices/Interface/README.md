# Interface

# Enumeration
## nmap

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Interface]
└─$ rustscan -a 192.168.139.106
.----. .-. .-. .----..---.  .----. .---.   .--.  .-. .-.
| {}  }| { } |{ {__ {_   _}{ {__  /  ___} / {} \ |  `| |
| .-. \| {_} |.-._} } | |  .-._} }\     }/  /\  \| |\  |
`-' `-'`-----'`----'  `-'  `----'  `---' `-'  `-'`-' `-'
The Modern Day Port Scanner.
________________________________________
: https://discord.gg/GFrQsGy           :
: https://github.com/RustScan/RustScan :
 --------------------------------------
😵 https://admin.tryhackme.com

[~] The config file is expected to be at "/home/kali/.rustscan.toml"
[!] File limit is lower than default batch size. Consider upping with --ulimit. May cause harm to sensitive servers
[!] Your file limit is very small, which negatively impacts RustScan's speed. Use the Docker image, or up the Ulimit with '--ulimit 5000'. 
Open 192.168.139.106:22
Open 192.168.139.106:80
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-01 10:04 EST
Initiating Ping Scan at 10:04
Scanning 192.168.139.106 [2 ports]
Completed Ping Scan at 10:04, 0.26s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 10:04
Completed Parallel DNS resolution of 1 host. at 10:04, 0.00s elapsed
DNS resolution of 1 IPs took 0.00s. Mode: Async [#: 1, OK: 0, NX: 1, DR: 0, SF: 0, TR: 1, CN: 0]
Initiating Connect Scan at 10:04
Scanning 192.168.139.106 [2 ports]
Discovered open port 22/tcp on 192.168.139.106
Discovered open port 80/tcp on 192.168.139.106
Completed Connect Scan at 10:04, 0.26s elapsed (2 total ports)
Nmap scan report for 192.168.139.106
Host is up, received syn-ack (0.26s latency).
Scanned at 2022-02-01 10:04:23 EST for 1s

PORT   STATE SERVICE REASON
22/tcp open  ssh     syn-ack
80/tcp open  http    syn-ack

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 0.60 seconds

                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Interface]
└─$

┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Interface]
└─$ sudo nmap -p22,80 -sV -A -O -sC  192.168.139.106
[sudo] password for kali: 
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-01 10:15 EST
Nmap scan report for 192.168.139.106
Host is up (0.26s latency).

PORT   STATE SERVICE VERSION
22/tcp open  ssh     OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 08:50:f6:e6:aa:44:d6:c4:f1:ca:3c:d1:d9:18:43:4d (RSA)
|   256 ed:c6:e6:95:88:99:58:31:14:20:38:83:01:e2:e7:15 (ECDSA)
|_  256 ba:65:96:08:a2:e2:f5:1f:af:88:6e:55:c7:9c:5f:b1 (ED25519)
80/tcp open  http    Node.js Express framework
|_http-title: App
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Aggressive OS guesses: Linux 2.6.18 (91%), Linux 4.15 - 5.6 (90%), Linux 5.0 (90%), Linux 2.6.32 (90%), Linux 3.4 (90%), Linux 3.5 (90%), Linux 3.7 (90%), Linux 4.2 (90%), Linux 4.4 (90%), Synology DiskStation Manager 5.1 (90%)
No exact OS matches for host (test conditions non-ideal).
Network Distance: 2 hops
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 80/tcp)
HOP RTT       ADDRESS
1   260.68 ms 192.168.49.1
2   260.92 ms 192.168.139.106

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 22.31 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Interface]
└─$ 
```

## 80 - Web

![](Pasted%20image%2020220201230119.png)


# Exploitation