CREATE DATABASE db_escola;
USE db_escola;

CREATE TABLE Alunos(
	ID bigint auto_increment,
    NOME varchar (60),
    IDADE int (200),
    TURMA int (30),
	PERIODO varchar(60),
    NOTA int(11),
    
    PRIMARY KEY (ID)
);

SELECT * FROM  Alunos;

INSERT INTO Alunos (NOME, IDADE, TURMA, PERIODO, NOTA) VALUES ("Diego", 24, 29, "Integral",10);
INSERT INTO Alunos (NOME, IDADE, TURMA, PERIODO, NOTA) VALUES ("Fulano", 24, 29, "Integral",9); 
INSERT INTO Alunos (NOME, IDADE, TURMA, PERIODO, NOTA) VALUES ("Desltrano", 24, 29, "Integral",8); 
INSERT INTO Alunos (NOME, IDADE, TURMA, PERIODO, NOTA) VALUES ("Marisa", 20, 29, "Integral",8); 
INSERT INTO Alunos (NOME, IDADE, TURMA, PERIODO, NOTA) VALUES ("Murilo", 24, 29, "Integral",6); 
INSERT INTO Alunos (NOME, IDADE, TURMA, PERIODO, NOTA) VALUES ("Beltrano", 24, 29, "Integral",5); 
INSERT INTO Alunos (NOME, IDADE, TURMA, PERIODO, NOTA) VALUES ("Ciclano", 24, 29, "Integral",4); 
INSERT INTO Alunos (NOME, IDADE, TURMA, PERIODO, NOTA) VALUES ("Carinha que mora logo ali", 24, 29, "Integral",3);

SELECT * FROM Alunos WHERE nota > 7;

SELECT * FROM Alunos WHERE nota < 7; 

UPDATE Alunos SET NOME = "Diego Silva" WHERE id = 2;