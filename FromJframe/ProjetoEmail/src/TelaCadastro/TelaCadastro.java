/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaCadastro;

import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
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

        jButtonSair = new javax.swing.JButton();
        jButtonAcessar = new javax.swing.JButton();
        jLabelSenha2 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldSenha2 = new javax.swing.JPasswordField();
        jLabelTelaCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(170, 110, 90, 20);

        jButtonAcessar.setText("Cadastrar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(270, 110, 90, 20);

        jLabelSenha2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSenha2.setText("Repetir Senha:");
        getContentPane().add(jLabelSenha2);
        jLabelSenha2.setBounds(70, 80, 110, 19);

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmail.setText("Email:");
        getContentPane().add(jLabelEmail);
        jLabelEmail.setBounds(100, 20, 60, 19);

        jLabelSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(100, 50, 60, 19);

        jTextFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmail);
        jTextFieldEmail.setBounds(150, 20, 190, 20);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/oie_transparent.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(0, 0, 90, 70);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 0, 70, 19);

        jPasswordFieldSenha.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(150, 50, 190, 22);

        jPasswordFieldSenha2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPasswordFieldSenha2);
        jPasswordFieldSenha2.setBounds(180, 80, 160, 22);

        jLabelTelaCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela2.jpg"))); // NOI18N
        getContentPane().add(jLabelTelaCadastro);
        jLabelTelaCadastro.setBounds(0, 0, 370, 135);

        setSize(new java.awt.Dimension(385, 174));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        // TODO add your handling code here:
        if(jTextFieldEmail.getText().equals("Sistemajava@gmail.com")&& jPasswordFieldSenha.getText().equals("3211") 
                == jPasswordFieldSenha2.getText().equals("3211")) {
        CadastroConcluido c = new CadastroConcluido();
        c.setVisible(true);
        dispose();
        }else {
            JOptionPane.showMessageDialog(rootPane, "Senha ou Email Errado");
        }
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSenha2;
    private javax.swing.JLabel jLabelTelaCadastro;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha2;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
}
