/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author DIEGO HUAMANJULCA G
 */
public class Jfr_ventana_principal extends javax.swing.JFrame {

    /**
     * Creates new form Jfr_ventana_principal
     */
    public Jfr_ventana_principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Et_nombre_hotel = new javax.swing.JLabel();
        Bt_Registro = new javax.swing.JButton();
        Et_fondo = new javax.swing.JLabel();
        Mnu_Navegador = new javax.swing.JMenuBar();
        Mnu_habitaciones = new javax.swing.JMenu();
        Mnu_Listas = new javax.swing.JMenu();
        Mnu_facturas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel.setFocusTraversalPolicyProvider(true);
        Panel.setFocusable(false);
        Panel.setVerifyInputWhenFocusTarget(false);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Et_nombre_hotel.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        Et_nombre_hotel.setForeground(new java.awt.Color(0, 0, 0));
        Et_nombre_hotel.setText("Hotel Peca2");
        Panel.add(Et_nombre_hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 280, 90));

        Bt_Registro.setBackground(new java.awt.Color(255, 255, 255));
        Bt_Registro.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Bt_Registro.setForeground(new java.awt.Color(0, 0, 0));
        Bt_Registro.setText("Registrar");
        Bt_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_RegistroActionPerformed(evt);
            }
        });
        Panel.add(Bt_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 110, 30));

        Et_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24001e6bc72049ffbdbfd51c46a4bd29_LARGE.jpg"))); // NOI18N
        Panel.add(Et_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 293));

        Mnu_habitaciones.setText("Habitaciones");
        Mnu_Navegador.add(Mnu_habitaciones);

        Mnu_Listas.setText("Listas");
        Mnu_Navegador.add(Mnu_Listas);

        Mnu_facturas.setText("Facturas");
        Mnu_Navegador.add(Mnu_facturas);

        setJMenuBar(Mnu_Navegador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_RegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bt_RegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Jfr_ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jfr_ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jfr_ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jfr_ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jfr_ventana_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Registro;
    private javax.swing.JLabel Et_fondo;
    private javax.swing.JLabel Et_nombre_hotel;
    private javax.swing.JMenu Mnu_Listas;
    private javax.swing.JMenuBar Mnu_Navegador;
    private javax.swing.JMenu Mnu_facturas;
    private javax.swing.JMenu Mnu_habitaciones;
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
