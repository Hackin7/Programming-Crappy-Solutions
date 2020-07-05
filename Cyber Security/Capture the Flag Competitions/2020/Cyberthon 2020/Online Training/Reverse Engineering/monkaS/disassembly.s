
monkaS:     file format elf32-i386


Disassembly of section .plt:

08048290 <.plt>:
 8048290:	ff 35 04 d0 04 08    	pushl  0x804d004
 8048296:	ff 25 08 d0 04 08    	jmp    *0x804d008
 804829c:	00 00                	add    %al,(%eax)
	...

080482a0 <strcmp@plt>:
 80482a0:	ff 25 0c d0 04 08    	jmp    *0x804d00c
 80482a6:	68 00 00 00 00       	push   $0x0
 80482ab:	e9 e0 ff ff ff       	jmp    8048290 <.plt>

080482b0 <printf@plt>:
 80482b0:	ff 25 10 d0 04 08    	jmp    *0x804d010
 80482b6:	68 08 00 00 00       	push   $0x8
 80482bb:	e9 d0 ff ff ff       	jmp    8048290 <.plt>

080482c0 <puts@plt>:
 80482c0:	ff 25 14 d0 04 08    	jmp    *0x804d014
 80482c6:	68 10 00 00 00       	push   $0x10
 80482cb:	e9 c0 ff ff ff       	jmp    8048290 <.plt>

080482d0 <scanf@plt>:
 80482d0:	ff 25 18 d0 04 08    	jmp    *0x804d018
 80482d6:	68 18 00 00 00       	push   $0x18
 80482db:	e9 b0 ff ff ff       	jmp    8048290 <.plt>

080482e0 <exit@plt>:
 80482e0:	ff 25 1c d0 04 08    	jmp    *0x804d01c
 80482e6:	68 20 00 00 00       	push   $0x20
 80482eb:	e9 a0 ff ff ff       	jmp    8048290 <.plt>

080482f0 <sigaction@plt>:
 80482f0:	ff 25 20 d0 04 08    	jmp    *0x804d020
 80482f6:	68 28 00 00 00       	push   $0x28
 80482fb:	e9 90 ff ff ff       	jmp    8048290 <.plt>

08048300 <dispatch>:
 8048300:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 8048306:	ff 25 14 62 5f 08    	jmp    *0x85f6214

Disassembly of section .text:

0804830c <_start>:
 804830c:	89 25 80 61 3f 08    	mov    %esp,0x83f6180
 8048312:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 8048318:	8b a4 24 98 ff df ff 	mov    -0x200068(%esp),%esp
 804831f:	8b a4 24 98 ff df ff 	mov    -0x200068(%esp),%esp
 8048326:	8b a4 24 98 ff df ff 	mov    -0x200068(%esp),%esp
 804832d:	8b a4 24 98 ff df ff 	mov    -0x200068(%esp),%esp
 8048334:	c7 04 24 0b 00 00 00 	movl   $0xb,(%esp)
 804833b:	c7 44 24 04 24 62 5f 	movl   $0x85f6224,0x4(%esp)
 8048342:	08 
 8048343:	c7 44 24 08 00 00 00 	movl   $0x0,0x8(%esp)
 804834a:	00 
 804834b:	e8 a0 ff ff ff       	call   80482f0 <sigaction@plt>
 8048350:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 8048356:	8b a4 24 98 ff df ff 	mov    -0x200068(%esp),%esp
 804835d:	8b a4 24 98 ff df ff 	mov    -0x200068(%esp),%esp
 8048364:	8b a4 24 98 ff df ff 	mov    -0x200068(%esp),%esp
 804836b:	c7 04 24 04 00 00 00 	movl   $0x4,(%esp)
 8048372:	c7 44 24 04 b0 62 5f 	movl   $0x85f62b0,0x4(%esp)
 8048379:	08 
 804837a:	c7 44 24 08 00 00 00 	movl   $0x0,0x8(%esp)
 8048381:	00 
 8048382:	e8 69 ff ff ff       	call   80482f0 <sigaction@plt>

08048387 <_start0>:
 8048387:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 804838d:	a1 9c 61 3f 08       	mov    0x83f619c,%eax
 8048392:	8b 04 85 90 61 3f 08 	mov    0x83f6190(,%eax,4),%eax
 8048399:	c7 00 01 00 00 00    	movl   $0x1,(%eax)
 804839f:	c7 05 9c 61 3f 08 00 	movl   $0x0,0x83f619c
 80483a6:	00 00 00 
 80483a9:	a1 80 61 3f 08       	mov    0x83f6180,%eax
 80483ae:	ba 04 00 00 00       	mov    $0x4,%edx
 80483b3:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 80483b8:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 80483be:	b8 00 00 00 00       	mov    $0x0,%eax
 80483c3:	b9 00 00 00 00       	mov    $0x0,%ecx
 80483c8:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 80483cf:	00 00 00 
 80483d2:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 80483d8:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 80483df:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 80483e6:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 80483e9:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 80483f0:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 80483f7:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 80483fa:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8048401:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8048407:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804840d:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8048414:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804841b:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804841e:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8048425:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804842c:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804842f:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8048436:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804843c:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8048441:	89 c0                	mov    %eax,%eax
 8048443:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048448:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804844d:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048453:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048458:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804845f:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048465:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804846b:	89 10                	mov    %edx,(%eax)
 804846d:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048472:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048478:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804847d:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048484:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804848a:	89 10                	mov    %edx,(%eax)
 804848c:	a1 80 61 3f 08       	mov    0x83f6180,%eax
 8048491:	8b 00                	mov    (%eax),%eax
 8048493:	89 c0                	mov    %eax,%eax
 8048495:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804849a:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804849f:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80484a5:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80484aa:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80484b1:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 80484b7:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 80484bd:	89 10                	mov    %edx,(%eax)
 80484bf:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 80484c4:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80484ca:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80484cf:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80484d6:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 80484dc:	89 10                	mov    %edx,(%eax)
 80484de:	b8 09 86 04 88       	mov    $0x88048609,%eax
 80484e3:	89 c0                	mov    %eax,%eax
 80484e5:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 80484ea:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 80484ef:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80484f5:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80484fa:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048501:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048507:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804850d:	89 10                	mov    %edx,(%eax)
 804850f:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048514:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804851a:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804851f:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048526:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804852c:	89 10                	mov    %edx,(%eax)
 804852e:	b8 8a 88 04 88       	mov    $0x8804888a,%eax
 8048533:	a3 40 61 1f 08       	mov    %eax,0x81f6140
 8048538:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 804853d:	8b 04 85 a0 61 3f 08 	mov    0x83f61a0(,%eax,4),%eax
 8048544:	8b 15 40 61 1f 08    	mov    0x81f6140,%edx
 804854a:	89 10                	mov    %edx,(%eax)
 804854c:	8b 0d 98 61 3f 08    	mov    0x83f6198,%ecx
 8048552:	c7 05 b4 61 3f 08 d0 	movl   $0x85f61d0,0x83f61b4
 8048559:	61 5f 08 
 804855c:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048563:	8b 15 80 d0 04 08    	mov    0x804d080,%edx
 8048569:	89 10                	mov    %edx,(%eax)
 804856b:	8b 15 84 d0 04 08    	mov    0x804d084,%edx
 8048571:	89 50 04             	mov    %edx,0x4(%eax)
 8048574:	8b 15 88 d0 04 08    	mov    0x804d088,%edx
 804857a:	89 50 08             	mov    %edx,0x8(%eax)
 804857d:	8b 15 8c d0 04 08    	mov    0x804d08c,%edx
 8048583:	89 50 0c             	mov    %edx,0xc(%eax)
 8048586:	c7 05 b4 61 3f 08 e0 	movl   $0x85f61e0,0x83f61b4
 804858d:	61 5f 08 
 8048590:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048597:	8b 15 90 d0 04 08    	mov    0x804d090,%edx
 804859d:	89 10                	mov    %edx,(%eax)
 804859f:	8b 15 94 d0 04 08    	mov    0x804d094,%edx
 80485a5:	89 50 04             	mov    %edx,0x4(%eax)
 80485a8:	8b 15 98 d0 04 08    	mov    0x804d098,%edx
 80485ae:	89 50 08             	mov    %edx,0x8(%eax)
 80485b1:	c7 05 b4 61 3f 08 ec 	movl   $0x85f61ec,0x83f61b4
 80485b8:	61 5f 08 
 80485bb:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 80485c2:	8b 15 a0 d0 04 08    	mov    0x804d0a0,%edx
 80485c8:	89 10                	mov    %edx,(%eax)
 80485ca:	8b 15 a4 d0 04 08    	mov    0x804d0a4,%edx
 80485d0:	89 50 04             	mov    %edx,0x4(%eax)
 80485d3:	8b 15 a8 d0 04 08    	mov    0x804d0a8,%edx
 80485d9:	89 50 08             	mov    %edx,0x8(%eax)
 80485dc:	8b 15 ac d0 04 08    	mov    0x804d0ac,%edx
 80485e2:	89 50 0c             	mov    %edx,0xc(%eax)
 80485e5:	8b 15 b0 d0 04 08    	mov    0x804d0b0,%edx
 80485eb:	89 50 10             	mov    %edx,0x10(%eax)
 80485ee:	8b 15 b4 d0 04 08    	mov    0x804d0b4,%edx
 80485f4:	89 50 14             	mov    %edx,0x14(%eax)
 80485f7:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 80485fc:	8b 04 85 90 61 3f 08 	mov    0x83f6190(,%eax,4),%eax
 8048603:	c7 00 00 00 00 00    	movl   $0x0,(%eax)
 8048609:	a1 a8 61 3f 08       	mov    0x83f61a8,%eax
 804860e:	ba 09 86 04 88       	mov    $0x88048609,%edx
 8048613:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8048618:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 804861e:	b8 00 00 00 00       	mov    $0x0,%eax
 8048623:	b9 00 00 00 00       	mov    $0x0,%ecx
 8048628:	ba 00 00 00 00       	mov    $0x0,%edx
 804862d:	a0 30 60 1f 08       	mov    0x81f6030,%al
 8048632:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 8048639:	8a 15 34 60 1f 08    	mov    0x81f6034,%dl
 804863f:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 8048642:	89 15 20 60 1f 08    	mov    %edx,0x81f6020
 8048648:	a0 31 60 1f 08       	mov    0x81f6031,%al
 804864d:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 8048654:	8a 15 35 60 1f 08    	mov    0x81f6035,%dl
 804865a:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804865d:	89 15 24 60 1f 08    	mov    %edx,0x81f6024
 8048663:	a0 32 60 1f 08       	mov    0x81f6032,%al
 8048668:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804866f:	8a 15 36 60 1f 08    	mov    0x81f6036,%dl
 8048675:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 8048678:	89 15 28 60 1f 08    	mov    %edx,0x81f6028
 804867e:	a0 33 60 1f 08       	mov    0x81f6033,%al
 8048683:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804868a:	8a 15 37 60 1f 08    	mov    0x81f6037,%dl
 8048690:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 8048693:	89 15 2c 60 1f 08    	mov    %edx,0x81f602c
 8048699:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804869e:	8b 15 24 60 1f 08    	mov    0x81f6024,%edx
 80486a4:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 80486ab:	8b 04 90             	mov    (%eax,%edx,4),%eax
 80486ae:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 80486b3:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 80486b8:	8b 15 28 60 1f 08    	mov    0x81f6028,%edx
 80486be:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 80486c5:	8b 04 90             	mov    (%eax,%edx,4),%eax
 80486c8:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 80486cd:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 80486d2:	8b 15 2c 60 1f 08    	mov    0x81f602c,%edx
 80486d8:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 80486df:	8b 04 90             	mov    (%eax,%edx,4),%eax
 80486e2:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 80486e7:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 80486ec:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 80486f1:	8b 0d 20 60 1f 08    	mov    0x81f6020,%ecx
 80486f7:	c7 05 b4 61 3f 08 80 	movl   $0x804d080,0x83f61b4
 80486fe:	d0 04 08 
 8048701:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048708:	8b 15 d0 61 5f 08    	mov    0x85f61d0,%edx
 804870e:	89 10                	mov    %edx,(%eax)
 8048710:	c7 05 b4 61 3f 08 84 	movl   $0x804d084,0x83f61b4
 8048717:	d0 04 08 
 804871a:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048721:	8b 15 d4 61 5f 08    	mov    0x85f61d4,%edx
 8048727:	89 10                	mov    %edx,(%eax)
 8048729:	c7 05 b4 61 3f 08 88 	movl   $0x804d088,0x83f61b4
 8048730:	d0 04 08 
 8048733:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804873a:	8b 15 d8 61 5f 08    	mov    0x85f61d8,%edx
 8048740:	89 10                	mov    %edx,(%eax)
 8048742:	c7 05 b4 61 3f 08 8c 	movl   $0x804d08c,0x83f61b4
 8048749:	d0 04 08 
 804874c:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048753:	8b 15 dc 61 5f 08    	mov    0x85f61dc,%edx
 8048759:	89 10                	mov    %edx,(%eax)
 804875b:	c7 05 b4 61 3f 08 90 	movl   $0x804d090,0x83f61b4
 8048762:	d0 04 08 
 8048765:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804876c:	8b 15 e0 61 5f 08    	mov    0x85f61e0,%edx
 8048772:	89 10                	mov    %edx,(%eax)
 8048774:	c7 05 b4 61 3f 08 94 	movl   $0x804d094,0x83f61b4
 804877b:	d0 04 08 
 804877e:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048785:	8b 15 e4 61 5f 08    	mov    0x85f61e4,%edx
 804878b:	89 10                	mov    %edx,(%eax)
 804878d:	c7 05 b4 61 3f 08 98 	movl   $0x804d098,0x83f61b4
 8048794:	d0 04 08 
 8048797:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804879e:	8b 15 e8 61 5f 08    	mov    0x85f61e8,%edx
 80487a4:	89 10                	mov    %edx,(%eax)
 80487a6:	c7 05 b4 61 3f 08 a0 	movl   $0x804d0a0,0x83f61b4
 80487ad:	d0 04 08 
 80487b0:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 80487b7:	8b 15 ec 61 5f 08    	mov    0x85f61ec,%edx
 80487bd:	89 10                	mov    %edx,(%eax)
 80487bf:	8b 15 f0 61 5f 08    	mov    0x85f61f0,%edx
 80487c5:	89 50 04             	mov    %edx,0x4(%eax)
 80487c8:	c7 05 b4 61 3f 08 a8 	movl   $0x804d0a8,0x83f61b4
 80487cf:	d0 04 08 
 80487d2:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 80487d9:	8b 15 f4 61 5f 08    	mov    0x85f61f4,%edx
 80487df:	89 10                	mov    %edx,(%eax)
 80487e1:	8b 15 f8 61 5f 08    	mov    0x85f61f8,%edx
 80487e7:	89 50 04             	mov    %edx,0x4(%eax)
 80487ea:	c7 05 b4 61 3f 08 b0 	movl   $0x804d0b0,0x83f61b4
 80487f1:	d0 04 08 
 80487f4:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 80487fb:	8b 15 fc 61 5f 08    	mov    0x85f61fc,%edx
 8048801:	89 10                	mov    %edx,(%eax)
 8048803:	8b 15 00 62 5f 08    	mov    0x85f6200,%edx
 8048809:	89 50 04             	mov    %edx,0x4(%eax)
 804880c:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 8048811:	8b 04 85 90 61 3f 08 	mov    0x83f6190(,%eax,4),%eax
 8048818:	c7 00 01 00 00 00    	movl   $0x1,(%eax)
 804881e:	b8 00 00 00 00       	mov    $0x0,%eax
 8048823:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048828:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804882d:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048833:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048838:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804883f:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048845:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804884b:	89 10                	mov    %edx,(%eax)
 804884d:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048852:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048858:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804885d:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048864:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804886a:	89 10                	mov    %edx,(%eax)
 804886c:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 8048872:	c7 05 14 62 5f 08 e0 	movl   $0x80482e0,0x85f6214
 8048879:	82 04 08 
 804887c:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 8048881:	8b 04 85 18 62 5f 08 	mov    0x85f6218(,%eax,4),%eax
 8048888:	8b 00                	mov    (%eax),%eax

