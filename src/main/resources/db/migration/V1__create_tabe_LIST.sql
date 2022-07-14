drop table if exists LIST;
create table LIST(
    id int not null auto_increment,
    name varchar(50) not null,
    amount int not null,
    type varchar (10) not null
);

insert into LIST (name, amount, type) values ( 'sugar', 3, 'kgs' );
insert into LIST (name, amount, type) values ( 'milk', 1, 'litre' );
insert into LIST (name, amount, type) values ( 'butter', 1, 'pc' );
insert into LIST (name, amount, type) values ( 'wheat roll', 20, 'pcs' );