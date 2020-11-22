class Stack:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return self.size() == 0

    def size(self):
        return len(self.items)
    
    def push(self, data):
        self.items.append(data)

    def pop(self):
        if self.is_empty():
            return None
        else:
            return self.items.pop()

    def peek(self):
        if self.is_empty():
            return None
        else:
            return self.items[-1]


import sys
sys.path.append('../')
import driver
driver.stackGrader(Stack())
