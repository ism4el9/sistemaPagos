/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ismael Arias, Isaac Cueva, Matew Pozo, Javier Pupiales, Steve Rosero
 */
public class Usuario {
    
    public boolean autenticarUsuario(String user, String clave) {
        try {
            String dbPath = "C:\\Users\\Isma\\Documents\\Pagos.accdb";
            String connectionString = "jdbc:ucanaccess://" + dbPath;
            Connection conexion = DriverManager.getConnection(connectionString);
            String consulta = "SELECT COUNT(*) AS total FROM usuario WHERE Usuario = ? AND Clave = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, user);
            statement.setString(2, clave);
            ResultSet rs = statement.executeQuery();
            rs.next();
            int total = rs.getInt("total");
            rs.close();
            statement.close();
            conexion.close();
            return total > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
