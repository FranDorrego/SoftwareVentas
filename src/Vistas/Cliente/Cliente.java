package Vistas.Cliente;

import Vistas.Menu;
import clasesData.ClienteData;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Cliente extends javax.swing.JPanel {

    private final DefaultTableModel tablaModeloClientes = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    private final ClienteData clienteData = new ClienteData();

    public Cliente() {
        initComponents();
        tablaModelo();
        cargaTodosClientes();
        JT_tablaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
//_______________________________________________________________
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JT_buscarXNombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_tablaClientes = new javax.swing.JTable();
        JB_ModificarCliente = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(820, 530));
        setPreferredSize(new java.awt.Dimension(810, 530));

        jPanel1.setBackground(new java.awt.Color(225, 251, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JT_buscarXNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JT_buscarXNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_buscarXNombreActionPerformed(evt);
            }
        });
        JT_buscarXNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JT_buscarXNombreKeyReleased(evt);
            }
        });
        jPanel1.add(JT_buscarXNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 210, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Nombre:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 70, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 780, 390));

        JB_ModificarCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JB_ModificarCliente.setForeground(new java.awt.Color(102, 102, 102));
        JB_ModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        JB_ModificarCliente.setText("     Modificar");
        JB_ModificarCliente.setBorder(null);
        JB_ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ModificarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(JB_ModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 143, 48));

        jButton3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jButton3.setText("     Agregar");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 143, 48));

        jButton4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jButton4.setText("     Eliminar");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 143, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JT_buscarXNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_buscarXNombreKeyReleased
        // Buscamos por letra:
        borrarFilas();
        if (JT_buscarXNombre.getText().equals("") || JT_buscarXNombre.getText().equals(" ")) {
            cargaTodosClientes();
            return;
        }

        for (entidades.Cliente cliente : clienteData.buscarPorNombre(JT_buscarXNombre.getText())) {
            if (!cliente.isEs_empleado()) {
                agregaClienteTabla(cliente);
            }
        }
    }//GEN-LAST:event_JT_buscarXNombreKeyReleased

    private void JB_ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ModificarClienteActionPerformed
        // botón modificar
        int filaSelecionada = JT_tablaClientes.getSelectedRow();

        if (filaSelecionada != -1) {
            setVisible(false);
            Menu menu = Menu.getMenu();

            entidades.Cliente clienteSeleccionado = clienteData.buscarPorID((int) (JT_tablaClientes.getValueAt(filaSelecionada, 0)));
            menu.cambioPanel(new ClienteGestion(clienteSeleccionado));

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Cliente");
            return;
        }
    }//GEN-LAST:event_JB_ModificarClienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu menu = Menu.getMenu();
        menu.cambioPanel(new ClienteGestion());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Eliminamos un cliente

        int filaSelecionada = JT_tablaClientes.getSelectedRow();
        int idCliente;
        String Nombre;

        if (filaSelecionada != -1) {
            idCliente = (Integer) JT_tablaClientes.getValueAt(filaSelecionada, 0);
            Nombre = (String) JT_tablaClientes.getValueAt(filaSelecionada, 1) + " " + (String) JT_tablaClientes.getValueAt(filaSelecionada, 2);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Cliente");
            return;
        }

        int respuesta = JOptionPane.showConfirmDialog(null, "Estas por eliminar el cliente: " + Nombre + " . \n ¿Continuamos?", "CUIDADO", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            clienteData.eliminarPorID(idCliente);
            cargaTodosClientes();
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void JT_buscarXNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_buscarXNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_buscarXNombreActionPerformed
//_______________________________________________________________

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_ModificarCliente;
    private javax.swing.JTextField JT_buscarXNombre;
    private javax.swing.JTable JT_tablaClientes;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
//_______________________________________________________________
    private void tablaModelo() {

        tablaModeloClientes.addColumn("ID");
        tablaModeloClientes.addColumn("Nombre");
        tablaModeloClientes.addColumn("Apellido");
        tablaModeloClientes.addColumn("Domicilio");

        JT_tablaClientes.setModel(tablaModeloClientes);
    }

    private void agregaClienteTabla(entidades.Cliente cliente) {
        tablaModeloClientes.addRow(new Object[]{
            cliente.getID_cliente(),
            cliente.getNombre(),
            cliente.getApellido(),
            cliente.getDomicilio(),});
    }

    private void cargaTodosClientes() {
        // Cargo todos los modelos si ningun filtro
        borrarFilas();
        for (entidades.Cliente cliente : clienteData.listarTodo()) {
            if (!cliente.isEs_empleado()) {
                agregaClienteTabla(cliente);
            }
        }
    }

    private void borrarFilas() {
        // Borra todas las filas de las columnas
        int filas = JT_tablaClientes.getRowCount() - 1;

        for (; filas >= 0; filas--) {
            tablaModeloClientes.removeRow(filas);
        }
    }

}
