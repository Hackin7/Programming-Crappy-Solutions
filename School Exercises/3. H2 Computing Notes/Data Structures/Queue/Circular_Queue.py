class CircularQueue:
    #Constructor
    def __init__(self):
        self.queue = list()
        self.head = 0
        self.tail = 0
        self.maxSize = 2

    #Adding elements to the queue
    def enqueue(self, data):
        if self.size() == self.maxSize:
            return ("Queue Full!")
        self.queue.append(data)
        self.tail = (self.tail + 1) % (self.maxSize + 1)
        return True

    #Removing elements from the queue
    def dequeue(self):
        if self.size()== 0:
            return ("Queue Empty!")
        data = self.queue[self.head]
        self.head = (self.head + 1) % (self.maxSize + 1)
        return data
    
    #Calculating the size of the queue
    def size(self):
        if self.tail >= self.head:
            return (self.tail - self.head)
        return (self.maxSize + 1 - (self.head - self.tail))

q = CircularQueue()
print(q.size())
print(q.enqueue(1))
print(q.enqueue(2))
print(q.dequeue())
print(q.dequeue())
