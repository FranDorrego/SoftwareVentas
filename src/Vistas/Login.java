package Vistas;

import clasesData.ClienteData;
import entidades.Cliente;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.client.Client;

public class Login extends javax.swing.JFrame {

    ClienteData clienteData = new ClienteData();
    static Cliente empleadoLogin; //bueno hasta acá llegué, tendríamos que ver la forma de obtener este cliente en el menú
//____________________________________________________________    

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarCombo();
        empleadoLogin = new Cliente();
    }
    //en las propiedades del jFrame, desactivé "resizeable" para que el usuario no pueda cambiar de tamaño la ventana
    //y activé "locationByPlatform" para que se inice en la posición por defecto del sistema de ventana del sist. operativo (preferiría que se inice en el centro)
//____________________________________________________________ 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        panel_base = new javax.swing.JPanel();
        JL_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JL_iniciarS = new javax.swing.JLabel();
        JL_usuario = new javax.swing.JLabel();
        comboBox_cliente = new javax.swing.JComboBox<>();
        SEP_1 = new javax.swing.JSeparator();
        JL_contrasenia = new javax.swing.JLabel();
        passField_clave = new javax.swing.JPasswordField();
        SEP_2 = new javax.swing.JSeparator();
        jB_entrar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);

        panel_base.setBackground(new java.awt.Color(255, 255, 255));
        panel_base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_base.add(JL_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFinal (3).png"))); // NOI18N
        panel_base.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 100, 90));

        JL_iniciarS.setBackground(new java.awt.Color(0, 0, 0));
        JL_iniciarS.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        JL_iniciarS.setForeground(new java.awt.Color(51, 51, 51));
        JL_iniciarS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_iniciarS.setText("INICIAR SESIÓN");
        panel_base.add(JL_iniciarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 280, 30));

        JL_usuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JL_usuario.setForeground(new java.awt.Color(51, 51, 51));
        JL_usuario.setText("ELIJA UN ID");
        panel_base.add(JL_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 90, -1));

        comboBox_cliente.setBorder(null);
        panel_base.add(comboBox_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 300, -1));

        SEP_1.setForeground(new java.awt.Color(204, 204, 204));
        panel_base.add(SEP_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 300, 10));

        JL_contrasenia.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JL_contrasenia.setForeground(new java.awt.Color(51, 51, 51));
        JL_contrasenia.setText("INGRESE LA CONTRASEÑA");
        panel_base.add(JL_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        passField_clave.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        passField_clave.setForeground(new java.awt.Color(102, 102, 102));
        passField_clave.setBorder(null);
        passField_clave.setCaretColor(new java.awt.Color(225, 251, 250));
        panel_base.add(passField_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 300, -1));

        SEP_2.setForeground(new java.awt.Color(204, 204, 204));
        panel_base.add(SEP_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 300, 10));

        jB_entrar.setBackground(new java.awt.Color(102, 204, 255));
        jB_entrar.setText("ENTRAR");
        jB_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_entrarActionPerformed(evt);
            }
        });
        panel_base.add(jB_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//____________________________________________________________ 
    
    public static Cliente getCliente(){
        return empleadoLogin;
    }

    private void jB_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_entrarActionPerformed
          if (passField_clave.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la contraseña");
            return;
        }

        // Guardo los datos seguro
        String contra = String.valueOf(passField_clave.getPassword());
        Cliente clienteSelecionado = (Cliente) comboBox_cliente.getSelectedItem();

        // Pregunto si los datos son correctos
        try {
            if (clienteData.login(clienteSelecionado.getID_cliente(), contra)) {
                guardarEmpleadoLogin(); //llamo al método para guardar el empleado que se logueó
                this.dispose();
                javax.swing.JFrame menu = Menu.getMenu();
                menu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                passField_clave.setText("");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Seleccione un empleado");
            passField_clave.setText("");
        }
    }//GEN-LAST:event_jB_entrarActionPerformed
//____________________________________________________________ 

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
//____________________________________________________________ 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_contrasenia;
    private javax.swing.JLabel JL_iniciarS;
    private javax.swing.JLabel JL_logo;
    private javax.swing.JLabel JL_usuario;
    private javax.swing.JSeparator SEP_1;
    private javax.swing.JSeparator SEP_2;
    private javax.swing.JComboBox<Cliente> comboBox_cliente;
  
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jB_entrar;
  
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel_base;
    private javax.swing.JPasswordField passField_clave;
    // End of variables declaration//GEN-END:variables
//____________________________________________________________ 

    private void cargarCombo() {
        for (Cliente cliente : clienteData.listarTodo()) {
            comboBox_cliente.setSelectedIndex(-1);
            if (cliente.isEs_empleado() == true && cliente.isEstado() == true) {
                comboBox_cliente.addItem(cliente);  //tengo que cambiar el toString de Cliente
            }
        }
    }
    
    private void guardarEmpleadoLogin(){
       //Para guardar el empleado que se loguea
       Cliente clienteSelecionado = (Cliente) comboBox_cliente.getSelectedItem();
       clienteData.buscarPorID(clienteSelecionado.getID_cliente());
       empleadoLogin.setID_cliente(clienteSelecionado.getID_cliente());
       empleadoLogin.setNombre(clienteSelecionado.getNombre());
       empleadoLogin.setApellido(clienteSelecionado.getApellido());
       empleadoLogin.setDomicilio(clienteSelecionado.getDomicilio());
       empleadoLogin.setTelefono(clienteSelecionado.getTelefono());
       empleadoLogin.setNumero_identificacion(clienteSelecionado.getNumero_identificacion());
       empleadoLogin.setEs_empleado(true);
       empleadoLogin.setClave(clienteSelecionado.getClave());
       empleadoLogin.setEstado(true);
    }
}
