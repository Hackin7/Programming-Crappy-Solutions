#!/usr/bin/env python

disnotflag = [0x64, 0x6c, 0x30, 0x62, 0x34, 0x5f, 0x5f, 0x33, 0x6c, 0x6d, 0x6e, 0x34, 0x62, 0x31, 0x5f, 0x33, 0x74, 0x64, 0x6e, 0x62, 0x6d, 0x30, 0x7a, 0x33]

def showdisnotflag(f):
    for i in f:
        print(chr(i),end='')
###############################################################

def decode(something):
    result = ''
    count = len(something)
    counter = []

    def rrr(a,b):
        #a.append(b)
        a.insert(0,b)
        #a = a+[b]
    
    final = []
    for thing in range(1,count+1):#counter:
        if not thing%2==0:
            '''
            x.pop(1) means remove item at index 1 of x and return it
            example, x <<- $123, 234, 345$
            After running y <<- x.pop(1), x is now $123, 345$ and y is now 234
            
            #disnotflag.pop(0)<<<final
            '''
            rrr(final,disnotflag.pop(0))
            #final = [disnotflag[0]]+final
        else:
            rrr(final,disnotflag.pop(len(disnotflag)-1))
            '''
            disnotflag.pop(len(disnotflag)-1) <<< final
            '''
        showdisnotflag(disnotflag)
        print("  ",end="")
        showdisnotflag(final)   
        print() 
        
    final = backwards(final)
    for thing in final:
        result+=chr(thing)
    print(result)
    return result

#teluwhut: def (function)
# okcan : return
# issit: == 
# <<: =
# $$:[]


def samesame(disone, datone, checker):
    return checker(disone) == checker(datone)

def backwards(something): #backwards
    dis = []

    for thing in something:
        dis = [thing]+dis
        #thing >>> dis #<rant> append thing to front of dis </rant>
    #print(something,dis)
    return dis

def testflag(whatutype):
    #if not samesame(whatutype, disnotflag, len):
        #okcan -
        #return False
    #else:
        print('d3lz00bm4b_n_d3tl3m_n14b'==decode(disnotflag))
        print(decode(disnotflag))
        return decode(disnotflag) == whatutype


input_ = input('')
if not input_ == testflag(input_):
    print('You keyed in wrong flag')
else:
    print('The flag is correct!')

#CTFSG{b41n_m3lt3d_n_b4mb00zl3d}
