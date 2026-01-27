drop table if exists proveedores;

CREATE TABLE proveedores (
    identificador VARCHAR(15) PRIMARY KEY,
    tipo_documento CHAR(1) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    correo VARCHAR(100),
    direccion VARCHAR(100),
    FOREIGN KEY (tipo_documento) REFERENCES tipo_documentos(codigo)
);

INSERT INTO proveedores VALUES
('0941088304','C','Becker Del Salto','0984662390','beckerdelsalto@gmail.com','Pascuales'),
('0941088304001','R','Julian Leon','0995108519','delsaltoleonb@gmail.com','Guamote');

select * from proveedores;