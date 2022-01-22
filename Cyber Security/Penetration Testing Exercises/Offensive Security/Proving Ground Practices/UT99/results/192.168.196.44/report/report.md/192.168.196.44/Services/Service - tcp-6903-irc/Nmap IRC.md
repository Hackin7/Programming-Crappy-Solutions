```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6903/tcp_6903_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6903/xml/tcp_6903_irc_nmap.xml" -p 6903 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6903/tcp_6903_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6903/tcp_6903_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:04:38 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6903/tcp_6903_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6903/xml/tcp_6903_irc_nmap.xml" -p 6903 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.26s latency).
Scanned at 2022-01-21 08:04:47 EST for 19s

PORT     STATE SERVICE REASON          VERSION
6903/tcp open  irc     syn-ack ttl 127 InspIRCd
| irc-botnet-channels: 
|_  ERROR: Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
|_irc-unrealircd-backdoor: Server closed connection, possibly due to too many reconnects. Try again with argument irc-unrealircd-backdoor.wait set to 100 (or higher if you get this message again).
Service Info: Host: irc.madcowz.localdomain

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:06 2022 -- 1 IP address (1 host up) scanned in 29.11 seconds

```
