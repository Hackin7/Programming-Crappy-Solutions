import sqlite3

connection = sqlite3.connect("computercompany.db")

create_customer = """CREATE TABLE CUSTOMER ( 
  CustomerID TEXT,
  CustomerName TEXT,
  Email TEXT,
  Telephone INTEGER, 
  PRIMARY KEY (CustomerID) 
);"""

create_office = """CREATE TABLE OFFICE ( 
  OfficeID INTEGER,
  PostalCode TEXT,
  Telephone INTEGER, 
  PRIMARY KEY (OfficeID) 
);"""

create_salesperson = """CREATE TABLE SALESPERSON ( 
  SalesPersonID INTEGER,
  SalesPersonName TEXT,
  OfficeID INTEGER REFERENCES OFFICE(OfficeID)
  ON UPDATE CASCADE ON DELETE CASCADE,
  PRIMARY KEY (SalesPersonID) 
);"""

create_sale = """CREATE TABLE SALE (
  SalesPersonID INTEGER REFERENCES SALESPERSON(SalesPersonID)
  ON UPDATE CASCADE ON DELETE CASCADE,
  CustomerID TEXT REFERENCES CUSTOMER(CustomerID)
  ON UPDATE CASCADE ON DELETE CASCADE,
  SaleDate DATE,
  Amount REAL,
  PRIMARY KEY (SalesPersonID, CustomerID, SaleDate) 
);"""


connection.execute(create_customer)
connection.execute(create_office)
connection.execute(create_sale)
connection.execute(create_salesperson)

file = open("CUSTOMER.CSV","r")
count = 0
for line in file:
       line = line.strip()
       CustomerID, CustomerName, Email, Telephone =  line.split(",")

       if count == 0:
              count += 1
       else:       
              connection.execute("INSERT INTO CUSTOMER(CustomerID, CustomerName, Email, Telephone)" + 
                                 "VALUES(?,?,?,?)", (CustomerID, CustomerName, Email, Telephone))
              connection.commit()

file.close()

file = open("OFFICE.CSV","r")
count = 0
for line in file:
       line = line.strip()
       OfficeID, PostalCode, Telephone =  line.split(",")

       if count == 0:
              count += 1
       else:       
              connection.execute("INSERT INTO OFFICE(OfficeID, PostalCode, Telephone)" + 
                                 "VALUES(?,?,?)", (OfficeID, PostalCode, Telephone))
              connection.commit()

file.close()

file = open("SALE.CSV","r")
count = 0
for line in file:
       line = line.strip()
       SalesPersonID, CustomerID, SaleDate, Amount =  line.split(",")

       if count == 0:
              count += 1
       else:       
              connection.execute("INSERT INTO SALE(SalesPersonID, CustomerID, SaleDate, Amount)" + 
                                 "VALUES(?,?,?,?)", (SalesPersonID, CustomerID, SaleDate, Amount))
              connection.commit()

file.close()

file = open("SALESPERSON.CSV","r")
count = 0
for line in file:
       line = line.strip()
       SalesPersonID, SalesPersonName, OfficeID =  line.split(",")

       if count == 0:
              count += 1
       else:       
              connection.execute("INSERT INTO SALESPERSON(SalesPersonID, SalesPersonName, OfficeID)" + 
                                 "VALUES(?,?,?)", (SalesPersonID, SalesPersonName, OfficeID))
              connection.commit()

file.close()
       
connection.close()
