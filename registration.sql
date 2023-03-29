CREATE DATABASE registration;

USE registration;

SHOW TABLES;


CREATE TABLE aluno(
    id_aluno INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    PRIMARY KEY(id_aluno)
);

SELECT * FROM aluno;

INSERT INTO aluno VALUES('1', 'richard','richardke@gmail');
/*or */
INSERT INTO aluno (nome, email) VALUES ('richard', 'richardke@gmail.com');

UPDATE aluno SET nome = 'caique' where id_aluno=1;