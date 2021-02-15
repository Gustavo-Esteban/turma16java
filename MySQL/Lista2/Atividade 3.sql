create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria
(
	id bigint auto_increment,
    tipo varchar(255) not null,
    ativo boolean not null,
    primary key (id)
);

create table tb_produto 
(
	id bigint auto_increment,
    nome varchar(255) not null,
    preco float not null,
    qntd int not null,
    categoria_id bigint,
    primary key (id),
    foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_categoria (tipo, ativo) values ('Controlado',1);
insert into tb_categoria (tipo, ativo) values ('Livre',2);
insert into tb_categoria (tipo, ativo) values ('Generico',3);

select * from tb_categoria;

insert into tb_produto (nome, preco, qntd, categoria_id) values ('Amoxicilina',25, 10, 1);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Dorflex',10, 10, 2);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Nimesulida',7, 10, 2);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Rivotril',55, 10, 1);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Dipirona', 3, 10, 3);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Losartana', 5, 10, 3);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Ibuprofeno', 15, 10, 2);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Sufosbuvir', 364000, 10, 2);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like '%C%';

select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id;

select nome, tipo from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id where categoria_id = 1;

