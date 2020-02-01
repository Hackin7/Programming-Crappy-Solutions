# Hello
The code just shows 'Hello' on Screen

To run
```
nasm hello.asm -o hello.bin
qemu-system-i386 hello.bin -soundhw pcspk
```
To flash on disk to boot, run
```
sudo dd if=hello.bin of=/dev/sdb
```
Replace /dev/sdb with your disk

To test that the image has been flashed, run
```
sudo qemu-system-i386 -hda /dev/sdb -soundhw pcspk
```

Inspired by https://github.com/cfenollosa/os-tutorial
Saturday, 01. February 2020 09:16PM 
