package views;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import views.Graficap;

public class MenuDeInicio extends javax.swing.JFrame {
     int Xmouse,Ymouse;
     
    Graficap nombres = new Graficap();
     
      
    public MenuDeInicio() {
        initComponents();
        init();
        this.setLocationRelativeTo(null);
       
    }
    
    private void init(){
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
        GeoPosition geo = new GeoPosition(10.4065815,-75.505868);
        jXMapViewer.setAddressLocation(geo);
        jXMapViewer.setZoom(3);
        
        //        crear eventos con el mouse
        MouseInputListener mm = new PanMouseInputListener(jXMapViewer);
        jXMapViewer.addMouseListener(mm);
        jXMapViewer.addMouseMotionListener(mm);
        jXMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer));
      
    }

  
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXMapViewer = new org.jxmapviewer.JXMapViewer();
        Nombre = new javax.swing.JLabel();
        CyH = new javax.swing.JButton();
        Menu = new javax.swing.JLabel();
        Mapa = new javax.swing.JButton();
        CerrarSeion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jXMapViewer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 440, 490));

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        CyH.setBackground(new java.awt.Color(255, 255, 255));
        CyH.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        CyH.setForeground(new java.awt.Color(255, 102, 0));
        CyH.setText("Codigos y Horarios");
        CyH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CyHActionPerformed(evt);
            }
        });
        getContentPane().add(CyH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 180, 40));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fotoram.io-removebg-preview.png"))); // NOI18N
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 250));

        Mapa.setBackground(new java.awt.Color(255, 255, 255));
        Mapa.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        Mapa.setForeground(new java.awt.Color(255, 102, 0));
        Mapa.setText("Mapa");
        Mapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapaActionPerformed(evt);
            }
        });
        getContentPane().add(Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 180, 40));

        CerrarSeion.setBackground(new java.awt.Color(255, 255, 255));
        CerrarSeion.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        CerrarSeion.setForeground(new java.awt.Color(255, 102, 0));
        CerrarSeion.setText("Cerrar sesion ");
        CerrarSeion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSeionActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarSeion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/_1f8f22fe-4b23-431e-9192-bfaf5163204d.jpeg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSeionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSeionActionPerformed
       Graficap principal = new Graficap();
       principal.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CerrarSeionActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       Xmouse=evt.getX();
       Ymouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x -Xmouse, y -Ymouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void MapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapaActionPerformed
      Mapa_de_usuarios mapa = new Mapa_de_usuarios();
      mapa.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_MapaActionPerformed

    private void CyHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CyHActionPerformed
       Rutas mrutas = new Rutas();
       mrutas.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CyHActionPerformed

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
//            java.util.logging.Logger.getLogger(MenuDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuDeInicio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSeion;
    private javax.swing.JButton CyH;
    private javax.swing.JButton Mapa;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private org.jxmapviewer.JXMapViewer jXMapViewer;
    // End of variables declaration//GEN-END:variables

    private void setLocation(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}