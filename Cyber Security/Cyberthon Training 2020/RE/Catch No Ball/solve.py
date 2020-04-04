#!/usr/bin/env python
'''
Basically, to solve this problem, you HAVE to try to interpret this code
using your pseudocode knowledge and genius, and to figure out what it does

Through some analysis of the code, only the main function 'decode' is 
important, along with its helper functions.

The main code was doable to debug, but I made some mistakes. After quite
a while of looking at my mistakes and stuff, I managed to interpret it 
and get it working
-------------------------------------------------------------------------
My interpretation of the code to python
This may not be 100% accurate or correct or complete, but gets the job done
Use a little inference of programming constructs to figure things out

? condition : if not condition
teluwhut: def (Define a function) 
okcan : return
issit: Equate 2 items == 
<<: Define/Set a variable =
$$: List []
<<<: Append Back
>>>: Append front
thing ~ $something$: for thing in something: (for loop)

mod: Modulo
then...fin : Basic Pseudocode open and close Constructs
'''

disnotflag = [0x64, 0x6c, 0x30, 0x62, 0x34, 0x5f, 0x5f, 0x33, 0x6c, 0x6d, 0x6e, 0x34, 0x62, 0x31, 0x5f, 0x33, 0x74, 0x64, 0x6e, 0x62, 0x6d, 0x30, 0x7a, 0x33]

###Debugging: Not in original code#############################
def showdisnotflag(f): # Show in ascii form, more redable
    for i in f:
        print(chr(i),end='')
###############################################################

def decode(something):
    result = ''
    count = haolung(something)
    counter = []

    def lll(a,b): a.append(b) #Custom Function
    
    final = []
    for thing in range(1,count+1):#counter:
        if not thing%2==0:
            '''
            x.pop(1) means remove item at index 1 of x and return it
            example, x <<- $123, 234, 345$
            After running y <<- x.pop(1), x is now $123, 345$ and y is now 234
            
            #disnotflag.pop(0)<<<final
            '''
            # This code was weird, as it does not make sense to append a list to a function return value
            # Through trial and error, it has been decoded in the lll function
            lll(final,disnotflag.pop(0))
        else:
            lll(final,disnotflag.pop(haolung(disnotflag)-1))
            '''
            disnotflag.pop(len(disnotflag)-1) <<< final
            '''
        ###Debugging: Not in original code################################
        showdisnotflag(disnotflag)
        print("  ",end="")
        showdisnotflag(final)   
        print() 
        ###################################################################
        
    final = sdrawkcab(final) #Reverse the string
    for thing in final:
        result+=chr(thing)
    print(result)#Debugging
    return result


def samesame(disone, datone, checker):
    return checker(disone) == checker(datone)

# Gives you an array with the items in something but reversed
def sdrawkcab(something): 
    dis = []

    for thing in something:
        dis = [thing]+dis
        #thing >>> dis #<rant> append thing to front of dis </rant>
    
    return dis

# Gives you the length of an array "something"
def haolung(something): 
    haomehnee = 0
    
    for thing in something:
        haomehnee = haomehnee + 1

    return haomehnee
    
# The function testflag(whatutype) and the rest of the code not important

decode(disnotflag)

# After much looking, I realised the output looked like words and put it in
# Flag: CTFSG{b41n_m3lt3d_n_b4mb00zl3d}
