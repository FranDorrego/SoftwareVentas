package Vistas.Ventas;

import Vistas.Menu;
import clasesData.VentaData;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class VentaFecha extends javax.swing.JPanel {
    
    VentaData ventaData = new VentaData();
    
    public VentaFecha() {
        initComponents();
        
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
        jTable1 = new javax.swing.JTable();
        JC_FechaInicio = new com.toedter.calendar.JDateChooser();
        JC_FechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        JB_productosVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486395291-08-sales_80583.png"))); // NOI18N
        JB_productosVenta.setText("PRODUCTOS-VENTA");
        JB_productosVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_productosVentaActionPerformed(evt);
            }
        });

        JB_fechaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/date_May1_calendar_dat_6233.png"))); // NOI18N
        JB_fechaVenta.setText("FECHA-VENTA");
        JB_fechaVenta.setMargin(new java.awt.Insets(0, 0, 0, 0));
        JB_fechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_fechaVentaActionPerformed(evt);
            }
        });

        JR_productos.setSelected(true);
        JR_productos.setText("PRODUCTOS");
        JR_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_productosActionPerformed(evt);
            }
        });

        JR_ventas.setText("VENTAS");
        JR_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR_ventasActionPerformed(evt);
            }
        });

        jLabel1.setText("DESDE:");

        jLabel2.setText("HASTA:");

        JB_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xmag_search_find_export_locate_5984.png"))); // NOI18N
        JB_buscar.setText("  BUSCAR");
        JB_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_buscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("FILTRA POR");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JC_FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JR_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(JB_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JB_productosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JB_productosVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(JB_fechaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JR_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JR_ventas)
                    .addComponent(JB_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JC_FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JC_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JR_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR_productosActionPerformed
        // Boton Producto
        JR_ventas.setSelected(false);
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
    }//GEN-LAST:event_JR_ventasActionPerformed

    private void JB_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_buscarActionPerformed
        // Boton Buscar
        
        // Comprueba que las fecha de inicio esta llena
        if (JC_FechaInicio.getDate() == null){
            JOptionPane.showMessageDialog(null, "Seleccione una fecha de inicio");
            return;
        }
        
        // y la fecha final no  -> final = Fecha actual
        if (JC_FechaFinal.getDate() == null){
            JC_FechaFinal.setDate(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        }
            
        // Comprueba que la fehca de final no es mayor la de inicio
        if (JC_FechaInicio.getDate().compareTo(JC_FechaFinal.getDate()) > 0){
            JOptionPane.showMessageDialog(null, "Seleccione una fecha de inicio anterior a la fecha final");
            return;
        }
        
        if (JR_productos.isSelected()){
            List listado = ventaData.listarProductosPorFecha(JC_FechaInicio.getDate(), JC_FechaFinal.getDate());
        }else{
            List listado = ventaData.listarVentasPorFecha(JC_FechaInicio.getDate(), JC_FechaFinal.getDate());
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
