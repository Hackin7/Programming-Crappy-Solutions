```bash
nmap -vv --reason -Pn -T4 -sV -p 2222 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp2222/tcp_2222_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp2222/xml/tcp_2222_ssh_nmap.xml" 192.168.90.67
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp2222/tcp_2222_ssh_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp2222/tcp_2222_ssh_nmap.txt):

```
# Nmap 7.91 scan initiated Mon Feb 14 08:43:01 2022 as: nmap -vv --reason -Pn -T4 -sV -p 2222 --script=banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp2222/tcp_2222_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp2222/xml/tcp_2222_ssh_nmap.xml" 192.168.90.67
Nmap scan report for 192.168.90.67
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-14 08:43:02 EST for 95s

PORT     STATE SERVICE REASON         VERSION
2222/tcp open  ssh     syn-ack ttl 63 Dropbear sshd 2016.74 (protocol 2.0)
| banner: SSH-2.0-dropbear_2016.74\x0D\x0A\x00\x00\x02|\x06\x14\x06pJ\xBA
| \x17\x0E\x82N@\x9C\x96E\x9E\xF6\x915\x00\x00\x00\xA6curve25519-sha256@l
| ibssh.org,ecdh-sha2-nistp521,ecdh-sha2-nistp384,ecdh-sha2-nistp256,diff
|_ie-hellman-group14-sha1,diffie-hellman-group1-sha1,kexguess2@matt.uc...
| ssh-auth-methods: 
|   Supported authentication methods: 
|     publickey
|_    password
| ssh2-enum-algos: 
|   kex_algorithms: (7)
|       curve25519-sha256@libssh.org
|       ecdh-sha2-nistp521
|       ecdh-sha2-nistp384
|       ecdh-sha2-nistp256
|       diffie-hellman-group14-sha1
|       diffie-hellman-group1-sha1
|       kexguess2@matt.ucc.asn.au
|   server_host_key_algorithms: (3)
|       ecdsa-sha2-nistp521
|       ssh-rsa
|       ssh-dss
|   encryption_algorithms: (9)
|       aes128-ctr
|       aes256-ctr
|       aes128-cbc
|       aes256-cbc
|       twofish256-cbc
|       twofish-cbc
|       twofish128-cbc
|       3des-ctr
|       3des-cbc
|   mac_algorithms: (5)
|       hmac-sha1-96
|       hmac-sha1
|       hmac-sha2-256
|       hmac-sha2-512
|       hmac-md5
|   compression_algorithms: (2)
|       zlib@openssh.com
|_      none
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Feb 14 08:44:37 2022 -- 1 IP address (1 host up) scanned in 96.36 seconds

```
