package views;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Horarios;
import model.Tabla;

public class TablaAdmin extends javax.swing.JFrame {
      int xMouse,yMouse;
    DefaultTableModel modelo;
  
    public TablaAdmin() {
       this.setLocationByPlatform(true);
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Ruta");
        modelo.addColumn("Nombre de ruta");
        modelo.addColumn("Fecha");
        this.tablaAdmin.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TxtRuta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtNombreRuta = new javax.swing.JTextField();
        MetodoAñadirRuta = new javax.swing.JButton();
        MetodoEliminarRuta = new javax.swing.JButton();
        MetodoEliminarTodo = new javax.swing.JButton();
        TxtAño = new javax.swing.JTextField();
        Año = new javax.swing.JLabel();
        TxtMes = new javax.swing.JTextField();
        mes = new javax.swing.JLabel();
        TxtDia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtMinutos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtHora = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAdmin.setBackground(new java.awt.Color(255, 255, 255));
        tablaAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        tablaAdmin.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        tablaAdmin.setForeground(new java.awt.Color(255, 153, 102));
        tablaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ruta", "Nombre de Ruta", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tablaAdmin);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, 660, 215));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Horarios y rutas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 200, 40));

        TxtRuta.setBackground(new java.awt.Color(255, 255, 255));
        TxtRuta.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        TxtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRutaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 80, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ruta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 50, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre Ruta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        TxtNombreRuta.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombreRuta.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        TxtNombreRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreRutaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtNombreRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 161, -1));

        MetodoAñadirRuta.setBackground(new java.awt.Color(255, 255, 255));
        MetodoAñadirRuta.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        MetodoAñadirRuta.setForeground(new java.awt.Color(255, 102, 0));
        MetodoAñadirRuta.setText("Añadir");
        MetodoAñadirRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodoAñadirRutaActionPerformed(evt);
            }
        });
        jPanel1.add(MetodoAñadirRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        MetodoEliminarRuta.setBackground(new java.awt.Color(255, 255, 255));
        MetodoEliminarRuta.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        MetodoEliminarRuta.setForeground(new java.awt.Color(255, 102, 0));
        MetodoEliminarRuta.setText("Eliminar");
        MetodoEliminarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodoEliminarRutaActionPerformed(evt);
            }
        });
        jPanel1.add(MetodoEliminarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        MetodoEliminarTodo.setBackground(new java.awt.Color(255, 255, 255));
        MetodoEliminarTodo.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        MetodoEliminarTodo.setForeground(new java.awt.Color(255, 102, 0));
        MetodoEliminarTodo.setText("Eliminar Todo");
        MetodoEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodoEliminarTodoActionPerformed(evt);
            }
        });
        jPanel1.add(MetodoEliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        TxtAño.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TxtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 50, 20));

        Año.setBackground(new java.awt.Color(255, 255, 255));
        Año.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        Año.setForeground(new java.awt.Color(255, 255, 255));
        Año.setText("Año");
        jPanel1.add(Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        TxtMes.setEditable(false);
        TxtMes.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TxtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 50, 20));

        mes.setBackground(new java.awt.Color(255, 255, 255));
        mes.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        mes.setForeground(new java.awt.Color(255, 255, 255));
        mes.setText("Mes");
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        TxtDia.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TxtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 140, 50, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dia");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        TxtMinutos.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TxtMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 140, 50, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Minutos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        TxtHora.setBackground(new java.awt.Color(255, 255, 255));
        TxtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHoraActionPerformed(evt);
            }
        });
        jPanel1.add(TxtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 50, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("←");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 70, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fotoram.io.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 560));

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
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRutaActionPerformed

    private void MetodoAñadirRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodoAñadirRutaActionPerformed
        String[] EntradasTexto = new String[3];
        Horarios Almacenar = new Horarios();

        EntradasTexto[0] = TxtRuta.getText();
        EntradasTexto[1] = TxtNombreRuta.getText();

        int Año = Integer.parseInt(String.valueOf(TxtAño.getText()));
        int Mes = Integer.parseInt(String.valueOf(TxtMes.getText()));
        int Dia = Integer.parseInt(String.valueOf(TxtDia.getText()));
        int Hora = Integer.parseInt(String.valueOf(TxtHora.getText()));
        int Minutos = Integer.parseInt(String.valueOf(TxtMinutos.getText()));

        Almacenar.setRuta(TxtRuta.getText());
        Almacenar.setNombreRuta(TxtNombreRuta.getText());
        Almacenar.setAño(Año);
        Almacenar.setMes(Mes);
        Almacenar.setDia(Dia);
        Almacenar.setHora(Hora);
        Almacenar.setMinutos(Minutos);

        Almacenar.GenerarFecha();

        Tabla Fecha = new Tabla(Almacenar.getRuta(), Almacenar.getNombreRuta(), Almacenar.getDia(), Almacenar.getMes(), Almacenar.getAño(), Almacenar.getHora(), Almacenar.getMinutos());
        Fecha.GenerarFecha();

        EntradasTexto[2] = GeneraFecha(Año, Mes, Dia, Hora, Minutos);

        modelo.addRow(EntradasTexto);

        TxtRuta.setText("");
        TxtNombreRuta.setText("");
        TxtAño.setText("");
        TxtMes.setText("");
        TxtDia.setText("");
        TxtHora.setText("");
        TxtMinutos.setText("");

    }//GEN-LAST:event_MetodoAñadirRutaActionPerformed

    private void MetodoEliminarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodoEliminarRutaActionPerformed

        int filas = tablaAdmin.getSelectedRow();

        if (filas >= 0) {
            modelo.removeRow(filas);

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una de las filas, por favor.");
        }

    }//GEN-LAST:event_MetodoEliminarRutaActionPerformed

    private void MetodoEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodoEliminarTodoActionPerformed

        int TotalFilas = tablaAdmin.getRowCount();

        for (int i = TotalFilas - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }


    }//GEN-LAST:event_MetodoEliminarTodoActionPerformed

    private void TxtNombreRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreRutaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Graficap admin = new Graficap();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
          xMouse = evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
          int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
        this.setLocation(x -xMouse,y -yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void TxtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHoraActionPerformed

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
//            java.util.logging.Logger.getLogger(TablaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TablaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TablaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TablaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TablaAdmin().setVisible(false);
//                
////                JFrame frame = new JFrame("Horarios");
//        
//        Horarios Datos = new Horarios();
//
//        DefaultTableModel TablaAdmin = new DefaultTableModel();
//        TablaAdmin.addColumn("Ruta");
//        TablaAdmin.addColumn("Nombre de ruta");
//        TablaAdmin.addColumn("Fecha");
//        TablaAdmin.addRow(new Object[]{Datos.getRuta(), Datos.getNombreRuta(),Datos.getFecha()});
//
////        JTable tablaCopia = new JTable(TablaAdmin);
////
////        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
////        frame.add(new JScrollPane(tablaCopia));
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.pack();
////        frame.setVisible(true);
//            }
//        });
//    }

    private String GeneraFecha(int año, int mes, int dia, int hora, int minutos) {
        String fechaFormateada = String.format("%02d/%02d/%04d %02d:%02d", dia, mes, año, hora, minutos);
        return fechaFormateada;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Año;
    private javax.swing.JButton MetodoAñadirRuta;
    private javax.swing.JButton MetodoEliminarRuta;
    private javax.swing.JButton MetodoEliminarTodo;
    private javax.swing.JTextField TxtAño;
    private javax.swing.JTextField TxtDia;
    private javax.swing.JTextField TxtHora;
    private javax.swing.JTextField TxtMes;
    private javax.swing.JTextField TxtMinutos;
    private javax.swing.JTextField TxtNombreRuta;
    private javax.swing.JTextField TxtRuta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mes;
    private javax.swing.JTable tablaAdmin;
    // End of variables declaration//GEN-END:variables
}
