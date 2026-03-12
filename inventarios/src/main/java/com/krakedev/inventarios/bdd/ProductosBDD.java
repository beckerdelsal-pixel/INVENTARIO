package com.krakedev.inventarios.bdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.inventarios.entidades.Categoria;
import com.krakedev.inventarios.entidades.Producto;
import com.krakedev.inventarios.entidades.UnidadDeMedida;
import com.krakedev.inventarios.excepciones.KrakeDevException;
import com.krakedev.inventarios.utils.ConexionBDD;

public class ProductosBDD {
	
	public ArrayList<Producto> buscarProductos(String subcadena) throws KrakeDevException{
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Producto producto = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select prod.codigo_producto, prod.nombre as nombre_producto, "
					+ "udm.nombre as nombre_udm, udm.descripcion as descripcion_udm, "
					+ "cast(prod.precio_venta as decimal(5,4)), "
					+ "prod.tiene_iva, cast(prod.coste_producto as decimal(5,4)), "
					+ "prod.categoria, cat.nombre as nombre_categoria, prod.stock "
					+ "from productos prod, unidades_medida udm, categorias cat "
					+ "where prod.codigo_udm = udm.nombre "
					+ "and prod.categoria = cat.codigo_cat "
					+ "and upper(prod.nombre) like ? ");
			ps.setString(1, "%"+subcadena.toUpperCase()+"%");
			rs = ps.executeQuery();

			while (rs.next()) {
				String codigoProducto = rs.getString("codigo_producto");
				String nombreProducto = rs.getString("nombre_producto");
				String nombreUDM = rs.getString("nombre_udm");
				String descripcionUDM = rs.getString("descripcion_udm");
				BigDecimal precioVenta = new BigDecimal(rs.getString("precio_venta"));
				Boolean tieneIVA = rs.getBoolean("tiene_iva");
				BigDecimal costeProducto = new BigDecimal(rs.getString("coste_producto"));
				Integer categoriaCodigo = rs.getInt("categoria");
				String nombreCategoria = rs.getString("nombre_categoria");
				Integer stock = rs.getInt("stock");
				
				UnidadDeMedida udm = new UnidadDeMedida();
				udm.setNombre(nombreCategoria);
				udm.setDescripcion(descripcionUDM);
				
				Categoria categoria = new Categoria();
				categoria.setCodigo(categoriaCodigo);
				categoria.setNombre(nombreCategoria);
				
				producto = new Producto();
				producto.setCodigo(codigoProducto);
				producto.setNombre(nombreProducto);
				producto.setUnidadMedida(udm);
				producto.setPrecioVenta(precioVenta);
				producto.setTieneIva(tieneIVA);
				producto.setCoste(costeProducto);
				producto.setCategoria(categoria);
				producto.setStock(stock);
				
				
				productos.add(producto);
			}
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al consultar. Detalle: " + e.getMessage());
		}
		return productos;
	}
}