0804888a <main>:
 804888a:	a1 a8 61 3f 08       	mov    0x83f61a8,%eax
 804888f:	ba 8a 88 04 88       	mov    $0x8804888a,%edx
 8048894:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8048899:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 804889f:	b8 00 00 00 00       	mov    $0x0,%eax
 80488a4:	b9 00 00 00 00       	mov    $0x0,%ecx
 80488a9:	ba 00 00 00 00       	mov    $0x0,%edx
 80488ae:	a0 30 60 1f 08       	mov    0x81f6030,%al
 80488b3:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 80488ba:	8a 15 34 60 1f 08    	mov    0x81f6034,%dl
 80488c0:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 80488c3:	89 15 20 60 1f 08    	mov    %edx,0x81f6020
 80488c9:	a0 31 60 1f 08       	mov    0x81f6031,%al
 80488ce:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 80488d5:	8a 15 35 60 1f 08    	mov    0x81f6035,%dl
 80488db:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 80488de:	89 15 24 60 1f 08    	mov    %edx,0x81f6024
 80488e4:	a0 32 60 1f 08       	mov    0x81f6032,%al
 80488e9:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 80488f0:	8a 15 36 60 1f 08    	mov    0x81f6036,%dl
 80488f6:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 80488f9:	89 15 28 60 1f 08    	mov    %edx,0x81f6028
 80488ff:	a0 33 60 1f 08       	mov    0x81f6033,%al
 8048904:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804890b:	8a 15 37 60 1f 08    	mov    0x81f6037,%dl
 8048911:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 8048914:	89 15 2c 60 1f 08    	mov    %edx,0x81f602c
 804891a:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804891f:	8b 15 24 60 1f 08    	mov    0x81f6024,%edx
 8048925:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804892c:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804892f:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 8048934:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 8048939:	8b 15 28 60 1f 08    	mov    0x81f6028,%edx
 804893f:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 8048946:	8b 04 90             	mov    (%eax,%edx,4),%eax
 8048949:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804894e:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 8048953:	8b 15 2c 60 1f 08    	mov    0x81f602c,%edx
 8048959:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 8048960:	8b 04 90             	mov    (%eax,%edx,4),%eax
 8048963:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 8048968:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804896d:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 8048972:	8b 0d 20 60 1f 08    	mov    0x81f6020,%ecx
 8048978:	c7 05 b4 61 3f 08 80 	movl   $0x804d080,0x83f61b4
 804897f:	d0 04 08 
 8048982:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048989:	8b 15 d0 61 5f 08    	mov    0x85f61d0,%edx
 804898f:	89 10                	mov    %edx,(%eax)
 8048991:	c7 05 b4 61 3f 08 84 	movl   $0x804d084,0x83f61b4
 8048998:	d0 04 08 
 804899b:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 80489a2:	8b 15 d4 61 5f 08    	mov    0x85f61d4,%edx
 80489a8:	89 10                	mov    %edx,(%eax)
 80489aa:	c7 05 b4 61 3f 08 88 	movl   $0x804d088,0x83f61b4
 80489b1:	d0 04 08 
 80489b4:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 80489bb:	8b 15 d8 61 5f 08    	mov    0x85f61d8,%edx
 80489c1:	89 10                	mov    %edx,(%eax)
 80489c3:	c7 05 b4 61 3f 08 8c 	movl   $0x804d08c,0x83f61b4
 80489ca:	d0 04 08 
 80489cd:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 80489d4:	8b 15 dc 61 5f 08    	mov    0x85f61dc,%edx
 80489da:	89 10                	mov    %edx,(%eax)
 80489dc:	c7 05 b4 61 3f 08 90 	movl   $0x804d090,0x83f61b4
 80489e3:	d0 04 08 
 80489e6:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 80489ed:	8b 15 e0 61 5f 08    	mov    0x85f61e0,%edx
 80489f3:	89 10                	mov    %edx,(%eax)
 80489f5:	c7 05 b4 61 3f 08 94 	movl   $0x804d094,0x83f61b4
 80489fc:	d0 04 08 
 80489ff:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048a06:	8b 15 e4 61 5f 08    	mov    0x85f61e4,%edx
 8048a0c:	89 10                	mov    %edx,(%eax)
 8048a0e:	c7 05 b4 61 3f 08 98 	movl   $0x804d098,0x83f61b4
 8048a15:	d0 04 08 
 8048a18:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048a1f:	8b 15 e8 61 5f 08    	mov    0x85f61e8,%edx
 8048a25:	89 10                	mov    %edx,(%eax)
 8048a27:	c7 05 b4 61 3f 08 a0 	movl   $0x804d0a0,0x83f61b4
 8048a2e:	d0 04 08 
 8048a31:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048a38:	8b 15 ec 61 5f 08    	mov    0x85f61ec,%edx
 8048a3e:	89 10                	mov    %edx,(%eax)
 8048a40:	8b 15 f0 61 5f 08    	mov    0x85f61f0,%edx
 8048a46:	89 50 04             	mov    %edx,0x4(%eax)
 8048a49:	c7 05 b4 61 3f 08 a8 	movl   $0x804d0a8,0x83f61b4
 8048a50:	d0 04 08 
 8048a53:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048a5a:	8b 15 f4 61 5f 08    	mov    0x85f61f4,%edx
 8048a60:	89 10                	mov    %edx,(%eax)
 8048a62:	8b 15 f8 61 5f 08    	mov    0x85f61f8,%edx
 8048a68:	89 50 04             	mov    %edx,0x4(%eax)
 8048a6b:	c7 05 b4 61 3f 08 b0 	movl   $0x804d0b0,0x83f61b4
 8048a72:	d0 04 08 
 8048a75:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 8048a7c:	8b 15 fc 61 5f 08    	mov    0x85f61fc,%edx
 8048a82:	89 10                	mov    %edx,(%eax)
 8048a84:	8b 15 00 62 5f 08    	mov    0x85f6200,%edx
 8048a8a:	89 50 04             	mov    %edx,0x4(%eax)
 8048a8d:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 8048a92:	8b 04 85 90 61 3f 08 	mov    0x83f6190(,%eax,4),%eax
 8048a99:	c7 00 01 00 00 00    	movl   $0x1,(%eax)
 8048a9f:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8048aa4:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048aa9:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 8048aae:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048ab4:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048ab9:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048ac0:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048ac6:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 8048acc:	89 10                	mov    %edx,(%eax)
 8048ace:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048ad3:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048ad9:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048ade:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048ae5:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 8048aeb:	89 10                	mov    %edx,(%eax)
 8048aed:	a1 84 d0 04 08       	mov    0x804d084,%eax
 8048af2:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048af7:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 8048afc:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048b02:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048b07:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048b0e:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048b14:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 8048b1a:	89 10                	mov    %edx,(%eax)
 8048b1c:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048b21:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048b27:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048b2c:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048b33:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 8048b39:	89 10                	mov    %edx,(%eax)
 8048b3b:	a1 88 d0 04 08       	mov    0x804d088,%eax
 8048b40:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048b45:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 8048b4a:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048b50:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048b55:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048b5c:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048b62:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 8048b68:	89 10                	mov    %edx,(%eax)
 8048b6a:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048b6f:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048b75:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048b7a:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048b81:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 8048b87:	89 10                	mov    %edx,(%eax)
 8048b89:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8048b8e:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048b93:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 8048b98:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048b9e:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048ba3:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048baa:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048bb0:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 8048bb6:	89 10                	mov    %edx,(%eax)
 8048bb8:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048bbd:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048bc3:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048bc8:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048bcf:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 8048bd5:	89 10                	mov    %edx,(%eax)
 8048bd7:	a1 94 d0 04 08       	mov    0x804d094,%eax
 8048bdc:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048be1:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 8048be6:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048bec:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048bf1:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048bf8:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048bfe:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 8048c04:	89 10                	mov    %edx,(%eax)
 8048c06:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048c0b:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048c11:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048c16:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048c1d:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 8048c23:	89 10                	mov    %edx,(%eax)
 8048c25:	a1 98 d0 04 08       	mov    0x804d098,%eax
 8048c2a:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048c2f:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 8048c34:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048c3a:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048c3f:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048c46:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048c4c:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 8048c52:	89 10                	mov    %edx,(%eax)
 8048c54:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048c59:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048c5f:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048c64:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048c6b:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 8048c71:	89 10                	mov    %edx,(%eax)
 8048c73:	a1 a8 d0 04 08       	mov    0x804d0a8,%eax
 8048c78:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048c7d:	a1 ac d0 04 08       	mov    0x804d0ac,%eax
 8048c82:	a3 54 61 1f 08       	mov    %eax,0x81f6154
 8048c87:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 8048c8c:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048c92:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048c97:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048c9e:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048ca4:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 8048caa:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 8048cb0:	89 10                	mov    %edx,(%eax)
 8048cb2:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048cb7:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048cbd:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048cc2:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048cc9:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 8048ccf:	89 10                	mov    %edx,(%eax)
 8048cd1:	8b 15 54 61 1f 08    	mov    0x81f6154,%edx
 8048cd7:	89 50 04             	mov    %edx,0x4(%eax)
 8048cda:	a1 b0 d0 04 08       	mov    0x804d0b0,%eax
 8048cdf:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048ce4:	a1 b4 d0 04 08       	mov    0x804d0b4,%eax
 8048ce9:	a3 54 61 1f 08       	mov    %eax,0x81f6154
 8048cee:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 8048cf3:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048cf9:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048cfe:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048d05:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048d0b:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 8048d11:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 8048d17:	89 10                	mov    %edx,(%eax)
 8048d19:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048d1e:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048d24:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048d29:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048d30:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 8048d36:	89 10                	mov    %edx,(%eax)
 8048d38:	8b 15 54 61 1f 08    	mov    0x81f6154,%edx
 8048d3e:	89 50 04             	mov    %edx,0x4(%eax)
 8048d41:	b8 74 61 3f 08       	mov    $0x83f6174,%eax
 8048d46:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048d4c:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048d51:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048d58:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 8048d5e:	89 10                	mov    %edx,(%eax)
 8048d60:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 8048d65:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048d6b:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048d71:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048d77:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048d7d:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048d83:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048d89:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048d8f:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048d95:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048d9b:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048da1:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048da7:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048dad:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048db3:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048db9:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048dbf:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048dc5:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048dcb:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048dd1:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048dd7:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048ddd:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048de3:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048de9:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048def:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048df5:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048dfb:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e01:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e07:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e0d:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e13:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e19:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e1f:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e25:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e2b:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e31:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e37:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e3d:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e43:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048e49:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 8048e4e:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 8048e53:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048e59:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048e5e:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048e65:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 8048e6b:	89 10                	mov    %edx,(%eax)
 8048e6d:	b8 32 d0 04 08       	mov    $0x804d032,%eax
 8048e72:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8048e77:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8048e7c:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048e82:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048e87:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048e8e:	ba 00 00 00 00       	mov    $0x0,%edx
 8048e93:	8a 10                	mov    (%eax),%dl
 8048e95:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8048e9b:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8048ea0:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048ea6:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048eac:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048eb2:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048eb8:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048ebe:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8048ec4:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048eca:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048ecf:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048ed6:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8048edc:	88 10                	mov    %dl,(%eax)
 8048ede:	b8 43 d0 04 08       	mov    $0x804d043,%eax
 8048ee3:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8048ee8:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8048eed:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048ef3:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048ef8:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048eff:	ba 00 00 00 00       	mov    $0x0,%edx
 8048f04:	8a 10                	mov    (%eax),%dl
 8048f06:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8048f0c:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8048f11:	ba e9 ff ff ff       	mov    $0xffffffe9,%edx
 8048f16:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8048f1b:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8048f21:	b8 00 00 00 00       	mov    $0x0,%eax
 8048f26:	b9 00 00 00 00       	mov    $0x0,%ecx
 8048f2b:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8048f32:	00 00 00 
 8048f35:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8048f3b:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8048f42:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8048f49:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8048f4c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8048f53:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8048f5a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8048f5d:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8048f64:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8048f6a:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8048f70:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8048f77:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8048f7e:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8048f81:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8048f88:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8048f8f:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8048f92:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8048f99:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8048f9f:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8048fa4:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048faa:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048faf:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048fb6:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8048fbc:	88 10                	mov    %dl,(%eax)
 8048fbe:	b8 35 d0 04 08       	mov    $0x804d035,%eax
 8048fc3:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8048fc8:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8048fcd:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8048fd3:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8048fd8:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8048fdf:	ba 00 00 00 00       	mov    $0x0,%edx
 8048fe4:	8a 10                	mov    (%eax),%dl
 8048fe6:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8048fec:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8048ff1:	ba ea ff ff ff       	mov    $0xffffffea,%edx
 8048ff6:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8048ffb:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049001:	b8 00 00 00 00       	mov    $0x0,%eax
 8049006:	b9 00 00 00 00       	mov    $0x0,%ecx
 804900b:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049012:	00 00 00 
 8049015:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804901b:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049022:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049029:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804902c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049033:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804903a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804903d:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049044:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804904a:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049050:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049057:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804905e:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049061:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049068:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804906f:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049072:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049079:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804907f:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049084:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804908a:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804908f:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049096:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 804909c:	88 10                	mov    %dl,(%eax)
 804909e:	b8 42 d0 04 08       	mov    $0x804d042,%eax
 80490a3:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 80490a8:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 80490ad:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80490b3:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80490b8:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80490bf:	ba 00 00 00 00       	mov    $0x0,%edx
 80490c4:	8a 10                	mov    (%eax),%dl
 80490c6:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 80490cc:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 80490d1:	ba eb ff ff ff       	mov    $0xffffffeb,%edx
 80490d6:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 80490db:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 80490e1:	b8 00 00 00 00       	mov    $0x0,%eax
 80490e6:	b9 00 00 00 00       	mov    $0x0,%ecx
 80490eb:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 80490f2:	00 00 00 
 80490f5:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 80490fb:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049102:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049109:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804910c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049113:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804911a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804911d:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049124:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804912a:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049130:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049137:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804913e:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049141:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049148:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804914f:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049152:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049159:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804915f:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049164:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804916a:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804916f:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049176:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 804917c:	88 10                	mov    %dl,(%eax)
 804917e:	b8 36 d0 04 08       	mov    $0x804d036,%eax
 8049183:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8049188:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 804918d:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049193:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049198:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804919f:	ba 00 00 00 00       	mov    $0x0,%edx
 80491a4:	8a 10                	mov    (%eax),%dl
 80491a6:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 80491ac:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 80491b1:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80491b7:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80491bd:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80491c3:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80491c9:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80491cf:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80491d5:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80491da:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80491e1:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 80491e7:	88 10                	mov    %dl,(%eax)
 80491e9:	b8 55 d0 04 08       	mov    $0x804d055,%eax
 80491ee:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 80491f3:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 80491f8:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80491fe:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049203:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804920a:	ba 00 00 00 00       	mov    $0x0,%edx
 804920f:	8a 10                	mov    (%eax),%dl
 8049211:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8049217:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 804921c:	ba ed ff ff ff       	mov    $0xffffffed,%edx
 8049221:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8049226:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 804922c:	b8 00 00 00 00       	mov    $0x0,%eax
 8049231:	b9 00 00 00 00       	mov    $0x0,%ecx
 8049236:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 804923d:	00 00 00 
 8049240:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8049246:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 804924d:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049254:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049257:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804925e:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049265:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049268:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 804926f:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049275:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804927b:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049282:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049289:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804928c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049293:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804929a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804929d:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 80492a4:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 80492aa:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 80492af:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80492b5:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80492ba:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80492c1:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 80492c7:	88 10                	mov    %dl,(%eax)
 80492c9:	b8 41 d0 04 08       	mov    $0x804d041,%eax
 80492ce:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 80492d3:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 80492d8:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80492de:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80492e3:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80492ea:	ba 00 00 00 00       	mov    $0x0,%edx
 80492ef:	8a 10                	mov    (%eax),%dl
 80492f1:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 80492f7:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 80492fc:	ba ee ff ff ff       	mov    $0xffffffee,%edx
 8049301:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8049306:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 804930c:	b8 00 00 00 00       	mov    $0x0,%eax
 8049311:	b9 00 00 00 00       	mov    $0x0,%ecx
 8049316:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 804931d:	00 00 00 
 8049320:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8049326:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 804932d:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049334:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049337:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804933e:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049345:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049348:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 804934f:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049355:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804935b:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049362:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049369:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804936c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049373:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804937a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804937d:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049384:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804938a:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 804938f:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049395:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804939a:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80493a1:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 80493a7:	88 10                	mov    %dl,(%eax)
 80493a9:	b8 4d d0 04 08       	mov    $0x804d04d,%eax
 80493ae:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 80493b3:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 80493b8:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80493be:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80493c3:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80493ca:	ba 00 00 00 00       	mov    $0x0,%edx
 80493cf:	8a 10                	mov    (%eax),%dl
 80493d1:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 80493d7:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 80493dc:	ba ef ff ff ff       	mov    $0xffffffef,%edx
 80493e1:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 80493e6:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 80493ec:	b8 00 00 00 00       	mov    $0x0,%eax
 80493f1:	b9 00 00 00 00       	mov    $0x0,%ecx
 80493f6:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 80493fd:	00 00 00 
 8049400:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8049406:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 804940d:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049414:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049417:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804941e:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049425:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049428:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 804942f:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049435:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804943b:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049442:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049449:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804944c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049453:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804945a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804945d:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049464:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804946a:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 804946f:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049475:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804947a:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049481:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8049487:	88 10                	mov    %dl,(%eax)
 8049489:	b8 4e d0 04 08       	mov    $0x804d04e,%eax
 804948e:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8049493:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8049498:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804949e:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80494a3:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80494aa:	ba 00 00 00 00       	mov    $0x0,%edx
 80494af:	8a 10                	mov    (%eax),%dl
 80494b1:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 80494b7:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 80494bc:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80494c2:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80494c8:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80494ce:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80494d4:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80494da:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80494df:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80494e6:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 80494ec:	88 10                	mov    %dl,(%eax)
 80494ee:	b8 3b d0 04 08       	mov    $0x804d03b,%eax
 80494f3:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 80494f8:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 80494fd:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049503:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049508:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804950f:	ba 00 00 00 00       	mov    $0x0,%edx
 8049514:	8a 10                	mov    (%eax),%dl
 8049516:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 804951c:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049521:	ba f1 ff ff ff       	mov    $0xfffffff1,%edx
 8049526:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804952b:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049531:	b8 00 00 00 00       	mov    $0x0,%eax
 8049536:	b9 00 00 00 00       	mov    $0x0,%ecx
 804953b:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049542:	00 00 00 
 8049545:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804954b:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049552:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049559:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804955c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049563:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804956a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804956d:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049574:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804957a:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049580:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049587:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804958e:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049591:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049598:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804959f:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 80495a2:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 80495a9:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 80495af:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 80495b4:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80495ba:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80495bf:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80495c6:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 80495cc:	88 10                	mov    %dl,(%eax)
 80495ce:	b8 43 d0 04 08       	mov    $0x804d043,%eax
 80495d3:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 80495d8:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 80495dd:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80495e3:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80495e8:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80495ef:	ba 00 00 00 00       	mov    $0x0,%edx
 80495f4:	8a 10                	mov    (%eax),%dl
 80495f6:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 80495fc:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049601:	ba f2 ff ff ff       	mov    $0xfffffff2,%edx
 8049606:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804960b:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049611:	b8 00 00 00 00       	mov    $0x0,%eax
 8049616:	b9 00 00 00 00       	mov    $0x0,%ecx
 804961b:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049622:	00 00 00 
 8049625:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804962b:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049632:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049639:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804963c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049643:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804964a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804964d:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049654:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804965a:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049660:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049667:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804966e:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049671:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049678:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804967f:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049682:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049689:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804968f:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049694:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804969a:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804969f:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80496a6:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 80496ac:	88 10                	mov    %dl,(%eax)
 80496ae:	b8 4b d0 04 08       	mov    $0x804d04b,%eax
 80496b3:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 80496b8:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 80496bd:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80496c3:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80496c8:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80496cf:	ba 00 00 00 00       	mov    $0x0,%edx
 80496d4:	8a 10                	mov    (%eax),%dl
 80496d6:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 80496dc:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 80496e1:	ba f3 ff ff ff       	mov    $0xfffffff3,%edx
 80496e6:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 80496eb:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 80496f1:	b8 00 00 00 00       	mov    $0x0,%eax
 80496f6:	b9 00 00 00 00       	mov    $0x0,%ecx
 80496fb:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049702:	00 00 00 
 8049705:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804970b:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049712:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049719:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804971c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049723:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804972a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804972d:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049734:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804973a:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049740:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049747:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804974e:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049751:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049758:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804975f:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049762:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049769:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804976f:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049774:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804977a:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804977f:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049786:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 804978c:	88 10                	mov    %dl,(%eax)
 804978e:	b8 3c d0 04 08       	mov    $0x804d03c,%eax
 8049793:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8049798:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 804979d:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80497a3:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80497a8:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80497af:	ba 00 00 00 00       	mov    $0x0,%edx
 80497b4:	8a 10                	mov    (%eax),%dl
 80497b6:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 80497bc:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 80497c1:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80497c7:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80497cd:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 80497d3:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80497d9:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80497de:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80497e5:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 80497eb:	88 10                	mov    %dl,(%eax)
 80497ed:	b8 4d d0 04 08       	mov    $0x804d04d,%eax
 80497f2:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 80497f7:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 80497fc:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049802:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049807:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804980e:	ba 00 00 00 00       	mov    $0x0,%edx
 8049813:	8a 10                	mov    (%eax),%dl
 8049815:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 804981b:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049820:	ba f5 ff ff ff       	mov    $0xfffffff5,%edx
 8049825:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804982a:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049830:	b8 00 00 00 00       	mov    $0x0,%eax
 8049835:	b9 00 00 00 00       	mov    $0x0,%ecx
 804983a:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049841:	00 00 00 
 8049844:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804984a:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049851:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049858:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804985b:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049862:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049869:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804986c:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049873:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049879:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804987f:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049886:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804988d:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049890:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049897:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804989e:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 80498a1:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 80498a8:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 80498ae:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 80498b3:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80498b9:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80498be:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80498c5:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 80498cb:	88 10                	mov    %dl,(%eax)
 80498cd:	b8 54 d0 04 08       	mov    $0x804d054,%eax
 80498d2:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 80498d7:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 80498dc:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80498e2:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80498e7:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80498ee:	ba 00 00 00 00       	mov    $0x0,%edx
 80498f3:	8a 10                	mov    (%eax),%dl
 80498f5:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 80498fb:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049900:	ba f6 ff ff ff       	mov    $0xfffffff6,%edx
 8049905:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804990a:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049910:	b8 00 00 00 00       	mov    $0x0,%eax
 8049915:	b9 00 00 00 00       	mov    $0x0,%ecx
 804991a:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049921:	00 00 00 
 8049924:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804992a:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049931:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049938:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804993b:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049942:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049949:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804994c:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049953:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049959:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804995f:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049966:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804996d:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049970:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049977:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804997e:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049981:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049988:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804998e:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049993:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049999:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804999e:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80499a5:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 80499ab:	88 10                	mov    %dl,(%eax)
 80499ad:	b8 37 d0 04 08       	mov    $0x804d037,%eax
 80499b2:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 80499b7:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 80499bc:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 80499c2:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 80499c7:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 80499ce:	ba 00 00 00 00       	mov    $0x0,%edx
 80499d3:	8a 10                	mov    (%eax),%dl
 80499d5:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 80499db:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 80499e0:	ba f7 ff ff ff       	mov    $0xfffffff7,%edx
 80499e5:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 80499ea:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 80499f0:	b8 00 00 00 00       	mov    $0x0,%eax
 80499f5:	b9 00 00 00 00       	mov    $0x0,%ecx
 80499fa:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049a01:	00 00 00 
 8049a04:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8049a0a:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049a11:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049a18:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049a1b:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049a22:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049a29:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049a2c:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049a33:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049a39:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049a3f:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049a46:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049a4d:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049a50:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049a57:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049a5e:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049a61:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049a68:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049a6e:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049a73:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049a79:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049a7e:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049a85:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8049a8b:	88 10                	mov    %dl,(%eax)
 8049a8d:	b8 4b d0 04 08       	mov    $0x804d04b,%eax
 8049a92:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8049a97:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8049a9c:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049aa2:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049aa7:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049aae:	ba 00 00 00 00       	mov    $0x0,%edx
 8049ab3:	8a 10                	mov    (%eax),%dl
 8049ab5:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8049abb:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049ac0:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8049ac6:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8049acc:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049ad2:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049ad7:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049ade:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8049ae4:	88 10                	mov    %dl,(%eax)
 8049ae6:	b8 39 d0 04 08       	mov    $0x804d039,%eax
 8049aeb:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8049af0:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8049af5:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049afb:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049b00:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049b07:	ba 00 00 00 00       	mov    $0x0,%edx
 8049b0c:	8a 10                	mov    (%eax),%dl
 8049b0e:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8049b14:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049b19:	ba f9 ff ff ff       	mov    $0xfffffff9,%edx
 8049b1e:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8049b23:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049b29:	b8 00 00 00 00       	mov    $0x0,%eax
 8049b2e:	b9 00 00 00 00       	mov    $0x0,%ecx
 8049b33:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049b3a:	00 00 00 
 8049b3d:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8049b43:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049b4a:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049b51:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049b54:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049b5b:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049b62:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049b65:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049b6c:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049b72:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049b78:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049b7f:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049b86:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049b89:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049b90:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049b97:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049b9a:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049ba1:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049ba7:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049bac:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049bb2:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049bb7:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049bbe:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8049bc4:	88 10                	mov    %dl,(%eax)
 8049bc6:	b8 4b d0 04 08       	mov    $0x804d04b,%eax
 8049bcb:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8049bd0:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8049bd5:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049bdb:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049be0:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049be7:	ba 00 00 00 00       	mov    $0x0,%edx
 8049bec:	8a 10                	mov    (%eax),%dl
 8049bee:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8049bf4:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049bf9:	ba fa ff ff ff       	mov    $0xfffffffa,%edx
 8049bfe:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8049c03:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049c09:	b8 00 00 00 00       	mov    $0x0,%eax
 8049c0e:	b9 00 00 00 00       	mov    $0x0,%ecx
 8049c13:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049c1a:	00 00 00 
 8049c1d:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8049c23:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049c2a:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049c31:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049c34:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049c3b:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049c42:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049c45:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049c4c:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049c52:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049c58:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049c5f:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049c66:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049c69:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049c70:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049c77:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049c7a:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049c81:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049c87:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049c8c:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049c92:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049c97:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049c9e:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8049ca4:	88 10                	mov    %dl,(%eax)
 8049ca6:	b8 3d d0 04 08       	mov    $0x804d03d,%eax
 8049cab:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8049cb0:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8049cb5:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049cbb:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049cc0:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049cc7:	ba 00 00 00 00       	mov    $0x0,%edx
 8049ccc:	8a 10                	mov    (%eax),%dl
 8049cce:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8049cd4:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049cd9:	ba fb ff ff ff       	mov    $0xfffffffb,%edx
 8049cde:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8049ce3:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049ce9:	b8 00 00 00 00       	mov    $0x0,%eax
 8049cee:	b9 00 00 00 00       	mov    $0x0,%ecx
 8049cf3:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049cfa:	00 00 00 
 8049cfd:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8049d03:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049d0a:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049d11:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049d14:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049d1b:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049d22:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049d25:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049d2c:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049d32:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049d38:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049d3f:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049d46:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049d49:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049d50:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049d57:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049d5a:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049d61:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049d67:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049d6c:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049d72:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049d77:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049d7e:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8049d84:	88 10                	mov    %dl,(%eax)
 8049d86:	b8 3a d0 04 08       	mov    $0x804d03a,%eax
 8049d8b:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8049d90:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8049d95:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049d9b:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049da0:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049da7:	ba 00 00 00 00       	mov    $0x0,%edx
 8049dac:	8a 10                	mov    (%eax),%dl
 8049dae:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8049db4:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049db9:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 8049dbf:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049dc5:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049dca:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049dd1:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8049dd7:	88 10                	mov    %dl,(%eax)
 8049dd9:	b8 4f d0 04 08       	mov    $0x804d04f,%eax
 8049dde:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8049de3:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8049de8:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049dee:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049df3:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049dfa:	ba 00 00 00 00       	mov    $0x0,%edx
 8049dff:	8a 10                	mov    (%eax),%dl
 8049e01:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8049e07:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049e0c:	ba fd ff ff ff       	mov    $0xfffffffd,%edx
 8049e11:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8049e16:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049e1c:	b8 00 00 00 00       	mov    $0x0,%eax
 8049e21:	b9 00 00 00 00       	mov    $0x0,%ecx
 8049e26:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049e2d:	00 00 00 
 8049e30:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8049e36:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049e3d:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049e44:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049e47:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049e4e:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049e55:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049e58:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049e5f:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049e65:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049e6b:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049e72:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049e79:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049e7c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049e83:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049e8a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049e8d:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049e94:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049e9a:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049e9f:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049ea5:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049eaa:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049eb1:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8049eb7:	88 10                	mov    %dl,(%eax)
 8049eb9:	b8 56 d0 04 08       	mov    $0x804d056,%eax
 8049ebe:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 8049ec3:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 8049ec8:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049ece:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049ed3:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049eda:	ba 00 00 00 00       	mov    $0x0,%edx
 8049edf:	8a 10                	mov    (%eax),%dl
 8049ee1:	89 15 80 d0 04 08    	mov    %edx,0x804d080
 8049ee7:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049eec:	ba fe ff ff ff       	mov    $0xfffffffe,%edx
 8049ef1:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8049ef6:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049efc:	b8 00 00 00 00       	mov    $0x0,%eax
 8049f01:	b9 00 00 00 00       	mov    $0x0,%ecx
 8049f06:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049f0d:	00 00 00 
 8049f10:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8049f16:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049f1d:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049f24:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049f27:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049f2e:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049f35:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049f38:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049f3f:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049f45:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 8049f4b:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 8049f52:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049f59:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049f5c:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049f63:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049f6a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049f6d:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 8049f74:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 8049f7a:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 8049f7f:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 8049f85:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 8049f8a:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 8049f91:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 8049f97:	88 10                	mov    %dl,(%eax)
 8049f99:	c7 05 80 d0 04 08 00 	movl   $0x0,0x804d080
 8049fa0:	00 00 00 
 8049fa3:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 8049fa8:	ba ff ff ff ff       	mov    $0xffffffff,%edx
 8049fad:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 8049fb2:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 8049fb8:	b8 00 00 00 00       	mov    $0x0,%eax
 8049fbd:	b9 00 00 00 00       	mov    $0x0,%ecx
 8049fc2:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 8049fc9:	00 00 00 
 8049fcc:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 8049fd2:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 8049fd9:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 8049fe0:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049fe3:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 8049fea:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 8049ff1:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 8049ff4:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 8049ffb:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804a001:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804a007:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 804a00e:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804a015:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a018:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804a01f:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804a026:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a029:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 804a030:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804a036:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 804a03b:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a041:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a046:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a04d:	8a 15 80 d0 04 08    	mov    0x804d080,%dl
 804a053:	88 10                	mov    %dl,(%eax)
 804a055:	b8 6e d0 04 08       	mov    $0x804d06e,%eax
 804a05a:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 804a05f:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 804a064:	89 c0                	mov    %eax,%eax
 804a066:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a06b:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a070:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a076:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a07b:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a082:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a088:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804a08e:	89 10                	mov    %edx,(%eax)
 804a090:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a095:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a09b:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a0a0:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a0a7:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a0ad:	89 10                	mov    %edx,(%eax)
 804a0af:	b8 af a1 04 88       	mov    $0x8804a1af,%eax
 804a0b4:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804a0b9:	c7 05 34 60 1f 08 00 	movl   $0x80000000,0x81f6034
 804a0c0:	00 00 80 
 804a0c3:	b8 00 00 00 00       	mov    $0x0,%eax
 804a0c8:	b9 00 00 00 00       	mov    $0x0,%ecx
 804a0cd:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 804a0d4:	00 00 00 
 804a0d7:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804a0dd:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 804a0e4:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804a0eb:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a0ee:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804a0f5:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804a0fc:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a0ff:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 804a106:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804a10c:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804a112:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 804a119:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804a120:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a123:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804a12a:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804a131:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a134:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 804a13b:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804a141:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 804a146:	89 c0                	mov    %eax,%eax
 804a148:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a14d:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a152:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a158:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a15d:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a164:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a16a:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804a170:	89 10                	mov    %edx,(%eax)
 804a172:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a177:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a17d:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a182:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a189:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a18f:	89 10                	mov    %edx,(%eax)
 804a191:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 804a197:	c7 05 14 62 5f 08 b0 	movl   $0x80482b0,0x85f6214
 804a19e:	82 04 08 
 804a1a1:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 804a1a6:	8b 04 85 18 62 5f 08 	mov    0x85f6218(,%eax,4),%eax
 804a1ad:	8b 00                	mov    (%eax),%eax
 804a1af:	a3 80 d0 04 08       	mov    %eax,0x804d080
 804a1b4:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a1b9:	8b 10                	mov    (%eax),%edx
 804a1bb:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804a1c1:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a1c6:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a1cc:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a1d1:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a1d8:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a1de:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804a1e4:	89 10                	mov    %edx,(%eax)
 804a1e6:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a1ec:	89 d0                	mov    %edx,%eax
 804a1ee:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a1f3:	8b 80 a0 ff df ff    	mov    -0x200060(%eax),%eax
 804a1f9:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a1fe:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a203:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a209:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a20e:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a215:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a21b:	89 10                	mov    %edx,(%eax)
 804a21d:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 804a222:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a228:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a22e:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a234:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a23a:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a240:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a246:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a24c:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a252:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a258:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a25e:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a264:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a26a:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a270:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a276:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a27c:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a282:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a288:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a28e:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a294:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a29a:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2a0:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2a6:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2ac:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2b2:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2b8:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2be:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2c4:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2ca:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2d0:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2d6:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2dc:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2e2:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2e8:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2ee:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2f4:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a2fa:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a300:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a306:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 804a30b:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 804a310:	89 c0                	mov    %eax,%eax
 804a312:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a317:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a31c:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a322:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a327:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a32e:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a334:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804a33a:	89 10                	mov    %edx,(%eax)
 804a33c:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a341:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a347:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a34c:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a353:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a359:	89 10                	mov    %edx,(%eax)
 804a35b:	b8 68 d0 04 08       	mov    $0x804d068,%eax
 804a360:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 804a365:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 804a36a:	89 c0                	mov    %eax,%eax
 804a36c:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a371:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a376:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a37c:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a381:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a388:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a38e:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804a394:	89 10                	mov    %edx,(%eax)
 804a396:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a39b:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a3a1:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a3a6:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a3ad:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a3b3:	89 10                	mov    %edx,(%eax)
 804a3b5:	b8 b5 a4 04 88       	mov    $0x8804a4b5,%eax
 804a3ba:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804a3bf:	c7 05 34 60 1f 08 00 	movl   $0x80000000,0x81f6034
 804a3c6:	00 00 80 
 804a3c9:	b8 00 00 00 00       	mov    $0x0,%eax
 804a3ce:	b9 00 00 00 00       	mov    $0x0,%ecx
 804a3d3:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 804a3da:	00 00 00 
 804a3dd:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804a3e3:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 804a3ea:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804a3f1:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a3f4:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804a3fb:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804a402:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a405:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 804a40c:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804a412:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804a418:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 804a41f:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804a426:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a429:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804a430:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804a437:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a43a:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 804a441:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804a447:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 804a44c:	89 c0                	mov    %eax,%eax
 804a44e:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a453:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a458:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a45e:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a463:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a46a:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a470:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804a476:	89 10                	mov    %edx,(%eax)
 804a478:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a47d:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a483:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a488:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a48f:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a495:	89 10                	mov    %edx,(%eax)
 804a497:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 804a49d:	c7 05 14 62 5f 08 d0 	movl   $0x80482d0,0x85f6214
 804a4a4:	82 04 08 
 804a4a7:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 804a4ac:	8b 04 85 18 62 5f 08 	mov    0x85f6218(,%eax,4),%eax
 804a4b3:	8b 00                	mov    (%eax),%eax
 804a4b5:	a3 80 d0 04 08       	mov    %eax,0x804d080
 804a4ba:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a4bf:	8b 10                	mov    (%eax),%edx
 804a4c1:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804a4c7:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a4cc:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a4d2:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a4d7:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a4de:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a4e4:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804a4ea:	89 10                	mov    %edx,(%eax)
 804a4ec:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a4f2:	89 d0                	mov    %edx,%eax
 804a4f4:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a4f9:	8b 80 a0 ff df ff    	mov    -0x200060(%eax),%eax
 804a4ff:	8b 80 a0 ff df ff    	mov    -0x200060(%eax),%eax
 804a505:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a50a:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a50f:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a515:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a51a:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a521:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a527:	89 10                	mov    %edx,(%eax)
 804a529:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 804a52e:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a534:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a53a:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a540:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a546:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a54c:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a552:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 804a557:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 804a55c:	89 c0                	mov    %eax,%eax
 804a55e:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a563:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a568:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a56e:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a573:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a57a:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a580:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804a586:	89 10                	mov    %edx,(%eax)
 804a588:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a58d:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a593:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a598:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a59f:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a5a5:	89 10                	mov    %edx,(%eax)
 804a5a7:	a1 74 61 3f 08       	mov    0x83f6174,%eax
 804a5ac:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5b2:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5b8:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5be:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5c4:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5ca:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5d0:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5d6:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5dc:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5e2:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5e8:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5ee:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5f4:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a5fa:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a600:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a606:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a60c:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a612:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a618:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a61e:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a624:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a62a:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a630:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a636:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a63c:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a642:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a648:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a64e:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a654:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a65a:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a660:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a666:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a66c:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a672:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a678:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a67e:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a684:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a68a:	8b 80 98 ff df ff    	mov    -0x200068(%eax),%eax
 804a690:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 804a695:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 804a69a:	89 c0                	mov    %eax,%eax
 804a69c:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a6a1:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a6a6:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a6ac:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a6b1:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a6b8:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a6be:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804a6c4:	89 10                	mov    %edx,(%eax)
 804a6c6:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a6cb:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a6d1:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a6d6:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a6dd:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a6e3:	89 10                	mov    %edx,(%eax)
 804a6e5:	b8 e5 a7 04 88       	mov    $0x8804a7e5,%eax
 804a6ea:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804a6ef:	c7 05 34 60 1f 08 00 	movl   $0x80000000,0x81f6034
 804a6f6:	00 00 80 
 804a6f9:	b8 00 00 00 00       	mov    $0x0,%eax
 804a6fe:	b9 00 00 00 00       	mov    $0x0,%ecx
 804a703:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 804a70a:	00 00 00 
 804a70d:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804a713:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 804a71a:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804a721:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a724:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804a72b:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804a732:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a735:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 804a73c:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804a742:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804a748:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 804a74f:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804a756:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a759:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804a760:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804a767:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a76a:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 804a771:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804a777:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 804a77c:	89 c0                	mov    %eax,%eax
 804a77e:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a783:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a788:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a78e:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a793:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a79a:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a7a0:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804a7a6:	89 10                	mov    %edx,(%eax)
 804a7a8:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a7ad:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a7b3:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a7b8:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a7bf:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a7c5:	89 10                	mov    %edx,(%eax)
 804a7c7:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 804a7cd:	c7 05 14 62 5f 08 a0 	movl   $0x80482a0,0x85f6214
 804a7d4:	82 04 08 
 804a7d7:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 804a7dc:	8b 04 85 18 62 5f 08 	mov    0x85f6218(,%eax,4),%eax
 804a7e3:	8b 00                	mov    (%eax),%eax
 804a7e5:	a3 80 d0 04 08       	mov    %eax,0x804d080
 804a7ea:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a7ef:	8b 10                	mov    (%eax),%edx
 804a7f1:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804a7f7:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a7fc:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a802:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a807:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a80e:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804a814:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804a81a:	89 10                	mov    %edx,(%eax)
 804a81c:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a822:	89 d0                	mov    %edx,%eax
 804a824:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804a829:	8b 80 a0 ff df ff    	mov    -0x200060(%eax),%eax
 804a82f:	8b 80 a0 ff df ff    	mov    -0x200060(%eax),%eax
 804a835:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804a83a:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804a83f:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a845:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804a84a:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804a851:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804a857:	89 10                	mov    %edx,(%eax)
 804a859:	a1 80 d0 04 08       	mov    0x804d080,%eax
 804a85e:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 804a863:	c7 05 88 d0 04 08 00 	movl   $0x0,0x804d088
 804a86a:	00 00 00 
 804a86d:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 804a872:	8b 15 88 d0 04 08    	mov    0x804d088,%edx
 804a878:	b9 72 ad 04 88       	mov    $0x8804ad72,%ecx
 804a87d:	89 0d 40 61 1f 08    	mov    %ecx,0x81f6140
 804a883:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804a888:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 804a88e:	89 15 d0 60 1f 08    	mov    %edx,0x81f60d0
 804a894:	b8 00 00 00 00       	mov    $0x0,%eax
 804a899:	b9 00 00 00 00       	mov    $0x0,%ecx
 804a89e:	c7 05 40 60 1f 08 01 	movl   $0x1,0x81f6040
 804a8a5:	00 00 00 
 804a8a8:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804a8ae:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 804a8b5:	66 8b 0c 4d 90 10 16 	mov    0x8161090(,%ecx,2),%cx
 804a8bc:	08 
 804a8bd:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804a8c4:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a8c7:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804a8ce:	8b 0d 40 60 1f 08    	mov    0x81f6040,%ecx
 804a8d4:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a8d7:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 804a8de:	89 15 3e 60 1f 08    	mov    %edx,0x81f603e
 804a8e4:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804a8ea:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 804a8f1:	66 8b 0c 4d 90 10 16 	mov    0x8161090(,%ecx,2),%cx
 804a8f8:	08 
 804a8f9:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804a900:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a903:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804a90a:	8b 0d 40 60 1f 08    	mov    0x81f6040,%ecx
 804a910:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804a913:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 804a91a:	89 15 3e 60 1f 08    	mov    %edx,0x81f603e
 804a920:	a1 d0 60 1f 08       	mov    0x81f60d0,%eax
 804a925:	a3 34 60 1f 08       	mov    %eax,0x81f6034
 804a92a:	b8 00 00 00 00       	mov    $0x0,%eax
 804a92f:	a0 40 60 1f 08       	mov    0x81f6040,%al
 804a934:	8a 80 50 d3 04 08    	mov    0x804d350(%eax),%al
 804a93a:	a2 3c 61 1f 08       	mov    %al,0x81f613c
 804a93f:	a0 3b 60 1f 08       	mov    0x81f603b,%al
 804a944:	8b 04 85 d0 f1 04 08 	mov    0x804f1d0(,%eax,4),%eax
 804a94b:	a2 34 61 1f 08       	mov    %al,0x81f6134
 804a950:	b8 00 00 00 00       	mov    $0x0,%eax
 804a955:	ba 00 00 00 00       	mov    $0x0,%edx
 804a95a:	8a 15 38 60 1f 08    	mov    0x81f6038,%dl
 804a960:	8a 84 02 40 d1 04 08 	mov    0x804d140(%edx,%eax,1),%al
 804a967:	8a 15 39 60 1f 08    	mov    0x81f6039,%dl
 804a96d:	8a 84 02 40 d1 04 08 	mov    0x804d140(%edx,%eax,1),%al
 804a974:	8a 15 3a 60 1f 08    	mov    0x81f603a,%dl
 804a97a:	8a 84 02 40 d1 04 08 	mov    0x804d140(%edx,%eax,1),%al
 804a981:	8a 15 3b 60 1f 08    	mov    0x81f603b,%dl
 804a987:	8a 84 02 40 d1 04 08 	mov    0x804d140(%edx,%eax,1),%al
 804a98e:	8a 80 50 d3 04 08    	mov    0x804d350(%eax),%al
 804a994:	a2 30 61 1f 08       	mov    %al,0x81f6130
 804a999:	ba c0 5f 1f 08       	mov    $0x81f5fc0,%edx
 804a99e:	a0 33 60 1f 08       	mov    0x81f6033,%al
 804a9a3:	8b 04 85 d0 f1 04 08 	mov    0x804f1d0(,%eax,4),%eax
 804a9aa:	8b 14 82             	mov    (%edx,%eax,4),%edx
 804a9ad:	a0 37 60 1f 08       	mov    0x81f6037,%al
 804a9b2:	8b 04 85 d0 f1 04 08 	mov    0x804f1d0(,%eax,4),%eax
 804a9b9:	8b 14 82             	mov    (%edx,%eax,4),%edx
 804a9bc:	a0 3b 60 1f 08       	mov    0x81f603b,%al
 804a9c1:	8b 04 85 d0 f1 04 08 	mov    0x804f1d0(,%eax,4),%eax
 804a9c8:	8b 14 82             	mov    (%edx,%eax,4),%edx
 804a9cb:	8b 12                	mov    (%edx),%edx
 804a9cd:	88 15 38 61 1f 08    	mov    %dl,0x81f6138
 804a9d3:	a1 30 61 1f 08       	mov    0x81f6130,%eax
 804a9d8:	8b 04 85 50 d3 04 08 	mov    0x804d350(,%eax,4),%eax
 804a9df:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804a9e4:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804a9e9:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804a9ef:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804a9f6:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804a9f9:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804a9fe:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804aa03:	8b 04 85 a0 61 3f 08 	mov    0x83f61a0(,%eax,4),%eax
 804aa0a:	8b 15 40 61 1f 08    	mov    0x81f6140,%edx
 804aa10:	89 10                	mov    %edx,(%eax)
 804aa12:	8b 0d 20 60 1f 08    	mov    0x81f6020,%ecx
 804aa18:	c7 05 b4 61 3f 08 d0 	movl   $0x85f61d0,0x83f61b4
 804aa1f:	61 5f 08 
 804aa22:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804aa29:	8b 15 80 d0 04 08    	mov    0x804d080,%edx
 804aa2f:	89 10                	mov    %edx,(%eax)
 804aa31:	8b 15 84 d0 04 08    	mov    0x804d084,%edx
 804aa37:	89 50 04             	mov    %edx,0x4(%eax)
 804aa3a:	8b 15 88 d0 04 08    	mov    0x804d088,%edx
 804aa40:	89 50 08             	mov    %edx,0x8(%eax)
 804aa43:	8b 15 8c d0 04 08    	mov    0x804d08c,%edx
 804aa49:	89 50 0c             	mov    %edx,0xc(%eax)
 804aa4c:	c7 05 b4 61 3f 08 e0 	movl   $0x85f61e0,0x83f61b4
 804aa53:	61 5f 08 
 804aa56:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804aa5d:	8b 15 90 d0 04 08    	mov    0x804d090,%edx
 804aa63:	89 10                	mov    %edx,(%eax)
 804aa65:	8b 15 94 d0 04 08    	mov    0x804d094,%edx
 804aa6b:	89 50 04             	mov    %edx,0x4(%eax)
 804aa6e:	8b 15 98 d0 04 08    	mov    0x804d098,%edx
 804aa74:	89 50 08             	mov    %edx,0x8(%eax)
 804aa77:	c7 05 b4 61 3f 08 ec 	movl   $0x85f61ec,0x83f61b4
 804aa7e:	61 5f 08 
 804aa81:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804aa88:	8b 15 a0 d0 04 08    	mov    0x804d0a0,%edx
 804aa8e:	89 10                	mov    %edx,(%eax)
 804aa90:	8b 15 a4 d0 04 08    	mov    0x804d0a4,%edx
 804aa96:	89 50 04             	mov    %edx,0x4(%eax)
 804aa99:	8b 15 a8 d0 04 08    	mov    0x804d0a8,%edx
 804aa9f:	89 50 08             	mov    %edx,0x8(%eax)
 804aaa2:	8b 15 ac d0 04 08    	mov    0x804d0ac,%edx
 804aaa8:	89 50 0c             	mov    %edx,0xc(%eax)
 804aaab:	8b 15 b0 d0 04 08    	mov    0x804d0b0,%edx
 804aab1:	89 50 10             	mov    %edx,0x10(%eax)
 804aab4:	8b 15 b4 d0 04 08    	mov    0x804d0b4,%edx
 804aaba:	89 50 14             	mov    %edx,0x14(%eax)
 804aabd:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804aac2:	8b 04 85 90 61 3f 08 	mov    0x83f6190(,%eax,4),%eax
 804aac9:	c7 00 00 00 00 00    	movl   $0x0,(%eax)
 804aacf:	b8 5f d0 04 08       	mov    $0x804d05f,%eax
 804aad4:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 804aad9:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 804aade:	89 c0                	mov    %eax,%eax
 804aae0:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804aae5:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804aaea:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804aaf0:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804aaf5:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804aafc:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804ab02:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804ab08:	89 10                	mov    %edx,(%eax)
 804ab0a:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804ab0f:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804ab15:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804ab1a:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804ab21:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804ab27:	89 10                	mov    %edx,(%eax)
 804ab29:	b8 29 ac 04 88       	mov    $0x8804ac29,%eax
 804ab2e:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804ab33:	c7 05 34 60 1f 08 00 	movl   $0x80000000,0x81f6034
 804ab3a:	00 00 80 
 804ab3d:	b8 00 00 00 00       	mov    $0x0,%eax
 804ab42:	b9 00 00 00 00       	mov    $0x0,%ecx
 804ab47:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 804ab4e:	00 00 00 
 804ab51:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804ab57:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 804ab5e:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804ab65:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804ab68:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804ab6f:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804ab76:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804ab79:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 804ab80:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804ab86:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804ab8c:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 804ab93:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804ab9a:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804ab9d:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804aba4:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804abab:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804abae:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 804abb5:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804abbb:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 804abc0:	89 c0                	mov    %eax,%eax
 804abc2:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804abc7:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804abcc:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804abd2:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804abd7:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804abde:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804abe4:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804abea:	89 10                	mov    %edx,(%eax)
 804abec:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804abf1:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804abf7:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804abfc:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804ac03:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804ac09:	89 10                	mov    %edx,(%eax)
 804ac0b:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 804ac11:	c7 05 14 62 5f 08 c0 	movl   $0x80482c0,0x85f6214
 804ac18:	82 04 08 
 804ac1b:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 804ac20:	8b 04 85 18 62 5f 08 	mov    0x85f6218(,%eax,4),%eax
 804ac27:	8b 00                	mov    (%eax),%eax
 804ac29:	a3 80 d0 04 08       	mov    %eax,0x804d080
 804ac2e:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804ac33:	8b 10                	mov    (%eax),%edx
 804ac35:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804ac3b:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804ac40:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804ac46:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804ac4b:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804ac52:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804ac58:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804ac5e:	89 10                	mov    %edx,(%eax)
 804ac60:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804ac66:	89 d0                	mov    %edx,%eax
 804ac68:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804ac6d:	8b 80 a0 ff df ff    	mov    -0x200060(%eax),%eax
 804ac73:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804ac78:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804ac7d:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804ac83:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804ac88:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804ac8f:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804ac95:	89 10                	mov    %edx,(%eax)
 804ac97:	b8 4f b1 04 88       	mov    $0x8804b14f,%eax
 804ac9c:	a3 40 61 1f 08       	mov    %eax,0x81f6140
 804aca1:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 804aca6:	8b 04 85 a0 61 3f 08 	mov    0x83f61a0(,%eax,4),%eax
 804acad:	8b 15 40 61 1f 08    	mov    0x81f6140,%edx
 804acb3:	89 10                	mov    %edx,(%eax)
 804acb5:	8b 0d 98 61 3f 08    	mov    0x83f6198,%ecx
 804acbb:	c7 05 b4 61 3f 08 d0 	movl   $0x85f61d0,0x83f61b4
 804acc2:	61 5f 08 
 804acc5:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804accc:	8b 15 80 d0 04 08    	mov    0x804d080,%edx
 804acd2:	89 10                	mov    %edx,(%eax)
 804acd4:	8b 15 84 d0 04 08    	mov    0x804d084,%edx
 804acda:	89 50 04             	mov    %edx,0x4(%eax)
 804acdd:	8b 15 88 d0 04 08    	mov    0x804d088,%edx
 804ace3:	89 50 08             	mov    %edx,0x8(%eax)
 804ace6:	8b 15 8c d0 04 08    	mov    0x804d08c,%edx
 804acec:	89 50 0c             	mov    %edx,0xc(%eax)
 804acef:	c7 05 b4 61 3f 08 e0 	movl   $0x85f61e0,0x83f61b4
 804acf6:	61 5f 08 
 804acf9:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804ad00:	8b 15 90 d0 04 08    	mov    0x804d090,%edx
 804ad06:	89 10                	mov    %edx,(%eax)
 804ad08:	8b 15 94 d0 04 08    	mov    0x804d094,%edx
 804ad0e:	89 50 04             	mov    %edx,0x4(%eax)
 804ad11:	8b 15 98 d0 04 08    	mov    0x804d098,%edx
 804ad17:	89 50 08             	mov    %edx,0x8(%eax)
 804ad1a:	c7 05 b4 61 3f 08 ec 	movl   $0x85f61ec,0x83f61b4
 804ad21:	61 5f 08 
 804ad24:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804ad2b:	8b 15 a0 d0 04 08    	mov    0x804d0a0,%edx
 804ad31:	89 10                	mov    %edx,(%eax)
 804ad33:	8b 15 a4 d0 04 08    	mov    0x804d0a4,%edx
 804ad39:	89 50 04             	mov    %edx,0x4(%eax)
 804ad3c:	8b 15 a8 d0 04 08    	mov    0x804d0a8,%edx
 804ad42:	89 50 08             	mov    %edx,0x8(%eax)
 804ad45:	8b 15 ac d0 04 08    	mov    0x804d0ac,%edx
 804ad4b:	89 50 0c             	mov    %edx,0xc(%eax)
 804ad4e:	8b 15 b0 d0 04 08    	mov    0x804d0b0,%edx
 804ad54:	89 50 10             	mov    %edx,0x10(%eax)
 804ad57:	8b 15 b4 d0 04 08    	mov    0x804d0b4,%edx
 804ad5d:	89 50 14             	mov    %edx,0x14(%eax)
 804ad60:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 804ad65:	8b 04 85 90 61 3f 08 	mov    0x83f6190(,%eax,4),%eax
 804ad6c:	c7 00 00 00 00 00    	movl   $0x0,(%eax)
 804ad72:	a1 a8 61 3f 08       	mov    0x83f61a8,%eax
 804ad77:	ba 72 ad 04 88       	mov    $0x8804ad72,%edx
 804ad7c:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804ad81:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 804ad87:	b8 00 00 00 00       	mov    $0x0,%eax
 804ad8c:	b9 00 00 00 00       	mov    $0x0,%ecx
 804ad91:	ba 00 00 00 00       	mov    $0x0,%edx
 804ad96:	a0 30 60 1f 08       	mov    0x81f6030,%al
 804ad9b:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804ada2:	8a 15 34 60 1f 08    	mov    0x81f6034,%dl
 804ada8:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804adab:	89 15 20 60 1f 08    	mov    %edx,0x81f6020
 804adb1:	a0 31 60 1f 08       	mov    0x81f6031,%al
 804adb6:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804adbd:	8a 15 35 60 1f 08    	mov    0x81f6035,%dl
 804adc3:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804adc6:	89 15 24 60 1f 08    	mov    %edx,0x81f6024
 804adcc:	a0 32 60 1f 08       	mov    0x81f6032,%al
 804add1:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804add8:	8a 15 36 60 1f 08    	mov    0x81f6036,%dl
 804adde:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804ade1:	89 15 28 60 1f 08    	mov    %edx,0x81f6028
 804ade7:	a0 33 60 1f 08       	mov    0x81f6033,%al
 804adec:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804adf3:	8a 15 37 60 1f 08    	mov    0x81f6037,%dl
 804adf9:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804adfc:	89 15 2c 60 1f 08    	mov    %edx,0x81f602c
 804ae02:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804ae07:	8b 15 24 60 1f 08    	mov    0x81f6024,%edx
 804ae0d:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804ae14:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804ae17:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804ae1c:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804ae21:	8b 15 28 60 1f 08    	mov    0x81f6028,%edx
 804ae27:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804ae2e:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804ae31:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804ae36:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804ae3b:	8b 15 2c 60 1f 08    	mov    0x81f602c,%edx
 804ae41:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804ae48:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804ae4b:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804ae50:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804ae55:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804ae5a:	8b 0d 20 60 1f 08    	mov    0x81f6020,%ecx
 804ae60:	c7 05 b4 61 3f 08 80 	movl   $0x804d080,0x83f61b4
 804ae67:	d0 04 08 
 804ae6a:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804ae71:	8b 15 d0 61 5f 08    	mov    0x85f61d0,%edx
 804ae77:	89 10                	mov    %edx,(%eax)
 804ae79:	c7 05 b4 61 3f 08 84 	movl   $0x804d084,0x83f61b4
 804ae80:	d0 04 08 
 804ae83:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804ae8a:	8b 15 d4 61 5f 08    	mov    0x85f61d4,%edx
 804ae90:	89 10                	mov    %edx,(%eax)
 804ae92:	c7 05 b4 61 3f 08 88 	movl   $0x804d088,0x83f61b4
 804ae99:	d0 04 08 
 804ae9c:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804aea3:	8b 15 d8 61 5f 08    	mov    0x85f61d8,%edx
 804aea9:	89 10                	mov    %edx,(%eax)
 804aeab:	c7 05 b4 61 3f 08 8c 	movl   $0x804d08c,0x83f61b4
 804aeb2:	d0 04 08 
 804aeb5:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804aebc:	8b 15 dc 61 5f 08    	mov    0x85f61dc,%edx
 804aec2:	89 10                	mov    %edx,(%eax)
 804aec4:	c7 05 b4 61 3f 08 90 	movl   $0x804d090,0x83f61b4
 804aecb:	d0 04 08 
 804aece:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804aed5:	8b 15 e0 61 5f 08    	mov    0x85f61e0,%edx
 804aedb:	89 10                	mov    %edx,(%eax)
 804aedd:	c7 05 b4 61 3f 08 94 	movl   $0x804d094,0x83f61b4
 804aee4:	d0 04 08 
 804aee7:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804aeee:	8b 15 e4 61 5f 08    	mov    0x85f61e4,%edx
 804aef4:	89 10                	mov    %edx,(%eax)
 804aef6:	c7 05 b4 61 3f 08 98 	movl   $0x804d098,0x83f61b4
 804aefd:	d0 04 08 
 804af00:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804af07:	8b 15 e8 61 5f 08    	mov    0x85f61e8,%edx
 804af0d:	89 10                	mov    %edx,(%eax)
 804af0f:	c7 05 b4 61 3f 08 a0 	movl   $0x804d0a0,0x83f61b4
 804af16:	d0 04 08 
 804af19:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804af20:	8b 15 ec 61 5f 08    	mov    0x85f61ec,%edx
 804af26:	89 10                	mov    %edx,(%eax)
 804af28:	8b 15 f0 61 5f 08    	mov    0x85f61f0,%edx
 804af2e:	89 50 04             	mov    %edx,0x4(%eax)
 804af31:	c7 05 b4 61 3f 08 a8 	movl   $0x804d0a8,0x83f61b4
 804af38:	d0 04 08 
 804af3b:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804af42:	8b 15 f4 61 5f 08    	mov    0x85f61f4,%edx
 804af48:	89 10                	mov    %edx,(%eax)
 804af4a:	8b 15 f8 61 5f 08    	mov    0x85f61f8,%edx
 804af50:	89 50 04             	mov    %edx,0x4(%eax)
 804af53:	c7 05 b4 61 3f 08 b0 	movl   $0x804d0b0,0x83f61b4
 804af5a:	d0 04 08 
 804af5d:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804af64:	8b 15 fc 61 5f 08    	mov    0x85f61fc,%edx
 804af6a:	89 10                	mov    %edx,(%eax)
 804af6c:	8b 15 00 62 5f 08    	mov    0x85f6200,%edx
 804af72:	89 50 04             	mov    %edx,0x4(%eax)
 804af75:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804af7a:	8b 04 85 90 61 3f 08 	mov    0x83f6190(,%eax,4),%eax
 804af81:	c7 00 01 00 00 00    	movl   $0x1,(%eax)
 804af87:	b8 58 d0 04 08       	mov    $0x804d058,%eax
 804af8c:	a3 8c d0 04 08       	mov    %eax,0x804d08c
 804af91:	a1 8c d0 04 08       	mov    0x804d08c,%eax
 804af96:	89 c0                	mov    %eax,%eax
 804af98:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804af9d:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804afa2:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804afa8:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804afad:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804afb4:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804afba:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804afc0:	89 10                	mov    %edx,(%eax)
 804afc2:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804afc7:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804afcd:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804afd2:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804afd9:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804afdf:	89 10                	mov    %edx,(%eax)
 804afe1:	b8 e1 b0 04 88       	mov    $0x8804b0e1,%eax
 804afe6:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804afeb:	c7 05 34 60 1f 08 00 	movl   $0x80000000,0x81f6034
 804aff2:	00 00 80 
 804aff5:	b8 00 00 00 00       	mov    $0x0,%eax
 804affa:	b9 00 00 00 00       	mov    $0x0,%ecx
 804afff:	c7 05 40 60 1f 08 00 	movl   $0x0,0x81f6040
 804b006:	00 00 00 
 804b009:	66 a1 30 60 1f 08    	mov    0x81f6030,%ax
 804b00f:	66 8b 0d 34 60 1f 08 	mov    0x81f6034,%cx
 804b016:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804b01d:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804b020:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804b027:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804b02e:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804b031:	66 89 15 38 60 1f 08 	mov    %dx,0x81f6038
 804b038:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804b03e:	66 a1 32 60 1f 08    	mov    0x81f6032,%ax
 804b044:	66 8b 0d 36 60 1f 08 	mov    0x81f6036,%cx
 804b04b:	8b 14 85 70 0f 06 08 	mov    0x8060f70(,%eax,4),%edx
 804b052:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804b055:	66 8b 0d 42 60 1f 08 	mov    0x81f6042,%cx
 804b05c:	8b 14 95 70 0f 06 08 	mov    0x8060f70(,%edx,4),%edx
 804b063:	8b 14 8a             	mov    (%edx,%ecx,4),%edx
 804b066:	66 89 15 3a 60 1f 08 	mov    %dx,0x81f603a
 804b06d:	89 15 40 60 1f 08    	mov    %edx,0x81f6040
 804b073:	a1 38 60 1f 08       	mov    0x81f6038,%eax
 804b078:	89 c0                	mov    %eax,%eax
 804b07a:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804b07f:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b084:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b08a:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b08f:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b096:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b09c:	8b 92 98 ff df ff    	mov    -0x200068(%edx),%edx
 804b0a2:	89 10                	mov    %edx,(%eax)
 804b0a4:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b0a9:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b0af:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b0b4:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b0bb:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b0c1:	89 10                	mov    %edx,(%eax)
 804b0c3:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 804b0c9:	c7 05 14 62 5f 08 c0 	movl   $0x80482c0,0x85f6214
 804b0d0:	82 04 08 
 804b0d3:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 804b0d8:	8b 04 85 18 62 5f 08 	mov    0x85f6218(,%eax,4),%eax
 804b0df:	8b 00                	mov    (%eax),%eax
 804b0e1:	a3 80 d0 04 08       	mov    %eax,0x804d080
 804b0e6:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b0eb:	8b 10                	mov    (%eax),%edx
 804b0ed:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804b0f3:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b0f8:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b0fe:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b103:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b10a:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b110:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b116:	89 10                	mov    %edx,(%eax)
 804b118:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b11e:	89 d0                	mov    %edx,%eax
 804b120:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b125:	8b 80 a0 ff df ff    	mov    -0x200060(%eax),%eax
 804b12b:	a3 50 61 1f 08       	mov    %eax,0x81f6150
 804b130:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b135:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b13b:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b140:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b147:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b14d:	89 10                	mov    %edx,(%eax)
 804b14f:	a1 a8 61 3f 08       	mov    0x83f61a8,%eax
 804b154:	ba 4f b1 04 88       	mov    $0x8804b14f,%edx
 804b159:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804b15e:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 804b164:	b8 00 00 00 00       	mov    $0x0,%eax
 804b169:	b9 00 00 00 00       	mov    $0x0,%ecx
 804b16e:	ba 00 00 00 00       	mov    $0x0,%edx
 804b173:	a0 30 60 1f 08       	mov    0x81f6030,%al
 804b178:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804b17f:	8a 15 34 60 1f 08    	mov    0x81f6034,%dl
 804b185:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804b188:	89 15 20 60 1f 08    	mov    %edx,0x81f6020
 804b18e:	a0 31 60 1f 08       	mov    0x81f6031,%al
 804b193:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804b19a:	8a 15 35 60 1f 08    	mov    0x81f6035,%dl
 804b1a0:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804b1a3:	89 15 24 60 1f 08    	mov    %edx,0x81f6024
 804b1a9:	a0 32 60 1f 08       	mov    0x81f6032,%al
 804b1ae:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804b1b5:	8a 15 36 60 1f 08    	mov    0x81f6036,%dl
 804b1bb:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804b1be:	89 15 28 60 1f 08    	mov    %edx,0x81f6028
 804b1c4:	a0 33 60 1f 08       	mov    0x81f6033,%al
 804b1c9:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804b1d0:	8a 15 37 60 1f 08    	mov    0x81f6037,%dl
 804b1d6:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804b1d9:	89 15 2c 60 1f 08    	mov    %edx,0x81f602c
 804b1df:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804b1e4:	8b 15 24 60 1f 08    	mov    0x81f6024,%edx
 804b1ea:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804b1f1:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804b1f4:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804b1f9:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804b1fe:	8b 15 28 60 1f 08    	mov    0x81f6028,%edx
 804b204:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804b20b:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804b20e:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804b213:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804b218:	8b 15 2c 60 1f 08    	mov    0x81f602c,%edx
 804b21e:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804b225:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804b228:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804b22d:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804b232:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804b237:	8b 0d 20 60 1f 08    	mov    0x81f6020,%ecx
 804b23d:	c7 05 b4 61 3f 08 80 	movl   $0x804d080,0x83f61b4
 804b244:	d0 04 08 
 804b247:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b24e:	8b 15 d0 61 5f 08    	mov    0x85f61d0,%edx
 804b254:	89 10                	mov    %edx,(%eax)
 804b256:	c7 05 b4 61 3f 08 84 	movl   $0x804d084,0x83f61b4
 804b25d:	d0 04 08 
 804b260:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b267:	8b 15 d4 61 5f 08    	mov    0x85f61d4,%edx
 804b26d:	89 10                	mov    %edx,(%eax)
 804b26f:	c7 05 b4 61 3f 08 88 	movl   $0x804d088,0x83f61b4
 804b276:	d0 04 08 
 804b279:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b280:	8b 15 d8 61 5f 08    	mov    0x85f61d8,%edx
 804b286:	89 10                	mov    %edx,(%eax)
 804b288:	c7 05 b4 61 3f 08 8c 	movl   $0x804d08c,0x83f61b4
 804b28f:	d0 04 08 
 804b292:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b299:	8b 15 dc 61 5f 08    	mov    0x85f61dc,%edx
 804b29f:	89 10                	mov    %edx,(%eax)
 804b2a1:	c7 05 b4 61 3f 08 90 	movl   $0x804d090,0x83f61b4
 804b2a8:	d0 04 08 
 804b2ab:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b2b2:	8b 15 e0 61 5f 08    	mov    0x85f61e0,%edx
 804b2b8:	89 10                	mov    %edx,(%eax)
 804b2ba:	c7 05 b4 61 3f 08 94 	movl   $0x804d094,0x83f61b4
 804b2c1:	d0 04 08 
 804b2c4:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b2cb:	8b 15 e4 61 5f 08    	mov    0x85f61e4,%edx
 804b2d1:	89 10                	mov    %edx,(%eax)
 804b2d3:	c7 05 b4 61 3f 08 98 	movl   $0x804d098,0x83f61b4
 804b2da:	d0 04 08 
 804b2dd:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b2e4:	8b 15 e8 61 5f 08    	mov    0x85f61e8,%edx
 804b2ea:	89 10                	mov    %edx,(%eax)
 804b2ec:	c7 05 b4 61 3f 08 a0 	movl   $0x804d0a0,0x83f61b4
 804b2f3:	d0 04 08 
 804b2f6:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b2fd:	8b 15 ec 61 5f 08    	mov    0x85f61ec,%edx
 804b303:	89 10                	mov    %edx,(%eax)
 804b305:	8b 15 f0 61 5f 08    	mov    0x85f61f0,%edx
 804b30b:	89 50 04             	mov    %edx,0x4(%eax)
 804b30e:	c7 05 b4 61 3f 08 a8 	movl   $0x804d0a8,0x83f61b4
 804b315:	d0 04 08 
 804b318:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b31f:	8b 15 f4 61 5f 08    	mov    0x85f61f4,%edx
 804b325:	89 10                	mov    %edx,(%eax)
 804b327:	8b 15 f8 61 5f 08    	mov    0x85f61f8,%edx
 804b32d:	89 50 04             	mov    %edx,0x4(%eax)
 804b330:	c7 05 b4 61 3f 08 b0 	movl   $0x804d0b0,0x83f61b4
 804b337:	d0 04 08 
 804b33a:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b341:	8b 15 fc 61 5f 08    	mov    0x85f61fc,%edx
 804b347:	89 10                	mov    %edx,(%eax)
 804b349:	8b 15 00 62 5f 08    	mov    0x85f6200,%edx
 804b34f:	89 50 04             	mov    %edx,0x4(%eax)
 804b352:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804b357:	8b 04 85 90 61 3f 08 	mov    0x83f6190(,%eax,4),%eax
 804b35e:	c7 00 01 00 00 00    	movl   $0x1,(%eax)
 804b364:	c7 05 80 d0 04 08 00 	movl   $0x0,0x804d080
 804b36b:	00 00 00 
 804b36e:	a1 a8 61 3f 08       	mov    0x83f61a8,%eax
 804b373:	ba 6e b3 04 88       	mov    $0x8804b36e,%edx
 804b378:	a3 30 60 1f 08       	mov    %eax,0x81f6030
 804b37d:	89 15 34 60 1f 08    	mov    %edx,0x81f6034
 804b383:	b8 00 00 00 00       	mov    $0x0,%eax
 804b388:	b9 00 00 00 00       	mov    $0x0,%ecx
 804b38d:	ba 00 00 00 00       	mov    $0x0,%edx
 804b392:	a0 30 60 1f 08       	mov    0x81f6030,%al
 804b397:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804b39e:	8a 15 34 60 1f 08    	mov    0x81f6034,%dl
 804b3a4:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804b3a7:	89 15 20 60 1f 08    	mov    %edx,0x81f6020
 804b3ad:	a0 31 60 1f 08       	mov    0x81f6031,%al
 804b3b2:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804b3b9:	8a 15 35 60 1f 08    	mov    0x81f6035,%dl
 804b3bf:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804b3c2:	89 15 24 60 1f 08    	mov    %edx,0x81f6024
 804b3c8:	a0 32 60 1f 08       	mov    0x81f6032,%al
 804b3cd:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804b3d4:	8a 15 36 60 1f 08    	mov    0x81f6036,%dl
 804b3da:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804b3dd:	89 15 28 60 1f 08    	mov    %edx,0x81f6028
 804b3e3:	a0 33 60 1f 08       	mov    0x81f6033,%al
 804b3e8:	8b 0c 85 40 06 05 08 	mov    0x8050640(,%eax,4),%ecx
 804b3ef:	8a 15 37 60 1f 08    	mov    0x81f6037,%dl
 804b3f5:	8a 14 11             	mov    (%ecx,%edx,1),%dl
 804b3f8:	89 15 2c 60 1f 08    	mov    %edx,0x81f602c
 804b3fe:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804b403:	8b 15 24 60 1f 08    	mov    0x81f6024,%edx
 804b409:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804b410:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804b413:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804b418:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804b41d:	8b 15 28 60 1f 08    	mov    0x81f6028,%edx
 804b423:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804b42a:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804b42d:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804b432:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804b437:	8b 15 2c 60 1f 08    	mov    0x81f602c,%edx
 804b43d:	8b 04 85 e0 d0 04 08 	mov    0x804d0e0(,%eax,4),%eax
 804b444:	8b 04 90             	mov    (%eax,%edx,4),%eax
 804b447:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804b44c:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804b451:	a3 20 60 1f 08       	mov    %eax,0x81f6020
 804b456:	8b 0d 20 60 1f 08    	mov    0x81f6020,%ecx
 804b45c:	c7 05 b4 61 3f 08 80 	movl   $0x804d080,0x83f61b4
 804b463:	d0 04 08 
 804b466:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b46d:	8b 15 d0 61 5f 08    	mov    0x85f61d0,%edx
 804b473:	89 10                	mov    %edx,(%eax)
 804b475:	c7 05 b4 61 3f 08 84 	movl   $0x804d084,0x83f61b4
 804b47c:	d0 04 08 
 804b47f:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b486:	8b 15 d4 61 5f 08    	mov    0x85f61d4,%edx
 804b48c:	89 10                	mov    %edx,(%eax)
 804b48e:	c7 05 b4 61 3f 08 88 	movl   $0x804d088,0x83f61b4
 804b495:	d0 04 08 
 804b498:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b49f:	8b 15 d8 61 5f 08    	mov    0x85f61d8,%edx
 804b4a5:	89 10                	mov    %edx,(%eax)
 804b4a7:	c7 05 b4 61 3f 08 8c 	movl   $0x804d08c,0x83f61b4
 804b4ae:	d0 04 08 
 804b4b1:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b4b8:	8b 15 dc 61 5f 08    	mov    0x85f61dc,%edx
 804b4be:	89 10                	mov    %edx,(%eax)
 804b4c0:	c7 05 b4 61 3f 08 90 	movl   $0x804d090,0x83f61b4
 804b4c7:	d0 04 08 
 804b4ca:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b4d1:	8b 15 e0 61 5f 08    	mov    0x85f61e0,%edx
 804b4d7:	89 10                	mov    %edx,(%eax)
 804b4d9:	c7 05 b4 61 3f 08 94 	movl   $0x804d094,0x83f61b4
 804b4e0:	d0 04 08 
 804b4e3:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b4ea:	8b 15 e4 61 5f 08    	mov    0x85f61e4,%edx
 804b4f0:	89 10                	mov    %edx,(%eax)
 804b4f2:	c7 05 b4 61 3f 08 98 	movl   $0x804d098,0x83f61b4
 804b4f9:	d0 04 08 
 804b4fc:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b503:	8b 15 e8 61 5f 08    	mov    0x85f61e8,%edx
 804b509:	89 10                	mov    %edx,(%eax)
 804b50b:	c7 05 b4 61 3f 08 a0 	movl   $0x804d0a0,0x83f61b4
 804b512:	d0 04 08 
 804b515:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b51c:	8b 15 ec 61 5f 08    	mov    0x85f61ec,%edx
 804b522:	89 10                	mov    %edx,(%eax)
 804b524:	8b 15 f0 61 5f 08    	mov    0x85f61f0,%edx
 804b52a:	89 50 04             	mov    %edx,0x4(%eax)
 804b52d:	c7 05 b4 61 3f 08 a8 	movl   $0x804d0a8,0x83f61b4
 804b534:	d0 04 08 
 804b537:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b53e:	8b 15 f4 61 5f 08    	mov    0x85f61f4,%edx
 804b544:	89 10                	mov    %edx,(%eax)
 804b546:	8b 15 f8 61 5f 08    	mov    0x85f61f8,%edx
 804b54c:	89 50 04             	mov    %edx,0x4(%eax)
 804b54f:	c7 05 b4 61 3f 08 b0 	movl   $0x804d0b0,0x83f61b4
 804b556:	d0 04 08 
 804b559:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b560:	8b 15 fc 61 5f 08    	mov    0x85f61fc,%edx
 804b566:	89 10                	mov    %edx,(%eax)
 804b568:	8b 15 00 62 5f 08    	mov    0x85f6200,%edx
 804b56e:	89 50 04             	mov    %edx,0x4(%eax)
 804b571:	a1 20 60 1f 08       	mov    0x81f6020,%eax
 804b576:	8b 04 85 90 61 3f 08 	mov    0x83f6190(,%eax,4),%eax
 804b57d:	c7 00 01 00 00 00    	movl   $0x1,(%eax)
 804b583:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b588:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b58e:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b593:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b59a:	8b 15 74 61 3f 08    	mov    0x83f6174,%edx
 804b5a0:	89 10                	mov    %edx,(%eax)
 804b5a2:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b5a7:	8b 10                	mov    (%eax),%edx
 804b5a9:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804b5af:	8b 50 04             	mov    0x4(%eax),%edx
 804b5b2:	89 15 54 61 1f 08    	mov    %edx,0x81f6154
 804b5b8:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b5bd:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b5c3:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b5c8:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b5cf:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b5d5:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b5db:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b5e1:	89 10                	mov    %edx,(%eax)
 804b5e3:	b8 b0 d0 04 08       	mov    $0x804d0b0,%eax
 804b5e8:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b5ee:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b5f3:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b5fa:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b600:	89 10                	mov    %edx,(%eax)
 804b602:	8b 15 54 61 1f 08    	mov    0x81f6154,%edx
 804b608:	89 50 04             	mov    %edx,0x4(%eax)
 804b60b:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b610:	8b 10                	mov    (%eax),%edx
 804b612:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804b618:	8b 50 04             	mov    0x4(%eax),%edx
 804b61b:	89 15 54 61 1f 08    	mov    %edx,0x81f6154
 804b621:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b626:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b62c:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b631:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b638:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b63e:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b644:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b64a:	89 10                	mov    %edx,(%eax)
 804b64c:	b8 a8 d0 04 08       	mov    $0x804d0a8,%eax
 804b651:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b657:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b65c:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b663:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b669:	89 10                	mov    %edx,(%eax)
 804b66b:	8b 15 54 61 1f 08    	mov    0x81f6154,%edx
 804b671:	89 50 04             	mov    %edx,0x4(%eax)
 804b674:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b679:	8b 10                	mov    (%eax),%edx
 804b67b:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804b681:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b686:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b68c:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b691:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b698:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b69e:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b6a4:	89 10                	mov    %edx,(%eax)
 804b6a6:	b8 98 d0 04 08       	mov    $0x804d098,%eax
 804b6ab:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b6b1:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b6b6:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b6bd:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b6c3:	89 10                	mov    %edx,(%eax)
 804b6c5:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b6ca:	8b 10                	mov    (%eax),%edx
 804b6cc:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804b6d2:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b6d7:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b6dd:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b6e2:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b6e9:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b6ef:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b6f5:	89 10                	mov    %edx,(%eax)
 804b6f7:	b8 94 d0 04 08       	mov    $0x804d094,%eax
 804b6fc:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b702:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b707:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b70e:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b714:	89 10                	mov    %edx,(%eax)
 804b716:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b71b:	8b 10                	mov    (%eax),%edx
 804b71d:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804b723:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b728:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b72e:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b733:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b73a:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b740:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b746:	89 10                	mov    %edx,(%eax)
 804b748:	b8 8c d0 04 08       	mov    $0x804d08c,%eax
 804b74d:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b753:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b758:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b75f:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b765:	89 10                	mov    %edx,(%eax)
 804b767:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b76c:	8b 10                	mov    (%eax),%edx
 804b76e:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804b774:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b779:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b77f:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b784:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b78b:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b791:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b797:	89 10                	mov    %edx,(%eax)
 804b799:	b8 88 d0 04 08       	mov    $0x804d088,%eax
 804b79e:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b7a4:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b7a9:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b7b0:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b7b6:	89 10                	mov    %edx,(%eax)
 804b7b8:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b7bd:	8b 10                	mov    (%eax),%edx
 804b7bf:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804b7c5:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b7ca:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b7d0:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b7d5:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b7dc:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b7e2:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b7e8:	89 10                	mov    %edx,(%eax)
 804b7ea:	b8 84 d0 04 08       	mov    $0x804d084,%eax
 804b7ef:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b7f5:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b7fa:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b801:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b807:	89 10                	mov    %edx,(%eax)
 804b809:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b80e:	8b 10                	mov    (%eax),%edx
 804b810:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804b816:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b81b:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b821:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b826:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b82d:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b833:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b839:	89 10                	mov    %edx,(%eax)
 804b83b:	b8 74 61 3f 08       	mov    $0x83f6174,%eax
 804b840:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b846:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b84b:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b852:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b858:	89 10                	mov    %edx,(%eax)
 804b85a:	a1 70 61 3f 08       	mov    0x83f6170,%eax
 804b85f:	8b 10                	mov    (%eax),%edx
 804b861:	89 15 50 61 1f 08    	mov    %edx,0x81f6150
 804b867:	b8 70 61 3f 08       	mov    $0x83f6170,%eax
 804b86c:	8b 15 98 61 3f 08    	mov    0x83f6198,%edx
 804b872:	a3 b4 61 3f 08       	mov    %eax,0x83f61b4
 804b877:	8b 04 95 b0 61 3f 08 	mov    0x83f61b0(,%edx,4),%eax
 804b87e:	8b 15 70 61 3f 08    	mov    0x83f6170,%edx
 804b884:	8b 92 a0 ff df ff    	mov    -0x200060(%edx),%edx
 804b88a:	89 10                	mov    %edx,(%eax)
 804b88c:	8b 15 50 61 1f 08    	mov    0x81f6150,%edx
 804b892:	89 d0                	mov    %edx,%eax
 804b894:	a3 40 61 1f 08       	mov    %eax,0x81f6140
 804b899:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 804b89e:	8b 04 85 a0 61 3f 08 	mov    0x83f61a0(,%eax,4),%eax
 804b8a5:	8b 15 40 61 1f 08    	mov    0x81f6140,%edx
 804b8ab:	89 10                	mov    %edx,(%eax)
 804b8ad:	8b 0d 98 61 3f 08    	mov    0x83f6198,%ecx
 804b8b3:	c7 05 b4 61 3f 08 d0 	movl   $0x85f61d0,0x83f61b4
 804b8ba:	61 5f 08 
 804b8bd:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b8c4:	8b 15 80 d0 04 08    	mov    0x804d080,%edx
 804b8ca:	89 10                	mov    %edx,(%eax)
 804b8cc:	8b 15 84 d0 04 08    	mov    0x804d084,%edx
 804b8d2:	89 50 04             	mov    %edx,0x4(%eax)
 804b8d5:	8b 15 88 d0 04 08    	mov    0x804d088,%edx
 804b8db:	89 50 08             	mov    %edx,0x8(%eax)
 804b8de:	8b 15 8c d0 04 08    	mov    0x804d08c,%edx
 804b8e4:	89 50 0c             	mov    %edx,0xc(%eax)
 804b8e7:	c7 05 b4 61 3f 08 e0 	movl   $0x85f61e0,0x83f61b4
 804b8ee:	61 5f 08 
 804b8f1:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b8f8:	8b 15 90 d0 04 08    	mov    0x804d090,%edx
 804b8fe:	89 10                	mov    %edx,(%eax)
 804b900:	8b 15 94 d0 04 08    	mov    0x804d094,%edx
 804b906:	89 50 04             	mov    %edx,0x4(%eax)
 804b909:	8b 15 98 d0 04 08    	mov    0x804d098,%edx
 804b90f:	89 50 08             	mov    %edx,0x8(%eax)
 804b912:	c7 05 b4 61 3f 08 ec 	movl   $0x85f61ec,0x83f61b4
 804b919:	61 5f 08 
 804b91c:	8b 04 8d b0 61 3f 08 	mov    0x83f61b0(,%ecx,4),%eax
 804b923:	8b 15 a0 d0 04 08    	mov    0x804d0a0,%edx
 804b929:	89 10                	mov    %edx,(%eax)
 804b92b:	8b 15 a4 d0 04 08    	mov    0x804d0a4,%edx
 804b931:	89 50 04             	mov    %edx,0x4(%eax)
 804b934:	8b 15 a8 d0 04 08    	mov    0x804d0a8,%edx
 804b93a:	89 50 08             	mov    %edx,0x8(%eax)
 804b93d:	8b 15 ac d0 04 08    	mov    0x804d0ac,%edx
 804b943:	89 50 0c             	mov    %edx,0xc(%eax)
 804b946:	8b 15 b0 d0 04 08    	mov    0x804d0b0,%edx
 804b94c:	89 50 10             	mov    %edx,0x10(%eax)
 804b94f:	8b 15 b4 d0 04 08    	mov    0x804d0b4,%edx
 804b955:	89 50 14             	mov    %edx,0x14(%eax)
 804b958:	a1 98 61 3f 08       	mov    0x83f6198,%eax
 804b95d:	8b 04 85 90 61 3f 08 	mov    0x83f6190(,%eax,4),%eax
 804b964:	c7 00 00 00 00 00    	movl   $0x0,(%eax)
 804b96a:	8b 25 70 61 3f 08    	mov    0x83f6170,%esp
 804b970:	8e c8                	mov    %eax,%cs
