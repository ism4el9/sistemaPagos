/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ismael Arias, Isaac Cueva, Matew Pozo, Javier Pupiales, Steve Rosero
 */
public class Conexion {
    
    public void cargarEmpleados(JTable tablaEmpleados) {
        try {
            String dbPath = "C:\\Users\\Isma\\Documents\\Pagos.accdb";
            String connectionString = "jdbc:ucanaccess://" + dbPath;
            Connection conexion = DriverManager.getConnection(connectionString);
            JOptionPane.showMessageDialog(null, "Conexión exitosa con la Nómina", "Conexión", JOptionPane.INFORMATION_MESSAGE);
            Statement estatuto = conexion.createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT * FROM nomina");
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("CI_Empleado");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Fecha_Nacimiento");
            model.addColumn("Fecha_Contrato");
            model.addColumn("Cargo");
            while (rs.next()) {
                Object[] rowData = new Object[6];
                rowData[0] = rs.getString("CI_Empleado");
                rowData[1] = rs.getString("Nombre");
                rowData[2] = rs.getString("Apellido");
                rowData[3] = rs.getString("Fecha_Nacimiento");
                rowData[4] = rs.getString("Fecha_Contrato");
                rowData[5] = rs.getString("Cargo");
                model.addRow(rowData);
            }
            tablaEmpleados.setModel(model);
            rs.close();
            estatuto.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cargarDatosEmpleado(JTable tablaEmpleado) {
        try {
            String dbPath = "C:\\Users\\Isma\\Documents\\Pagos.accdb";
            String connectionString = "jdbc:ucanaccess://" + dbPath;
            Connection conexion = DriverManager.getConnection(connectionString);
            JOptionPane.showMessageDialog(null, "Conexión exitosa con la Nómina", "Conexión", JOptionPane.INFORMATION_MESSAGE);
            Statement estatuto = conexion.createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT * FROM nomina WHERE [CI_Empleado] = ?");
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("CI_Empleado");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Fecha_Nacimiento");
            model.addColumn("Fecha_Contrato");
            model.addColumn("Cargo");
            while (rs.next()) {
                Object[] rowData = new Object[6];
                rowData[0] = rs.getString("CI_Empleado");
                rowData[1] = rs.getString("Nombre");
                rowData[2] = rs.getString("Apellido");
                rowData[3] = rs.getString("Fecha_Nacimiento");
                rowData[4] = rs.getString("Fecha_Contrato");
                rowData[5] = rs.getString("Cargo");
                model.addRow(rowData);
            }
            tablaEmpleado.setModel(model);
            rs.close();
            estatuto.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cargarCedulas(JComboBox <String> comboCedulas) {
        try {
            String dbPath = "C:\\Users\\Isma\\Documents\\Pagos.accdb";
            String connectionString = "jdbc:ucanaccess://" + dbPath;
            Connection conexion = DriverManager.getConnection(connectionString);
            String consulta = "SELECT [CI_Empleado] FROM nomina";
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(consulta);
            comboCedulas.removeAllItems(); // Limpiar el ComboBox
            while (rs.next()) {
                String cedula = rs.getString("CI_Empleado");
                comboCedulas.addItem(cedula);
            }
            rs.close();
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cargarDatosSalario(String cedula, JTable tablaEmpleado) {
        DefaultTableModel model = (DefaultTableModel) tablaEmpleado.getModel();
        model.setRowCount(0); // Limpiar la tabla
        try {
            String dbPath = "C:\\Users\\Isma\\Documents\\Pagos.accdb";
            String connectionString = "jdbc:ucanaccess://" + dbPath;
            Connection conexion = DriverManager.getConnection(connectionString);
            String consulta = "SELECT * FROM nomina WHERE CI_Empleado = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, cedula);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Object[] rowData = new Object[6];
                rowData[0] = rs.getString("CI_Empleado");
                rowData[1] = rs.getString("Nombre");
                rowData[2] = rs.getString("Apellido");
                rowData[3] = rs.getString("Fecha_Nacimiento");
                rowData[4] = rs.getString("Fecha_Contrato");
                rowData[5] = rs.getString("Cargo");
                model.addRow(rowData);
            }
            rs.close();
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cargarVerificacion(JTable tablaVerificacion) {
        try {
            String dbPath = "C:\\Users\\Isma\\Documents\\Pagos.accdb";
            String connectionString = "jdbc:ucanaccess://" + dbPath;
            Connection conexion = DriverManager.getConnection(connectionString);
            JOptionPane.showMessageDialog(null, "Conexión exitosa con la Verificación", "Conexión", JOptionPane.INFORMATION_MESSAGE);
            Statement estatuto = conexion.createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT * FROM pago");
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("CI_Empleado");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Monto_Pago");
            while (rs.next()) {
                Object[] rowData = new Object[4];
                rowData[0] = rs.getString("CI_Empleado");
                rowData[1] = rs.getString("Nombre");
                rowData[2] = rs.getString("Apellido");
                rowData[3] = rs.getString("Monto_Pago");
                model.addRow(rowData);
            }
            tablaVerificacion.setModel(model);
            rs.close();
            estatuto.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
