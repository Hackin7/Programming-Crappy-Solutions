'''
Grammar Rules

compound_statement : BEGIN statement_list END
statement_list: statement | statement SEMI statement_list
statement: compount_statement | assignment_statement | empty
empty:

assignment_statement: variable ASSIGN expr
variable: ID

expr   :  term ((ADD | SUB) term )*
term : factor ((MUL | DIV) factor)*
factor : INTEGER
         | PLUS factor
         | MINUS factor
         | LPAREN expr RPAREN
         | variable
'''

from tokenisation import *
from ast import *

class Parser:
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
            raise Exception(f"{self.current_token} doesn't match {token_type}")
            self.error()

    ###### Terminals ###########################################################
    def integer(self):
        token = self.current_token
        self.eat(INTEGER)
        return NodeInteger(token)

    ###### Non-Terminals ########################################################
    def factor(self):
        token = self.current_token
        if token.type == INTEGER:
            return self.integer()
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
        elif token.type == ID:
            self.eat(ID)
            return NodeIdentifier(token)


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
            result = NodeBinOp(token, result, self.factor())
        return result

    ### Program Execution ##################################
    def compound_statement(self):
        self.eat(BEGIN)
        stuff = self.statement_list()
        self.eat(END)
        return stuff

    def statement_list(self):
        lis = NodeStatementList()
        lis.statements.append(self.statement())
        while self.current_token.type in (SEMI, ):
            self.eat(SEMI)
            if self.current_token.type == END:
                return lis
            else:
                lis.statements.append(self.statement())
        return lis
        
    def statement(self):
        if self.current_token.type == BEGIN:
            return self.compound_statement()
        elif self.current_token.type == ID:
            var = self.current_token.value
            self.eat(ID)
            self.eat(ASSIGN)
            expr = self.expr()
            return NodeAssignment(var, expr)
        else:
            print('Invalid', self.current_token)
            return None

    ### Declaration #############################
    def program(self):
        self.eat('PROGRAM')
        name = self.current_token.value
        self.eat(ID)
        self.eat(SEMI)
        block = self.block()
        self.eat(DOT)
        return NodeProgram(name, block)

    def block(self):
        declarations = self.declarations()
        cmpd = self.compound_statement()
        return NodeBlock(declarations, cmpd)
    
    def declarations(self):
        if self.current_token.type == VAR:
            self.eat(VAR)
            dec = []
            while self.current_token.type == ID:
                dec.append(self.vardeclaration())
            return NodeDeclarations(dec)
        else:
            return NodeDeclarations()

    def vardeclaration(self):
        vars  = []
        vars.append(self.current_token.value)
        self.eat(ID)
        while self.current_token.type == COMMA:
            self.eat(COMMA)
            vars.append(self.current_token.value)
            self.eat(ID)
        self.eat(COLON)

        giventype = None
        for vartype in ['TYPE_INTEGER', 'TYPE_REAL']:
            if self.current_token.type == vartype:
                giventype = self.current_token.value
                self.eat(vartype)

        return NodeVarDecl(vars, giventype)
