create database 'controle_financeiro';

use database controle_financeiro;

create table 'usuario' (
    'id' int not null auto_increment,
    'login' varchar(100) not null,
    'senha' varchar(100) not null,
    'saldo' float(10) not null,
    primary key ('id')
);

create table 'carteira' (
    'id_carteira' int not null auto_increment,
    'limite_despesa_fixa' float(10) not null,
    'limite_despesa_variavel' float(10) not null,
    'limite_metas' float(10) not null,
    'status' bit not null,
    primary key ('id_carteira')
);

create table 'metas' (
    'id_metas' int not null auto_increment,
    'categoria' varchar(100) not null,
    'status'float(10) not null,
    'data_inicial' date not null,
    'data_final' date not null,
    'descricao' varchar(100) not null,
    'valor_total' float(10) not null,
    'valor_arrecadado' float(10) not null,
    'recorrencia' varchar(100) not null,
    primary key ('id_metas')
);

create table 'despesa_fixa'(
    'id_despesa_fixa' int not null auto_increment,
    'id_despesa' int not null auto_increment,
    'valor_mensal'float(10) not null,
    'categoria' varchar(100) not null,
    'status' bit not null,
    'data_emissao' date not null,
    'data_vencimento' date not null,
    'descricao' varchar(100) not null,
    'recorrencia' varchar(100) not null,
    primary key ('id_despesa_fixa'),
);
create table 'despesa_variavel'(
    'id_despesa_variavel' int not null auto_increment,
    'id_despesa' int not null auto_increment,
    'valor'float(10) not null,
    'qtd_parcelas' int not null,
    'parcelas_pagas' int not null,
    'categoria' varchar(100) not null,
    'status' bit not null,
    'data_emissao' date not null,
    'data_vencimento' date not null,
    'descricao' varchar(100) not null,
    'recorrencia' varchar(100) not null,
    primary key ('id_despesa_variavel')
);