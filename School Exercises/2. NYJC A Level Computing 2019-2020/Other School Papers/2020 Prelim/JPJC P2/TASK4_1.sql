CREATE TABLE CUSTOMER(
    CustomerID TEXT, 
    CustomerName TEXT, 
    Email TEXT, 
    Telephone INTEGER, 
    PRIMARY KEY (CustomerID)
);

CREATE TABLE OFFICE(
    OfficeID INTEGER, 
    PostalCode INTEGER, 
    Telephone INTEGER, 
    PRIMARY KEY(OfficeID)
);

CREATE TABLE SALESPERSON(
    SalesPersonID INTEGER, 
    SalesPersonName TEXT, 
    OfficeID INTEGER, 
    PRIMARY KEY (SalesPersonID),
    FOREIGN KEY (OfficeID) REFERENCES OFFICE(OfficeID)
);

CREATE TABLE SALE(
    SalesPersonID TEXT, 
    CustomerID TEXT,
    SaleDate TEXT, 
    Amount INTEGER, 
    PRIMARY KEY (SalesPersonID, CustomerID, SaleDate), 
    FOREIGN KEY (SalesPersonID) REFERENCES SALESPERSON(SalesPersonID),
    FOREIGN KEY (CustomerID) REFERENCES CUSTOMER(CustomerID)
);