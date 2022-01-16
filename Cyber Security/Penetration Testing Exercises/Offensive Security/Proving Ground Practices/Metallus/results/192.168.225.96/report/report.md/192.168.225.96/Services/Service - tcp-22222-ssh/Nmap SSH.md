```bash
nmap -vv --reason -Pn -T4 -sV -p 22222 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp22222/tcp_22222_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp22222/xml/tcp_22222_ssh_nmap.xml" 192.168.225.96
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp22222/tcp_22222_ssh_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp22222/tcp_22222_ssh_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Jan 16 09:43:56 2022 as: nmap -vv --reason -Pn -T4 -sV -p 22222 --script=banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp22222/tcp_22222_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp22222/xml/tcp_22222_ssh_nmap.xml" 192.168.225.96
Nmap scan report for 192.168.225.96
Host is up, received user-set (0.24s latency).
Scanned at 2022-01-16 09:44:01 EST for 9s

PORT      STATE SERVICE REASON          VERSION
22222/tcp open  ssh     syn-ack ttl 127 OpenSSH for_Windows_8.1 (protocol 2.0)
|_banner: SSH-2.0-OpenSSH_for_Windows_8.1
| ssh-auth-methods: 
|   Supported authentication methods: 
|     publickey
|     password
|_    keyboard-interactive
| ssh-hostkey: 
|   3072 e5:92:a8:a8:57:16:73:42:1a:9b:c2:f2:e3:bd:8a:76 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDPRX/k9OawrX2MoDMvpP4AxvlThR+kYfdnKc5cAG1+U8UMoQkVJHlXZtFeFaaCSydgVbydrVQsgsS4IVyo2Fzpb6PM51PIySCrpAjTRum5042XEyO1JaeRHhwM9mP8WRhUl9qvfog58wGnkjqxe9WAgQ3p8SvCPj/uiwIf0sjBQKIb/Adc8nJZNN1RNaFGckd/RAfVbI1YPPu7bG3M2JV9OQg9Pcwf+w458DMQ4XeZzk55VE1WIXSSU9q9OQI/zeRBsyot6LsoSSx1TKl7GFa96DJ7xpsQUrRa31CIrZ81646zX0opA5dNZ5CkhouWCF/4Ja1rR5V9bSnvuoOvW6KO88ICzJRGwd7KhiEf00K5XCpSQr4zPvqHpKoK9yATYRZ9ZE63AuJkBKlMMoqtYbIyHmYPykhkVdPPLviA2+613hryu5PGv36bl6TmTPyi3z9W4ufM1X6zv4DjpyhDIhDEfP8QkvFLaYD8YS5bKvPzu4tNh3lTjqIE2gmWaWjHaik=
|   256 71:16:46:72:7a:05:c9:77:4e:c5:96:43:96:31:a6:12 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBJP6P3lKM0ZhbP6fzT5Xsva0PlhH5/9T7Um8xVANBO9d7/BXky0IQE0bLDwVUtIZFCsCNumHea2+WFTh5kMnVas=
|   256 e3:42:cf:ff:ba:71:ff:27:09:fa:4d:d5:52:99:59:9c (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIKYI1DU4WSTpKHDyonGLO6VQlMHtmxaEDAH4+4It1CbA
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
|       rsa-sha2-512
|       rsa-sha2-256
|       ssh-rsa
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

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 09:44:10 2022 -- 1 IP address (1 host up) scanned in 13.71 seconds

```
