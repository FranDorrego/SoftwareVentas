package Vistas;

import clasesData.ClienteData;
import clasesData.ProductoData;
import entidades.Rubro;
import javax.swing.table.DefaultTableModel;
import entidades.Cliente;

public class GestorVentas extends javax.swing.JPanel {

    ClienteData clienteData = new ClienteData();
    private final ProductoData productoData = new ProductoData();
    
    private final DefaultTableModel tablaModeloProductos = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public GestorVentas() {
        initComponents();
        tablaModelo();
        cargarComboRubros();
        cargarCLientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_tablaProductos = new javax.swing.JTable();
        CJ_Cliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CB_listaRubros = new javax.swing.JComboBox<>();
        JT_buscarXNombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JB_ModificarCliente = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(820, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cliente : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 730, 70));

        add(CJ_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 258, -1));

        jLabel3.setText("Total");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, 39));

        jLabel4.setText("Total compra");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 316, -1));

        jButton1.setText("Agregar Venta");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 475, 198, 39));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 750, 240));

        jLabel5.setText("ITEMS VENTA");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel6.setText("VENTA");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        CB_listaRubros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_listaRubrosActionPerformed(evt);
            }
        });
        add(CB_listaRubros, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 210, -1));

        JT_buscarXNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JT_buscarXNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JT_buscarXNombreKeyReleased(evt);
            }
        });
        add(JT_buscarXNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 210, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel18.setText("NOMBRE / descripcion:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("rubro");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        JB_ModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        JB_ModificarCliente.setText("Agregar Elemento");
        JB_ModificarCliente.setBorder(null);
        JB_ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ModificarClienteActionPerformed(evt);
            }
        });
        add(JB_ModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 143, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void JT_buscarXNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_buscarXNombreKeyReleased
        // Buscamos por letras y/o rubros:
        borrarFilas();

        if (JT_buscarXNombre.getText().equals("") || JT_buscarXNombre.getText().equals(" ")) {  //String resultado = cadena.trim(); a revisar
            cargaTodosProductos();
            return;
        }
        
        if (CB_listaRubros.getSelectedIndex() != -1) {
            Rubro rubroSeleccionado = (Rubro) CB_listaRubros.getSelectedItem();
            for (entidades.Producto producto : productoData.listarPorRubroYNombre(rubroSeleccionado, JT_buscarXNombre.getText())) {
                agregaProductosTabla(producto);
            }
        } else {
            for (entidades.Producto producto : productoData.listarPorNombre(JT_buscarXNombre.getText())) {
                agregaProductosTabla(producto);
            }
        }
    }//GEN-LAST:event_JT_buscarXNombreKeyReleased

    private void CB_listaRubrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_listaRubrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_listaRubrosActionPerformed

    private void JB_ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ModificarClienteActionPerformed
//        // botón modificar
//        int filaSelecionada = JT_tablaProductos.getSelectedRow();
//
//        if (filaSelecionada != -1) {
//            setVisible(false);
//            Menu menu = Menu.getMenu();
//
//            entidades.Producto productoSeleccionado = productoData.buscarPorID((int) JT_tablaProductos.getValueAt(filaSelecionada, 0));
//            menu.cambioPanel(new ProductoGestion(productoSeleccionado));
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Seleccione un Producto");
//            return;
//        }
    }//GEN-LAST:event_JB_ModificarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Rubro> CB_listaRubros;
    private javax.swing.JComboBox<Cliente> CJ_Cliente;
    private javax.swing.JButton JB_ModificarCliente;
    private javax.swing.JTextField JT_buscarXNombre;
    private javax.swing.JTable JT_tablaProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    public void cargarCLientes() {
        for (entidades.Cliente cliente : clienteData.listarTodo()) {
            CJ_Cliente.addItem(cliente);
        }
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
    
    private void tablaModelo() {

        tablaModeloProductos.addColumn("ID");
        tablaModeloProductos.addColumn("Nombre");
        tablaModeloProductos.addColumn("Descripcion");
        tablaModeloProductos.addColumn("Stock");
        tablaModeloProductos.addColumn("Precio");

        JT_tablaProductos.setModel(tablaModeloProductos);
    }
    
     private void agregaProductosTabla(entidades.Producto producto) {
        tablaModeloProductos.addRow(new Object[]{
            producto.getid_producto(),
            producto.getNombre(),
            producto.getDescripcion(),
            producto.getStock(),
            producto.getPrecio_actual()
        });
    }
     
    private void borrarFilas() {
        // Borra todas las filas de las columnas
        int filas = JT_tablaProductos.getRowCount() - 1;

        for (; filas >= 0; filas--) {
            tablaModeloProductos.removeRow(filas);
        }
    }
    
    private void cargarComboRubros() {
        for (Rubro rubro : productoData.listarRubros()) {
            CB_listaRubros.addItem(rubro);
        }
        CB_listaRubros.setSelectedIndex(-1);
    }
}
