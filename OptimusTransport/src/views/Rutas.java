/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author cjpp1
 */
public class Rutas extends javax.swing.JFrame {
  int xMouse,yMouse;
    public Rutas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        BRutas = new javax.swing.JComboBox<>();
        BCodigas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Codigos = new javax.swing.JLabel();
        Horar = new javax.swing.JTextField();
        ora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("↩");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        BRutas.setBackground(new java.awt.Color(255, 255, 255));
        BRutas.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        BRutas.setForeground(new java.awt.Color(255, 102, 0));
        BRutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRutasActionPerformed(evt);
            }
        });
        jPanel1.add(BRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 140, 30));

        BCodigas.setBackground(new java.awt.Color(255, 255, 255));
        BCodigas.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        BCodigas.setForeground(new java.awt.Color(255, 102, 0));
        BCodigas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(BCodigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 90, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rutas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 60, -1));

        Codigos.setBackground(new java.awt.Color(255, 255, 255));
        Codigos.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        Codigos.setForeground(new java.awt.Color(255, 255, 255));
        Codigos.setText("Codigos");
        jPanel1.add(Codigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        Horar.setBackground(new java.awt.Color(255, 255, 255));
        Horar.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        Horar.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.add(Horar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 200, 30));

        ora.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        ora.setForeground(new java.awt.Color(255, 255, 255));
        ora.setText("Horario de salida-llegada");
        jPanel1.add(ora, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 210, -1));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RUTAS", "CODIGOS", "HORARIO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 470, 400));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setForeground(new java.awt.Color(255, 102, 0));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 40));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fotoram.io.jpg"))); // NOI18N
        FONDO.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FONDOMouseDragged(evt);
            }
        });
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       MenuDeInicio mm = new MenuDeInicio();
       mm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRutasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRutasActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse = evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void FONDOMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FONDOMouseDragged
        int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
        this.setLocation(x -xMouse,y -yMouse);

    }//GEN-LAST:event_FONDOMouseDragged

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
         int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
        this.setLocation(x -xMouse,y -yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BCodigas;
    private javax.swing.JComboBox<String> BRutas;
    private javax.swing.JLabel Codigos;
    private javax.swing.JLabel FONDO;
    private javax.swing.JTextField Horar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel ora;
    // End of variables declaration//GEN-END:variables
}
