/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Cliente;

import Vistas.Menu;
import clasesData.ClienteData;
import javax.swing.JOptionPane;
import entidades.Cliente;

/**
 *
 * @author franco
 */
public class ClienteGestion extends javax.swing.JPanel {
    ClienteData clienteData = new ClienteData();
    
    public ClienteGestion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        JT_Apellido = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        JT_domicilio = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        JT_telefono = new javax.swing.JTextField();
        JT_nombre1 = new javax.swing.JTextField();
        JB_menuCliente = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        JT_identificacion_numero = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(820, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 231, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel16.setText("NOMBRE:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 30));

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel19.setText("APELLIDO:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 30));

        JT_Apellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(JT_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 320, -1));

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel20.setText("DOMICILIO:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 30));

        JT_domicilio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(JT_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 320, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setText("TELEFONO:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 30));

        JT_telefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(JT_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 320, -1));

        JT_nombre1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(JT_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 320, 30));

        JB_menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        JB_menuCliente.setText("     Volver");
        JB_menuCliente.setBorder(null);
        JB_menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_menuClienteActionPerformed(evt);
            }
        });
        add(JB_menuCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 143, 48));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jButton5.setText("     Guardar");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 143, 48));

        JT_identificacion_numero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(JT_identificacion_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 320, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel23.setText("Numero de Identificacion:");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void JB_menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_menuClienteActionPerformed
        // TODO add your handling code here:
          Menu menu = Menu.getMenu();
        menu.cambioPanel(new Vistas.Cliente.Cliente());
    }//GEN-LAST:event_JB_menuClienteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        if (JT_identificacion_numero.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El numero de identificacion no puede estar vacio");
            return;
        }
        
        entidades.Cliente cliente = new Cliente();
        cliente.setNombre(JT_nombre1.getText());
        cliente.setApellido(JT_Apellido.getText());
        cliente.setDomicilio(JT_domicilio.getText());
        cliente.setTelefono(JT_telefono.getText());
        cliente.setNumero_identificacion(JT_identificacion_numero.getText());
        cliente.setEs_empleado(false);
        cliente.setEstado(true);
     
        clienteData.agregarCliente(cliente);

    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_menuCliente;
    private javax.swing.JTextField JT_Apellido;
    private javax.swing.JTextField JT_domicilio;
    private javax.swing.JTextField JT_identificacion_numero;
    private javax.swing.JTextField JT_nombre1;
    private javax.swing.JTextField JT_telefono;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    // End of variables declaration//GEN-END:variables
}
