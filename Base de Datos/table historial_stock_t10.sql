drop table if exists historial_stock;

CREATE TABLE historial_stock (
    codigo SERIAL PRIMARY KEY,
    fecha TIMESTAMP,
    referencia VARCHAR(100),
    codigo_producto CHAR(4),
    cantidad INT,
    FOREIGN KEY (codigo_producto) REFERENCES productos(codigo_producto)
);

INSERT INTO historial_stock VALUES
(1,'2023-11-20 19:59','Pedido','P001',100);

select * from historial_stock;