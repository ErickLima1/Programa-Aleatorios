/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoProjeto;

import Connection.ConnectionFactory;
import ModelDAO.bmwDAO;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bmw;


/**
 *
 * @author Erick
 */
public class TelaCarro extends javax.swing.JFrame {
    /**
     * Creates new form TelaCarro
     */
    public TelaCarro() {
     initComponents();
     EntityManager em = new ConnectionFactory().getConnection();  
     this.mostraTabela();
    }
    
    
    //Mostrando a tabela do Banco De Dados
    public void mostraTabela() {
        
     EntityManager em = new ConnectionFactory().getConnection();  
     bmwDAO bmw = new bmwDAO();
     List<Bmw> TabelaBmw = new ArrayList();
     DefaultTableModel tabela = new DefaultTableModel();
     this.jTableCarros.setModel(tabela);
      
        tabela.addColumn("Id Placa Final");
        tabela.addColumn("Nome do Carro");
        tabela.addColumn("Ano");
        tabela.addColumn("Qtd Veiculos");
        tabela.addColumn("Cor do carro");
        tabela.addColumn("Portas");
        tabela.addColumn("Cambio");
        tabela.addColumn("Valor");
        
      for(Bmw c: bmw.getTodosTabelaBmw()) {
          tabela.addRow(
          new Object[] {
              c.getIdfinalplaca(),
              c.getNomecarro(),
              c.getAno(),
              c.getQuantidadecarros(),
              c.getCor(),
              c.getPortas(),
              c.getCambio(),
              c.getValor()
          }
          );
      }
  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameTelaBemVindo = new javax.swing.JInternalFrame();
        jButtonFechaTabelaDecarros = new javax.swing.JButton();
        jPanelInternal = new javax.swing.JPanel();
        jButtonTabelaBmw = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarros = new javax.swing.JTable();
        jButtonChevrolete = new javax.swing.JButton();
        jButtonVolkswagen = new javax.swing.JButton();
        jButtonTabelaMotos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundoCarro = new javax.swing.JLabel();
        jMenubarraCarro = new javax.swing.JMenuBar();
        jMenuVoltaCarro = new javax.swing.JMenu();
        jMenuIVoltaTelainicial = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAbrirTabelaCarro = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemTelaCadastro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameTelaBemVindo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jInternalFrameTelaBemVindo.setTitle("Bem-Vindo Na Loja De Carro");
        jInternalFrameTelaBemVindo.setVisible(true);
        jInternalFrameTelaBemVindo.getContentPane().setLayout(null);

        jButtonFechaTabelaDecarros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fecha2.png"))); // NOI18N
        jButtonFechaTabelaDecarros.setToolTipText("Fecha tela bem-vindo Na loja de carro");
        jButtonFechaTabelaDecarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFechaTabelaDecarrosActionPerformed(evt);
            }
        });
        jInternalFrameTelaBemVindo.getContentPane().add(jButtonFechaTabelaDecarros);
        jButtonFechaTabelaDecarros.setBounds(700, 0, 50, 40);

        jPanelInternal.setBackground(new java.awt.Color(102, 102, 102));
        jPanelInternal.setLayout(null);

        jButtonTabelaBmw.setText("Bmw");
        jButtonTabelaBmw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTabelaBmwActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonTabelaBmw);
        jButtonTabelaBmw.setBounds(-3, 0, 90, 32);

        jTableCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(jTableCarros);

        jPanelInternal.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 730, 360);

        jButtonChevrolete.setText("Chevrolete");
        jButtonChevrolete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChevroleteActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonChevrolete);
        jButtonChevrolete.setBounds(90, 0, 100, 32);

        jButtonVolkswagen.setText("Volkswagen");
        jButtonVolkswagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolkswagenActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonVolkswagen);
        jButtonVolkswagen.setBounds(190, 0, 100, 32);

        jButtonTabelaMotos.setText("Motos");
        jButtonTabelaMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTabelaMotosActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonTabelaMotos);
        jButtonTabelaMotos.setBounds(287, 0, 90, 32);

        jInternalFrameTelaBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(10, 50, 750, 380);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tabela De Carro:");
        jInternalFrameTelaBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 160, 30);

        getContentPane().add(jInternalFrameTelaBemVindo);
        jInternalFrameTelaBemVindo.setBounds(-20, 20, 770, 450);

        jLabelFundoCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Barra.png"))); // NOI18N
        jLabelFundoCarro.setText("concessionária");
        getContentPane().add(jLabelFundoCarro);
        jLabelFundoCarro.setBounds(-10, -40, 750, 510);

        jMenubarraCarro.setBackground(new java.awt.Color(204, 204, 204));
        jMenubarraCarro.setForeground(new java.awt.Color(204, 204, 204));

        jMenuVoltaCarro.setBackground(new java.awt.Color(204, 204, 204));
        jMenuVoltaCarro.setForeground(new java.awt.Color(0, 0, 0));
        jMenuVoltaCarro.setText("Volta ");

        jMenuIVoltaTelainicial.setText("Volta Pra tela inicial");
        jMenuIVoltaTelainicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIVoltaTelainicialActionPerformed(evt);
            }
        });
        jMenuVoltaCarro.add(jMenuIVoltaTelainicial);

        jMenubarraCarro.add(jMenuVoltaCarro);

        jMenu4.setBackground(new java.awt.Color(204, 204, 204));
        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setText("Abrirt Tabela de carro");

        jMenuItemAbrirTabelaCarro.setText("Abrir Tabela Carro");
        jMenuItemAbrirTabelaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirTabelaCarroActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAbrirTabelaCarro);

        jMenubarraCarro.add(jMenu4);

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Vende carro");
        jMenubarraCarro.add(jMenu1);

        jMenuSair.setBackground(new java.awt.Color(204, 204, 204));
        jMenuSair.setForeground(new java.awt.Color(0, 0, 0));
        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenubarraCarro.add(jMenuSair);

        jMenu2.setBackground(new java.awt.Color(204, 204, 204));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Cria Conta");

        jMenuItemTelaCadastro.setText("Cria Uma Conta");
        jMenuItemTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaCadastroActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemTelaCadastro);

        jMenubarraCarro.add(jMenu2);

        setJMenuBar(jMenubarraCarro);

        setSize(new java.awt.Dimension(749, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuIVoltaTelainicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIVoltaTelainicialActionPerformed
        // TODO add your handling code here:
        concessionaria conse = new concessionaria();
        conse.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuIVoltaTelainicialActionPerformed

    private void jButtonFechaTabelaDecarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFechaTabelaDecarrosActionPerformed
        // TODO add your handling code here:
        jInternalFrameTelaBemVindo.dispose();
        
    }//GEN-LAST:event_jButtonFechaTabelaDecarrosActionPerformed

    private void jMenuItemAbrirTabelaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirTabelaCarroActionPerformed
        // TODO add your handling code here:
        TelaCarro telacarro = new TelaCarro();
        telacarro.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenuItemAbrirTabelaCarroActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonTabelaBmwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTabelaBmwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTabelaBmwActionPerformed

    private void jButtonChevroleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChevroleteActionPerformed
        // TODO add your handling code here:
        TelaCarroChevrolete ChevroleteTela = new TelaCarroChevrolete();
        ChevroleteTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonChevroleteActionPerformed

    private void jButtonVolkswagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolkswagenActionPerformed
        // TODO add your handling code here:
        TelaCarroVolkswagen tabelaVolkswagen = new TelaCarroVolkswagen();
        tabelaVolkswagen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolkswagenActionPerformed

    private void jButtonTabelaMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTabelaMotosActionPerformed
        // TODO add your handling code here:
        TelaMoto moto = new TelaMoto();
        moto.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonTabelaMotosActionPerformed

    private void jMenuItemTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaCadastroActionPerformed
        // TODO add your handling code here:
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTelaCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChevrolete;
    private javax.swing.JButton jButtonFechaTabelaDecarros;
    private javax.swing.JButton jButtonTabelaBmw;
    private javax.swing.JButton jButtonTabelaMotos;
    private javax.swing.JButton jButtonVolkswagen;
    private javax.swing.JInternalFrame jInternalFrameTelaBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundoCarro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuIVoltaTelainicial;
    private javax.swing.JMenuItem jMenuItemAbrirTabelaCarro;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaCadastro;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVoltaCarro;
    private javax.swing.JMenuBar jMenubarraCarro;
    private javax.swing.JPanel jPanelInternal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarros;
    // End of variables declaration//GEN-END:variables


    
}
