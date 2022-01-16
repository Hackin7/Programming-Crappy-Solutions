```bash
impacket-rpcdump -port 135 192.168.225.45
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp135/tcp_135_rpc_rpcdump.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp135/tcp_135_rpc_rpcdump.txt):

```
Impacket v0.9.25.dev1+20211027.123255.1dad8f7f - Copyright 2021 SecureAuth Corporation

[*] Retrieving endpoint list from 192.168.225.45
Protocol: [MS-RSP]: Remote Shutdown Protocol
Provider: wininit.exe
UUID    : D95AFE70-A6D5-4259-822E-2C84DA1DDB0D v1.0
Bindings:
          ncacn_ip_tcp:192.168.225.45[49152]
          ncalrpc:[WindowsShutdown]
          ncacn_np:\\KEVIN[\PIPE\InitShutdown]
          ncalrpc:[WMsgKRpc07DCF0]

Protocol: N/A
Provider: winlogon.exe
UUID    : 76F226C3-EC14-4325-8A99-6A46348418AF v1.0
Bindings:
          ncalrpc:[WindowsShutdown]
          ncacn_np:\\KEVIN[\PIPE\InitShutdown]
          ncalrpc:[WMsgKRpc07DCF0]
          ncalrpc:[WMsgKRpc080D51]

Protocol: N/A
Provider: sysntfy.dll
UUID    : C9AC6DB5-82B7-4E55-AE8A-E464ED7B4277 v1.0 Impl friendly name
Bindings:
          ncalrpc:[LRPC-ce82754360e537c00e]
          ncacn_np:\\KEVIN[\PIPE\srvsvc]
          ncacn_ip_tcp:192.168.225.45[49154]
          ncacn_np:\\KEVIN[\PIPE\atsvc]
          ncalrpc:[senssvc]
          ncalrpc:[OLE4BF2A5AFFFF24D95B3BA80DFF26C]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]
          ncalrpc:[senssvc]
          ncalrpc:[OLE4BF2A5AFFFF24D95B3BA80DFF26C]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]

Protocol: N/A
Provider: winlogon.exe
UUID    : 12E65DD8-887F-41EF-91BF-8D816C42C2E7 v1.0 Secure Desktop LRPC interface
Bindings:
          ncalrpc:[WMsgKRpc080D51]

Protocol: N/A
Provider: wscsvc.dll
UUID    : 06BBA54A-BE05-49F9-B0A0-30F790261023 v1.0 Security Center
Bindings:
          ncalrpc:[OLE61DD2A31A8B1469BA60666B5EA39]
          ncalrpc:[dhcpcsvc6]
          ncalrpc:[dhcpcsvc]
          ncalrpc:[Audiosrv]
          ncalrpc:[AudioClientRpc]
          ncacn_ip_tcp:192.168.225.45[49153]
          ncacn_np:\\KEVIN[\pipe\eventlog]
          ncalrpc:[eventlog]

Protocol: N/A
Provider: dhcpcsvc6.dll
UUID    : 3C4728C5-F0AB-448B-BDA1-6CE01EB0A6D6 v1.0 DHCPv6 Client LRPC Endpoint
Bindings:
          ncalrpc:[dhcpcsvc6]
          ncalrpc:[dhcpcsvc]
          ncalrpc:[Audiosrv]
          ncalrpc:[AudioClientRpc]
          ncacn_ip_tcp:192.168.225.45[49153]
          ncacn_np:\\KEVIN[\pipe\eventlog]
          ncalrpc:[eventlog]

Protocol: N/A
Provider: dhcpcsvc.dll
UUID    : 3C4728C5-F0AB-448B-BDA1-6CE01EB0A6D5 v1.0 DHCP Client LRPC Endpoint
Bindings:
          ncalrpc:[dhcpcsvc]
          ncalrpc:[Audiosrv]
          ncalrpc:[AudioClientRpc]
          ncacn_ip_tcp:192.168.225.45[49153]
          ncacn_np:\\KEVIN[\pipe\eventlog]
          ncalrpc:[eventlog]

Protocol: N/A
Provider: nrpsrv.dll
UUID    : 30ADC50C-5CBC-46CE-9A0E-91914789E23C v1.0 NRP server endpoint
Bindings:
          ncalrpc:[Audiosrv]
          ncalrpc:[AudioClientRpc]
          ncacn_ip_tcp:192.168.225.45[49153]
          ncacn_np:\\KEVIN[\pipe\eventlog]
          ncalrpc:[eventlog]

Protocol: [MS-EVEN6]: EventLog Remoting Protocol
Provider: wevtsvc.dll
UUID    : F6BEAFF7-1E19-4FBB-9F8F-B89E2018337C v1.0 Event log TCPIP
Bindings:
          ncacn_ip_tcp:192.168.225.45[49153]
          ncacn_np:\\KEVIN[\pipe\eventlog]
          ncalrpc:[eventlog]

