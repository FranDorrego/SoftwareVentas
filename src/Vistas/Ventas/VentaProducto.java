package Vistas.Ventas;

import Vistas.Menu;
import clasesData.ClienteData;
import clasesData.ProductoData;
import clasesData.VentaData;
import entidades.Cliente;
import entidades.Producto;
import entidades.Venta;
import entidades.VentaPorCliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VentaProducto extends javax.swing.JPanel {

    ClienteData clienteData = new ClienteData();
    ProductoData productoData = new ProductoData();
    VentaData ventaData = new VentaData();

    DefaultTableModel modeloTablaVentas = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    DefaultTableModel modeloTablaClientes = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public VentaProducto() {
        initComponents();
        cargarCombo(CB_Clientes);
        cargarCombo(CB_productos);
    }
//__________________________________________________________

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_productosV = new javax.swing.JButton();
        JB_Fventa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_tablaVentaProducto = new javax.swing.JTable();
        CB_productos = new javax.swing.JComboBox<>();
        CB_Clientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        JB_productosV.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JB_productosV.setForeground(new java.awt.Color(102, 102, 102));
        JB_productosV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486395291-08-sales_80583.png"))); // NOI18N
        JB_productosV.setText("Productos-Venta");
        JB_productosV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_productosVActionPerformed(evt);
            }
        });

        JB_Fventa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JB_Fventa.setForeground(new java.awt.Color(102, 102, 102));
        JB_Fventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/date_May1_calendar_dat_6233.png"))); // NOI18N
        JB_Fventa.setText("Fecha-Venta");
        JB_Fventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_FventaActionPerformed(evt);
            }
        });

        JT_tablaVentaProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JT_tablaVentaProducto);

        CB_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_productosActionPerformed(evt);
            }
        });

        CB_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_ClientesActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clientes por producto");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ventas por cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(JB_productosV, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JB_Fventa, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CB_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(CB_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_productosV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_Fventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents
//__________________________________________________________
    private void JB_productosVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_productosVActionPerformed
        //BOTÓN PRODUCTOS-VETNA
        setVisible(false);
        Menu menu = Menu.getMenu();
        menu.cambioPanel(new VentaFecha());
    }//GEN-LAST:event_JB_productosVActionPerformed

    private void JB_FventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_FventaActionPerformed
        //BOTÓN FECHA-VENTA
        setVisible(false);
        Menu menu = Menu.getMenu();
        menu.cambioPanel(new VentaProducto());
    }//GEN-LAST:event_JB_FventaActionPerformed

    private void CB_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_ClientesActionPerformed
        // AL ACCIONAR COMBO BOX CLIENTES
        tablaModelo(modeloTablaVentas);
        borrarFilas(modeloTablaVentas);
        entidades.Cliente clienteSeleccionado = (Cliente) CB_Clientes.getSelectedItem();
        agregarVentasTabla(ventaData.listarVentasPorCliente(clienteSeleccionado.getID_cliente()));
        //Acá cambié un poco las cosas. Basicamente seguí los mismos pasos que hicieron con listarVentasPorCliente.
        //Cambié el método listarVentasPorCliente porque si no mostraba solo los id del cliente/empleado, y quería mostrar
        //también los nombres. A si que tuve que crear una clase nueva entidad (VentaPorCliente) para poder traer los datos
        //que quería (como hicieron con ventaResumen). Al método listarVentasPorCliente también le cambié el tipo de dato
        //que devuelve para que retorne una lista de "VentaPorCliente". Y el método "agregarVentasTabla" recibe esta última lista
        //por último lo agrego a la tabla. Igualmente si quieren podemos cambiar algo, Dejé esos datos porque me parecían algunos
        //de los fundamentales aunque como puse más abajo siendo que faltarían algunos datos.
        //pd: estos comentarios después los borramos obvio jaja es porque si no me olvido que hice ;)
    }//GEN-LAST:event_CB_ClientesActionPerformed

    private void CB_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_productosActionPerformed
        // AL ACCIONAR COMBO BOX PRODUCTOS
        tablaModelo(modeloTablaClientes);
        borrarFilas(modeloTablaClientes);
        entidades.Producto productoSeleccionado = (Producto) CB_productos.getSelectedItem();
        agregarClientesTabla(ventaData.listarClientePorProducto(productoSeleccionado.getid_producto()));
    }//GEN-LAST:event_CB_productosActionPerformed

//__________________________________________________________
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cliente> CB_Clientes;
    private javax.swing.JComboBox<Producto> CB_productos;
    private javax.swing.JButton JB_Fventa;
    private javax.swing.JButton JB_productosV;
    private javax.swing.JTable JT_tablaVentaProducto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
//__________________________________________________________

    private void cargarCombo(javax.swing.JComboBox comboBox) {

        if (comboBox == CB_Clientes) {
            for (Cliente cliente : clienteData.listarTodo()) {
                CB_Clientes.addItem(cliente);
            }
        } else {
            for (Producto producto : productoData.listarTodos()) {
                CB_productos.addItem(producto);
            }
        }
    }

    private void borrarFilas(DefaultTableModel tablaModelo) {
        // Borra todas las filas de las columnas
        int filas = JT_tablaVentaProducto.getRowCount() - 1;

        for (; filas >= 0; filas--) {
            tablaModelo.removeRow(filas);
        }
    }

    private void tablaModelo(DefaultTableModel tablaModelo) {
        if (tablaModelo == modeloTablaClientes && tablaModelo.getColumnCount() == 0) {
            tablaModelo.addColumn("id");
            tablaModelo.addColumn("Apellido");
            tablaModelo.addColumn("Nombre");
            tablaModelo.addColumn("Domicilio");
            tablaModelo.addColumn("Telefono");
            tablaModelo.addColumn("Numero identif.");
            tablaModelo.addColumn("Estado");
            tablaModelo.addColumn("Es empleado");
        } else if (tablaModelo.getColumnCount() == 0) {
            tablaModelo.addColumn("ID venta");
            tablaModelo.addColumn("ID cliente");    //no sabía bien que debería mostrar, a si que se me ocurrieron esos datos
            tablaModelo.addColumn("Nombre");       //aunque siento que falta info (más sobre detalle venta)
            tablaModelo.addColumn("ID empleado");
            tablaModelo.addColumn("Nombre");
            tablaModelo.addColumn("Fecha");
        }
        JT_tablaVentaProducto.setModel(tablaModelo);
    }

    private void agregarClientesTabla(List<Cliente> listaClientes) {
        for (Cliente listaCliente : listaClientes) {
            
            String estado = "deshabilitado";
            if (listaCliente.isEstado()){
                estado = "Activo";
            }
            
            String empleado = "Si";
            if (listaCliente.isEs_empleado()){
                empleado = "No";
            }
            
            modeloTablaClientes.addRow(new Object[]{
                listaCliente.getID_cliente(),
                listaCliente.getApellido(),
                listaCliente.getNombre(),
                listaCliente.getDomicilio(),
                listaCliente.getTelefono(),
                listaCliente.getNumero_identificacion(),
                estado,
                empleado
            });
        }
    }

    private void agregarVentasTabla(List<VentaPorCliente> listaVentas) { //recibe la nueva clase entidad "VentaPorCliente"
        for (VentaPorCliente listaVenta : listaVentas) {
            modeloTablaVentas.addRow(new Object[]{
                listaVenta.getIdVenta(),
                listaVenta.getIdCliente(),
                listaVenta.getNombreCliente(),
                listaVenta.getIdEmpleado(),
                listaVenta.getNombreEmpleado(),
                listaVenta.getFecha()
            });
        }
    }

}
