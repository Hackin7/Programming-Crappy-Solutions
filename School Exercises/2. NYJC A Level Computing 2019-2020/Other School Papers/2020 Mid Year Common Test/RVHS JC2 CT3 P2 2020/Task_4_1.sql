CREATE TABLE "Student" (
	"MatricNo"	TEXT,
	"Name"	TEXT,
	"Class"	TEXT,
	"IndexNo"	INTEGER,
	"Gender"	TEXT,
	PRIMARY KEY("MatricNo")
);

CREATE TABLE "Test" (
	"TestID"	INTEGER,
	"Subject"	TEXT,
	"Level"	TEXT,
	"MaxScore"	INTEGER,
	"Year"	INTEGER,
	"Term"	INTEGER,
	"Percentage"	INTEGER,
	PRIMARY KEY("TestID" AUTOINCREMENT)
);

CREATE TABLE "Result" (
	"MatricNo"	INTEGER,
	"TestID"	INTEGER,
	"Score"	INTEGER,
	PRIMARY KEY("MatricNo","TestID"), 
	FOREIGN KEY ("MatricNo") REFERENCES Student("MatricNo"),
	FOREIGN KEY ("TestID") REFERENCES Test("TestID")
);