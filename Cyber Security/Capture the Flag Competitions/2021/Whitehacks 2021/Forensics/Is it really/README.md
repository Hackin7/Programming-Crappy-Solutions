$ file signup.pdf
signup.pdf: PDF document, version 1.3
hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Forensics/Is it really?$ binwalk signup.pdf

DECIMAL       HEXADECIMAL     DESCRIPTION
--------------------------------------------------------------------------------
0             0x0             PDF document, version: "1.3"
69            0x45            Zip archive data, at least v2.0 to extract, uncompressed size: 68, name: eicar.txt
226           0xE2            Zip archive data, at least v2.0 to extract, uncompressed size: 332, name: __MACOSX/._eicar.txt
687           0x2AF           End of Zip archive, footer length: 22
443555        0x6C4A3         End of Zip archive, footer length: 22

hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Forensics/Is it really?$ binwalk signup.pdf -e

DECIMAL       HEXADECIMAL     DESCRIPTION
--------------------------------------------------------------------------------
0             0x0             PDF document, version: "1.3"

WARNING: Extractor.execute failed to run external extractor 'jar xvf '%e'': [Errno 2] No such file or directory: 'jar', 'jar xvf '%e'' might not be installed correctly
69            0x45            Zip archive data, at least v2.0 to extract, uncompressed size: 68, name: eicar.txt
226           0xE2            Zip archive data, at least v2.0 to extract, uncompressed size: 332, name: __MACOSX/._eicar.txt
687           0x2AF           End of Zip archive, footer length: 22
443555        0x6C4A3         End of Zip archive, footer length: 22

hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Forensics/Is it really?$ ls
signup.pdf  _signup.pdf.extracted
hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Forensics/Is it really?$ cd signup.pdf
-bash: cd: signup.pdf: Not a directory
hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Forensics/Is it really?$ cd signup.e
-bash: cd: signup.e: No such file or directory
hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Forensics/Is it really?$ binwalk signup.pdf -e

DECIMAL       HEXADECIMAL     DESCRIPTION
--------------------------------------------------------------------------------
0             0x0             PDF document, version: "1.3"

WARNING: Extractor.execute failed to run external extractor 'jar xvf '%e'': [Errno 2] No such file or directory: 'jar', 'jar xvf '%e'' might not be installed correctly
69            0x45            Zip archive data, at least v2.0 to extract, uncompressed size: 68, name: eicar.txt
226           0xE2            Zip archive data, at least v2.0 to extract, uncompressed size: 332, name: __MACOSX/._eicar.txt
687           0x2AF           End of Zip archive, footer length: 22
443555        0x6C4A3         End of Zip archive, footer length: 22

$ cat eicar.txt
X5O!P%@AP[4\PZX54(P^)7CC)7}$EICAR-STANDARD-ANTIVIRUS-TEST-FILE!$H+H*hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Forensics/Is it really?/_signup.pdf.extracted$ unzip 45.zip
Archive:  45.zip
warning [45.zip]:  138 extra bytes at beginning or within zipfile
  (attempting to process anyway)
file #1:  bad zipfile offset (local header sig):  207
  (attempting to re-compensate)
file #1:  bad zipfile offset (local header sig):  207
file #2:  bad zipfile offset (local header sig):  226
  (attempting to re-compensate)
file #2:  bad zipfile offset (local header sig):  226

$ exiftool -a -u -g2 signup.pdf
---- ExifTool ----
ExifTool Version Number         : 11.99
---- Other ----
File Name                       : signup.pdf
Directory                       : .
File Size                       : 434 kB
File Permissions                : rwxrwxrwx
File Type                       : PDF
File Type Extension             : pdf
MIME Type                       : application/pdf
---- Time ----
File Modification Date/Time     : 2021:03:07 11:31:17+08:00
File Access Date/Time           : 2021:03:07 11:31:17+08:00
File Inode Change Date/Time     : 2021:03:07 11:31:47+08:00
---- Document ----
PDF Version                     : 1.3
Linearized                      : No
Page Count                      : 1
Producer                        : macOS Version 11.2.1 (Build 20D74) Quartz PDFContext
Creator                         : Preview