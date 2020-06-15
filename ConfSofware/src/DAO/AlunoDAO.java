/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Apoio.IDAO;
import Entidade.Aluno;
import Apoio.ConexaoBD;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Elias Flach
 */
public class AlunoDAO implements IDAO {

    @Override
    public String salvar(Object o) {
        Aluno aluno = (Aluno) o;

        try {
//          Statement st = bilhetario.Bilhetario.conexao.createStatement();
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO aluno (id, nome, CPF, endereco) VALUES ("
                    + "DEFAULT,"
                    + "'" + aluno.getNome() + "',"
                    + "'" + aluno.getCpf()+ "',"
                    + "'" + aluno.getEndereco()+ "'"
                    + ")";

            System.out.println("Query SALVAR aluno: " + sql);
            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "xxx";
            }
        } catch (Exception e) {
            System.out.println("Erro salvar aluno = " + e);
            return e.toString();
        }

    }

    @Override
    public String atualizar(Object o) {
        Aluno aluno = (Aluno) o;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE aluno "
                    + "SET nome = '" + aluno.getNome() + "'"
                    //                    + " aluno = '" + aluno.getAluno() + "',"
                    //                    + " senha = MD5('" + aluno.getSenha() + "'),"
                    //                    + " tipo_aluno = '" + aluno.getTipo_aluno() + "'"
                    + "WHERE id = " + aluno.getId();

            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "erro ao alterar";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar aluno: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE aluno "
                    + "SET status = 'Cancelado' "
                    + "WHERE id = " + id;

            int resultado = st.executeUpdate(sql);
            System.out.println(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "erro ao excluir aluno";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar aluno: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Object> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> consultar(String criterio) {
        ArrayList<Object> alunosUsers = new ArrayList<>();

        try {
            //Statement st = bilhetario.Bilhetario.conexao.createStatement();
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM aluno");

            if (resultado.isBeforeFirst()) {
                while (resultado.next()) {
                    // captura dados do ResultSet
                    Aluno aluno = new Aluno();

                    aluno.setId(resultado.getInt("id"));
                    aluno.setNome(resultado.getString("nome"));
//                    aluno.setAluno(resultado.getString("aluno"));
//                    aluno.setSenha(resultado.getString("senha"));
//                    aluno.setTipo_aluno(resultado.getString("tipo_aluno"));
                    aluno.setSituacao(resultado.getString("status"));

                    alunosUsers.add(aluno);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro consultar alunos = " + e);
        }
        return alunosUsers;
    }

    @Override
    public Object consultarId(int id) {
        try {

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM aluno "
                    + "WHERE id = " + id;

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(id);
                aluno.setId(resultado.getInt("id"));
                aluno.setNome(resultado.getString("nome"));
//                aluno.setAluno(resultado.getString("aluno"));
//                aluno.setSenha(resultado.getString("senha"));
//                aluno.setTipo_aluno(resultado.getString("tipo_aluno"));
                aluno.setSituacao(resultado.getString("status"));
                return aluno;
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar aluno: " + e);
            return null;
        }
    }

    public Object consultarLogin(String asd) {
        try {

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "select * from aluno where cpf='" + asd + "'";

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(resultado.getInt("id"));
                aluno.setNome(resultado.getString("nome"));
                aluno.setEndereco(resultado.getString("nome"));
                aluno.setCpf(resultado.getString("cpf"));
                aluno.setSituacao(resultado.getString("status"));
                aluno.setSituacao(resultado.getString("codigo"));

                return aluno;
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar aluno: " + e);
            return null;
        }
    }

    public Object consultarLoginTeste(String codigo, String cpf) {
        try {

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "select * from aluno where cpf='" + cpf + "' AND codigo = '" + codigo + "' ";

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
                return "ok";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar aluno: " + e);
            return null;
        }
    }


    public void popularTabela(JTable tblAluno, String text) {
                ResultSet resultadoQ;

        // dados da tblAluno
        Object[][] dadosTabela = null;

        // cabecalho da tblAluno
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "CPF";
        cabecalho[3] = "Status";
        // cria matriz de acordo com nº de registros da tblAluno
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM aluno "
                    + "WHERE nome ILIKE '%" + text +"%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][4];

        } catch (Exception e) {
            System.out.println("Erro ao consultar aluno: " + e);
        }

        int lin = 0;

        // efetua consulta na tblAluno
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM aluno "
                    + "WHERE nome ILIKE '%" + text
                    + "%' ORDER BY id ASC");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getObject("id");
                dadosTabela[lin][1] = resultadoQ.getObject("nome");
                dadosTabela[lin][2] = resultadoQ.getObject("cpf");
                dadosTabela[lin][3] = resultadoQ.getObject("status");

                

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tblAluno...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tblAluno
        tblAluno.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tblAluno nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tblAluno
        tblAluno.setSelectionMode(0);

        // redimensiona as colunas de uma tblAluno
        TableColumn column = null;
        for (int i = 0; i < tblAluno.getColumnCount(); i++) {
            column = tblAluno.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
    }
}
