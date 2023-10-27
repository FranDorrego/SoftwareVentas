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
        setTitle("Acerca de ...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        JL_tutorial = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCerrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JL_git = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(750, 580));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Realizado por:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 289, 187, 47));

        jTextPane1.setText("Registrar productos: Los usuarios podrán agregar nuevos productos al inventario proporcionando información como nombre, descripción, precio y cantidad disponible.  \nRealizar ventas: Los usuarios podrán registrar las ventas de productos a los clientes. el cliente que realiza la compra y la fecha de venta.  \nDetalle de Venta: hace referencia a una Venta, Producto, precio y cantidad.\nAdministrar Clientes: Los usuarios podrán agregar, modificar y eliminar información de los clientes, como nombre, apellido, dirección y número de teléfono.   \n\nComportamientos: \n⮚\tListar todos los productos de una venta en una fecha específica. \n⮚\tListar todas las ventas en una fecha. \n⮚\tListar todas las ventas de un Cliente X.\n⮚\tMostrar que clientes compraron el producto X. ");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 717, 224));

        JL_tutorial.setBackground(new java.awt.Color(153, 153, 153));
        JL_tutorial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JL_tutorial.setForeground(new java.awt.Color(51, 51, 255));
        JL_tutorial.setText("Tutorial de uso");
        JL_tutorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JL_tutorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_tutorialMouseClicked(evt);
            }
        });
        getContentPane().add(JL_tutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 140, 47));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Franco Dorrego");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 342, 161, 26));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Cristian Briant Pimentel");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 161, 26));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Walter Funes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 161, 26));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Lucia Giles");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 411, 161, 26));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("SISTEMA DE VENTAS, Noviembre 2023");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 429, 47));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Gestiona Ventas de una empresa con JAva POO y MySQL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 519, 643, 31));

        jCerrar.setText("Cerrar");
        jCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 542, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("para: ULP Red 2 AP - Desarrollo de aplicaciones Java (ARGENTINA PROGRAMA)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 489, 711, 31));

        JL_git.setBackground(new java.awt.Color(153, 153, 153));
        JL_git.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JL_git.setForeground(new java.awt.Color(51, 51, 255));
        JL_git.setText("GitHub (compartido)");
        JL_git.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JL_git.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_gitMouseClicked(evt);
            }
        });
        getContentPane().add(JL_git, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 187, 47));

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
    private javax.swing.JButton jCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
