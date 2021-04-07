def bar(arg1, arg2, arg3):
    return (arg3 + 1) * arg2 + arg1

def foo(arg1, arg2):
    # 1U is an unsigned value with the single bit 0 set, and all the other bits cleared. The << operator means "shift to the left". 1U << 0 means create a value with bit 0 set; 1U << 2 means create a value with bit 2 set; 1U << 3 means create a value with bit 3 set etc. 1U is unsigned.
    #return arg2 + 1U ^ arg1 ^ 0x539
    return arg2 + 1 ^ arg1 ^ 0x539
