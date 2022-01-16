```bash
nmap -vv --reason -Pn -T4 -sU -sV -p 137 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/udp137/udp_137_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/udp137/xml/udp_137_smb_nmap.xml" 192.168.225.45
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/udp137/udp_137_smb_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/udp137/udp_137_smb_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Jan 16 08:14:55 2022 as: nmap -vv --reason -Pn -T4 -sU -sV -p 137 "--script=banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/udp137/udp_137_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/udp137/xml/udp_137_smb_nmap.xml" 192.168.225.45
Nmap scan report for 192.168.225.45
Host is up, received user-set.
Scanned at 2022-01-16 08:14:56 EST for 2s

PORT    STATE SERVICE    REASON       VERSION
137/udp open  netbios-ns udp-response Microsoft Windows netbios-ns (workgroup: WORKGROUP)
Service Info: Host: KEVIN; OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
| nbstat: NetBIOS name: KEVIN, NetBIOS user: <unknown>, NetBIOS MAC: 00:50:56:bf:40:6d (VMware)
| Names:
|   KEVIN<00>            Flags: <unique><active>
|   WORKGROUP<00>        Flags: <group><active>
|   KEVIN<20>            Flags: <unique><active>
|   WORKGROUP<1e>        Flags: <group><active>
|   WORKGROUP<1d>        Flags: <unique><active>
|   \x01\x02__MSBROWSE__\x02<01>  Flags: <group><active>
| Statistics:
|   00 50 56 bf 40 6d 00 00 00 00 00 00 00 00 00 00 00
|   00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00
|_  00 00 00 00 00 00 00 00 00 00 00 00 00 00

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 08:14:58 2022 -- 1 IP address (1 host up) scanned in 4.04 seconds

```
