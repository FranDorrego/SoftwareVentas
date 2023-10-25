package Vistas.Producto;

import Vistas.Menu;
import clasesData.ProductoData;
import entidades.Rubro;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Producto extends javax.swing.JPanel {

    private final DefaultTableModel tablaModeloProductos = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private final ProductoData productoData = new ProductoData();

    public Producto() {
        initComponents();
        tablaModelo();
        cargaTodosProductos();
        JT_tablaProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cargarCombo();
    }
//_______________________________________________________________

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JT_buscarXNombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_tablaProductos = new javax.swing.JTable();
        JB_ModificarCliente = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CB_listaRubros = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(820, 530));
        setPreferredSize(new java.awt.Dimension(810, 530));

        jPanel1.setBackground(new java.awt.Color(225, 251, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JT_buscarXNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JT_buscarXNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JT_buscarXNombreKeyReleased(evt);
            }
        });
        jPanel1.add(JT_buscarXNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 210, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel18.setText("NOMBRE / descripcion:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, 30));

        JT_tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JT_tablaProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 780, 350));

        JB_ModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        JB_ModificarCliente.setText("     Modificar");
        JB_ModificarCliente.setBorder(null);
        JB_ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ModificarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(JB_ModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 143, 48));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jButton3.setText("     Agregar");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 143, 48));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jButton4.setText("     Eliminar");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 143, 48));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("rubro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jPanel1.add(CB_listaRubros, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, -1));

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
        // Buscamos por letras y/o rubros:
        borrarFilas();

        if (JT_buscarXNombre.getText().equals("") || JT_buscarXNombre.getText().equals(" ")) {
            cargaTodosProductos();
            return;
        }

        Rubro rubroSeleccionado = (Rubro) CB_listaRubros.getSelectedItem();

        if (rubroSeleccionado.getNombre_rubro().equals("Todo")) {
            for (entidades.Producto producto : productoData.listarPorNombre(JT_buscarXNombre.getText())) {
                agregaProductosTabla(producto);
            }
        } else {
            for (entidades.Producto producto : productoData.listarPorRubroYNombre(rubroSeleccionado, JT_buscarXNombre.getText())) {
                agregaProductosTabla(producto);
            }
        }
    }//GEN-LAST:event_JT_buscarXNombreKeyReleased

    private void JB_ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ModificarClienteActionPerformed
        // botón modificar
        int filaSelecionada = JT_tablaProductos.getSelectedRow();

        if (filaSelecionada != -1) {
            setVisible(false);
            Menu menu = Menu.getMenu();

            entidades.Producto productoSeleccionado = productoData.buscarPorID((int) JT_tablaProductos.getValueAt(filaSelecionada, 0));
//            menu.cambioPanel(new ProductoGestion(productoSeleccionado));

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Producto");
            return;
        }
    }//GEN-LAST:event_JB_ModificarClienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu menu = Menu.getMenu();
        menu.cambioPanel(new ProductoGestion());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Eliminamos un producto

        int filaSelecionada = JT_tablaProductos.getSelectedRow();
        int idProducto;
        String NombreProducto;

        if (filaSelecionada != -1) {
            idProducto = (Integer) JT_tablaProductos.getValueAt(filaSelecionada, 0);
            NombreProducto = (String) JT_tablaProductos.getValueAt(filaSelecionada, 1);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Producto");
            return;
        }

        int respuesta = JOptionPane.showConfirmDialog(null, "Estas por eliminar el producto: " + NombreProducto + " . \n ¿Continuamos?", "CUIDADO", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            productoData.eliminarProducto(idProducto);
            cargaTodosProductos();
        }
    }//GEN-LAST:event_jButton4ActionPerformed
//_______________________________________________________________

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Rubro> CB_listaRubros;
    private javax.swing.JButton JB_ModificarCliente;
    private javax.swing.JTextField JT_buscarXNombre;
    private javax.swing.JTable JT_tablaProductos;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
//_______________________________________________________________
    private void tablaModelo() {

        tablaModeloProductos.addColumn("ID");
        tablaModeloProductos.addColumn("Nombre");
        tablaModeloProductos.addColumn("Precio");
        tablaModeloProductos.addColumn("Stock");

        JT_tablaProductos.setModel(tablaModeloProductos);
    }

    private void agregaProductosTabla(entidades.Producto producto) {
        tablaModeloProductos.addRow(new Object[]{
            producto.getid_producto(),
            producto.getNombre(),
            producto.getPrecio_actual(),
            producto.getStock()
        });
    }

    private void cargaTodosProductos() {
        // Cargo todos los modelos si ningun filtro
        borrarFilas();
        for (entidades.Producto producto : productoData.listarTodos()) {
            if (producto.isEstado()) {
                agregaProductosTabla(producto);
            }
        }
    }

    private void borrarFilas() {
        // Borra todas las filas de las columnas
        int filas = JT_tablaProductos.getRowCount() - 1;

        for (; filas >= 0; filas--) {
            tablaModeloProductos.removeRow(filas);
        }
    }

    private void cargarCombo() {
        for (Rubro rubro : productoData.listarRubros()) {
            CB_listaRubros.addItem(rubro);
        }
    }
}
