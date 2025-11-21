# Write your MySQL query statement below

# this also works 
# select name from customer where referee_id =2 is NOT True

# this is the best
select name from customer where referee_id !=2 or referee_id is null

# below statement doesn't work
# select name from customer where referee_id !=2 or referee_id = null
