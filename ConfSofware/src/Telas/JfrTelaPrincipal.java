/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidade.Aluno;
import Apoio.ConexaoBD;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Elias Flach
 */
public class JfrTelaPrincipal extends javax.swing.JFrame {

    Aluno usuario;

    /**
     * Creates new form JfrTelaPrincipal
     *
     * @param usuario
     */
    public JfrTelaPrincipal(Aluno usuario) {
        this.usuario = usuario;
        initComponents();


    }

    public JfrTelaPrincipal() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        BtnCadastroCliente = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnCadastroTurma = new javax.swing.JButton();
        btnCadastroDisciplina = new javax.swing.JButton();
        MenuManutencao = new javax.swing.JMenuBar();
        jMenuRelatórios = new javax.swing.JMenu();
        MenuRelatorioCompraCliente = new javax.swing.JMenuItem();
        MenuRelEventosValor = new javax.swing.JMenuItem();
        MenuRelEstabelecimentos = new javax.swing.JMenuItem();
        MenuRelUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setText("Cadastros");

        BtnCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cliente.png"))); // NOI18N
        BtnCadastroCliente.setText("Pessoa");
        BtnCadastroCliente.setToolTipText("Cadastro de Clientes");
        BtnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastroClienteActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnCadastroTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastros.png"))); // NOI18N
        btnCadastroTurma.setText("Turma");
        btnCadastroTurma.setToolTipText("Cadastro de Clientes");
        btnCadastroTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroTurmaActionPerformed(evt);
            }
        });

        btnCadastroDisciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Eventos.png"))); // NOI18N
        btnCadastroDisciplina.setText("Disciplina");
        btnCadastroDisciplina.setToolTipText("Cadastro de Clientes");
        btnCadastroDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroDisciplinaActionPerformed(evt);
            }
        });

        jMenuRelatórios.setText("Relatórios");

        MenuRelatorioCompraCliente.setText("Compras por cliente");
        MenuRelatorioCompraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioCompraClienteActionPerformed(evt);
            }
        });
        jMenuRelatórios.add(MenuRelatorioCompraCliente);

        MenuRelEventosValor.setText("Eventos com valor determinado ou maior");
        MenuRelEventosValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelEventosValorActionPerformed(evt);
            }
        });
        jMenuRelatórios.add(MenuRelEventosValor);

        MenuRelEstabelecimentos.setText("Estabelecimentos cadastrados");
        MenuRelEstabelecimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelEstabelecimentosActionPerformed(evt);
            }
        });
        jMenuRelatórios.add(MenuRelEstabelecimentos);

        MenuRelUsuarios.setText("Usuarios cadastrados");
        MenuRelUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelUsuariosActionPerformed(evt);
            }
        });
        jMenuRelatórios.add(MenuRelUsuarios);

        MenuManutencao.add(jMenuRelatórios);

        jInternalFrame1.setJMenuBar(MenuManutencao);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastroDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastroTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCadastroCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastroDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastroTurma)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jDesktopPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(973, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void MenuRelUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelUsuariosActionPerformed
        //        try {
            //            // Compila o relatorio
            //            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/Relatórios/rel_usuarios.jrxml"));
            //
            //            // Mapeia campos de parametros para o relatorio, mesmo que nao existam
            //            Map parametros = new HashMap();
            //
            //            // Executa relatorio
            //            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());
            //
            //            // Exibe resultado em video
            //            this.dispose();
            //            JasperViewer.viewReport(impressao, false);
            //        } catch (Exception e) {
            //            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
            //        }
    }//GEN-LAST:event_MenuRelUsuariosActionPerformed

    private void MenuRelEstabelecimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelEstabelecimentosActionPerformed
        //        try {
            //            // Compila o relatorio
            //            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/Relatórios/rel_estabelecimentos.jrxml"));
            //
            //            // Mapeia campos de parametros para o relatorio, mesmo que nao existam
            //            Map parametros = new HashMap();
            //
            //            // Executa relatorio
            //            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());
            //
            //            // Exibe resultado em video
            //            this.dispose();
            //            JasperViewer.viewReport(impressao, false);
            //        } catch (Exception e) {
            //            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
            //        }
    }//GEN-LAST:event_MenuRelEstabelecimentosActionPerformed

    private void MenuRelEventosValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelEventosValorActionPerformed
        //        DlgRelatorioValorShow dlg = new DlgRelatorioValorShow(this, true);
        //        dlg.setLocationRelativeTo(this);
        //        dlg.setVisible(true);
    }//GEN-LAST:event_MenuRelEventosValorActionPerformed

    private void MenuRelatorioCompraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioCompraClienteActionPerformed
        //        DlgRelatorioClientes dlg = new DlgRelatorioClientes(this, true);
        //        dlg.setLocationRelativeTo(this);
        //        dlg.setVisible(true);
    }//GEN-LAST:event_MenuRelatorioCompraClienteActionPerformed

    private void BtnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastroClienteActionPerformed
        IfrUsuario ifrUsuario = new IfrUsuario();
        jDesktopPane1.add(ifrUsuario);
        ifrUsuario.setVisible(true);
    }//GEN-LAST:event_BtnCadastroClienteActionPerformed

    private void btnCadastroTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroTurmaActionPerformed
        IfrTurma IfrTurma = new IfrTurma();
        jDesktopPane1.add(IfrTurma);
        IfrTurma.setVisible(true);
    }//GEN-LAST:event_btnCadastroTurmaActionPerformed

    private void btnCadastroDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroDisciplinaActionPerformed
        IfrDisciplina IfrDisciplina = new IfrDisciplina();
        jDesktopPane1.add(IfrDisciplina);
        IfrDisciplina.setVisible(true);
    }//GEN-LAST:event_btnCadastroDisciplinaActionPerformed

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
            java.util.logging.Logger.getLogger(JfrTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastroCliente;
    private javax.swing.JMenuBar MenuManutencao;
    private javax.swing.JMenuItem MenuRelEstabelecimentos;
    private javax.swing.JMenuItem MenuRelEventosValor;
    private javax.swing.JMenuItem MenuRelUsuarios;
    private javax.swing.JMenuItem MenuRelatorioCompraCliente;
    private javax.swing.JButton btnCadastroDisciplina;
    private javax.swing.JButton btnCadastroTurma;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuRelatórios;
    // End of variables declaration//GEN-END:variables
}
