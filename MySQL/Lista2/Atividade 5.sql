create database db_construindo_nossa_vida;

use db_construindo_nossa_vida;

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

insert into tb_categoria (tipo, ativo) values ('Acabamento',1);
insert into tb_categoria (tipo, ativo) values ('Contrução',2);

select * from tb_categoria;

insert into tb_produto (nome, preco, qntd, categoria_id) values ('Cimento',50, 10, 2);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Tijolo',5, 10, 2);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Piso',7, 10, 1);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Rejunte',50, 10, 2);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Telha ondulada', 85, 10, 2);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Torneira',354, 10, 1);
insert into tb_produto (nome, preco, qntd, categoria_id) values ('Piso laminado', 57, 10, 1);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like '%C%';

select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id;

select nome, tipo from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id where categoria_id = 2;