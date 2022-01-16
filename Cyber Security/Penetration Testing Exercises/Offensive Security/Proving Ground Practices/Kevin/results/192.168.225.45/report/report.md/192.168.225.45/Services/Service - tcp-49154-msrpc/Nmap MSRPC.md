```bash
nmap -vv --reason -Pn -T4 -sV -p 49154 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49154/tcp_49154_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49154/xml/tcp_49154_rpc_nmap.xml" 192.168.225.45
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49154/tcp_49154_rpc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49154/tcp_49154_rpc_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Jan 16 08:11:05 2022 as: nmap -vv --reason -Pn -T4 -sV -p 49154 --script=banner,msrpc-enum,rpc-grind,rpcinfo -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49154/tcp_49154_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49154/xml/tcp_49154_rpc_nmap.xml" 192.168.225.45
Nmap scan report for 192.168.225.45
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-16 08:11:12 EST for 75s

PORT      STATE SERVICE REASON          VERSION
49154/tcp open  msrpc   syn-ack ttl 127 Microsoft Windows RPC
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 08:12:27 2022 -- 1 IP address (1 host up) scanned in 83.29 seconds

```
