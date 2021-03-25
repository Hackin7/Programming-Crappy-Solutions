'''
Solutions to exercises from https://ruslanspivak.com/lsbasi-part4/

Check your understanding
-----------------------------------------------
| expr : factor((MUL | DIV) factor)*          |
| factor : INTEGER                            |
-----------------------------------------------
1. What is a context-free grammar (grammar)?
    A grammar specifies the syntax of a programming language in a concise manner. Unlike syntax diagrams, grammars are very compact.

2. How many rules / productions does the grammar have?
    2

3. What is a terminal? (Identify all terminals in the picture)
    Tokens like MUL, DIV, and INTEGER are called terminals

4. What is a non-terminal? (Identify all non-terminals in the picture)
    Variables like expr and factor are called non-terminals.
    Non-terminals usually consist of a sequence of terminals and/or non-terminals

5. What is a head of a rule? (Identify all heads / left-hand sides in the picture)
    A rule consists of a non-terminal, called the head or left-hand side of the production

6. What is a body of the rule? (Identify all bodies / right-hand sides in the picture)
    And a sequence of terminals and/or non-terminals, called the body or right-hand side of the production

7. What is the start symbol of a grammar?
    The non-terminal symbol on the left side of the first rule is called the start symbol.
    
Programming Exercises
1. Write a grammar that describes arithmetic expressions containing any number of +, -, *, or / operators. With the grammar you should be able to derive expressions like “2 + 7 * 4”, “7 - 8 / 4”, “14 + 2 * 3 - 6 / 2”, and so on.
2. Using the grammar, write an interpreter that can evaluate arithmetic expressions containing any number of +, -, *, or / operators. Your interpreter should be able to handle expressions like “2 + 7 * 4”, “7 - 8 / 4”, “14 + 2 * 3 - 6 / 2”, and so on.
If you’ve finished the above exercises, relax and enjoy :)
'''

# Token types
#
# EOF (end-of-file) token is used to indicate that
# there is no more input left for lexical analysis
INTEGER, ADD, SUB, MUL, DIV, EOF = 'INTEGER', 'ADD', 'SUB', 'MUL', 'DIV', 'EOF'


class Token(object):
    def __init__(self, type, value):
        # token type: INTEGER, MUL, DIV, or EOF
        self.type = type
        # token value: non-negative integer value, '*', '/', or None
        self.value = value

    def __str__(self):
        """String representation of the class instance.

        Examples:
            Token(INTEGER, 3)
            Token(MUL, '*')
        """
        return 'Token({type}, {value})'.format(
            type=self.type,
            value=repr(self.value)
        )

    def __repr__(self):
        return self.__str__()


class Lexer(object):
    def __init__(self, text):
        # client string input, e.g. "3 * 5", "12 / 3 * 4", etc
        self.text = text
        # self.pos is an index into self.text
        self.pos = 0
        self.current_char = self.text[self.pos]

    def error(self):
        raise Exception('Invalid character')

    def advance(self):
        """Advance the `pos` pointer and set the `current_char` variable."""
        self.pos += 1
        if self.pos > len(self.text) - 1:
            self.current_char = None  # Indicates end of input
        else:
            self.current_char = self.text[self.pos]

    def skip_whitespace(self):
        while self.current_char is not None and self.current_char.isspace():
            self.advance()

    def integer(self):
        """Return a (multidigit) integer consumed from the input."""
        result = ''
        while self.current_char is not None and self.current_char.isdigit():
            result += self.current_char
            self.advance()
        return int(result)

    def get_next_token(self):
        """Lexical analyzer (also known as scanner or tokenizer)

        This method is responsible for breaking a sentence
        apart into tokens. One token at a time.
        """
        while self.current_char is not None:

            if self.current_char.isspace():
                self.skip_whitespace()
                continue

            if self.current_char.isdigit():
                return Token(INTEGER, self.integer())

            if self.current_char == '*':
                self.advance()
                return Token(MUL, '*')

            if self.current_char == '/':
                self.advance()
                return Token(DIV, '/')

            ### Addition and Multiplication ############
            if self.current_char == '+':
                self.advance()
                return Token(ADD, '+')
            if self.current_char == '-':
                self.advance()
                return Token(SUB, '-')
            ###########################################

            self.error()

        return Token(EOF, None)


class Interpreter(object):
    def __init__(self, lexer):
        self.lexer = lexer
        # set current token to the first token taken from the input
        self.current_token = self.lexer.get_next_token()

    def error(self):
        raise Exception('Invalid syntax')

    def eat(self, token_type):
        # compare the current token type with the passed token
        # type and if they match then "eat" the current token
        # and assign the next token to the self.current_token,
        # otherwise raise an exception.
        if self.current_token.type == token_type:
            self.current_token = self.lexer.get_next_token()
        else:
            self.error()

    def factor(self):
        """Return an INTEGER token value.

        factor : INTEGER
        """
        token = self.current_token
        self.eat(INTEGER)
        return token.value

    ### mul ##################################################
    def mul(self):
        result = self.factor()
        while self.current_token.type in (MUL, DIV):
            token = self.current_token
            if token.type == MUL:
                self.eat(MUL)
                result = result * self.factor()
            elif token.type == DIV:
                self.eat(DIV)
                result = result / self.factor()
        return result
    ##########################################################
                
    def expr(self):
        """Arithmetic expression parser / interpreter.
        expr   :  mul ((ADD | SUB) mul )*
        mul : factor ((MUL | DIV) factor)*
        factor : INTEGER
        """
        result = self.mul()
        ### ADD | SUB ##################################################
        while self.current_token.type in (ADD, SUB):
            token = self.current_token

            # Evaluation
            if token.type == ADD:
                self.eat(ADD)
                result = result + self.mul()
            elif token.type == SUB:
                self.eat(SUB)
                result = result - self.mul()
            
        ##########################################################
        return result


def main():
    while True:
        try:
            # To run under Python3 replace 'raw_input' call
            # with 'input'
            text = input('calc> ')
        except EOFError:
            break
        if not text:
            continue
        lexer = Lexer(text)
        interpreter = Interpreter(lexer)
        result = interpreter.expr()
        print(result)


if __name__ == '__main__':
    main()
