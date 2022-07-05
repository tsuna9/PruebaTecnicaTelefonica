CREATE DATABASE crud_clientes;
USE crud_clientes;

CREATE TABLE clientes
(IDcliente int primary key,
nombre varchar(30) not null,
apellido varchar(30) not null);

CREATE TABLE datos
(IDdatos int primary key,
id_cliente int not null,
direccion varchar(255) not null,
documento varchar(255) not null,
identificacion int not null,
CONSTRAINT fk_clientes FOREIGN KEY (id_cliente) REFERENCES clientes (IDcliente));


create table Log
(IDlog int primary key,
Función varchar(40),
cambio varchar(255),
fecha date);


create user 'adminDB'@'127.0.0.1' identified by '1234';

grant all privileges on * . * to 'adminDB'@'127.0.0.1';
flush privileges;