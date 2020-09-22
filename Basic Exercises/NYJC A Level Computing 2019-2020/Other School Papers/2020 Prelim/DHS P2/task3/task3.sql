INSERT INTO Teacher(TeacherUsername, TeacherPassword) VALUES(?, ?);
INSERT INTO Lesson(TeacherUsername, PresentationDate, Class) VALUES(?, ?, ?);
INSERT INTO StudentScore(StudentIndex, Class, PresentationDate, Marks) VALUES(?, ?, ?, ?);