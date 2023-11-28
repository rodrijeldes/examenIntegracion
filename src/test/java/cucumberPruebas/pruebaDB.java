package cucumberPruebas;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import DB.conexion;

import static org.junit.Assert.assertNotNull;

public class pruebaDB {

	private Connection connection;

    @Before
    public void setUp() throws SQLException {
        connection = conexion.getConnection();
    }

    @After
    public void tearDown() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    @Test
    public void testConnection() {
        assertNotNull("La conexión a la base de datos no debe ser nula", connection);
    }

}
