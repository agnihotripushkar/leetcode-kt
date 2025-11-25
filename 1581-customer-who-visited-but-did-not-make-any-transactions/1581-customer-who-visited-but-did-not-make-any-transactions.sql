# Write your MySQL query statement below

select v.customer_id, COUNT(v.visit_id) as count_no_trans 
from  visits v left join Transactions t
on v.visit_id = t.visit_id 
where t.transaction_id is NULL 
Group by v.customer_id; 