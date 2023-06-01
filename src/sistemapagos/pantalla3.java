/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemapagos;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael Arias, Isaac Cueva, Matew Pozo, Javier Pupiales, Steve Rosero
 */
public class pantalla3 extends javax.swing.JFrame {

    /**
     * Creates new form pantalla3
     */
    public pantalla3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        labelOrden = new javax.swing.JLabel();
        comboCedulas = new javax.swing.JComboBox<>();
        btnVer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        labelOrden2 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnVerificacion = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(153, 204, 255));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panel2.setBackground(java.awt.SystemColor.activeCaption);

        labelTitulo.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Cálculo del Pago");

        dinero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dinero.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isma\\Documents\\NetBeansProjects\\sistemaPagos\\dinero.png")); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dinero)
                .addGap(23, 23, 23))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(dinero)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(27, 27, 27))
        );

        labelOrden.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labelOrden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOrden.setText("Seleccione la Cédula del Empleado");

        comboCedulas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboCedulasPropertyChange(evt);
            }
        });

        btnVer.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CI Empleado", "Nombre", "Apellido", "Fecha de Nacimiento", "Fecha de Contrato", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEmpleado);
        if (tablaEmpleado.getColumnModel().getColumnCount() > 0) {
            tablaEmpleado.getColumnModel().getColumn(0).setResizable(false);
            tablaEmpleado.getColumnModel().getColumn(1).setResizable(false);
            tablaEmpleado.getColumnModel().getColumn(2).setResizable(false);
            tablaEmpleado.getColumnModel().getColumn(3).setResizable(false);
            tablaEmpleado.getColumnModel().getColumn(4).setResizable(false);
            tablaEmpleado.getColumnModel().getColumn(5).setResizable(false);
        }

        labelOrden2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labelOrden2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOrden2.setText("Ingrese el monto neto");

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnVerificacion.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnVerificacion.setText("Verificación de Pagos");
        btnVerificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificacionActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOrden)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(comboCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVer))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(labelOrden2)
                                .addGap(18, 18, 18)
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnIngresar))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(btnAtras)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerificacion)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrden2)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerificacion)
                    .addComponent(btnAtras))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean empleadoSeleccionado = false;
    
    private void btnVerificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificacionActionPerformed
        // TODO add your handling code here:
        pantalla4 pantalla4 = new pantalla4();
        pantalla4.setVisible(true);
        pantalla4.setLocationRelativeTo(null);
        pantalla4.pack();
        dispose();
    }//GEN-LAST:event_btnVerificacionActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        pantalla2 pantalla2 = new pantalla2();
        pantalla2.setVisible(true);
        pantalla2.setLocationRelativeTo(null);
        pantalla2.pack();
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void comboCedulasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboCedulasPropertyChange
        // TODO add your handling code here:
        Conexion conexion = new Conexion();
        conexion.cargarCedulas(comboCedulas);
    }//GEN-LAST:event_comboCedulasPropertyChange

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        String cedula = (String) comboCedulas.getSelectedItem();
        Conexion conexion = new Conexion();
        conexion.cargarDatosSalario(cedula, tablaEmpleado);
        empleadoSeleccionado = true;
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        if (txtMonto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el monto neto", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!empleadoSeleccionado) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un empleado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            BigDecimal montoNeto = new BigDecimal(txtMonto.getText());
            BigDecimal montoDescontado = Calculadora.calcularTotalPago(montoNeto);
            JOptionPane.showMessageDialog(null, "El pago de este mes es de: " + montoDescontado, "Total", JOptionPane.INFORMATION_MESSAGE);
            tablaEmpleado.setRowSelectionInterval(0, 0);
            int filaSeleccionada = tablaEmpleado.getSelectedRow();
            String ciEmpleado = tablaEmpleado.getValueAt(filaSeleccionada, 0).toString();
            String nombreEmpleado = tablaEmpleado.getValueAt(filaSeleccionada, 1).toString();
            String apellidoEmpleado = tablaEmpleado.getValueAt(filaSeleccionada, 2).toString();
            Salario.insertarVerificacion(ciEmpleado, nombreEmpleado, apellidoEmpleado, montoDescontado);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pantalla3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVerificacion;
    private javax.swing.JComboBox<String> comboCedulas;
    private javax.swing.JLabel dinero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelOrden;
    private javax.swing.JLabel labelOrden2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
