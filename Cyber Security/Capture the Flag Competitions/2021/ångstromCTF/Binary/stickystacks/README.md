# stickystacks

### Description

![](Description.png)

## Solution

I didn't actually solve it in the CTF.

### What i did

I decompiled it in Cutter and looked at the `vuln` function
```
var_8h = fopen("flag.txt", 0x402008);
  if (var_8h == 0) {
      printf("Missing flag.txt. Contact an admin if you see this on remote.");
      exit(1);
  }
  fgets((int64_t)&var_9ah + 2, 0x80, var_8h, (int64_t)&var_9ah + 2);
  puts("Name: ");
  fgets(format, 6, _reloc.stdin);
  printf("Welcome, ");
  printf(format);
  .plt.sec(10);
```

When I saw `printf(format);` I knew it was a format string vulnerability.
If we are lucky we could somehow leak the value of `var_8h` which stores the flag's contents

To find the location of the value, let's disassemble this. I used `objdump -M intel -d stickystacks`
```
401369:	48 8d 35 98 0c 00 00 	lea    rsi,[rip+0xc98]        # 402008 <_IO_stdin_used+0x8>
401370:	48 8d 3d 93 0c 00 00 	lea    rdi,[rip+0xc93]        # 40200a <_IO_stdin_used+0xa>
401377:	e8 74 fd ff ff       	call   4010f0 <fopen@plt>
40137c:	48 89 45 f8          	mov    QWORD PTR [rbp-0x8],rax
```
The variable is `rbp-0x8`. We could access this in gdb

Next step is to test the vulnerability. This includes printing whatever is on the stack, and finding out what parts of the stack we can control

With `dump.py`, I connected to the server and printed out everything on the stack. Then I got stuck

### After the CTF

After the CTF, I referenced the writeup [here](https://ctftime.org/writeup/27044), and realised that I was so close.
With the hex data I gathered in `dump.py`, I extracted a large section out and just converted it into a text form, using the program `solve.py`

Some Notes
1. Get the data using `%p`. Why `%p`? I'm not sure, maybe trial and error? (you can test `%x` and `%p`). My guess is that `%p` just prints it in a better format
2. Remember to conver using little endian, else get wrecked.
```
;;;;;;;era sFTC!nuf ;;;;owssap321dr;;;;/1/10791;;;;2187-654-309;;;;lew{ftcaab_m'i_llb_ni_kc_sey_kcakcab_m'i_eht_ni_eb_kcats49215b9c48677dae;;;;;;;@ ;;;@;;U0Q& ;;;@ ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;!;;;
```

Running the final program
```
;;;		;CTFs are fun!;;;;password123;;;;1/1/1970;;;;123-456-7890;;;;actf{well_i'm_back_in_black_yes_i'm_back_in_the_stack_bec9b51294ead77684a1f593}
;;;;;; @;;;@;; &Q0U;; @;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;!;;
```
What I learnt
1. I learnt about the `%{pos}${padd}{format}` notation
2. Just because you print it out as a hex format does not mean that it is intended to be a number. Sometimes, you can just convert it. to be characters
3. The %c is useless to me lmao

## Flag

`actf{well_i'm_back_in_black_yes_i'm_back_in_the_stack_bec9b51294ead77684a1f593}`
