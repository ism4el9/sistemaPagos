/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author Ismael Arias, Isaac Cueva, Matew Pozo, Javier Pupiales, Steve Rosero
 */
public class Salario {
    
    public static void insertarVerificacion(String ciEmpleado, String nombreEmpleado, 
            String apellidoEmpleado, BigDecimal montoDescontado) {
        try {
            String dbPath = "C:\\Users\\Isma\\Documents\\Pagos.accdb";
            String connectionString = "jdbc:ucanaccess://" + dbPath;
            Connection conexion = DriverManager.getConnection(connectionString);
            String insertQuery = "INSERT INTO pago (CI_Empleado, Nombre, Apellido, Monto_Pago) VALUES (?, ?, ?, ?)";
            PreparedStatement insertStatement = conexion.prepareStatement(insertQuery);
            insertStatement.setString(1, ciEmpleado);
            insertStatement.setString(2, nombreEmpleado);
            insertStatement.setString(3, apellidoEmpleado);
            insertStatement.setBigDecimal(4, montoDescontado);
            insertStatement.executeUpdate();
            insertStatement.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El pago se registró correctamente", 
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al registrar el pago", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}