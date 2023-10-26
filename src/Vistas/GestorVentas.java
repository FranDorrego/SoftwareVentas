package Vistas;

import clasesData.ClienteData;
import clasesData.ProductoData;
import entidades.Rubro;
import javax.swing.table.DefaultTableModel;
import entidades.Cliente;
import javax.swing.JOptionPane;

public class GestorVentas extends javax.swing.JPanel {

    ClienteData clienteData = new ClienteData();
    private final ProductoData productoData = new ProductoData();

    private final DefaultTableModel tablaModeloProductos = new DefaultTableModel() { //para la primer tabla(productos)
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;                                                             //Hay que crear un modelo para cada tabla
        }                                                                            //para luego poder editar cada una individualmente
    };
    private final DefaultTableModel tablaModeloVenta = new DefaultTableModel() { //para la segunda tabla(Los produc. de la venta)
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public GestorVentas() {
        initComponents();
        cargarCLientes();
        tablaModelo(tablaModeloProductos, JT_tablaProductos);  //llamo al mismo método por cada tabla y le paso
        tablaModelo(tablaModeloVenta, JT_tablaVenta);          //su correspondiente modelo
        cargarComboRubros();
        cargaTodosProductos(tablaModeloProductos);//le paso qué tabla quiero que se cargue con todos los productos
    }
//___________________________________________________________

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_tablaProductos = new javax.swing.JTable();
        CJ_Clientes = new javax.swing.JComboBox<>();
        JLabel = new javax.swing.JLabel();
        Jlabel = new javax.swing.JLabel();
        JB_agregarVenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT_tablaVenta = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CB_listaRubros = new javax.swing.JComboBox<>();
        JT_NombDescripProducto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JB_agregarElemento = new javax.swing.JButton();
        JB_quitarElemento = new javax.swing.JButton();
        JL_totalCompra = new javax.swing.JLabel();

        setBackground(new java.awt.Color(225, 251, 250));
        setPreferredSize(new java.awt.Dimension(820, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente : ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 10));

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
        JT_tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JT_tablaProductosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JT_tablaProductos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 770, 120));

        add(CJ_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 300, -1));

        JLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JLabel.setForeground(new java.awt.Color(102, 102, 102));
        JLabel.setText("Total:");
        add(JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 39));

        Jlabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Jlabel.setForeground(new java.awt.Color(102, 102, 102));
        Jlabel.setText("Total compra: $");
        add(Jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 100, -1));

        JB_agregarVenta.setText("Agregar Venta");
        JB_agregarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(JB_agregarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 475, 198, 39));

        JT_tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        JT_tablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JT_tablaVentaMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(JT_tablaVenta);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 770, 200));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Items venta");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel6.setText("VENTA");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        CB_listaRubros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_listaRubrosActionPerformed(evt);
            }
        });
        add(CB_listaRubros, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 260, -1));

        JT_NombDescripProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JT_NombDescripProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JT_NombDescripProductoKeyReleased(evt);
            }
        });
        add(JT_NombDescripProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 300, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Nombre / descripcion:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("rubro:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 50, 20));

        JB_agregarElemento.setText("Agregar Elemento");
        JB_agregarElemento.setBorder(null);
        JB_agregarElemento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_agregarElemento.setPreferredSize(new java.awt.Dimension(121, 32));
        JB_agregarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_agregarElementoActionPerformed(evt);
            }
        });
        add(JB_agregarElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 143, 30));

        JB_quitarElemento.setText("Quitar elemento");
        JB_quitarElemento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_quitarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_quitarElementoActionPerformed(evt);
            }
        });
        add(JB_quitarElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 140, 30));
        add(JL_totalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 230, 20));
    }// </editor-fold>//GEN-END:initComponents
