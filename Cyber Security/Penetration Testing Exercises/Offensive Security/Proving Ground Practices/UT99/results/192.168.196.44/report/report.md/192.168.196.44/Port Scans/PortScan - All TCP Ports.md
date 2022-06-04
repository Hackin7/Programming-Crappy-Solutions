```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/xml/_full_tcp_nmap.xml" 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_full_tcp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_full_tcp_nmap.txt):

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