;;; Segment .text (00401000)

;; fn00401000: 00401000
;;   Called from:
;;     0040102A (in fn00401010)
fn00401000 proc
	mov	eax,004033A0
	ret
00401006                   CC CC CC CC CC CC CC CC CC CC       ..........

;; fn00401010: 00401010
;;   Called from:
;;     004010E3 (in fn00401040)
;;     004010F9 (in fn00401040)
;;     0040110F (in fn00401040)
;;     00401119 (in fn00401040)
;;     0040112F (in fn00401040)
;;     0040114B (in fn00401040)
;;     00401155 (in fn00401040)
;;     0040120D (in fn00401040)
;;     00401223 (in fn00401040)
;;     00401239 (in fn00401040)
;;     00401254 (in fn00401040)
fn00401010 proc
	push	ebp
	mov	ebp,esp
	push	esi
	mov	esi,[ebp+08]
	push	01
	call	dword ptr [004020CC]
	add	esp,04
	lea	ecx,[ebp+0C]
	push	ecx
	push	00
	push	esi
	push	eax
	call	00401000
	push	dword ptr [eax+04]
	push	dword ptr [eax]
	call	dword ptr [004020C0]
	add	esp,18
	pop	esi
	pop	ebp
	ret

;; fn00401040: 00401040
;;   Called from:
;;     00401438 (in Win32CrtStartup)
fn00401040 proc
	push	ebx
	push	esi
	mov	esi,[004020A8]
	push	edi
	nop	dword ptr [eax+00000000]

l00401050:
	push	000003E8
	call	dword ptr [00402008]
	push	00402110
	call	esi
	mov	edx,[00403398]
	add	esp,04
	mov	ebx,[00403018]
	mov	edi,[00403394]
	cmp	edx,FF
	jnz	0040109A

l0040107C:
	test	edi,edi
	jg	00401088

l00401080:
	test	ebx,ebx
	jg	00401088

l00401084:
	xor	edx,edx
	jmp	00401094

l00401088:
	dec	edi
	mov	edx,0000003B
	mov	[00403394],edi

l00401094:
	mov	[00403398],edx

l0040109A:
	cmp	edi,FF
	jnz	004010B9

l0040109F:
	test	ebx,ebx
	jle	004010B1

l004010A3:
	dec	ebx
	mov	edi,0000003B
	mov	[00403018],ebx
	jmp	004010B3

l004010B1:
	xor	edi,edi

l004010B3:
	mov	[00403394],edi

l004010B9:
	test	ebx,ebx
	jnz	004010C9

l004010BD:
	test	edi,edi
	jnz	004010C9

l004010C1:
	test	edx,edx
	jz	00401168

l004010C9:
	mov	ebx,[00402004]
	push	0C
	push	F5
	call	ebx
	mov	edi,[00402000]
	push	eax
	call	edi
	push	00402114
	call	00401010
	add	esp,04
	push	0E
	push	F5
	call	ebx
	push	eax
	call	edi
	push	00402134
	call	00401010
	add	esp,04
	push	0F
	push	F5
	call	ebx
	push	eax
	call	edi
	push	00402174
	call	00401010
	push	00402184
	call	00401010
	add	esp,08
	push	0A
	push	F5
	call	ebx
	push	eax
	call	edi
	push	004021A8
	call	00401010
	push	dword ptr [00403398]
	push	dword ptr [00403394]
	push	dword ptr [00403018]
	push	004021C4
	call	00401010
	push	004021A8
	call	00401010
	add	esp,18
	dec	dword ptr [00403398]
	jmp	00401050

l00401168:
	mov	ecx,0040301C
	lea	esi,[ecx+01]

l00401170:
	mov	al,[ecx]
	inc	ecx
	test	al,al
	jnz	00401170

l00401177:
	sub	ecx,esi
	test	ecx,ecx
	jle	004011F3

l0040117D:
	nop	dword ptr [eax]

l00401180:
	cmp	edi,ecx
	jge	004011D3

l00401184:
	cmp	edx,ecx
	jge	004011B3

l00401188:
	nop	dword ptr [eax+eax+00000000]

l00401190:
	add	byte ptr [edx+0040301C],06
	mov	eax,0040301C
	inc	edx
	lea	esi,[eax+01]

l004011A0:
	mov	cl,[eax]
	inc	eax
	test	cl,cl
	jnz	004011A0

l004011A7:
	sub	eax,esi
	cmp	edx,eax
	jl	00401190

l004011AD:
	mov	[00403398],edx

l004011B3:
	mov	ecx,0040301C
	inc	edi
	lea	esi,[ecx+01]
	nop	dword ptr [eax+00]

l004011C0:
	mov	al,[ecx]
	inc	ecx
	test	al,al
	jnz	004011C0

l004011C7:
	sub	ecx,esi
	cmp	edi,ecx
	jl	00401184

l004011CD:
	mov	[00403394],edi

l004011D3:
	mov	ecx,0040301C
	inc	ebx
	lea	esi,[ecx+01]
	nop	dword ptr [eax+00]

l004011E0:
	mov	al,[ecx]
	inc	ecx
	test	al,al
	jnz	004011E0

l004011E7:
	sub	ecx,esi
	cmp	ebx,ecx
	jl	00401180

l004011ED:
	mov	[00403018],ebx

l004011F3:
	mov	ebx,[00402004]
	push	0C
	push	F5
	call	ebx
	mov	edi,[00402000]
	push	eax
	call	edi
	push	00402114
	call	00401010
	add	esp,04
	push	0E
	push	F5
	call	ebx
	push	eax
	call	edi
	push	00402134
	call	00401010
	add	esp,04
	push	0F
	push	F5
	call	ebx
	push	eax
	call	edi
	push	004021E4
	call	00401010
	add	esp,04
	push	0D
	push	F5
	call	ebx
	push	eax
	call	edi
	push	0040301C
	push	004021F4
	call	00401010
	add	esp,08
	push	00317040
	call	dword ptr [00402008]
	pop	edi
	pop	esi
	xor	eax,eax
	pop	ebx
	ret