//___________________________________________________________
    private void JT_NombDescripProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_NombDescripProductoKeyReleased
        //BUSCAMOS POR LETRAS Y/O RUBROS
        actualizarTabla1(); 
    }//GEN-LAST:event_JT_NombDescripProductoKeyReleased
        //los pasé a métodos aparte para poder utilizarlos en el codigo
    
    private void CB_listaRubrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_listaRubrosActionPerformed
//        //FILTRAR PRODUCTOS POR RUBRO
        actualizarTabla2();
    }//GEN-LAST:event_CB_listaRubrosActionPerformed

    private void JB_agregarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_agregarElementoActionPerformed
        //BOTÓN AGREGAR ELEMENTO
        if (JT_tablaProductos.getSelectedRow() != -1) {
            //obtengo el id del producto seleccionado de la tabla 
            int idProductoSeleccionado = (int) JT_tablaProductos.getValueAt(JT_tablaProductos.getSelectedRow(), 0);
            //obtengo el producto mediante el id de arriba y lo guardo en una variable producto
            entidades.Producto productoSeleccionado = productoData.buscarPorID(idProductoSeleccionado);
            actualizarStockProducto(productoSeleccionado, 1);
            agregaProductosTabla(tablaModeloVenta, productoSeleccionado);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto de la tabla productos");
        }
    }//GEN-LAST:event_JB_agregarElementoActionPerformed

    private void JB_quitarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_quitarElementoActionPerformed
        //BOTÓN QUITAR ELEMENTO
        if (JT_tablaVenta.getSelectedRow() != -1) {
            int idProductoSeleccionado = (int) JT_tablaVenta.getValueAt(JT_tablaVenta.getSelectedRow(), 0);
            entidades.Producto productoSeleccionado = productoData.buscarPorID(idProductoSeleccionado);
            actualizarStockProducto(productoSeleccionado, 2);
            //obtengo el id del producto seleccionado de la tabla
            tablaModeloVenta.removeRow(JT_tablaVenta.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto de la tabla venta");
        }
    }//GEN-LAST:event_JB_quitarElementoActionPerformed

    private void JT_tablaProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_tablaProductosMouseReleased
        JT_tablaVenta.clearSelection(); //para deseleccionar elementos de la segunda tabla al seleccionar
        //elementos de la primera
    }//GEN-LAST:event_JT_tablaProductosMouseReleased

    private void JT_tablaVentaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_tablaVentaMouseReleased
        JT_tablaProductos.clearSelection(); //para deseleccionar elementos de la primer tabla al seleccionar
        //elementos de la segunda tabla
    }//GEN-LAST:event_JT_tablaVentaMouseReleased

//___________________________________________________________
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Rubro> CB_listaRubros;
    private javax.swing.JComboBox<Cliente> CJ_Clientes;
    private javax.swing.JButton JB_agregarElemento;
    private javax.swing.JButton JB_agregarVenta;
    private javax.swing.JButton JB_quitarElemento;
    private javax.swing.JLabel JL_totalCompra;
    private javax.swing.JLabel JLabel;
    private javax.swing.JTextField JT_NombDescripProducto;
    private javax.swing.JTable JT_tablaProductos;
    private javax.swing.JTable JT_tablaVenta;
    private javax.swing.JLabel Jlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
