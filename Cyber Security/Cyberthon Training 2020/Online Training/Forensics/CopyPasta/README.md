# Copypasta
400, Forensics, 21 Solves so far

## Description
Now it's time to analyze a memory dump. Can you poke around and find the flag?

Download the memory dump here: dump

##Useful tools:
Volatility

# Solution
Looking up https://linoxide.com/linux-how-to/setup-volatility-memory-analysis/ and doing basic analysis on the memory dump.
```
$ /home/hacker/Tools/volatility/vol.py -f memdump.mem imageinfo
Volatility Foundation Volatility Framework 2.6.1
*** Failed to import volatility.plugins.malware.apihooks (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.malware.threads (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.mac.apihooks_kernel (ImportError: No module named distorm3)
*** Failed to import volatility.plugins.mac.check_syscall_shadow (ImportError: No module named distorm3)
*** Failed to import volatility.plugins.ssdt (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.mac.apihooks (ImportError: No module named distorm3)
INFO    : volatility.debug    : Determining profile based on KDBG search...
          Suggested Profile(s) : WinXPSP2x86, WinXPSP3x86 (Instantiated with WinXPSP2x86)
                     AS Layer1 : IA32PagedMemoryPae (Kernel AS)
                     AS Layer2 : FileAddressSpace (/home/hacker/Documents/memdump.mem)
                      PAE type : PAE
                           DTB : 0x311000L
                          KDBG : 0x80545ae0L
          Number of Processors : 1
     Image Type (Service Pack) : 3
                KPCR for CPU 0 : 0xffdff000L
             KUSER_SHARED_DATA : 0xffdf0000L
           Image date and time : 2019-05-19 09:25:33 UTC+0000
     Image local date and time : 2019-05-19 17:25:33 +0800
```

Basically, I just did trial and error with different volatility commands. You can get the list of volatility commands by running `vol.py -h`

