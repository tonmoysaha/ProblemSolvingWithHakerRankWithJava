select distinct(CITY) from STATION where not UPPER(SUBSTR(CITY,1,1))  in ('A','E','I','O','U');

--select distinct(CITY) from STATION where not (UPPER(CITY)  like 'A%' or UPPER(CITY)  like 'E%' or UPPER(CITY)  like 'I%'
--or UPPER(CITY)  like 'O%' or UPPER(CITY)  like 'U%');