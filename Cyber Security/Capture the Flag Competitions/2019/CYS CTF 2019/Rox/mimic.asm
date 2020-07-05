
mimic:     file format elf64-x86-64


Disassembly of section .init:

0000000000001000 <_init>:
    1000:	48 83 ec 08          	sub    rsp,0x8
    1004:	48 8b 05 dd 2f 00 00 	mov    rax,QWORD PTR [rip+0x2fdd]        # 3fe8 <__gmon_start__>
    100b:	48 85 c0             	test   rax,rax
    100e:	74 02                	je     1012 <_init+0x12>
    1010:	ff d0                	call   rax
    1012:	48 83 c4 08          	add    rsp,0x8
    1016:	c3                   	ret    

Disassembly of section .plt:

0000000000001020 <.plt>:
    1020:	ff 35 32 2f 00 00    	push   QWORD PTR [rip+0x2f32]        # 3f58 <_GLOBAL_OFFSET_TABLE_+0x8>
    1026:	ff 25 34 2f 00 00    	jmp    QWORD PTR [rip+0x2f34]        # 3f60 <_GLOBAL_OFFSET_TABLE_+0x10>
    102c:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]

0000000000001030 <printf@plt>:
    1030:	ff 25 32 2f 00 00    	jmp    QWORD PTR [rip+0x2f32]        # 3f68 <printf@GLIBC_2.2.5>
    1036:	68 00 00 00 00       	push   0x0
    103b:	e9 e0 ff ff ff       	jmp    1020 <.plt>

0000000000001040 <strcspn@plt>:
    1040:	ff 25 2a 2f 00 00    	jmp    QWORD PTR [rip+0x2f2a]        # 3f70 <strcspn@GLIBC_2.2.5>
    1046:	68 01 00 00 00       	push   0x1
    104b:	e9 d0 ff ff ff       	jmp    1020 <.plt>

0000000000001050 <_ZNSolsEm@plt>:
    1050:	ff 25 22 2f 00 00    	jmp    QWORD PTR [rip+0x2f22]        # 3f78 <_ZNSolsEm@GLIBCXX_3.4>
    1056:	68 02 00 00 00       	push   0x2
    105b:	e9 c0 ff ff ff       	jmp    1020 <.plt>

0000000000001060 <strlen@plt>:
    1060:	ff 25 1a 2f 00 00    	jmp    QWORD PTR [rip+0x2f1a]        # 3f80 <strlen@GLIBC_2.2.5>
    1066:	68 03 00 00 00       	push   0x3
    106b:	e9 b0 ff ff ff       	jmp    1020 <.plt>

0000000000001070 <__cxa_atexit@plt>:
    1070:	ff 25 12 2f 00 00    	jmp    QWORD PTR [rip+0x2f12]        # 3f88 <__cxa_atexit@GLIBC_2.2.5>
    1076:	68 04 00 00 00       	push   0x4
    107b:	e9 a0 ff ff ff       	jmp    1020 <.plt>

0000000000001080 <_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc@plt>:
    1080:	ff 25 0a 2f 00 00    	jmp    QWORD PTR [rip+0x2f0a]        # 3f90 <_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc@GLIBCXX_3.4>
    1086:	68 05 00 00 00       	push   0x5
    108b:	e9 90 ff ff ff       	jmp    1020 <.plt>

0000000000001090 <_ZNSolsEPFRSoS_E@plt>:
    1090:	ff 25 02 2f 00 00    	jmp    QWORD PTR [rip+0x2f02]        # 3f98 <_ZNSolsEPFRSoS_E@GLIBCXX_3.4>
    1096:	68 06 00 00 00       	push   0x6
    109b:	e9 80 ff ff ff       	jmp    1020 <.plt>

00000000000010a0 <__stack_chk_fail@plt>:
    10a0:	ff 25 fa 2e 00 00    	jmp    QWORD PTR [rip+0x2efa]        # 3fa0 <__stack_chk_fail@GLIBC_2.4>
    10a6:	68 07 00 00 00       	push   0x7
    10ab:	e9 70 ff ff ff       	jmp    1020 <.plt>

