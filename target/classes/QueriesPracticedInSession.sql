create database employee;
use employee;
create table employee_details (
		emp_id int Unique,
        emp_name varchar(25) NOT NULL,
        designation varchar(20),
        salary decimal(10,4)
        );
        
insert into employee_details (emp_id,emp_name,designation,salary) values (101,'Arun','Manager','10000.50');
insert into employee_details (emp_id,emp_name,designation,salary) values (102,'Arjun','Analyst','15000.50');
insert into employee_details (emp_id,emp_name,designation,salary) values (103,'Akash','Developer','15000.90'),
																		(104,'Sundar','Tester','160000.90');

Select * from employee_details;

insert into employee_details (emp_id,emp_name,designation,salary) values (105,null,'Manager','10000.50');
insert into employee_details (emp_id,emp_name,designation,salary) values (105,'Arun','Support','10000.50');

insert into employee_details (emp_id,emp_name,designation,salary) values (106,'Leema',null,'10000.50');

insert into employee_details (emp_id,emp_name,designation,salary) values (107,'Jo','Mento','12000.50');

Select * from employee_details where emp_name='Arun';

Select emp_id,salary from employee_details where emp_name='Arun';

select avg(salary) from employee_details;

Select * from employee_details where emp_name='Arun' AND emp_id=101;

select * from employee_details order by emp_name desc;

select * from employee_details where designation IS NULL;

Select * from employee_details where emp_name LIKE 'S%';

Select * from employee_details where emp_name LIKE '%a';

Select * from employee_details where emp_name LIKE '_e%';

select * from employee_details where salary between 10000 and 15000;

delete from employee_details where emp_name='Leema';

update employee_details set designation='Mentor' where emp_name='Jo';

alter table employee_details add otherinfo varchar(30);

alter table employee_details drop otherinfo;

alter table employee_details rename column emp_id to empid;

truncate table employee_details;

drop table employee_details;

use jdbc_demo;

select * from demo_table;