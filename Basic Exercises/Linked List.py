class Node:
    def __init__(self, value=None,next=None):
        self.value = value
        self.next = next

class LinkedList:
    def __init__(self):
        self.start = None
        
    def isEmpty(self):
        return self.start == None
    
    def display(self):
        output = ""
        # Traversal
        curr = self.start
        while curr != None:
            output += str(curr.value)
            curr = curr.next
            if curr != None:
                output += ", "
        print(output)
    
    def get(self, pos):
        counter = 0
        curr = self.start
        while counter < pos and curr != None:
            curr = curr.next
            counter += 1
        return curr
        
    def insert(self,pos,value):
        counter = 0
        prev = None
        curr = self.start
        while counter < pos and curr != None:
            prev = curr
            curr = curr.next
            counter += 1
        newNode = Node(value,curr)
        if prev == None:
            self.start = newNode
        else:
            prev.next = newNode

    def remove(self,pos):
        counter = 0
        prev = None
        curr = self.start
        while counter < pos and curr != None:
            prev = curr
            curr = curr.next
            counter += 1
        if prev == None:
            self.start = curr.next
        else:
            prev.next = curr.next
    
def driver():
    l = LinkedList()
    print(l.isEmpty())
    l.insert(10,2)
    l.insert(10,1)
    l.insert(10,3)
    l.insert(10,4)
    l.insert(10,5)
    l.display()
    print(l.isEmpty())
    print(l.get(3).value)
    l.remove(2)
    l.display()

if __name__ == "__main__":
    driver()
    
        
