SELECT FORMAT(ROUND(MAX(LAT_N),4),'#.0000')
FROM STATION
WHERE LAT_N < 137.2345;