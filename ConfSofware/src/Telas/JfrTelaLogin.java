/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.AlunoDAO;
import Entidade.Aluno;
import Apoio.ConexaoBD;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Elias Flach
 */
public class JfrTelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form JfrTelaLogin
     */
    public JfrTelaLogin() {
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

        jLabelFundo = new javax.swing.JLabel();
        btnAcessar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela Login.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(40, 0, 180, 230);

        btnAcessar.setText("Acessar");
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        btnAcessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAcessarKeyPressed(evt);
            }
        });
        getContentPane().add(btnAcessar);
        btnAcessar.setBounds(297, 160, 90, 25);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(400, 160, 80, 25);

        jLabel1.setText("CPF:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 90, 50, 20);

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        getContentPane().add(txtCPF);
        txtCPF.setBounds(290, 90, 190, 22);

        setSize(new java.awt.Dimension(530, 277));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        JfrTelaPrincipal p = new JfrTelaPrincipal();
        p.setVisible(true);

        /* String user = txtfUsuario.getText();
        String senha = txtfSenha.getText();
        Usuario usuarioRetorno = (Usuario) new UsuarioDAO().consultarLogin(user, senha);

        if (usuarioRetorno != null && usuarioRetorno.getSituacao() != 'i') {
            JfrTelaPrincipal p = new JfrTelaPrincipal(usuarioRetorno);
            p.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtfUsuario.setText("");
            txtfSenha.setText("");
            txtfUsuario.requestFocus();
        }*/
    }//GEN-LAST:event_btnAcessarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAcessarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAcessarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String cpf = txtCPF.getText();
            Aluno alunoRetorno = (Aluno) new AlunoDAO().consultarLogin(cpf);

            if (alunoRetorno != null && alunoRetorno.getSituacao() != 'i') {
                JfrTelaPrincipal p = new JfrTelaPrincipal(alunoRetorno);
                p.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "CPF inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                txtCPF.setText("");
                txtCPF.requestFocus();
            }
        }
    }//GEN-LAST:event_btnAcessarKeyPressed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

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
            java.util.logging.Logger.getLogger(JfrTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrTelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JTextField txtCPF;
    // End of variables declaration//GEN-END:variables
}
