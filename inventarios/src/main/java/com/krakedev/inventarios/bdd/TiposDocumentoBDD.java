package com.krakedev.inventarios.bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.inventarios.entidades.TiposDocumento;
import com.krakedev.inventarios.excepciones.KrakeDevException;
import com.krakedev.inventarios.utils.ConexionBDD;

public class TiposDocumentoBDD {
	
	public ArrayList<TiposDocumento> recuperar() throws KrakeDevException {
		ArrayList<TiposDocumento> documentos = new ArrayList<TiposDocumento>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		TiposDocumento documento = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select codigo, descripcion from tipo_documentos");
			rs = ps.executeQuery();

			while (rs.next()) {
				String codigo = rs.getString("codigo");
				String descripcion = rs.getString("descripcion");
				
				documento = new TiposDocumento(codigo, descripcion);
				documentos.add(documento);
			}
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al consultar. Detalle: " + e.getMessage());
		}
		return documentos;
	}
}
