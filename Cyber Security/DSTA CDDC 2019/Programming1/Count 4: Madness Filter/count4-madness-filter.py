#!/usr/bin/env python
import os, sys, subprocess, shlex, time, hashlib, random, signal, errno
from string import *
from threading import *
from functools import wraps

class Unbuffered(object):
   def __init__(self, stream):
       self.stream = stream
   def write(self, data):
       self.stream.write(data)
       self.stream.flush()
   def writelines(self, datas):
       self.stream.writelines(datas)
       self.stream.flush()
   def __getattr__(self, attr):
       return getattr(self.stream, attr)

sys.stdout = Unbuffered(sys.stdout)

flag    = "$CDDC19${???????????????????????????????????????????????????????}"
my_code = open('my_code.c', 'rb').read()

class TimeoutError(Exception):
    pass

def timeout(seconds=10, error_message=os.strerror(errno.ETIME)):
    def decorator(func):
        def _handle_timeout(signum, frame):
            raise TimeoutError(error_message)

        def wrapper(*args, **kwargs):
            signal.signal(signal.SIGALRM, _handle_timeout)
            signal.alarm(seconds)
            try:
                result = func(*args, **kwargs)
            finally:
                signal.alarm(0)
            return result
        return wraps(func)(wrapper)
    return decorator

def run(cmd, timeout_sec=5):
    proc = subprocess.Popen(shlex.split(cmd), stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    kill_proc = lambda p: p.kill()
    timer = Timer(timeout_sec, kill_proc, [proc])
    timer.start()
    stdout, stderr = proc.communicate()
    timer.cancel()
    return stdout, stderr

def bye(ch):
    print "You don't need this character: {}".format(ch)
    print "It makes the code too long, my friend...\n"
    sys.exit(-1)

def check(code):
    if len(code) > 44:
        print "Code size is {}! Too long!".format(len(code))
        sys.exit(-1)
    elif len(code) < 20:
        print "Really? Are you kidding me?"
        sys.exit(-1)
    else:
        bad_func = ["system", "exec", "popen"]
        for b in bad_func:
            if b in code:
                print "Nope! Don't even attempt to pwn this challenge!"
                sys.exit(-1)
    for ch in code:
        if ch not in letters + digits + punctuation: # filter
            bye(ch)

    # checking 'mad printf'
    mad = 'mad printf'
    for ch in code:
        if ch.islower() and (ch not in mad):
            print "\nSorry, this key is broken! -> '{}'".format(ch)
            sys.exit(-1)

    return code

def randomname(length=32):
    return ''.join((random.choice(letters + digits) for i in range(length)))

def compile_and_run(code):
    executable = "your_code_" + randomname()
    source     = "{}.c".format(executable)
    ret        = 0
    open(source, "wb").write(code)

    # No need to redo every time below
    '''
    run("gcc -o my_code my_code.c")
    result1 = run("./my_code")
    print hashlib.md5(result1).hexdigest() # 75f00cff900c8966fa45a8fecee03ad6
    '''

    _, err_msg = run("gcc -o {} {} -std=c90".format(executable, source))

    if not os.path.exists("./" + executable):
        print "[FAIL] Executable file does not exist. Maybe there are compilation errors."
        print err_msg
    else:
        result2 = run("./" + executable)[0]
        if "75f00cff900c8966fa45a8fecee03ad6" == hashlib.md5(result2).hexdigest():
            ret = 1
        else:
            print "[FAIL] Results are different : ", hashlib.md5(result2).hexdigest()

    run("rm {} {}".format(source, executable))
    return ret

@timeout(10, os.strerror(errno.ETIMEDOUT))

def main():
    greeting = '''
[Count 4 : Madness - Filter] 

Oh, my friend has a broken keyboard.
Only a few keys work on it.
Can you change my code for him?

This is my code:
----------------------------------------|
{}
----------------------------------------/
    '''.format(my_code)
    print greeting

    c_code = raw_input("Your code : ")
    c_code = check(c_code)

    if compile_and_run(c_code) == 1:
        print "Flag :", flag

main()
