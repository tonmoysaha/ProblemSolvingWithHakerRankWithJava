select CEIL(avg(Salary)-avg(replace(Salary,0,''))) from EMPLOYEES;