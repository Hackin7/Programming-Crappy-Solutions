# AndItsGone
500, Forensics, 9 Solves as of solving

## Description
I could have sworn the original flag used to be in my usb drive. Now it's just some encrypted nonsense. Can you help me recover it?

## Given
usb.tar.gz (Not here because too big for github)

# Solution
Doing some searching of .enc file for CTF, I get 
1. https://medium.com/@admin./ctf-challenge-n3ph4ck-writeup-b355f512977b
2. https://0xrick.github.io/hack-the-box/hawk/#FTP
3. https://myexperiments.io/finding-cipher-algorithm-encrypted-file.html

Conducting file analysis: 
```
$ binwalk flag.enc 

DECIMAL       HEXADECIMAL     DESCRIPTION
--------------------------------------------------------------------------------
57548         0xE0CC          StuffIt Deluxe Segment (data): fDw40u4l18RSo4fLTIkRKasdCQMnaYYeBCbpyPq
141474        0x228A2         StuffIt Deluxe Segment (data): f8sj4BvXiwbNrsbKHPxbFXr12+Hh
153326        0x256EE         Motorola S-Record; binary data in text format, record type: start address (24-bit)
198968        0x30938         StuffIt Deluxe Segment (data): f0xAEHvb8Rxqmu2mQAt5P1AvUVeGXRqBzugrXMaANFDFz+TxXC8yTp3KJt1
202870        0x31876         StuffIt Deluxe Segment (data): f/wXbgKNrUAGgTvzCmfa3vGKjWkxellBTU3M9khcOdVS9awR7SaZr/M2K
253635        0x3DEC3         StuffIt Deluxe Segment (data): fnWko66XLWLOQrzgBxpRpW37gUsUzTjlhB0B+/qJpo1sK5fqsvIT5gHez
734356        0xB3494         StuffIt Deluxe Segment (data): fAW4RMI5fm9

$ file flag.enc 
flag.enc: openssl enc'd data with salted password, base64 encoded
$ wc -c flag_decoded.enc
714608 flag_decoded.enc
```

Decoding the base64 and some tool installation
```
$ base64 -d flag.enc > flag_decoded.enc
$ sudo apt install bruteforce-salted-openssl
```

Guessing the cipher and using the rockyou.txt wordlist, 
```
$ bruteforce-salted-openssl -t 50 -f /tmp/rockyou.txt -d sha256 flag_decoded.enc -1
Warning: using dictionary mode, ignoring options -b, -e, -l, -m and -s.

Tried passwords: 14344390
Tried passwords per second: 494634.137931
Last tried password: *7¡Vamos!

Password not found.
The file might have been encrypted with a different cipher or/and a
different digest (e.g. OpenSSL 1.0.x uses the MD5 digest by default
but OpenSSL 1.1.x uses SHA256 by default).
-aes-256-cbc 
```

## foremost
A tool to recover lost items
```
$ foremost usb.img
Processing: usb.img
|**|
```

This gets you a pdf file.  But its corrupted so.

## extundelete
```
$ extundelete ../usb.img --restore-all
NOTICE: Extended attributes are not restored.
Loading filesystem metadata ... 16 groups loaded.
Loading journal descriptors ... 38 descriptors loaded.
Searching for recoverable inodes in directory / ... 
1 recoverable inodes found.
Looking through the directory structure for deleted files ... 
0 recoverable inodes still lost.
```

Go to `RECOVERED_FILES` and open the pdf file

# Flag
`CTFSG{WHY_D3CRYPT_JU5T_R35T0R3}`
