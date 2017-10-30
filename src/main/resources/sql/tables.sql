
create database capricorn;
use capricorn;

create table student
(stu_id integer PRIMARY key AUTO_INCREMENT,
stu_name varchar(50),
stu_age integer);

insert into student(stu_name,stu_age) values('zhaozhy',22);
commit;