00000000000010b0 <_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c@plt>:
    10b0:	ff 25 f2 2e 00 00    	jmp    QWORD PTR [rip+0x2ef2]        # 3fa8 <_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c@GLIBCXX_3.4>
    10b6:	68 08 00 00 00       	push   0x8
    10bb:	e9 60 ff ff ff       	jmp    1020 <.plt>

00000000000010c0 <_ZNSt8ios_base4InitC1Ev@plt>:
    10c0:	ff 25 ea 2e 00 00    	jmp    QWORD PTR [rip+0x2eea]        # 3fb0 <_ZNSt8ios_base4InitC1Ev@GLIBCXX_3.4>
    10c6:	68 09 00 00 00       	push   0x9
    10cb:	e9 50 ff ff ff       	jmp    1020 <.plt>

00000000000010d0 <puts@plt>:
    10d0:	ff 25 e2 2e 00 00    	jmp    QWORD PTR [rip+0x2ee2]        # 3fb8 <puts@GLIBC_2.2.5>
    10d6:	68 0a 00 00 00       	push   0xa
    10db:	e9 40 ff ff ff       	jmp    1020 <.plt>

00000000000010e0 <fgets@plt>:
    10e0:	ff 25 da 2e 00 00    	jmp    QWORD PTR [rip+0x2eda]        # 3fc0 <fgets@GLIBC_2.2.5>
    10e6:	68 0b 00 00 00       	push   0xb
    10eb:	e9 30 ff ff ff       	jmp    1020 <.plt>

Disassembly of section .plt.got:

00000000000010f0 <__cxa_finalize@plt>:
    10f0:	ff 25 d2 2e 00 00    	jmp    QWORD PTR [rip+0x2ed2]        # 3fc8 <__cxa_finalize@GLIBC_2.2.5>
    10f6:	66 90                	xchg   ax,ax

Disassembly of section .text:

0000000000001100 <_start>:
    1100:	31 ed                	xor    ebp,ebp
    1102:	49 89 d1             	mov    r9,rdx
    1105:	5e                   	pop    rsi
    1106:	48 89 e2             	mov    rdx,rsp
    1109:	48 83 e4 f0          	and    rsp,0xfffffffffffffff0
    110d:	50                   	push   rax
    110e:	54                   	push   rsp
    110f:	4c 8d 05 6a 03 00 00 	lea    r8,[rip+0x36a]        # 1480 <__libc_csu_fini>
    1116:	48 8d 0d 03 03 00 00 	lea    rcx,[rip+0x303]        # 1420 <__libc_csu_init>
    111d:	48 8d 3d c1 00 00 00 	lea    rdi,[rip+0xc1]        # 11e5 <main>
    1124:	ff 15 b6 2e 00 00    	call   QWORD PTR [rip+0x2eb6]        # 3fe0 <__libc_start_main@GLIBC_2.2.5>
    112a:	f4                   	hlt    
    112b:	0f 1f 44 00 00       	nop    DWORD PTR [rax+rax*1+0x0]

0000000000001130 <deregister_tm_clones>:
    1130:	48 8d 3d d9 2e 00 00 	lea    rdi,[rip+0x2ed9]        # 4010 <__TMC_END__>
    1137:	48 8d 05 d2 2e 00 00 	lea    rax,[rip+0x2ed2]        # 4010 <__TMC_END__>
    113e:	48 39 f8             	cmp    rax,rdi
    1141:	74 15                	je     1158 <deregister_tm_clones+0x28>
    1143:	48 8b 05 8e 2e 00 00 	mov    rax,QWORD PTR [rip+0x2e8e]        # 3fd8 <_ITM_deregisterTMCloneTable>
    114a:	48 85 c0             	test   rax,rax
    114d:	74 09                	je     1158 <deregister_tm_clones+0x28>
    114f:	ff e0                	jmp    rax
    1151:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
    1158:	c3                   	ret    
    1159:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]

