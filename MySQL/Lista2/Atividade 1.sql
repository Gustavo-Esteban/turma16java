create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe
(
	id bigint auto_increment,
	tipo varchar(255) not null,
    ativo boolean not null,
    primary key (id)
);

create table tb_personagem
(
	id bigint auto_increment,
    nome varchar(255) not null,
    função varchar(255) not null,
    skin boolean not null,
    poder int not null,
    classe_id bigint,
    primary key (id),
    foreign key (classe_id) references 	tb_classe (id)
);

insert into tb_classe (tipo, ativo) values ('Top', true);
insert into tb_classe (tipo, ativo) values ('Jungle', true);
insert into tb_classe (tipo, ativo) values ('Mid', true);
insert into tb_classe (tipo, ativo) values ('Adc', true);
insert into tb_classe (tipo, ativo) values ('Sup', true);

select * from tb_classe;

insert into tb_personagem (nome, função, skin, poder, classe_id) values ('Viego', 'Assassino', false, 5000, 2);
insert into tb_personagem (nome, função, skin, poder, classe_id) values ('Lee Sin', 'Lutador', true, 3000, 2);
insert into tb_personagem (nome, função, skin, poder, classe_id) values ('Riven', 'Duelista', true, 4000, 1);
insert into tb_personagem (nome, função, skin, poder, classe_id) values ('Syndra', 'Mago', false, 1500, 3);
insert into tb_personagem (nome, função, skin, poder, classe_id) values ('Yasuo', 'Assassino', true, 10000, 3);
insert into tb_personagem (nome, função, skin, poder, classe_id) values ('Caitlyn', 'Atirador', false, 1000, 4);
insert into tb_personagem (nome, função, skin, poder, classe_id) values ('Braum', 'Protetor', true, 500, 5);
insert into tb_personagem (nome, função, skin, poder, classe_id) values ('Draven', 'Atirador', true, 5000, 4);

select * from tb_personagem;

select * from tb_personagem where poder > 2000;

select * from tb_personagem where poder between 1000 and 2000;

select * from tb_personagem where nome like '%C%';

select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id;

select nome, tipo from tb_classe inner join tb_personagem on tb_classe.id = tb_personagem.classe_id where classe_id = 4;








