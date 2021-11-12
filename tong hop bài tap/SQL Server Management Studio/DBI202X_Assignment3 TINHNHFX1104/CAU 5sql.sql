
 select cast(LONG_W as decimal(10,4))
 from station where LAT_N = (select max(LAT_N) 
 from station where LAT_N<137.2