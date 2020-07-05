
/host/Documents/Stuff/Github/Solutions/Cyber Security/DSTA CDDC 2020/Warp Gate 4/Suspicious Service/SuspiciousSvc:     file format elf32-i386


Disassembly of section .init:

00001000 <_init>:
    1000:	f3 0f 1e fb          	endbr32 
    1004:	53                   	push   ebx
    1005:	83 ec 08             	sub    esp,0x8
    1008:	e8 03 01 00 00       	call   1110 <__x86.get_pc_thunk.bx>
    100d:	81 c3 b7 2f 00 00    	add    ebx,0x2fb7
    1013:	8b 83 28 00 00 00    	mov    eax,DWORD PTR [ebx+0x28]
    1019:	85 c0                	test   eax,eax
    101b:	74 02                	je     101f <_init+0x1f>
    101d:	ff d0                	call   eax
    101f:	83 c4 08             	add    esp,0x8
    1022:	5b                   	pop    ebx
    1023:	c3                   	ret    

Disassembly of section .plt:

00001030 <.plt>:
    1030:	ff b3 04 00 00 00    	push   DWORD PTR [ebx+0x4]
    1036:	ff a3 08 00 00 00    	jmp    DWORD PTR [ebx+0x8]
    103c:	0f 1f 40 00          	nop    DWORD PTR [eax+0x0]
    1040:	f3 0f 1e fb          	endbr32 
    1044:	68 00 00 00 00       	push   0x0
    1049:	e9 e2 ff ff ff       	jmp    1030 <.plt>
    104e:	66 90                	xchg   ax,ax
    1050:	f3 0f 1e fb          	endbr32 
    1054:	68 08 00 00 00       	push   0x8
    1059:	e9 d2 ff ff ff       	jmp    1030 <.plt>
    105e:	66 90                	xchg   ax,ax
    1060:	f3 0f 1e fb          	endbr32 
    1064:	68 10 00 00 00       	push   0x10
    1069:	e9 c2 ff ff ff       	jmp    1030 <.plt>
    106e:	66 90                	xchg   ax,ax
    1070:	f3 0f 1e fb          	endbr32 
    1074:	68 18 00 00 00       	push   0x18
    1079:	e9 b2 ff ff ff       	jmp    1030 <.plt>
    107e:	66 90                	xchg   ax,ax

Disassembly of section .plt.got:

00001080 <__cxa_finalize@plt>:
    1080:	f3 0f 1e fb          	endbr32 
    1084:	ff a3 24 00 00 00    	jmp    DWORD PTR [ebx+0x24]
    108a:	66 0f 1f 44 00 00    	nop    WORD PTR [eax+eax*1+0x0]

Disassembly of section .plt.sec:

00001090 <setbuf@plt>:
    1090:	f3 0f 1e fb          	endbr32 
    1094:	ff a3 0c 00 00 00    	jmp    DWORD PTR [ebx+0xc]
    109a:	66 0f 1f 44 00 00    	nop    WORD PTR [eax+eax*1+0x0]

000010a0 <gets@plt>:
    10a0:	f3 0f 1e fb          	endbr32 
    10a4:	ff a3 10 00 00 00    	jmp    DWORD PTR [ebx+0x10]
    10aa:	66 0f 1f 44 00 00    	nop    WORD PTR [eax+eax*1+0x0]

000010b0 <system@plt>:
    10b0:	f3 0f 1e fb          	endbr32 
    10b4:	ff a3 14 00 00 00    	jmp    DWORD PTR [ebx+0x14]
    10ba:	66 0f 1f 44 00 00    	nop    WORD PTR [eax+eax*1+0x0]

000010c0 <__libc_start_main@plt>:
    10c0:	f3 0f 1e fb          	endbr32 
    10c4:	ff a3 18 00 00 00    	jmp    DWORD PTR [ebx+0x18]
    10ca:	66 0f 1f 44 00 00    	nop    WORD PTR [eax+eax*1+0x0]

Disassembly of section .text:

000010d0 <_start>:
    10d0:	f3 0f 1e fb          	endbr32 
    10d4:	31 ed                	xor    ebp,ebp
    10d6:	5e                   	pop    esi
    10d7:	89 e1                	mov    ecx,esp
    10d9:	83 e4 f0             	and    esp,0xfffffff0
    10dc:	50                   	push   eax
    10dd:	54                   	push   esp
    10de:	52                   	push   edx
    10df:	e8 22 00 00 00       	call   1106 <_start+0x36>
    10e4:	81 c3 e0 2e 00 00    	add    ebx,0x2ee0
    10ea:	8d 83 4c d3 ff ff    	lea    eax,[ebx-0x2cb4]
    10f0:	50                   	push   eax
    10f1:	8d 83 dc d2 ff ff    	lea    eax,[ebx-0x2d24]
    10f7:	50                   	push   eax
    10f8:	51                   	push   ecx
    10f9:	56                   	push   esi
    10fa:	ff b3 34 00 00 00    	push   DWORD PTR [ebx+0x34]
    1100:	e8 bb ff ff ff       	call   10c0 <__libc_start_main@plt>
    1105:	f4                   	hlt    
    1106:	8b 1c 24             	mov    ebx,DWORD PTR [esp]
    1109:	c3                   	ret    
    110a:	66 90                	xchg   ax,ax
    110c:	66 90                	xchg   ax,ax
    110e:	66 90                	xchg   ax,ax

00001110 <__x86.get_pc_thunk.bx>:
    1110:	8b 1c 24             	mov    ebx,DWORD PTR [esp]
    1113:	c3                   	ret    
    1114:	66 90                	xchg   ax,ax
    1116:	66 90                	xchg   ax,ax
    1118:	66 90                	xchg   ax,ax
    111a:	66 90                	xchg   ax,ax
    111c:	66 90                	xchg   ax,ax
    111e:	66 90                	xchg   ax,ax

00001120 <deregister_tm_clones>:
    1120:	e8 e4 00 00 00       	call   1209 <__x86.get_pc_thunk.dx>
    1125:	81 c2 9f 2e 00 00    	add    edx,0x2e9f
    112b:	8d 8a 44 00 00 00    	lea    ecx,[edx+0x44]
    1131:	8d 82 44 00 00 00    	lea    eax,[edx+0x44]
    1137:	39 c8                	cmp    eax,ecx
    1139:	74 1d                	je     1158 <deregister_tm_clones+0x38>
    113b:	8b 82 1c 00 00 00    	mov    eax,DWORD PTR [edx+0x1c]
    1141:	85 c0                	test   eax,eax
    1143:	74 13                	je     1158 <deregister_tm_clones+0x38>
    1145:	55                   	push   ebp
    1146:	89 e5                	mov    ebp,esp
    1148:	83 ec 14             	sub    esp,0x14
    114b:	51                   	push   ecx
    114c:	ff d0                	call   eax
    114e:	83 c4 10             	add    esp,0x10
    1151:	c9                   	leave  
    1152:	c3                   	ret    
    1153:	8d 74 26 00          	lea    esi,[esi+eiz*1+0x0]
    1157:	90                   	nop
    1158:	c3                   	ret    
    1159:	8d b4 26 00 00 00 00 	lea    esi,[esi+eiz*1+0x0]

00001160 <register_tm_clones>:
    1160:	e8 a4 00 00 00       	call   1209 <__x86.get_pc_thunk.dx>
    1165:	81 c2 5f 2e 00 00    	add    edx,0x2e5f
    116b:	55                   	push   ebp
    116c:	89 e5                	mov    ebp,esp
    116e:	53                   	push   ebx
    116f:	8d 8a 44 00 00 00    	lea    ecx,[edx+0x44]
    1175:	8d 82 44 00 00 00    	lea    eax,[edx+0x44]
    117b:	83 ec 04             	sub    esp,0x4
    117e:	29 c8                	sub    eax,ecx
    1180:	89 c3                	mov    ebx,eax
    1182:	c1 e8 1f             	shr    eax,0x1f
    1185:	c1 fb 02             	sar    ebx,0x2
    1188:	01 d8                	add    eax,ebx
    118a:	d1 f8                	sar    eax,1
    118c:	74 14                	je     11a2 <register_tm_clones+0x42>
    118e:	8b 92 38 00 00 00    	mov    edx,DWORD PTR [edx+0x38]
    1194:	85 d2                	test   edx,edx
    1196:	74 0a                	je     11a2 <register_tm_clones+0x42>
    1198:	83 ec 08             	sub    esp,0x8
    119b:	50                   	push   eax
    119c:	51                   	push   ecx
    119d:	ff d2                	call   edx
    119f:	83 c4 10             	add    esp,0x10
    11a2:	8b 5d fc             	mov    ebx,DWORD PTR [ebp-0x4]
    11a5:	c9                   	leave  
    11a6:	c3                   	ret    
    11a7:	8d b4 26 00 00 00 00 	lea    esi,[esi+eiz*1+0x0]
    11ae:	66 90                	xchg   ax,ax

