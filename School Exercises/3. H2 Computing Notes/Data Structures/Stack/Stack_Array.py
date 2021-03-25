class Stack:
    def __init__(self):
        self.MAX_SIZE = 30
        # Simulate an array in Python
        self.array = []
        for index in range(self.MAX_SIZE):
            self.array.append(None)
        self.head = 0 # The first empty index

    def is_empty(self):
        return self.size() == 0

    def size(self):
        return self.head
    
    def push(self, data):
        if self.size() >= self.MAX_SIZE:
            print("Error: the stack is at full capacity!")
        else:
            self.array[self.head] = data
            self.head += 1
            

    def pop(self):
        if self.is_empty():
            return None
        else:
            self.head -= 1
            return self.array[self.head]

    def peek(self):
        if self.is_empty():
            return None
        else:
            return self.array[self.head - 1]


import sys;sys.path.append('../');
import driver
driver.stackGrader(Stack())
