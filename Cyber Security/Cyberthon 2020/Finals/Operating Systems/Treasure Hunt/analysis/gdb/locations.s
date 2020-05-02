GNU gdb (Debian 8.3.1-1) 8.3.1
Copyright (C) 2019 Free Software Foundation, Inc.
License GPLv3+: GNU GPL version 3 or later <http://gnu.org/licenses/gpl.html>
This is free software: you are free to change and redistribute it.
There is NO WARRANTY, to the extent permitted by law.
Type "show copying" and "show warranty" for details.
This GDB was configured as "x86_64-linux-gnu".
Type "show configuration" for configuration details.
For bug reporting instructions, please see:
<http://www.gnu.org/software/gdb/bugs/>.
Find the GDB manual and other documentation resources online at:
    <http://www.gnu.org/software/gdb/documentation/>.

For help, type "help".
Type "apropos word" to search for commands related to "word"...
Reading symbols from /host/Documents/Stuff/Github/Programming Crappy Solutions/Cyber Security/Cyberthon 2020/Treasure Hunt/map...
(No debugging symbols found in /host/Documents/Stuff/Github/Programming Crappy Solutions/Cyber Security/Cyberthon 2020/Treasure Hunt/map)
(gdb) (gdb) Dump of assembler code for function locations:
   0x0000000000000c52 <+0>:	push   rbp
   0x0000000000000c53 <+1>:	mov    rbp,rsp
   0x0000000000000c56 <+4>:	sub    rsp,0x30
   0x0000000000000c5a <+8>:	movsd  QWORD PTR [rbp-0x28],xmm0
   0x0000000000000c5f <+13>:	movsd  QWORD PTR [rbp-0x30],xmm1
   0x0000000000000c64 <+18>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000c69 <+23>:	ucomisd xmm0,QWORD PTR [rip+0xfe7]        # 0x1c58
   0x0000000000000c71 <+31>:	jp     0xcc9 <locations+119>
   0x0000000000000c73 <+33>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000c78 <+38>:	ucomisd xmm0,QWORD PTR [rip+0xfd8]        # 0x1c58
   0x0000000000000c80 <+46>:	jne    0xcc9 <locations+119>
   0x0000000000000c82 <+48>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000c87 <+53>:	ucomisd xmm0,QWORD PTR [rip+0xfd1]        # 0x1c60
   0x0000000000000c8f <+61>:	jp     0xcc9 <locations+119>
   0x0000000000000c91 <+63>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000c96 <+68>:	ucomisd xmm0,QWORD PTR [rip+0xfc2]        # 0x1c60
   0x0000000000000c9e <+76>:	jne    0xcc9 <locations+119>
   0x0000000000000ca0 <+78>:	lea    rdi,[rip+0x879]        # 0x1520
   0x0000000000000ca7 <+85>:	call   0x700 <puts@plt>
   0x0000000000000cac <+90>:	lea    rdi,[rip+0x89d]        # 0x1550
   0x0000000000000cb3 <+97>:	call   0x700 <puts@plt>
   0x0000000000000cb8 <+102>:	lea    rdi,[rip+0x8b9]        # 0x1578
   0x0000000000000cbf <+109>:	call   0x700 <puts@plt>
   0x0000000000000cc4 <+114>:	jmp    0x110a <locations+1208>
   0x0000000000000cc9 <+119>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000cce <+124>:	ucomisd xmm0,QWORD PTR [rip+0xf92]        # 0x1c68
   0x0000000000000cd6 <+132>:	jp     0xd2e <locations+220>
   0x0000000000000cd8 <+134>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000cdd <+139>:	ucomisd xmm0,QWORD PTR [rip+0xf83]        # 0x1c68
   0x0000000000000ce5 <+147>:	jne    0xd2e <locations+220>
   0x0000000000000ce7 <+149>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000cec <+154>:	ucomisd xmm0,QWORD PTR [rip+0xf7c]        # 0x1c70
   0x0000000000000cf4 <+162>:	jp     0xd2e <locations+220>
   0x0000000000000cf6 <+164>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000cfb <+169>:	ucomisd xmm0,QWORD PTR [rip+0xf6d]        # 0x1c70
   0x0000000000000d03 <+177>:	jne    0xd2e <locations+220>
   0x0000000000000d05 <+179>:	lea    rdi,[rip+0x8e4]        # 0x15f0
   0x0000000000000d0c <+186>:	call   0x700 <puts@plt>
   0x0000000000000d11 <+191>:	lea    rdi,[rip+0x900]        # 0x1618
   0x0000000000000d18 <+198>:	call   0x700 <puts@plt>
   0x0000000000000d1d <+203>:	lea    rdi,[rip+0x934]        # 0x1658
   0x0000000000000d24 <+210>:	call   0x700 <puts@plt>
   0x0000000000000d29 <+215>:	jmp    0x110a <locations+1208>
   0x0000000000000d2e <+220>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000d33 <+225>:	ucomisd xmm0,QWORD PTR [rip+0xf3d]        # 0x1c78
   0x0000000000000d3b <+233>:	jp     0xd93 <locations+321>
   0x0000000000000d3d <+235>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000d42 <+240>:	ucomisd xmm0,QWORD PTR [rip+0xf2e]        # 0x1c78
   0x0000000000000d4a <+248>:	jne    0xd93 <locations+321>
   0x0000000000000d4c <+250>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000d51 <+255>:	ucomisd xmm0,QWORD PTR [rip+0xf27]        # 0x1c80
   0x0000000000000d59 <+263>:	jp     0xd93 <locations+321>
   0x0000000000000d5b <+265>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000d60 <+270>:	ucomisd xmm0,QWORD PTR [rip+0xf18]        # 0x1c80
   0x0000000000000d68 <+278>:	jne    0xd93 <locations+321>
   0x0000000000000d6a <+280>:	lea    rdi,[rip+0x912]        # 0x1683
   0x0000000000000d71 <+287>:	call   0x700 <puts@plt>
   0x0000000000000d76 <+292>:	lea    rdi,[rip+0x923]        # 0x16a0
   0x0000000000000d7d <+299>:	call   0x700 <puts@plt>
   0x0000000000000d82 <+304>:	lea    rdi,[rip+0x947]        # 0x16d0
   0x0000000000000d89 <+311>:	call   0x700 <puts@plt>
   0x0000000000000d8e <+316>:	jmp    0x110a <locations+1208>
   0x0000000000000d93 <+321>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000d98 <+326>:	ucomisd xmm0,QWORD PTR [rip+0xee8]        # 0x1c88
   0x0000000000000da0 <+334>:	jp     0xdf8 <locations+422>
   0x0000000000000da2 <+336>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000da7 <+341>:	ucomisd xmm0,QWORD PTR [rip+0xed9]        # 0x1c88
   0x0000000000000daf <+349>:	jne    0xdf8 <locations+422>
   0x0000000000000db1 <+351>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000db6 <+356>:	ucomisd xmm0,QWORD PTR [rip+0xed2]        # 0x1c90
   0x0000000000000dbe <+364>:	jp     0xdf8 <locations+422>
   0x0000000000000dc0 <+366>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000dc5 <+371>:	ucomisd xmm0,QWORD PTR [rip+0xec3]        # 0x1c90
   0x0000000000000dcd <+379>:	jne    0xdf8 <locations+422>
   0x0000000000000dcf <+381>:	lea    rdi,[rip+0x92a]        # 0x1700
   0x0000000000000dd6 <+388>:	call   0x700 <puts@plt>
   0x0000000000000ddb <+393>:	lea    rdi,[rip+0x956]        # 0x1738
   0x0000000000000de2 <+400>:	call   0x700 <puts@plt>
   0x0000000000000de7 <+405>:	lea    rdi,[rip+0x97a]        # 0x1768
   0x0000000000000dee <+412>:	call   0x700 <puts@plt>
   0x0000000000000df3 <+417>:	jmp    0x110a <locations+1208>
   0x0000000000000df8 <+422>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000dfd <+427>:	ucomisd xmm0,QWORD PTR [rip+0xe93]        # 0x1c98
   0x0000000000000e05 <+435>:	jp     0xe5d <locations+523>
   0x0000000000000e07 <+437>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000e0c <+442>:	ucomisd xmm0,QWORD PTR [rip+0xe84]        # 0x1c98
   0x0000000000000e14 <+450>:	jne    0xe5d <locations+523>
   0x0000000000000e16 <+452>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000e1b <+457>:	ucomisd xmm0,QWORD PTR [rip+0xe7d]        # 0x1ca0
   0x0000000000000e23 <+465>:	jp     0xe5d <locations+523>
   0x0000000000000e25 <+467>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000e2a <+472>:	ucomisd xmm0,QWORD PTR [rip+0xe6e]        # 0x1ca0
   0x0000000000000e32 <+480>:	jne    0xe5d <locations+523>
   0x0000000000000e34 <+482>:	lea    rdi,[rip+0x964]        # 0x179f
   0x0000000000000e3b <+489>:	call   0x700 <puts@plt>
   0x0000000000000e40 <+494>:	lea    rdi,[rip+0x979]        # 0x17c0
   0x0000000000000e47 <+501>:	call   0x700 <puts@plt>
   0x0000000000000e4c <+506>:	lea    rdi,[rip+0x99d]        # 0x17f0
   0x0000000000000e53 <+513>:	call   0x700 <puts@plt>
   0x0000000000000e58 <+518>:	jmp    0x110a <locations+1208>
   0x0000000000000e5d <+523>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000e62 <+528>:	ucomisd xmm0,QWORD PTR [rip+0xe2e]        # 0x1c98
   0x0000000000000e6a <+536>:	jp     0xef3 <locations+673>
   0x0000000000000e70 <+542>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000e75 <+547>:	ucomisd xmm0,QWORD PTR [rip+0xe1b]        # 0x1c98
   0x0000000000000e7d <+555>:	jne    0xef3 <locations+673>
   0x0000000000000e7f <+557>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000e84 <+562>:	ucomisd xmm0,QWORD PTR [rip+0xe1c]        # 0x1ca8
   0x0000000000000e8c <+570>:	jp     0xef3 <locations+673>
   0x0000000000000e8e <+572>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000e93 <+577>:	ucomisd xmm0,QWORD PTR [rip+0xe0d]        # 0x1ca8
   0x0000000000000e9b <+585>:	jne    0xef3 <locations+673>
   0x0000000000000e9d <+587>:	lea    rdi,[rip+0x8fb]        # 0x179f
   0x0000000000000ea4 <+594>:	call   0x700 <puts@plt>
   0x0000000000000ea9 <+599>:	lea    rdi,[rip+0x9a0]        # 0x1850
   0x0000000000000eb0 <+606>:	call   0x700 <puts@plt>
   0x0000000000000eb5 <+611>:	lea    rax,[rip+0x9c1]        # 0x187d
   0x0000000000000ebc <+618>:	mov    QWORD PTR [rbp-0x18],rax
   0x0000000000000ec0 <+622>:	lea    rax,[rip+0x9d4]        # 0x189b
   0x0000000000000ec7 <+629>:	mov    QWORD PTR [rbp-0x10],rax
   0x0000000000000ecb <+633>:	mov    rdx,QWORD PTR [rbp-0x10]
   0x0000000000000ecf <+637>:	mov    rax,QWORD PTR [rbp-0x18]
   0x0000000000000ed3 <+641>:	mov    rsi,rdx
   0x0000000000000ed6 <+644>:	mov    rdi,rax
   0x0000000000000ed9 <+647>:	call   0x908 <xor>
   0x0000000000000ede <+652>:	mov    QWORD PTR [rbp-0x8],rax
   0x0000000000000ee2 <+656>:	mov    rax,QWORD PTR [rbp-0x8]
   0x0000000000000ee6 <+660>:	mov    rdi,rax
   0x0000000000000ee9 <+663>:	call   0x700 <puts@plt>
   0x0000000000000eee <+668>:	jmp    0x110a <locations+1208>
   0x0000000000000ef3 <+673>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000ef8 <+678>:	ucomisd xmm0,QWORD PTR [rip+0xdb0]        # 0x1cb0
   0x0000000000000f00 <+686>:	jp     0xf64 <locations+786>
   0x0000000000000f02 <+688>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000f07 <+693>:	ucomisd xmm0,QWORD PTR [rip+0xda1]        # 0x1cb0
   0x0000000000000f0f <+701>:	jne    0xf64 <locations+786>
   0x0000000000000f11 <+703>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000f16 <+708>:	ucomisd xmm0,QWORD PTR [rip+0xd9a]        # 0x1cb8
   0x0000000000000f1e <+716>:	jp     0xf64 <locations+786>
   0x0000000000000f20 <+718>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000f25 <+723>:	ucomisd xmm0,QWORD PTR [rip+0xd8b]        # 0x1cb8
   0x0000000000000f2d <+731>:	jne    0xf64 <locations+786>
   0x0000000000000f2f <+733>:	lea    rdi,[rip+0x869]        # 0x179f
   0x0000000000000f36 <+740>:	call   0x700 <puts@plt>
   0x0000000000000f3b <+745>:	lea    rdi,[rip+0x96e]        # 0x18b0
   0x0000000000000f42 <+752>:	call   0x700 <puts@plt>
   0x0000000000000f47 <+757>:	lea    rdi,[rip+0x9a2]        # 0x18f0
   0x0000000000000f4e <+764>:	call   0x700 <puts@plt>
   0x0000000000000f53 <+769>:	lea    rdi,[rip+0x9c6]        # 0x1920
   0x0000000000000f5a <+776>:	call   0x700 <puts@plt>
   0x0000000000000f5f <+781>:	jmp    0x110a <locations+1208>
   0x0000000000000f64 <+786>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000f69 <+791>:	ucomisd xmm0,QWORD PTR [rip+0xd27]        # 0x1c98
   0x0000000000000f71 <+799>:	jp     0xfc9 <locations+887>
   0x0000000000000f73 <+801>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000f78 <+806>:	ucomisd xmm0,QWORD PTR [rip+0xd18]        # 0x1c98
   0x0000000000000f80 <+814>:	jne    0xfc9 <locations+887>
   0x0000000000000f82 <+816>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000f87 <+821>:	ucomisd xmm0,QWORD PTR [rip+0xd29]        # 0x1cb8
   0x0000000000000f8f <+829>:	jp     0xfc9 <locations+887>
   0x0000000000000f91 <+831>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000f96 <+836>:	ucomisd xmm0,QWORD PTR [rip+0xd1a]        # 0x1cb8
   0x0000000000000f9e <+844>:	jne    0xfc9 <locations+887>
   0x0000000000000fa0 <+846>:	lea    rdi,[rip+0x7f8]        # 0x179f
   0x0000000000000fa7 <+853>:	call   0x700 <puts@plt>
   0x0000000000000fac <+858>:	lea    rdi,[rip+0x9a5]        # 0x1958
   0x0000000000000fb3 <+865>:	call   0x700 <puts@plt>
   0x0000000000000fb8 <+870>:	lea    rdi,[rip+0x9e1]        # 0x19a0
   0x0000000000000fbf <+877>:	call   0x700 <puts@plt>
   0x0000000000000fc4 <+882>:	jmp    0x110a <locations+1208>
   0x0000000000000fc9 <+887>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000fce <+892>:	ucomisd xmm0,QWORD PTR [rip+0xcea]        # 0x1cc0
   0x0000000000000fd6 <+900>:	jp     0x102e <locations+988>
   0x0000000000000fd8 <+902>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000fdd <+907>:	ucomisd xmm0,QWORD PTR [rip+0xcdb]        # 0x1cc0
   0x0000000000000fe5 <+915>:	jne    0x102e <locations+988>
   0x0000000000000fe7 <+917>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000fec <+922>:	ucomisd xmm0,QWORD PTR [rip+0xcd4]        # 0x1cc8
   0x0000000000000ff4 <+930>:	jp     0x102e <locations+988>
   0x0000000000000ff6 <+932>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000ffb <+937>:	ucomisd xmm0,QWORD PTR [rip+0xcc5]        # 0x1cc8
   0x0000000000001003 <+945>:	jne    0x102e <locations+988>
   0x0000000000001005 <+947>:	lea    rdi,[rip+0x9dc]        # 0x19e8
   0x000000000000100c <+954>:	call   0x700 <puts@plt>
   0x0000000000001011 <+959>:	lea    rdi,[rip+0xa28]        # 0x1a40
   0x0000000000001018 <+966>:	call   0x700 <puts@plt>
   0x000000000000101d <+971>:	lea    rdi,[rip+0xa4c]        # 0x1a70
   0x0000000000001024 <+978>:	call   0x700 <puts@plt>
   0x0000000000001029 <+983>:	jmp    0x110a <locations+1208>
   0x000000000000102e <+988>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000001033 <+993>:	ucomisd xmm0,QWORD PTR [rip+0xc95]        # 0x1cd0
   0x000000000000103b <+1001>:	jp     0x1090 <locations+1086>
   0x000000000000103d <+1003>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000001042 <+1008>:	ucomisd xmm0,QWORD PTR [rip+0xc86]        # 0x1cd0
   0x000000000000104a <+1016>:	jne    0x1090 <locations+1086>
   0x000000000000104c <+1018>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000001051 <+1023>:	ucomisd xmm0,QWORD PTR [rip+0xc7f]        # 0x1cd8
   0x0000000000001059 <+1031>:	jp     0x1090 <locations+1086>
   0x000000000000105b <+1033>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000001060 <+1038>:	ucomisd xmm0,QWORD PTR [rip+0xc70]        # 0x1cd8
   0x0000000000001068 <+1046>:	jne    0x1090 <locations+1086>
   0x000000000000106a <+1048>:	lea    rdi,[rip+0xa27]        # 0x1a98
   0x0000000000001071 <+1055>:	call   0x700 <puts@plt>
   0x0000000000001076 <+1060>:	lea    rdi,[rip+0xa43]        # 0x1ac0
   0x000000000000107d <+1067>:	call   0x700 <puts@plt>
   0x0000000000001082 <+1072>:	lea    rdi,[rip+0xa5f]        # 0x1ae8
   0x0000000000001089 <+1079>:	call   0x700 <puts@plt>
   0x000000000000108e <+1084>:	jmp    0x110a <locations+1208>
   0x0000000000001090 <+1086>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000001095 <+1091>:	ucomisd xmm0,QWORD PTR [rip+0xc43]        # 0x1ce0
   0x000000000000109d <+1099>:	jp     0x10f2 <locations+1184>
   0x000000000000109f <+1101>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x00000000000010a4 <+1106>:	ucomisd xmm0,QWORD PTR [rip+0xc34]        # 0x1ce0
   0x00000000000010ac <+1114>:	jne    0x10f2 <locations+1184>
   0x00000000000010ae <+1116>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x00000000000010b3 <+1121>:	ucomisd xmm0,QWORD PTR [rip+0xc2d]        # 0x1ce8
   0x00000000000010bb <+1129>:	jp     0x10f2 <locations+1184>
   0x00000000000010bd <+1131>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x00000000000010c2 <+1136>:	ucomisd xmm0,QWORD PTR [rip+0xc1e]        # 0x1ce8
   0x00000000000010ca <+1144>:	jne    0x10f2 <locations+1184>
   0x00000000000010cc <+1146>:	lea    rdi,[rip+0xac5]        # 0x1b98
   0x00000000000010d3 <+1153>:	call   0x700 <puts@plt>
   0x00000000000010d8 <+1158>:	lea    rdi,[rip+0xae1]        # 0x1bc0
   0x00000000000010df <+1165>:	call   0x700 <puts@plt>
   0x00000000000010e4 <+1170>:	lea    rdi,[rip+0xafd]        # 0x1be8
   0x00000000000010eb <+1177>:	call   0x700 <puts@plt>
   0x00000000000010f0 <+1182>:	jmp    0x110a <locations+1208>
   0x00000000000010f2 <+1184>:	lea    rdi,[rip+0xb1f]        # 0x1c18
   0x00000000000010f9 <+1191>:	call   0x700 <puts@plt>
   0x00000000000010fe <+1196>:	lea    rdi,[rip+0xb38]        # 0x1c3d
   0x0000000000001105 <+1203>:	call   0x700 <puts@plt>
   0x000000000000110a <+1208>:	nop
   0x000000000000110b <+1209>:	leave  
   0x000000000000110c <+1210>:	ret    
