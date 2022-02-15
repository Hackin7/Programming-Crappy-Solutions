```bash
nmap -vv --reason -Pn -T4 -sV -p 3389 --script="banner,(rdp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp3389/tcp_3389_rdp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp3389/xml/tcp_3389_rdp_nmap.xml" 192.168.161.168
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp3389/tcp_3389_rdp_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp3389/tcp_3389_rdp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 09:29:38 2022 as: nmap -vv --reason -Pn -T4 -sV -p 3389 "--script=banner,(rdp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp3389/tcp_3389_rdp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp3389/xml/tcp_3389_rdp_nmap.xml" 192.168.161.168
Nmap scan report for 192.168.161.168
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-13 09:29:39 EST for 337s

PORT     STATE SERVICE        REASON          VERSION
3389/tcp open  ms-wbt-server? syn-ack ttl 127
|_rdp-enum-encryption: Received unhandled packet
|_ssl-ccs-injection: No reply from server (TIMEOUT)
|_sslv2-drown: 

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 09:35:16 2022 -- 1 IP address (1 host up) scanned in 338.61 seconds

```
