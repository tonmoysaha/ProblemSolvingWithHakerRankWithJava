select distinct(CITY) from STATION where (UPPER(CITY) like 'A%' or UPPER(CITY) like 'E%' or UPPER(CITY) like 'I%'
or UPPER(CITY) like 'O%' or UPPER(CITY) like 'U%') and (UPPER(CITY) like '%A' or UPPER(CITY) like '%E' or UPPER(CITY) like '%I'
or UPPER(CITY) like '%O' or UPPER(CITY) like '%U')  ;


