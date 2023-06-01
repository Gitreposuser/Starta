CREATE DATABASE online_courses2;
USE online_courses2;

-- Task 1
CREATE TABLE time_table (
  id integer PRIMARY KEY AUTO_INCREMENT,
  group_id integer NOT NULL,
  teacher_id integer NOT NULL,
  lesson_start timestamp NOT NULL,
  lesson_end timestamp NOT NULL,
  created timestamp DEFAULT (now())
);

CREATE TABLE teachers (
  id integer PRIMARY KEY AUTO_INCREMENT,
  first_name varchar(30) NOT NULL,
  last_name varchar(30) NOT NULL,
  current_status varchar(255) NOT NULL,
  created timestamp DEFAULT (now())
);

CREATE TABLE students (
  id integer PRIMARY KEY AUTO_INCREMENT,
  first_name varchar(30) NOT NULL,
  last_name varchar(30) NOT NULL,
  group_id integer DEFAULT null,
  current_status varchar(128) NOT NULL,
  created timestamp DEFAULT (now())
);

CREATE TABLE telran_groups (
  id integer PRIMARY KEY AUTO_INCREMENT,
  title varchar(30) NOT NULL,
  current_status varchar(128) NOT NULL,
  created timestamp DEFAULT (now())
);

ALTER TABLE time_table ADD FOREIGN KEY (group_id) REFERENCES telran_groups (id);

ALTER TABLE time_table ADD FOREIGN KEY (teacher_id) REFERENCES teachers (id);

ALTER TABLE students ADD FOREIGN KEY (group_id) REFERENCES telran_groups (id);

INSERT INTO teachers (first_name, last_name, current_status, created)
VALUES
	('Ivan', 'Ivanov', 'working', CURRENT_TIMESTAMP),
    ('Petr', 'Petrov', 'working', CURRENT_TIMESTAMP);

INSERT INTO telran_groups (title, current_status, created)
VALUES
	('java 41e', 'not started', CURRENT_TIMESTAMP),
    ('java 43', 'in progress', CURRENT_TIMESTAMP),
    ('front end 41', 'in progress', CURRENT_TIMESTAMP);
    
INSERT INTO time_table (group_id, teacher_id, lesson_start, lesson_end, created)
VALUES
	(3, 1, TIMESTAMP('2023-06-05 19:00:00'), 
		TIMESTAMP('2023-06-05 22:00:00'), CURRENT_TIMESTAMP),
	(2, 1, TIMESTAMP('2023-06-07 18:30:00'), 
		TIMESTAMP('2023-06-07 21:30:00'), CURRENT_TIMESTAMP),
	(3, 2, TIMESTAMP('2023-06-09 18:30:00'), 
		TIMESTAMP('2023-06-09 21:30:00'), CURRENT_TIMESTAMP),
	(2, 2, TIMESTAMP('2023-06-09 19:15:00'), 
		TIMESTAMP('2023-06-09 21:15:00'), CURRENT_TIMESTAMP);

INSERT INTO students (first_name, last_name, group_id, current_status, created)
VALUES
	('Vasilij', 'Vasiliev', 1, 'studying', CURRENT_TIMESTAMP),
    ('Yanush', 'Polonskij', 1, 'studying', CURRENT_TIMESTAMP),
    ('Yana', 'Minskaja', 1, 'not started', CURRENT_TIMESTAMP),
    ('Milosh', 'Varkovich', 1, 'finished', CURRENT_TIMESTAMP),
    ('Vasilij', 'Stanovskij', 2, 'studying', CURRENT_TIMESTAMP),
    ('Yana', 'Ivashkina', 3, 'not started', CURRENT_TIMESTAMP),
    ('Anton', 'Varkovich', 3, 'finished', CURRENT_TIMESTAMP);

SELECT students.first_name, students.last_name, telran_groups.title
FROM students
INNER JOIN telran_groups
ON students.group_id = telran_groups.id;