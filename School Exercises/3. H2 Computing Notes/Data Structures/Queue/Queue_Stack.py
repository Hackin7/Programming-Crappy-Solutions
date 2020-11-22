import sys;sys.path.append('../Stack');
from Stack_Python_List import Stack

class Queue:
    def __init__(self):
        self.inbox = Stack()
        self.outbox = Stack()

    def is_empty(self):
        return (self.inbox.is_empty() and self.outbox.is_empty())

    def enqueue(self, data):
        self.inbox.push(data)

    def dequeue(self):
        if self.outbox.is_empty():
            while not self.inbox.is_empty():
                popped = self.inbox.pop()
                self.outbox.push(popped)
        return self.outbox.pop()

q = Queue()
q.enqueue(1)
q.enqueue(2)
print(q.dequeue())
print(q.dequeue())
