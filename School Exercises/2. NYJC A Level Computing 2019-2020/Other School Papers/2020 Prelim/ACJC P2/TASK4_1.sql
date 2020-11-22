CREATE TABLE "Employee" (
	"Employee_ID"	INTEGER,
	"Employee_name"	TEXT,
	"Job_type"	TEXT,
	"Date_of_employment"	TEXT,
	"Service_status"	TEXT,
	PRIMARY KEY("Employee_ID")
);

CREATE TABLE "Sales" (
	"Employee_ID"	INTEGER,
	"Total_sales"	NUMERIC,
	PRIMARY KEY("Employee_ID"),
    FOREIGN KEY("Employee_ID") REFERENCES "Employee"("Employee_ID")
);

CREATE TABLE "Tech_support" (
	"Employee_ID"	INTEGER,
	"Bugs_resolved"	INTEGER,
	PRIMARY KEY("Employee_ID"),
    FOREIGN KEY("Employee_ID") REFERENCES "Employee"("Employee_ID")
);