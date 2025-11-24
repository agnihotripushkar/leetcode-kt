# Write your MySQL query statement below
Select p.product_name, s.year, s.price from sales s LEFT JOIN product p ON s.product_id = p.product_id; 