CREATE DATABASE faculdade;

USE faculdade;

SHOW TABLES;
DESCRIBE student;
DESCRIBE users;
DESCRIBE curses;

CREATE TABLE student(
ra INT AUTO_INCREMENT,
nome VARCHAR(30) NOT NULL,
endereco VARCHAR(60),
celular CHAR(14),
email VARCHAR(50),
course_key INT NOT NULL, 
FOREIGN KEY (course_key) REFERENCES courses(course_id),
PRIMARY KEY(ra)
);

SELECT * FROM student;

CREATE TABLE users(
cpf CHAR(12) NOT NULL, 
nome VARCHAR(50) NOT NULL, 
email VARCHAR(60) NOT NULL, 
pass_word VARCHAR(70) NOT NULL, 
celular CHAR(14),
PRIMARY KEY(cpf)
);

SELECT * FROM users;

CREATE TABLE courses(
course_id INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(90) NOT NULL, 
professor VARCHAR(50) NOT NULL,
descricao VARCHAR (300),
PRIMARY KEY(course_id)
);

SELECT * FROM courses;