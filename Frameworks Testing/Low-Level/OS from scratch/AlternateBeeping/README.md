# AlternateBeeping
To run
```
nasm beeping.asm -o beeping.bin
qemu-system-i386 beeping.bin -soundhw pcspk
```

The code just shows a message and alternates between beeping and not beeping. It tests 
1. TTY mode and showing Text on Screep
2. Speaker On and Off code (Testing tnhe frequency)
3. Delay code

Inspired by https://github.com/cfenollosa/os-tutorial
