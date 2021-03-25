CREATE TABLE `Device` (
	`SerialNumber`	TEXT,
	`Type` TEXT,
	`Model`	TEXT,
	`Location`	TEXT,
	`DateOfPurchase`	TEXT,
	`Writtenoff`	TEXT,
	PRIMARY KEY(`SerialNumber`)
);

CREATE TABLE `Monitor` (
	`SerialNumber`	TEXT,
	`DateCleaned`	TEXT,
	PRIMARY KEY(`SerialNumber`),
	FOREIGN KEY(`SerialNumber`) REFERENCES Device(SerialNumber)
);

CREATE TABLE `Laptop` (
	`SerialNumber`	TEXT,
	`WeightKg`	NUMERIC,
	PRIMARY KEY(`SerialNumber`),
	FOREIGN KEY(`SerialNumber`) REFERENCES Device(SerialNumber)
);

CREATE TABLE `Printer` (
	`SerialNumber`	TEXT,
	`Toner`	TEXT,
	`DateChanged`	TEXT,
	PRIMARY KEY(`SerialNumber`),
	FOREIGN KEY(`SerialNumber`) REFERENCES Device(SerialNumber)
);

