CREATE DATABASE db_pizzaria_legal;
use db_pizzaria_legal;

/*CRIANDO A TABELA TB_CATEGORIA*/
CREATE TABLE tb_categoria (
	id_categoria BIGINT AUTO_INCREMENT PRIMARY KEY,
    pizza_sabor VARCHAR (60)NOT NULL,
    pizza_borda VARCHAR(255) NOT NULL,
    pizza_quantidade INT (255)NOT NULL

);

/*POPULANDO A TABELA TB_CATEGORIA*/
INSERT INTO tb_categoria (pizza_sabor, pizza_borda, pizza_quantidade) VALUE ("GOURMET", "SIM", 100);
INSERT INTO tb_categoria (pizza_sabor, pizza_borda, pizza_quantidade) VALUE ("NORMAL", "SIM", 100);
INSERT INTO tb_categoria (pizza_sabor, pizza_borda, pizza_quantidade) VALUE ("DOCE","SIM" , 100);
SELECT * FROM tb_categoria;

/*CRIANDO TABELA PIZZA*/
CREATE TABLE tb_pizza(
	id_pizza BIGINT AUTO_INCREMENT PRIMARY KEY,
    p_sabor VARCHAR (60) NOT NULL,
    p_preco INT (255) NOT NULL,
    p_azeitona BOOLEAN,
    p_tamanho VARCHAR (60) NOT NULL,
    fk_id_categoria BIGINT,
    
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)

);

/*POPULANDO A TABELA TB_PIZZA*/
INSERT INTO tb_pizza(p_sabor, p_preco, p_azeitona, p_tamanho, fk_id_categoria)
	VALUES ("AGLIO PORRO SPECIALI", 90, true, "GRANDE", 1);
INSERT INTO tb_pizza(p_sabor, p_preco, p_azeitona, p_tamanho, fk_id_categoria)
	VALUES ("BUFALA SPECIALI ", 90, true, "GRANDE", 1);
INSERT INTO tb_pizza(p_sabor, p_preco, p_azeitona, p_tamanho, fk_id_categoria)
	VALUES ("GRAÇA DI NAPOLLI ", 100, true, "GRANDE", 1);
INSERT INTO tb_pizza(p_sabor, p_preco, p_azeitona, p_tamanho, fk_id_categoria)
	VALUES ("MARGHERITA", 80, true, "GRANDE", 2);
INSERT INTO tb_pizza(p_sabor, p_preco, p_azeitona, p_tamanho, fk_id_categoria)
	VALUES ("CATUPIRY", 55, true, "GRANDE", 2);
INSERT INTO tb_pizza(p_sabor, p_preco, p_azeitona, p_tamanho, fk_id_categoria)
	VALUES ("CALABRESA COM QUEIJO", 50, true, "GRANDE", 1);
INSERT INTO tb_pizza(p_sabor, p_preco, p_azeitona, p_tamanho, fk_id_categoria)
	VALUES ("CHOCOLATE COM MORANGO", 90, true, "GRANDE", 3);
INSERT INTO tb_pizza(p_sabor, p_preco, p_azeitona, p_tamanho, fk_id_categoria)
	VALUES ("BRIGADEIRO COM BEIJINHO", 90, true, "GRANDE", 3);
INSERT INTO tb_pizza(p_sabor, p_preco, p_azeitona, p_tamanho, fk_id_categoria)
	VALUES ("CHOCOLATE COM ABACAXI", 90, true, "GRANDE", 3);

SELECT * FROM tb_pizza;

SELECT * FROM tb_pizza WHERE tb_pizza.preco >= 45;
SELECT * FROM tb_pizza WHERE tb_pizza.preco >= 29 and tb_personagem.defesa <= 60;

select * from tb_personagem where nome like "%C%";

select * from tb_categoria
	inner join tb_pizza on tb_pizza.fk_id_categoria = tb_categoria.id_categoria;
    
SELECT * FROM tb_pizza
	INNER JOIN tb_categoria on tb_categoria.id_categoria = tb_pizza.fk_id_categoria
		WHERE tb_categoria.pizza_sabor LIKE "%DOCE%";