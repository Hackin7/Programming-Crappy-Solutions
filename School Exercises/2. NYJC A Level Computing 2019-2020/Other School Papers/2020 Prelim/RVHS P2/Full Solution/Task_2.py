#Task 2.1
class linkedlist:
    def __init__(self, size):#[3]
        self.keys = [-1]*size
        self.datas = ["None"]*size
        self.ptrs = [-1]*size
        
        self.head = -1
        self.nextFree = 0
        #initiailisation
        for i in range(1, size):
            self.ptrs[i-1] = i
    
    def insert(self, key, value):#[3]
        #Task 1.1
        #insert (key, value) pair as a node into the head of the linked list (behaved like the push operation of a stack)
        if self.nextFree != -1:
            # get a new slot
            newSlotPtr = self.nextFree
            self.nextFree = self.ptrs[newSlotPtr]
            
            # insert into the head of linked list
            self.keys[newSlotPtr] = key
            self.datas[newSlotPtr] = value
            self.ptrs[newSlotPtr] = self.head
            self.head = newSlotPtr
        else:
            print("No free slot!")
    
    def search_by_key(self, key):#[3]
        #Task 1.2
        if self.head != -1:
            currPtr =  self.head
            while currPtr != -1:
                if self.keys[currPtr] == key:
                    return self.datas[currPtr]
                currPtr =  self.ptrs[currPtr]
            return ""
        else:
            return ""

    def displayList(self):       
        if self.head != -1:
            currPtr =  self.head
            while currPtr != -1:
                print(self.datas[currPtr])
                currPtr =  self.ptrs[currPtr]

                
def freeTestCase():
    ll1 = linkedlist(10)
    ll1.insert(11,"apple")
    ll1.insert(22,"banana")
    ll1.insert(33,"carrot")
    ll1.insert(44,"dragonfruit")
    ll1.insert(55,"egplant")
    ll1.insert(66,"figs")
    ll1.insert(77,"grape")
    ll1.insert(88,"honeydew")
    ll1.insert(99,"imbe")
    ll1.insert(110,"jackfruit")
    ll1.insert(121,"kiwi")
    ll1.displayList() # Result is displayed fruits in decreasing alphabetical order.

freeTestCase()

#Task 2.2
class DirectChainingHashTable:
    def __init__(self, hashtable_size, linkedlist_size):#[2]
        self.table = []
        self.hashtable_size = hashtable_size
        
        #initialise hash table
        #Task 1.3
        for i in range(hashtable_size):
            temp = linkedlist(linkedlist_size)
            self.table.append(temp)
    
    def hash_function(self, key):
        return key % self.hashtable_size
        
    def insert_key_value_pair(self, key, value):#[2]
        #Task 1.4
        hash_value = self.hash_function(key)
        self.table[hash_value].insert(key, value)
    
    def search(self, key):#[2]
        #Task 1.5
        hash_value = self.hash_function(key)
        return self.table[hash_value].search_by_key(key)

        
def freeTestCase1():
    print("Free Test Case 1")
    DCHT = DirectChainingHashTable(11, 10)
    # to test for collision resolution
    DCHT.insert_key_value_pair(10,"apple")
    DCHT.insert_key_value_pair(21,"banana")
    DCHT.insert_key_value_pair(32,"carrot")
    DCHT.insert_key_value_pair(43,"dragonfruit")
    DCHT.insert_key_value_pair(54,"eggplant")
    DCHT.insert_key_value_pair(65,"figs")
    DCHT.insert_key_value_pair(76,"grape")
    DCHT.insert_key_value_pair(87,"honeydew")
    DCHT.insert_key_value_pair(98,"imbe")
    DCHT.insert_key_value_pair(109,"jackfruit")
    DCHT.insert_key_value_pair(120,"kiwi") # Not added
    #for item in [11,22,33,44,55,66,77,88,99,110,121]:
    for item in [10,21,32,43,54,65,76,87,98,109,120]:
        print(DCHT.search(item)) # Result is displayed fruits in increasing alphabetical order without kiwi.

def freeTestCase2():
    print("Free Test Case 2")
    DCHT = DirectChainingHashTable(11, 10)
    # to test for hashing on different slot and collision
    DCHT.insert_key_value_pair(11,"apple")
    DCHT.insert_key_value_pair(23,"banana")
    DCHT.insert_key_value_pair(35,"carrot")
    DCHT.insert_key_value_pair(47,"dragonfruit")
    DCHT.insert_key_value_pair(59,"eggplant")
    DCHT.insert_key_value_pair(71,"figs")
    DCHT.insert_key_value_pair(83,"grape")
    DCHT.insert_key_value_pair(95,"honeydew")
    DCHT.insert_key_value_pair(107,"imbe")
    DCHT.insert_key_value_pair(119,"jackfruit")
    DCHT.insert_key_value_pair(132,"kiwi")
    DCHT.insert_key_value_pair(143,"lemon")
    DCHT.insert_key_value_pair(34,"mango")
    #for item in [11,22,33,44,55,66,77,88,99,110,121]:
    for item in [11,23,35,47,59,71,83,95,107,119,132,143,34]:
        print(DCHT.search(item)) # # Result is displayed fruits in increasing alphabetical order for all 13 fruits.

freeTestCase1()
freeTestCase2()
