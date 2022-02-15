```bash
enum4linux -a -M -l -d 192.168.58.70 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp139/enum4linux.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp139/enum4linux.txt):

```
Starting enum4linux v0.8.9 ( http://labs.portcullis.co.uk/application/enum4linux/ ) on Wed Jan 19 18:46:12 2022

 ==========================
|    Target Information    |
 ==========================
Target ........... 192.168.58.70
RID Range ........ 500-550,1000-1050
Username ......... ''
Password ......... ''
Known Usernames .. administrator, guest, krbtgt, domain admins, root, bin, none


 =====================================================
|    Enumerating Workgroup/Domain on 192.168.58.70    |
 =====================================================
[E] Can't find workgroup/domain


 =============================================
|    Nbtstat Information for 192.168.58.70    |
 =============================================
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 437.
Looking up status of 192.168.58.70
No reply from 192.168.58.70

 ======================================
|    Session Check on 192.168.58.70    |
 ======================================
[E] Server doesn't allow session using username '', password ''.  Aborting remainder of tests.


```
