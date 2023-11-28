package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

Connection con;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petsmile","root","root");
		}
		catch (Exception ex){}
		return con;
	}
}