//___________________________________________________________
    public void cargarCLientes() {
        for (entidades.Cliente cliente : clienteData.listarTodo()) {
            CJ_Clientes.addItem(cliente);
        }
    }

    private void cargarComboRubros() {
        for (Rubro rubro : productoData.listarRubros()) {
            CB_listaRubros.addItem(rubro);
        }
        CB_listaRubros.setSelectedIndex(-1);
    }

    //para editar los nombres de las columnas de una tabla
    private void tablaModelo(DefaultTableModel modeloTabla, javax.swing.JTable tabla) {
        //recibe un modelo de tabla y una tabla para poder usar este método con cualquier tabla
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripcion");
        modeloTabla.addColumn("Stock");
        modeloTabla.addColumn("Precio");

        tabla.setModel(modeloTabla);
    }

    private void borrarFilas() {
        // Borra todas las filas de las columnas
        int filas = JT_tablaProductos.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            tablaModeloProductos.removeRow(filas);
        }
    }

    private void cargaTodosProductos(DefaultTableModel modeloTabla) {//recibe un modelo de tabla para pasárselo al método agregaProductosTabla
        // Cargo todos los modelos si ningun filtro
        borrarFilas();
        for (entidades.Producto producto : productoData.listarTodos()) {
            if (producto.isEstado()) {
                agregaProductosTabla(modeloTabla, producto);
            }
        }
    }

    private void agregaProductosTabla(DefaultTableModel modeloTabla, entidades.Producto producto) {
        modeloTabla.addRow(new Object[]{ //recibe un modelo de tabla para poder usar el método con cualquier tabla
            producto.getid_producto(),
            producto.getNombre(),
            producto.getDescripcion(),
            producto.getStock(),
            producto.getPrecio_actual()
        });
    }

    private void actualizarStockProducto(entidades.Producto productoSeleccionado, int num) {
        //cambio el stock del producto -1 o +1  (funciona en la base de datos xd,falta actualizar la tabla)
        if (num == 1) {
            productoSeleccionado.setStock(productoSeleccionado.getStock() - 1);
        } else {
            productoSeleccionado.setStock(productoSeleccionado.getStock() + 1);
        }
        productoData.modificarProducto(productoSeleccionado);
        //actualizar la tabla
        if (!JT_NombDescripProducto.getText().trim().isEmpty()) {
            actualizarTabla1();
        } else if (CB_listaRubros.getSelectedIndex() != -1) {
            actualizarTabla2();
        } else {
            cargaTodosProductos(tablaModeloProductos);
        }
    }

    //actualiza la tabla de productos cuando agregamos un productos a la tabla venta
    private void actualizarTabla1() {
        //BUSCAMOS POR LETRAS Y/O RUBROS
        borrarFilas();
        //.trim para eliminar los espacios por delante y final del texto
        if (JT_NombDescripProducto.getText().trim().isEmpty()) { //si en el textField no hay nada, que muestre todos los productos
            cargaTodosProductos(tablaModeloProductos);
            return;
        }

        if (CB_listaRubros.getSelectedIndex() != -1) { //si hay rubro seleccionado
            Rubro rubroSeleccionado = (Rubro) CB_listaRubros.getSelectedItem(); //listamos x nombre/descripcion y rubro
            for (entidades.Producto producto : productoData.listarPorRubroYNombre(rubroSeleccionado, JT_NombDescripProducto.getText().trim())) {
                agregaProductosTabla(tablaModeloProductos, producto);
            }
        } else { //si no, solo por nombre/descripcion
            for (entidades.Producto producto : productoData.listarPorNombre(JT_NombDescripProducto.getText().trim())) {
                agregaProductosTabla(tablaModeloProductos, producto);
            }
        }
    }

    private void actualizarTabla2() {
        //FILTRAR PRODUCTOS POR RUBRO
        borrarFilas();
        Rubro rubroSeleccionado = (Rubro) CB_listaRubros.getSelectedItem();

        try {
            if (JT_NombDescripProducto.getText().trim().isEmpty()) { //si selecciono un rubro y no hay nada escrito en el tf, lista solo x rubros
                for (entidades.Producto producto : productoData.listarPorRubro(rubroSeleccionado)) { // por alguna razon esta linea tira error y ruve que encerralo en try catch                              
                    agregaProductosTabla(tablaModeloProductos, producto);
                }
            } else { //si elijo un rubro y ya hay algo escrico en el tf
                for (entidades.Producto producto : productoData.listarPorRubroYNombre(rubroSeleccionado, JT_NombDescripProducto.getText().trim())) {
                    agregaProductosTabla(tablaModeloProductos, producto);
                }
            }
        } catch (NullPointerException e) {
        }
    }

}
