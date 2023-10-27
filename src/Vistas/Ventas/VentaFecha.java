package Vistas.Ventas;

import Entidades.VentaResumen;
import Vistas.Menu;
import clasesData.VentaData;
import entidades.Producto;
import entidades.Venta;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentaFecha extends javax.swing.JPanel {

    VentaData ventaData = new VentaData();
    DefaultTableModel modeloTablaProductos = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    DefaultTableModel modeloTablaVentas = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public VentaFecha() {
        initComponents();
        tablaModelo(modeloTablaProductos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_productosVenta = new javax.swing.JButton();
        JB_fechaVenta = new javax.swing.JButton();
        JR_productos = new javax.swing.JRadioButton();
        JR_ventas = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JB_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_tabla = new javax.swing.JTable();
        JC_FechaInicio = new com.toedter.calendar.JDateChooser();
        JC_FechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        JB_productosVenta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JB_productosVenta.setForeground(new java.awt.Color(102, 102, 102));
        JB_productosVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486395291-08-sales_80583.png"))); // NOI18N
        JB_productosVenta.setText("Productos-Venta");
        JB_productosVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_productosVentaActionPerformed(evt);
            }
        });

        JB_fechaVenta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JB_fechaVenta.setForeground(new java.awt.Color(102, 102, 102));
        JB_fechaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/date_May1_calendar_dat_6233.png"))); // NOI18N
        JB_fechaVenta.setText("Fecha-Venta");
        JB_fechaVenta.setMargin(new java.awt.Insets(0, 0, 0, 0));
        JB_fechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_fechaVentaActionPerformed(evt);
            }
        });

        JR_productos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JR_productos.setForeground(new java.awt.Color(102, 102, 102));
        JR_productos.setSelected(true);
        JR_productos.setText("Productos");
        JR_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_productosActionPerformed(evt);
            }
        });

        JR_ventas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JR_ventas.setForeground(new java.awt.Color(102, 102, 102));
        JR_ventas.setText("Ventas");
        JR_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_ventasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Desde:");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Hasta:");

        JB_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xmag_search_find_export_locate_5984.png"))); // NOI18N
        JB_buscar.setText("  BUSCAR");
        JB_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_buscarActionPerformed(evt);
            }
        });

        JT_tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JT_tabla);

        JC_FechaInicio.setMaxSelectableDate(new java.util.Date(253370779286000L));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Filtrar por:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JR_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JC_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JC_FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JR_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JB_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JB_productosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JB_fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_fechaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_productosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JR_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JR_ventas)
                    .addComponent(JB_buscar)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JC_FechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JC_FechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JR_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_productosActionPerformed
        // Boton Producto
        JR_ventas.setSelected(false);
        tablaModelo(modeloTablaProductos);
    }//GEN-LAST:event_JR_productosActionPerformed

    private void JB_productosVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_productosVentaActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu menu = Menu.getMenu();
        menu.cambioPanel(new VentaFecha());
    }//GEN-LAST:event_JB_productosVentaActionPerformed

    private void JB_fechaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_fechaVentaActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu menu = Menu.getMenu();
        menu.cambioPanel(new VentaProducto());
    }//GEN-LAST:event_JB_fechaVentaActionPerformed

    private void JR_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_ventasActionPerformed
        // Boton Ventas
        JR_productos.setSelected(false);
        tablaModelo(modeloTablaVentas);
    }//GEN-LAST:event_JR_ventasActionPerformed

    private void JB_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_buscarActionPerformed
        // Boton Buscar

        // Comprueba que las fecha de inicio esta llena
        if (JC_FechaInicio.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha de inicio");
            return;
        }

        // y la fecha final no  -> final = Fecha actual
        if (JC_FechaFinal.getDate() == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, 23);    // Establecer la hora a las 23 (11 PM)
            calendar.set(Calendar.MINUTE, 59);         // Establecer los minutos a 59 (11:59 PM)
            Date fechaConHoraActual = calendar.getTime();
            JC_FechaFinal.setDate(fechaConHoraActual);
        }

        // Comprueba que la fehca de final no es mayor la de inicio
        if (JC_FechaInicio.getDate().compareTo(JC_FechaFinal.getDate()) > 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha de inicio anterior a la fecha final");
            return;
        }
        
        
        if (JR_productos.isSelected()) {
            borrarFilas(modeloTablaProductos);
            List listado = ventaData.listarProductosPorFecha(JC_FechaInicio.getDate(), JC_FechaFinal.getDate());
            agregarProductosTabla(listado);
        } else {
            borrarFilas(modeloTablaVentas);
            List listado = ventaData.listarVentasPorFecha(JC_FechaInicio.getDate(), JC_FechaFinal.getDate());
            agregarVentasTabla(listado);
        }
        // Producto -> Busca produto
        // Venta -> Busca venta

        // Muestra en tabla
    }//GEN-LAST:event_JB_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_buscar;
    private javax.swing.JButton JB_fechaVenta;
    private javax.swing.JButton JB_productosVenta;
    private com.toedter.calendar.JDateChooser JC_FechaFinal;
    private com.toedter.calendar.JDateChooser JC_FechaInicio;
    private javax.swing.JRadioButton JR_productos;
    private javax.swing.JRadioButton JR_ventas;
    private javax.swing.JTable JT_tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void tablaModelo(DefaultTableModel tablaModelo) {
        
        // Preguntamos si es una tabla y si esta ya no tiene columnas agregadas
        if (tablaModelo == modeloTablaProductos && tablaModelo.getColumnCount() == 0) {
            tablaModelo.addColumn("ID");
            tablaModelo.addColumn("Nombre");
            tablaModelo.addColumn("Descripción");
            tablaModelo.addColumn("Precio actual");
            tablaModelo.addColumn("Stock");
            tablaModelo.addColumn("Stock seguridad");
            
        } else if ( tablaModelo.getColumnCount() == 0){
            tablaModelo.addColumn("Cantidad");
            tablaModelo.addColumn("Precio Unitario");
            tablaModelo.addColumn("Precio Total");
            tablaModelo.addColumn("Cliente");
            tablaModelo.addColumn("Empleado");
            tablaModelo.addColumn("Fecha");
        }
        
        JT_tabla.setModel(tablaModelo);
    }

    private void agregarProductosTabla(List<Producto> listaProductos) {

        for (Producto listaProducto : listaProductos) {
            modeloTablaProductos.addRow(new Object[]{
                listaProducto.getid_producto(),
                listaProducto.getNombre(),
                listaProducto.getDescripcion(),
                listaProducto.getPrecio_actual(),
                listaProducto.getStock(),
                listaProducto.getStock_seguridad()
            });
        }
    }

    private void agregarVentasTabla(List<VentaResumen> listaVenta) {

        for (VentaResumen listaVentas : listaVenta) {
            modeloTablaVentas.addRow(new Object[]{
                listaVentas.getCantidadProducto(),
                listaVentas.getPrecio(),
                listaVentas.getPrecioTotal(),
                listaVentas.getNombreCliente(),
                listaVentas.getNombreEmpleado(),
                listaVentas.getFecha(),});
        }
    }
    
    private void borrarFilas( DefaultTableModel tablaModelo) {
        // Borra todas las filas de las columnas
        int filas = JT_tabla.getRowCount() - 1;

        for (; filas >= 0; filas--) {
            tablaModelo.removeRow(filas);
        }
    }
    
}
