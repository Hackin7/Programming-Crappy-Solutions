'''
Solutions to exercises from https://ruslanspivak.com/lsbasi-part5/

Check your understanding
1. What does it mean for an operator to be left-associative?
    The operator + associates to the left because an operand that has plus signs on
    both sides belongs to the operator to its left
    and so we say that the operator + is left-associative

2. Are operators + and - left-associative or right-associative? What about * and / ?
    Left, Left

3. Does operator + have higher precedence than operator * ?
    No

Programming Exercises
1. Write an interpreter as described in this article off the top of your head, without peeking into the code from the article
Write some tests for your interpreter, and make sure they pass.
    (Done in part4)
2. Extend the interpreter to handle arithmetic expressions containing parentheses
so that your interpreter could evaluate deeply nested arithmetic expressions like: 7 + 3 * (10 / (12 / (3 + 1) - 1))
'''

# Token types
#
# EOF (end-of-file) token is used to indicate that
# there is no more input left for lexical analysis
INTEGER, ADD, SUB, MUL, DIV, EOF = 'INTEGER', 'ADD', 'SUB', 'MUL', 'DIV', 'EOF'
OPENPR, CLOSEPR = "OPENPR", "CLOSEPR"

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

            if self.current_char == '+':
                self.advance()
                return Token(ADD, '+')
            if self.current_char == '-':
                self.advance()
                return Token(SUB, '-')
            
            ### Parenthesis ##########################
            if self.current_char == '(':
                self.advance()
                return Token(OPENPR, '(')
            if self.current_char == ')':
                self.advance()
                return Token(CLOSEPR, ')')
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

    ### section ###############################################
    def section(self):
        token = self.current_token
        if token.type == INTEGER:
            return self.factor()
        elif token.type == OPENPR:
            self.eat(OPENPR)
            result = self.expr()
            self.eat(CLOSEPR)
            return result
    ###########################################################
    
    def mul(self):
        result = self.section()
        while self.current_token.type in (MUL, DIV):
            token = self.current_token
            if token.type == MUL:
                self.eat(MUL)
                result = result * self.factor()
            elif token.type == DIV:
                self.eat(DIV)
                result = result / self.factor()
        return result
                
    def expr(self):
        """Arithmetic expression parser / interpreter.
        expr   :  term ((ADD | SUB) term )*
        term : section ((MUL | DIV) factor)*
        section : (factor | patenthesis)
        parenthesis : \( expr \)
        factor : INTEGER
        """
        result = self.mul()
        while self.current_token.type in (ADD, SUB):
            token = self.current_token
            # Evaluation
            if token.type == ADD:
                self.eat(ADD)
                result = result + self.mul()
            elif token.type == SUB:
                self.eat(SUB)
                result = result - self.mul()
            
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