0040126D                                        3B 0D 04              ;..
00401270 30 40 00 F2 75 02 F2 C3 F2 E9 79 02 00 00 56 6A 0@..u.....y...Vj
00401280 01 E8 7E 0B 00 00 E8 55 06 00 00 50 E8 A9 0B 00 ..~....U...P....
00401290 00 E8 43 06 00 00 8B F0 E8 CD 0B 00 00 6A 01 89 ..C..........j..
004012A0 30 E8 F9 03 00 00 83 C4 0C 5E 84 C0 74 73 DB E2 0........^..ts..
004012B0 E8 69 08 00 00 68 4A 1B 40 00 E8 6D 05 00 00 E8 .i...hJ.@..m....
004012C0 18 06 00 00 50 E8 46 0B 00 00 59 59 85 C0 75 51 ....P.F...YY..uQ
004012D0 E8 11 06 00 00 E8 60 06 00 00 85 C0 74 0B 68 D9 ......`.....t.h.
004012E0 18 40 00 E8 22 0B 00 00 59 E8 28 06 00 00 E8 23 .@.."...Y.(....#
004012F0 06 00 00 E8 FD 05 00 00 E8 DC 05 00 00 50 E8 5B .............P.[
00401300 0B 00 00 59 E8 E9 05 00 00 84 C0 74 05 E8 04 0B ...Y.......t....
00401310 00 00 E8 C2 05 00 00 E8 50 07 00 00 85 C0 75 01 ........P.....u.
00401320 C3 6A 07 E8 2A 06 00 00 CC E8 EF 05 00 00 33 C0 .j..*.........3.
00401330 C3 E8 7E 07 00 00 E8 9E 05 00 00 50 E8 23 0B 00 ..~........P.#..
00401340 00 59 C3                                        .Y.            

l00401343:
	push	14
	push	004025F8
	call	00401B80
	push	01
	call	00401666
	pop	ecx
	test	al,al
	jz	004014AF

l0040135F:
	xor	bl,bl
	mov	[ebp-19],bl
	and	dword ptr [ebp-04],00
	call	00401634
	mov	[ebp-24],al
	mov	eax,[00403354]
	xor	ecx,ecx
	inc	ecx
	cmp	eax,ecx
	jz	004014AF

l00401380:
	test	eax,eax
	jnz	004013CD

l00401384:
	mov	[00403354],ecx
	push	004020F0
	push	004020E4
	call	00401E28
	pop	ecx
	pop	ecx
	test	eax,eax
	jz	004013B0

l0040139F:
	mov	dword ptr [ebp-04],FFFFFFFE
	mov	eax,000000FF
	jmp	0040149F

l004013B0:
	push	004020E0
	push	004020D8
	call	00401E22
	pop	ecx
	pop	ecx
	mov	dword ptr [00403354],00000002
	jmp	004013D2

l004013CD:
	mov	bl,cl
	mov	[ebp-19],bl

l004013D2:
	push	dword ptr [ebp-24]
	call	004017BA
	pop	ecx
	call	00401946
	mov	esi,eax
	xor	edi,edi
	cmp	[esi],edi
	jz	00401403

l004013E8:
	push	esi
	call	00401726
	pop	ecx
	test	al,al
	jz	00401403

l004013F3:
	mov	esi,[esi]
	push	edi
	push	02
	push	edi
	mov	ecx,esi
	call	dword ptr [004020D4]
	call	esi

l00401403:
	call	0040194C
	mov	esi,eax
	cmp	[esi],edi
	jz	00401421

l0040140E:
	push	esi
	call	00401726
	pop	ecx
	test	al,al
	jz	00401421

l00401419:
	push	dword ptr [esi]
	call	00401E58
	pop	ecx

l00401421:
	call	00401E1C
	mov	edi,eax
	call	00401E46
	mov	esi,[eax]
	call	00401E40
	push	edi
	push	esi
	push	dword ptr [eax]
	call	00401040
	add	esp,0C
	mov	esi,eax
	call	00401A71
	test	al,al
	jz	004014B6

l0040144B:
	test	bl,bl
	jnz	00401454

l0040144F:
	call	00401E4C

l00401454:
	push	00
	push	01
	call	004017D7
	pop	ecx
	pop	ecx
	mov	dword ptr [ebp-04],FFFFFFFE
	mov	eax,esi
	jmp	0040149F
0040146A                               8B 4D EC 8B 01 8B           .M....
00401470 00 89 45 E0 51 50 E8 83 09 00 00 59 59 C3 8B 65 ..E.QP.....YY..e
00401480 E8 E8 EB 05 00 00 84 C0 74 32 80 7D E7 00 75 05 ........t2.}..u.
00401490 E8 BD 09 00 00 C7 45 FC FE FF FF FF 8B 45 E0    ......E......E.

l0040149F:
	mov	ecx,[ebp-10]
	mov	fs:[00000000],ecx
	pop	ecx
	pop	edi
	pop	esi
	pop	ebx
	leave
	ret

l004014AF:
	push	07
	call	00401952

l004014B6:
	push	esi
	call	00401E2E
004014BC                                     FF 75 E0 E8             .u..
004014C0 70 09 00 00 CC                                  p....          

;; Win32CrtStartup: 004014C5
Win32CrtStartup proc
	call	0040188E
	jmp	00401343
004014CF                                              55                U
004014D0 8B EC 6A 00 FF 15 30 20 40 00 FF 75 08 FF 15 34 ..j...0 @..u...4
004014E0 20 40 00 68 09 04 00 C0 FF 15 2C 20 40 00 50 FF  @.h......, @.P.
004014F0 15 28 20 40 00 5D C3 55 8B EC 81 EC 24 03 00 00 .( @.].U....$...
00401500 6A 17 E8 87 09 00 00 85 C0 74 05 6A 02 59 CD 29 j........t.j.Y.)
00401510 A3 38 31 40 00 89 0D 34 31 40 00 89 15 30 31 40 .81@...41@...01@
00401520 00 89 1D 2C 31 40 00 89 35 28 31 40 00 89 3D 24 ...,1@..5(1@..=$
00401530 31 40 00 66 8C 15 50 31 40 00 66 8C 0D 44 31 40 1@.f..P1@.f..D1@
00401540 00 66 8C 1D 20 31 40 00 66 8C 05 1C 31 40 00 66 .f.. 1@.f...1@.f
00401550 8C 25 18 31 40 00 66 8C 2D 14 31 40 00 9C 8F 05 .%.1@.f.-.1@....
00401560 48 31 40 00 8B 45 00 A3 3C 31 40 00 8B 45 04 A3 H1@..E..<1@..E..
00401570 40 31 40 00 8D 45 08 A3 4C 31 40 00 8B 85 DC FC @1@..E..L1@.....
00401580 FF FF C7 05 88 30 40 00 01 00 01 00 A1 40 31 40 .....0@......@1@
00401590 00 A3 44 30 40 00 C7 05 38 30 40 00 09 04 00 C0 ..D0@...80@.....
004015A0 C7 05 3C 30 40 00 01 00 00 00 C7 05 48 30 40 00 ..<0@.......H0@.
004015B0 01 00 00 00 6A 04 58 6B C0 00 C7 80 4C 30 40 00 ....j.Xk....L0@.
004015C0 02 00 00 00 6A 04 58 6B C0 00 8B 0D 04 30 40 00 ....j.Xk.....0@.
004015D0 89 4C 05 F8 6A 04 58 C1 E0 00 8B 0D 00 30 40 00 .L..j.X......0@.
004015E0 89 4C 05 F8 68 08 21 40 00 E8 E1 FE FF FF C9 C3 .L..h.!@........

;; fn004015F0: 004015F0
;;   Called from:
;;     0040176F (in fn00401726)
fn004015F0 proc
	push	ebp
	mov	ebp,esp
	mov	eax,[ebp+08]
	push	esi
	mov	ecx,[eax+3C]
	add	ecx,eax
	movzx	eax,word ptr [ecx+14]
	lea	edx,[ecx+18]
	add	edx,eax
	movzx	eax,word ptr [ecx+06]
	imul	esi,eax,28
	add	esi,edx
	cmp	edx,esi
	jz	0040162B

l00401612:
	mov	ecx,[ebp+0C]

l00401615:
	cmp	ecx,[edx+0C]
	jc	00401624

l0040161A:
	mov	eax,[edx+08]
	add	eax,[edx+0C]
	cmp	ecx,eax
	jc	00401630

l00401624:
	add	edx,28
	cmp	edx,esi
	jnz	00401615

l0040162B:
	xor	eax,eax

l0040162D:
	pop	esi
	pop	ebp
	ret

l00401630:
	mov	eax,edx
	jmp	0040162D

;; fn00401634: 00401634
;;   Called from:
;;     00401368 (in Win32CrtStartup)
fn00401634 proc
	push	esi
	call	00401DDA
	test	eax,eax
	jz	0040165E

l0040163E:
	mov	eax,fs:[00000018]
	mov	esi,00403358
	mov	edx,[eax+04]
	jmp	00401652

l0040164E:
	cmp	edx,eax
	jz	00401662

l00401652:
	xor	eax,eax
	mov	ecx,edx
	lock
	cmpxchg	[esi],ecx
	test	eax,eax
	jnz	0040164E

l0040165E:
	xor	al,al
	pop	esi
	ret

l00401662:
	mov	al,01
	pop	esi
	ret

;; fn00401666: 00401666
;;   Called from:
;;     00401351 (in Win32CrtStartup)
fn00401666 proc
	push	ebp
	mov	ebp,esp
	cmp	dword ptr [ebp+08],00
	jnz	00401676

l0040166F:
	mov	byte ptr [0040335C],01

l00401676:
	call	00401C0A
	call	004018F2
	test	al,al
	jnz	00401688

l00401684:
	xor	al,al
	pop	ebp
	ret

l00401688:
	call	004018F2
	test	al,al
	jnz	0040169B

l00401691:
	push	00
	call	004018F2
	pop	ecx
	jmp	00401684

l0040169B:
	mov	al,01
	pop	ebp
	ret
0040169F                                              55                U
004016A0 8B EC 80 3D 5D 33 40 00 00 74 04 B0 01 5D C3 56 ...=]3@..t...].V
004016B0 8B 75 08 85 F6 74 05 83 FE 01 75 62 E8 19 07 00 .u...t....ub....
004016C0 00 85 C0 74 26 85 F6 75 22 68 60 33 40 00 E8 9D ...t&..u"h`3@...
004016D0 07 00 00 59 85 C0 75 0F 68 6C 33 40 00 E8 8E 07 ...Y..u.hl3@....
004016E0 00 00 59 85 C0 74 2B 32 C0 EB 30 83 C9 FF 89 0D ..Y..t+2..0.....
004016F0 60 33 40 00 89 0D 64 33 40 00 89 0D 68 33 40 00 `3@...d3@...h3@.
00401700 89 0D 6C 33 40 00 89 0D 70 33 40 00 89 0D 74 33 ..l3@...p3@...t3
00401710 40 00 C6 05 5D 33 40 00 01 B0 01 5E 5D C3 6A 05 @...]3@....^].j.
00401720 E8 2D 02 00 00 CC                               .-....         

;; fn00401726: 00401726
;;   Called from:
;;     004013E9 (in Win32CrtStartup)
;;     0040140F (in Win32CrtStartup)
fn00401726 proc
	push	08
	push	00402618
	call	00401B80
	and	dword ptr [ebp-04],00
	mov	eax,00005A4D
	cmp	[00400000],ax
	jnz	004017A1

l00401744:
	mov	eax,[0040003C]
	cmp	dword ptr [eax+00400000],00004550
	jnz	004017A1

l00401755:
	mov	ecx,0000010B
	cmp	[eax+00400018],cx
	jnz	004017A1

l00401763:
	mov	eax,[ebp+08]
	mov	ecx,00400000
	sub	eax,ecx
	push	eax
	push	ecx
	call	004015F0
	pop	ecx
	pop	ecx
	test	eax,eax
	jz	004017A1

l0040177A:
	cmp	dword ptr [eax+24],00
	jl	004017A1

l00401780:
	mov	dword ptr [ebp-04],FFFFFFFE
	mov	al,01
	jmp	004017AA
0040178B                                  8B 45 EC 8B 00            .E...
00401790 33 C9 81 38 05 00 00 C0 0F 94 C1 8B C1 C3 8B 65 3..8...........e
004017A0 E8                                              .              

l004017A1:
	mov	dword ptr [ebp-04],FFFFFFFE
	xor	al,al

l004017AA:
	mov	ecx,[ebp-10]
	mov	fs:[00000000],ecx
	pop	ecx
	pop	edi
	pop	esi
	pop	ebx
	leave
	ret

;; fn004017BA: 004017BA
;;   Called from:
;;     004013D5 (in Win32CrtStartup)
fn004017BA proc
	push	ebp
	mov	ebp,esp
	call	00401DDA
	test	eax,eax
	jz	004017D5

l004017C6:
	cmp	byte ptr [ebp+08],00
	jnz	004017D5

l004017CC:
	xor	eax,eax
	mov	ecx,00403358
	xchg	[ecx],eax

l004017D5:
	pop	ebp
	ret

;; fn004017D7: 004017D7
;;   Called from:
;;     00401458 (in Win32CrtStartup)
fn004017D7 proc
	push	ebp
	mov	ebp,esp
	cmp	byte ptr [0040335C],00
	jz	004017E9

l004017E3:
	cmp	byte ptr [ebp+0C],00
	jnz	004017FB

l004017E9:
	push	dword ptr [ebp+08]
	call	004018F2
	push	dword ptr [ebp+08]
	call	004018F2
	pop	ecx
	pop	ecx

l004017FB:
	mov	al,01
	pop	ebp
	ret
004017FF                                              55                U
00401800 8B EC 83 3D 60 33 40 00 FF FF 75 08 75 07 E8 69 ...=`3@...u.u..i
00401810 06 00 00 EB 0B 68 60 33 40 00 E8 57 06 00 00 59 .....h`3@..W...Y
00401820 F7 D8 59 1B C0 F7 D0 23 45 08 5D C3 55 8B EC FF ..Y....#E.].U...
00401830 75 08 E8 C8 FF FF FF F7 D8 59 1B C0 F7 D8 48 5D u........Y....H]
00401840 C3                                              .              

;; fn00401841: 00401841
;;   Called from:
;;     004018A8 (in fn0040188E)
fn00401841 proc
	push	ebp
	mov	ebp,esp
	sub	esp,14
	and	dword ptr [ebp-0C],00
	lea	eax,[ebp-0C]
	and	dword ptr [ebp-08],00
	push	eax
	call	dword ptr [00402014]
	mov	eax,[ebp-08]
	xor	eax,[ebp-0C]
	mov	[ebp-04],eax
	call	dword ptr [00402018]
	xor	[ebp-04],eax
	call	dword ptr [0040201C]
	xor	[ebp-04],eax
	lea	eax,[ebp-14]
	push	eax
	call	dword ptr [00402020]
	mov	eax,[ebp-10]
	lea	ecx,[ebp-04]
	xor	eax,[ebp-14]
	xor	eax,[ebp-04]
	xor	eax,ecx
	leave
	ret

;; fn0040188E: 0040188E
;;   Called from:
;;     004014C5 (in Win32CrtStartup)
fn0040188E proc
	mov	ecx,[00403004]
	push	esi
	push	edi
	mov	edi,BB40E64E
	mov	esi,FFFF0000
	cmp	ecx,edi
	jz	004018A8

l004018A4:
	test	esi,ecx
	jnz	004018CE

l004018A8:
	call	00401841
	mov	ecx,eax
	cmp	ecx,edi
	jnz	004018BA

l004018B3:
	mov	ecx,BB40E64F
	jmp	004018C8

l004018BA:
	test	esi,ecx
	jnz	004018C8

l004018BE:
	or	eax,00004711
	shl	eax,10
	or	ecx,eax

l004018C8:
	mov	[00403004],ecx

l004018CE:
	not	ecx
	pop	edi
	mov	[00403000],ecx
	pop	esi
	ret
004018D9                            33 C0 C3 33 C0 40 C3          3..3.@.
004018E0 B8 00 40 00 00 C3 68 78 33 40 00 FF 15 10 20 40 ..@...hx3@.... @
004018F0 00 C3                                           ..             

;; fn004018F2: 004018F2
;;   Called from:
;;     0040167B (in fn00401666)
;;     00401688 (in fn00401666)
;;     00401693 (in fn00401666)
;;     004017EC (in fn004017D7)
;;     004017F4 (in fn004017D7)
fn004018F2 proc
	mov	al,01
	ret
004018F5                68 00 00 03 00 68 00 00 01 00 6A      h....h....j
00401900 00 E8 7C 05 00 00 83 C4 0C 85 C0 75 01 C3 6A 07 ..|........u..j.
00401910 E8 3D 00 00 00 CC                               .=....         

;; fn00401916: 00401916
;;   Called from:
;;     004013FB (in Win32CrtStartup)
fn00401916 proc
	ret
00401917                      B8 80 33 40 00 C3 E8 DE F6        ..3@.....
00401920 FF FF 8B 48 04 83 08 24 89 48 04 E8 E7 FF FF FF ...H...$.H......
00401930 8B 48 04 83 08 02 89 48 04 C3 33 C0 39 05 0C 30 .H.....H..3.9..0
00401940 40 00 0F 94 C0 C3                               @.....         

;; fn00401946: 00401946
;;   Called from:
;;     004013DB (in Win32CrtStartup)
fn00401946 proc
	mov	eax,004033AC
	ret

;; fn0040194C: 0040194C
;;   Called from:
;;     00401403 (in Win32CrtStartup)
fn0040194C proc
	mov	eax,004033A8
	ret

;; fn00401952: 00401952
;;   Called from:
;;     004014B1 (in Win32CrtStartup)
fn00401952 proc
	push	ebp
	mov	ebp,esp
	sub	esp,00000324
	push	ebx
	push	17
	call	00401E8E
	test	eax,eax
	jz	0040196C

l00401967:
	mov	ecx,[ebp+08]
	int	29

l0040196C:
	push	03
	call	00401B16
	mov	dword ptr [esp],000002CC
	lea	eax,[ebp-00000324]
	push	00
	push	eax
	call	00401DF2
	add	esp,0C
	mov	[ebp-00000274],eax
	mov	[ebp-00000278],ecx
	mov	[ebp-0000027C],edx
	mov	[ebp-00000280],ebx
	mov	[ebp-00000284],esi
	mov	[ebp-00000288],edi
	mov	[ebp-0000025C],ss
	mov	[ebp-00000268],cs
	mov	[ebp-0000028C],ds
	mov	[ebp-00000290],es
	mov	[ebp-00000294],fs
	mov	[ebp-00000298],gs
	pushf
	pop	dword ptr [ebp-00000264]
	mov	eax,[ebp+04]
	mov	[ebp-0000026C],eax
	lea	eax,[ebp+04]
	mov	[ebp-00000260],eax
	mov	dword ptr [ebp-00000324],00010001
	mov	eax,[eax-04]
	push	50
	mov	[ebp-00000270],eax
	lea	eax,[ebp-58]
	push	00
	push	eax
	call	00401DF2
	mov	eax,[ebp+04]
	add	esp,0C
	mov	dword ptr [ebp-58],40000015
	mov	dword ptr [ebp-54],00000001
	mov	[ebp-4C],eax
	call	dword ptr [0040200C]
	push	00
	lea	ebx,[eax-01]
	neg	ebx
	lea	eax,[ebp-58]
	mov	[ebp-08],eax
	lea	eax,[ebp-00000324]
	sbb	bl,bl
	mov	[ebp-04],eax
	inc	bl
	call	dword ptr [00402030]
	lea	eax,[ebp-08]
	push	eax
	call	dword ptr [00402034]
	test	eax,eax
	jnz	00401A69

l00401A5D:
	test	bl,bl
	jnz	00401A69

l00401A61:
	push	03
	call	00401B16
	pop	ecx

l00401A69:
	pop	ebx
	leave
	ret
00401A6C                                     E9 68 FE FF             .h..
00401A70 FF                                              .              

;; fn00401A71: 00401A71
;;   Called from:
;;     00401442 (in Win32CrtStartup)
fn00401A71 proc
	push	00
	call	dword ptr [00402038]
	test	eax,eax
	jz	00401AB1

l00401A7D:
	mov	ecx,00005A4D
	cmp	[eax],cx
	jnz	00401AB1

l00401A87:
	mov	ecx,[eax+3C]
	add	ecx,eax
	cmp	dword ptr [ecx],00004550
	jnz	00401AB1

l00401A94:
	mov	eax,0000010B
	cmp	[ecx+18],ax
	jnz	00401AB1

l00401A9F:
	cmp	dword ptr [ecx+74],0E
	jbe	00401AB1

l00401AA5:
	cmp	dword ptr [ecx+000000E8],00
	jz	00401AB1

l00401AAE:
	mov	al,01
	ret

l00401AB1:
	xor	al,al
	ret
00401AB4             68 C0 1A 40 00 FF 15 30 20 40 00 C3     h..@...0 @..
00401AC0 55 8B EC 56 57 8B 7D 08 8B 37 81 3E 63 73 6D E0 U..VW.}..7.>csm.
00401AD0 75 25 83 7E 10 03 75 1F 8B 46 14 3D 20 05 93 19 u%.~..u..F.= ...
00401AE0 74 1D 3D 21 05 93 19 74 16 3D 22 05 93 19 74 0F t.=!...t.="...t.
00401AF0 3D 00 40 99 01 74 08 5F 33 C0 5E 5D C2 04 00 E8 =.@..t._3.^]....
00401B00 E2 02 00 00 89 30 8B 77 04 E8 DE 02 00 00 89 30 .....0.w.......0
00401B10 E8 73 03 00 00 CC                               .s....         

;; fn00401B16: 00401B16
;;   Called from:
;;     0040196E (in fn00401952)
;;     00401A63 (in fn00401952)
fn00401B16 proc
	and	dword ptr [00403388],00
	ret
00401B1E                                           53 56               SV
00401B20 BE E8 25 40 00 BB E8 25 40 00 3B F3 73 19 57 8B ..%@...%@.;.s.W.
00401B30 3E 85 FF 74 0A 8B CF FF 15 D4 20 40 00 FF D7 83 >..t...... @....
00401B40 C6 04 3B F3 72 E9 5F 5E 5B C3 53 56 BE F0 25 40 ..;.r._^[.SV..%@
00401B50 00 BB F0 25 40 00 3B F3 73 19 57 8B 3E 85 FF 74 ...%@.;.s.W.>..t
00401B60 0A 8B CF FF 15 D4 20 40 00 FF D7 83 C6 04 3B F3 ...... @......;.
00401B70 72 E9 5F 5E 5B C3 CC CC CC CC CC CC CC CC CC CC r._^[...........

;; fn00401B80: 00401B80
;;   Called from:
;;     0040134A (in Win32CrtStartup)
;;     0040172D (in fn00401726)
fn00401B80 proc
	push	00401BDB
	push	dword ptr fs:[00000000]
	mov	eax,[esp+10]
	mov	[esp+10],ebp
	lea	ebp,[esp+10]
	sub	esp,eax
	push	ebx
	push	esi
	push	edi
	mov	eax,[00403004]
	xor	[ebp-04],eax
	xor	eax,ebp
	push	eax
	mov	[ebp-18],esp
	push	dword ptr [ebp-08]
	mov	eax,[ebp-04]
	mov	dword ptr [ebp-04],FFFFFFFE
	mov	[ebp-08],eax
	lea	eax,[ebp-10]
	mov	fs:[00000000],eax
	repne ret
00401BC6                   8B 4D F0 64 89 0D 00 00 00 00       .M.d......
00401BD0 59 5F 5F 5E 5B 8B E5 5D 51 F2 C3 55 8B EC 56 8B Y__^[..]Q..U..V.
00401BE0 75 08 FF 36 E8 AB 02 00 00 FF 75 14 89 06 FF 75 u..6......u....u
00401BF0 10 FF 75 0C 56 68 6D 12 40 00 68 04 30 40 00 E8 ..u.Vhm.@.h.0@..
00401C00 F4 01 00 00 83 C4 1C 5E 5D C3                   .......^].     

;; fn00401C0A: 00401C0A
;;   Called from:
;;     00401676 (in fn00401666)
fn00401C0A proc
	push	ebp
	mov	ebp,esp
	and	dword ptr [0040338C],00
	sub	esp,24
	or	dword ptr [00403010],01
	push	0A
	call	00401E8E
	test	eax,eax
	jz	00401DD6

l00401C2D:
	and	dword ptr [ebp-10],00
	xor	eax,eax
	push	ebx
	push	esi
	push	edi
	xor	ecx,ecx
	lea	edi,[ebp-24]
	push	ebx
	cpuid
	mov	esi,ebx
	pop	ebx
	mov	[edi],eax
	mov	[edi+04],esi
	mov	[edi+08],ecx
	xor	ecx,ecx
	mov	[edi+0C],edx
	mov	eax,[ebp-24]
	mov	edi,[ebp-1C]
	mov	[ebp-0C],eax
	xor	edi,6C65746E
	mov	eax,[ebp-18]
	xor	eax,49656E69
	mov	[ebp-08],eax
	mov	eax,[ebp-20]
	xor	eax,756E6547
	mov	[ebp-04],eax
	xor	eax,eax
	inc	eax
	push	ebx
	cpuid
	mov	esi,ebx
	pop	ebx
	lea	ebx,[ebp-24]
	mov	[ebx],eax
	mov	eax,[ebp-04]
	mov	[ebx+04],esi
	or	eax,edi
	or	eax,[ebp-08]
	mov	[ebx+08],ecx
	mov	[ebx+0C],edx
	jnz	00401CD7

l00401C94:
	mov	eax,[ebp-24]
	and	eax,0FFF3FF0
	cmp	eax,000106C0
	jz	00401CC6

l00401CA3:
	cmp	eax,00020660
	jz	00401CC6

l00401CAA:
	cmp	eax,00020670
	jz	00401CC6

l00401CB1:
	cmp	eax,00030650
	jz	00401CC6

l00401CB8:
	cmp	eax,00030660
	jz	00401CC6

l00401CBF:
	cmp	eax,00030670
	jnz	00401CD7

l00401CC6:
	mov	edi,[00403390]
	or	edi,01
	mov	[00403390],edi
	jmp	00401CDD

l00401CD7:
	mov	edi,[00403390]

l00401CDD:
	mov	ecx,[ebp-1C]
	push	07
	pop	eax
	mov	[ebp-04],ecx
	cmp	[ebp-0C],eax
	jl	00401D1A

l00401CEB:
	xor	ecx,ecx
	push	ebx
	cpuid
	mov	esi,ebx
	pop	ebx
	lea	ebx,[ebp-24]
	mov	[ebx],eax
	mov	[ebx+04],esi
	mov	[ebx+08],ecx
	mov	ecx,[ebp-04]
	mov	[ebx+0C],edx
	mov	ebx,[ebp-20]
	test	ebx,00000200
	jz	00401D1D

l00401D0F:
	or	edi,02
	mov	[00403390],edi
	jmp	00401D1D

l00401D1A:
	mov	ebx,[ebp-10]

l00401D1D:
	mov	eax,[00403010]
	or	eax,02
	mov	dword ptr [0040338C],00000001
	mov	[00403010],eax
	test	ecx,00100000
	jz	00401DD3

l00401D40:
	or	eax,04
	mov	dword ptr [0040338C],00000002
	mov	[00403010],eax
	test	ecx,08000000
	jz	00401DD3

l00401D5A:
	test	ecx,10000000
	jz	00401DD3

l00401D62:
	xor	ecx,ecx
	xgetbv
	mov	[ebp-14],eax
	mov	[ebp-10],edx
	mov	eax,[ebp-14]
	mov	ecx,[ebp-10]
	push	06
	pop	esi
	and	eax,esi
	cmp	eax,esi
	jnz	00401DD3

l00401D7C:
	mov	eax,[00403010]
	or	eax,08
	mov	dword ptr [0040338C],00000003
	mov	[00403010],eax
	test	bl,20
	jz	00401DD3

l00401D98:
	or	eax,20
	mov	dword ptr [0040338C],00000005
	mov	[00403010],eax
	mov	eax,D0030000
	and	ebx,eax
	cmp	ebx,eax
	jnz	00401DD3

l00401DB5:
	mov	eax,[ebp-14]
	mov	edx,000000E0
	mov	ecx,[ebp-10]
	and	eax,edx
	cmp	eax,edx
	jnz	00401DD3

l00401DC6:
	or	dword ptr [00403010],40
	mov	[0040338C],esi

l00401DD3:
	pop	edi
	pop	esi
	pop	ebx

l00401DD6:
	xor	eax,eax
	leave
	ret

;; fn00401DDA: 00401DDA
;;   Called from:
;;     00401635 (in fn00401634)
;;     004017BD (in fn004017BA)
fn00401DDA proc
	xor	eax,eax
	cmp	[00403014],eax
	setnz	al
	ret
00401DE6                   FF 25 4C 20 40 00 FF 25 44 20       .%L @..%D 
00401DF0 40 00 FF 25 40 20 40 00 FF 25 48 20 40 00 FF 25 @..%@ @..%H @..%
00401E00 A4 20 40 00 FF 25 A0 20 40 00 FF 25 64 20 40 00 . @..%. @..%d @.
00401E10 FF 25 B8 20 40 00 FF 25 B0 20 40 00 FF 25 AC 20 .%. @..%. @..%. 
00401E20 40 00 FF 25 9C 20 40 00 FF 25 90 20 40 00 FF 25 @..%. @..%. @..%
00401E30 8C 20 40 00 FF 25 78 20 40 00 FF 25 C8 20 40 00 . @..%x @..%. @.
00401E40 FF 25 74 20 40 00 FF 25 70 20 40 00 FF 25 98 20 .%t @..%p @..%. 
00401E50 40 00 FF 25 7C 20 40 00 FF 25 6C 20 40 00 FF 25 @..%| @..%l @..%
00401E60 5C 20 40 00 FF 25 54 20 40 00 FF 25 C4 20 40 00 \ @..%T @..%. @.
00401E70 FF 25 B4 20 40 00 FF 25 94 20 40 00 FF 25 80 20 .%. @..%. @..%. 
00401E80 40 00 FF 25 84 20 40 00 FF 25 88 20 40 00       @..%. @..%. @. 
00401E8E                                           FF 25               .%
00401E90 24 20 40 00 55 8B EC 51 83 3D 8C 33 40 00 01 7C $ @.U..Q.=.3@..|
00401EA0 66 81 7D 08 B4 02 00 C0 74 09 81 7D 08 B5 02 00 f.}.....t..}....
00401EB0 C0 75 54 0F AE 5D FC 8B 45 FC 83 F0 3F A8 81 74 .uT..]..E...?..t
00401EC0 3F A9 04 02 00 00 75 07 B8 8E 00 00 C0 C9 C3 A9 ?.....u.........
00401ED0 02 01 00 00 74 2A A9 08 04 00 00 75 07 B8 91 00 ....t*.....u....
00401EE0 00 C0 C9 C3 A9 10 08 00 00 75 07 B8 93 00 00 C0 .........u......
00401EF0 C9 C3 A9 20 10 00 00 75 0E B8 8F 00 00 C0 C9 C3 ... ...u........
00401F00 B8 90 00 00 C0 C9 C3 8B 45 08 C9 C3             ........E...   
;;; Segment .rdata (00402000)
__imp__SetConsoleTextAttribute		; 00402000
	dd	0x000027A8
__imp__GetStdHandle		; 00402004
	dd	0x000027C2
__imp__Sleep		; 00402008
	dd	0x000027D2
__imp__IsDebuggerPresent		; 0040200C
	dd	0x00002BE2
__imp__InitializeSListHead		; 00402010
	dd	0x00002BCC
__imp__GetSystemTimeAsFileTime		; 00402014
	dd	0x00002BB2
__imp__GetCurrentThreadId		; 00402018
	dd	0x00002B9C
__imp__GetCurrentProcessId		; 0040201C
	dd	0x00002B86
__imp__QueryPerformanceCounter		; 00402020
	dd	0x00002B6C
__imp__IsProcessorFeaturePresent		; 00402024
	dd	0x00002B50
__imp__TerminateProcess		; 00402028
	dd	0x00002B3C
__imp__GetCurrentProcess		; 0040202C
	dd	0x00002B28
__imp__SetUnhandledExceptionFilter		; 00402030
	dd	0x00002B0A
__imp__UnhandledExceptionFilter		; 00402034
	dd	0x00002AEE
__imp__GetModuleHandleW		; 00402038
	dd	0x00002BF6
0040203C                                     00 00 00 00             ....
__imp__memset		; 00402040
	dd	0x0000281C
__imp____current_exception_context		; 00402044
	dd	0x000027FE
__imp___except_handler4_common		; 00402048
	dd	0x00002826
__imp____current_exception		; 0040204C
	dd	0x000027E8
00402050 00 00 00 00                                     ....           
__imp___set_new_mode		; 00402054
	dd	0x000029C8
00402058                         00 00 00 00                     ....   
__imp___configthreadlocale		; 0040205C
	dd	0x000029B2
00402060 00 00 00 00                                     ....           
__imp____setusermatherr		; 00402064
	dd	0x000028AA
00402068                         00 00 00 00                     ....   
__imp___register_thread_local_exe_atexit_callback		; 0040206C
	dd	0x00002984
__imp____p___argv		; 00402070
	dd	0x00002962
__imp____p___argc		; 00402074
	dd	0x00002954
__imp___exit		; 00402078
	dd	0x0000293E
__imp___c_exit		; 0040207C
	dd	0x0000297A
__imp___crt_atexit		; 00402080
	dd	0x00002A20
__imp___controlfp_s		; 00402084
	dd	0x00002A2E
__imp__terminate		; 00402088
	dd	0x00002A3E
__imp__exit		; 0040208C
	dd	0x00002936
__imp___initterm_e		; 00402090
	dd	0x00002928
__imp___register_onexit_function		; 00402094
	dd	0x00002A04
__imp___cexit		; 00402098
	dd	0x00002970
__imp___initterm		; 0040209C
	dd	0x0000291C
__imp___set_app_type		; 004020A0
	dd	0x0000289A
__imp___seh_filter_exe		; 004020A4
	dd	0x00002888
__imp__system		; 004020A8
	dd	0x0000287E
__imp___get_initial_narrow_environment		; 004020AC
	dd	0x000028FA
__imp___initialize_narrow_environment		; 004020B0
	dd	0x000028D8
__imp___initialize_onexit_table		; 004020B4
	dd	0x000029E8
__imp___configure_narrow_argv		; 004020B8
	dd	0x000028BE
004020BC                                     00 00 00 00             ....
__imp____stdio_common_vfprintf		; 004020C0
	dd	0x00002864
__imp____p__commode		; 004020C4
	dd	0x000029D8
__imp___set_fmode		; 004020C8
	dd	0x00002946
__imp____acrt_iob_func		; 004020CC
	dd	0x00002852
004020D0 00 00 00 00 16 19 40 00 00 00 00 00 31 13 40 00 ......@.....1.@.
004020E0 00 00 00 00 00 00 00 00 7E 12 40 00 29 13 40 00 ........~.@.).@.
004020F0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ................
00402100 00 00 00 00 00 00 00 00 38 30 40 00 88 30 40 00 ........80@..0@.
00402110 63 6C 73 00 5B 21 57 21 41 21 52 21 4E 21 49 21 cls.[!W!A!R!N!I!
00402120 4E 21 47 21 5D 20 4E 6F 20 63 68 65 61 74 69 6E N!G!] No cheatin
00402130 67 20 0A 00 23 20 54 68 69 73 20 70 72 6F 67 72 g ..# This progr
00402140 61 6D 20 69 73 20 72 75 6E 6E 69 6E 67 20 74 68 am is running th
00402150 65 20 43 48 45 41 54 49 4E 47 20 50 52 45 56 45 e CHEATING PREVE
00402160 4E 54 49 4F 4E 20 53 59 53 54 45 4D 2E 20 23 20 NTION SYSTEM. # 
00402170 0A 00 00 00 0A 09 42 65 20 70 61 74 69 65 6E 74 ......Be patient
00402180 2E 20 0A 00 09 54 68 65 6E 2C 20 79 6F 75 20 63 . ...Then, you c
00402190 61 6E 20 67 65 74 20 77 68 61 74 20 79 6F 75 20 an get what you 
004021A0 77 61 6E 74 2E 20 0A 00 09 2D 2D 2D 2D 2D 2D 2D want. ...-------
004021B0 2D 2D 2D 2D 2D 2D 2D 2D 2D 2D 2D 2D 2D 2D 2D 20 --------------- 
004021C0 0A 00 00 00 09 7C 20 20 25 30 32 64 20 20 7C 20 .....|  %02d  | 
004021D0 20 25 30 32 64 20 20 7C 20 20 25 30 32 64 20 20  %02d  |  %02d  
004021E0 7C 20 0A 00 0A 09 47 6F 6F 64 20 4A 6F 62 21 20 | ....Good Job! 
004021F0 0A 00 00 00 09 09 25 73 20 0A 00 00 00 00 00 00 ......%s .......
00402200 3A E9 AF 5E 00 00 00 00 02 00 00 00 4F 00 00 00 :..^........O...
00402210 2C 23 00 00 2C 17 00 00 00 00 00 00 3A E9 AF 5E ,#..,.......:..^
00402220 00 00 00 00 0C 00 00 00 14 00 00 00 7C 23 00 00 ............|#..
00402230 7C 17 00 00 00 00 00 00 3A E9 AF 5E 00 00 00 00 |.......:..^....
00402240 0D 00 00 00 54 02 00 00 90 23 00 00 90 17 00 00 ....T....#......
00402250 00 00 00 00 3A E9 AF 5E 00 00 00 00 0E 00 00 00 ....:..^........
00402260 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ................
00402270 B8 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ................
00402280 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ................
; ...
004022A0 00 00 00 00 00 00 00 00 00 00 00 00 04 30 40 00 .............0@.
004022B0 28 23 40 00 01 00 00 00 D4 20 40 00 00 00 00 00 (#@...... @.....
004022C0 00 00 00 00 00 00 00 00 00 01 00 00 00 00 00 00 ................
004022D0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ................
; ...
00402320 00 00 00 00 00 00 00 00 DB 1B 00 00 52 53 44 53 ............RSDS
00402330 4E FF 1B ED E9 85 2D 45 8F 73 90 68 5B 48 D6 5E N.....-E.s.h[H.^
00402340 01 00 00 00 43 3A 5C 55 73 65 72 73 5C 55 73 65 ....C:\Users\Use
00402350 72 5C 73 6F 75 72 63 65 5C 72 65 70 6F 73 5C 43 r\source\repos\C
00402360 68 65 61 74 4D 65 5C 52 65 6C 65 61 73 65 5C 43 heatMe\Release\C
00402370 68 65 61 74 4D 65 2E 70 64 62 00 00 00 00 00 00 heatMe.pdb......
00402380 20 00 00 00 20 00 00 00 01 00 00 00 1F 00 00 00  ... ...........
00402390 47 43 54 4C 00 10 00 00 0C 0F 00 00 2E 74 65 78 GCTL.........tex
004023A0 74 24 6D 6E 00 00 00 00 00 20 00 00 D4 00 00 00 t$mn..... ......
004023B0 2E 69 64 61 74 61 24 35 00 00 00 00 D4 20 00 00 .idata$5..... ..
004023C0 04 00 00 00 2E 30 30 63 66 67 00 00 D8 20 00 00 .....00cfg... ..
004023D0 04 00 00 00 2E 43 52 54 24 58 43 41 00 00 00 00 .....CRT$XCA....
004023E0 DC 20 00 00 04 00 00 00 2E 43 52 54 24 58 43 41 . .......CRT$XCA
004023F0 41 00 00 00 E0 20 00 00 04 00 00 00 2E 43 52 54 A.... .......CRT
00402400 24 58 43 5A 00 00 00 00 E4 20 00 00 04 00 00 00 $XCZ..... ......
00402410 2E 43 52 54 24 58 49 41 00 00 00 00 E8 20 00 00 .CRT$XIA..... ..
00402420 04 00 00 00 2E 43 52 54 24 58 49 41 41 00 00 00 .....CRT$XIAA...
00402430 EC 20 00 00 04 00 00 00 2E 43 52 54 24 58 49 41 . .......CRT$XIA
00402440 43 00 00 00 F0 20 00 00 04 00 00 00 2E 43 52 54 C.... .......CRT
00402450 24 58 49 5A 00 00 00 00 F4 20 00 00 04 00 00 00 $XIZ..... ......
00402460 2E 43 52 54 24 58 50 41 00 00 00 00 F8 20 00 00 .CRT$XPA..... ..
00402470 04 00 00 00 2E 43 52 54 24 58 50 5A 00 00 00 00 .....CRT$XPZ....
00402480 FC 20 00 00 04 00 00 00 2E 43 52 54 24 58 54 41 . .......CRT$XTA
00402490 00 00 00 00 00 21 00 00 08 00 00 00 2E 43 52 54 .....!.......CRT
004024A0 24 58 54 5A 00 00 00 00 08 21 00 00 20 02 00 00 $XTZ.....!.. ...
004024B0 2E 72 64 61 74 61 00 00 28 23 00 00 04 00 00 00 .rdata..(#......
004024C0 2E 72 64 61 74 61 24 73 78 64 61 74 61 00 00 00 .rdata$sxdata...
004024D0 2C 23 00 00 B8 02 00 00 2E 72 64 61 74 61 24 7A ,#.......rdata$z
004024E0 7A 7A 64 62 67 00 00 00 E4 25 00 00 04 00 00 00 zzdbg....%......
004024F0 2E 72 74 63 24 49 41 41 00 00 00 00 E8 25 00 00 .rtc$IAA.....%..
00402500 04 00 00 00 2E 72 74 63 24 49 5A 5A 00 00 00 00 .....rtc$IZZ....
00402510 EC 25 00 00 04 00 00 00 2E 72 74 63 24 54 41 41 .%.......rtc$TAA
00402520 00 00 00 00 F0 25 00 00 08 00 00 00 2E 72 74 63 .....%.......rtc
00402530 24 54 5A 5A 00 00 00 00 F8 25 00 00 3C 00 00 00 $TZZ.....%..<...
00402540 2E 78 64 61 74 61 24 78 00 00 00 00 34 26 00 00 .xdata$x....4&..
00402550 8C 00 00 00 2E 69 64 61 74 61 24 32 00 00 00 00 .....idata$2....
00402560 C0 26 00 00 14 00 00 00 2E 69 64 61 74 61 24 33 .&.......idata$3
00402570 00 00 00 00 D4 26 00 00 D4 00 00 00 2E 69 64 61 .....&.......ida
00402580 74 61 24 34 00 00 00 00 A8 27 00 00 62 04 00 00 ta$4.....'..b...
00402590 2E 69 64 61 74 61 24 36 00 00 00 00 00 30 00 00 .idata$6.....0..
004025A0 38 00 00 00 2E 64 61 74 61 00 00 00 38 30 00 00 8....data...80..
004025B0 78 03 00 00 2E 62 73 73 00 00 00 00 00 40 00 00 x....bss.....@..
004025C0 60 00 00 00 2E 72 73 72 63 24 30 31 00 00 00 00 `....rsrc$01....
004025D0 60 40 00 00 80 01 00 00 2E 72 73 72 63 24 30 32 `@.......rsrc$02
004025E0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ................
004025F0 00 00 00 00 00 00 00 00 FE FF FF FF 00 00 00 00 ................
00402600 CC FF FF FF 00 00 00 00 FE FF FF FF 6A 14 40 00 ............j.@.
00402610 7E 14 40 00 00 00 00 00 FE FF FF FF 00 00 00 00 ~.@.............
00402620 D8 FF FF FF 00 00 00 00 FE FF FF FF 8B 17 40 00 ..............@.
00402630 9E 17 40 00 D4 26 00 00 00 00 00 00 00 00 00 00 ..@..&..........
00402640 DA 27 00 00 00 20 00 00 14 27 00 00 00 00 00 00 .'... ...'......
00402650 00 00 00 00 40 28 00 00 40 20 00 00 94 27 00 00 ....@(..@ ...'..
00402660 00 00 00 00 00 00 00 00 4A 2A 00 00 C0 20 00 00 ........J*... ..
00402670 40 27 00 00 00 00 00 00 00 00 00 00 6A 2A 00 00 @'..........j*..
00402680 6C 20 00 00 38 27 00 00 00 00 00 00 00 00 00 00 l ..8'..........
00402690 8C 2A 00 00 64 20 00 00 30 27 00 00 00 00 00 00 .*..d ..0'......
004026A0 00 00 00 00 AC 2A 00 00 5C 20 00 00 28 27 00 00 .....*..\ ..('..
004026B0 00 00 00 00 00 00 00 00 CE 2A 00 00 54 20 00 00 .........*..T ..
004026C0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ................
004026D0 00 00 00 00                                     ....           
l004026D4	dd	0x000027A8
l004026D8	dd	0x000027C2
l004026DC	dd	0x000027D2
l004026E0	dd	0x00002BE2
l004026E4	dd	0x00002BCC
l004026E8	dd	0x00002BB2
l004026EC	dd	0x00002B9C
l004026F0	dd	0x00002B86
l004026F4	dd	0x00002B6C
l004026F8	dd	0x00002B50
l004026FC	dd	0x00002B3C
l00402700	dd	0x00002B28
l00402704	dd	0x00002B0A
l00402708	dd	0x00002AEE
l0040270C	dd	0x00002BF6
00402710 00 00 00 00                                     ....           
l00402714	dd	0x0000281C
l00402718	dd	0x000027FE
l0040271C	dd	0x00002826
l00402720	dd	0x000027E8
00402724             00 00 00 00                             ....       
l00402728	dd	0x000029C8
0040272C                                     00 00 00 00             ....
l00402730	dd	0x000029B2
00402734             00 00 00 00                             ....       
l00402738	dd	0x000028AA
0040273C                                     00 00 00 00             ....
l00402740	dd	0x00002984
l00402744	dd	0x00002962
l00402748	dd	0x00002954
l0040274C	dd	0x0000293E
l00402750	dd	0x0000297A
l00402754	dd	0x00002A20
l00402758	dd	0x00002A2E
l0040275C	dd	0x00002A3E
l00402760	dd	0x00002936
l00402764	dd	0x00002928
l00402768	dd	0x00002A04
l0040276C	dd	0x00002970
l00402770	dd	0x0000291C
l00402774	dd	0x0000289A
l00402778	dd	0x00002888
l0040277C	dd	0x0000287E
l00402780	dd	0x000028FA
l00402784	dd	0x000028D8
l00402788	dd	0x000029E8
l0040278C	dd	0x000028BE
00402790 00 00 00 00                                     ....           
l00402794	dd	0x00002864
l00402798	dd	0x000029D8
l0040279C	dd	0x00002946
l004027A0	dd	0x00002852
004027A4             00 00 00 00 02 05 53 65 74 43 6F 6E     ......SetCon
004027B0 73 6F 6C 65 54 65 78 74 41 74 74 72 69 62 75 74 soleTextAttribut
004027C0 65 00 D2 02 47 65 74 53 74 64 48 61 6E 64 6C 65 e...GetStdHandle
004027D0 00 00 7D 05 53 6C 65 65 70 00 4B 45 52 4E 45 4C ..}.Sleep.KERNEL
004027E0 33 32 2E 64 6C 6C 00 00 1C 00 5F 5F 63 75 72 72 32.dll....__curr
004027F0 65 6E 74 5F 65 78 63 65 70 74 69 6F 6E 00 1D 00 ent_exception...
00402800 5F 5F 63 75 72 72 65 6E 74 5F 65 78 63 65 70 74 __current_except
00402810 69 6F 6E 5F 63 6F 6E 74 65 78 74 00 48 00 6D 65 ion_context.H.me
00402820 6D 73 65 74 00 00 35 00 5F 65 78 63 65 70 74 5F mset..5._except_
00402830 68 61 6E 64 6C 65 72 34 5F 63 6F 6D 6D 6F 6E 00 handler4_common.
00402840 56 43 52 55 4E 54 49 4D 45 31 34 30 2E 64 6C 6C VCRUNTIME140.dll
00402850 00 00 00 00 5F 5F 61 63 72 74 5F 69 6F 62 5F 66 ....__acrt_iob_f
00402860 75 6E 63 00 03 00 5F 5F 73 74 64 69 6F 5F 63 6F unc...__stdio_co
00402870 6D 6D 6F 6E 5F 76 66 70 72 69 6E 74 66 00 69 00 mmon_vfprintf.i.
00402880 73 79 73 74 65 6D 00 00 42 00 5F 73 65 68 5F 66 system..B._seh_f
00402890 69 6C 74 65 72 5F 65 78 65 00 44 00 5F 73 65 74 ilter_exe.D._set
004028A0 5F 61 70 70 5F 74 79 70 65 00 2E 00 5F 5F 73 65 _app_type...__se
004028B0 74 75 73 65 72 6D 61 74 68 65 72 72 00 00 19 00 tusermatherr....
004028C0 5F 63 6F 6E 66 69 67 75 72 65 5F 6E 61 72 72 6F _configure_narro
004028D0 77 5F 61 72 67 76 00 00 35 00 5F 69 6E 69 74 69 w_argv..5._initi
004028E0 61 6C 69 7A 65 5F 6E 61 72 72 6F 77 5F 65 6E 76 alize_narrow_env
004028F0 69 72 6F 6E 6D 65 6E 74 00 00 2A 00 5F 67 65 74 ironment..*._get
00402900 5F 69 6E 69 74 69 61 6C 5F 6E 61 72 72 6F 77 5F _initial_narrow_
00402910 65 6E 76 69 72 6F 6E 6D 65 6E 74 00 38 00 5F 69 environment.8._i
00402920 6E 69 74 74 65 72 6D 00 39 00 5F 69 6E 69 74 74 nitterm.9._initt
00402930 65 72 6D 5F 65 00 58 00 65 78 69 74 00 00 25 00 erm_e.X.exit..%.
00402940 5F 65 78 69 74 00 54 00 5F 73 65 74 5F 66 6D 6F _exit.T._set_fmo
00402950 64 65 00 00 05 00 5F 5F 70 5F 5F 5F 61 72 67 63 de....__p___argc
00402960 00 00 06 00 5F 5F 70 5F 5F 5F 61 72 67 76 00 00 ....__p___argv..
00402970 17 00 5F 63 65 78 69 74 00 00 16 00 5F 63 5F 65 .._cexit...._c_e
00402980 78 69 74 00 3F 00 5F 72 65 67 69 73 74 65 72 5F xit.?._register_
00402990 74 68 72 65 61 64 5F 6C 6F 63 61 6C 5F 65 78 65 thread_local_exe
004029A0 5F 61 74 65 78 69 74 5F 63 61 6C 6C 62 61 63 6B _atexit_callback
004029B0 00 00 08 00 5F 63 6F 6E 66 69 67 74 68 72 65 61 ...._configthrea
004029C0 64 6C 6F 63 61 6C 65 00 16 00 5F 73 65 74 5F 6E dlocale..._set_n
004029D0 65 77 5F 6D 6F 64 65 00 01 00 5F 5F 70 5F 5F 63 ew_mode...__p__c
004029E0 6F 6D 6D 6F 64 65 00 00 36 00 5F 69 6E 69 74 69 ommode..6._initi
004029F0 61 6C 69 7A 65 5F 6F 6E 65 78 69 74 5F 74 61 62 alize_onexit_tab
00402A00 6C 65 00 00 3E 00 5F 72 65 67 69 73 74 65 72 5F le..>._register_
00402A10 6F 6E 65 78 69 74 5F 66 75 6E 63 74 69 6F 6E 00 onexit_function.
00402A20 1F 00 5F 63 72 74 5F 61 74 65 78 69 74 00 1D 00 .._crt_atexit...
00402A30 5F 63 6F 6E 74 72 6F 6C 66 70 5F 73 00 00 6A 00 _controlfp_s..j.
00402A40 74 65 72 6D 69 6E 61 74 65 00 61 70 69 2D 6D 73 terminate.api-ms
00402A50 2D 77 69 6E 2D 63 72 74 2D 73 74 64 69 6F 2D 6C -win-crt-stdio-l
00402A60 31 2D 31 2D 30 2E 64 6C 6C 00 61 70 69 2D 6D 73 1-1-0.dll.api-ms
00402A70 2D 77 69 6E 2D 63 72 74 2D 72 75 6E 74 69 6D 65 -win-crt-runtime
00402A80 2D 6C 31 2D 31 2D 30 2E 64 6C 6C 00 61 70 69 2D -l1-1-0.dll.api-
00402A90 6D 73 2D 77 69 6E 2D 63 72 74 2D 6D 61 74 68 2D ms-win-crt-math-
00402AA0 6C 31 2D 31 2D 30 2E 64 6C 6C 00 00 61 70 69 2D l1-1-0.dll..api-
00402AB0 6D 73 2D 77 69 6E 2D 63 72 74 2D 6C 6F 63 61 6C ms-win-crt-local
00402AC0 65 2D 6C 31 2D 31 2D 30 2E 64 6C 6C 00 00 61 70 e-l1-1-0.dll..ap
00402AD0 69 2D 6D 73 2D 77 69 6E 2D 63 72 74 2D 68 65 61 i-ms-win-crt-hea
00402AE0 70 2D 6C 31 2D 31 2D 30 2E 64 6C 6C 00 00 AD 05 p-l1-1-0.dll....
00402AF0 55 6E 68 61 6E 64 6C 65 64 45 78 63 65 70 74 69 UnhandledExcepti
00402B00 6F 6E 46 69 6C 74 65 72 00 00 6D 05 53 65 74 55 onFilter..m.SetU
00402B10 6E 68 61 6E 64 6C 65 64 45 78 63 65 70 74 69 6F nhandledExceptio
00402B20 6E 46 69 6C 74 65 72 00 17 02 47 65 74 43 75 72 nFilter...GetCur
00402B30 72 65 6E 74 50 72 6F 63 65 73 73 00 8C 05 54 65 rentProcess...Te
00402B40 72 6D 69 6E 61 74 65 50 72 6F 63 65 73 73 00 00 rminateProcess..
00402B50 86 03 49 73 50 72 6F 63 65 73 73 6F 72 46 65 61 ..IsProcessorFea
00402B60 74 75 72 65 50 72 65 73 65 6E 74 00 4D 04 51 75 turePresent.M.Qu
00402B70 65 72 79 50 65 72 66 6F 72 6D 61 6E 63 65 43 6F eryPerformanceCo
00402B80 75 6E 74 65 72 00 18 02 47 65 74 43 75 72 72 65 unter...GetCurre
00402B90 6E 74 50 72 6F 63 65 73 73 49 64 00 1C 02 47 65 ntProcessId...Ge
00402BA0 74 43 75 72 72 65 6E 74 54 68 72 65 61 64 49 64 tCurrentThreadId
00402BB0 00 00 E9 02 47 65 74 53 79 73 74 65 6D 54 69 6D ....GetSystemTim
00402BC0 65 41 73 46 69 6C 65 54 69 6D 65 00 63 03 49 6E eAsFileTime.c.In
00402BD0 69 74 69 61 6C 69 7A 65 53 4C 69 73 74 48 65 61 itializeSListHea
00402BE0 64 00 7F 03 49 73 44 65 62 75 67 67 65 72 50 72 d...IsDebuggerPr
00402BF0 65 73 65 6E 74 00 78 02 47 65 74 4D 6F 64 75 6C esent.x.GetModul
00402C00 65 48 61 6E 64 6C 65 57 00 00                   eHandleW..     
;;; Segment .data (00403000)
00403000 B1 19 BF 44 4E E6 40 BB FF FF FF FF 01 00 00 00 ...DN.@.........
00403010 01 00 00 00 01 00 00 00 18 00 00 00 3D 3E 3E 3D ............=>>=
00403020 2C 2A 75 4E 2B 5D 65 27 4E 2A 5D 65 59 4E 2B 5D ,*uN+]e'N*]eYN+]
00403030 65 27 4E 2A 5D 65 77 00 00 00 00 00 00 00 00 00 e'N*]ew.........
00403040 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ................
; ...
;;; Segment .rsrc (00404000)
00404000 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 ................
00404010 18 00 00 00 18 00 00 80 00 00 00 00 00 00 00 00 ................
00404020 00 00 00 00 00 00 01 00 01 00 00 00 30 00 00 80 ............0...
00404030 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 ................
00404040 09 04 00 00 48 00 00 00 60 40 00 00 7D 01 00 00 ....H...`@..}...
00404050 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 ................
00404060 3C 3F 78 6D 6C 20 76 65 72 73 69 6F 6E 3D 27 31 <?xml version='1
00404070 2E 30 27 20 65 6E 63 6F 64 69 6E 67 3D 27 55 54 .0' encoding='UT
00404080 46 2D 38 27 20 73 74 61 6E 64 61 6C 6F 6E 65 3D F-8' standalone=
00404090 27 79 65 73 27 3F 3E 0D 0A 3C 61 73 73 65 6D 62 'yes'?>..<assemb
004040A0 6C 79 20 78 6D 6C 6E 73 3D 27 75 72 6E 3A 73 63 ly xmlns='urn:sc
004040B0 68 65 6D 61 73 2D 6D 69 63 72 6F 73 6F 66 74 2D hemas-microsoft-
004040C0 63 6F 6D 3A 61 73 6D 2E 76 31 27 20 6D 61 6E 69 com:asm.v1' mani
004040D0 66 65 73 74 56 65 72 73 69 6F 6E 3D 27 31 2E 30 festVersion='1.0
004040E0 27 3E 0D 0A 20 20 3C 74 72 75 73 74 49 6E 66 6F '>..  <trustInfo
004040F0 20 78 6D 6C 6E 73 3D 22 75 72 6E 3A 73 63 68 65  xmlns="urn:sche
00404100 6D 61 73 2D 6D 69 63 72 6F 73 6F 66 74 2D 63 6F mas-microsoft-co
00404110 6D 3A 61 73 6D 2E 76 33 22 3E 0D 0A 20 20 20 20 m:asm.v3">..    
00404120 3C 73 65 63 75 72 69 74 79 3E 0D 0A 20 20 20 20 <security>..    
00404130 20 20 3C 72 65 71 75 65 73 74 65 64 50 72 69 76   <requestedPriv
00404140 69 6C 65 67 65 73 3E 0D 0A 20 20 20 20 20 20 20 ileges>..       
00404150 20 3C 72 65 71 75 65 73 74 65 64 45 78 65 63 75  <requestedExecu
00404160 74 69 6F 6E 4C 65 76 65 6C 20 6C 65 76 65 6C 3D tionLevel level=
00404170 27 61 73 49 6E 76 6F 6B 65 72 27 20 75 69 41 63 'asInvoker' uiAc
00404180 63 65 73 73 3D 27 66 61 6C 73 65 27 20 2F 3E 0D cess='false' />.
00404190 0A 20 20 20 20 20 20 3C 2F 72 65 71 75 65 73 74 .      </request
004041A0 65 64 50 72 69 76 69 6C 65 67 65 73 3E 0D 0A 20 edPrivileges>.. 
004041B0 20 20 20 3C 2F 73 65 63 75 72 69 74 79 3E 0D 0A    </security>..
004041C0 20 20 3C 2F 74 72 75 73 74 49 6E 66 6F 3E 0D 0A   </trustInfo>..
004041D0 3C 2F 61 73 73 65 6D 62 6C 79 3E 0D 0A 00 00 00 </assembly>.....
;;; Segment .reloc (00405000)
00405000 00 10 00 00 7C 01 00 00 01 30 1B 30 36 30 44 30 ....|....0.060D0
00405010 57 30 5C 30 64 30 6D 30 73 30 90 30 96 30 AB 30 W0\0d0m0s0.0.0.0
00405020 B5 30 CB 30 D7 30 DF 30 F5 30 0B 31 15 31 2B 31 .0.0.0.0.0.1.1+1
00405030 36 31 3C 31 42 31 47 31 51 31 5F 31 69 31 92 31 61<1B1G1Q1_1i1.1
00405040 98 31 AF 31 B4 31 CF 31 D4 31 EF 31 F5 31 01 32 .1.1.1.1.1.1.1.2
00405050 09 32 1F 32 35 32 4B 32 50 32 63 32 6F 32 B6 32 .2.252K2P2c2o2.2
00405060 DF 32 46 33 71 33 86 33 8B 33 90 33 B1 33 B6 33 .2F3q3.3.3.3.3.3
00405070 C3 33 FD 33 D6 34 DF 34 EA 34 F1 34 11 35 17 35 .3.3.4.4.4.4.5.5
00405080 1D 35 23 35 29 35 2F 35 36 35 3D 35 44 35 4B 35 .5#5)5/565=5D5K5
00405090 52 35 59 35 60 35 68 35 70 35 78 35 84 35 8D 35 R5Y5`5h5p5x5.5.5
004050A0 92 35 98 35 A2 35 AC 35 BC 35 CC 35 DC 35 E5 35 .5.5.5.5.5.5.5.5
004050B0 45 36 71 36 A4 36 CA 36 D9 36 F0 36 F6 36 FC 36 E6q6.6.6.6.6.6.6
004050C0 02 37 08 37 0E 37 14 37 29 37 3E 37 45 37 4B 37 .7.7.7.7)7>7E7K7
004050D0 5D 37 67 37 CF 37 DC 37 04 38 16 38 55 38 64 38 ]7g7.7.7.8.8U8d8
004050E0 6D 38 7A 38 90 38 CA 38 D3 38 E7 38 ED 38 18 39 m8z8.8.8.8.8.8.9
004050F0 3E 39 47 39 4D 39 2B 3A 4B 3A 55 3A 75 3A B5 3A >9G9M9+:K:U:u:.:
00405100 BB 3A 18 3B 21 3B 26 3B 39 3B 4D 3B 52 3B 65 3B .:.;!;&;9;M;R;e;
00405110 81 3B 9E 3B F6 3B FB 3B 0F 3C 19 3C C8 3C D1 3C .;.;.;.;.<.<.<.<
00405120 D9 3C 14 3D 1E 3D 27 3D 30 3D 45 3D 4E 3D 7D 3D .<.=.='=0=E=N=}=
00405130 86 3D 8F 3D 9D 3D A6 3D C8 3D CF 3D DE 3D E8 3D .=.=.=.=.=.=.=.=
00405140 EE 3D F4 3D FA 3D 00 3E 06 3E 0C 3E 12 3E 18 3E .=.=.=.>.>.>.>.>
00405150 1E 3E 24 3E 2A 3E 30 3E 36 3E 3C 3E 42 3E 48 3E .>$>*>0>6><>B>H>
00405160 4E 3E 54 3E 5A 3E 60 3E 66 3E 6C 3E 72 3E 78 3E N>T>Z>`>f>l>r>x>
00405170 7E 3E 84 3E 8A 3E 90 3E 9A 3E 00 00 00 20 00 00 ~>.>.>.>.>... ..
00405180 24 00 00 00 D4 30 DC 30 E8 30 EC 30 08 31 0C 31 $....0.0.0.0.1.1
00405190 AC 32 B0 32 B8 32 0C 36 10 36 2C 36 30 36 00 00 .2.2.2.6.6,606..
