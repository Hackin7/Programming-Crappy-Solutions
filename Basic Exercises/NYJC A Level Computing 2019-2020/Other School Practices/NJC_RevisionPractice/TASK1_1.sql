CREATE TABLE "SCHOOL" (
	"SchoolCode"	INTEGER,
	"Name"	TEXT,
	"Address"	TEXT,
	PRIMARY KEY("SchoolCode")
);

CREATE TABLE "STAFF" (
	"SchoolCode"	INTEGER,
	"Name"	TEXT,
	"Department"	TEXT,
	"Contact"	INTEGER,
	PRIMARY KEY("Name")
);