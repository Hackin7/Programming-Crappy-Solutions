# Ruslan's Blog: Let's Build a Simple Interpreter

The tutorial starts from [here](https://ruslanspivak.com/lsbasi-part1/) while the code is [here](https://github.com/rspivak/lsbasi)

This folder is a list of my answers to the exercises

I'm probably not going to finish this because the tutorial itself is not done.

## Summary of exercises

Basic Calculator
1. Tokenise digits of more than 1 characters, subtaction
2. Allow for multiplication/ division
3. Recode the interpreter from scratch (in C++)
4. Grammar Rules (Including precedence)
5. Parenthesis
6. **Not done as it is done in part 5**

Abstract Syntax Trees (Binary Tree)
7. RPN and LISP Traversal of the Binary Tree
8. Basically just running the code

## Summary of Content

### Part 11

Concepts
1. Symbol: An identifier of some program entity like a variable, subroutine, or built-in type.
2. Symbol Table: An Abstract Data type for tracking various symbols in source code

Classes, Methods and Attributes:

`Symbol`
 + `name`, `type`

 `BuiltinTypeSymbol(Symbol)`

 `VarSymbol(Symbol)`

`SymbolTable`
 - `__init__()`
    - Define Builtins
 + `define(symbol)`
 + `lookup(symbol)`

`SymbolTableBuilder(NodeVisitor)`
 + `visit_VarDecl(node)`
   - Looks up the type in the symbol table
   - Create a new VarSymbol
   - Store in the symbol table
 + `visit_Assign(node)`
  - Checks the symbol table for if the thing exists

### Part 12

Parse Pascal Procedure Declarations

Concepts:
1. Updating Lexer
    1. add a new token named `PROCEDURE`
2. Updating Parser
    1. New ProcedureDecl AST node
    2. Update to the parser’s declarations method to support procedure declarations    
3. Updating SymbolTable builder
    1. Because we’re not ready yet to handle nested procedure scopes, we’ll simply add an empty visit_ProcedureDecl method to the SymbolTreeBuilder AST visitor class. We’ll fill it out in the next article
4. Updating Interpreter
    1. Add an empty visit_ProcedureDecl method to the Interpreter class, which will cause our interpreter to silently ignore all our procedure declarations.

### Part 13: Semantic Analysis

https://ruslanspivak.com/lsbasi-part13/

Concepts:
1. Introduction to Semantic analysis: A process to help us determine whether a program makes sense, and that it has meaning, according to a language definition.
    1. While our Pascal program can be grammatically correct and the parser can successfully build an abstract syntax tree, the program still can contain some pretty serious errors. To catch those errors we need to use the abstract syntax tree and the information from the symbol table.
    2. Easier to separate from parser

2. Symbols and Symbol Tables
    1. Semantic Checks
        1. **Static semantic checks** 
            1. The checks that we can make before interpreting (evaluating) the program, that is, before calling the interpret method on an instance of the Interpreter class. 
            2. Examples we are focusing on
                1. That variables are declared before they are used
                2. That there are no duplicate variable declarations
        2. **Dynamic semantic checks**
            1. Require checks to be performed during the interpretation (evaluation) of the program. 
            2. For example, a check that there is no division by zero, and that an array index is not out of bounds would be a dynamic semantic check
    2. Check if variables have been declared
        1. Go over all variable declarations
        2. For every variable declaration you encounter, collect all necessary information about the declared variable
        3. Store the collected information in some stash for future reference by using the variable’s name as a key
        4. When you see a variable reference, such as in the assignment statement `x := x + y`, search the stash by the variable’s name to see if the stash has any information about the variable. If it does, the variable has been declared. If it doesn’t, the variable hasn’t been declared yet, which is a semantic error.
    3. What we need to figure out
        1. What information about variables do we need to collect?
            1. Name, category, and type. And we use symbols to hold that information. (`Symbol` class)
        2. Where and how should we store the collected information?
            1. We store collected symbols in the symbol table by using its insert method.
        3. How do we implement the “go over all variable declarations” step?
            1. We will create a new AST visitor that will do some actions on visiting VarDecl AST nodes
3. Semantic Errors
    1. Just raise exception if symbol does not exist

 Classes, Methods and Attributes

### Part 14: Nested Scopes and a Source-to-Source Compiler

https://ruslanspivak.com/lsbasi-part14/

Concepts:
1. Scopes and scoped symbol tables
    1. **Scope**: A textual region of a program where a name can be used
    2. Pascal programs are said to be **lexically scoped** (or statically scoped) 
        1. because you can look at the source code, and without even executing the program, determine purely based on the textual rules which names (references) resolve or refer to which declarations. In Pascal, for example, lexical keywords like program and end demarcate the textual boundaries of a scope
    3. Why are scopes useful?
        1. Every scope creates an isolated name space, which means that variables declared in a scope cannot be accessed from outside of it.
        2. You can re-use the same name in different scopes and know exactly, just by looking at the program source code, what declaration the name refers to at every point in the program.
        3. In a nested scope you can re-declare a variable with the same name as in the outer scope, thus effectively hiding the outer declaration, which gives you control over access to different variables from the outer scope.
    4. Scoped Symbol Table
2. Procedure declarations with formal parameters
    1. List of Changes
        1. Add `Param` AST node
        2. Update the `ProcedureDecl` node’s constructor to take an additional argument: params
        3. Update the `declarations` rule to reflect changes in the procedure declaration sub-rule
        4. Add the `formal_parameter_list` rule and method
            1. `formal_parameter_list : formal_parameters | formal_parameters SEMI formal_parameter_list`
        5. Add the `formal_parameters` rule and method
            1. `formal_parameters : ID (COMMA ID)* COLON type_spec` 
3. Procedure symbols
    1. Create a separate symbol class for procedure symbols `ProcedureSymbol`
4. Nested scopes
    1. Semantic Analyzer `visit_Program()`
        1. Create a scope table for global scope
    2. `visit_ProcedureDecl()`
        1. Create a scope table for local scope
        2. Set local parameters into procedure scope
5. Scope tree: Chaining scoped symbol tables
    1. how do we express in code that the scope Alpha is nested within the global scope? The answer is chaining the tables together.
    2. How do we implement scope chaining/linking? There are two steps:
        1. We need to update the ScopedSymbolTable class and add a variable enclosing_scope that will hold a pointer to the scope’s enclosing scope. This will be the link between scopes in the picture above.
        2. We need to update the visit_Program and visit_ProcedureDecl methods to create an actual link to the scope’s enclosing scope using the updated version of the ScopedSymbolTable class.
6. Nested scopes and name resolution
    1. How do we implement that behavior of looking in the current scope, and then looking in the enclosing scope, and so on until we either find the symbol we’re looking for or we’ve reached the top of the scope tree and there are no more scopes left?
        1. We simply need to extend the lookup method in the ScopedSymbolTable class to continue its search up the chain in the scope tree:
        2. If the symbol is not found, recursively traverse the tree and search for the symbol in the scopes up the chain. You don’t have to do the lookup recursively, you can rewrite it into an iterative form; the important part is to follow the link from a nested scope to its enclosing scope and search for the symbol there and up the tree until either the symbol is found or there are no more scopes left because you’ve reached the top of the scope tree.
7. Source-to-source compiler
    1. A compiler that translates a program in some source language into a program in the same (or almost the same) source language.
    2. https://github.com/rspivak/lsbasi/blob/master/part14/src2srccompiler.py

Exercises
1. You’ve seen in the pictures throughout the article that the Main name in a program statement had subscript zero. I also mentioned that the program’s name is not in the global scope and it’s in some other outer scope that has level zero. Extend spi.py and create a builtins scope, a new scope at level 0, and move the built-in types INTEGER and REAL into that scope. For fun and practice, you can also update the code to put the program name into that scope as well.
2. For the source program in nestedscopes04.pas do the following:
    1. Write down the source Pascal program on a piece of paper
    2. Subscript every name in the program indicating the scope level of the declaration the name resolves to.
    3. Draw vertical lines for every name declaration (variable and procedure) to visually show its scope. Don’t forget about scope holes and their meaning when drawing.
    4. Write a source-to-source compiler for the program without looking at the example source-to-source compiler in this article.
    5. Use the original src2srccompiler.py program to verify the output from your compiler and whether you subscripted the names correctly in the exercise (2.2).
3. Modify the source-to-source compiler to add subscripts to the built-in types INTEGER and REAL

Uncomment the following block in the spi.py
```
# interpreter = Interpreter(tree)
# result = interpreter.interpret()
# print('')
# print('Run-time GLOBAL_MEMORY contents:')
# for k, v in sorted(interpreter.GLOBAL_MEMORY.items()):
#     print('%s = %s' % (k, v))
```
Run the interpreter with the part10.pas file as an input:

$ python spi.py part10.pas
Spot the problems and add the missing methods to the semantic analyzer.

### Part 15

### Part 16: Recognizing Procedure Calls

### Part 17: Call Stack and Activation Records

### Part 18: Executing Procedure Calls

### Part 19: Nested Procedure Calls