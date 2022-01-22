```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6666/tcp_6666_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6666/xml/tcp_6666_irc_nmap.xml" -p 6666 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6666/tcp_6666_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6666/tcp_6666_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 07:57:11 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6666/tcp_6666_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6666/xml/tcp_6666_irc_nmap.xml" -p 6666 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 07:57:13 EST for 68s

PORT     STATE SERVICE REASON          VERSION
6666/tcp open  irc     syn-ack ttl 127 InspIRCd
| irc-botnet-channels: 
|_  ERROR: TIMEOUT
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 3
|   servers: 1
|   chans: 1
|   lusers: 3
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
|_irc-unrealircd-backdoor: Server closed connection, possibly due to too many reconnects. Try again with argument irc-unrealircd-backdoor.wait set to 100 (or higher if you get this message again).
Service Info: Host: irc.madcowz.localdomain

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 07:58:21 2022 -- 1 IP address (1 host up) scanned in 70.08 seconds

```
