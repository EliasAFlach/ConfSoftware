/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Apoio.IDAO;
import Apoio.ConexaoBD;
import Entidade.Disciplina;
import Entidade.Turma;
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
public class DisciplinaDAO implements IDAO {

    @Override
    public String salvar(Object o) {
        Disciplina disciplina = (Disciplina) o;

        try {
//          Statement st = bilhetario.Bilhetario.conexao.createStatement();
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO disciplina VALUES ("
                    + "DEFAULT,"
                    + "'" + disciplina.getNome() + "',"
                    + " " + disciplina.getCarga()+ ")";

            System.out.println("Query SALVAR disciplina: " + sql);
            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "xxx";
            }
        } catch (Exception e) {
            System.out.println("Erro salvar disciplina = " + e);
            return e.toString();
        }

    }
    
    public String salvarTeste(Object o) {
        Disciplina disciplina = (Disciplina) o;

        try {
//          Statement st = bilhetario.Bilhetario.conexao.createStatement();
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO disciplina VALUES ("
                    + "DEFAULT,"
                    + "'" + disciplina.getNome() + "',"
                    + " " + disciplina.getCarga()+ ")";

            System.out.println("Query SALVAR disciplina: " + sql);
            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "xxx";
            }
        } catch (Exception e) {
            System.out.println("Erro salvar disciplina = " + e);
            return e.toString();
        }

    }

    @Override
    public String atualizar(Object o) {
        Disciplina disciplina = (Disciplina) o;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE disciplina"
                    + "SET  nome = '" + disciplina.getNome()+ "',"
                    + "carga_horaria = " + disciplina.getCarga() 
                    + "WHERE id = " + disciplina.getId();

            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "erro ao alterar";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar disciplina: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = " DELETE FROM disciplina "
                       + " WHERE id = " + id;

            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "erro ao excluir disciplina";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar disciplina: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Object> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> consultar(String criterio) {
        ArrayList<Object> disciplinas = new ArrayList<>();

        try {
            //Statement st = bilhetario.Bilhetario.conexao.createStatement();
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM disciplina");

            if (resultado.isBeforeFirst()) {
                while (resultado.next()) {
                    // captura dados do ResultSet
                    Turma disciplina = new Turma();
                    
                    disciplina.setId(resultado.getInt("id"));
                    disciplina.setCodigo(resultado.getString("nome"));
                    disciplina.setQuantidadeAlunos(resultado.getInt("carga_horaria"));


                    disciplinas.add(disciplina);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro consultar disciplinas = " + e);
        }
        return disciplinas;
    }

    @Override
    public Object consultarId(int id) {
        try {

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM disciplina "
                    + "WHERE id = " + id;

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
               Disciplina disciplina = new Disciplina();
               disciplina.setId(resultado.getInt("id"));
               disciplina.setNome(resultado.getString("nome"));
               disciplina.setCarga(resultado.getInt("carga_horaria"));
               return disciplina;
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar disciplina: " + e);
            return null;
        }
    }

    public void popularTabela(JTable tblDisciplina, String text) {
                ResultSet resultadoQ;

        // dados da tblAluno
        Object[][] dadosTabela = null;

        // cabecalho da tblAluno
        Object[] cabecalho = new Object[3];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Carga horaria";
        
        // cria matriz de acordo com nº de registros da tblDisciplina
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM disciplina "
                    + "WHERE nome ILIKE '%" + text +"%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][3];

        } catch (Exception e) {
            System.out.println("Erro ao consultar disciplina: " + e);
        }

        int lin = 0;

        // efetua consulta na tblDisciplina
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + " SELECT d.id, d.nome, d.carga_horaria " 
                    + " FROM disciplina d"
                    + " WHERE nome ILIKE '%" + text
                    + "%' ORDER BY d.id ASC");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getObject("id");
                dadosTabela[lin][1] = resultadoQ.getObject("nome");
                dadosTabela[lin][2] = resultadoQ.getObject("carga_horaria");


                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tblDisciplina...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tblAluno
        tblDisciplina.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
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

        // permite seleção de apenas uma linha da tblDisciplina
        tblDisciplina.setSelectionMode(0);

        // redimensiona as colunas de uma tblDisciplina
        TableColumn column = null;
        for (int i = 0; i < tblDisciplina.getColumnCount(); i++) {
            column = tblDisciplina.getColumnModel().getColumn(i);
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
