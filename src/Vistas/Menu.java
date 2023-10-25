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
        JB_botonProductos = new javax.swing.JButton();
        JB_botonSalir = new javax.swing.JButton();
        JL_saludoEmpleado = new javax.swing.JLabel();
        JB_botonInicio = new javax.swing.JButton();
        JB_botonClientes1 = new javax.swing.JButton();
        JB_botonEmpleados1 = new javax.swing.JButton();
        JB_botonVentas1 = new javax.swing.JButton();
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

        JB_botonProductos.setBackground(new java.awt.Color(81, 183, 206));
        JB_botonProductos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        JB_botonProductos.setForeground(new java.awt.Color(255, 255, 255));
        JB_botonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/washing_machine_home_appliances_laundry_icon_229865.png"))); // NOI18N
        JB_botonProductos.setText("PRODUCTOS");
        JB_botonProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        JB_botonProductos.setBorderPainted(false);
        JB_botonProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_botonProductos.setIconTextGap(10);
        JB_botonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_botonProductosActionPerformed(evt);
            }
        });
        menu.add(JB_botonProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 260, 42));

        JB_botonSalir.setBackground(new java.awt.Color(81, 183, 206));
        JB_botonSalir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        JB_botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        JB_botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBYN/SalirBYN.png"))); // NOI18N
        JB_botonSalir.setText("  SALIR");
        JB_botonSalir.setBorder(null);
        JB_botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_botonSalirActionPerformed(evt);
            }
        });
        menu.add(JB_botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 260, 40));
        menu.add(JL_saludoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, 30));

        JB_botonInicio.setBackground(new java.awt.Color(81, 183, 206));
        JB_botonInicio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        JB_botonInicio.setForeground(new java.awt.Color(255, 255, 255));
        JB_botonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/house_home_13944.png"))); // NOI18N
        JB_botonInicio.setText("INICIO");
        JB_botonInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        JB_botonInicio.setBorderPainted(false);
        JB_botonInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_botonInicio.setIconTextGap(10);
        JB_botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_botonInicioActionPerformed(evt);
            }
        });
        menu.add(JB_botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 42));

        JB_botonClientes1.setBackground(new java.awt.Color(81, 183, 206));
        JB_botonClientes1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        JB_botonClientes1.setForeground(new java.awt.Color(255, 255, 255));
        JB_botonClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maleuser_customer_person_usuari_9884.png"))); // NOI18N
        JB_botonClientes1.setText("CLIENTES");
        JB_botonClientes1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        JB_botonClientes1.setBorderPainted(false);
        JB_botonClientes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_botonClientes1.setIconTextGap(10);
        JB_botonClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_botonClientes1ActionPerformed(evt);
            }
        });
        menu.add(JB_botonClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 42));

        JB_botonEmpleados1.setBackground(new java.awt.Color(81, 183, 206));
        JB_botonEmpleados1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        JB_botonEmpleados1.setForeground(new java.awt.Color(255, 255, 255));
        JB_botonEmpleados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_person_13936.png"))); // NOI18N
        JB_botonEmpleados1.setText("EMPLEADOS");
        JB_botonEmpleados1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        JB_botonEmpleados1.setBorderPainted(false);
        JB_botonEmpleados1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_botonEmpleados1.setIconTextGap(10);
        JB_botonEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_botonEmpleados1ActionPerformed(evt);
            }
        });
        menu.add(JB_botonEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 42));

        JB_botonVentas1.setBackground(new java.awt.Color(81, 183, 206));
        JB_botonVentas1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        JB_botonVentas1.setForeground(new java.awt.Color(255, 255, 255));
        JB_botonVentas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sales_bag_shopping_bargain_retail_icon-icons.com_55340.png"))); // NOI18N
        JB_botonVentas1.setText("VENTAS");
        JB_botonVentas1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        JB_botonVentas1.setBorderPainted(false);
        JB_botonVentas1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_botonVentas1.setIconTextGap(10);
        JB_botonVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_botonVentas1ActionPerformed(evt);
            }
        });
        menu.add(JB_botonVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 260, 42));

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
    private void JB_botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_botonSalirActionPerformed
        //BOTÓN SALIR
        dispose();
        System.exit(0);
    }//GEN-LAST:event_JB_botonSalirActionPerformed

    private void JB_botonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_botonProductosActionPerformed
        //BOTÓN PRODUCTOS
        cambioPanel(new Producto());
    }//GEN-LAST:event_JB_botonProductosActionPerformed

    private void JB_botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_botonInicioActionPerformed
        //BOTÓN INICIO
         cambioLabel(INICIO);
    }//GEN-LAST:event_JB_botonInicioActionPerformed

    private void JB_botonClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_botonClientes1ActionPerformed
       //BOTÓN CLIENTE
        cambioPanel(new Cliente());
    }//GEN-LAST:event_JB_botonClientes1ActionPerformed

    private void JB_botonEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_botonEmpleados1ActionPerformed
        //BOTÓN EMPLEADO
        cambioPanel(new Empleado());
    }//GEN-LAST:event_JB_botonEmpleados1ActionPerformed

    private void JB_botonVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_botonVentas1ActionPerformed
        //BOTÓN VENTA
        cambioPanel(new VentaFecha());
    }//GEN-LAST:event_JB_botonVentas1ActionPerformed
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
    private javax.swing.JButton JB_botonClientes1;
    private javax.swing.JButton JB_botonEmpleados1;
    private javax.swing.JButton JB_botonInicio;
    private javax.swing.JButton JB_botonProductos;
    private javax.swing.JButton JB_botonSalir;
    private javax.swing.JButton JB_botonVentas1;
    private javax.swing.JLabel JL_saludoEmpleado;
    private javax.swing.JPanel contenedor;
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
