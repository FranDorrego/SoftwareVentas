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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        JL_tutorial = new javax.swing.JLabel();
        jCerrar = new javax.swing.JButton();
        JL_git = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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
        jLabel7.setText("SOFTWARE DE VENTAS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 190, 30));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Registrar productos: Los usuarios podrán agregar nuevos productos al inventario proporcionando información como nombre, descripción, precio y cantidad disponible.  \nRealizar ventas: Los usuarios podrán registrar las ventas de productos a los clientes. el cliente que realiza la compra y la fecha de venta.  \nDetalle de Venta: hace referencia a una Venta, Producto, precio y cantidad.\nAdministrar Clientes: Los usuarios podrán agregar, modificar y eliminar información de los clientes, como nombre, apellido, dirección y número de teléfono.   \n\nComportamientos: \n⮚\tListar todos los productos de una venta en una fecha específica. \n⮚\tListar todas las ventas en una fecha. \n⮚\tListar todas las ventas de un Cliente X.\n⮚\tMostrar que clientes compraron el producto X. ");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 850, 160));

        JL_tutorial.setBackground(new java.awt.Color(153, 153, 153));
        JL_tutorial.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        JL_tutorial.setForeground(new java.awt.Color(51, 51, 255));
        JL_tutorial.setText("TUTORIAL DE USO");
        JL_tutorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JL_tutorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_tutorialMouseClicked(evt);
            }
        });
        getContentPane().add(JL_tutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 280, 50));

        jCerrar.setText("Cerrar");
        jCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 130, -1));

        JL_git.setBackground(new java.awt.Color(153, 153, 153));
        JL_git.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        JL_git.setForeground(new java.awt.Color(51, 51, 255));
        JL_git.setText("GitHub (compartido)");
        JL_git.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JL_git.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_gitMouseClicked(evt);
            }
        });
        getContentPane().add(JL_git, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 300, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo ap.jpeg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setMaximumSize(new java.awt.Dimension(866, 522));
        jLabel12.setMinimumSize(new java.awt.Dimension(866, 522));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 750));

        JP_fondo.setBackground(new java.awt.Color(51, 153, 255));
        JP_fondo.setForeground(new java.awt.Color(51, 153, 255));
        JP_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Para: ULP Red 2 AP - Desarrollo de aplicaciones Java (ARGENTINA PROGRAMA)");
        JP_fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 457, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Gestiona Ventas de una empresa con JAva POO y MySQL");
        JP_fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 509, 399, 31));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/argPrograma.png"))); // NOI18N
        JP_fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mate_tea_herbal_argentina_calabash_gourd_yerba_icon_251294.png"))); // NOI18N
        JP_fondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 508, 40, -1));

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
