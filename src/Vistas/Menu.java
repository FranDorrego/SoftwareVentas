package Vistas;

import Vistas.Cliente.Cliente;
import Vistas.Cliente.ClienteGestion;
import Vistas.Empleado.Empleado;
import Vistas.Producto.Producto;
import Vistas.Ventas.VentaFecha;
import java.awt.BorderLayout;

public class Menu extends javax.swing.JFrame {

    public static Menu MENU;
    entidades.Cliente clienteLogin = Login.getCliente();

    private Menu() {
        initComponents();
        cambioPanel(new GestorVentas());
        JL_saludoEmpleado.setText(clienteLogin.getNombre());
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
        JB_AcercaDe = new javax.swing.JButton();
        JB_botonSalir = new javax.swing.JButton();
        JL_saludoEmpleado = new javax.swing.JLabel();
        JB_botonInicio = new javax.swing.JButton();
        JB_botonClientes1 = new javax.swing.JButton();
        JB_botonEmpleados1 = new javax.swing.JButton();
        JB_botonVentas1 = new javax.swing.JButton();
        JB_botonProductos1 = new javax.swing.JButton();
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

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bienvenido");
        menu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 90, 30));

        JB_AcercaDe.setBackground(new java.awt.Color(81, 183, 206));
        JB_AcercaDe.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        JB_AcercaDe.setForeground(new java.awt.Color(255, 255, 255));
        JB_AcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486395291-08-sales_80583.png"))); // NOI18N
        JB_AcercaDe.setText("Acerca de...");
        JB_AcercaDe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        JB_AcercaDe.setBorderPainted(false);
        JB_AcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JB_AcercaDe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_AcercaDe.setIconTextGap(14);
        JB_AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AcercaDeActionPerformed(evt);
            }
        });
        menu.add(JB_AcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 260, 42));

        JB_botonSalir.setBackground(new java.awt.Color(81, 183, 206));
        JB_botonSalir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        JB_botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        JB_botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sign-emergency-code-sos_63_icon-icons.com_57219.png"))); // NOI18N
        JB_botonSalir.setText("  SALIR");
        JB_botonSalir.setBorder(null);
        JB_botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JB_botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_botonSalirActionPerformed(evt);
            }
        });
        menu.add(JB_botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 260, 40));

        JL_saludoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        JL_saludoEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        JL_saludoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        JL_saludoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_saludoEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu.add(JL_saludoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, 30));

        JB_botonInicio.setBackground(new java.awt.Color(81, 183, 206));
        JB_botonInicio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        JB_botonInicio.setForeground(new java.awt.Color(255, 255, 255));
        JB_botonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/house_home_13944.png"))); // NOI18N
        JB_botonInicio.setText("GESTOR VENTA");
        JB_botonInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        JB_botonInicio.setBorderPainted(false);
        JB_botonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JB_botonInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_botonInicio.setIconTextGap(14);
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
        JB_botonClientes1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JB_botonClientes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_botonClientes1.setIconTextGap(14);
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
        JB_botonEmpleados1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JB_botonEmpleados1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_botonEmpleados1.setIconTextGap(14);
        JB_botonEmpleados1.setInheritsPopupMenu(true);
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
        JB_botonVentas1.setText("VENTAS REALIZADAS");
        JB_botonVentas1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        JB_botonVentas1.setBorderPainted(false);
        JB_botonVentas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JB_botonVentas1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_botonVentas1.setIconTextGap(14);
        JB_botonVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_botonVentas1ActionPerformed(evt);
            }
        });
        menu.add(JB_botonVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 260, 42));

        JB_botonProductos1.setBackground(new java.awt.Color(81, 183, 206));
        JB_botonProductos1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        JB_botonProductos1.setForeground(new java.awt.Color(255, 255, 255));
        JB_botonProductos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/washing_machine_home_appliances_laundry_icon_229865.png"))); // NOI18N
        JB_botonProductos1.setText("PRODUCTOS");
        JB_botonProductos1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        JB_botonProductos1.setBorderPainted(false);
        JB_botonProductos1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JB_botonProductos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JB_botonProductos1.setIconTextGap(14);
        JB_botonProductos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_botonProductos1ActionPerformed(evt);
            }
        });
        menu.add(JB_botonProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 260, 42));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 570));

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
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void JB_AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AcercaDeActionPerformed
        
        frm_Acercade frame = new frm_Acercade("Acerca de ..." );
        frame.setSize( 750,600);
        frame.setDefaultCloseOperation(HIDE_ON_CLOSE );
        
        frame.setLocationRelativeTo(null);
        frame.setVisible( true );   
    }//GEN-LAST:event_JB_AcercaDeActionPerformed

    private void JB_botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_botonInicioActionPerformed
        //BOTÓN INICIO
//         cambioLabel(INICIO);
         cambioPanel(new GestorVentas());
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

    private void JB_botonProductos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_botonProductos1ActionPerformed
        // TODO add your handling code her
        //BOTÓN PRODUCTOS
        cambioPanel(new Producto());
    }//GEN-LAST:event_JB_botonProductos1ActionPerformed
//____________________________________________________________ 

//____________________________________________________________ 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel INICIO;
    private javax.swing.JButton JB_AcercaDe;
    private javax.swing.JButton JB_botonClientes1;
    private javax.swing.JButton JB_botonEmpleados1;
    private javax.swing.JButton JB_botonInicio;
    private javax.swing.JButton JB_botonProductos1;
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
