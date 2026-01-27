drop table if exists productos;

CREATE TABLE productos (
    codigo_producto CHAR(4) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    codigo_udm CHAR(2) NOT NULL,
    precio_venta NUMERIC(10,2) NOT NULL,
    tiene_iva BOOLEAN NOT NULL,
    coste_producto NUMERIC(10,2) NOT NULL,
    categoria INT NOT NULL,
    stock INT NOT NULL,
    FOREIGN KEY (codigo_udm) REFERENCES unidades_medida(codigo_udm),
    FOREIGN KEY (categoria) REFERENCES categorias(codigo_cat)
);

INSERT INTO productos VALUES
('P001','Cola cola pequeña','u',0.58,true,0.37,7,110),
('P002','Salsa de tomate','kg',0.94,true,0.87,3,0),
('P003','Mostaza','kg',0.95,true,0.89,3,0);

select * from productos;