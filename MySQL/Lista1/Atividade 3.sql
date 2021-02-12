create database registro_escola;

use registro_escola;

create table alunos(
	id bigint auto_increment,
    nome varchar(255) not null,
    idade int not null,
    nota float not null,
    serie varchar(255) not null,
    primary key (id)
);

insert into alunos (nome,idade,nota,serie) values ('Esteban',21,10,'Terceiro Ano EM');
insert into alunos (nome,idade,nota,serie) values ('Paola',21,9,'Terceiro Ano EM');
insert into alunos (nome,idade,nota,serie) values ('Felipe',21,8,'Terceiro Ano EM');
insert into alunos (nome,idade,nota,serie) values ('Rui',21,7,'Terceiro Ano EM');
insert into alunos (nome,idade,nota,serie) values ('Milton',21,6,'Terceiro Ano EM');
insert into alunos (nome,idade,nota,serie) values ('Jean',21,5,'Terceiro Ano EM');
insert into alunos (nome,idade,nota,serie) values ('Denilson',21,4,'Terceiro Ano EM');
insert into alunos (nome,idade,nota,serie) values ('Scaziti',21,3,'Terceiro Ano EM');

select * from alunos where nota > 7;
select * from alunos where nota < 7;

update alunos set nota = 8 
where id = 4;

select * from alunos;