0000000000001160 <register_tm_clones>:
    1160:	48 8d 3d a9 2e 00 00 	lea    rdi,[rip+0x2ea9]        # 4010 <__TMC_END__>
    1167:	48 8d 35 a2 2e 00 00 	lea    rsi,[rip+0x2ea2]        # 4010 <__TMC_END__>
    116e:	48 29 fe             	sub    rsi,rdi
    1171:	48 c1 fe 03          	sar    rsi,0x3
    1175:	48 89 f0             	mov    rax,rsi
    1178:	48 c1 e8 3f          	shr    rax,0x3f
    117c:	48 01 c6             	add    rsi,rax
    117f:	48 d1 fe             	sar    rsi,1
    1182:	74 14                	je     1198 <register_tm_clones+0x38>
    1184:	48 8b 05 65 2e 00 00 	mov    rax,QWORD PTR [rip+0x2e65]        # 3ff0 <_ITM_registerTMCloneTable>
    118b:	48 85 c0             	test   rax,rax
    118e:	74 08                	je     1198 <register_tm_clones+0x38>
    1190:	ff e0                	jmp    rax
    1192:	66 0f 1f 44 00 00    	nop    WORD PTR [rax+rax*1+0x0]
    1198:	c3                   	ret    
    1199:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]

00000000000011a0 <__do_global_dtors_aux>:
    11a0:	80 3d a9 2f 00 00 00 	cmp    BYTE PTR [rip+0x2fa9],0x0        # 4150 <completed.7931>
    11a7:	75 2f                	jne    11d8 <__do_global_dtors_aux+0x38>
    11a9:	55                   	push   rbp
    11aa:	48 83 3d 16 2e 00 00 	cmp    QWORD PTR [rip+0x2e16],0x0        # 3fc8 <__cxa_finalize@GLIBC_2.2.5>
    11b1:	00 
    11b2:	48 89 e5             	mov    rbp,rsp
    11b5:	74 0c                	je     11c3 <__do_global_dtors_aux+0x23>
    11b7:	48 8b 3d 4a 2e 00 00 	mov    rdi,QWORD PTR [rip+0x2e4a]        # 4008 <__dso_handle>
    11be:	e8 2d ff ff ff       	call   10f0 <__cxa_finalize@plt>
    11c3:	e8 68 ff ff ff       	call   1130 <deregister_tm_clones>
    11c8:	c6 05 81 2f 00 00 01 	mov    BYTE PTR [rip+0x2f81],0x1        # 4150 <completed.7931>
    11cf:	5d                   	pop    rbp
    11d0:	c3                   	ret    
    11d1:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
    11d8:	c3                   	ret    
    11d9:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]

00000000000011e0 <frame_dummy>:
    11e0:	e9 7b ff ff ff       	jmp    1160 <register_tm_clones>

