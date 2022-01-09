```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/xml/_full_tcp_nmap.xml" 10.10.11.125
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/_full_tcp_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/_full_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Thu Jan  6 03:48:43 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/xml/_full_tcp_nmap.xml" 10.10.11.125
Increasing send delay for 10.10.11.125 from 0 to 5 due to 63 out of 156 dropped probes since last increase.
Warning: 10.10.11.125 giving up on port because retransmission cap hit (6).
Nmap scan report for 10.10.11.125
Host is up, received user-set (0.18s latency).
Scanned at 2022-01-06 03:48:44 EST for 1012s
Not shown: 65516 closed ports
Reason: 65516 conn-refused
PORT      STATE    SERVICE      REASON      VERSION
22/tcp    open     ssh          syn-ack     OpenSSH 8.2p1 Ubuntu 4ubuntu0.3 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   3072 b4:de:43:38:46:57:db:4c:21:3b:69:f3:db:3c:62:88 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDqz2EAb2SBSzEIxcu+9dzgUZzDJGdCFWjwuxjhwtpq3sGiUQ1jgwf7h5BE+AlYhSX0oqoOLPKA/QHLxvJ9sYz0ijBL7aEJU8tYHchYMCMu0e8a71p3UGirTjn2tBVe3RSCo/XRQOM/ztrBzlqlKHcqMpttqJHphVA0/1dP7uoLCJlAOOWnW0K311DXkxfOiKRc2izbgfgimMDR4T1C17/oh9355TBgGGg2F7AooUpdtsahsiFItCRkvVB1G7DQiGqRTWsFaKBkHPVMQFaLEm5DK9H7PRwE+UYCah/Wp95NkwWj3u3H93p4V2y0Y6kdjF/L+BRmB44XZXm2Vu7BN0ouuT1SP3zu8YUe3FHshFIml7Ac/8zL1twLpnQ9Hv8KXnNKPoHgrU+sh35cd0JbCqyPFG5yziL8smr7Q4z9/XeATKzL4bcjG87sGtZMtB8alQS7yFA6wmqyWqLFQ4rpi2S0CoslyQnighQSwNaWuBYXvOLi6AsgckJLS44L8LxU4J8=
|   256 aa:c9:fc:21:0f:3e:f4:ec:6b:35:70:26:22:53:ef:66 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBIuoNkiwwo7nM8ZE767bKSHJh+RbMsbItjTbVvKK4xKMfZFHzroaLEe9a2/P1D9h2M6khvPI74azqcqnI8SUJAk=
|   256 d2:8b:e4:ec:07:61:aa:ca:f8:ec:1c:f8:8c:c1:f6:e1 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIB7eoJSCw4DyNNaFftGoFcX4Ttpwf+RPo0ydNk7yfqca
80/tcp    open     http         syn-ack     Apache httpd 2.4.41 ((Ubuntu))
|_http-generator: WordPress 5.8.1
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: Apache/2.4.41 (Ubuntu)
|_http-title: Backdoor &#8211; Real-Life
1337/tcp  open     waste?       syn-ack
9972/tcp  filtered unknown      no-response
12628/tcp filtered unknown      no-response
15674/tcp filtered unknown      no-response
20416/tcp filtered unknown      no-response
34660/tcp filtered unknown      no-response
35967/tcp filtered unknown      no-response
37227/tcp filtered unknown      no-response
38201/tcp filtered galaxy7-data no-response
51354/tcp filtered unknown      no-response
51549/tcp filtered unknown      no-response
55609/tcp filtered unknown      no-response
55733/tcp filtered unknown      no-response
57147/tcp filtered unknown      no-response
60556/tcp filtered unknown      no-response
64036/tcp filtered unknown      no-response
64620/tcp filtered unknown      no-response
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Jan  6 04:05:37 2022 -- 1 IP address (1 host up) scanned in 1013.39 seconds

```
