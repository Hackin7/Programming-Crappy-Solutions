#!/bin/sh
FILENAME=check
nasm -f elf $FILENAME.asm
ld -m elf_i386 -s -o $FILENAME $FILENAME.o
./$FILENAME
