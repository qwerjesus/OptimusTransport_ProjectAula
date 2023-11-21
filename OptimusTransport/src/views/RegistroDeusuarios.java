package views;
import seguridadHash.PasswordHashing;
import javax.swing.JOptionPane;
import conexion.conex;


public class RegistroDeusuarios extends javax.swing.JFrame {
    conex con = new conex();
    int Xmouse,Ymouse;
     
    public RegistroDeusuarios() {
        initComponents();
        con.conectarBD(); 
        this.setLocationRelativeTo(null);
        this.OCULTAR.setVisible(false);
        this.OCULTARC.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Nombredeusuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        ConfirmarContraseña = new javax.swing.JLabel();
        Contrasenas = new javax.swing.JPasswordField();
        Contrasña = new javax.swing.JPasswordField();
        Registrar = new javax.swing.JButton();
        VER = new javax.swing.JLabel();
        VERC = new javax.swing.JLabel();
        OCULTARC = new javax.swing.JLabel();
        OCULTAR = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-10-29 141202.png"))); // NOI18N
        Logo.setText("jLabel2");
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 280, 250));

        Nombredeusuario.setBackground(new java.awt.Color(255, 255, 255));
        Nombredeusuario.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        Nombredeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombredeusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Nombredeusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 160, -1));

        Contraseña.setBackground(new java.awt.Color(255, 255, 255));
        Contraseña.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("Contraseña:");
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 160, -1));


        Contrasenas.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        Contrasenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenasActionPerformed(evt);
            }
        });
        jPanel1.add(Contrasenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 160, -1));

      
        ConfirmarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmarContraseña.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        ConfirmarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmarContraseña.setText("Confirmar contraseña:");
        jPanel1.add(ConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        Contrasenas.setBackground(new java.awt.Color(255, 255, 255));
        Contrasenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenasActionPerformed(evt);
            }
        });
        jPanel1.add(Contrasenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 160, -1));

        Contrasña.setBackground(new java.awt.Color(255, 255, 255));
        Contrasña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasñaActionPerformed(evt);
            }
        });
        jPanel1.add(Contrasña, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 160, -1));

        Registrar.setBackground(new java.awt.Color(255, 255, 255));
        Registrar.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 102, 0));
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 440, 100, 30));

        VER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver_32px.png"))); // NOI18N
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VERMousePressed(evt);
            }
        });
        jPanel1.add(VER, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 30, 40));

        VERC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver_32px.png"))); // NOI18N
        VERC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VERCMousePressed(evt);
            }
        });
        jPanel1.add(VERC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        OCULTARC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar_32px.png"))); // NOI18N
        OCULTARC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OCULTARCMousePressed(evt);
            }
        });
        jPanel1.add(OCULTARC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        OCULTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar_32px.png"))); // NOI18N
        OCULTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OCULTARMousePressed(evt);
            }
        });
        jPanel1.add(OCULTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 342, -1, 40));

        Volver.setBackground(new java.awt.Color(255, 255, 255));
        Volver.setForeground(new java.awt.Color(255, 102, 0));
        Volver.setText("↩");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fotoram.io.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 500));

        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
      Xmouse=evt.getX();
      Ymouse=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-Xmouse, y-Ymouse);
             
    }//GEN-LAST:event_jPanel2MouseDragged

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Graficap vregistro = new Graficap();
        vregistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        Graficap confirmado = new Graficap();
        confirmado.setVisible(true);
        this.dispose();
        
        String nombreUsuario = Nombredeusuario.getText();
        String password = Contrasenas.getText();
        String confirmarPassword = Contrasña.getText();

    // Verificar que las contraseñas coincidan
   if (password.equals(confirmarPassword)) {
    // Encriptar la contraseña antes de almacenarla
    String hashedPassword = PasswordHashing.hashPassword(password);

    // Lógica de registro en la base de datos
    con.registrarUsuario(nombreUsuario, hashedPassword);
    JOptionPane.showMessageDialog(this, "Usuario registrado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    // Cerrar la ventana actual o realizar otras acciones según sea necesario
    this.dispose();
   } else {
    JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Llamar al método para registrar usuario
    con.registrarUsuario(nombreUsuario, password);
                                 
    }//GEN-LAST:event_RegistrarActionPerformed

    private void NombredeusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombredeusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombredeusuarioActionPerformed

    private void ContrasenasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenasActionPerformed


    private void ContrasñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasñaActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
         Xmouse=evt.getX();
      Ymouse=evt.getY();
       
    }//GEN-LAST:event_jPanel2MousePressed

    private void VERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERMousePressed
       VER.setVisible(false);
        OCULTAR.setVisible(true);
        Contrasenas.setEchoChar((char)0);
    }//GEN-LAST:event_VERMousePressed

    private void OCULTARMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCULTARMousePressed
        VER.setVisible(true);
        OCULTAR.setVisible(false);
        Contrasenas.setEchoChar('●');
    }//GEN-LAST:event_OCULTARMousePressed

    private void VERCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERCMousePressed
       VERC.setVisible(false);
       OCULTARC.setVisible(true);
       Contrasña.setEchoChar((char)0);
    }//GEN-LAST:event_VERCMousePressed

    private void OCULTARCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCULTARCMousePressed
        VERC.setVisible(true);
       OCULTARC.setVisible(false);
       Contrasña.setEchoChar('●');
    }//GEN-LAST:event_OCULTARCMousePressed

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
//            java.util.logging.Logger.getLogger(RegistroDeusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistroDeusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistroDeusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistroDeusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistroDeusuarios().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmarContraseña;
    private javax.swing.JPasswordField Contrasenas;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JPasswordField Contrasña;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField Nombredeusuario;
    private javax.swing.JLabel OCULTAR;
    private javax.swing.JLabel OCULTARC;
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel VER;
    private javax.swing.JLabel VERC;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