00000000000011e5 <main>:
    11e5:	55                   	push   rbp
    11e6:	48 89 e5             	mov    rbp,rsp
    11e9:	53                   	push   rbx
    11ea:	48 81 ec 18 04 00 00 	sub    rsp,0x418
    11f1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
    11f8:	00 00 
    11fa:	48 89 45 e8          	mov    QWORD PTR [rbp-0x18],rax
    11fe:	31 c0                	xor    eax,eax
    1200:	48 8d 3d a9 0e 00 00 	lea    rdi,[rip+0xea9]        # 20b0 <_ZNSt8__detailL19_S_invalid_state_idE+0x8>
    1207:	e8 c4 fe ff ff       	call   10d0 <puts@plt>
    120c:	48 8d 3d bd 0e 00 00 	lea    rdi,[rip+0xebd]        # 20d0 <_ZNSt8__detailL19_S_invalid_state_idE+0x28>
    1213:	e8 b8 fe ff ff       	call   10d0 <puts@plt>
    1218:	48 8d 3d d1 0e 00 00 	lea    rdi,[rip+0xed1]        # 20f0 <_ZNSt8__detailL19_S_invalid_state_idE+0x48>
    121f:	b8 00 00 00 00       	mov    eax,0x0
    1224:	e8 07 fe ff ff       	call   1030 <printf@plt>
    1229:	48 8b 15 f0 2d 00 00 	mov    rdx,QWORD PTR [rip+0x2df0]        # 4020 <stdin@@GLIBC_2.2.5>
    1230:	48 8d 85 00 fc ff ff 	lea    rax,[rbp-0x400]
    1237:	be e8 03 00 00       	mov    esi,0x3e8
    123c:	48 89 c7             	mov    rdi,rax
    123f:	e8 9c fe ff ff       	call   10e0 <fgets@plt>
    1244:	48 8d 85 00 fc ff ff 	lea    rax,[rbp-0x400]
    124b:	48 8d 35 c4 0e 00 00 	lea    rsi,[rip+0xec4]        # 2116 <_ZNSt8__detailL19_S_invalid_state_idE+0x6e>
    1252:	48 89 c7             	mov    rdi,rax
    1255:	e8 e6 fd ff ff       	call   1040 <strcspn@plt>
    125a:	89 85 f8 fb ff ff    	mov    DWORD PTR [rbp-0x408],eax
    1260:	8b 85 f8 fb ff ff    	mov    eax,DWORD PTR [rbp-0x408]
    1266:	48 98                	cdqe   
    1268:	c6 84 05 00 fc ff ff 	mov    BYTE PTR [rbp+rax*1-0x400],0x0
    126f:	00 
    1270:	c7 85 f0 fb ff ff 00 	mov    DWORD PTR [rbp-0x410],0x0
    1277:	00 00 00 
    127a:	8b 85 f0 fb ff ff    	mov    eax,DWORD PTR [rbp-0x410]
    1280:	48 63 d8             	movsxd rbx,eax
    1283:	48 8d 85 00 fc ff ff 	lea    rax,[rbp-0x400]
    128a:	48 89 c7             	mov    rdi,rax
    128d:	e8 ce fd ff ff       	call   1060 <strlen@plt>
    1292:	48 39 c3             	cmp    rbx,rax
    1295:	73 39                	jae    12d0 <main+0xeb>
    1297:	8b 85 f0 fb ff ff    	mov    eax,DWORD PTR [rbp-0x410]
    129d:	48 98                	cdqe   
    129f:	0f b6 84 05 00 fc ff 	movzx  eax,BYTE PTR [rbp+rax*1-0x400]
    12a6:	ff 
    12a7:	0f be c0             	movsx  eax,al
    12aa:	89 c6                	mov    esi,eax
    12ac:	48 8d 3d 8d 2d 00 00 	lea    rdi,[rip+0x2d8d]        # 4040 <_ZSt4cout@@GLIBCXX_3.4>
    12b3:	e8 f8 fd ff ff       	call   10b0 <_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c@plt>
    12b8:	48 8d 35 5a 0e 00 00 	lea    rsi,[rip+0xe5a]        # 2119 <_ZNSt8__detailL19_S_invalid_state_idE+0x71>
    12bf:	48 89 c7             	mov    rdi,rax
    12c2:	e8 b9 fd ff ff       	call   1080 <_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc@plt>
    12c7:	83 85 f0 fb ff ff 01 	add    DWORD PTR [rbp-0x410],0x1
    12ce:	eb aa                	jmp    127a <main+0x95>
    12d0:	48 8d 35 44 0e 00 00 	lea    rsi,[rip+0xe44]        # 211b <_ZNSt8__detailL19_S_invalid_state_idE+0x73>
    12d7:	48 8d 3d 62 2d 00 00 	lea    rdi,[rip+0x2d62]        # 4040 <_ZSt4cout@@GLIBCXX_3.4>
    12de:	e8 9d fd ff ff       	call   1080 <_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc@plt>
    12e3:	48 89 c3             	mov    rbx,rax
    12e6:	48 8d 85 00 fc ff ff 	lea    rax,[rbp-0x400]
    12ed:	48 89 c7             	mov    rdi,rax
    12f0:	e8 6b fd ff ff       	call   1060 <strlen@plt>
    12f5:	48 89 c6             	mov    rsi,rax
    12f8:	48 89 df             	mov    rdi,rbx
    12fb:	e8 50 fd ff ff       	call   1050 <_ZNSolsEm@plt>
    1300:	48 89 c2             	mov    rdx,rax
    1303:	48 8b 05 c6 2c 00 00 	mov    rax,QWORD PTR [rip+0x2cc6]        # 3fd0 <_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_@GLIBCXX_3.4>
    130a:	48 89 c6             	mov    rsi,rax
    130d:	48 89 d7             	mov    rdi,rdx
    1310:	e8 7b fd ff ff       	call   1090 <_ZNSolsEPFRSoS_E@plt>
    1315:	48 8d 85 00 fc ff ff 	lea    rax,[rbp-0x400]
    131c:	48 89 c7             	mov    rdi,rax
    131f:	e8 3c fd ff ff       	call   1060 <strlen@plt>
    1324:	89 85 fc fb ff ff    	mov    DWORD PTR [rbp-0x404],eax
    132a:	83 bd fc fb ff ff 1a 	cmp    DWORD PTR [rbp-0x404],0x1a
    1331:	75 40                	jne    1373 <main+0x18e>
    1333:	c7 85 f4 fb ff ff 00 	mov    DWORD PTR [rbp-0x40c],0x0
    133a:	00 00 00 
    133d:	8b 85 fc fb ff ff    	mov    eax,DWORD PTR [rbp-0x404]
    1343:	3b 85 f4 fb ff ff    	cmp    eax,DWORD PTR [rbp-0x40c]
    1349:	7e 36                	jle    1381 <main+0x19c>
    134b:	8b 85 f4 fb ff ff    	mov    eax,DWORD PTR [rbp-0x40c]
    1351:	48 98                	cdqe   
    1353:	0f b6 84 05 00 fc ff 	movzx  eax,BYTE PTR [rbp+rax*1-0x400]
    135a:	ff 
    135b:	88 85 ef fb ff ff    	mov    BYTE PTR [rbp-0x411],al
    1361:	80 bd ef fb ff ff 2a 	cmp    BYTE PTR [rbp-0x411],0x2a
    1368:	75 39                	jne    13a3 <main+0x1be>
    136a:	83 85 f4 fb ff ff 01 	add    DWORD PTR [rbp-0x40c],0x1
    1371:	eb ca                	jmp    133d <main+0x158>
    1373:	48 8d 3d a6 0d 00 00 	lea    rdi,[rip+0xda6]        # 2120 <_ZNSt8__detailL19_S_invalid_state_idE+0x78>
    137a:	e8 51 fd ff ff       	call   10d0 <puts@plt>
    137f:	eb 0c                	jmp    138d <main+0x1a8>
    1381:	48 8d 3d a9 0d 00 00 	lea    rdi,[rip+0xda9]        # 2131 <_ZNSt8__detailL19_S_invalid_state_idE+0x89>
    1388:	e8 43 fd ff ff       	call   10d0 <puts@plt>
    138d:	b8 00 00 00 00       	mov    eax,0x0
    1392:	48 8b 4d e8          	mov    rcx,QWORD PTR [rbp-0x18]
    1396:	64 48 33 0c 25 28 00 	xor    rcx,QWORD PTR fs:0x28
    139d:	00 00 
    139f:	74 16                	je     13b7 <main+0x1d2>
    13a1:	eb 0f                	jmp    13b2 <main+0x1cd>
    13a3:	90                   	nop
    13a4:	48 8d 3d 75 0d 00 00 	lea    rdi,[rip+0xd75]        # 2120 <_ZNSt8__detailL19_S_invalid_state_idE+0x78>
    13ab:	e8 20 fd ff ff       	call   10d0 <puts@plt>
    13b0:	eb db                	jmp    138d <main+0x1a8>
    13b2:	e8 e9 fc ff ff       	call   10a0 <__stack_chk_fail@plt>
    13b7:	48 81 c4 18 04 00 00 	add    rsp,0x418
    13be:	5b                   	pop    rbx
    13bf:	5d                   	pop    rbp
    13c0:	c3                   	ret    

