InterpreterCode = `### Reserved Keywords ################
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
CALL = "CALL"
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
    '\\n': Token(NEWLINE, '\\n'),
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
    ',': Token(COMMA, ',')
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
    "CALL": Token(CALL, "CALL"),
}

def ordersort(lis):
    return dict(sorted(list(lis.items()),key= lambda x : len(x[0]), reverse=True))

# Sorting the dictionary by length
symbols = ordersort(symbols)
reserved_words = ordersort(reserved_words)


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
        """Advance the pos pointer and set the current_char variable."""
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
            self.current_char != '\\n':
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

            if self.current_char.isspace() and self.current_char != '\\n':
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

class Node:
    def __init__(self, value):
        self.value = value

# Arithmetic
class NodeData(Node):
    def __init__(self, token):
        super().__init__(token.value)

class NodeBinOp(Node):
    def __init__(self, token, left, right):
        super().__init__(token.value)
        self.left = left
        self.right = right

class NodeUnaryOp(Node):
    def __init__(self, token, right):
        super().__init__(token.value)
        self.right = right

# Program
class NodeStatementList(Node):
    def __init__(self, statements=[]):
        self.statements = statements
    def __str__(self):
        return f"{self.statements}"

# Assignments
class NodeVariableDeclaration(Node):
    def __init__(self, identifier, given_type, size1=None, size2=None, array_type=None):
        self.identifier = identifier
        self.given_type = given_type
        self.size1 = size1
        self.size2 = size2
        self.array_type = array_type

class NodeAssignment(Node):
    def __init__(self, identifier, expr):
        self.left = identifier
        self.right = expr

# If-Else Statements
class NodeBoolean(Node):
    def __init__(self, expr1, op = None, nodeBool = None):
        self.expr1 = expr1
        self.op = op
        self.nodeBool = nodeBool
class NodeIfElse(Node):
    def __init__(self, booleans, statement_lists):
        self.booleans = booleans
        self.statement_lists = statement_lists

# Loops
class NodeForLoop(Node):
    def __init__(self, var, start_expr, end_expr, statement_list):
        self.var = var
        self.start_expr = start_expr
        self.end_expr = end_expr
        self.statement_list = statement_list

class NodeWhileLoop(Node):
    def __init__(self, boolean, statement_list):
        self.boolean = boolean
        self.statement_list = statement_list

# Standard Library
class NodeInput(Node):
    def __init__(self, var):
        self.var = var

class NodeOutput(Node):
    def __init__(self, expr):
        self.expr = expr

# Procedures and Functions
class NodeParams(Node):
    def __init__(self, paramslist):
        self.paramslist = paramslist

class NodeProcedure(Node):
    def __init__(self, name, params, statement_list):
        self.name = name
        self.params = params
        self.statement_list = statement_list

class NodeFunction(Node):
    def __init__(self, name, params, statement_list):
        self.name = name
        self.params = params
        self.statement_list = statement_list

class NodeReturnProFunc(Node):
    def __init__(self, expr=None):
        self.expr = expr
# Others
class NodeIdentifier(Node):
    def __init__(self, token):
        self.name = token.value

class NodeArrayCall(Node):
    def __init__(self, var, index):
        self.var = var
        self.index = index

class NodeFunctionCall(Node):
    def __init__(self, var, arguments=[]):
        self.var = var
        self.arguments = arguments


class Parser:
    def __init__(self, lexer):
        self.lexer = lexer
        # set current token to the first token taken from the input
        self.current_token = self.lexer.get_next_token()

    def error(self):
        raise Exception('Invalid syntax')

    def skip_newline(self):
        while self.current_token.type == NEWLINE:
            self.eat(NEWLINE)

    def eat(self, token_type, skip_newline=False):
        # compare the current token type with the passed token
        # type and if they match then "eat" the current token
        # and assign the next token to the self.current_token,
        # otherwise raise an exception.

        if skip_newline:
            self.skip_newline()

        if self.current_token.type == token_type:
            self.current_token = self.lexer.get_next_token()
        else:
            raise Exception(f"{self.current_token} doesn't match {token_type}")
            self.error()

    ###### Terminals ###########################################################
    def integer(self):
        token = self.current_token
        self.eat(INTEGER)
        return NodeData(token)

    def float(self):
        token = self.current_token
        self.eat(FLOAT)
        return NodeData(token)

    def string(self):
        token = self.current_token
        self.eat(STRING)
        return NodeData(token)

    def identifier(self):
        token = self.current_token
        self.eat(ID)
        return NodeIdentifier(token)

    def datatype(self):
        return self.identifier()

    def variable(self):
        identifier = self.identifier()
        current_array_call = identifier
        while self.current_token.type == LSQPAREN:
            self.eat(LSQPAREN)
            index = self.factor()
            current_array_call = NodeArrayCall(current_array_call, index)
            self.eat(RSQPAREN)

        return current_array_call

    ###### Non-Terminals ########################################################

    ### Data ######################################
    def factor(self):
        token = self.current_token
        if token.type == INTEGER:
            return self.integer()
        elif token.type == FLOAT:
            return self.float()
        elif token.type == STRING:
            return self.string()
        elif token.type == ADD:
            self.eat(ADD)
            return NodeUnaryOp(token, self.integer())
        elif token.type == SUB:
            self.eat(SUB)
            return NodeUnaryOp(token, self.integer())
        elif token.type == LPAREN:
            self.eat(LPAREN)
            result = self.expr()
            self.eat(RPAREN)
            return result
        elif token.type == ID: # Variable
            #return self.variable()
            identifier = self.identifier()
            current_call = identifier
            while self.current_token.type in [LSQPAREN, LPAREN]:
                if self.current_token.type == LSQPAREN:
                    self.eat(LSQPAREN)
                    index = self.factor()
                    current_call = NodeArrayCall(current_call, index)
                    self.eat(RSQPAREN)
                elif self.current_token.type == LPAREN:
                    self.eat(LPAREN)
                    arguments = []
                    while self.current_token.type != RPAREN:
                        arguments.append(self.factor())
                        if self.current_token.type == COMMA:
                            self.eat(COMMA)
                    current_call = NodeFunctionCall(current_call, arguments)
                    self.eat(RPAREN)

            return current_call

    ### Arithmetic #################################
    def term(self):
        result = self.factor()
        while self.current_token.type in (MUL, DIV):
            token = self.current_token
            if token.type == MUL:
                self.eat(MUL)
            elif token.type == DIV:
                self.eat(DIV)
            result = NodeBinOp(token, result, self.factor())
        return result

    def expr(self):
        result = self.term()
        while self.current_token.type in (ADD, SUB):
            token = self.current_token
            # Evaluation
            if token.type == ADD:
                self.eat(ADD)
            elif token.type == SUB:
                self.eat(SUB)
            result = NodeBinOp(token, result, self.term())
        return result

    ### Program ##################################
    def statement_list(self):
        ll = NodeStatementList()
        ll.statements = []
        curr_statement = self.statement()
        while curr_statement != None:
            ll.statements.append(curr_statement)
            if self.current_token.type in (SEMI, NEWLINE):
                self.eat(self.current_token.type)


            curr_statement = self.statement()

        #print(self.current_token)
        return ll

    def statement(self):
        self.skip_newline()
        try:
            if self.current_token.type == DECLARE:
                return self.var_declaration()
            elif self.current_token.type == ID:
                # Could either be a function call or an assignment. But implement another day
                return self.assignment_statement()
            elif self.current_token.type == CALL:
                self.eat(CALL)
                return self.factor()
            elif self.current_token.type == IF:
                return self.if_statement()
            elif self.current_token.type == FOR:
                return self.for_loop()
            elif self.current_token.type == WHILE:
                return self.while_loop()
            elif self.current_token.type == PROCEDURE:
                return self.procedure_def()
            elif self.current_token.type == FUNCTION:
                return self.function_def()
            elif self.current_token.type == RETURN:
                return self.return_profunc()
            elif self.current_token.type == INPUT:
                return self.input()
            elif self.current_token.type == OUTPUT:
                return self.output()
            else:
                #return self.expr()
                #print("Invalid", self.current_token)
                return self.expr()
        except Exception as e:
            print("### EXCEPTION ########################################")
            print(e)
            print("######################################################")
            # Reset
            self.lexer.reset(startPos)
            self.current_token = self.lexer.get_next_token()

            print(self.current_token)
            data = self.expr()
            print(data)
            return data

    ### Assignments #############################
    def var_declaration(self):
        self.eat(DECLARE)
        identifier = self.identifier()
        self.eat(COLON)
        given_type = self.datatype()
        if given_type.name == "ARRAY":
            self.eat(LSQPAREN)
            size1 = self.factor()
            if self.current_token.type == COMMA:
                self.eat(COMMA)
                size2 = self.factor()
            else:
                size2 = None
            self.eat(RSQPAREN)
            self.eat(OF)
            array_type = self.datatype()
        else:
            size1 = None
            size2 = None
            array_type = None

        return NodeVariableDeclaration(identifier, given_type, size1, size2, array_type)

    def assignment_statement(self):
        var = self.variable()
        self.eat(ASSIGN)
        expr = self.expr()
        return NodeAssignment(var, expr)

    ### If-Else Statements ######################
    def boolean(self):
        expr1 = self.expr()
        if self.current_token.type in (LT, LTE, EQUAL, NOT_EQUAL, GTE, GT):
            op = self.current_token
            self.eat(self.current_token.type)
            bool2 = self.boolean()
            return NodeBoolean(expr1, op, bool2)
        else:
            return NodeBoolean(expr1)
    def if_statement(self):
        self.eat(IF)

        booleans = []
        statement_lists = []
        booleans.append(self.boolean())

        if self.current_token.type == THEN:
            self.eat(THEN, True)

        self.skip_newline()
        print(self.lexer.pos)
        statement_lists.append(self.statement_list())
        self.skip_newline()
        print(statement_lists[0])
        print(1, self.current_token.type)

        while self.current_token.type in (ELSE, ELSEIF):
            if self.current_token.type in (ELSE, ):
                self.eat(ELSE, True)
            self.skip_newline()
            if self.current_token.type in (IF, ELSEIF):
                self.eat(self.current_token.type, True)
                booleans.append(self.boolean())
                statement_lists.append(self.statement_list())
            else:
                statement_lists.append(self.statement_list())
                break

        self.eat(ENDIF, True)
        print("eaten")
        return NodeIfElse(booleans, statement_lists)

    ### Loops ###################################
    def for_loop(self):
        self.eat(FOR)
        var = self.identifier()
        self.eat(ASSIGN)
        start_expr = self.expr()
        self.eat(TO)
        end_expr = self.expr()

        if self.current_token.type == DO:
            self.eat(DO)
        self.skip_newline()
        statement_list = self.statement_list()

        # End
        self.skip_newline()
        if self.current_token.type == ENDFOR:
            self.eat(ENDFOR)
        elif self.current_token.type == NEXT:
            self.eat(NEXT)
            endvar = self.identifier()
            if endvar.name != var.name:
                raise Exception("The NEXT variable does not match")
                self.error()
        return NodeForLoop(var, start_expr, end_expr, statement_list)

    def while_loop(self):
        self.eat(WHILE)
        boolean = self.boolean()
        if self.current_token.type == DO:
            self.eat(DO)
        self.skip_newline()
        statement_list = self.statement_list()
        self.skip_newline()
        self.eat(ENDWHILE)
        return NodeWhileLoop(boolean, statement_list)

    ### Procedures and Functions ################
    def parameters(self):
        paramlist = []
        self.eat(LPAREN)
        while self.current_token.type != RPAREN:
            var = self.identifier()
            datatype = None
            if self.current_token.type == COLON:
                self.eat(COLON)
                datatype = self.datatype()

            paramlist.append((var, datatype))
            if self.current_token.type != COMMA:
                break
            else:
                self.eat(COMMA)
        self.eat(RPAREN)
        return NodeParams(paramlist)

    def procedure_def(self):
        self.eat(PROCEDURE)
        name = self.identifier()
        if self.current_token.type == LPAREN:
            param = self.parameters()
        else:
            param = NodeParams([])
        statement_list = self.statement_list()
        self.eat(ENDPROCEDURE)
        return NodeProcedure(name, param, statement_list)

    def function_def(self):
        self.eat(FUNCTION)
        name = self.identifier()
        if self.current_token.type == LPAREN:
            param = self.parameters()
        else:
            param = NodeParams([])
        statement_list = self.statement_list()
        self.eat(ENDFUNCTION)
        return NodeFunction(name, param, statement_list)

    def return_profunc(self):
        self.eat(RETURN)
        expr = None
        if self.current_token.type not in [NEWLINE, ENDFUNCTION, ENDPROCEDURE]:
            expr = self.expr()
        return NodeReturnProFunc(expr)

    ### Standard Library #########################
    def input(self):
        self.eat(INPUT)
        idf = self.variable()
        return NodeInput(idf)

    def output(self):
        self.eat(OUTPUT)
        expr = self.expr()
        return NodeOutput(expr)

    def program(self):
        return self.statement_list()

        # Copied from https://ruslanspivak.com/lsbasi-part14/


class ErrorCode():
    UNEXPECTED_TOKEN = 'Unexpected token'
    ID_NOT_FOUND     = 'Identifier not found'
    DUPLICATE_ID     = 'Duplicate id found'
    INVALID_TYPE     = 'Data Type is invalid'
    INVALID_RETURN_VALUE = "Should have no return value for Procedure"
    OTHER            = 'Other'


class Error(Exception):
    def __init__(self, error_code=None, token=None, message=None):
        self.error_code = error_code
        self.token = token
        # add exception class name before the message
        self.message = f'{self.__class__.__name__}: {message}'


class LexerError(Error):
    pass


class ParserError(Error):
    pass


class SemanticError(Error):
    pass
####################################################
class Symbol:
    def __init__(self, name, type=None):
        self.name = name
        self.type = type
        self.scope_level = 0


class VarSymbol(Symbol):
    def __init__(self, name, type):
        super().__init__(name, type)

    def __str__(self):
        return "<{class_name}(name='{name}', type='{type}')>".format(
            class_name=self.__class__.__name__,
            name=self.name,
            type=self.type,
        )

    __repr__ = __str__


class BuiltinTypeSymbol(Symbol):
    def __init__(self, name):
        super().__init__(name)

    def __str__(self):
        return self.name

    def __repr__(self):
        return "<{class_name}(name='{name}')>".format(
            class_name=self.__class__.__name__,
            name=self.name,
        )


class ProcedureSymbol(Symbol):
    def __init__(self, name, formal_params=None):
        super().__init__(name)
        # a list of VarSymbol objects
        self.formal_params = [] if formal_params is None else formal_params
        # a reference to procedure's body (AST sub-tree)
        self.block_ast = None

    def __str__(self):
        return '<{class_name}(name={name}, parameters={params})>'.format(
            class_name=self.__class__.__name__,
            name=self.name,
            params=self.formal_params,
        )

    __repr__ = __str__


#######################################################################
class ScopedSymbolTable:
    def __init__(self, scope_name, scope_level, enclosing_scope=None, debug = False):
        self._symbols = {}
        self.scope_name = scope_name
        self.scope_level = scope_level
        self.enclosing_scope = enclosing_scope
        self.debug = debug

    def _init_builtins(self):
        self.insert(BuiltinTypeSymbol('INTEGER'))
        self.insert(BuiltinTypeSymbol('STRING'))
        self.insert(BuiltinTypeSymbol('FLOAT'))
        self.insert(BuiltinTypeSymbol('ARRAY'))

    def __str__(self):
        h1 = 'SCOPE (SCOPED SYMBOL TABLE)'
        lines = ['\\n', h1, '=' * len(h1)]
        for header_name, header_value in (
            ('Scope name', self.scope_name),
            ('Scope level', self.scope_level),
            ('Enclosing scope',
             self.enclosing_scope.scope_name if self.enclosing_scope else None
            )
        ):
            lines.append(f'{header_name:<15}: {header_value}')
        h2 = 'Scope (Scoped symbol table) contents'
        lines.extend([h2, '-' * len(h2)])
        lines.extend(
            f'{key:>7}: {value}'
            for key, value in self._symbols.items()
        )
        lines.append('\\n')
        s = '\\n'.join(lines)
        return s

    __repr__ = __str__

    def log(self, msg):
        if self.debug:
            print(msg)

    def insert(self, symbol):
        self.log(f'Insert: {symbol.name}')
        symbol.scope_level = self.scope_level
        self._symbols[symbol.name] = symbol

    def lookup(self, name, current_scope_only=False):
        self.log(f'Lookup: {name}. (Scope name: {self.scope_name})')
        # 'symbol' is either an instance of the Symbol class or None
        symbol = self._symbols.get(name)

        if symbol is not None:
            return symbol

        if current_scope_only:
            return None

        # recursively go up the chain and lookup the name
        if self.enclosing_scope is not None:
            return self.enclosing_scope.lookup(name)


###########################################################################

class SemanticAnalyzer:
    def __init__(self, tree, debug=False):
        self.tree = tree
        self.current_scope = None
        self.debug = debug  # see '--scope' command line option


    def log(self, msg):
        if self.debug:
            print(msg)

    def error(self, error_code, token):

        #print("ERROR",error_code, token)
        '''
        raise SemanticError(
            error_code=error_code,
            token=token,
            message=f'{error_code.value} -> {token}',
        )
        '''

    def visit(self, node=None):
        if node == None:
            #print('RESET################')
            node = self.tree
            self.log('ENTER scope: global')
            global_scope = ScopedSymbolTable(
                scope_name='global',
                scope_level=1,
                enclosing_scope=self.current_scope,  # None
                debug = self.debug,
            )

            global_scope._init_builtins()
            self.current_scope = global_scope

        ### Data and Arithmetic #########################################
        if type(node) == NodeData:
            pass
        elif type(node) == NodeUnaryOp:
            self.visit(node.right)

        elif type(node) == NodeBinOp:
            self.visit(node.left)
            # shouldn't need to check node.value? Because tokenised
            self.visit(node.right)
        ### Program ##################################################################################################
        elif type(node) == NodeStatementList:
            for statement in node.statements:
                self.visit(statement)

        ### Declaration & Assignment ##################################################################################
        elif type(node) == NodeVariableDeclaration:
            type_name = node.given_type.name
            type_symbol = self.current_scope.lookup(type_name) # Different types of arrays not taken into account
            if type_symbol == None:
                self.error(
                    error_code=ErrorCode.INVALID_TYPE,
                    token=node,
                )
            # We have all the information we need to create a variable symbol.
            # Create the symbol and insert it into the symbol table.
            var_name = node.identifier.name
            var_symbol = VarSymbol(var_name, type_symbol)

            # Signal an error if the table already has a symbol
            # with the same name
            if self.current_scope.lookup(var_name, current_scope_only=True):
                self.error(
                    error_code=ErrorCode.DUPLICATE_ID,
                    token=node,
                )

            self.current_scope.insert(var_symbol)


        elif type(node) == NodeAssignment:
            var_name = self.visit(node.left)
            self.visit(node.right)

        elif type(node) == NodeIdentifier:
            #print(node.name, self.current_scope.lookup(node.name))
            if self.current_scope.lookup(node.name):
                pass
            else:
                self.log(f"Take note, variable {node.name} was not declared before hand")
            return node.name

        elif type(node) == NodeArrayCall:
            self.visit(node.index)
            var_token = self.current_scope.lookup(node.var)
            return self.visit(node.var)

        ### If-Else Statement ###################################################################
        elif type(node) == NodeBoolean:
            self.visit(node.expr1)
            if node.op != None and node.nodeBool != None:
                self.visit(node.nodeBool)
                #compstr = str(val1)+" "+node.op.value+" "+str(val2)

        elif type(node) == NodeIfElse:
            for index in range(0, len(node.booleans)):
                self.visit(node.booleans[index])
                self.visit(node.statement_lists[index])
            if len(node.booleans) < len(node.statement_lists):
                self.visit(node.statement_lists[-1])

        ### Loops ##################################################################################
        elif type(node) == NodeForLoop:
            self.visit(node.start_expr)
            self.visit(node.end_expr)
            self.visit(node.var)
            self.visit(node.statement_list)
        elif type(node) == NodeWhileLoop:
            self.visit(node.boolean)
            self.visit(node.statement_list)

        ### Procedures and Functions ###########################################
        elif type(node) == NodeFunctionCall:
            for index in range(len(node.arguments)):
                factor = node.arguments[index]
                self.visit(factor)

        elif type(node) in [NodeProcedure, NodeFunction]:
            proc_name = self.visit(node.name) # Get value of identifier
            proc_symbol = ProcedureSymbol(proc_name)
            self.current_scope.insert(proc_symbol)

            self.log(f'ENTER scope: {proc_name}')
            # Scope for parameters and local variables
            procedure_scope = ScopedSymbolTable(
                scope_name=proc_name,
                scope_level=self.current_scope.scope_level + 1,
                enclosing_scope=self.current_scope,
                debug = self.debug,
            )
            self.current_scope = procedure_scope

            # Insert parameters into the procedure scope
            for param, datatype in node.params.paramslist:
                if datatype != None:
                    param_type = self.current_scope.lookup(datatype.name)
                else:
                    param_type = None
                param_name = param.name
                var_symbol = VarSymbol(param_name, param_type)
                self.current_scope.insert(var_symbol)
                proc_symbol.formal_params.append(var_symbol)

            ## Execute the body of the procedure #######################
            #print(node.statement_list.statements)
            self.visit(node.statement_list)
            for statement in node.statement_list.statements:
                if type(statement) == NodeReturnProFunc:
                    if (
                        (type(node) == NodeProcedure and statement.expr == None) or
                        (type(node) == NodeFunction)
                        ):
                        pass
                    else:
                        self.error(
                            error_code=ErrorCode.INVALID_RETURN_VALUE,
                            token=statement
                        )
            self.log(procedure_scope)
            self.current_scope = self.current_scope.enclosing_scope
            self.log(f'LEAVE scope: {proc_name}')

        elif type(node) == NodeReturnProFunc:
            if node.expr != None:
                self.visit(node.expr)

        ### Standard Library ######################################################
        elif type(node) == NodeInput:
            self.visit(node.var)

        elif type(node) == NodeOutput:
            self.visit(node.expr)
        # Others
        else:
            print("#######################OTHER NODE NOTICED#################")
            print(type(node))


class ToPythonInterpreter:
    def __init__(self, tree):
        self.tree = tree

    def indentText(text, indent = '    '):
        lines = text.split('\\n')
        result = ''
        for line in lines:
            result += indent + line + '\\n'
        return result[:-1]

    def visit(self, node=None):
        if node == None:
            node = self.tree

        # Data and Arithmetic
        if type(node) == NodeData:
            if type(node.value) == str:
                return f'"{node.value}"'
            else:
                return f'{node.value}'
        elif type(node) == NodeUnaryOp:
            return f'{node.value} {self.visit(node.right)}'
        elif type(node) == NodeBinOp:
            return f'({self.visit(node.left)} {node.value} {self.visit(node.right)})'
        elif type(node) == NodeArrayCall:
            return f'{self.visit(node.var)}[{self.visit(node.index)}]'
        elif type(node) == NodeFunctionCall:
            arguments = ""
            for factor in node.arguments:
                arguments += f"{self.visit(factor)},"
            return f'{self.visit(node.var)}({arguments[:-1]})'
        # Program
        elif type(node) == NodeStatementList:
            output = ''
            for statement in node.statements:
                output += f'{self.visit(statement)}\\n'
            return output[:-1]
        # Declaration & Assignment
        elif type(node) == NodeVariableDeclaration:
            if node.given_type.name == "ARRAY":
                if node.size2 != None:
                    return f'{self.visit(node.identifier)} = [ [ None for j in range({self.visit(node.size2)}) ] for i in range({self.visit(node.size1)}) ]'
                else:
                    return f'{self.visit(node.identifier)} = [ None for i in range({self.visit(node.size1)}) ]'
            return f'{self.visit(node.identifier)} = None'
        elif type(node) == NodeAssignment:
            return f'{self.visit(node.left)} = {self.visit(node.right)}'
        # If-Else Statement
        elif type(node) == NodeBoolean:
            result = f'{self.visit(node.expr1)}'
            if node.op != None and node.nodeBool != None:
                result += f' {node.op.value} {self.visit(node.nodeBool)}'
            return result
        elif type(node) == NodeIfElse:
            result = ''
            result += f'if {self.visit(node.booleans[0])}:\\n'
            result += ToPythonInterpreter.indentText(self.visit(node.statement_lists[0])) + '\\n'

            for index in range(1, len(node.booleans)):
                result += f'elif {self.visit(node.booleans[index])}:\\n'
                #result += ToPythonInterpreter.indentText(self.visit(node.statement_lists[index])) + '\\n'
            if len(node.booleans) < len(node.statement_lists):
                 result += f'else:\\n'
                 result += ToPythonInterpreter.indentText(self.visit(node.statement_lists[-1])) + '\\n'

            return result[:-1]
        # Loops
        elif type(node) == NodeForLoop:
            result = f'for {self.visit(node.var)} in range({self.visit(node.start_expr)}, {self.visit(node.end_expr)} + 1):\\n'
            result += ToPythonInterpreter.indentText(self.visit(node.statement_list))
            return result
        elif type(node) == NodeWhileLoop:
            result = f'while {self.visit(node.boolean)}:\\n'
            result += ToPythonInterpreter.indentText(self.visit(node.statement_list))
            return result
        # Procedures and Functions
        elif type(node) == NodeParams:
            result = ""
            for param, datatype in node.paramslist:
                if datatype == None:
                    result += f"{self.visit(param)}, "
                else:
                    result += f"{self.visit(param)}:{datatype}, "
            return result[:-2]
        elif type(node) in [NodeProcedure, NodeFunction]:
            result = f'def {self.visit(node.name)}({self.visit(node.params)}):\\n'
            result += ToPythonInterpreter.indentText(self.visit(node.statement_list))
            return result
        elif type(node) == NodeReturnProFunc:
            if node.expr == None:
                result = f"return"
            else:
                result = f"return {self.visit(node.expr)}"
            return result
        # Standard Library
        elif type(node) == NodeInput:
            return f'{self.visit(node.var)} = input()'
        elif type(node) == NodeOutput:
            return f'print({self.visit(node.expr)})'
        # Others
        elif type(node) == NodeIdentifier:
            return f'{node.name}'
        else:
            print(type(node))



# haha copied from https://github.com/rspivak/lsbasi/blob/master/part19/spi.py
from enum import Enum
class ARType(Enum):
    PROGRAM   = 'PROGRAM'
    PROCEDURE = 'PROCEDURE'

class CallStack:
    def __init__(self):
        self._records = []

    def push(self, ar):
        self._records.append(ar)

    def pop(self):
        return self._records.pop()

    def peek(self): # Should use this to get the current call stack
        return self._records[-1]

    def __str__(self):
        s = '\\n'.join(repr(ar) for ar in reversed(self._records))
        s = f'CALL STACK\\n{s}\\n\\n'
        return s

    def get(self, key):
        for i in range(len(self._records)):
            val = self._records[-i-1].get(key)
            if val != None:
                return val
        return None

    def set(self, key, value):
        self.peek().set(key, value)

    def __repr__(self):
        return self.__str__()


class ActivationRecord:
    def __init__(self, name, type, nesting_level):
        self.name = name
        self.type = type
        self.nesting_level = nesting_level
        self.members = {}

    def __setitem__(self, key, value):
        self.members[key] = value

    def __getitem__(self, key):
        return self.members[key]

    def get(self, key):
        return self.members.get(key)

    def set(self, key, value):
        self.members[key] = value

    def __str__(self):
        lines = [
            '{level}: {type} {name}'.format(
                level=self.nesting_level,
                type=self.type.value,
                name=self.name,
            )
        ]
        for name, val in self.members.items():
            lines.append(f'   {name:<20}: {val}')

        s = '\\n'.join(lines)
        return s

    def __repr__(self):
        return self.__str__()

#print()
class Interpreter:
    def __init__(self, tree):
        self.tree = tree
        self.call_stack = CallStack()
        ar = ActivationRecord(
            name="global",
            type=ARType.PROGRAM,
            nesting_level=1,
        )
        self.call_stack.push(ar)

        self.return_value = None

    def visit(self, node=None, setVal=None):
        if node == None:
            node = self.tree

        ### Data and Arithmetic #########################################
        if type(node) == NodeData:
            return node.value
        elif type(node) == NodeUnaryOp:
            if node.value == "-":
                return 0 - self.visit(node.right)
            else:
                return self.visit(node.right)
        elif type(node) == NodeBinOp:
            value = self.visit(node.left)
            if node.value == "+":
                value += self.visit(node.right)
            elif node.value == "-":
                value -= self.visit(node.right)
            elif node.value == "*":
                value *= self.visit(node.right)
            elif node.value == "/":
                value /= self.visit(node.right)
            elif node.value == "//":
                value //= self.visit(node.right)
            return value
        ### Program ##################################################################################################
        elif type(node) == NodeStatementList:
            for statement in node.statements:
                self.visit(statement)

        ### Declaration & Assignment ##################################################################################
        elif type(node) == NodeVariableDeclaration:
            if node.given_type.name == "ARRAY":
                if node.size2 != None:
                    value = [ [ None for j in range(self.visit(node.size2)) ] for i in range(self.visit(node.size1)) ]
                else:
                    value = [ None for i in range(self.visit(node.size1)) ]
            else:
                value = None
            self.visit(node.identifier, setVal=value)

        elif type(node) == NodeAssignment:
            self.visit(node.left, setVal=self.visit(node.right))

        elif type(node) == NodeIdentifier:
            if setVal != None:
                self.call_stack.set(node.name, setVal)
            else:
                return self.call_stack.get(node.name)

        elif type(node) == NodeArrayCall:
            if setVal != None:
                indexes = []
                curr_node = node

                while type(curr_node) == NodeArrayCall:
                    indexes.insert(0, self.visit(curr_node.index))
                    curr_node = curr_node.var

                ### Traverse to needed memory Location
                if type(curr_node) == NodeIdentifier:
                    memoryLocation = self.call_stack.get(curr_node.name)
                    for i in indexes[:-1]:
                        memoryLocation = memoryLocation[i]
                    memoryLocation[indexes[-1]] = setVal
                else:
                    raise Exception("Cannot Assign to a non-variable")
            else:
                return self.visit(node.var)[self.visit(node.index)]
        ### If-Else Statement ###################################################################
        elif type(node) == NodeBoolean:
            val1 = self.visit(node.expr1)

            if node.op != None and node.nodeBool != None:
                val2 = self.visit(node.nodeBool)
                if type(val1) == str: val1 = '"'+val1+'"'
                if type(val2) == str: val2 = '"'+val2+'"'
                compstr = str(val1)+" "+node.op.value+" "+str(val2)
                #print(compstr)
                result = eval(compstr)
            else:
                result = val1
            return result
        elif type(node) == NodeIfElse:
            if self.visit(node.booleans[0]):
                self.visit(node.statement_lists[0])
            else:
                visited = False
                for index in range(1, len(node.booleans)):
                    if self.visit(node.booleans[index]):
                        self.visit(node.statement_lists[index])
                        visited = True
                        break
                if (not visited) and len(node.booleans) < len(node.statement_lists):
                    self.visit(node.statement_lists[-1])

        ### Loops ##################################################################################
        elif type(node) == NodeForLoop:
            counter = self.visit(node.start_expr)
            while counter < self.visit(node.end_expr) + 1:
                self.visit(node.var, setVal=counter)
                self.visit(node.statement_list)
                counter += 1
        elif type(node) == NodeWhileLoop:
            while self.visit(node.boolean):
                self.visit(node.statement_list)

        ### Procedures and Functions ###########################################
        elif type(node) == NodeFunctionCall:
            ### Create Activation Record ###############################
            function_node = self.visit(node.var)
            ar = ActivationRecord(
                name=function_node.name,
                type=ARType.PROCEDURE,
                nesting_level=self.call_stack.peek().nesting_level + 1,
            )
            self.call_stack.push(ar)


            ## Save Procedure Arguments ################################
            if len(node.arguments) != len(function_node.params.paramslist):
                raise Exception("Arguments doesn't line up with Parameters!!!")
            for index in range(len(node.arguments)):
                factor = node.arguments[index]
                param = function_node.params.paramslist[index][0]
                datatype = function_node.params.paramslist[index][1]
                self.visit(param, setVal=self.visit(factor))

            ## Execute the body of the procedure #######################
            for statement in function_node.statement_list.statements:
                self.visit(statement)
                if self.return_value != None: break

            ## Pop the activation record off the stack
            self.call_stack.pop()

            if self.return_value != None: return_value = self.return_value["values"]
            else: return_value = None
            self.return_value = None

            return return_value


        elif type(node) in [NodeProcedure, NodeFunction]:
            self.visit(node.name, setVal=node) # Assign the whole function
            #print(self.call_stack._records[0].members)
            #print(self.visit(node.name))

        elif type(node) == NodeReturnProFunc:
            if node.expr == None:
                self.return_value = {"completed": True, "values":None}
            else:
                self.return_value = {"completed": True, "values":self.visit(node.expr)}
        ### Standard Library ######################################################
        elif type(node) == NodeInput:
            self.visit(node.var, setVal=input("INPUT:"))

        elif type(node) == NodeOutput:
            print(self.visit(node.expr))
        # Others
        else:
            print("#######################OTHER NODE NOTICED#################")
            print(type(node))


def compile(code):
    l = Lexer(code)
    p = Parser(l)
    ast = p.program()
    SemanticAnalyzer(ast, False).visit()
    code = ToPythonInterpreter(ast).visit()
    return code
def runPseudocode(code):
    l = Lexer(code)
    p = Parser(l)
    ast = p.program()
    SemanticAnalyzer(ast, False).visit()
    code = Interpreter(ast).visit()

"Loaded"
#print(compile('a <- 1'))`;
