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

from semantic_analyser import *
from interpreter import Interpreter
from convert_to_python import Interpreter as ToPythonInterpreter

text = '''
/*
hello
*/

DECLARE integer : INTEGER
DECLARE declared_array : ARRAY[2,8] OF STRING
text <- 'hello'
declared_array[0][0] <- 'hi'
INPUT declared_array[1][2]
OUTPUT declared_array[1][2]

a <- 1 * 2 + 2 * 32 * 3
b <-  3 
c <- b + a
OUTPUT b

OUTPUT '### Loops Testing #########################'
d <- 0
FOR i <- 1 TO 10 
    d <- d + 1
ENDFOR
OUTPUT d
WHILE d < 20 DO
    d <- d + 1
ENDWHILE
OUTPUT d

OUTPUT '### Conditionals Testing #########################'
IF b == 2 THEN
    a <- 1
ELSE
    a <- 2 + 2
ENDIF

OUTPUT '### Functions Testing #########################'

PROCEDURE hello(a, b, c)
    OUTPUT "## Hello is called ########"
    OUTPUT a
    OUTPUT b
    RETURN 
    OUTPUT c
ENDPROCEDURE

FUNCTION hellofunc(a, b, c)
    OUTPUT "## hellofunc is called ########"
    OUTPUT "which calls hello(2, 3, 4)"
    CALL hello(2, 3, 4)
    OUTPUT "and returns hello"
    RETURN "hello"
ENDFUNCTION

CALL hello(1, 2, 3)
OUTPUT hellofunc(1, 2, 3)

'''

if __name__ == '__main__':
    #text = input('parse> ')

    l = Lexer(text)
    p = Parser(l)
    ast = p.program()
    if False:
        i = ToPythonInterpreter(ast)
        print()
        code = i.visit() 
        print(code)
    else:
        SemanticAnalyzer(ast, False).visit()
        ii = Interpreter(ast)
        ii.visit()
        print(ii.call_stack._records[0].members)
