package clasesData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String BD = "ventas";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {

        if (connection == null) {
            try {
                //Carga el driver
                Class.forName("org.mariadb.jdbc.Driver");
                
                //Crea la conexion
                connection = DriverManager.getConnection(URL + BD, USUARIO, PASSWORD);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Error al conectarse");
                System.exit(0);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Error al cargar los drivers");
                System.exit(0);
            }
        }

        return connection;

    }
}
