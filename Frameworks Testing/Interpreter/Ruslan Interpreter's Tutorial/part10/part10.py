'''
Solutions to exercises from https://ruslanspivak.com/lsbasi-part10/

Programming Exercises
1. If you haven’t done so yet, then, as an exercise, re-implement the interpreter in this article without looking at the source code and use part10.pas as your test input file
(This time I did a compiler to Python)
'''

from lexer import Lexer
from astparser import Parser

text = '''
PROGRAM hello;
VAR
  hi : INTEGER 
  
BEGIN
 a := 1 + 1; {this is a comment} b := a
END.
'''
if __name__ == '__main__':
    #text = input('parse> ')
    '''
    ll = Lexer('a := 1')
    print('Token', c)
    while c.type  != 'EOF':
        print(c)
        c = ll.get_next_token()
    '''

    l = Lexer(text)
    p = Parser(l)
    from interpreter import Interpreter
    i = Interpreter(p.program())
    print(i.visit())
