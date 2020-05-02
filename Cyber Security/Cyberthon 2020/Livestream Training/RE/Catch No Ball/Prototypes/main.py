#!/usr/bin/env python

disnotflag = [0x64, 0x6c, 0x30, 0x62, 0x34, 0x5f, 0x5f, 0x33, 0x6c, 0x6d, 0x6e, 0x34, 0x62, 0x31, 0x5f, 0x33, 0x74, 0x64, 0x6e, 0x62, 0x6d, 0x30, 0x7a, 0x33]

for i in disnotflag:
    print(chr(i),end='')
print()
###############################################################

def decode(something):
    result = ''
    count = haolung(something)
    counter = []
    # Get a list of stu
    while not(count == 0):
        counter=[count]+counter #count >>> counter
        count = count-1
        
    #print(counter)#Debugging
    
    def rrr(a,b):
        #a.append(b)
        a.insert(0,b)
        #a = a+[b]
    
    final = []
    for thing in counter:
        if not thing%2==0:
            '''<rant> x.pop(1) means remove item at index 1 of x and return it </rant>
                <rant> example, x <<- $123, 234, 345$ </rant>
                <rant> After running y <<- x.pop(1), x is now $123, 345$ and y is now 234 </rant>
                #disnotflag.pop(0)<<<final
            '''
            rrr(final,disnotflag.pop(0))
            #final = [disnotflag[0]]+final
        else:
            #final.append(disnotflag[haolung(disnotflag)-1])
            #final = [disnotflag[haolung(disnotflag)-1]]+final
            #final.append( disnotflag.pop(haolung(disnotflag)-1) )
            rrr(final,disnotflag.pop(haolung(disnotflag)-1))
            #final = final+ [disnotflag[haolung(disnotflag)-1]]
            '''
            disnotflag.pop(haolung(disnotflag)-1) <<< final
            '''
    
    final = sdrawkcab(final)
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

def sdrawkcab(something): #backwards
    dis = []

    for thing in something:
        dis = [thing]+dis
        #thing >>> dis #<rant> append thing to front of dis </rant>
    #print(something,dis)
    return dis

def testflag(whatutype):
    if not samesame(whatutype, disnotflag, haolung):
        #okcan -
        return False
    else:
        print('d3lz00bm4b_n_d3tl3m_n14b'==decode(disnotflag))
        print(decode(disnotflag))
        return decode(disnotflag) == whatutype

#Done
def haolung(something):
    return len(something) #My own code
    haomehnee = 0
    
    for thing in something:
        haomehnee = haomehnee + 1

    return haomehnee

input_ = input('')
if not input_ == testflag(input_):
    print('You keyed in wrong flag')
else:
    print('The flag is correct!')
