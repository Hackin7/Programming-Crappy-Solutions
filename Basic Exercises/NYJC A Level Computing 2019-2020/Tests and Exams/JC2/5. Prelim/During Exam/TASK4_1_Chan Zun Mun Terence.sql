CREATE TABLE `Registration` (
	`StudentID`	INTEGER,
	`Type`	TEXT,
	`Venue`	TEXT,
	`Session`	TEXT,
	PRIMARY KEY(`StudentID`)
);

CREATE TABLE `Arts` (
	`StudentID`	INTEGER,
	`Performance`	TEXT,
	PRIMARY KEY(`StudentID`),
	FOREIGN KEY (`StudentID`) REFERENCES Registration(`StudentID`)
);

CREATE TABLE `Cultural` (
	`StudentID`	INTEGER,
	`Race`	TEXT,
	PRIMARY KEY(`StudentID`),
	FOREIGN KEY (`StudentID`) REFERENCES Registration(`StudentID`)
);

CREATE TABLE `Sports` (
	`StudentID`	INTEGER,
	`Contact`	TEXT,
	`Cost`	TEXT,
	PRIMARY KEY(`StudentID`),
	FOREIGN KEY (`StudentID`) REFERENCES Registration(`StudentID`)
);