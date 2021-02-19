'''
Solutions to exercises from https://ruslanspivak.com/lsbasi-part10/

Programming Exercises
1. If you haven’t done so yet, then, as an exercise, re-implement the interpreter in this article without looking at the source code and use part10.pas as your test input file
(This time I did a compiler to Python)
'''

import sys
sys.setrecursionlimit(50)

from lexer import Lexer
from astparser import Parser
from interpreter import Interpreter

text = '''
/*
hello
*/
DECLARE integer : INTEGER
DECLARE declared_array : ARRAY[2,8] OF STRING
text <- 'hello'
INPUT declared_array[1][2]
OUTPUT declared_array[1][2]

a <- 1 * 2 + 2 * 32 * 3
b <-  3 
c <- b + a
OUTPUT b
FOR i <- 1 TO 10 
    a <- a + 1
ENDFOR
WHILE a < 10 DO
    a <- a + 1
ENDWHILE
IF b == 2 THEN
    a <- 1
ELSE
    a <- 2 + 2
ENDIF

PROCEDURE hello(a, b, c)
    OUTPUT "Hello"
    RETURN
ENDPROCEDURE

FUNCTION hellofunc(a, b, c)
    OUTPUT "Hello"
    RETURN "hello"
ENDFUNCTION
OUTPUT int(1)
'''

if __name__ == '__main__':
    #text = input('parse> ')

    l = Lexer(text)
    p = Parser(l)

    i = Interpreter(p.program())
    print()
    print(i.visit())
    with open("test.py", "w") as file:file.write(i.visit())
    import test
