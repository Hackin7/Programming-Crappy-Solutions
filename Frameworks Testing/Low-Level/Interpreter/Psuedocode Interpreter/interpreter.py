from ast import *

class Interpreter:
    def __init__(self, tree):
        self.tree = tree

    def indentText(text, indent = '    '):
        lines = text.split('\n')
        result = ''
        for line in lines:
            result += indent + line + '\n'
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
                output += f'{self.visit(statement)}\n'
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
            result += f'if {self.visit(node.booleans[0])}:\n'
            result += Interpreter.indentText(self.visit(node.statement_lists[0])) + '\n'
            
            for index in range(1, len(node.booleans)):
                result += f'elif {self.visit(node.booleans[index])}:\n'
                #result += Interpreter.indentText(self.visit(node.statement_lists[index])) + '\n'
            if len(node.booleans) < len(node.statement_lists):
                 result += f'else:\n' 
                 result += Interpreter.indentText(self.visit(node.statement_lists[-1])) + '\n'
            
            return result[:-1]
        # Loops
        elif type(node) == NodeForLoop:
            result = f'for {self.visit(node.var)} in range({self.visit(node.start_expr)}, {self.visit(node.end_expr)} + 1):\n'
            result += Interpreter.indentText(self.visit(node.statement_list))
            return result
        elif type(node) == NodeWhileLoop:
            result = f'while {self.visit(node.boolean)}:\n'
            result += Interpreter.indentText(self.visit(node.statement_list))
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
            result = f'def {self.visit(node.name)}({self.visit(node.params)}):\n'
            result += Interpreter.indentText(self.visit(node.statement_list))
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

        
