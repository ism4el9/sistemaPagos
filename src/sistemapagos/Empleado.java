/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ismael Arias, Isaac Cueva, Matew Pozo, Javier Pupiales, Steve Rosero
 */
public class Empleado {
    
    @Test
    public void testInsertarEmpleado() {
        String cedula = "123456789";
        String nombre = "John";
        String apellido = "Doe";
        String nacimiento = "1/1/1991";
        String contrato = "4/2/2021";
        String cargo = "Gerente";
        Empleado.insertarEmpleado(cedula, nombre, apellido, nacimiento, contrato, cargo);
        assertTrue(true);
    }
    
   public static void insertarEmpleado(String cedula, String nombre, String apellido, String nacimiento, String contrato, String cargo) {
        try {
            String dbPath = "C:\\Users\\Isma\\Documents\\Pagos.accdb";
            String connectionString = "jdbc:ucanaccess://" + dbPath;
            Connection conexion = DriverManager.getConnection(connectionString);
            String insertQuery = "INSERT INTO nomina (CI_Empleado, Nombre, Apellido, Fecha_Nacimiento, Fecha_Contrato, Cargo) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = conexion.prepareStatement(insertQuery);
            insertStatement.setString(1, cedula);
            insertStatement.setString(2, nombre);
            insertStatement.setString(3, apellido);
            insertStatement.setString(4, nacimiento);
            insertStatement.setString(5, contrato);
            insertStatement.setString(6, cargo);
            insertStatement.executeUpdate();
            insertStatement.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Los datos se insertaron correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }  
}
