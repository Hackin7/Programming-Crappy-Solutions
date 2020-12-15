# DIY Interpreter

## Basic Concepts

Compiler | Interpreter
-|-
If a translator processes and executes the source program without translating it into machine language first, it is an interpreter.|let’s agree that if a translator translates a source program into machine language, it is a compiler.

Concept | Description
-|-
Token | A token is an object that has a type and a value. For example, for the string “3” the type of the token will be INTEGER and the corresponding value will be integer 3.
Lexer/ Lexical Analyzer / scanner/ tokenizer| The part of the interpreter that breaks input apart into tokens?
Lexeme | A lexeme is a sequence of characters that form a token.
Parser | The part of the Interpreter that does parsing: recognizes a certain phrase in that stream of tokens

## Architecture

`Token`
 + name
 + value

`Lexer`
Lexical analyzer (also known as scanner or tokenizer).
This method is responsible for breaking a sentence apart into tokens. One token at a time.
 + `__init__(text)`
 + `get_next_token()`
 + `eat(token_type)`


`Parser`

`AbstractSyntaxTree`

`Interpreter`