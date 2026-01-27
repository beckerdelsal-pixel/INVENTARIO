drop table if exists categorias_unidad_medida;

CREATE TABLE categorias_unidad_medida (
    codigo_udm CHAR(1) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

INSERT INTO categorias_unidad_medida VALUES
('U','Unidades'),
('V','Volumen'),
('P','Peso');

select * from categorias_unidad_medida;

