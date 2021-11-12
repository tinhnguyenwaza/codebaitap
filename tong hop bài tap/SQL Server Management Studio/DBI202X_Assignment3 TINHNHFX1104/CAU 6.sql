select format(round(LONg_W,4),'#.0000')
 from station where LAT_N = (select min(LAT_N) 
 from station where LAT_N > 38.7780)
