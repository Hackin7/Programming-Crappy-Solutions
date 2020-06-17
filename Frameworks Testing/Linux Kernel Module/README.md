# Linux Kernel Module Programming

To compile a module make sure
 * You installed binutils, and the path to the folder has no spaces
 * Run `make`
 
Useful commands
 * Run `tail -f /var/log/kern.log` to view the printk statements
 * Run something like `insmod hello.ko mystring="supercalifragilisticexpialidocious" mybyte=256 myintArray=−1,−1` to load
 * `rmmod hello` to remove the module
 * `modinfo hello.ko` to view information about it
 * `make clean` to remove all previous files from compilation

## Useful resources
1. The Linux Kernel Module Programming Guide [HTML](https://tldp.org/LDP/lkmpg/2.6/html/index.html),[PDF](https://www.tldp.org/LDP/lkmpg/2.6/lkmpg.pdf)
2. [Linux Kernel Teaching: Kernel modules](https://linux-kernel-labs.github.io/refs/heads/master/labs/kernel_modules.html)
3. [Engineer Man: How to build a Linux loadable kernel module that Rickrolls people](https://www.youtube.com/watch?v=CWihl19mJig&list=PLaSzC-ImuPalL-N2dVQzP-PgnLHL7GZNB&index=2&t=312s)