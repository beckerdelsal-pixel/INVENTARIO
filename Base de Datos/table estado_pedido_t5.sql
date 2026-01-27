drop table if exists estado_pedido;

CREATE TABLE estado_pedido (
    codigo CHAR(1) PRIMARY KEY,
    descripcion VARCHAR(100) NOT NULL
);

INSERT INTO estado_pedido VALUES
('S','Solicitado'),
('R','Recibido');

select * from estado_pedido;