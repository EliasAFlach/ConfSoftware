/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidade.Usuario;
import javax.swing.JOptionPane;
import Apoio.Formatacao;
import static Apoio.Formatacao.isNumeric;
import Apoio.Validacao;
import DAO.TurmaDAO;
import Entidade.Aluno;
import Entidade.Disciplina;
import Entidade.Turma;
import javax.swing.JFormattedTextField;

/**
 * TESTE
 * @author fabricio.pretto
 */
public class IfrTurma extends javax.swing.JInternalFrame {

    int codigo = 0;

    /**
     * Creates new form IfrUsuario
     */
    public IfrTurma() {
        initComponents();
        this.setTitle("Turmas");
        new TurmaDAO().popularTabela(tblTurma, txtCriterio.getText());
    }

    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTurma = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtCriterio = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        validacao = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtQuantidadeAlunos = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cmbRegime = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtProfessor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JTextField();
        txtDataFim = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbDisciplina = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        tfdExcluir = new javax.swing.JButton();

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tblTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTurma);

        jLabel2.setText("Nome");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCriterio, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listagem", jPanel2);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel11.setText("Código:*");

        jLabel12.setText("Quantidade Alunos:*");

        txtQuantidadeAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeAlunosActionPerformed(evt);
            }
        });

        jLabel13.setText("Turno:*");

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Regime:*");

        cmbRegime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Professor:*");

        txtProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfessorActionPerformed(evt);
            }
        });

        jLabel16.setText("Data Inicio:*");

        txtDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataInicioActionPerformed(evt);
            }
        });

        txtDataFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFimActionPerformed(evt);
            }
        });

        jLabel17.setText("Data Fim:*");

        jLabel18.setText("Disciplina:*");

        cmbDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(cmbRegime, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(10, 10, 10)
                                .addComponent(txtQuantidadeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(269, 269, 269)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(567, 567, 567))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtProfessor)
                                .addGap(619, 619, 619)))
                        .addComponent(validacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cmbDisciplina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(validacao, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(175, 175, 175))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cmbRegime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cmbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tfdExcluir.setText("Ativar / Desativar");
        tfdExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(28, 28, 28)
                .addComponent(tfdExcluir)
                .addGap(26, 26, 26)
                .addComponent(btnFechar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(tfdExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int valida = validaDados();
        if (valida != 0) {
              JOptionPane.showMessageDialog(null, "Problemas ao salvar registro! Verifique os dados informados\n\n"
                    );
        }
        Turma turma = new Turma();
        guardaDados(turma);
    
        TurmaDAO turmaDAO = new TurmaDAO();

        String retorno = null;

        if (codigo == 0) {
            retorno = turmaDAO.salvar(turma);
        } else {
            turma.setId(codigo);
            retorno = turmaDAO.atualizar(turma);
        }
        
        if (retorno == null) {
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
            limpaDados();
            codigo = 0;
            new TurmaDAO().popularTabela(tblTurma, txtCriterio.getText());
        } else {

            JOptionPane.showMessageDialog(null, "Problemas ao salvar registro! Verifique os dados informados\n\n"
                    + "Mensagem técnica:\n" + retorno);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        new TurmaDAO().popularTabela(tblTurma, txtCriterio.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String valor = String.valueOf(tblTurma.getValueAt(tblTurma.getSelectedRow(), 0));

        Turma a = (Turma) new TurmaDAO().consultarId(Integer.parseInt(valor));

        alteraDados(a);
        tfdNome.setText(a.getNome());
        tfdCPF.setText(a.getCpf());
        tfdEndereço.setText(a.getEndereco());
//        if (u.getSexo() == 'M') {
//            jRadioButton1.setSelected(true);
//        }
//        if (u.getSexo() == 'F') {
//            jRadioButton2.setSelected(true);
//        }
//        tfdDataNascimento.setText(Formatacao.ajustaDataDMA(u.getData_nascimento()));

//        System.out.println(u.getData_nascimento());
//        System.out.println(Formatacao.ajustaDataDMA(u.getData_nascimento()));

        codigo = a.getId();

        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tfdExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdExcluirActionPerformed

        String valor = String.valueOf(tblTurma.getValueAt(tblTurma.getSelectedRow(), 0));
        Aluno a = (Aluno) new AlunoDAO().consultarId(Integer.parseInt(valor));
        codigo = a.getId();
        String retorno = new AlunoDAO().excluir(codigo);

        if (retorno == null) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            new AlunoDAO().popularTabela(tblTurma, "");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao alterar aluno");
        }

    }//GEN-LAST:event_tfdExcluirActionPerformed

    private void txtQuantidadeAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeAlunosActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfessorActionPerformed

    private void txtDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataInicioActionPerformed

    private void txtDataFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbDisciplina;
    private javax.swing.JComboBox<String> cmbRegime;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblTurma;
    private javax.swing.JButton tfdExcluir;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCriterio;
    private javax.swing.JTextField txtDataFim;
    private javax.swing.JTextField txtDataInicio;
    private javax.swing.JTextField txtProfessor;
    private javax.swing.JFormattedTextField txtQuantidadeAlunos;
    private javax.swing.JLabel validacao;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void guardaDados(Turma turma) {
        turma.setCodigo(txtCodigo.getText());
        turma.setQuantidadeAlunos(Integer.parseInt(txtQuantidadeAlunos.getText()));
        
        Disciplina disciplina = (Disciplina) cmbDisciplina.getSelectedItem();
        turma.setDisciplina(disciplina.getId());
        
        turma.setTurno(cmbTurno.getSelectedItem().toString());
        turma.setRegime(cmbRegime.getSelectedItem().toString());
        turma.setProfessor(txtCodigo.getText());
        turma.setDataInicio(txtCodigo.getText());
        turma.setDataFim(txtCodigo.getText());
    }
    
    private int validaDados() {
        if (txtCodigo.getText().equals("")) {
            return -1;
        }
        
        if (txtDataFim.getText().replace("/", "").equals("")) {
            return -1;
        }
        
        if (txtDataInicio.getText().replace("/", "").equals("")) {
            return -1;
        }
        
        if (txtProfessor.getText().equals("")) {
            return -1;
        }
        
        if (txtQuantidadeAlunos.getText().equals("")) {
            return -1;
        }
        
        if (!isNumeric(txtQuantidadeAlunos.getText())) {
            return -1;
        }
        
        if (cmbDisciplina.getSelectedIndex() == 0) {
            return -1;
        }
        if (cmbRegime.getSelectedIndex() == 0) {
            return -1;
        }
        
        if (cmbTurno.getSelectedIndex() == 0) {
            return -1;
        }
        return 0;
    }
    
    private void limpaDados() {
        txtCodigo.setText("");
        txtCriterio.setText("");
        txtDataInicio.setText("");
        txtDataFim.setText("");
        txtProfessor.setText("");
        txtQuantidadeAlunos.setText("");
        
        cmbDisciplina.setSelectedIndex(0);
        cmbRegime.setSelectedIndex(0);
        cmbTurno.setSelectedIndex(0);
    }
    
    private void alteraDados(Turma turma) {
        txtCodigo.setText(turma.getCodigo());
        txtQuantidadeAlunos.setText(turma.getQuantidadeAlunos() + "");
        
        cmb
        
         turma.setCodigo(txtCodigo.getText());
        turma.setQuantidadeAlunos(Integer.parseInt(txtQuantidadeAlunos.getText()));
        
        Disciplina disciplina = (Disciplina) cmbDisciplina.getSelectedItem();
        turma.setDisciplina(disciplina.getId());
        
        turma.setTurno(cmbTurno.getSelectedItem().toString());
        turma.setRegime(cmbRegime.getSelectedItem().toString());
        turma.setProfessor(txtCodigo.getText());
        turma.setDataInicio(txtCodigo.getText());
        turma.setDataFim(txtCodigo.getText());
    }
}
