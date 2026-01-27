drop table if exists detalle_ventas;

CREATE TABLE detalle_ventas (
    codigo SERIAL PRIMARY KEY,
    cabecera_ventas INT,
    codigo_producto CHAR(4),
    cantidad INT,
    precio_venta NUMERIC(10,2),
    subtotal NUMERIC(10,2),
    subtotal_con_iva NUMERIC(10,2),
    FOREIGN KEY (cabecera_ventas) REFERENCES cabecera_ventas(codigo),
    FOREIGN KEY (codigo_producto) REFERENCES productos(codigo_producto)
);

INSERT INTO detalle_ventas VALUES
(1,1,'P001',5,0.58,2.90,3.25);

select * from detalle_ventas;