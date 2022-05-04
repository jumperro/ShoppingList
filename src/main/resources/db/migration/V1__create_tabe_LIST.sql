drop table if exists LIST;
create table LIST(
    id int not null auto_increment,
    description varchar(50) not null,
    amount int not null
);