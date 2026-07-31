# Write your MySQL query statement below
SELECT d.name AS Department,t.name AS Employee,t.salary AS Salary
FROM (SELECT e.name, e.salary,e.departmentId,DENSE_RANK() OVER (PARTITION BY departmentId
ORDER BY salary DESC) AS r
FROM Employee e) t
JOIN Department d
ON t.departmentId = d.id
WHERE r <= 3;