# WIDE

![](Pasted%20image%2020220514221421.png)

## Solution

On Decompiling in Cutter, I notice it uses `wcscmp` to compare 2 strings in the `menu` function.

![](Pasted%20image%2020220515234726.png)

Guessing the string gives me the flag

```bash
(base) [hacker@hackerbook rev_wide]$ ./wide db.ex 
[*] Welcome user: kr4eq4L2$12xb, to the Widely Inflated Dimension Editor [*]
[*]    Serving your pocket dimension storage needs since 14,012.5 B      [*]
[*]                       Displaying Dimensions....                      [*]
[*]       Name       |              Code                |   Encrypted    [*]
[X] Primus           | people breathe variety practice  |                [*]
[X] Cheagaz          | scene control river importance   |                [*]
[X] Byenoovia        | fighting cast it parallel        |                [*]
[X] Cloteprea        | facing motor unusual heavy       |                [*]
[X] Maraqa           | stomach motion sale valuable     |                [*]
[X] Aidor            | feathers stream sides gate       |                [*]
[X] Flaggle Alpha    | admin secret power hidden        |       *        [*]
Which dimension would you like to examine? 6
[X] That entry is encrypted - please enter your WIDE decryption key: sup3rs3cr3tw1d3
HTB{str1ngs_4r3nt_4lw4ys_4sc11}
Which dimension would you like to examine?  Our home dimension
Which dimension would you like to examine? 
```


## Flag

`HTB{str1ngs_4r3nt_4lw4ys_4sc11}`