--- CAU 1
SELECT TOP 1 CITY, LEN(CITY) AS LENGTH
FROM STATION 
ORDER BY LEN(CITY) ASC, CITY ASC;

SELECT TOP 1 CITY, LEN(CITY) AS LENGTH
FROM STATION 
ORDER BY LEN(CITY) DESC, CITY ASC;