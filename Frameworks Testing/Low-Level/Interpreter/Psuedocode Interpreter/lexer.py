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

    ### Read Characters #####################################################
    def advance(self, val=1):
        """Advance the `pos` pointer and set the `current_char` variable."""
        self.pos += val
        if self.pos > len(self.text) - 1:
            self.current_char = None  # Indicates end of input
        else:
            self.current_char = self.text[self.pos]

    def peek(self, no):
        result = ''
        curr = self.pos
        while curr < len(self.text) and (curr - self.pos + 1) <= no:
            result += self.text[curr]
            curr += 1
        return result
    
    def reset(self, pos):
        print("Lexer Reset", self.pos, pos)
        self.pos = pos
        self.current_char = self.text[self.pos]
        
    ### Skip Unnecessary #####################################################
    def skip_whitespace(self):
        while self.current_char is not None and \
            self.current_char.isspace() and \
            self.current_char != '\n':
            self.advance()
            
    def skip_comments(self):
        while self.current_char is not None and self.peek(2) != "*/":
            self.advance()
        self.advance()
        self.advance()

    ### Data Types ##########################################################
    def number(self):
        """Return a (multidigit) number consumed from the input."""
        result = ''
        while self.current_char is not None and self.current_char.isdigit():
            result += self.current_char
            self.advance()
        if self.peek(1) == ".": # Decimal
            result += self.current_char
            self.advance()
            # Other Digits
            while self.current_char is not None and self.current_char.isdigit():
                result += self.current_char
                self.advance()
            return Token(FLOAT, float(result))
        else: # Integer
            return Token(INTEGER, int(result))

    def string(self):
        # Skip Quote
        start_char = self.current_char
        self.advance()
        # Extract text
        result = ''
        while self.current_char != start_char:
            result += self.current_char
            self.advance()
        # Skip Quote
        self.advance()
        return Token(STRING, result)
        

    
    def identifier(self): # Alphanumeric
        result = ''
        while self.current_char is not None and \
            (self.current_char.isalnum() or self.current_char in ['_']):
                result += self.current_char
                self.advance()
        return reserved_words.get(result, Token(ID, result))
    
    ### Next Token ###########################################################
    def get_next_token(self):
        """
        Lexical analyzer (also known as scanner or tokenizer)

        This method is responsible for breaking a sentence
        apart into tokens. One token at a time.
        """
        while self.current_char is not None:

            if self.current_char.isspace() and self.current_char != '\n':
                self.skip_whitespace()
                continue
            if self.peek(2) == '/*':
                self.skip_comments()
                continue
                      
            if self.current_char.isdigit():
                return self.number()
            if self.current_char in ["'", '"']:
                return self.string()

            if self.current_char.isalpha() or self.current_char in ['_']:
                return self.identifier()

            for symbol, token in symbols.items():
                if symbol == self.peek(len(symbol)):
                    self.advance(len(symbol))
                    return token
            self.error()

        return Token(EOF, None)
