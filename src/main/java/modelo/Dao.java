package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DB.conexion;

public class Dao {

	public static int validarDatos(String nombreUsuario, String password) {
		Connection con;
		conexion cn = new conexion();
		
		PreparedStatement ps;
		ResultSet re;
		String user ="";
		int valido = 0;
		String sql = "Select * from db.petsmile where nombreUsuario = ? and password = ?";
		try {
			con = cn.getConnection();
			ps =con.prepareStatement(sql);
			ps.setString(1,nombreUsuario);
			ps.setString(2,password);
			re = ps.executeQuery();
			while(re.next()) {
				user = re.getString("nombreUsuario");
			}
			if(user.equals("admin")) {
				valido = 1;
			}
			else {valido = 0;}
		}
		catch (Exception ex){
			return valido;
		}
		return valido;
	}
}
