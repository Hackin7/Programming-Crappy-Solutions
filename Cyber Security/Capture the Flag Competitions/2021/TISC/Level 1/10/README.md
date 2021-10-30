# Challenge Name

### Description

## Solution


0D97DBDBA2D35C37F434538E4DFAA06FCCC18A13

`0d97dbdba2d35c37f434538e4dfaa06fccc18a13`


I tried mounting the disk image in a Kali VM and then searching for the file from there
```
$ find /media/kali/FC60C37760C336E4/ -type f -exec sha1sum {} \; | grep 0d97dbdba2d35c37f434538e4dfaa06fccc18a13
...
0d97dbdba2d35c37f434538e4dfaa06fccc18a13  /media/kali/FC60C37760C336E4/Users/adam/AppData/Roaming/Microsoft/Windows/Recent/otter-singapore.lnk
...
```

However, the flag `TISC{otter-singapore.lnk}` didn't work.


```
┌──(kali㉿kali)-[/tmp]
└─$ sha1sum t               
3ee88a74d3722b336a69c428d226f731435c71ba  t
                                                                                                                                                                       
┌──(kali㉿kali)-[/tmp]
└─$ openssl sha1 t         
SHA1(t)= 3ee88a74d3722b336a69c428d226f731435c71ba
```

Get-ChildItem _"C:\"_ -Recurse | Get-FileHash | 
Where-Object hash -eq (Get-FileHash _search_file_).hash | Select path

```
PS C:\Users\adam\AppData\Roaming\Microsoft\Windows\Recent> certutil -hashfile otter-singapore.lnk sha1
SHA1 hash of otter-singapore.lnk:
0d97dbdba2d35c37f434538e4dfaa06fccc18a13
CertUtil: -hashfile command completed successfully.
```

Opening the file reveals that it is actually a link to `C:\Users\adam\Downloads\otter-singapore.jpg`. Trying this file gives the correct flag.


## Flag

`TISC{otter-singapore.jpg}`
