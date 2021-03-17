from ast import *
from stack import *

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
  
