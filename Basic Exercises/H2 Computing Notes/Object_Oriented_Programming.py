class MainClass:
    class_attribute = "Is the same for all objects of the same class"

    # Constant for all Classes
    def class_method():
        return "Hi you just called a class method"
        
    def __init__(self):
        self.object_attribute = "value"

    def __str__(self):
        return "MainClass: This gives a str representation of the thing"

    def object_method(self):
        return f"You can modify the object variable `self`, or access it ```{self}```"

    def method2(self):
        return "Not Implemented Yet"



class InheritedClass(MainClass):
    def __init__(self):
        super().__init__()
        self.object_attribute += " but different"
        #MainClass.__init__(self) # This also works

    def method2(self):
        return "This method is overridden. Python doesn't support method overloading (same function but you can put in different parameters)"

def show(stuff):
    print(f"{stuff:35} | {eval(stuff)}")

show("MainClass.class_attribute")
show("MainClass.class_method()")
print()

mainObject = MainClass()
show("mainObject.object_attribute")
show("mainObject.object_method()")
show("mainObject.method2()")
show("str(mainObject)")
show("type(mainObject)")
print()

inheritedObject = InheritedClass()
show("inheritedObject.object_attribute")
show("inheritedObject.object_method()")
show("inheritedObject.method2()")
show("str(inheritedObject)")
show("type(inheritedObject)")
print()

mainObject2 = MainClass()
print("Demonstration of Class attribute (Is the same for all objects):")
print("### Before Modification ##############################")
show("MainClass.class_attribute")
show("mainObject.class_attribute")
show("mainObject2.class_attribute")
### Only the class attribute of the object that was modified was changed
print('### After Modification `mainObject.class_attribute += " and now I added stuff"` ###############################')
mainObject.class_attribute += " and now I added stuff"
show("MainClass.class_attribute")
show("mainObject.class_attribute")
show("mainObject2.class_attribute")
### All the class attributes should change
print('### After Modification `MainClass.class_attribute += " and now I added stuff"` ###############################')
MainClass.class_attribute += " and now I added stuff"
show("MainClass.class_attribute")
show("mainObject.class_attribute")
show("mainObject2.class_attribute")
print()

print("Demonstration of Object attribute (Independent for a specific object):")
print("### Before Modification ###############################")
show("mainObject2.object_attribute")
show("mainObject.object_attribute")
### Only the class attribute of the object that was modified was changed
print("### After Modification ###############################")
mainObject2.object_attribute = "I changed the value"
show("mainObject2.object_attribute")
show("mainObject.object_attribute")
print()


