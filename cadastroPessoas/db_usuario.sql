create database db_sistema_academico;
use db_sistema_academico;

create table tb_usuario (
    id int primary key auto_increment,
    nome varchar(200),
    senha varchar(200)
);
insert into tb_usuario (nome, senha) values ('admin', 'admin');
insert into tb_usuario (nome, senha) values ('Tio Patinhas', 'moedas');

select * from tb_usuario;
