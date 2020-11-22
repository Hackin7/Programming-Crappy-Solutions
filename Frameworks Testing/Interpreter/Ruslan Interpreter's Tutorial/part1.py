'''
Solutions to exercises from https://ruslanspivak.com/lsbasi-part1/

Check your understanding
1. What is an interpreter?
If a translator processes and executes the source program without translating it into machine language first, it is an interpreter.

2. What is a compiler?
let’s agree that if a translator translates a source program into machine language, it is a compiler.

3. What’s the difference between an interpreter and a compiler?
-

4. What is a token?
A token is an object that has a type and a value. For example, for the string “3” the type of the token will be INTEGER and the corresponding value will be integer 3.

5. What is the name of the process that breaks input apart into tokens?
lexical analysis

6. What is the part of the interpreter that does lexical analysis called?
lexical analyzer/ lexer (for short)

7. What are the other common names for that part of an interpreter or a compiler?
scanner/ tokenizer

Programming exercises done:
1. Modify the code to allow multiple-digit integers in the input, for example “12+3”
2. Add a method that skips whitespace characters so that your calculator can handle inputs with whitespace characters like ” 12 + 3”
3. Modify the code and instead of ‘+’ handle ‘-‘ to evaluate subtractions like “7-5
'''

INTEGER, PLUS, MINUS, EOF = 'INTEGER', 'PLUS', 'MINUS', 'EOF'

class Token(object):
    def __init__(self, type, value):
        # token type: INTEGER, PLUS, or EOF
        self.type = type
        # token value: 0, 1, 2. 3, 4, 5, 6, 7, 8, 9, '+', or None
        self.value = value

    def __str__(self):
        return f'Token({self.type}, {repr(self.value)})'

    def __repr__(self):
        return self.__str__()


class Interpreter(object):
    def __init__(self, text):
        # client string input, e.g. "3+5"
        self.text = text
        # self.pos is an index into self.text
        self.pos = 0
        # current token instance
        self.current_token = None

    def error(self):
        raise Exception('Error parsing input')

    def get_next_token(self):
        """Lexical analyzer (also known as scanner or tokenizer)

        This method is responsible for breaking a sentence
        apart into tokens. One token at a time.
        """
        text = self.text
        if self.pos > len(text) - 1:
            return Token(EOF, None)

        current_char = text[self.pos]

        ### Skip Whitespace Characters ###########################
        while current_char.isspace():
            self.pos += 1
            current_char = text[self.pos]
            
        ### Multiple-digit input #################################
        if current_char.isdigit():
            value = current_char
            self.pos += 1
            while self.pos < len(text)-1 and text[self.pos].isdigit():
                value += text[self.pos]
                self.pos += 1
            token = Token(INTEGER, int(value))
            #self.pos += 1
            return token

        ### Handle - ##############################################
        if current_char == '-':
            token = Token('MINUS', current_char)
            self.pos += 1
            return token
        ###########################################################
        
        if current_char == '+':
            token = Token(PLUS, current_char)
            self.pos += 1
            return token

        self.error()

    def eat(self, token_type):
        # compare the current token type with the passed token
        # type and if they match then "eat" the current token
        # and assign the next token to the self.current_token,
        # otherwise raise an exception.
        if self.current_token.type == token_type:
            self.current_token = self.get_next_token()
        else:
            self.error()

    def expr(self):
        """expr -> INTEGER PLUS INTEGER"""
        # set current token to the first token taken from the input
        self.current_token = self.get_next_token()

        # we expect the current token to be a single-digit integer
        left = self.current_token
        self.eat(INTEGER)
        
        # we expect the current token to be a '+' token
        op = self.current_token

        ### Handle Subtraction ###############################
        if op.type == PLUS:
            self.eat(PLUS)
        elif op.type == MINUS:
            self.eat(MINUS)
        ######################################################
            
        # we expect the current token to be a single-digit integer
        right = self.current_token
        self.eat(INTEGER)

        ### Handle Subtraction ###############################
        if op.type == PLUS:
            result = left.value + right.value
        elif op.type == MINUS:
            result = left.value - right.value
        ######################################################
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
        interpreter = Interpreter(text)
        result = interpreter.expr()
        print(result)


if __name__ == '__main__':
    main()
