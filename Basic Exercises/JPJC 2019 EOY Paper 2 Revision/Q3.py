class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None

    ###Accessors#############################################
    def isListEmpty(self) -> bool:
        return self.head == None
    def listLength(self) -> int:
        length = 0
        ###List Traversal####
        node = self.head
        while node != None:
            length += 1
            node = node.next
        #####################
        return length

    ###Mutators##############################################
    ####Insertion########################
    def insertEnd(self,toAddNode):
        self.insertAt(toAddNode, self.listLength())
    def insertHead(self,toAddNode):
        toAddNode.next = self.head
        self.head = toAddNode
    def insertAt(self,toAddNode, index):
        if index == 0:
            self.insertHead(toAddNode)
        else:
            ###List Traversal####
            prevNode = self.head
            node = self.head
            length = 0
            while node != None and length < index:
                length += 1
                prevNode = node
                node = node.next
            #####################
            toAddNode.next = node
            prevNode.next = toAddNode#ConnectionNode(data, next=node)

    ####Deletion#########################
    def deleteAt(self,index):
        ###List Traversal####
        prevNode = self.head
        node = self.head
        length = 0
        while node != None and length < index:
            length += 1
            prevNode = node
            node = node.next
        #####################
        if node != None:
            #Reroute previous node to next node
            prevNode.next = node.next
            del node
        else:
            #Link to nothing left
            if prevNode != None:
                prevNode.next = None

    def deleteEnd(self):
        self.deleteAt(self.listLength()-1)
    ##############################################################

    def printList(self):
        ###List Traversal####
        node = self.head
        while node != None:
            print(node.data)
            node = node.next
        #####################


###Given Code######################################################
linkedList = LinkedList()

node1 = Node('network')
node2 = Node('transmission')
node3 = Node('receiver')
node4 = Node('wireless')
node5 = Node('data')
node6 = Node('router')

linkedList.insertEnd(node1)
linkedList.insertEnd(node2)
linkedList.insertEnd(node3)
linkedList.printList()
print('---------------------')
linkedList.deleteAt(2)
linkedList.insertHead(node4)
linkedList.insertAt(node5,2)
linkedList.insertAt(node6,2)
linkedList.deleteEnd()
print(linkedList.listLength())
linkedList.printList()

