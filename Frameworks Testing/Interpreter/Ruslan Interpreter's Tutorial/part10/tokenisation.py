# Reserved Keywords
INTEGER ='INTEGER'
ADD = 'ADD'
SUB = 'SUB'
MUL = ' MUL'
DIV = 'DIV'
LPAREN = '('
RPAREN = ')'
EOF = 'EOF'
ASSIGN = 'ASSIGN'
ID = 'ID'
SEMI = ';'
COLON = ':'
COMMA = ','
DOT = '.'
BEGIN = 'BEGIN'
END = 'END'
VAR = 'VAR'

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

symbols = {
    '+': Token(ADD, '+'),
    '-': Token(SUB, '-'),
    '*': Token(MUL, '*'),
    '/': Token(DIV, '/'),
    '(': Token(LPAREN, '('),
    ')': Token(RPAREN, ')'),
    ':=': Token(ASSIGN, ':='),
    ';': Token(SEMI, ';'),
    '.': Token(DOT, '.'),
    ':': Token(COLON, ':'),
}

reserved_words = {
    'BEGIN': Token(BEGIN, 'BEGIN'), 
    'END': Token(END, 'END'),
    'DIV': Token(DIV, '//'),
    'PROGRAM': Token('PROGRAM', 'PROGRAM'),
    'VAR': Token(VAR, 'VAR'),
    'INTEGER': Token('TYPE_INTEGER', 'INTEGER'),
    'REAL': Token('TYPE_REAL', 'REAL'),
}