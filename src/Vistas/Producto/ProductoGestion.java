package Vistas.Producto;

import Vistas.Empleado.*;
import Vistas.Cliente.*;
import Vistas.Login;
import Vistas.Menu;
import clasesData.ClienteData;
import clasesData.ProductoData;
import javax.swing.JOptionPane;
import entidades.Cliente;
import entidades.Rubro;

public class ProductoGestion extends javax.swing.JPanel {

    ProductoData productoData = new ProductoData();
    entidades.Producto producto;

    public ProductoGestion() {
        initComponents();
        producto = new entidades.Producto();
        cargarCombo();
    }

    public ProductoGestion(entidades.Producto producto) {
        initComponents();
        this.producto = producto;
        TF_nombreProducto.setText(producto.getNombre());
        TF_Descripcion.setText(producto.getDescripcion());
        TF_PrecioActual.setText(String.valueOf(producto.getPrecio_actual()));
        TF_Stock.setText(String.valueOf(producto.getStock()));
        TF_StockS.setText(String.valueOf(producto.getStock_seguridad()));
        CB_Estado.setSelected(producto.isEstado());
        cargarCombo2(producto.getid_rubro());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TF_Descripcion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TF_PrecioActual = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TF_Stock = new javax.swing.JTextField();
        TF_nombreProducto = new javax.swing.JTextField();
        JB_volver = new javax.swing.JButton();
        JB_guardar = new javax.swing.JButton();
        TF_StockS = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CB_Rubro = new javax.swing.JComboBox<>();
        CB_Estado = new javax.swing.JCheckBox();
        ImagenCostado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(225, 251, 250));
        setMinimumSize(new java.awt.Dimension(820, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Nombre:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Descripción");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 30));

        TF_Descripcion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(TF_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 320, -1));

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Precio actual:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        TF_PrecioActual.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(TF_PrecioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 320, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Stock:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 30));

        TF_Stock.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(TF_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 320, -1));

        TF_nombreProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(TF_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 320, 30));

        JB_volver.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JB_volver.setForeground(new java.awt.Color(102, 102, 102));
        JB_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        JB_volver.setText("     Volver");
        JB_volver.setBorder(null);
        JB_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_volverActionPerformed(evt);
            }
        });
        add(JB_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 143, 48));

        JB_guardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JB_guardar.setForeground(new java.awt.Color(102, 102, 102));
        JB_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        JB_guardar.setText("     Guardar");
        JB_guardar.setBorder(null);
        JB_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_guardarActionPerformed(evt);
            }
        });
        add(JB_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 143, 48));

        TF_StockS.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        add(TF_StockS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 320, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Stock seguridad:");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Estado:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Rubro:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        add(CB_Rubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 320, -1));
        add(CB_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        ImagenCostado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenFondo.jpg"))); // NOI18N
        add(ImagenCostado, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 0, 270, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void JB_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_volverActionPerformed
        // TODO add your handling code here:
        Menu menu = Menu.getMenu();
        menu.cambioPanel(new Vistas.Producto.Producto());
    }//GEN-LAST:event_JB_volverActionPerformed

    private void JB_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_guardarActionPerformed
        //Botón guardar
        Double precioActual;
        int stock;
        int stockS;

        try {
            precioActual = Double.parseDouble(TF_PrecioActual.getText());
            stock = Integer.parseInt(TF_Stock.getText());
            stockS = Integer.parseInt(TF_StockS.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El nombre, precio actual, el stock y el stock de seguridad no pueden ser letras\no no pueden estar vacíos");
            return;
        }

        if (TF_nombreProducto.getText().isEmpty()||!CB_Estado.isSelected()||TF_Descripcion.getText().isEmpty()||TF_PrecioActual.getText().isEmpty()||TF_Stock.getText().isEmpty()||TF_StockS.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios");
            return;
        }
        
        if(stock <= 0 || stockS <= 0 || precioActual <= 0){
            JOptionPane.showMessageDialog(null, "El stock el stock de seguridad y el precio no pueden ser menor a 0");
            return;
        }

        producto.setNombre(TF_nombreProducto.getText());
        producto.setDescripcion(TF_Descripcion.getText());
        producto.setPrecio_actual(precioActual);
        producto.setStock(stock);
        producto.setStock_seguridad(stockS);
        producto.setEstado(CB_Estado.isSelected());
        Rubro idRubro = (Rubro) CB_Rubro.getSelectedItem();
        producto.setid_rubro(idRubro.getid_rubro());
        producto.setid_cliente(Login.getCliente().getID_cliente());
        
        if(producto.getid_producto() == 0){
            productoData.agregarProducto(producto);
        }else{
            productoData.modificarProducto(producto);
        }
        limpiarTF();
    }//GEN-LAST:event_JB_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CB_Estado;
    private javax.swing.JComboBox<Rubro> CB_Rubro;
    private javax.swing.JLabel ImagenCostado;
    private javax.swing.JButton JB_guardar;
    private javax.swing.JButton JB_volver;
    private javax.swing.JTextField TF_Descripcion;
    private javax.swing.JTextField TF_PrecioActual;
    private javax.swing.JTextField TF_Stock;
    private javax.swing.JTextField TF_StockS;
    private javax.swing.JTextField TF_nombreProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void limpiarTF() {
        TF_nombreProducto.setText("");
        TF_Descripcion.setText("");
        TF_PrecioActual.setText("");
        TF_Stock.setText("");
        TF_StockS.setText("");
        CB_Estado.setSelected(true);
        CB_Rubro.setSelectedIndex(-1);
    }

    private void cargarCombo() {
        for (Rubro rubro : productoData.listarRubros()) {
            CB_Rubro.addItem(rubro);
        }
        CB_Rubro.setSelectedIndex(-1);
    }

    private void cargarCombo2(int idrubro) {
        for (Rubro rubro : productoData.listarRubros()) {
            CB_Rubro.addItem(rubro);
            if (rubro.getid_rubro() == idrubro) {
                CB_Rubro.setSelectedItem(rubro);
            }
        }
    }

}