Protocol: N/A
Provider: certprop.dll
UUID    : 30B044A5-A225-43F0-B3A4-E060DF91F9C1 v1.0
Bindings:
          ncacn_np:\\KEVIN[\PIPE\srvsvc]
          ncacn_ip_tcp:192.168.225.45[49154]
          ncacn_np:\\KEVIN[\PIPE\atsvc]
          ncalrpc:[senssvc]
          ncalrpc:[OLE4BF2A5AFFFF24D95B3BA80DFF26C]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]

Protocol: N/A
Provider: srvsvc.dll
UUID    : 98716D03-89AC-44C7-BB8C-285824E51C4A v1.0 XactSrv service
Bindings:
          ncacn_ip_tcp:192.168.225.45[49154]
          ncacn_np:\\KEVIN[\PIPE\atsvc]
          ncalrpc:[senssvc]
          ncalrpc:[OLE4BF2A5AFFFF24D95B3BA80DFF26C]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]

Protocol: N/A
Provider: iphlpsvc.dll
UUID    : 552D076A-CB29-4E44-8B6A-D15E59E2C0AF v1.0 IP Transition Configuration endpoint
Bindings:
          ncacn_ip_tcp:192.168.225.45[49154]
          ncacn_np:\\KEVIN[\PIPE\atsvc]
          ncalrpc:[senssvc]
          ncalrpc:[OLE4BF2A5AFFFF24D95B3BA80DFF26C]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]

Protocol: N/A
Provider: IKEEXT.DLL
UUID    : A398E520-D59A-4BDD-AA7A-3C1E0303A511 v1.0 IKE/Authip API
Bindings:
          ncacn_ip_tcp:192.168.225.45[49154]
          ncacn_np:\\KEVIN[\PIPE\atsvc]
          ncalrpc:[senssvc]
          ncalrpc:[OLE4BF2A5AFFFF24D95B3BA80DFF26C]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]

Protocol: [MS-TSCH]: Task Scheduler Service Remoting Protocol
Provider: schedsvc.dll
UUID    : 86D35949-83C9-4044-B424-DB363231FD0C v1.0
Bindings:
          ncacn_ip_tcp:192.168.225.45[49154]
          ncacn_np:\\KEVIN[\PIPE\atsvc]
          ncalrpc:[senssvc]
          ncalrpc:[OLE4BF2A5AFFFF24D95B3BA80DFF26C]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]

Protocol: [MS-TSCH]: Task Scheduler Service Remoting Protocol
Provider: taskcomp.dll
UUID    : 378E52B0-C0A9-11CF-822D-00AA0051E40F v1.0
Bindings:
          ncacn_np:\\KEVIN[\PIPE\atsvc]
          ncalrpc:[senssvc]
          ncalrpc:[OLE4BF2A5AFFFF24D95B3BA80DFF26C]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]

Protocol: [MS-TSCH]: Task Scheduler Service Remoting Protocol
Provider: taskcomp.dll
UUID    : 1FF70682-0A51-30E8-076D-740BE8CEE98B v1.0
Bindings:
          ncacn_np:\\KEVIN[\PIPE\atsvc]
          ncalrpc:[senssvc]
          ncalrpc:[OLE4BF2A5AFFFF24D95B3BA80DFF26C]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]

Protocol: N/A
Provider: schedsvc.dll
UUID    : 0A74EF1C-41A4-4E06-83AE-DC74FB1CDD53 v1.0
Bindings:
          ncalrpc:[senssvc]
          ncalrpc:[OLE4BF2A5AFFFF24D95B3BA80DFF26C]
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]

Protocol: N/A
Provider: gpsvc.dll
UUID    : 2EB08E3E-639F-4FBA-97B1-14F878961076 v1.0
Bindings:
          ncalrpc:[IUserProfile2]
          ncalrpc:[LRPC-b64f0fd99f8f02d26a]

Protocol: N/A
Provider: N/A
UUID    : 3473DD4D-2E88-4006-9CBA-22570909DD10 v5.1 WinHttp Auto-Proxy Service
Bindings:
          ncalrpc:[LRPC-1aeb908c9f4a61c0f3]
          ncalrpc:[OLE5F4D6730B501403E99F5E449FD31]

Protocol: N/A
Provider: nsisvc.dll
UUID    : 7EA70BCF-48AF-4F6A-8968-6A440754D5FA v1.0 NSI server endpoint
Bindings:
          ncalrpc:[LRPC-1aeb908c9f4a61c0f3]
          ncalrpc:[OLE5F4D6730B501403E99F5E449FD31]

Protocol: N/A
Provider: spoolsv.exe
UUID    : 4A452661-8290-4B36-8FBE-7F4093A94978 v1.0 Spooler function endpoint
Bindings:
          ncalrpc:[spoolss]

Protocol: [MS-PAN]: Print System Asynchronous Notification Protocol
Provider: spoolsv.exe
UUID    : AE33069B-A2A8-46EE-A235-DDFD339BE281 v1.0 Spooler base remote object endpoint
Bindings:
          ncalrpc:[spoolss]

