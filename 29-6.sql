CREATE TABLE emp(id INT PRIMARY KEY, NAME VARCHAR (20),email VARCHAR (50),dept VARCHAR (50));
ALTER TABLE emp ADD COLUMN sal INT;
INSERT INTO emp(id,NAME,email,dept,sal) VALUES (1,'ravina','ravina@gmail.com','testing',20000);
INSERT INTO emp(id,NAME,email,dept,sal) VALUES (2,'riya','riya@gmail.com','java',15000);
INSERT INTO emp(id,NAME,email,dept,sal) VALUES (3,'pooja','pooja@gmail.com','php',12500);
INSERT INTO emp(id,NAME,email,dept,sal) VALUES (4,'parth','parth@gmail.com','testing',8500);
INSERT INTO emp(id,NAME,email,dept,sal) VALUES (5,'sagar','sagar@gmail.com','php',5000);
INSERT INTO emp(id,NAME,email,dept,sal) VALUES (6,'nirva','nirva@gmail.com','java',10000);
INSERT INTO emp(id,NAME,email,dept,sal) VALUES (7,'parshad','parshad@gmail.com','software',16500);
SELECT * FROM emp;
SELECT NAME ,sal FROM emp;
SELECT DISTINCT dept FROM emp;
SELECT * FROM emp WHERE dept='java'; 
SELECT * FROM emp WHERE dept='testing'; 
SELECT * FROM emp WHERE dept='php'; 
SELECT * FROM emp WHERE dept='software'; 
SELECT * FROM emp WHERE dept='java'; 
SELECT * FROM emp WHERE dept='testing'; 
SELECT * FROM emp WHERE dept='php'; 
SELECT * FROM emp WHERE dept='software' OR dept='java';
SELECT * FROM emp WHERE dept='php' AND dept='java';
SELECT * FROM emp WHERE dept='php' OR dept='java';
SELECT * FROM emp WHERE dept='java' AND sal>5000;
SELECT * FROM emp  WHERE dept IN ('java','php');
SELECT * FROM emp WHERE dept NOT IN ('php');
SELECT * FROM emp WHERE NAME LIKE 'r%';
SELECT * FROM emp WHERE NAME LIKE '%a';
SELECT * FROM emp WHERE NAME LIKE '_a%';
SELECT * FROM emp WHERE NAME LIKE 'p__%';
SELECT  MAX(sal) FROM emp;
SELECT MIN(sal) FROM emp;
SELECT SUM(sal) FROM emp;
SELECT AVG(sal) FROM emp;
SELECT COUNT(sal) FROM emp;
SELECT * FROM emp WHERE sal=(SELECT MIN(sal) FROM emp);
SELECT * FROM emp ORDER BY NAME;
SELECT * FROM emp ORDER BY sal;
SELECT * FROM emp ORDER BY dept;
SELECT * FROM emp ORDER BY NAME DESC;
SELECT * FROM emp ORDER BY sal DESC;
 
START TRANSACTION ;
DELETE FROM emp WHERE id=5;

COMMIT;
ROLLBACK;



