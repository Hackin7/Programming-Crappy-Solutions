SELECT Class, IndexNo
FROM Candidate INNER JOIN Vote ON Candidate.CandidateNo == Vote.CandidateNo
INNER JOIN Student ON Vote.MatricNo == Student.MatricNo
WHERE Candidate.Name == "Ee Pei Chi Neoma" AND Class LIKE "1%" AND LENGTH(Class) == 2
ORDER BY Class, IndexNo ASC