```
$ /home/hacker/Tools/volatility/vol.py -f memdump.mem --profile=WinXPSP3x86 pslist
Volatility Foundation Volatility Framework 2.6.1
*** Failed to import volatility.plugins.malware.apihooks (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.malware.threads (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.mac.apihooks_kernel (ImportError: No module named distorm3)
*** Failed to import volatility.plugins.mac.check_syscall_shadow (ImportError: No module named distorm3)
*** Failed to import volatility.plugins.ssdt (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.mac.apihooks (ImportError: No module named distorm3)
Offset(V)  Name                    PID   PPID   Thds     Hnds   Sess  Wow64 Start                          Exit                          
---------- -------------------- ------ ------ ------ -------- ------ ------ ------------------------------ ------------------------------
0x898b6830 System                    4      0     55      257 ------      0                                                              
0x8977e328 smss.exe                416      4      3       19 ------      0 2019-05-19 09:19:30 UTC+0000                                 
0x8971d2c0 csrss.exe               472    416      9      359      0      0 2019-05-19 09:19:30 UTC+0000                                 
0x8977bda0 winlogon.exe            496    416     22      579      0      0 2019-05-19 09:19:30 UTC+0000                                 
0x8962d858 services.exe            540    496     17      329      0      0 2019-05-19 09:19:31 UTC+0000                                 
0x8962f950 lsass.exe               552    496     21      331      0      0 2019-05-19 09:19:31 UTC+0000                                 
0x8961ada0 svchost.exe             708    540     18      193      0      0 2019-05-19 09:19:31 UTC+0000                                 
0x896007c0 svchost.exe             764    540     10      243      0      0 2019-05-19 09:19:31 UTC+0000                                 
0x8955fda0 svchost.exe             800    540     90     1403      0      0 2019-05-19 09:19:32 UTC+0000                                 
0x89561398 svchost.exe             848    540      5       59      0      0 2019-05-19 09:19:32 UTC+0000                                 
0x8963d890 svchost.exe             908    540     16      201      0      0 2019-05-19 09:19:32 UTC+0000                                 
0x8951f398 explorer.exe           1140   1124     13      409      0      0 2019-05-19 09:19:34 UTC+0000                                 
0x89512860 spoolsv.exe            1232    540     13      123      0      0 2019-05-19 09:19:34 UTC+0000                                 
0x894c26a0 alg.exe                1812    540      6      107      0      0 2019-05-19 09:19:36 UTC+0000                                 
0x89504650 wscntfy.exe            2044    800      1       28      0      0 2019-05-19 09:19:37 UTC+0000                                 
0x89665510 mspaint.exe             400   1140      5       98      0      0 2019-05-19 09:19:51 UTC+0000                                 
0x897f6320 svchost.exe             440    540      8      134      0      0 2019-05-19 09:19:52 UTC+0000                                 
0x896f0488 notepad.exe             320   1140      1       29      0      0 2019-05-19 09:20:55 UTC+0000                                 
0x894cb608 wordpad.exe            1352   1140      4      111      0      0 2019-05-19 09:24:08 UTC+0000                                 
0x896e9da0 FTK Imager.exe         1608   1140      8      243      0      0 2019-05-19 09:25:10 UTC+0000       
$ /home/hacker/Tools/volatility/vol.py -f memdump.mem --profile=WinXPSP2x86 psxview
Volatility Foundation Volatility Framework 2.6.1
*** Failed to import volatility.plugins.malware.apihooks (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.malware.threads (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.mac.apihooks_kernel (ImportError: No module named distorm3)
*** Failed to import volatility.plugins.mac.check_syscall_shadow (ImportError: No module named distorm3)
*** Failed to import volatility.plugins.ssdt (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.mac.apihooks (ImportError: No module named distorm3)
Offset(P)  Name                    PID pslist psscan thrdproc pspcid csrss session deskthrd ExitTime
---------- -------------------- ------ ------ ------ -------- ------ ----- ------- -------- --------

0x0997bda0 winlogon.exe            496 True   True   True     True   True  True    True     
0x0981ada0 svchost.exe             708 True   True   True     True   True  True    True     
0x098007c0 svchost.exe             764 True   True   True     True   True  True    True     
0x098e9da0 FTK Imager.exe         1608 True   True   True     True   True  True    True     
0x096cb608 wordpad.exe            1352 True   True   True     True   True  True    True     
0x09712860 spoolsv.exe            1232 True   True   True     True   True  True    True     
0x0983d890 svchost.exe             908 True   True   True     True   True  True    True     
0x09865510 mspaint.exe             400 True   True   True     True   True  True    True     
0x0982f950 lsass.exe               552 True   True   True     True   True  True    True     
0x09761398 svchost.exe             848 True   True   True     True   True  True    True     
0x0971f398 explorer.exe           1140 True   True   True     True   True  True    True     
0x0975fda0 svchost.exe             800 True   True   True     True   True  True    True     
0x09704650 wscntfy.exe            2044 True   True   True     True   True  True    True     
0x0982d858 services.exe            540 True   True   True     True   True  True    True     
0x098f0488 notepad.exe             320 True   True   True     True   True  True    True     
0x096c26a0 alg.exe                1812 True   True   True     True   True  True    True     
0x099f6320 svchost.exe             440 True   True   True     True   True  True    True     
0x0991d2c0 csrss.exe               472 True   True   True     True   False True    True     
0x09ab6830 System                    4 True   True   True     True   False False   False    
0x0997e328 smss.exe                416 True   True   True     True   False False   False    
0x3d7a4608 wordpad.exe            1352 False  True   False    False  False False   False    
0x3d9ec860 spoolsv.exe            1232 False  True   False    False  False False   False    
0x3da86da0 FTK Imager.exe         1608 False  True   False    False  False False   False    
0x3ddbb2c0 csrss.exe               472 False  True   False    False  False False   False    
0x3dd79398 explorer.exe           1140 False  True   False    False  False False   False    
0x3dd54830 System                    4 False  True   False    False  False False   False    
0x3dbfb398 svchost.exe             848 False  True   False    False  False False   False    
0x3db18890 svchost.exe             908 False  True   False    False  False False   False    
0x3dc94320 svchost.exe             440 False  True   False    False  False False   False    
0x3db4d488 notepad.exe             320 False  True   False    False  False False   False    
0x3dbdb7c0 svchost.exe             764 False  True   False    False  False False   False    
0x3dfc0510 mspaint.exe             400 False  True   False    False  False False   False    
0x3d90a950 lsass.exe               552 False  True   False    False  False False   False    
0x3dbb5da0 svchost.exe             708 False  True   False    False  False False   False    
0x3da88858 services.exe            540 False  True   False    False  False False   False    
0x3d91e650 wscntfy.exe            2044 False  True   False    False  False False   False    
0x3df19da0 winlogon.exe            496 False  True   False    False  False False   False    
0x3ddb9da0 svchost.exe             800 False  True   False    False  False False   False    
0x3dadc328 smss.exe                416 False  True   False    False  False False   False    
0x3da9b6a0 alg.exe                1812 False  True   False    False  False False   False 

$ python /home/hacker/Tools/volatility/vol.py -f memdump.mem clipboard
Volatility Foundation Volatility Framework 2.6.1
*** Failed to import volatility.plugins.malware.apihooks (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.malware.threads (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.mac.apihooks_kernel (ImportError: No module named distorm3)
*** Failed to import volatility.plugins.mac.check_syscall_shadow (ImportError: No module named distorm3)
*** Failed to import volatility.plugins.ssdt (NameError: name 'distorm3' is not defined)
*** Failed to import volatility.plugins.mac.apihooks (ImportError: No module named distorm3)
Session    WindowStation Format                 Handle Object     Data                                              
---------- ------------- ------------------ ---------- ---------- --------------------------------------------------
         0 WinSta0       CF_UNICODETEXT       0x3d0111 0xe1663be0 CTFSG{Y0u_c4nt_h1de_fr0m_M3Mory}                  
         0 WinSta0       CF_LOCALE            0x5c00ff 0xe1123350                                                   
         0 WinSta0       CF_TEXT                   0x1 ----------                                                   
         0 WinSta0       CF_OEMTEXT                0x1 ----------                                                   
```

# Flag
`CTFSG{Y0u_c4nt_h1de_fr0m_M3Mory}`