###Task 2.1######################
def HashKey(ThisCountry):
    ThisCountry = str(ThisCountry)
    total = 0
    for char in ThisCountry:
        total += ord(char)
    remainder = total % 373
    key = remainder + 1
    return key

#Test for Task 2.1
#print(HashKey("India"))

###Task 2.2#################
def CreateCountry():
    ###Open Country File####
    countryFile = open("COUNTRIES.TXT")
    line = countryFile.readline()
    firstCountry = line.split()
    countryFile.close()
    
    ###Data Processing######
    name = firstCountry[0]
    population = firstCountry[1]
    address = HashKey(name)
    #print(name, data, address) #Debugging   
    ###NEWFILE###############
    newFile = open("NEWFILE.TXT", "w+") #Write mode
    data = newFile.read().split()
    if len(data) < 10: #First Writing / Insufficient Length
        for i in range(250):
            data.append(" ")
    data[address] = line
    ###Overwriting to new file
    newFile.seek(0)
    for i in range(len(data)):
        newFile.write(data[i]+"\n")
    newFile.close()
    
CreateCountry()
    
###Task 2.3#################
def LookUpCountry():
    ###User Inputs the Country Name######
    name = input("Enter the country name: ").strip()#Remove trailing whitespaces
    ###Address Hashed from country Name#######
    address = HashKey(name)
    #print(address)
    ###Country and Population located in NEWFILE###############
    newFile = open("NEWFILE.TXT", "r")
    data = newFile.readlines()
    newFile.close()
    ###The address, the country name and population are output#####
    countryData = data[address][:-1].split() #Remove newline character
    if len(countryData) >= 2: #If there is sufficient data
        name = countryData[0]
        population = countryData[1]
        print("Information about country:")
        print(f"Address:    {address}")
        print(f"Name:       {name}")
        print(f"Population: {population}")
    else:
        print("The country cannot be found")
LookUpCountry()

###Task 2.4#################
def CreateCountry():
    ###Open Country File####
    countryFile = open("COUNTRIES.TXT")
    countries = countryFile.read().split("\n")
    countryFile.close()
    ###Data Processing######
    data = [""] * len(countries)
    for i in range(len(countries)):
        line = countries[i]
        country = line.split()
        if len(country) > 0: # If there is valid data
            name = country[0]
            population = country[1]
            hashkey = HashKey(name)
            #####Collision#####################################################
            address = hashkey
            loop = 0 #Number of loops around the dataset
            while (address < 0  or address >= len(data)) or \
                  (data[address] != "" and \
                  loop < 1):
                #print(address)
                address += 1 #Move on to next address
                if (address < 0  or address >= len(data)):
                    address = 0
                if address == hashkey:
                    loop += 1
            ##In case size of data is too big###########
            if loop >= 1:
                Exception("Error")
            #######################################################################
            data[address] = line

    ###NEWFILE###############
    newFile = open("NEWFILE.TXT", "w+") #Write mode
    ###Overwriting to new file
    newFile.seek(0)
    for i in range(len(data)):
        newFile.write(data[i]+"\n")
    newFile.close()
    
CreateCountry()

###Task 2.5#################
def LookUpCountry():
    """
    To Deal with Collision:
    1) Calculate the address
    2) Check if address is used
    3) Find the next empty line
    """
    ###User Inputs the Country Name######
    name = input("Enter the country name: ").strip()#Remove trailing whitespaces
    ###Address Hashed from country Name#######
    hashkey = HashKey(name)
    ###Country and Population located in NEWFILE###############
    newFile = open("NEWFILE.TXT", "r")
    data = newFile.readlines()
    newFile.close()
    ###The address, the country name and population are output#####
    
    #####Collision#####################################################
    address = hashkey
    loop = 0 #Number of loops around the dataset
    while (address < 0  or address >= len(data)) or \
          (data[address] != "" and \
          loop < 1 and \
          name+" " not in data[address] ):
        address += 1 #Move on to next address
        if (address < 0  or address >= len(data)):
            address = 0
        if address == hashkey:
            loop += 1
    ##In case size of data is too big###########
    if loop >= 2 :
        print("The country cannot be found")
        return
    #######################################################################
    countryData = data[address][:-1].split() #Remove newline character
    if len(countryData) >= 2: #If there is sufficient data
        population = countryData[-1]
        name = data[address][:-1-len(population)] #Extract from data
        print("Information about country:")
        print(f"Address:    {address}")
        print(f"Name:       {name}")
        print(f"Population: {population}")
LookUpCountry()