000011b0 <__do_global_dtors_aux>:
    11b0:	f3 0f 1e fb          	endbr32 
    11b4:	55                   	push   ebp
    11b5:	89 e5                	mov    ebp,esp
    11b7:	53                   	push   ebx
    11b8:	e8 53 ff ff ff       	call   1110 <__x86.get_pc_thunk.bx>
    11bd:	81 c3 07 2e 00 00    	add    ebx,0x2e07
    11c3:	83 ec 04             	sub    esp,0x4
    11c6:	80 bb 44 00 00 00 00 	cmp    BYTE PTR [ebx+0x44],0x0
    11cd:	75 27                	jne    11f6 <__do_global_dtors_aux+0x46>
    11cf:	8b 83 24 00 00 00    	mov    eax,DWORD PTR [ebx+0x24]
    11d5:	85 c0                	test   eax,eax
    11d7:	74 11                	je     11ea <__do_global_dtors_aux+0x3a>
    11d9:	83 ec 0c             	sub    esp,0xc
    11dc:	ff b3 40 00 00 00    	push   DWORD PTR [ebx+0x40]
    11e2:	e8 99 fe ff ff       	call   1080 <__cxa_finalize@plt>
    11e7:	83 c4 10             	add    esp,0x10
    11ea:	e8 31 ff ff ff       	call   1120 <deregister_tm_clones>
    11ef:	c6 83 44 00 00 00 01 	mov    BYTE PTR [ebx+0x44],0x1
    11f6:	8b 5d fc             	mov    ebx,DWORD PTR [ebp-0x4]
    11f9:	c9                   	leave  
    11fa:	c3                   	ret    
    11fb:	8d 74 26 00          	lea    esi,[esi+eiz*1+0x0]
    11ff:	90                   	nop

00001200 <frame_dummy>:
    1200:	f3 0f 1e fb          	endbr32 
    1204:	e9 57 ff ff ff       	jmp    1160 <register_tm_clones>

00001209 <__x86.get_pc_thunk.dx>:
    1209:	8b 14 24             	mov    edx,DWORD PTR [esp]
    120c:	c3                   	ret    

0000120d <main>:
    120d:	f3 0f 1e fb          	endbr32 
    1211:	55                   	push   ebp
    1212:	89 e5                	mov    ebp,esp
    1214:	53                   	push   ebx
    1215:	81 ec 04 01 00 00    	sub    esp,0x104
    121b:	e8 f0 fe ff ff       	call   1110 <__x86.get_pc_thunk.bx>
    1220:	81 c3 a4 2d 00 00    	add    ebx,0x2da4
    1226:	8b 83 2c 00 00 00    	mov    eax,DWORD PTR [ebx+0x2c]
    122c:	8b 00                	mov    eax,DWORD PTR [eax]
    122e:	6a 00                	push   0x0
    1230:	50                   	push   eax
    1231:	e8 5a fe ff ff       	call   1090 <setbuf@plt>
    1236:	83 c4 08             	add    esp,0x8
    1239:	8b 83 30 00 00 00    	mov    eax,DWORD PTR [ebx+0x30]
    123f:	8b 00                	mov    eax,DWORD PTR [eax]
    1241:	6a 00                	push   0x0
    1243:	50                   	push   eax
    1244:	e8 47 fe ff ff       	call   1090 <setbuf@plt>
    1249:	83 c4 08             	add    esp,0x8
    124c:	8b 83 20 00 00 00    	mov    eax,DWORD PTR [ebx+0x20]
    1252:	8b 00                	mov    eax,DWORD PTR [eax]
    1254:	6a 00                	push   0x0
    1256:	50                   	push   eax
    1257:	e8 34 fe ff ff       	call   1090 <setbuf@plt>
    125c:	83 c4 08             	add    esp,0x8
    125f:	c7 45 f8 78 56 34 12 	mov    DWORD PTR [ebp-0x8],0x12345678
    1266:	8d 85 f8 fe ff ff    	lea    eax,[ebp-0x108]
    126c:	50                   	push   eax
    126d:	e8 2e fe ff ff       	call   10a0 <gets@plt>
    1272:	83 c4 04             	add    esp,0x4
    1275:	81 7d f8 00 3d 34 01 	cmp    DWORD PTR [ebp-0x8],0x1343d00
    127c:	75 0f                	jne    128d <main+0x80>
    127e:	8d 83 44 e0 ff ff    	lea    eax,[ebx-0x1fbc]
    1284:	50                   	push   eax
    1285:	e8 26 fe ff ff       	call   10b0 <system@plt>
    128a:	83 c4 04             	add    esp,0x4
    128d:	b8 00 00 00 00       	mov    eax,0x0
    1292:	8b 5d fc             	mov    ebx,DWORD PTR [ebp-0x4]
    1295:	c9                   	leave  
    1296:	c3                   	ret    
    1297:	66 90                	xchg   ax,ax
    1299:	66 90                	xchg   ax,ax
    129b:	66 90                	xchg   ax,ax
    129d:	66 90                	xchg   ax,ax
    129f:	90                   	nop

