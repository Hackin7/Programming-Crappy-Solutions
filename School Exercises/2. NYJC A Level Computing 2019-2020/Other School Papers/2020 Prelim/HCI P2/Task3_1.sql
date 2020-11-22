CREATE TABLE "Product" (
	"ProductCode"	TEXT,
	"Name"	TEXT,
	"Type"	TEXT,
	"Location"	TEXT,
	"Price"	NUMERIC,
	PRIMARY KEY("ProductCode")
);

CREATE TABLE "Cake" (
	"ProductCode"	TEXT,
	"ServingSize"	INTEGER,
	"Shape"	TEXT,
	PRIMARY KEY("ProductCode"),
    FOREIGN KEY("ProductCode") REFERENCES "Product"("ProductCode")
);

CREATE TABLE "Loaf" (
	"ProductCode"	TEXT,
	"Weight"	NUMERIC,
	PRIMARY KEY("ProductCode"),
    FOREIGN KEY("ProductCode") REFERENCES "Product"("ProductCode")
);

CREATE TABLE "Bun" (
	"ProductCode"	TEXT,
	"PiecesPerPackage"	INTEGER,
	PRIMARY KEY("ProductCode"),
    FOREIGN KEY("ProductCode") REFERENCES "Product"("ProductCode")
);