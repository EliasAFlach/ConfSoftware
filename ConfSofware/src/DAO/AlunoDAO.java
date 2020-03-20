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
        Aluno usuario = (Aluno) o;

        try {
//          Statement st = bilhetario.Bilhetario.conexao.createStatement();
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO usuario VALUES ("
                    + "DEFAULT,"
                    + "'" + usuario.getNome() + "',"
                    + "'" + usuario.getSituacao() + "'"
                    //                    + "'a'"
                    + ")";

            System.out.println("Query SALVAR usuário: " + sql);
            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "xxx";
            }
        } catch (Exception e) {
            System.out.println("Erro salvar usuário = " + e);
            return e.toString();
        }

    }

    @Override
    public String atualizar(Object o) {
        Aluno aluno = (Aluno) o;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE usuario "
                    + "SET nome = '" + aluno.getNome() + "',"
                    //                    + " usuario = '" + aluno.getAluno() + "',"
                    //                    + " senha = MD5('" + aluno.getSenha() + "'),"
                    //                    + " tipo_usuario = '" + aluno.getTipo_usuario() + "'"
                    + "WHERE id = " + aluno.getId();

            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "erro ao alterar";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar usuário: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE usuario "
                    + "SET situacao = 'i' "
                    + "WHERE id = " + id;

            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "erro ao excluir usuário";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar usuário: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Object> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> consultar(String criterio) {
        ArrayList<Object> usuariosUsers = new ArrayList<>();

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
//                    usuario.setAluno(resultado.getString("usuario"));
//                    usuario.setSenha(resultado.getString("senha"));
//                    usuario.setTipo_usuario(resultado.getString("tipo_usuario"));
                    aluno.setSituacao(resultado.getString("situacao").charAt(0));

                    usuariosUsers.add(aluno);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro consultar usuários = " + e);
        }
        return usuariosUsers;
    }

    @Override
    public Object consultarId(int id) {
        try {

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM usuario "
                    + "WHERE id = " + id;

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
                Aluno usuario = new Aluno();
                usuario.setId(id);
                usuario.setId(resultado.getInt("id"));
                usuario.setNome(resultado.getString("nome"));
//                usuario.setAluno(resultado.getString("usuario"));
//                usuario.setSenha(resultado.getString("senha"));
//                usuario.setTipo_usuario(resultado.getString("tipo_usuario"));
                usuario.setSituacao(resultado.getString("situacao").charAt(0));
                return usuario;
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar usuario: " + e);
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
                aluno.setSituacao(resultado.getString("situacao").charAt(0));
                return aluno;
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar usuario: " + e);
            return null;
        }
    }

    public void popularTabela(JTable tabela, String nome, String usuario) {
        ResultSet resultadoQ;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[3];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Usuário";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM usuario "
                    + "WHERE nome ILIKE '%" + nome + "%' AND usuario ILIKE '%" + usuario + "%' AND situacao = 'a'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][3];

        } catch (Exception e) {
            System.out.println("Erro ao consultar usuário: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM usuario "
                    + "WHERE nome ILIKE '%" + nome + "%' AND usuario ILIKE '%" + usuario + "%' AND situacao = 'a'"
                    + "ORDER BY id ASC");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getObject("id");
                dadosTabela[lin][1] = resultadoQ.getObject("nome");
                dadosTabela[lin][2] = resultadoQ.getObject("usuario");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
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

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
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
