```bash
nmap -vv --reason -Pn -T4 -sV -p 22 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 192.168.90.67
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp22/tcp_22_ssh_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp22/tcp_22_ssh_nmap.txt):

```
# Nmap 7.91 scan initiated Mon Feb 14 08:43:01 2022 as: nmap -vv --reason -Pn -T4 -sV -p 22 --script=banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 192.168.90.67
Nmap scan report for 192.168.90.67
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-14 08:43:02 EST for 8s

PORT   STATE SERVICE REASON         VERSION
22/tcp open  ssh     syn-ack ttl 63 OpenSSH 7.4p1 Debian 10+deb9u7 (protocol 2.0)
|_banner: SSH-2.0-OpenSSH_7.4p1 Debian-10+deb9u7
| ssh-auth-methods: 
|   Supported authentication methods: 
|     publickey
|_    password
| ssh-hostkey: 
|   2048 aa:77:6f:b1:ed:65:b5:ad:14:64:40:d2:24:d3:9c:0d (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC9yKoYquj+03HzzDt10Vye2nDsQQYflZqSXlNi4CWbk9++xu69PJEgsm0GMczWto1hEV8SG2hLMvP/2EGg7WU+6Dru695SYZhUHAJfJErXptgw3tbkM4id+civEPOYAqatj0HxF29hRV7DU3UYw6koNhpAmgf+B1zlXS4It3iZR7xOdOcSylKKCd0zJDE8VS8udSddyhugxArCMCbiiZD5y7AJ9/IeQ0Jl+t4n0JxF5tELOifQ4seAGtEi3A8gpYav6E81DG9rIwuZdpOVnh3/nZgkwtcaVymXYUTAMPzwLr1cwK5Jd+OMFy6grAZvhjbDxdnHI7WCXo5HXEhVZVG5
|   256 a9:b4:4f:61:2e:2d:9d:4c:48:15:fe:70:8e:fa:af:b3 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBNKcVXu5Q1QIJE/D7O8GWuavg4Thfp3NQsFXiEnrgjgluRdw0ZQ0bi1raXmVymLKiSSzdO4LTVixBiU+hYvMm4g=
|   256 92:56:eb:af:c9:34:af:ea:a1:cf:9f:e1:90:dd:2f:61 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOTR8UgPY9T6exsIAXVoAiNxWupn0Daf+/Hf6gOUv4zv
| ssh2-enum-algos: 
|   kex_algorithms: (10)
|       curve25519-sha256
|       curve25519-sha256@libssh.org
|       ecdh-sha2-nistp256
|       ecdh-sha2-nistp384
|       ecdh-sha2-nistp521
|       diffie-hellman-group-exchange-sha256
|       diffie-hellman-group16-sha512
|       diffie-hellman-group18-sha512
|       diffie-hellman-group14-sha256
|       diffie-hellman-group14-sha1
|   server_host_key_algorithms: (5)
|       ssh-rsa
|       rsa-sha2-512
|       rsa-sha2-256
|       ecdsa-sha2-nistp256
|       ssh-ed25519
|   encryption_algorithms: (6)
|       chacha20-poly1305@openssh.com
|       aes128-ctr
|       aes192-ctr
|       aes256-ctr
|       aes128-gcm@openssh.com
|       aes256-gcm@openssh.com
|   mac_algorithms: (10)
|       umac-64-etm@openssh.com
|       umac-128-etm@openssh.com
|       hmac-sha2-256-etm@openssh.com
|       hmac-sha2-512-etm@openssh.com
|       hmac-sha1-etm@openssh.com
|       umac-64@openssh.com
|       umac-128@openssh.com
|       hmac-sha2-256
|       hmac-sha2-512
|       hmac-sha1
|   compression_algorithms: (2)
|       none
|_      zlib@openssh.com
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Feb 14 08:43:10 2022 -- 1 IP address (1 host up) scanned in 9.07 seconds

```
