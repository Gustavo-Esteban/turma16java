create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria 
(
	id bigint auto_increment,
    tipo varchar(255) not null,
    ativo varchar(255) not null,
    primary key (id)
);

create table tb_pizza 
(
	id bigint auto_increment,
    nome varchar(255) not null,
    preco float not null,
    tamanho varchar(255) not null,
    categoria_id bigint,
    primary key(id),
    foreign key (categoria_id) references tb_categoria (id)
    
);

insert into tb_categoria (tipo, ativo) values ('Salgada',true);
insert into tb_categoria (tipo, ativo) values ('Doce',true);
insert into tb_categoria (tipo, ativo) values ('Vegetariana',true);
insert into tb_categoria (tipo, ativo) values ('Borda rechada',true);
insert into tb_categoria (tipo, ativo) values ('Sem borda',true);

select * from tb_categoria;

insert into tb_pizza (nome, preco, tamanho, categoria_id) values ('Frango catupiry',47.50,'Grande',1);
insert into tb_pizza (nome, preco, tamanho, categoria_id) values ('Quatro queijos',40,'Grande',1);
insert into tb_pizza (nome, preco, tamanho, categoria_id) values ('Chocolate com banana',45.50,'Grande',2);
insert into tb_pizza (nome, preco, tamanho, categoria_id) values ('Calabra veggie',46.50,'Grande',3);
insert into tb_pizza (nome, preco, tamanho, categoria_id) values ('Calabresa catupiry',45,'Grande',4);
insert into tb_pizza (nome, preco, tamanho, categoria_id) values ('Bauru',35,'Grande',5);
insert into tb_pizza (nome, preco, tamanho, categoria_id) values ('Portuguesa',25,'Pequena',1);
insert into tb_pizza (nome, preco, tamanho, categoria_id) values ('Baiana',35.50,'Media',1);

select * from tb_pizza;

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco between 29 and 60;

select * from tb_pizza where nome like '%C%';

select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;

Select nome, tipo from tb_categoria inner join tb_pizza on tb_categoria.id = tb_pizza.categoria_id where categoria_id = 2;

