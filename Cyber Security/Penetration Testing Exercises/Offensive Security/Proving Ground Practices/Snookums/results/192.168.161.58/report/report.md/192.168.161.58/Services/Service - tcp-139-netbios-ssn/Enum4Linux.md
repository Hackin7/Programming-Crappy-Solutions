```bash
enum4linux -a -M -l -d 192.168.161.58 2>&1
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp139/enum4linux.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp139/enum4linux.txt):

```
Starting enum4linux v0.8.9 ( http://labs.portcullis.co.uk/application/enum4linux/ ) on Sun Feb 13 06:17:29 2022

 ==========================
|    Target Information    |
 ==========================
Target ........... 192.168.161.58
RID Range ........ 500-550,1000-1050
Username ......... ''
Password ......... ''
Known Usernames .. administrator, guest, krbtgt, domain admins, root, bin, none


 ======================================================
|    Enumerating Workgroup/Domain on 192.168.161.58    |
 ======================================================
[E] Can't find workgroup/domain


 ==============================================
|    Nbtstat Information for 192.168.161.58    |
 ==============================================
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 437.
Looking up status of 192.168.161.58
No reply from 192.168.161.58

 =======================================
|    Session Check on 192.168.161.58    |
 =======================================
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 451.
[+] Server 192.168.161.58 allows sessions using username '', password ''
[+] Got domain/workgroup name:

 =======================================================
|    Getting information via LDAP for 192.168.161.58    |
 =======================================================
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 359.
[E] Connection error

 =============================================
|    Getting domain SID for 192.168.161.58    |
 =============================================
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 458.
Domain Name: SAMBA
Domain Sid: (NULL SID)
[+] Can't determine if host is part of domain or part of a workgroup

 ========================================
|    OS information on 192.168.161.58    |
 ========================================
Use of uninitialized value $os_info in concatenation (.) or string at ./enum4linux.pl line 464.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 467.
[+] Got OS info for 192.168.161.58 from smbclient:
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 866.
[+] Got OS info for 192.168.161.58 from srvinfo:
	SNOOKUMS       Wk Sv PrQ Unx NT SNT Samba 4.10.4
	platform_id     :	500
	os version      :	6.1
	server type     :	0x809a03

 ===============================
|    Users on 192.168.161.58    |
 ===============================
Use of uninitialized value $users in print at ./enum4linux.pl line 874.
Use of uninitialized value $users in pattern match (m//) at ./enum4linux.pl line 877.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 881.

Use of uninitialized value $users in print at ./enum4linux.pl line 888.
Use of uninitialized value $users in pattern match (m//) at ./enum4linux.pl line 890.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 640.

 =============================================
|    Machine Enumeration on 192.168.161.58    |
 =============================================
[E] Internal error.  Not implmented in this version of enum4linux.

 ===========================================
|    Share Enumeration on 192.168.161.58    |
 ===========================================
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 654.
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated

	Sharename       Type      Comment
	---------       ----      -------
	print$          Disk      Printer Drivers
	IPC$            IPC       IPC Service (Samba 4.10.4)
Reconnecting with SMB1 for workgroup listing.

	Server               Comment
	---------            -------
	SNOOKUMS             Samba 4.10.4

	Workgroup            Master
	---------            -------
	SAMBA

[+] Attempting to map shares on 192.168.161.58
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 654.
//192.168.161.58/print$	Mapping: DENIED, Listing: N/A
//192.168.161.58/IPC$	[E] Can't understand response:
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
NT_STATUS_OBJECT_NAME_NOT_FOUND listing \*

 ======================================================
|    Password Policy Information for 192.168.161.58    |
 ======================================================
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 501.


[+] Attaching to 192.168.161.58 using a NULL share

[+] Trying protocol 139/SMB...

[+] Found domain(s):

	[+] SNOOKUMS
	[+] Builtin

[+] Password Info for Domain: SNOOKUMS

	[+] Minimum password length: 5
	[+] Password history length: None
	[+] Maximum password age: 37 days 6 hours 21 minutes
	[+] Password Complexity Flags: 000000

		[+] Domain Refuse Password Change: 0
		[+] Domain Password Store Cleartext: 0
		[+] Domain Password Lockout Admins: 0
		[+] Domain Password No Clear Change: 0
		[+] Domain Password No Anon Change: 0
		[+] Domain Password Complex: 0

	[+] Minimum password age: None
	[+] Reset Account Lockout Counter: 30 minutes
	[+] Locked Account Duration: 30 minutes
	[+] Account Lockout Threshold: None
	[+] Forced Log off Time: 37 days 6 hours 21 minutes

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 542.

[+] Retieved partial password policy with rpcclient:

Password Complexity: Disabled
Minimum Password Length: 5


 ================================
|    Groups on 192.168.161.58    |
 ================================

[+] Getting builtin groups:
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 542.

[+] Getting builtin group memberships:

[+] Getting local groups:
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 593.

[+] Getting local group memberships:

[+] Getting domain groups:
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.

[+] Getting domain group memberships:

 =========================================================================
|    Users on 192.168.161.58 via RID cycling (RIDS: 500-550,1000-1050)    |
 =========================================================================
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
[I] Found new SID: S-1-22-1
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 742.
[I] Found new SID: S-1-5-21-1827434953-4144285930-3050528427
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
[I] Found new SID: S-1-5-32
[+] Enumerating users using SID S-1-5-32 and logon username '', password ''
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-500 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-501 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-502 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-503 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-504 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-505 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-506 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-507 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-508 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-509 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-510 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-511 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-512 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-513 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-514 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-515 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-516 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-517 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-518 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-519 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-520 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-521 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-522 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-523 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-524 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-525 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-526 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-527 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-528 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-529 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-530 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-531 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-532 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-533 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-534 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-535 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-536 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-537 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-538 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-539 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-540 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-541 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-542 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-543 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 909.
S-1-5-32-544 BUILTIN\Administrators (Local Group)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
[E] No info found

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 909.
S-1-5-32-545 BUILTIN\Users (Local Group)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
[E] No info found

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 909.
S-1-5-32-546 BUILTIN\Guests (Local Group)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
[E] No info found

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 909.
S-1-5-32-547 BUILTIN\Power Users (Local Group)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
[E] No info found

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 909.
S-1-5-32-548 BUILTIN\Account Operators (Local Group)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
[E] No info found

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 909.
S-1-5-32-549 BUILTIN\Server Operators (Local Group)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
[E] No info found

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 909.
S-1-5-32-550 BUILTIN\Print Operators (Local Group)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
[E] No info found

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1000 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1001 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1002 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1003 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1004 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1005 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1006 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1007 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1008 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1009 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1010 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1011 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1012 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1013 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1014 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1015 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1016 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1017 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1018 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1019 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1020 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1021 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1022 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1023 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1024 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1025 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1026 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1027 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1028 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1029 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1030 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1031 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1032 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1033 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1034 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1035 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1036 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1037 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1038 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1039 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1040 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1041 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1042 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1043 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1044 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1045 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1046 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1047 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1048 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1049 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-32-1050 *unknown*\*unknown* (8)
[+] Enumerating users using SID S-1-22-1 and logon username '', password ''
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 927.
S-1-22-1-1000 Unix User\michael (Local User)
Use of uninitialized value $user_info in pattern match (m//) at ./enum4linux.pl line 932.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
[+] Enumerating users using SID S-1-5-21-1827434953-4144285930-3050528427 and logon username '', password ''
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-500 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 927.
S-1-5-21-1827434953-4144285930-3050528427-501 SNOOKUMS\nobody (Local User)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
	User Name   :	nobody
	Full Name   :	Nobody
	Home Drive  :
	Dir Drive   :	(null)
	Profile Path:
	Logon Script:
	Description :
	Workstations:
	Comment     :
	Remote Dial :
	Logon Time               :	Wed, 31 Dec 1969 19:00:00 EST
	Logoff Time              :	Wed, 13 Sep 30828 22:48:05 EDT
	Kickoff Time             :	Wed, 13 Sep 30828 22:48:05 EDT
	Password last set Time   :	Wed, 31 Dec 1969 19:00:00 EST
	Password can change Time :	Wed, 31 Dec 1969 19:00:00 EST
	Password must change Time:	Wed, 31 Dec 1969 19:00:00 EST
	unknown_2[0..31]...
	user_rid :	0x1f5
	group_rid:	0x201
	acb_info :	0x00000010
	fields_present:	0x00ffffff
	logon_divs:	168
	bad_password_count:	0x00000000
	logon_count:	0x00000000
	padding1[0..7]...
	logon_hrs[0..21]...
	Account Disabled         : False
	Password does not expire : False
	Account locked out       : False
	Password expired         : False
	Interdomain trust account: False
	Workstation trust account: False
	Server trust account     : False
	Trusted for delegation   : False

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-502 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-503 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-504 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-505 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-506 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-507 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-508 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-509 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-510 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-511 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-512 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 909.
S-1-5-21-1827434953-4144285930-3050528427-513 SNOOKUMS\None (Domain Group)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
	Group Name:	None
	Description:	Ordinary Users
	Group Attribute:7
	Num Members:0

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-514 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-515 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-516 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-517 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-518 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-519 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-520 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-521 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-522 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-523 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-524 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-525 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-526 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-527 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-528 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-529 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-530 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-531 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-532 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-533 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-534 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-535 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-536 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-537 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-538 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-539 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-540 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-541 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-542 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-543 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-544 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-545 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-546 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-547 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-548 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-549 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-550 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1000 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1001 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1002 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1003 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1004 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1005 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1006 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1007 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1008 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1009 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1010 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1011 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1012 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1013 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1014 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1015 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1016 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1017 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1018 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1019 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1020 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1021 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1022 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1023 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1024 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1025 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1026 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1027 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1028 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1029 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1030 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1031 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1032 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1033 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1034 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1035 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1036 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1037 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1038 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1039 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1040 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1041 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1042 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1043 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1044 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1045 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1046 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1047 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1048 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1827434953-4144285930-3050528427-1049 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 991.
S-1-5-21-1827434953-4144285930-3050528427-1050 *unknown*\*unknown* (8)

 ===============================================
|    Getting printer info for 192.168.161.58    |
 ===============================================
No printers returned.


enum4linux complete on Sun Feb 13 06:33:55 2022



```
