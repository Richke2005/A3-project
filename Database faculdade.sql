CREATE DATABASE faculdade;

USE faculdade;
SHOW TABLES;

CREATE TABLE Student(
ra INT AUTO_INCREMENT,
nome VARCHAR(30) NOT NULL,
endereco VARCHAR(60),
celular  BIGINT(14) NOT NULL,
email VARCHAR(50),
curso VARCHAR(60),
PRIMARY KEY(ra)
);
INSERT INTO Student(nome, email, celular) VALUES( "kend","kendylailane@hotmail.com", 11995263657);
UPDATE Student set celular = 11947316281 where ra = 1;
drop table Student;
select * from Student;