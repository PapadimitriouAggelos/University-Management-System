show databases;

use universitymanagementsystem;

create table teacher(name varchar(40), surname varchar(40), rollno varchar(20), d varchar(40), address varchar(40), phone varchar(40),email varchar(40), classx varchar(20), classxp varchar(20), aadhar varchar(20), qualification varchar(20), department varchar(40));

select * from teacher;

create table studentleave(rollno varchar(40), d varchar(50), duration varchar(50));

select * from studentleave;

create table teacherleave(rollno varchar(40), d varchar(50), duration varchar(50));

select * from teacherleave;

create table subject(rollno varchar(20), semester varchar(20), subject1 varchar(50), subject2 varchar(50), subject3 varchar(50), subject4 varchar(50), subject5 varchar(50));

create table marks(rollno varchar(20), semester varchar(20), marks1 varchar(50), marks2 varchar(50), marks3 varchar(50), marks4 varchar(50), marks5 varchar(50));