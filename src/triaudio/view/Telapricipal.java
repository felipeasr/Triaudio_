/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triaudio.view;

import java.awt.Toolkit;

/**
 *
 * @author felipe
 */
public class Telapricipal extends javax.swing.JFrame {

    /**
     * Creates new form Telapricipal
     */
    public Telapricipal() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        pacientes = new javax.swing.JButton();
        CadastrarP = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        VoltaTelaLogin = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jToggleButton1.setText("jToggleButton1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triaudio/view/paciente.png"))); // NOI18N
        pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientesActionPerformed(evt);
            }
        });

        CadastrarP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CadastrarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triaudio/view/medico (1).png"))); // NOI18N
        CadastrarP.setAlignmentY(10.0F);
        CadastrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarPActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        VoltaTelaLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        VoltaTelaLogin.setSelected(true);
        VoltaTelaLogin.setText("Sair ");
        VoltaTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triaudio/view/retorna.png"))); // NOI18N
        VoltaTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltaTelaLoginActionPerformed(evt);
            }
        });
        jMenu1.add(VoltaTelaLogin);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(pacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(168, 168, 168)
                .addComponent(CadastrarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CadastrarP, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(pacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(207, 207, 207))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltaTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltaTelaLoginActionPerformed
        Login volta = new Login ();
                         volta.setVisible(true);
                         dispose();// TODO add your handling code here:
    }//GEN-LAST:event_VoltaTelaLoginActionPerformed

    private void CadastrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarPActionPerformed
CadastroP cas = new CadastroP ();
                         cas.setVisible(true);
                         dispose();     
                                 // TODO add your handling code here:
    }//GEN-LAST:event_CadastrarPActionPerformed

    private void pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacientesActionPerformed

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
            java.util.logging.Logger.getLogger(Telapricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telapricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telapricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telapricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telapricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarP;
    private javax.swing.JRadioButtonMenuItem VoltaTelaLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton pacientes;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png"))); }
}
