/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VILLORD
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        JP_inicioMouseClicked(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JP_inicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JP_productos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JP_ventas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JP_empleados = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JP_clientes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JP_salir = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        JP_panelInicial = new javax.swing.JPanel();
        JP_Home = new javax.swing.JPanel();
        JD_escritorio = new javax.swing.JLabel();
        JP_panelClientes = new javax.swing.JPanel();
        JP_botonMenu = new javax.swing.JPanel();
        JP_clienteInicio = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        JP_agregarCliente = new javax.swing.JPanel();
        JL_botonAgregar = new javax.swing.JLabel();
        JP_TodosLosClientesPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JL_Buscar = new javax.swing.JLabel();
        JP_JTbuscar = new javax.swing.JPanel();
        JT_buscarXNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_tablaClientes = new javax.swing.JTable();
        JP_agregarPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        JT_Apellido = new javax.swing.JTextField();
        JT_domicilio = new javax.swing.JTextField();
        JT_telefono = new javax.swing.JTextField();
        JT_estado = new javax.swing.JTextField();
        JP_botonEliminar = new javax.swing.JPanel();
        JL_Eliminar = new javax.swing.JLabel();
        JP_botonModificar = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        JP_botonAgregar = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JT_nombre = new javax.swing.JTextField();
        JP_panelEmpleados = new javax.swing.JPanel();
        JP_panelVentas = new javax.swing.JPanel();
        JP_panelProductos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_Menu.setBackground(new java.awt.Color(112, 155, 255));
        JP_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3135715.png"))); // NOI18N
        JP_Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        JP_inicio.setBackground(new java.awt.Color(120, 110, 255));
        JP_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JP_inicioMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INICIO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/house_home_13944.png"))); // NOI18N

        javax.swing.GroupLayout JP_inicioLayout = new javax.swing.GroupLayout(JP_inicio);
        JP_inicio.setLayout(JP_inicioLayout);
        JP_inicioLayout.setHorizontalGroup(
            JP_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_inicioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        JP_inicioLayout.setVerticalGroup(
            JP_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JP_Menu.add(JP_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 201, 270, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        JP_Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 177, 254, 12));

        JP_productos.setBackground(new java.awt.Color(120, 110, 255));
        JP_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JP_productosMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRODUCTOS");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/washing_machine_home_appliances_laundry_icon_229865.png"))); // NOI18N

        javax.swing.GroupLayout JP_productosLayout = new javax.swing.GroupLayout(JP_productos);
        JP_productos.setLayout(JP_productosLayout);
        JP_productosLayout.setHorizontalGroup(
            JP_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_productosLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(63, 63, 63))
        );
        JP_productosLayout.setVerticalGroup(
            JP_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_productosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(10, 10, 10))
            .addGroup(JP_productosLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        JP_Menu.add(JP_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 270, 40));

        JP_ventas.setBackground(new java.awt.Color(120, 110, 255));
        JP_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JP_ventasMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VENTAS");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sales_bag_shopping_bargain_retail_icon-icons.com_55340.png"))); // NOI18N

        javax.swing.GroupLayout JP_ventasLayout = new javax.swing.GroupLayout(JP_ventas);
        JP_ventas.setLayout(JP_ventasLayout);
        JP_ventasLayout.setHorizontalGroup(
            JP_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_ventasLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        JP_ventasLayout.setVerticalGroup(
            JP_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_ventasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        JP_Menu.add(JP_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 270, -1));

        JP_empleados.setBackground(new java.awt.Color(120, 110, 255));
        JP_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JP_empleadosMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EMPLEADOS");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_person_13936.png"))); // NOI18N

        javax.swing.GroupLayout JP_empleadosLayout = new javax.swing.GroupLayout(JP_empleados);
        JP_empleados.setLayout(JP_empleadosLayout);
        JP_empleadosLayout.setHorizontalGroup(
            JP_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_empleadosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        JP_empleadosLayout.setVerticalGroup(
            JP_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_empleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JP_Menu.add(JP_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 40));

        JP_clientes.setBackground(new java.awt.Color(120, 110, 255));
        JP_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JP_clientesMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLIENTES");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maleuser_customer_person_usuari_9884.png"))); // NOI18N

        javax.swing.GroupLayout JP_clientesLayout = new javax.swing.GroupLayout(JP_clientes);
        JP_clientes.setLayout(JP_clientesLayout);
        JP_clientesLayout.setHorizontalGroup(
            JP_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_clientesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        JP_clientesLayout.setVerticalGroup(
            JP_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JP_Menu.add(JP_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 270, 40));

        JP_salir.setBackground(new java.awt.Color(120, 110, 255));
        JP_salir.setForeground(new java.awt.Color(255, 255, 255));
        JP_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JP_salirMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SALIR");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sign-emergency-code-sos_63_icon-icons.com_57219.png"))); // NOI18N

        javax.swing.GroupLayout JP_salirLayout = new javax.swing.GroupLayout(JP_salir);
        JP_salir.setLayout(JP_salirLayout);
        JP_salirLayout.setHorizontalGroup(
            JP_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_salirLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        JP_salirLayout.setVerticalGroup(
            JP_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14)
            .addComponent(jLabel9)
        );

        JP_Menu.add(JP_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 266, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PERFIL");
        JP_Menu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 120, 30));

        getContentPane().add(JP_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        escritorio.setAlignmentX(270.0F);
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escritorio.setDesktopManager(null);

        JP_panelInicial.setBackground(new java.awt.Color(255, 255, 255));
        JP_panelInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_Home.setBackground(new java.awt.Color(204, 204, 255));
        JP_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JD_escritorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Kitchen-Appliances-Transparent (1).png"))); // NOI18N
        JP_Home.add(JD_escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        JP_panelInicial.add(JP_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        JP_panelClientes.setBackground(new java.awt.Color(153, 204, 255));
        JP_panelClientes.setPreferredSize(new java.awt.Dimension(790, 530));
        JP_panelClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_botonMenu.setBackground(new java.awt.Color(153, 153, 153));
        JP_botonMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_clienteInicio.setBackground(new java.awt.Color(204, 204, 204));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486486316-arrow-film-movie-play-player-start-video_81236.png"))); // NOI18N
        jLabel17.setText("TODOS");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JP_clienteInicioLayout = new javax.swing.GroupLayout(JP_clienteInicio);
        JP_clienteInicio.setLayout(JP_clienteInicioLayout);
        JP_clienteInicioLayout.setHorizontalGroup(
            JP_clienteInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_clienteInicioLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JP_clienteInicioLayout.setVerticalGroup(
            JP_clienteInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        JP_botonMenu.add(JP_clienteInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        JP_agregarCliente.setBackground(new java.awt.Color(204, 204, 204));

        JL_botonAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JL_botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        JL_botonAgregar.setText("AGREGAR");
        JL_botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_botonAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JP_agregarClienteLayout = new javax.swing.GroupLayout(JP_agregarCliente);
        JP_agregarCliente.setLayout(JP_agregarClienteLayout);
        JP_agregarClienteLayout.setHorizontalGroup(
            JP_agregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_agregarClienteLayout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(JL_botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JP_agregarClienteLayout.setVerticalGroup(
            JP_agregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JL_botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        JP_botonMenu.add(JP_agregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 160, 40));

        JP_panelClientes.add(JP_botonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        JP_TodosLosClientesPanel.setBackground(new java.awt.Color(153, 204, 255));
        JP_TodosLosClientesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel18.setText("NOMBRE:");
        JP_TodosLosClientesPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        JL_Buscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JL_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xmag_search_find_export_locate_5984.png"))); // NOI18N
        JL_Buscar.setText("BUSCAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JL_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JL_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        JP_TodosLosClientesPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, 40));

        JT_buscarXNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JT_buscarXNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_buscarXNombreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JP_JTbuscarLayout = new javax.swing.GroupLayout(JP_JTbuscar);
        JP_JTbuscar.setLayout(JP_JTbuscarLayout);
        JP_JTbuscarLayout.setHorizontalGroup(
            JP_JTbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JT_buscarXNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JP_JTbuscarLayout.setVerticalGroup(
            JP_JTbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JT_buscarXNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        JP_TodosLosClientesPanel.add(JP_JTbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 200, 30));

        JT_tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JT_tablaClientes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        JP_TodosLosClientesPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 710, 350));

        JP_panelClientes.add(JP_TodosLosClientesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        JP_agregarPanel.setBackground(new java.awt.Color(51, 255, 153));
        JP_agregarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel16.setText("NOMBRE:");
        JP_agregarPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 67, -1, 30));

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel19.setText("APELLIDO:");
        JP_agregarPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel20.setText("DOMICILIO:");
        JP_agregarPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 147, -1, 30));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setText("TELEFONO:");
        JP_agregarPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 187, -1, 30));

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel22.setText("ESTADO:");
        JP_agregarPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 227, -1, 30));

        JT_Apellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JP_agregarPanel.add(JT_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 210, -1));

        JT_domicilio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JP_agregarPanel.add(JT_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, -1));

        JT_telefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JP_agregarPanel.add(JT_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 210, -1));

        JT_estado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JP_agregarPanel.add(JT_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 210, -1));

        JP_botonEliminar.setBackground(new java.awt.Color(204, 204, 204));

        JL_Eliminar.setBackground(new java.awt.Color(204, 204, 204));
        JL_Eliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JL_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/male-user-remove_25351.png"))); // NOI18N
        JL_Eliminar.setText("ELIMINAR");
        JL_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_EliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JP_botonEliminarLayout = new javax.swing.GroupLayout(JP_botonEliminar);
        JP_botonEliminar.setLayout(JP_botonEliminarLayout);
        JP_botonEliminarLayout.setHorizontalGroup(
            JP_botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JL_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        JP_botonEliminarLayout.setVerticalGroup(
            JP_botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JL_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JP_agregarPanel.add(JP_botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 150, 30));

        JP_botonModificar.setBackground(new java.awt.Color(204, 204, 204));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/businessapplication_edit_male_user_thepencil_theclient_negocio_2321_1.png"))); // NOI18N
        jLabel24.setText("MODIFICAR");

        javax.swing.GroupLayout JP_botonModificarLayout = new javax.swing.GroupLayout(JP_botonModificar);
        JP_botonModificar.setLayout(JP_botonModificarLayout);
        JP_botonModificarLayout.setHorizontalGroup(
            JP_botonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_botonModificarLayout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JP_botonModificarLayout.setVerticalGroup(
            JP_botonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JP_agregarPanel.add(JP_botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, 30));

        JP_botonAgregar.setBackground(new java.awt.Color(204, 204, 204));

        jLabel25.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jLabel25.setText("AGREGAR");

        javax.swing.GroupLayout JP_botonAgregarLayout = new javax.swing.GroupLayout(JP_botonAgregar);
        JP_botonAgregar.setLayout(JP_botonAgregarLayout);
        JP_botonAgregarLayout.setHorizontalGroup(
            JP_botonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        JP_botonAgregarLayout.setVerticalGroup(
            JP_botonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_botonAgregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JP_agregarPanel.add(JP_botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 150, 30));

        JT_nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JT_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JT_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        JP_agregarPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 210, 30));

        JP_panelClientes.add(JP_agregarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        JP_panelInicial.add(JP_panelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JP_panelEmpleados.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout JP_panelEmpleadosLayout = new javax.swing.GroupLayout(JP_panelEmpleados);
        JP_panelEmpleados.setLayout(JP_panelEmpleadosLayout);
        JP_panelEmpleadosLayout.setHorizontalGroup(
            JP_panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        JP_panelEmpleadosLayout.setVerticalGroup(
            JP_panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        JP_panelInicial.add(JP_panelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JP_panelVentas.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout JP_panelVentasLayout = new javax.swing.GroupLayout(JP_panelVentas);
        JP_panelVentas.setLayout(JP_panelVentasLayout);
        JP_panelVentasLayout.setHorizontalGroup(
            JP_panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        JP_panelVentasLayout.setVerticalGroup(
            JP_panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        JP_panelInicial.add(JP_panelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JP_panelProductos.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout JP_panelProductosLayout = new javax.swing.GroupLayout(JP_panelProductos);
        JP_panelProductos.setLayout(JP_panelProductosLayout);
        JP_panelProductosLayout.setHorizontalGroup(
            JP_panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        JP_panelProductosLayout.setVerticalGroup(
            JP_panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        JP_panelInicial.add(JP_panelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        escritorio.setLayer(JP_panelInicial, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JP_panelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JP_panelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 790, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JP_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JP_salirMouseClicked

    private void JP_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_inicioMouseClicked
        // VENTANA DE INICIO
        escritorio.removeAll();
        escritorio.repaint();
        
        soloMostrar(JP_Home);
        
        escritorio.add(JP_Home);
        escritorio.moveToFront(JP_Home);
        

    }//GEN-LAST:event_JP_inicioMouseClicked

    private void JP_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_clientesMouseClicked
        // VENTANA DE CLIENTES
        soloMostrar(null);
        escritorio.removeAll();
        escritorio.repaint();
        
        Clientes cliente = new Clientes();
        cliente.setVisible(true);
        
        escritorio.add(cliente);
        escritorio.moveToFront(cliente);
     
       
    }//GEN-LAST:event_JP_clientesMouseClicked

    private void JP_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_empleadosMouseClicked
        // VENTANA DE EMPLEADOS
        soloMostrar(JP_panelEmpleados);
    }//GEN-LAST:event_JP_empleadosMouseClicked

    private void JP_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_ventasMouseClicked
        // VENTANA DE VENTAS
        soloMostrar(JP_panelVentas);
    }//GEN-LAST:event_JP_ventasMouseClicked

    private void JP_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_productosMouseClicked
        // VENTANA DE PRODUCTOS
        soloMostrar(JP_panelProductos);
    }//GEN-LAST:event_JP_productosMouseClicked

    private void JL_botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_botonAgregarMouseClicked
        //BOTON PARA MENU DE AGREGAR CLIENTE
        JP_agregarPanel.setVisible(true);
        JP_TodosLosClientesPanel.setVisible(false);
    }//GEN-LAST:event_JL_botonAgregarMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here
        JP_TodosLosClientesPanel.setVisible(true);
        JP_agregarPanel.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void JL_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_EliminarMouseClicked
        // BOTON ELIMINAR DE CLIENTES
    }//GEN-LAST:event_JL_EliminarMouseClicked

    private void JT_buscarXNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_buscarXNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_buscarXNombreMouseClicked

    // ---------------------------------- Agregados ---------------------------------------
    // Solo muestra un dato
    private void soloMostrar(JPanel panelAMostrar) {

        // Esconde todo los paneles
        JP_panelProductos.setVisible(false);
        JP_Home.setVisible(false);
        JP_panelClientes.setVisible(false);
        JP_panelEmpleados.setVisible(false);
        JP_panelVentas.setVisible(false);

        if (panelAMostrar != null) {
            // Muestra el panel que le pasas
            panelAMostrar.setVisible(true);
        }
        
        // Actualiza la interfaz
        JP_Menu.updateUI();
    }

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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JD_escritorio;
    private javax.swing.JLabel JL_Buscar;
    private javax.swing.JLabel JL_Eliminar;
    private javax.swing.JLabel JL_botonAgregar;
    private javax.swing.JPanel JP_Home;
    private javax.swing.JPanel JP_JTbuscar;
    private javax.swing.JPanel JP_Menu;
    private javax.swing.JPanel JP_TodosLosClientesPanel;
    private javax.swing.JPanel JP_agregarCliente;
    private javax.swing.JPanel JP_agregarPanel;
    private javax.swing.JPanel JP_botonAgregar;
    private javax.swing.JPanel JP_botonEliminar;
    private javax.swing.JPanel JP_botonMenu;
    private javax.swing.JPanel JP_botonModificar;
    private javax.swing.JPanel JP_clienteInicio;
    private javax.swing.JPanel JP_clientes;
    private javax.swing.JPanel JP_empleados;
    private javax.swing.JPanel JP_inicio;
    private javax.swing.JPanel JP_panelClientes;
    private javax.swing.JPanel JP_panelEmpleados;
    private javax.swing.JPanel JP_panelInicial;
    private javax.swing.JPanel JP_panelProductos;
    private javax.swing.JPanel JP_panelVentas;
    private javax.swing.JPanel JP_productos;
    private javax.swing.JPanel JP_salir;
    private javax.swing.JPanel JP_ventas;
    private javax.swing.JTextField JT_Apellido;
    private javax.swing.JTextField JT_buscarXNombre;
    private javax.swing.JTextField JT_domicilio;
    private javax.swing.JTextField JT_estado;
    private javax.swing.JTextField JT_nombre;
    private javax.swing.JTable JT_tablaClientes;
    private javax.swing.JTextField JT_telefono;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
