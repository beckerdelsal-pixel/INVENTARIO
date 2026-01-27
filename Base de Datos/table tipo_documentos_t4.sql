drop table if exists tipo_documentos;

create table tipo_documentos(
	codigo char (1) not null,
	descripcion varchar (100) not null,
	constraint tipo_documentos_pk primary key (codigo)
);

insert into tipo_documentos(codigo,descripcion)
values ('C','Cedula');
insert into tipo_documentos(codigo,descripcion)
values ('R','RUC');

select * from tipo_documentos;