drop table if exists unidades_medida;

CREATE TABLE unidades_medida (
    codigo_udm CHAR(2) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(100) NOT NULL,
    categoria_udm CHAR(1) NOT NULL,
    FOREIGN KEY (categoria_udm) REFERENCES categorias_unidad_medida(codigo_udm)
);

INSERT INTO unidades_medida VALUES
('ml','ml','mililitros','V'),
('l','l','litros','V'),
('u','u','unidades','U'),
('d','d','docena','U'),
('g','g','gramos','P'),
('kg','kg','kilogramos','P'),
('lb','lb','libras','P');


select * from unidades_medida;