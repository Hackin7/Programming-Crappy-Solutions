CREATE TABLE Student(
    MatricNo TEXT, 
    Class TEXT, 
    IndexNo INTEGER, 
    Gender TEXT, 
    PRIMARY KEY (MatricNo)
);
  
CREATE TABLE Candidate(
    CandidateNo INTEGER, 
    Name TEXT, 
    Slogan TEXT, 
    PortraitLink TEXT
    PRIMARY KEY (CandidateNo)
);

CREATE TABLE Vote(
    MatricNo TEXT, 
    CandidateNo INTEGER, 
    PRIMARY KEY (MatricNo, CandidateNo), 
    FOREIGN KEY (MatricNo) REFERENCES Student(MatricNo),
    FOREIGN KEY (CandidateNo) REFERENCES Candidate(CandidateNo)
);