End of assembler dump.
(gdb) Dump of assembler code for function locations:
   0x0000000000000c52 <+0>:	push   rbp
   0x0000000000000c53 <+1>:	mov    rbp,rsp
   0x0000000000000c56 <+4>:	sub    rsp,0x30
   0x0000000000000c5a <+8>:	movsd  QWORD PTR [rbp-0x28],xmm0
   0x0000000000000c5f <+13>:	movsd  QWORD PTR [rbp-0x30],xmm1
   0x0000000000000c64 <+18>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000c69 <+23>:	ucomisd xmm0,QWORD PTR [rip+0xfe7]        # 0x1c58
   0x0000000000000c71 <+31>:	jp     0xcc9 <locations+119>
   0x0000000000000c73 <+33>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000c78 <+38>:	ucomisd xmm0,QWORD PTR [rip+0xfd8]        # 0x1c58
   0x0000000000000c80 <+46>:	jne    0xcc9 <locations+119>
   0x0000000000000c82 <+48>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000c87 <+53>:	ucomisd xmm0,QWORD PTR [rip+0xfd1]        # 0x1c60
   0x0000000000000c8f <+61>:	jp     0xcc9 <locations+119>
   0x0000000000000c91 <+63>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000c96 <+68>:	ucomisd xmm0,QWORD PTR [rip+0xfc2]        # 0x1c60
   0x0000000000000c9e <+76>:	jne    0xcc9 <locations+119>
   0x0000000000000ca0 <+78>:	lea    rdi,[rip+0x879]        # 0x1520
   0x0000000000000ca7 <+85>:	call   0x700 <puts@plt>
   0x0000000000000cac <+90>:	lea    rdi,[rip+0x89d]        # 0x1550
   0x0000000000000cb3 <+97>:	call   0x700 <puts@plt>
   0x0000000000000cb8 <+102>:	lea    rdi,[rip+0x8b9]        # 0x1578
   0x0000000000000cbf <+109>:	call   0x700 <puts@plt>
   0x0000000000000cc4 <+114>:	jmp    0x110a <locations+1208>
   0x0000000000000cc9 <+119>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000cce <+124>:	ucomisd xmm0,QWORD PTR [rip+0xf92]        # 0x1c68
   0x0000000000000cd6 <+132>:	jp     0xd2e <locations+220>
   0x0000000000000cd8 <+134>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000cdd <+139>:	ucomisd xmm0,QWORD PTR [rip+0xf83]        # 0x1c68
   0x0000000000000ce5 <+147>:	jne    0xd2e <locations+220>
   0x0000000000000ce7 <+149>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000cec <+154>:	ucomisd xmm0,QWORD PTR [rip+0xf7c]        # 0x1c70
   0x0000000000000cf4 <+162>:	jp     0xd2e <locations+220>
   0x0000000000000cf6 <+164>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000cfb <+169>:	ucomisd xmm0,QWORD PTR [rip+0xf6d]        # 0x1c70
   0x0000000000000d03 <+177>:	jne    0xd2e <locations+220>
   0x0000000000000d05 <+179>:	lea    rdi,[rip+0x8e4]        # 0x15f0
   0x0000000000000d0c <+186>:	call   0x700 <puts@plt>
   0x0000000000000d11 <+191>:	lea    rdi,[rip+0x900]        # 0x1618
   0x0000000000000d18 <+198>:	call   0x700 <puts@plt>
   0x0000000000000d1d <+203>:	lea    rdi,[rip+0x934]        # 0x1658
   0x0000000000000d24 <+210>:	call   0x700 <puts@plt>
   0x0000000000000d29 <+215>:	jmp    0x110a <locations+1208>
   0x0000000000000d2e <+220>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000d33 <+225>:	ucomisd xmm0,QWORD PTR [rip+0xf3d]        # 0x1c78
   0x0000000000000d3b <+233>:	jp     0xd93 <locations+321>
   0x0000000000000d3d <+235>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000d42 <+240>:	ucomisd xmm0,QWORD PTR [rip+0xf2e]        # 0x1c78
   0x0000000000000d4a <+248>:	jne    0xd93 <locations+321>
   0x0000000000000d4c <+250>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000d51 <+255>:	ucomisd xmm0,QWORD PTR [rip+0xf27]        # 0x1c80
   0x0000000000000d59 <+263>:	jp     0xd93 <locations+321>
   0x0000000000000d5b <+265>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000d60 <+270>:	ucomisd xmm0,QWORD PTR [rip+0xf18]        # 0x1c80
   0x0000000000000d68 <+278>:	jne    0xd93 <locations+321>
   0x0000000000000d6a <+280>:	lea    rdi,[rip+0x912]        # 0x1683
   0x0000000000000d71 <+287>:	call   0x700 <puts@plt>
   0x0000000000000d76 <+292>:	lea    rdi,[rip+0x923]        # 0x16a0
   0x0000000000000d7d <+299>:	call   0x700 <puts@plt>
   0x0000000000000d82 <+304>:	lea    rdi,[rip+0x947]        # 0x16d0
   0x0000000000000d89 <+311>:	call   0x700 <puts@plt>
   0x0000000000000d8e <+316>:	jmp    0x110a <locations+1208>
   0x0000000000000d93 <+321>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000d98 <+326>:	ucomisd xmm0,QWORD PTR [rip+0xee8]        # 0x1c88
   0x0000000000000da0 <+334>:	jp     0xdf8 <locations+422>
   0x0000000000000da2 <+336>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000da7 <+341>:	ucomisd xmm0,QWORD PTR [rip+0xed9]        # 0x1c88
   0x0000000000000daf <+349>:	jne    0xdf8 <locations+422>
   0x0000000000000db1 <+351>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000db6 <+356>:	ucomisd xmm0,QWORD PTR [rip+0xed2]        # 0x1c90
   0x0000000000000dbe <+364>:	jp     0xdf8 <locations+422>
   0x0000000000000dc0 <+366>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000dc5 <+371>:	ucomisd xmm0,QWORD PTR [rip+0xec3]        # 0x1c90
   0x0000000000000dcd <+379>:	jne    0xdf8 <locations+422>
   0x0000000000000dcf <+381>:	lea    rdi,[rip+0x92a]        # 0x1700
   0x0000000000000dd6 <+388>:	call   0x700 <puts@plt>
   0x0000000000000ddb <+393>:	lea    rdi,[rip+0x956]        # 0x1738
   0x0000000000000de2 <+400>:	call   0x700 <puts@plt>
   0x0000000000000de7 <+405>:	lea    rdi,[rip+0x97a]        # 0x1768
   0x0000000000000dee <+412>:	call   0x700 <puts@plt>
   0x0000000000000df3 <+417>:	jmp    0x110a <locations+1208>
   0x0000000000000df8 <+422>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000dfd <+427>:	ucomisd xmm0,QWORD PTR [rip+0xe93]        # 0x1c98
   0x0000000000000e05 <+435>:	jp     0xe5d <locations+523>
   0x0000000000000e07 <+437>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000e0c <+442>:	ucomisd xmm0,QWORD PTR [rip+0xe84]        # 0x1c98
   0x0000000000000e14 <+450>:	jne    0xe5d <locations+523>
   0x0000000000000e16 <+452>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000e1b <+457>:	ucomisd xmm0,QWORD PTR [rip+0xe7d]        # 0x1ca0
   0x0000000000000e23 <+465>:	jp     0xe5d <locations+523>
   0x0000000000000e25 <+467>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000e2a <+472>:	ucomisd xmm0,QWORD PTR [rip+0xe6e]        # 0x1ca0
   0x0000000000000e32 <+480>:	jne    0xe5d <locations+523>
   0x0000000000000e34 <+482>:	lea    rdi,[rip+0x964]        # 0x179f
   0x0000000000000e3b <+489>:	call   0x700 <puts@plt>
   0x0000000000000e40 <+494>:	lea    rdi,[rip+0x979]        # 0x17c0
   0x0000000000000e47 <+501>:	call   0x700 <puts@plt>
   0x0000000000000e4c <+506>:	lea    rdi,[rip+0x99d]        # 0x17f0
   0x0000000000000e53 <+513>:	call   0x700 <puts@plt>
   0x0000000000000e58 <+518>:	jmp    0x110a <locations+1208>
   0x0000000000000e5d <+523>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000e62 <+528>:	ucomisd xmm0,QWORD PTR [rip+0xe2e]        # 0x1c98
   0x0000000000000e6a <+536>:	jp     0xef3 <locations+673>
   0x0000000000000e70 <+542>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000e75 <+547>:	ucomisd xmm0,QWORD PTR [rip+0xe1b]        # 0x1c98
   0x0000000000000e7d <+555>:	jne    0xef3 <locations+673>
   0x0000000000000e7f <+557>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000e84 <+562>:	ucomisd xmm0,QWORD PTR [rip+0xe1c]        # 0x1ca8
   0x0000000000000e8c <+570>:	jp     0xef3 <locations+673>
   0x0000000000000e8e <+572>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000e93 <+577>:	ucomisd xmm0,QWORD PTR [rip+0xe0d]        # 0x1ca8
   0x0000000000000e9b <+585>:	jne    0xef3 <locations+673>
   0x0000000000000e9d <+587>:	lea    rdi,[rip+0x8fb]        # 0x179f
   0x0000000000000ea4 <+594>:	call   0x700 <puts@plt>
   0x0000000000000ea9 <+599>:	lea    rdi,[rip+0x9a0]        # 0x1850
   0x0000000000000eb0 <+606>:	call   0x700 <puts@plt>
   0x0000000000000eb5 <+611>:	lea    rax,[rip+0x9c1]        # 0x187d
   0x0000000000000ebc <+618>:	mov    QWORD PTR [rbp-0x18],rax
   0x0000000000000ec0 <+622>:	lea    rax,[rip+0x9d4]        # 0x189b
   0x0000000000000ec7 <+629>:	mov    QWORD PTR [rbp-0x10],rax
   0x0000000000000ecb <+633>:	mov    rdx,QWORD PTR [rbp-0x10]
   0x0000000000000ecf <+637>:	mov    rax,QWORD PTR [rbp-0x18]
   0x0000000000000ed3 <+641>:	mov    rsi,rdx
   0x0000000000000ed6 <+644>:	mov    rdi,rax
   0x0000000000000ed9 <+647>:	call   0x908 <xor>
   0x0000000000000ede <+652>:	mov    QWORD PTR [rbp-0x8],rax
   0x0000000000000ee2 <+656>:	mov    rax,QWORD PTR [rbp-0x8]
   0x0000000000000ee6 <+660>:	mov    rdi,rax
   0x0000000000000ee9 <+663>:	call   0x700 <puts@plt>
   0x0000000000000eee <+668>:	jmp    0x110a <locations+1208>
   0x0000000000000ef3 <+673>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000ef8 <+678>:	ucomisd xmm0,QWORD PTR [rip+0xdb0]        # 0x1cb0
   0x0000000000000f00 <+686>:	jp     0xf64 <locations+786>
   0x0000000000000f02 <+688>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000f07 <+693>:	ucomisd xmm0,QWORD PTR [rip+0xda1]        # 0x1cb0
   0x0000000000000f0f <+701>:	jne    0xf64 <locations+786>
   0x0000000000000f11 <+703>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000f16 <+708>:	ucomisd xmm0,QWORD PTR [rip+0xd9a]        # 0x1cb8
   0x0000000000000f1e <+716>:	jp     0xf64 <locations+786>
   0x0000000000000f20 <+718>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000f25 <+723>:	ucomisd xmm0,QWORD PTR [rip+0xd8b]        # 0x1cb8
   0x0000000000000f2d <+731>:	jne    0xf64 <locations+786>
   0x0000000000000f2f <+733>:	lea    rdi,[rip+0x869]        # 0x179f
   0x0000000000000f36 <+740>:	call   0x700 <puts@plt>
   0x0000000000000f3b <+745>:	lea    rdi,[rip+0x96e]        # 0x18b0
   0x0000000000000f42 <+752>:	call   0x700 <puts@plt>
   0x0000000000000f47 <+757>:	lea    rdi,[rip+0x9a2]        # 0x18f0
   0x0000000000000f4e <+764>:	call   0x700 <puts@plt>
   0x0000000000000f53 <+769>:	lea    rdi,[rip+0x9c6]        # 0x1920
   0x0000000000000f5a <+776>:	call   0x700 <puts@plt>
   0x0000000000000f5f <+781>:	jmp    0x110a <locations+1208>
   0x0000000000000f64 <+786>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000f69 <+791>:	ucomisd xmm0,QWORD PTR [rip+0xd27]        # 0x1c98
   0x0000000000000f71 <+799>:	jp     0xfc9 <locations+887>
   0x0000000000000f73 <+801>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000f78 <+806>:	ucomisd xmm0,QWORD PTR [rip+0xd18]        # 0x1c98
   0x0000000000000f80 <+814>:	jne    0xfc9 <locations+887>
   0x0000000000000f82 <+816>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000f87 <+821>:	ucomisd xmm0,QWORD PTR [rip+0xd29]        # 0x1cb8
   0x0000000000000f8f <+829>:	jp     0xfc9 <locations+887>
   0x0000000000000f91 <+831>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000f96 <+836>:	ucomisd xmm0,QWORD PTR [rip+0xd1a]        # 0x1cb8
   0x0000000000000f9e <+844>:	jne    0xfc9 <locations+887>
   0x0000000000000fa0 <+846>:	lea    rdi,[rip+0x7f8]        # 0x179f
   0x0000000000000fa7 <+853>:	call   0x700 <puts@plt>
   0x0000000000000fac <+858>:	lea    rdi,[rip+0x9a5]        # 0x1958
   0x0000000000000fb3 <+865>:	call   0x700 <puts@plt>
   0x0000000000000fb8 <+870>:	lea    rdi,[rip+0x9e1]        # 0x19a0
   0x0000000000000fbf <+877>:	call   0x700 <puts@plt>
   0x0000000000000fc4 <+882>:	jmp    0x110a <locations+1208>
   0x0000000000000fc9 <+887>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000fce <+892>:	ucomisd xmm0,QWORD PTR [rip+0xcea]        # 0x1cc0
   0x0000000000000fd6 <+900>:	jp     0x102e <locations+988>
   0x0000000000000fd8 <+902>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000fdd <+907>:	ucomisd xmm0,QWORD PTR [rip+0xcdb]        # 0x1cc0
   0x0000000000000fe5 <+915>:	jne    0x102e <locations+988>
   0x0000000000000fe7 <+917>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000fec <+922>:	ucomisd xmm0,QWORD PTR [rip+0xcd4]        # 0x1cc8
   0x0000000000000ff4 <+930>:	jp     0x102e <locations+988>
   0x0000000000000ff6 <+932>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000000ffb <+937>:	ucomisd xmm0,QWORD PTR [rip+0xcc5]        # 0x1cc8
   0x0000000000001003 <+945>:	jne    0x102e <locations+988>
   0x0000000000001005 <+947>:	lea    rdi,[rip+0x9dc]        # 0x19e8
   0x000000000000100c <+954>:	call   0x700 <puts@plt>
   0x0000000000001011 <+959>:	lea    rdi,[rip+0xa28]        # 0x1a40
   0x0000000000001018 <+966>:	call   0x700 <puts@plt>
   0x000000000000101d <+971>:	lea    rdi,[rip+0xa4c]        # 0x1a70
   0x0000000000001024 <+978>:	call   0x700 <puts@plt>
   0x0000000000001029 <+983>:	jmp    0x110a <locations+1208>
   0x000000000000102e <+988>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000001033 <+993>:	ucomisd xmm0,QWORD PTR [rip+0xc95]        # 0x1cd0
   0x000000000000103b <+1001>:	jp     0x1090 <locations+1086>
   0x000000000000103d <+1003>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000001042 <+1008>:	ucomisd xmm0,QWORD PTR [rip+0xc86]        # 0x1cd0
   0x000000000000104a <+1016>:	jne    0x1090 <locations+1086>
   0x000000000000104c <+1018>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000001051 <+1023>:	ucomisd xmm0,QWORD PTR [rip+0xc7f]        # 0x1cd8
   0x0000000000001059 <+1031>:	jp     0x1090 <locations+1086>
   0x000000000000105b <+1033>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x0000000000001060 <+1038>:	ucomisd xmm0,QWORD PTR [rip+0xc70]        # 0x1cd8
   0x0000000000001068 <+1046>:	jne    0x1090 <locations+1086>
   0x000000000000106a <+1048>:	lea    rdi,[rip+0xa27]        # 0x1a98
   0x0000000000001071 <+1055>:	call   0x700 <puts@plt>
   0x0000000000001076 <+1060>:	lea    rdi,[rip+0xa43]        # 0x1ac0
   0x000000000000107d <+1067>:	call   0x700 <puts@plt>
   0x0000000000001082 <+1072>:	lea    rdi,[rip+0xa5f]        # 0x1ae8
   0x0000000000001089 <+1079>:	call   0x700 <puts@plt>
   0x000000000000108e <+1084>:	jmp    0x110a <locations+1208>
   0x0000000000001090 <+1086>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000001095 <+1091>:	ucomisd xmm0,QWORD PTR [rip+0xc43]        # 0x1ce0
   0x000000000000109d <+1099>:	jp     0x10f2 <locations+1184>
   0x000000000000109f <+1101>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x00000000000010a4 <+1106>:	ucomisd xmm0,QWORD PTR [rip+0xc34]        # 0x1ce0
   0x00000000000010ac <+1114>:	jne    0x10f2 <locations+1184>
   0x00000000000010ae <+1116>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x00000000000010b3 <+1121>:	ucomisd xmm0,QWORD PTR [rip+0xc2d]        # 0x1ce8
   0x00000000000010bb <+1129>:	jp     0x10f2 <locations+1184>
   0x00000000000010bd <+1131>:	movsd  xmm0,QWORD PTR [rbp-0x30]
   0x00000000000010c2 <+1136>:	ucomisd xmm0,QWORD PTR [rip+0xc1e]        # 0x1ce8
   0x00000000000010ca <+1144>:	jne    0x10f2 <locations+1184>
   0x00000000000010cc <+1146>:	lea    rdi,[rip+0xac5]        # 0x1b98
   0x00000000000010d3 <+1153>:	call   0x700 <puts@plt>
   0x00000000000010d8 <+1158>:	lea    rdi,[rip+0xae1]        # 0x1bc0
   0x00000000000010df <+1165>:	call   0x700 <puts@plt>
   0x00000000000010e4 <+1170>:	lea    rdi,[rip+0xafd]        # 0x1be8
   0x00000000000010eb <+1177>:	call   0x700 <puts@plt>
   0x00000000000010f0 <+1182>:	jmp    0x110a <locations+1208>
   0x00000000000010f2 <+1184>:	lea    rdi,[rip+0xb1f]        # 0x1c18
   0x00000000000010f9 <+1191>:	call   0x700 <puts@plt>
   0x00000000000010fe <+1196>:	lea    rdi,[rip+0xb38]        # 0x1c3d
   0x0000000000001105 <+1203>:	call   0x700 <puts@plt>
   0x000000000000110a <+1208>:	nop
   0x000000000000110b <+1209>:	leave  
   0x000000000000110c <+1210>:	ret    
End of assembler dump.
(gdb) quit
