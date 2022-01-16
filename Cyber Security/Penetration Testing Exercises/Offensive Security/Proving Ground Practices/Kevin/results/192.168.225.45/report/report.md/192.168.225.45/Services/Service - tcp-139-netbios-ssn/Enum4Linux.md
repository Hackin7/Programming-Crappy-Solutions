```bash
enum4linux -a -M -l -d 192.168.225.45 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp139/enum4linux.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp139/enum4linux.txt):

```
Starting enum4linux v0.8.9 ( http://labs.portcullis.co.uk/application/enum4linux/ ) on Sun Jan 16 08:11:03 2022

 ==========================
|    Target Information    |
 ==========================
Target ........... 192.168.225.45
RID Range ........ 500-550,1000-1050
Username ......... ''
Password ......... ''
Known Usernames .. administrator, guest, krbtgt, domain admins, root, bin, none


 ======================================================
|    Enumerating Workgroup/Domain on 192.168.225.45    |
 ======================================================
[+] Got domain/workgroup name: WORKGROUP

 ==============================================
|    Nbtstat Information for 192.168.225.45    |
 ==============================================
Looking up status of 192.168.225.45
	KEVIN           <00> -         B <ACTIVE>  Workstation Service
	WORKGROUP       <00> - <GROUP> B <ACTIVE>  Domain/Workgroup Name
	KEVIN           <20> -         B <ACTIVE>  File Server Service
	WORKGROUP       <1e> - <GROUP> B <ACTIVE>  Browser Service Elections
	WORKGROUP       <1d> -         B <ACTIVE>  Master Browser
	..__MSBROWSE__. <01> - <GROUP> B <ACTIVE>  Master Browser

	MAC Address = 00-50-56-BF-40-6D

 =======================================
|    Session Check on 192.168.225.45    |
 =======================================
[+] Server 192.168.225.45 allows sessions using username '', password ''

 =======================================================
|    Getting information via LDAP for 192.168.225.45    |
 =======================================================
[E] Connection error

 =============================================
|    Getting domain SID for 192.168.225.45    |
 =============================================
Could not initialise lsarpc. Error was NT_STATUS_ACCESS_DENIED
[+] Can't determine if host is part of domain or part of a workgroup

 ========================================
|    OS information on 192.168.225.45    |
 ========================================
Use of uninitialized value $os_info in concatenation (.) or string at ./enum4linux.pl line 464.
[+] Got OS info for 192.168.225.45 from smbclient:
[+] Got OS info for 192.168.225.45 from srvinfo:
Could not initialise srvsvc. Error was NT_STATUS_ACCESS_DENIED

 ===============================
|    Users on 192.168.225.45    |
 ===============================
[E] Couldn't find users using querydispinfo: NT_STATUS_ACCESS_DENIED

[E] Couldn't find users using enumdomusers: NT_STATUS_ACCESS_DENIED

 =============================================
|    Machine Enumeration on 192.168.225.45    |
 =============================================
[E] Internal error.  Not implmented in this version of enum4linux.

 ===========================================
|    Share Enumeration on 192.168.225.45    |
 ===========================================
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
do_connect: Connection to 192.168.225.45 failed (Error NT_STATUS_RESOURCE_NAME_NOT_FOUND)

	Sharename       Type      Comment
	---------       ----      -------
Reconnecting with SMB1 for workgroup listing.
Unable to connect with SMB1 -- no workgroup available

[+] Attempting to map shares on 192.168.225.45

 ======================================================
|    Password Policy Information for 192.168.225.45    |
 ======================================================
[E] Unexpected error from polenum:


[+] Attaching to 192.168.225.45 using a NULL share

[+] Trying protocol 139/SMB...

	[!] Protocol failed: Cannot request session (Called Name:192.168.225.45)

[+] Trying protocol 445/SMB...

	[!] Protocol failed: SMB SessionError: STATUS_ACCESS_DENIED({Access Denied} A process has requested access to an object but has not been granted those access rights.)


[E] Failed to get password policy with rpcclient


 ================================
|    Groups on 192.168.225.45    |
 ================================

[+] Getting builtin groups:

[+] Getting builtin group memberships:

[+] Getting local groups:

[+] Getting local group memberships:

[+] Getting domain groups:

[+] Getting domain group memberships:

 =========================================================================
|    Users on 192.168.225.45 via RID cycling (RIDS: 500-550,1000-1050)    |
 =========================================================================
[E] Couldn't get SID: NT_STATUS_ACCESS_DENIED.  RID cycling not possible.

 ===============================================
|    Getting printer info for 192.168.225.45    |
 ===============================================
Could not initialise spoolss. Error was NT_STATUS_ACCESS_DENIED


enum4linux complete on Sun Jan 16 08:11:42 2022



```