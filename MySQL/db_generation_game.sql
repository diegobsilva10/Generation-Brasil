CREATE DATABASE db_generation_game;
use db_generation_game;

CREATE TABLE tb_classe(
	id_classe BIGINT AUTO_INCREMENT,
    equipe VARCHAR (60),
    habilidade VARCHAR (60),
    
    PRIMARY KEY (id_classe)

);

SELECT * FROM tb_classe;

/*DADOS DA TABELA ID_CLASSE*/

INSERT INTO tb_classe (equipe, habilidade) VALUES ("VINGADORES", "ARQUEIRO");
INSERT INTO tb_classe (equipe, habilidade) VALUES ("VINGADORES", "SUPER FORÇA");
INSERT INTO tb_classe (equipe, habilidade) VALUES ("VINGADORES", "VOAR");
INSERT INTO tb_classe (equipe, habilidade) VALUES ("VINGADORES", "LUTA");
INSERT INTO tb_classe (equipe, habilidade) VALUES ("VINGADORES", "MAGIA");

CREATE TABLE tb_personagem(
	id_personagem BIGINT AUTO_INCREMENT, 
    nome VARCHAR (60) NOT NULL,
    forca INT (255)NOT NULL,
    defesa INT (255)NOT NULL,
    velocidade INT (255)NOT NULL,
    fk_id_classe BIGINT NOT NULL,
    
    PRIMARY KEY (id_personagem),
	FOREIGN KEY (fk_id_classe) REFERENCES tb_classe(id_classe)
    );
	
    /*DADOS DA TABELA TB_PERSONAGEM*/
INSERT INTO tb_personagem (nome, forca, defesa, velocidade, fk_id_classe)
	VALUES ("Clint Barton", 3000, 1500, 100, 1);
INSERT INTO tb_personagem (nome, forca, defesa, velocidade, fk_id_classe)
	VALUES ("HULK", 3000, 1500, 100, 2);
INSERT INTO tb_personagem (nome, forca, defesa, velocidade, fk_id_classe)
	VALUES ("VISÃO", 3000, 1500, 100, 3);
INSERT INTO tb_personagem (nome, forca, defesa, velocidade, fk_id_classe)
	VALUES ("Capitão América", 3000, 1500, 100, 4);
INSERT INTO tb_personagem (nome, forca, defesa, velocidade, fk_id_classe)
	VALUES ("Wanda", 3000, 1500, 100, 5);
INSERT INTO tb_personagem (nome, forca, defesa, velocidade, fk_id_classe)
	VALUES ("Arrow", 3000, 1500, 100, 1 );
    
SELECT * FROM tb_classe;
SELECT * FROM tb_personagem;
    
SELECT * FROM tb_personagem WHERE tb_personagem.forca >=2000;
SELECT * FROM tb_personagem WHERE tb_personagem.defesa >= 1000 and tb_personagem.defesa <= 2000;
    
select * from tb_personagem where nome like "%C%";
    
SELECT * FROM tb_classe
	INNER JOIN tb_personagem on tb_classe.id_classe = tb_personagem.fk_id_classe
		WHERE tb_classe.habilidade LIKE "%ARQUEIRO%";