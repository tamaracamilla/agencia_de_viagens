create database agencia_de_viagens
default character set utf8
default collate utf8_general_ci;


use agencia_de_viagens;

create table usuario(
id_usuario varchar (30) not null,
nome varchar(30) not null,
senha varchar(11) not null,
login varchar(30) not null,
primary key (id_usuario)) default charset = utf8;

create table passageiro(
id_passageiro varchar (30) not null,
id_usuario varchar(30) not null,
cpf varchar(11) not null,
nome varchar(30) not null,
telefone1 varchar(20) not null,
telefone2 varchar(20) null,
email varchar(30) null,
cep varchar(8) null,
bairro varchar(20) null,
numero varchar(5) not null,
logradouro varchar(30) not null,
primary key(id_passageiro),
foreign key(id_usuario) references usuario (id_usuario));

create table pacote(
id_pacote varchar(30) not null,
id_passageiro varchar(30) not null,
data_viagem DATE not null,
data_hora TIME not null,
destino varchar(20) null,
origem varchar(30) null,
primary key(id_pacote),
foreign key(id_passageiro) references passageiro (id_passageiro));


create table reserva(
id_reserva varchar(30) not null,
id_pacote varchar(30) not null,
id_passageiro varchar(30) not null,
nome varchar(30) not null,
telefone1 varchar(11) not null,
destino varchar(20) null,
origem varchar(30) null,
primary key(id_reserva),
foreign key(id_passageiro) references passageiro (id_passageiro),
foreign key(id_pacote) references pacote (id_pacote));


select * from Usuario;
drop table reserva;
drop table pacote;
drop table passageiro;
drop table usuario;


delete from reserva;
delete from pacote;
delete from passageiro;
delete from usuario