000012a0 <__libc_csu_init>:
    12a0:	f3 0f 1e fb          	endbr32 
    12a4:	55                   	push   ebp
    12a5:	e8 6b 00 00 00       	call   1315 <__x86.get_pc_thunk.bp>
    12aa:	81 c5 1a 2d 00 00    	add    ebp,0x2d1a
    12b0:	57                   	push   edi
    12b1:	56                   	push   esi
    12b2:	53                   	push   ebx
    12b3:	83 ec 0c             	sub    esp,0xc
    12b6:	89 eb                	mov    ebx,ebp
    12b8:	8b 7c 24 28          	mov    edi,DWORD PTR [esp+0x28]
    12bc:	e8 3f fd ff ff       	call   1000 <_init>
    12c1:	8d 9d 04 ff ff ff    	lea    ebx,[ebp-0xfc]
    12c7:	8d 85 00 ff ff ff    	lea    eax,[ebp-0x100]
    12cd:	29 c3                	sub    ebx,eax
    12cf:	c1 fb 02             	sar    ebx,0x2
    12d2:	74 29                	je     12fd <__libc_csu_init+0x5d>
    12d4:	31 f6                	xor    esi,esi
    12d6:	8d b4 26 00 00 00 00 	lea    esi,[esi+eiz*1+0x0]
    12dd:	8d 76 00             	lea    esi,[esi+0x0]
    12e0:	83 ec 04             	sub    esp,0x4
    12e3:	57                   	push   edi
    12e4:	ff 74 24 2c          	push   DWORD PTR [esp+0x2c]
    12e8:	ff 74 24 2c          	push   DWORD PTR [esp+0x2c]
    12ec:	ff 94 b5 00 ff ff ff 	call   DWORD PTR [ebp+esi*4-0x100]
    12f3:	83 c6 01             	add    esi,0x1
    12f6:	83 c4 10             	add    esp,0x10
    12f9:	39 f3                	cmp    ebx,esi
    12fb:	75 e3                	jne    12e0 <__libc_csu_init+0x40>
    12fd:	83 c4 0c             	add    esp,0xc
    1300:	5b                   	pop    ebx
    1301:	5e                   	pop    esi
    1302:	5f                   	pop    edi
    1303:	5d                   	pop    ebp
    1304:	c3                   	ret    
    1305:	8d b4 26 00 00 00 00 	lea    esi,[esi+eiz*1+0x0]
    130c:	8d 74 26 00          	lea    esi,[esi+eiz*1+0x0]

00001310 <__libc_csu_fini>:
    1310:	f3 0f 1e fb          	endbr32 
    1314:	c3                   	ret    

00001315 <__x86.get_pc_thunk.bp>:
    1315:	8b 2c 24             	mov    ebp,DWORD PTR [esp]
    1318:	c3                   	ret    

Disassembly of section .fini:

0000131c <_fini>:
    131c:	f3 0f 1e fb          	endbr32 
    1320:	53                   	push   ebx
    1321:	83 ec 08             	sub    esp,0x8
    1324:	e8 e7 fd ff ff       	call   1110 <__x86.get_pc_thunk.bx>
    1329:	81 c3 9b 2c 00 00    	add    ebx,0x2c9b
    132f:	83 c4 08             	add    esp,0x8
    1332:	5b                   	pop    ebx
    1333:	c3                   	ret    
