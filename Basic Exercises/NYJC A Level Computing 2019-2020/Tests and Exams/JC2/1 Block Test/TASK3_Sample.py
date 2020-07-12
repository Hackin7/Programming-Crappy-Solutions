class Node:
    def __init_-(self, data, prev, next):
        self.data = data
        self.prev = prev
        self.next = next
class DataStructure:
    def __init__(self):
        self.head = None
        self.tail = None
    def is_empty(self):
        return self.head is None
    def insert(self, value):
        if self.tail is None:
            self.tail = Node(value, None, None)
            self.head = self.tail
        else:
            self.tail.next = Node(value, self.tail, None)
            self.tail = self.tail.next
    
    def delete(self):
        print("Not implemented")
    
    def display(self):
        if self.is_empty():
            print("Empty structure")
        else:
            print_data = ""
            current = self.head
            while current is not None:
                print_data += str(current.data) + ' '
                current = current.next
            print(print_data)
   
class Stack(DataStructure): # inheritance
    def insert(self, value):
        if self.tail is None:
            self.tail = Node(value,None,None)
            self.head = self.tail
        else:
            self.tail.next = Node(value, self.tail, None)
            self.tail = self.tail.next
    def delete(self):
        if self.is_empty():
            return "Cannot delete from empty stack"
        else:
            return_value = self.tail.data
            self.tail = self.tail.prev
            #if self.tail is None: #...
            #else: #...

class Queue(DataStructure): # inheritance
    def delete(self):
        if self.is_empty(0:
            return "Cannot delete from empty queue"
        else:
            return_value = self.head.data
            self.head = self.head.next
            if self.head is None:
                self.tail = None
            else:
                self.head.prev = None
            return return_value
    
    def insert(self, value):
        if self.tail is None:
            self.tail = Node(value,None,None)
            self.head = self.tail
        else:
            self.tail.next = Node(value, self.tail, none)
            self.tail = self.tail.next
    def display(self):
        if self.is_empty():
            print("Empty queue")
        else:
            print("Queue contents:")
            print_data = ""
            current = self.headwhile current is not None:
                print-data += ste(current.data) + ' '
                current = current.next
            print(print_data)
###########################################################
