CREATE DATABASE online_courses;

USE online_courses;

drop table students;
drop table `groups`;
drop table student_attachements;

CREATE TABLE students (
	student_id int primary key auto_increment,
    created_at timestamp DEFAULT current_timestamp,
    fullname varchar(64) NOT NULL,
    email varchar(64) UNIQUE
);

CREATE TABLE `groups` (
	group_id int primary key auto_increment,
    created_at timestamp DEFAULT current_timestamp,
    name varchar(64) NOT NULL
);

CREATE TABLE student_attachements (
	student_attachement_id int primary key auto_increment,
    created_at timestamp DEFAULT current_timestamp,
    group_id int NOT NULL,
    student_id int NOT NULL,
    
    start timestamp default NULL,
    finish timestamp default NULL
);

INSERT INTO students (fullname, email)
VALUES
	('Ivanov Ivan', 'hello@example.org'),
    ('Petr Petrov', 'nothello@example.org');
    
INSERT INTO `groups` (name)
VALUES
	('Group 1');
    
INSERT INTO student_attachements (group_id, student_id, start)
VALUES
	(1, 1, CURRENT_TIMESTAMP),
    (1, 2, TIMESTAMP('2023-06-01 00:00:00')),
    (1, 3, TIMESTAMP('2023-07-01 00:00:00'));