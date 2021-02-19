### Reserved Keywords ################
# Data Types
INTEGER = 'INTEGER'
FLOAT = 'FLOAT'
STRING = 'STRING'
# Arithmetic
ADD = 'ADD'
SUB = 'SUB'
MUL = ' MUL'
DIV = 'DIV'
# Comparison
LT = "LT"
LTE = "LTE"
EQUAL = "EQUAL"
NOT_EQUAL = "NOT_EQUAL"
GTE = "GTE"
GT = "GT"

# Symbols
LPAREN = '('
RPAREN = ')'
LSQPAREN = '['
RSQPAREN = ']'
SEMI = ';'
COLON = ':'
COMMA = ','
DOT = '.'

# Declaration & Assignment
DECLARE = "DECLARE"
OF = "OF"
ASSIGN = "ASSIGN"
# If-Else
IF = "IF"
THEN = "THEN"
ELSE = "ELSE"
ELSEIF = "ELSEIF"
ENDIF = "ENDIF"
# Loops
FOR = "FOR"
TO = "TO"
DO = "DO"
ENDFOR = "ENDFOR"
NEXT = "NEXT"
WHILE = "WHILE"
ENDWHILE = "ENDWHILE"
# Procedures and Functions
PROCEDURE = "PROCEDURE"
ENDPROCEDURE = "ENDPROCEDURE"
FUNCTION = "FUNCTION"
ENDFUNCTION = "ENDFUNCTION"
RETURN = "RETURN"
# Standard Library
INPUT = "INPUT"
OUTPUT = "OUTPUT"

# Reserved Words
ID = 'ID'
NEWLINE = "NEWLINE"
EOF = 'EOF'

DOUBLE_QUOTE = 'DOUBLE_QUOTE'

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
    '\n': Token(NEWLINE, '\n'),
    # Arithmetic
    '+': Token(ADD, '+'),
    '-': Token(SUB, '-'),
    '*': Token(MUL, '*'),
    '/': Token(DIV, '/'),
    '<-': Token(ASSIGN, '<-'),
    # Comparison
    '<=': Token(LTE, '<='),
    '<': Token(LT, '<'),
    '==': Token(EQUAL, '=='),
    '!=': Token(NOT_EQUAL, '!='),
    '<>': Token(NOT_EQUAL, '<>'),
    '>=': Token(GTE, '>='),
    '>': Token(GT, '>'),
    # Assignment
    '=': Token(ASSIGN, '='),
    # Symbols
    '(': Token(LPAREN, '('),
    ')': Token(RPAREN, ')'),
    '[': Token(LSQPAREN, '['),
    ']': Token(RSQPAREN, ']'),
    ';': Token(SEMI, ';'),
    '.': Token(DOT, '.'),
    ':': Token(COLON, ':'),
    ',': Token(COMMA, ','),
}

reserved_words = {
    # Declaration & Assignment
    "DECLARE": Token(DECLARE, "DECLARE"),
    "OF": Token(OF, "OF"),
    # If-Else
    "IF": Token(IF, 'IF'),
    "THEN": Token(THEN, 'THEN'), 
    "ELSE": Token(ELSE, 'ELSE'),
    'ELSEIF' : Token(ELSEIF, 'ELSEIF'),
    "ENDIF": Token(ENDIF, "ENDIF"),
    # Loops
    "FOR" : Token(FOR, "FOR"),
    "TO" : Token(TO, "TO"),
    "DO": Token(DO, "DO"),
    "NEXT": Token(NEXT, "NEXT"),
    "ENDFOR": Token(ENDFOR, "ENDFOR"),
    "WHILE": Token(WHILE, "WHILE"),
    "ENDWHILE": Token(ENDWHILE, "ENDWHILE"),
    # Procedures and Functions
    "PROCEDURE": Token(PROCEDURE, "PROCEDURE"),
    "ENDPROCEDURE": Token(ENDPROCEDURE, "ENDPROCEDURE"),
    "FUNCTION": Token(FUNCTION, "FUNCTION"),
    "ENDFUNCTION": Token(ENDFUNCTION, "ENDFUNCTION"),
    "RETURN": Token(RETURN, "RETURN"),
    # Standard Library
    "INPUT": Token(INPUT, "INPUT"),
    "OUTPUT": Token(OUTPUT, "OUTPUT"), 
    'DIV': Token(DIV, '//'),
}

def ordersort(lis):
    return dict(sorted(list(lis.items()),key= lambda x : len(x[0]), reverse=True))

# Sorting the dictionary by length
symbols = ordersort(symbols)
reserved_words = ordersort(reserved_words)
