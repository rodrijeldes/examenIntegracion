package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class pruebaConexionJunit {
	
	 private static final String JDBC_URL = "jdbc:mysql://localhost:3306/petsmile";
	 private static final String USER = "root";
	 private static final String PASSWORD = "root";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
	    }
}
