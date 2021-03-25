# RSB (2/4)

163, CRYPTO, 26 SOLVES

## Description

Let's kick it up a notch. Bob generated these RSA parameters and was certain that his encryption would be unbreakable because his smartest friend (John) couldn't crack it. Is it truly secure?

Download vals.txt and decrypt the value of c given all the other params.

Author: lord_idiot

## Attached Files

vals.txt

# Solution

`vals.txt` has the necessary values of n, e and c.
Just run [RsaCtfTool](https://github.com/Ganapati/RsaCtfTool) to decrypt

```
$ python3 RsaCtfTool.py -n 702920415766607170773466108765523213222609807958470426429279 -e 65537 --uncipher 471942432444013498766618748088184020223806593029552824676187
private argument is not set, the private key will not be displayed, even if recovered.

[] Testing key /tmp/tmpbu6910k7.
Can't load roca because sage is not installed
Can't load qicheng because sage is not installed
Can't load ecm because sage is not installed
Can't load ecm2 because sage is not installed
Can't load boneh_durfee because sage is not installed
Can't load smallfraction because sage is not installed
[] Performing pollard_p_1 attack on /tmp/tmpbu6910k7.
[] Performing siqs attack on /tmp/tmpbu6910k7.
[!] Yafu SIQS is not working.
[] Performing partial_q attack on /tmp/tmpbu6910k7.
[] Performing fermat attack on /tmp/tmpbu6910k7.
[] Performing mersenne_primes attack on /tmp/tmpbu6910k7.
[] Performing noveltyprimes attack on /tmp/tmpbu6910k7.
[] Performing factordb attack on /tmp/tmpbu6910k7.

Results for /tmp/tmpbu6910k7:

Unciphered data :
HEX : 0x0000005748323032307b4231676733725f7072696d6573217d
INT (big endian) : 32656079108868117214726578450118662183727772799803773
INT (little endian) : 785457927329104267774694390660870583954377039255486184030208
STR : b'\x00\x00\x00WH2020{B1gg3r_primes!}'
```

~~Don't be like me and spend 1/2 your time installing this~~

# Flag

`WH2020{B1gg3r_primes!}`