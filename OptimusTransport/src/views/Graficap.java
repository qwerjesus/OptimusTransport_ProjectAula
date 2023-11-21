package views;

import conexion.conex;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
public class Graficap extends javax.swing.JFrame {
    conex con = new conex();
    Connection cn = (Connection) con.conectarBD();
    
    int xMouse,yMouse;
    
    public Graficap() {
        initComponents();
        this.setLocationRelativeTo(null);
       this.OCULTAR.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        Contraseña = new javax.swing.JLabel();
        Usua = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        IniciarSeicion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        Invitado = new javax.swing.JButton();
        OCULTAR = new javax.swing.JLabel();
        VER = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicioSesion = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Interfaz"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setBackground(new java.awt.Color(255, 255, 255));
        Usuario.setFont(new java.awt.Font("Roboto Light", 2, 12)); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 180, 20));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaMousePressed(evt);
            }
        });
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, -1));

        Contraseña.setBackground(new java.awt.Color(255, 51, 51));
        Contraseña.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("Contraseña");
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 30));

        Usua.setBackground(new java.awt.Color(255, 255, 255));
        Usua.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Usua.setForeground(new java.awt.Color(255, 255, 255));
        Usua.setText("Usuario:");
        jPanel1.add(Usua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 20));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Black Carrot", 3, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-10-29 141202.png"))); // NOI18N
        Titulo.setText("Optimus");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 240, 260));

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Roboto Black", 3, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 91, 0));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 90, 30));

        IniciarSeicion.setBackground(new java.awt.Color(255, 255, 255));
        IniciarSeicion.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        IniciarSeicion.setForeground(new java.awt.Color(255, 75, 0));
        IniciarSeicion.setText("Iniciar");
        IniciarSeicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IniciarSeicionMouseExited(evt);
            }
        });
        IniciarSeicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSeicionActionPerformed(evt);
            }
        });
        jPanel1.add(IniciarSeicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("o");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 20, 20));

        Registrar.setBackground(new java.awt.Color(255, 255, 255));
        Registrar.setFont(new java.awt.Font("Roboto Black", 2, 12)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 51, 0));
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, 30));

        Invitado.setBackground(new java.awt.Color(255, 255, 255));
        Invitado.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        Invitado.setForeground(new java.awt.Color(255, 51, 0));
        Invitado.setText("Invitado");
        Invitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvitadoActionPerformed(evt);
            }
        });
        jPanel1.add(Invitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, 30));

        OCULTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar_32px.png"))); // NOI18N
        OCULTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OCULTARMousePressed(evt);
            }
        });
        jPanel1.add(OCULTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, 40));

        VER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver_32px.png"))); // NOI18N
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VERMousePressed(evt);
            }
        });
        jPanel1.add(VER, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("/");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 30, 20));

        inicioSesion.setBackground(new java.awt.Color(255, 136, 0));
        inicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fotoram.io.jpg"))); // NOI18N
        inicioSesion.setText("jLabel1");
        jPanel1.add(inicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio_1.jpg"))); // NOI18N
        Inicio.setText("jLabel1");
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 490, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 690, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
    
    }//GEN-LAST:event_UsuarioActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
     
    }//GEN-LAST:event_contraseñaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void IniciarSeicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSeicionActionPerformed
         
            // Obtener el nombre de usuario y la contraseña ingresados
        String nombreUsuario = Usuario.getText();
        String password = new String(contraseña.getPassword()); // Obtener la contraseña como un String seguro
    
        String usu=Usuario.getText();
        String contra=contraseña.getText();
        
        if (usu.contentEquals("admin") && contra.contentEquals("admin")) {
            TablaAdmin veradmin = new TablaAdmin();
            veradmin.setVisible(true);
            this.dispose();
        }
//        

        else if (verificarUsuario(nombreUsuario, password)) {

        if (verificarUsuario(nombreUsuario, password)) {

            // Si los datos son correctos, abrir la nueva ventana
            MenuDeInicio menu = new MenuDeInicio();
            menu.setVisible(true);
            this.dispose(); // Cerrar la ventana actual
        } else {
            // Si los datos son incorrectos, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_IniciarSeicionActionPerformed
// Método para verificar los datos del usuario en la base de datos
// Método para verificar los datos del usuario en la base de datos

    private boolean verificarUsuario(String nombreUsuario, String password) {
        try {
            String query = "SELECT * FROM Usuarios WHERE usuario = ? AND password = ?";
            PreparedStatement statement = cn.prepareStatement(query);
            statement.setString(1, nombreUsuario);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();

            // Si hay algún resultado, los datos son correctos
            return result.next();
        } catch (SQLException e) {
            // Manejar la excepción, por ejemplo, mostrar un mensaje de error
            e.printStackTrace();
            return false;
        }
    }
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse=evt.getY();
       
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
        this.setLocation(x -xMouse,y -yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void IniciarSeicionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSeicionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_IniciarSeicionMouseExited

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
       RegistroDeusuarios registro = new RegistroDeusuarios();
       registro.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_RegistrarActionPerformed

    private void InvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvitadoActionPerformed
      Mapa_de_invitado mapa = new Mapa_de_invitado();
      mapa.setVisible(true);
      this.dispose();
      
    }//GEN-LAST:event_InvitadoActionPerformed

    private void VERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERMousePressed
         VER.setVisible(false);
        OCULTAR.setVisible(true);
        contraseña.setEchoChar((char)0);
    }//GEN-LAST:event_VERMousePressed

    private void contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMousePressed
    
    }//GEN-LAST:event_contraseñaMousePressed

    private void OCULTARMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCULTARMousePressed
      VER.setVisible(true);
        OCULTAR.setVisible(false);
        contraseña.setEchoChar('●');
    }//GEN-LAST:event_OCULTARMousePressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Graficap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Graficap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Graficap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Graficap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Graficap().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JButton IniciarSeicion;
    private javax.swing.JLabel Inicio;
    private javax.swing.JButton Invitado;
    private javax.swing.JLabel OCULTAR;
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usua;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel VER;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel inicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

}