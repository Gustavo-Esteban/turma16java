create database db_curso_da_minha_vida;

use db_curso_da_minha_vida;

create table tb_categoria
(
	id bigint auto_increment,
    tipo varchar(255) not null,
    ativo boolean not null,
    primary key (id)
);

create table tb_curso 
(
	id bigint auto_increment,
    nome varchar(255) not null,
    preco float not null,
    horas int not null,
    categoria_id bigint,
    primary key (id),
    foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_categoria (tipo, ativo) values ('TI',true);
insert into tb_categoria (tipo, ativo) values ('Saúde',true);
insert into tb_categoria (tipo, ativo) values ('Gestão',true);


select * from tb_categoria;

insert into tb_curso (nome, preco, horas, categoria_id) values ('Front-end',159, 60, 1);
insert into tb_curso (nome, preco, horas, categoria_id) values ('Back-end',159, 60, 1);
insert into tb_curso (nome, preco, horas, categoria_id) values ('Veterinaria',5999, 180, 2);
insert into tb_curso (nome, preco, horas, categoria_id) values ('Medicina',10000, 240, 2);
insert into tb_curso (nome, preco, horas, categoria_id) values ('Administração', 75, 36, 3);
insert into tb_curso (nome, preco, horas, categoria_id) values ('Banco de dados',159, 60, 1);


select * from tb_curso;

select * from tb_curso where preco > 50;

select * from tb_curso where preco between 3 and 60;

select * from tb_curso where nome like '%C%';

select * from tb_categoria inner join tb_curso on tb_categoria.id = tb_curso.categoria_id;

select nome, tipo from tb_categoria inner join tb_curso on tb_categoria.id = tb_curso.categoria_id where categoria_id = 1;