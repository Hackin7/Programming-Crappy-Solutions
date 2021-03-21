# Copied from https://ruslanspivak.com/lsbasi-part14/

from ast import *

from enum import Enum



class ErrorCode(Enum):
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
        lines = ['\n', h1, '=' * len(h1)]
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
        lines.append('\n')
        s = '\n'.join(lines)
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
        
        print("ERROR",error_code, token)
        '''
        raise SemanticError(
            error_code=error_code,
            token=token,
            message=f'{error_code.value} -> {token}',
        )
        '''

    def visit(self, node=None):
        if node == None:
            print('RESET################')
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
