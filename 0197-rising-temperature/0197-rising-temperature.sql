# Write your MySQL query statement below
select next.id from Weather next 
join Weather today on DateDiff(next.recordDate, today.recordDate) = 1 
where next.temperature > today.temperature;