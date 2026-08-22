# Write your MySQL query statement below
SELECT 'Low Salary' AS category,
COALESCE(SUM(income < 20000), 0) AS accounts_count
FROM Accounts
UNION ALL
SELECT 'Average Salary' AS category,
COALESCE(SUM(income BETWEEN 20000 AND 50000), 0) AS accounts_count
FROM Accounts
UNION ALL
SELECT 'High Salary' AS category,
COALESCE(SUM(income > 50000), 0) AS accounts_count
FROM Accounts;