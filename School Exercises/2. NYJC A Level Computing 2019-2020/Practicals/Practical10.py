#!/usr/bin/env python

class Car:
    
    def __init__(self, speed=0, regularPrice=0.0, color=""):
        self.speed = int(0)
        self.regularPrice = float(regularPrice)
        self.color = str(color)
        
    def getSalePrice(self):
        return self.regularPrice

class Truck(Car):
    
    def __init__(self, speed=0, regularPrice=0.0, color="", weight=0):
        super().__init__(speed, regularPrice, color)
        self.weight = int(weight)

    def getSalePrice(self):
        if self.weight > 2000:
            #20% discount
            return float(Car.getSalePrice(self) * (1 - 0.2))
        else:
            #10% discount
            return float(Car.getSalePrice(self) * (1 - 0.1))
            
class Ford(Car):
    
    def __init__(self, speed=0, regularPrice=0.0, color="",year=0, manufacturerDiscount=0):#**kwargs):
        super().__init__(speed, regularPrice, color)
        self.year = int(year) #Must be Integer
        self.manufacturerDiscount = int(manufacturerDiscount)

    def getSalePrice(self):
        return Car.getSalePrice(self) - self.manufacturerDiscount
    
class Sedan(Car):
    
    def __init__(self, speed=0, regularPrice=0.0, color="",length=0):
        super().__init__(speed, regularPrice, color)
        self.length = int(length)
        
    def getSalePrice(self):
        if self.length > 20:
            #5% discount
            return float(Car.getSalePrice(self) * (1 - 0.05))
        else:
            #10% discount
            return float(Car.getSalePrice(self) * (1 - 0.1))

class MyOwnAutoShop():
    
    def main(self):
        sedan1 = Sedan(speed=0, regularPrice=1000, color="colourless",length=21)
        ford1 = Ford(speed=0, regularPrice=1000, color="colourless", year=0, manufacturerDiscount=10)
        ford2 = Ford(speed=0, regularPrice=1000, color="colourless",year=0, manufacturerDiscount=20)
        car = Car(speed=0, regularPrice=1000, color="colourless")
        print("Sedan Sale Price:",sedan1.getSalePrice())
        print("Ford1 Sale Price:",ford1.getSalePrice())
        print("Ford2 Sale Price:",ford2.getSalePrice())
        print("Car Sale Price:",car.getSalePrice())


def main(args):
    autoShop = MyOwnAutoShop()
    autoShop.main()
    return 0

if __name__ == '__main__':
    import sys
    sys.exit(main(sys.argv))
