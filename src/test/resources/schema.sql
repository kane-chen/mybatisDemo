create schema IF NOT EXISTS demo;

-- drop table demo.code if exists;

create table code(
	id IDENTITY NOT NULL primary key, 
	code varchar(50),
	sp_id integer,
	pasword varchar(50),
	remark CLOB
);

