package Vistas;

import Vistas.Cliente.Cliente;
import Vistas.Cliente.ClienteGestion;
import Vistas.Empleado.Empleado;
import Vistas.Producto.Producto;
import Vistas.Ventas.VentaFecha;
import java.awt.BorderLayout;

public class Menu extends javax.swing.JFrame {

    public static Menu MENU;
    
    private Menu() {
        initComponents();
        cambioLabel(INICIO);
    }

    public static Menu getMenu() {
        if (MENU == null) {
            MENU = new Menu();
            MENU.setVisible(false);
        }
        return MENU;
    }
//____________________________________________________________ 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JL_saludoEmpleado = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        INICIO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1060, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(81, 183, 206));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfilNuevo2.png"))); // NOI18N
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 12));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bienvenido");
        menu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 90, 30));

        jButton2.setBackground(new java.awt.Color(81, 183, 206));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("INICIO");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 42));

        jButton3.setBackground(new java.awt.Color(81, 183, 206));
        jButton3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CLIENTE");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 42));

        jButton4.setBackground(new java.awt.Color(81, 183, 206));
        jButton4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("EMPLEADOS");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        menu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 42));

        jButton5.setBackground(new java.awt.Color(81, 183, 206));
        jButton5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("VENTAS");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        menu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 260, 42));

        jButton6.setBackground(new java.awt.Color(81, 183, 206));
        jButton6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("PRODUCTOS");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        menu.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 260, 42));

        jButton1.setBackground(new java.awt.Color(81, 183, 206));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sign-emergency-code-sos_63_icon-icons.com_57219.png"))); // NOI18N
        jButton1.setText("  SALIR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 260, 30));
        menu.add(JL_saludoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, 30));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 530));

        contenedor.setPreferredSize(new java.awt.Dimension(820, 530));

        INICIO.setBackground(new java.awt.Color(0, 255, 255));
        INICIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        INICIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_montañas.jpg"))); // NOI18N
        INICIO.setText("FOTO INICIO");
        INICIO.setPreferredSize(new java.awt.Dimension(820, 530));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 825, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(INICIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 820, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//____________________________________________________________ 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //BOTÓN SALIR
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //BOTÓN INCIO
        cambioLabel(INICIO);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //BOTÓN CLIENTE
        cambioPanel(new Cliente());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //BOTÓN EMPLEADO
        cambioPanel(new Empleado());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //BOTÓN VENTA
        cambioPanel(new VentaFecha());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //BOTÓN PRODUCTOS
        cambioPanel(new Producto());
    }//GEN-LAST:event_jButton6ActionPerformed
//____________________________________________________________ 

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu menu = getMenu();
                menu.setVisible(true);
            }
        });
    }
//____________________________________________________________ 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel INICIO;
    private javax.swing.JLabel JL_saludoEmpleado;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
//____________________________________________________________ 
    public void cambioPanel(javax.swing.JPanel panel) {

        panel.setVisible(true);
        panel.setSize(820, 530);
        panel.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public void cambioLabel(javax.swing.JLabel panel) {

        panel.setSize(820, 530);
        panel.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

}
