select top 1 months * salary ,
count(*)
from Employee 
group by months * salary
order by months * salary desc

SELECT
    TOP 1 Months * Salary AS Earnings,
    COUNT(*)
FROM
    Employee
GROUP BY
    Months * Salary
ORDER BY
    Earnings DESC