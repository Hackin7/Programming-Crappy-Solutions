from tokenisation import *

class Lexer(object):
    def __init__(self, text):
        # client string input, e.g. "3 * 5", "12 / 3 * 4", etc
        self.text = text
        # self.pos is an index into self.text
        self.pos = 0
        self.current_char = self.text[self.pos]

    def error(self):
        raise Exception('Invalid character')

    def advance(self, val=1):
        """Advance the `pos` pointer and set the `current_char` variable."""
        self.pos += val
        if self.pos > len(self.text) - 1:
            self.current_char = None  # Indicates end of input
        else:
            self.current_char = self.text[self.pos]

    ### Read Stuff ###########################################################
    def skip_whitespace(self):
        while self.current_char is not None and self.current_char.isspace():
            self.advance()
            
    def skip_comments(self):
        while self.current_char is not None and self.current_char != '}':
            self.advance()
        if self.current_char == '}':
            self.advance()
                    
    def integer(self):
        """Return a (multidigit) integer consumed from the input."""
        result = ''
        while self.current_char is not None and self.current_char.isdigit():
            result += self.current_char
            self.advance()
        return Token(INTEGER, int(result))

    def identifier(self): # Alphanumeric
        result = ''
        while self.current_char is not None and \
            (self.current_char.isalnum() or self.current_char in ['_']):
                result += self.current_char
                self.advance()
        return reserved_words.get(result, Token(ID, result))

    def peek(self, no):
        result = ''
        curr = self.pos
        while curr < len(self.text) - 1 and (curr - self.pos + 1) <= no:
            result += self.text[curr]
            curr += 1
        return result
    
    ### Next Token ###########################################################
    def get_next_token(self):
        """Lexical analyzer (also known as scanner or tokenizer)

        This method is responsible for breaking a sentence
        apart into tokens. One token at a time.
        """
        while self.current_char is not None:

            if self.current_char.isspace():
                self.skip_whitespace()
                continue
            if self.current_char == '{':
                self.skip_comments()
                continue
                      
            if self.current_char.isdigit():
                return self.integer()

            if self.current_char.isalpha() or self.current_char in ['_']:
                return self.identifier()

            for symbol, token in symbols.items():
                if symbol == self.peek(len(symbol)):
                    self.advance(len(symbol))
                    return token

            self.error()

        return Token(EOF, None)
