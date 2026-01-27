drop table if exists cabecera_ventas;

CREATE TABLE cabecera_ventas (
    codigo SERIAL PRIMARY KEY,
    fecha TIMESTAMP NOT NULL,
    total_sin_iva NUMERIC(10,2),
    iva NUMERIC(10,2),
    total NUMERIC(10,2)
);

INSERT INTO cabecera_ventas VALUES
(1,'2023-11-20 20:00',3.26,0.39,3.65);

select * from cabecera_ventas;