SELECT Class, IndexNo, Name, Result.TestID, Score, MaxScore 
FROM (Result INNER JOIN Student ON Student.MatricNo == Result.MatricNo) 
INNER JOIN Test ON Result.TestID == Test.TestID 
WHERE Class == "19J08" AND Year == 2020 
ORDER BY Test.TestID ASC;