Protocol: [MS-PAN]: Print System Asynchronous Notification Protocol
Provider: spoolsv.exe
UUID    : 0B6EDBFA-4A24-4FC6-8A23-942B1ECA65D1 v1.0 Spooler function endpoint
Bindings:
          ncalrpc:[spoolss]

Protocol: N/A
Provider: MPSSVC.dll
UUID    : 2FB92682-6599-42DC-AE13-BD2CA89BD11C v1.0 Fw APIs
Bindings:
          ncalrpc:[LRPC-6badb060d6d3ebf0d6]

Protocol: N/A
Provider: MPSSVC.dll
UUID    : 7F9D11BF-7FB9-436B-A812-B2D50C5D4C03 v1.0 Fw APIs
Bindings:
          ncalrpc:[LRPC-6badb060d6d3ebf0d6]

Protocol: N/A
Provider: BFE.DLL
UUID    : DD490425-5325-4565-B774-7E27D6C09C24 v1.0 Base Firewall Engine API
Bindings:
          ncalrpc:[LRPC-6badb060d6d3ebf0d6]

Protocol: [MS-SCMR]: Service Control Manager Remote Protocol
Provider: services.exe
UUID    : 367ABB81-9844-35F1-AD32-98F038001003 v2.0
Bindings:
          ncacn_ip_tcp:192.168.225.45[49155]

Protocol: [MS-CMPO]: MSDTC Connection Manager:
Provider: msdtcprx.dll
UUID    : 906B0CE0-C70B-1067-B317-00DD010662DA v1.0
Bindings:
          ncalrpc:[LRPC-29265a54261bd49747]
          ncalrpc:[OLE0317DFB8AEDB4F3AA6928C675B50]
          ncalrpc:[LRPC-acda0e830a73d32e87]
          ncalrpc:[LRPC-acda0e830a73d32e87]
          ncalrpc:[LRPC-acda0e830a73d32e87]
          ncalrpc:[LRPC-acda0e830a73d32e87]

Protocol: [MS-RPRN]: Print System Remote Protocol
Provider: spoolsv.exe
UUID    : 12345678-1234-ABCD-EF00-0123456789AB v1.0 IPSec Policy agent endpoint
Bindings:
          ncalrpc:[LRPC-0400bf0fc25b588943]
          ncacn_ip_tcp:192.168.225.45[49156]

Protocol: [MS-FASP]: Firewall and Advanced Security Protocol
Provider: FwRemoteSvr.dll
UUID    : 6B5BDD1E-528C-422C-AF8C-A4079BE4FE48 v1.0 Remote Fw APIs
Bindings:
          ncacn_ip_tcp:192.168.225.45[49156]

Protocol: [MS-SAMR]: Security Account Manager (SAM) Remote Protocol
Provider: samsrv.dll
UUID    : 12345778-1234-ABCD-EF00-0123456789AC v1.0
Bindings:
          ncacn_ip_tcp:192.168.225.45[49159]
          ncalrpc:[efslrpc]
          ncacn_np:\\KEVIN[\pipe\efsrpc]
          ncalrpc:[samss lpc]
          ncacn_np:\\KEVIN[\PIPE\protected_storage]
          ncalrpc:[protected_storage]
          ncalrpc:[lsasspirpc]
          ncalrpc:[lsapolicylookup]
          ncalrpc:[LSARPC_ENDPOINT]
          ncalrpc:[securityevent]
          ncalrpc:[audit]
          ncalrpc:[LRPC-15d5dc960b3f5f5c2e]
          ncacn_np:\\KEVIN[\pipe\lsass]

Protocol: N/A
Provider: keyiso.dll
UUID    : B25A52BF-E5DD-4F4A-AEA6-8CA7272A0E86 v1.0 KeyIso
Bindings:
          ncalrpc:[efslrpc]
          ncacn_np:\\KEVIN[\pipe\efsrpc]
          ncalrpc:[samss lpc]
          ncacn_np:\\KEVIN[\PIPE\protected_storage]
          ncalrpc:[protected_storage]
          ncalrpc:[lsasspirpc]
          ncalrpc:[lsapolicylookup]
          ncalrpc:[LSARPC_ENDPOINT]
          ncalrpc:[securityevent]
          ncalrpc:[audit]
          ncalrpc:[LRPC-15d5dc960b3f5f5c2e]
          ncacn_np:\\KEVIN[\pipe\lsass]

Protocol: N/A
Provider: sysmain.dll
UUID    : B58AA02E-2884-4E97-8176-4EE06D794184 v1.0
Bindings:
          ncalrpc:[TSUMRPD_PRINT_DRV_LPC_API]
          ncalrpc:[RemoteDevicesLPC_API]
          ncalrpc:[trkwks]
          ncacn_np:\\KEVIN[\pipe\trkwks]
          ncalrpc:[OLE116E71AC127546559A1A191ABD68]

[*] Received 150 endpoints.


```
