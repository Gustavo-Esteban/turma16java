create database db_servico_rh;

use db_servico_rh;

create table funcionarios(
	id bigint auto_increment,
    nome varchar(255) not null,
    idade int not null,
    registro int not null,
    salario float not null,
    primary key (id)
);

insert into funcionarios (nome,idade,registro,salario) values ('Gustavo',21,123,10000);
insert into funcionarios (nome,idade,registro,salario) values ('Felipe',21,124,5000);
insert into funcionarios (nome,idade,registro,salario) values ('Rui',21,125,1500);
insert into funcionarios (nome,idade,registro,salario) values ('Paola',21,126,1000);
insert into funcionarios (nome,idade,registro,salario) values ('Jean',21,127,15000);

select * from funcionarios where salario > 2000;
select * from funcionarios where salario < 2000;

update funcionarios set nome = 'milton'
where id = 3;

select * from funcionarios;