00000000000013c1 <_Z41__static_initialization_and_destruction_0ii>:
    13c1:	55                   	push   rbp
    13c2:	48 89 e5             	mov    rbp,rsp
    13c5:	48 83 ec 10          	sub    rsp,0x10
    13c9:	89 7d fc             	mov    DWORD PTR [rbp-0x4],edi
    13cc:	89 75 f8             	mov    DWORD PTR [rbp-0x8],esi
    13cf:	83 7d fc 01          	cmp    DWORD PTR [rbp-0x4],0x1
    13d3:	75 32                	jne    1407 <_Z41__static_initialization_and_destruction_0ii+0x46>
    13d5:	81 7d f8 ff ff 00 00 	cmp    DWORD PTR [rbp-0x8],0xffff
    13dc:	75 29                	jne    1407 <_Z41__static_initialization_and_destruction_0ii+0x46>
    13de:	48 8d 3d 6c 2d 00 00 	lea    rdi,[rip+0x2d6c]        # 4151 <_ZStL8__ioinit>
    13e5:	e8 d6 fc ff ff       	call   10c0 <_ZNSt8ios_base4InitC1Ev@plt>
    13ea:	48 8d 15 17 2c 00 00 	lea    rdx,[rip+0x2c17]        # 4008 <__dso_handle>
    13f1:	48 8d 35 59 2d 00 00 	lea    rsi,[rip+0x2d59]        # 4151 <_ZStL8__ioinit>
    13f8:	48 8b 05 f9 2b 00 00 	mov    rax,QWORD PTR [rip+0x2bf9]        # 3ff8 <_ZNSt8ios_base4InitD1Ev@GLIBCXX_3.4>
    13ff:	48 89 c7             	mov    rdi,rax
    1402:	e8 69 fc ff ff       	call   1070 <__cxa_atexit@plt>
    1407:	90                   	nop
    1408:	c9                   	leave  
    1409:	c3                   	ret    

