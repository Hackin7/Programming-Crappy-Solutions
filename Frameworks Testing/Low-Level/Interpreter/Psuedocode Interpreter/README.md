# A Level UK Psuedocode Interpreter

A hobby project
Partially based on https://github.com/rspivak/lsbasi/blob/master/part19/spi.py

## Grammar

```
empty : ""

# Arithmetic
variable: ID (LSQPAREN factor RSQPAREN) *
factor : PLUS factor
        | MINUS factor
        | INTEGER 
        | FLOAT
        | STRING
        | LPAREN expr RPAREN
        | variable
        | factor(LPAREN (factor). (COMMA factor) * RPAREN)*
term : factor ((MUL | DIV | MOD | FLOOR) factor)*
expr : term ((PLUS | MINUS) term )* 

# Program
statement_list : statement*
statement : assignment_statement 
            | if_statement
            | for_loop
            | while_loop
            | procedure_def
            | function_def
            | input
            | output
            | return_profunc

# Declarations and Assignments
var_declaration: DECLARE identifier COLON TYPE
               | DECLARE identifier COLON ARRAY[INT:INT] OF TYPE

ASSIGN : "<-" | "="
assignment_statement: variable ASSIGN expr

# If-Else Statements
boolean : expr (COMPARE boolean)*

if_statement : "IF" boolean ("THEN"|NEWLINE)
                    statement_list
                ("ELSE IF" boolean ("THEN"|NEWLINE) statement_list)
                ("ELSE" statement_list)
                "ENDIF"

# Loops 
for_loop :  "FOR" ID ASSIGN expr "TO" expr ("STEP" expr). ("DO"|NEWLINE)
                statement_list
            ("ENDFOR"|"NEXT" ID)
while_loop: "WHILE" boolean ("DO"|NEWLINE)
                statement_list
            "ENDWHILE"

# Procedures and Functions
parameters: LPAREN ( ID (COLON DATATYPE| empty) COMMA)* RPAREN
arguments:
procedure_def: "PROCEDURE ID(parameters|empty)
                    statement_list
                "ENDPROCEDURE"
function_def:"FUNCTION" ID(parameters|empty)
                  statement_list
              "ENDFUNCTION"
return_profunc : "RETURN" (expr|empty)
call_procedure: "CALL" ID

# Standard Library
input : "INPUT" variable
output : "OUTPUT" expr


```
## Architecture

`Token`
 + name
 + value

`Lexer`
Lexical analyzer (also known as scanner or tokenizer).
This method is responsible for breaking a sentence apart into tokens. One token at a time.
 + `__init__(code)`
 + `get_next_token()`
 + `advance()`
 + `peek()`
 + `skip_whitespace()`
 + `integer()`
 + `_id()`

`Parser`
Responsible for interpreting the code accoriding to the grammar rules (and returning syntax errors)
+ `__init__()`
+ `error()`
+ all the terminals

`Semantic Analyser`
Work in Progress, analyses if the code makes sense

`Interpreter`
Runs the code?
+ `visit(node)