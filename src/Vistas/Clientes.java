/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import clasesData.ClienteData;
import entidades.Cliente;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franco
 */
public class Clientes extends javax.swing.JInternalFrame {

    BasicInternalFrameUI UI = (BasicInternalFrameUI) getUI();
    private DefaultTableModel tablaModeloClientes = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private ClienteData clienteData = new ClienteData();

    public Clientes() {
        initComponents();
        setLocation(0, 0);
        ocultaBordes();
        tablaModelo();
        cargaTodosClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JL_botonAgregar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JT_buscarXNombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        JL_Buscar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_tablaClientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.cyan);
        setToolTipText("");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setFocusCycleRoot(false);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(790, 545));
        setPreferredSize(new java.awt.Dimension(790, 545));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        JL_botonAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JL_botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        JL_botonAgregar.setText("AGREGAR");
        JL_botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_botonAgregarMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486486316-arrow-film-movie-play-player-start-video_81236.png"))); // NOI18N
        jLabel17.setText("TODOS");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        JT_buscarXNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JT_buscarXNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_buscarXNombreMouseClicked(evt);
            }
        });
        JT_buscarXNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JT_buscarXNombreKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel18.setText("NOMBRE:");

        JL_Buscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JL_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xmag_search_find_export_locate_5984.png"))); // NOI18N
        JL_Buscar.setText("BUSCAR");

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
        JT_tablaClientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JT_tablaClientesFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(JT_tablaClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JL_botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JT_buscarXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JL_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(270, 270, 270))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_buscarXNombre)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        ocultaBordes();
    }//GEN-LAST:event_formMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        ocultaBordes();
    }//GEN-LAST:event_formFocusGained

    private void JL_botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_botonAgregarMouseClicked
        //BOTON PARA MENU DE AGREGAR CLIENTE
        //JP_agregarPanel.setVisible(true);
        //JP_TodosLosClientesPanel.setVisible(false);
    }//GEN-LAST:event_JL_botonAgregarMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here
        //JP_TodosLosClientesPanel.setVisible(true);
        //JP_agregarPanel.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void JT_tablaClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JT_tablaClientesFocusGained
        // TODO add your handling code here:
        ocultaBordes();
    }//GEN-LAST:event_JT_tablaClientesFocusGained

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        ocultaBordes();
    }//GEN-LAST:event_formMouseEntered

    private void JT_buscarXNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_buscarXNombreKeyReleased
        // Buscamos por letra:
        ocultaBordes();
        borrarFilas();
        System.out.println(JT_buscarXNombre.getText());
        if ( JT_buscarXNombre.getText().equals("") || JT_buscarXNombre.getText().equals(" ")){
            cargaTodosClientes();
            return;
        }
        
        for (Cliente cliente : clienteData.buscarPorNombre(JT_buscarXNombre.getText())) {
            if (!cliente.isEs_empleado()){
                agregaClienteTabla(cliente);
            }
        }
        
    }//GEN-LAST:event_JT_buscarXNombreKeyReleased

    private void JT_buscarXNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_buscarXNombreMouseClicked
        // TODO add your handling code here:
        ocultaBordes();
    }//GEN-LAST:event_JT_buscarXNombreMouseClicked

    private void tablaModelo() {

        tablaModeloClientes.addColumn("ID");
        tablaModeloClientes.addColumn("Nombre");
        tablaModeloClientes.addColumn("Apellido");
        tablaModeloClientes.addColumn("Dirrecion");

        JT_tablaClientes.setModel(tablaModeloClientes);
    }

    private void agregaClienteTabla(Cliente cliente) {
        tablaModeloClientes.addRow(new Object[]{
            cliente.getID_cliente(),
            cliente.getNombre(),
            cliente.getApellido(),
            cliente.getDomicilio(),});
    }

    private void cargaTodosClientes() {
        // Cargo todos los modelos si ningun filtro
        borrarFilas();
        for (Cliente cliente : clienteData.listarTodo()) {
            if (!cliente.isEs_empleado()){
                agregaClienteTabla(cliente);
            }
        }
    }
    
    private void borrarFilas(){
        // Borra todas las filas de las columnas
        int filas = JT_tablaClientes.getRowCount()-1;
        
        for (;filas>=0; filas--) {
            tablaModeloClientes.removeRow(filas);
        }
    }

    private void ocultaBordes() {
        UI.setNorthPane(null);
        UI.setEastPane(null);
        UI.setSouthPane(null);
        UI.setWestPane(null);
        setBorder(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Buscar;
    private javax.swing.JLabel JL_botonAgregar;
    private javax.swing.JTextField JT_buscarXNombre;
    private javax.swing.JTable JT_tablaClientes;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
