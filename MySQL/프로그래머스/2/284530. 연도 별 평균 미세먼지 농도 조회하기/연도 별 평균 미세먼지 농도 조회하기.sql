-- 코드를 작성해주세요
/*SELECT YEAR(YM) AS YEAR, ROUND(AVG(PM_VAL1),3)PM10, ROUND(AVG(PM_VAL2),3) `PM2.5`
FROM AIR_POLLUTION
WHERE LOCATION2 = '수원'
GROUP BY YEAR(YEAR)
ORDER BY YEAR ASC ;
*/
select 
    year(YM) as YEAR,
    round(avg(PM_VAL1),2) as PM10,
    round(avg(PM_VAL2),2) as 'PM2.5'
from AIR_POLLUTION
where LOCATION2 = '수원'
group by YEAR
order by YEAR;