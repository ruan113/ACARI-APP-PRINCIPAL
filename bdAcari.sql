create table empresas(id serial primary key, 
nome varchar(40),
cnpj varchar(18));

create table Associados(
id serial primary key, 
nome varchar(50) not NULL,
cpf varchar(15),
rg varchar(13),
cidade varchar(30),
end_num smallint,
end_rua varchar(60),
end_bairro varchar(50),
uf varchar(2) not NULL,
complemento varchar(50));

create table tipos_despesas(id_tipo serial primary key, 
titulo_tipo varchar(30));

create table despesas(id_despesa serial primary key,
titulo varchar(60),
id_tipo int,
valor int, 
foreign key (id_tipo) references tipos_despesas(id_tipo));

create table materiais(id_material serial primary key,
material_nome varchar(30),
tipo_material varchar(20));

create table vendas(id_venda bigserial primary key,
id_empresa int,
nota_fiscal boolean);

create table itens_vendidos(id_material int,
id_venda bigint, 
quantidadeKG float, 
precoKG float, 
precoTotal float,
foreign key (id_material) references materiais(id_material),
foreign key (id_venda) references vendas(id_venda), 
primary key (id_material,id_venda));

create table compras(id_compra bigserial primary key, 
id_associado int);

create table itens_comprados(id_material int, 
id_compra bigint,
quantidadeKG float, 
precoKG float, 
preco_total float, 
foreign key (id_material) references materiais(id_material),
foreign key (id_compra) references compras(id_compra), 
primary key (id_material,id_compra));

create table estoque(id_material int primary key,
quantidade_totalKG float,
foreign key (id_material) references materiais(id_material));

-----------------------------------Codigos-teste-----------------------------------

DROP TABLE Associados;

INSERT INTO Associados (nome,cpf,rg,cidade,end_num,end_rua,end_bairro,uf,complemento)
VALUES
('Nome1', 'Cpf1', 'Rg1', 'Cidade1', 1, 'Rua1', 'Bairro1', 'MG', 'complemento1'),
('Nome2', 'Cpf2', 'Rg2', 'Cidade2', 2, 'Rua2', 'Bairro2', 'MG', 'complemento2');

select * from associados;

DELETE FROM associados where id = 1;


