# Write your MySQL query statement below
select a.id as id , count(*) as num
from (
select accepter_id as id from RequestAccepted
union all
select requester_id as id from RequestAccepted
)
As a

group by a.id
order by num desc
limit 1;

