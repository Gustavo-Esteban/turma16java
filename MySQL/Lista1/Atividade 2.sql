create database e_commerce;

use e_commerce;

create table produtos(
	id bigint auto_increment,
    nome varchar(255)not null,
    cor varchar(255)not null,
    qnt int not null,
    preco float not null,
    primary key (id)
);

insert into produtos (nome,cor,qnt,preco) values ('Mouse','Preto',10,300);
insert into produtos (nome,cor,qnt,preco) values ('Teclado','Rosa',10,550);
insert into produtos (nome,cor,qnt,preco) values ('Fone','Quartz',10,750);
insert into produtos (nome,cor,qnt,preco) values ('Notebook','Dourado',10,3000);
insert into produtos (nome,cor,qnt,preco) values ('Celular','Rose',10,1800);
insert into produtos (nome,cor,qnt,preco) values ('PC','Vermelho',10,5500);
insert into produtos (nome,cor,qnt,preco) values ('WebCam','Prata',10,50);
insert into produtos (nome,cor,qnt,preco) values ('Controle','Branco',10,150);

select * from produtos where preco > 500;
select * from produtos where preco < 500;

update produtos set preco = 75
where id = 7;

select * from produtos;