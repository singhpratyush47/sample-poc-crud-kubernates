IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='employee' and xtype='U') BEGIN CREATE TABLE employee ( emp_id INT PRIMARY KEY IDENTITY (1, 1), first_name VARCHAR(100),last_name VARCHAR(100),email VARCHAR(100)) END;
