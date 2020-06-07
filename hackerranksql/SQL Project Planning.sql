select Start_Date , End_Date from Projects 
 order by (to_date(End_Date,'yyyy-mm-dd')-to_date(Start_Date,'yyyy-mm-dd')) asc, Start_Date ;