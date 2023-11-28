package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;  // Agrega esta importación
import java.sql.SQLException;


public class conex {
    Connection cn;

    public Connection conectarBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/LoginOptimusTransport", "root", "");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexión fallida: " + e.getMessage());
        }
        return cn;
    }

    public void registrarUsuario(String nombreUsuario, String password) {
        try {
            String query = "INSERT INTO Usuarios (usuario, password) VALUES (?, ?)";
            PreparedStatement statement = cn.prepareStatement(query);
            statement.setString(1, nombreUsuario);
            statement.setString(2, password);
            statement.executeUpdate();
            System.out.println("Usuario registrado exitosamente");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }
    }
    public void registrarRutas(String ruta, String fecha, String nos) {
        try {
            String query = "INSERT INTO Rutas (ruta, fecha, novedad) VALUES (?, ?, ?)";
            PreparedStatement statement = cn.prepareStatement(query);
            statement.setString(1, ruta);
            statement.setString(2, fecha);
            statement.setString(3, nos);
//            statement.setString(3, novedad);
            statement.executeUpdate();
            System.out.println("Ruta registrado exitosamente");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al registrar Ruta: " + e.getMessage());
        }
    }
    
}