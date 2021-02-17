create table Pedido(
    id bigint primary key auto_increment,
    code varchar(40),
    total decimal(10,2),
    description text
)