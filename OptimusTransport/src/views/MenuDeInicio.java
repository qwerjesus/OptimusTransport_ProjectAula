package views;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;


public class MenuDeInicio extends javax.swing.JFrame {
     int Xmouse,Ymouse;
     
   
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

        jPanel3 = new javax.swing.JPanel();
        Menu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Avatar = new javax.swing.JLabel();
        CerrarSeion = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        Crutas = new javax.swing.JButton();
        CyH = new javax.swing.JButton();
        Mapa = new javax.swing.JButton();
        jXMapViewer = new org.jxmapviewer.JXMapViewer();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-10-29 141202.png"))); // NOI18N
        Menu.setText("jLabel1");
        jPanel3.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 50, 240, 250));

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

        Avatar.setForeground(new java.awt.Color(255, 255, 255));
        Avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar.jpg"))); // NOI18N
        Avatar.setText("jLabel2");
        jPanel1.add(Avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        CerrarSeion.setFont(new java.awt.Font("Black Carrot", 0, 10)); // NOI18N
        CerrarSeion.setForeground(new java.awt.Color(255, 102, 0));
        CerrarSeion.setText("Cerrar sesion ");
        CerrarSeion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSeionActionPerformed(evt);
            }
        });
        jPanel1.add(CerrarSeion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 170, 50));

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 102, 0));
        Nombre.setText("nombre");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, 170, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 50));

        Crutas.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        Crutas.setForeground(new java.awt.Color(255, 102, 0));
        Crutas.setText("Consultar Rutas");
        jPanel3.add(Crutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, 40));

        CyH.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        CyH.setForeground(new java.awt.Color(255, 102, 0));
        CyH.setText("Codigos y Horarios");
        jPanel3.add(CyH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 180, 40));

        Mapa.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        Mapa.setForeground(new java.awt.Color(255, 102, 0));
        Mapa.setText("Mapa");
        Mapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapaActionPerformed(evt);
            }
        });
        jPanel3.add(Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 180, 40));
        jPanel3.add(jXMapViewer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 440, 440));

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
      Mapa_de_invitado mapa = new Mapa_de_invitado();
      mapa.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_MapaActionPerformed

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
    private javax.swing.JLabel Avatar;
    private javax.swing.JButton CerrarSeion;
    private javax.swing.JButton Crutas;
    private javax.swing.JButton CyH;
    private javax.swing.JButton Mapa;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private org.jxmapviewer.JXMapViewer jXMapViewer;
    // End of variables declaration//GEN-END:variables

    private void setLocation(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}