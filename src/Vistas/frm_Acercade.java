package Vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.net.URI;

public class frm_Acercade extends javax.swing.JFrame {

    String repo = "https://github.com/FranDorrego/SoftwareVentas";
    String video = "https://youtu.be/YLjUu714H_c";

    public frm_Acercade(String acerca_de_) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        setSize(736, 600);
        
        setTitle("Acerca de ...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        JL_tutorial = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCerrar = new javax.swing.JButton();
        JL_git = new javax.swing.JLabel();
        JP_fondo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SOFTWARE DE VENTAS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Realizado por:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 289, 187, 47));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane1.setText("Registrar productos: Los usuarios podrán agregar nuevos productos al inventario proporcionando información como nombre, descripción, precio y cantidad disponible.  \nRealizar ventas: Los usuarios podrán registrar las ventas de productos a los clientes. el cliente que realiza la compra y la fecha de venta.  \nDetalle de Venta: hace referencia a una Venta, Producto, precio y cantidad.\nAdministrar Clientes: Los usuarios podrán agregar, modificar y eliminar información de los clientes, como nombre, apellido, dirección y número de teléfono.   \n\nComportamientos: \n⮚\tListar todos los productos de una venta en una fecha específica. \n⮚\tListar todas las ventas en una fecha. \n⮚\tListar todas las ventas de un Cliente X.\n⮚\tMostrar que clientes compraron el producto X. ");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 717, 224));

        JL_tutorial.setBackground(new java.awt.Color(153, 153, 153));
        JL_tutorial.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        JL_tutorial.setForeground(new java.awt.Color(0, 0, 0));
        JL_tutorial.setText("TUTORIAL DE USO");
        JL_tutorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JL_tutorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_tutorialMouseClicked(evt);
            }
        });
        getContentPane().add(JL_tutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Franco Dorrego");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 161, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cristian Briant Pimentel");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 170, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Walter Funes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 161, 26));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Lucia Giles");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 161, 26));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("LINKS DE ACCESO A:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jCerrar.setText("Cerrar");
        jCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCerrar.setOpaque(false);
        jCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 542, 130, -1));

        JL_git.setBackground(new java.awt.Color(153, 153, 153));
        JL_git.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        JL_git.setForeground(new java.awt.Color(0, 0, 0));
        JL_git.setText("GitHub (compartido)");
        JL_git.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JL_git.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_gitMouseClicked(evt);
            }
        });
        getContentPane().add(JL_git, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 220, 30));

        JP_fondo.setBackground(new java.awt.Color(51, 153, 255));
        JP_fondo.setForeground(new java.awt.Color(51, 153, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Para: ULP Red 2 AP - Desarrollo de aplicaciones Java (ARGENTINA PROGRAMA)");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Gestiona Ventas de una empresa con JAva POO y MySQL");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/argPrograma.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mate_tea_herbal_argentina_calabash_gourd_yerba_icon_251294.png"))); // NOI18N

        javax.swing.GroupLayout JP_fondoLayout = new javax.swing.GroupLayout(JP_fondo);
        JP_fondo.setLayout(JP_fondoLayout);
        JP_fondoLayout.setHorizontalGroup(
            JP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_fondoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_fondoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        JP_fondoLayout.setVerticalGroup(
            JP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_fondoLayout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addGroup(JP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JP_fondoLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(JP_fondoLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        getContentPane().add(JP_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JL_tutorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_tutorialMouseClicked
        abreLinks(video);
    }//GEN-LAST:event_JL_tutorialMouseClicked

    private void jCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCerrarActionPerformed
        /*System.exit(0);*/
        dispose();
    }//GEN-LAST:event_jCerrarActionPerformed

    private void JL_gitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_gitMouseClicked
        // TODO add your handling code here:
        abreLinks(repo);
    }//GEN-LAST:event_JL_gitMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Acercade("Acerca de ...").setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_git;
    private javax.swing.JLabel JL_tutorial;
    private javax.swing.JPanel JP_fondo;
    private javax.swing.JButton jCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    public void abreLinks(String link) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI(link));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
