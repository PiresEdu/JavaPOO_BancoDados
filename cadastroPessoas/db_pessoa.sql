create database db_pessoas;
use db_pessoas;

create table tb_pessoa (
    codigo int primary key auto_increment,
    nome varchar(200),
    fone varchar(20),
    email varchar(200)
);

insert into tb_pessoa (nome, fone, email) values ('Joao', '12345678', 'joao@email.com');
insert into tb_pessoa (nome, fone, email) values ('Jose', '11223344', 'jose@email.com');
insert into tb_pessoa (nome, fone, email) values ('Maria', '55667788', 'maria@email.com');

select * from tb_pessoa;

update tb_pessoa set nome = 'José da Silva' where codigo=2;

delete from tb_pessoa where codigo=2;