	create table db_rh;
    use db_rh;
    
    /* EXIBINDO O DATABASE CRIADO */ 
    SELECT * FROM db_funcionarios;
    /*INSERINDO DADOS NA TABELA*/
    
    INSERT INTO db_funcionarios (NOME, SETOR, SALARIO) VALUES ("Diego", "TI", 5000.00);
    INSERT INTO db_funcionarios (NOME, SETOR, SALARIO) VALUES ("Fulano", "RH", 5000.00);
    INSERT INTO db_funcionarios (NOME, SETOR, SALARIO) VALUES("Deltrano", "CONTABIL", 5000.00);
    INSERT INTO db_funcionarios (NOME, SETOR, SALARIO) VALUES("CICLANO", "TI", 1000.00);
    INSERT INTO db_funcionarios (NOME, SETOR, SALARIO) VALUES("BELTRANO", "CALL CENTER", 1100.00);
    
    /*EXIBINDO SALARIOS MAIOR QUE 2000.00*/
    SELECT * FROM db_funcionarios where salario >=2000.00;
    SELECT * FROM db_funcionarios where salario <= 2000.00;
    
    /*ATUALIZANDO DADOS DO USUARIO*/
    UPDATE db_funcionarios SET SALARIO =  1300.00 
		WHERE id = 5;
