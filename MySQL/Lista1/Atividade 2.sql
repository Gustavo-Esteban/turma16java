create database ecommerce;

use ecommerce;

create table produtos(
	id bigint auto_increment,
    nome varchar(255)not null,
    descricao varchar(255)not null,
    qnt int not null,
    preco float not null,
    primary key (id)
);

insert into produtos (nome,descricao,qnt,preco) values ('X-Burguer','Pão-Carne-Queijo',10,10.00);
insert into produtos (nome,descricao,qnt,preco) values ('X-Salada','Pão-Carne-Queijo-Salada',10,11.00);
insert into produtos (nome,descricao,qnt,preco) values ('X-Bacon','Pão-Carne-Queijo-Bacon',10,12.00);
insert into produtos (nome,descricao,qnt,preco) values ('X-Bacon Egg','Pão-Carne-Queijo-Bacon-Ovo',10,13.00);
insert into produtos (nome,descricao,qnt,preco) values ('X-Egg','Pão-Ovo-Queijo',10,8.00);
insert into produtos (nome,descricao,qnt,preco) values ('X-Frango','Pão-Frango-Queijo',10,10.00);
insert into produtos (nome,descricao,qnt,preco) values ('X-Frango Egg','Pão-Frango-Queijo-Ovo',10,11.00);
insert into produtos (nome,descricao,qnt,preco) values ('X-Tudo','Pão-Carne-Queijo-Bacon-Ovo-Frango-Salada',10,15.00);
delete from produtos where id = 1;

select * from produtos where preco > 12.00;
select * from produtos where preco < 12.00;

update produtos set preco = 9.00
where id = 6;

select * from produtos;	