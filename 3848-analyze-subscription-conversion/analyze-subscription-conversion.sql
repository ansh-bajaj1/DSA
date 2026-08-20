# Write your MySQL query statement below
select a.user_id, round(a.trial_avg_duration,2) as trial_avg_duration, round(b.paid_avg_duration,2)
as paid_avg_duration from
(
select user_id,avg(activity_duration) as trial_avg_duration from UserActivity
where activity_type='free_trial' 
group by user_id
)
as a
join
(
select user_id,avg(activity_duration) as paid_avg_duration from UserActivity
where activity_type='paid' 
group by user_id
)
as b
on a.user_id=b.user_id
order by a.user_id;  

