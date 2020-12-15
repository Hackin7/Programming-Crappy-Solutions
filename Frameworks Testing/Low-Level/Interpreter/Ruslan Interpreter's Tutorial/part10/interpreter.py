from ast import *

class Interpreter:
    def __init__(self, tree):
        self.tree = tree
        
    def visit(self, node=None):
        if node == None:
            node = self.tree

        if type(node) == NodeInteger:
            return f'{node.value}'
        elif type(node) == NodeUnaryOp:
            return f'{node.value} {self.visit(node.right)}'
        elif type(node) == NodeBinOp:
            return f'{self.visit(node.left)} {node.value} {self.visit(node.right)}'
        elif type(node) == NodeStatementList:
            output = ''
            for statement in node.statements:
                output += f'{self.visit(statement)}\n'
            return output[:-1]
        elif type(node) == NodeAssignment:
            return f'{node.left} = {self.visit(node.right)}'
        elif type(node) == NodeIdentifier:
            return f'{node.name}'
        elif type(node) == NodeProgram:
            print(node.block.declarations.dec)
            return self.visit(node.block.compound_statement) # You don't need to define variables in python
        else:
            print(type(node))

        
