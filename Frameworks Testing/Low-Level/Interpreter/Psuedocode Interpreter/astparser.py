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

    def variable(self):
        token = self.current_token
        self.eat(ID)
        return NodeIdentifier(token)
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
            return self.variable()
        
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
            
        print(self.current_token)
        return ll
        
    def statement(self):
        self.skip_newline()
        if self.current_token.type == ID:
            return self.assignment_statement()
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
            print("Invalid", self.current_token)
            return None

    ### Assignments #############################
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
        var = self.variable()
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
            endvar = self.variable()
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
            var = self.variable()
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
        name = self.variable()
        if self.current_token.type == LPAREN:
            param = self.parameters()
        else:
            param = NodeParams([])
        statement_list = self.statement_list()
        self.eat(ENDPROCEDURE)
        return NodeProcedure(name, param, statement_list)
        
    def function_def(self):
        self.eat(FUNCTION)
        name = self.variable()
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
        var = self.variable()
        return NodeInput(var)

    def output(self):
        self.eat(OUTPUT)
        expr = self.expr()
        return NodeOutput(expr)

    def program(self):
        return self.statement_list()
    
