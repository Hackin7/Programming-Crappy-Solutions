class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None
        self.current_size = 0

    def is_empty(self):
        return self.size() == 0
    
    def size(self):
        return self.current_size
    
    def push(self, data):
        self.current_size += 1
        if self.head is None:
            self.head = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.head
            self.head = new_node

    def pop(self):
        if self.head is None:
            return None
        else:
            self.current_size -= 1
            popped = self.head.data
            self.head = self.head.next
            return popped

    def peek(self):
        if self.head is None:
            return None
        else:
            popped = self.head.data
            return popped

import sys
sys.path.append('../')
import driver
driver.stackGrader(Stack())