000000000000140a <_GLOBAL__sub_I_main>:
    140a:	55                   	push   rbp
    140b:	48 89 e5             	mov    rbp,rsp
    140e:	be ff ff 00 00       	mov    esi,0xffff
    1413:	bf 01 00 00 00       	mov    edi,0x1
    1418:	e8 a4 ff ff ff       	call   13c1 <_Z41__static_initialization_and_destruction_0ii>
    141d:	5d                   	pop    rbp
    141e:	c3                   	ret    
    141f:	90                   	nop

0000000000001420 <__libc_csu_init>:
    1420:	41 57                	push   r15
    1422:	49 89 d7             	mov    r15,rdx
    1425:	41 56                	push   r14
    1427:	49 89 f6             	mov    r14,rsi
    142a:	41 55                	push   r13
    142c:	41 89 fd             	mov    r13d,edi
    142f:	41 54                	push   r12
    1431:	4c 8d 25 00 29 00 00 	lea    r12,[rip+0x2900]        # 3d38 <__frame_dummy_init_array_entry>
    1438:	55                   	push   rbp
    1439:	48 8d 2d 08 29 00 00 	lea    rbp,[rip+0x2908]        # 3d48 <__init_array_end>
    1440:	53                   	push   rbx
    1441:	4c 29 e5             	sub    rbp,r12
    1444:	48 83 ec 08          	sub    rsp,0x8
    1448:	e8 b3 fb ff ff       	call   1000 <_init>
    144d:	48 c1 fd 03          	sar    rbp,0x3
    1451:	74 1b                	je     146e <__libc_csu_init+0x4e>
    1453:	31 db                	xor    ebx,ebx
    1455:	0f 1f 00             	nop    DWORD PTR [rax]
    1458:	4c 89 fa             	mov    rdx,r15
    145b:	4c 89 f6             	mov    rsi,r14
    145e:	44 89 ef             	mov    edi,r13d
    1461:	41 ff 14 dc          	call   QWORD PTR [r12+rbx*8]
    1465:	48 83 c3 01          	add    rbx,0x1
    1469:	48 39 dd             	cmp    rbp,rbx
    146c:	75 ea                	jne    1458 <__libc_csu_init+0x38>
    146e:	48 83 c4 08          	add    rsp,0x8
    1472:	5b                   	pop    rbx
    1473:	5d                   	pop    rbp
    1474:	41 5c                	pop    r12
    1476:	41 5d                	pop    r13
    1478:	41 5e                	pop    r14
    147a:	41 5f                	pop    r15
    147c:	c3                   	ret    
    147d:	0f 1f 00             	nop    DWORD PTR [rax]

0000000000001480 <__libc_csu_fini>:
    1480:	c3                   	ret    

Disassembly of section .fini:

0000000000001484 <_fini>:
    1484:	48 83 ec 08          	sub    rsp,0x8
    1488:	48 83 c4 08          	add    rsp,0x8
    148c:	c3                   	ret    
