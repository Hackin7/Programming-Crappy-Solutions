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