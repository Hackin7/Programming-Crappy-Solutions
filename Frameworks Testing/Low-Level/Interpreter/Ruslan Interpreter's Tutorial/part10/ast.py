class Node:
    def __init__(self, value):
        self.value = value

# Arithmetic
class NodeInteger(Node):
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

class NodeAssignment(Node):
    def __init__(self, identifier, expr):
        self.left = identifier
        self.right = expr

class NodeIdentifier(Node):
    def __init__(self, token):
        self.name = token.value


class NodeProgram(Node):
    def __init__(self, name, block):
        self.name = name
        self.block = block

class NodeBlock(Node):
    def __init__(self, declarations, compound_statement):
        self.declarations = declarations
        self.compound_statement = compound_statement

class NodeDeclarations(Node):
    def __init__(self, dec=[]):
        self.dec = dec

class NodeVarDecl(Node):
    def __init__(self, vars=[], type=None):
        self.vars = vars
        self.type = type
    def __str__(self):
        return f'NodeVarDec1({self.vars}, {self.type})'

    def __repr__(self):
        return self.__str__()