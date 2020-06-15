/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Apoio.IDAO;
import Apoio.ConexaoBD;
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
public class TurmaDAO implements IDAO {

    @Override
    public String salvar(Object o) {
        Turma turma = (Turma) o;

        try {
//          Statement st = bilhetario.Bilhetario.conexao.createStatement();
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO turma (id, codigo, quant_alunos, disciplina_id, turno, regime, professor, datainivigencia, datafimvigencia) VALUES ("
                    + "DEFAULT,"
                    + "'" + turma.getCodigo() + "',"
                    + " " + turma.getQuantidadeAlunos()+ ", "
                    + " " + turma.getDisciplina() + ", "                    
                    + "'" + turma.getTurno()+ "', "
                    + "'" + turma.getRegime()+ "', "
                    + "'" + turma.getProfessor()+ "', "
                    + "'" + turma.getDataInicio()+ "', "
                    + "'" + turma.getDataFim()+ "' "
                    + ")";

            System.out.println("Query SALVAR turma: " + sql);
            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "xxx";
            }
        } catch (Exception e) {
            System.out.println("Erro salvar turma = " + e);
            return e.toString();
        }
    }
    
    public String salvarTeste(Object o) {
        Turma turma = (Turma) o;

        try {
//          Statement st = bilhetario.Bilhetario.conexao.createStatement();
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO turmaTeste (id, codigo, quant_alunos, disciplina_id, turno, regime, professor, datainivigencia, datafimvigencia) VALUES ("
                    + "DEFAULT,"
                    + "'" + turma.getCodigo() + "',"
                    + " " + turma.getQuantidadeAlunos()+ ", "
                    + " " + turma.getDisciplina() + ", "                    
                    + "'" + turma.getTurno()+ "', "
                    + "'" + turma.getRegime()+ "', "
                    + "'" + turma.getProfessor()+ "', "
                    + "'" + turma.getDataInicio()+ "', "
                    + "'" + turma.getDataFim()+ "' "
                    + ")";

            System.out.println("Query SALVAR turma: " + sql);
            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "xxx";
            }
        } catch (Exception e) {
            System.out.println("Erro salvar turma = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Object o) {
        Turma turma = (Turma) o;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE turma "
                    + " SET  codigo = '" + turma.getCodigo() + "',"
                    + "     quant_alunos = " + turma.getQuantidadeAlunos()+ ", "
                    + "     disciplina_id = " + turma.getDisciplina() + ", "                    
                    + "     turno = '" + turma.getTurno()+ "', "
                    + "     regime = '" + turma.getRegime()+ "', "
                    + "     professor = '" + turma.getProfessor()+ "', "
                    + "     datainivigencia = '" + turma.getDataInicio()+ "', "
                    + "     datafimvigencia = '" + turma.getDataFim()+ "' "
                    + " WHERE id = " + turma.getId();

            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "erro ao alterar";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar turma: " + e);
            return e.toString();
        }
    }

    public String atualizarTeste(Object o) {
        Turma turma = (Turma) o;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE turmaTeste "
                    + " SET professor = 'Professor Atualizado' "
                    + " WHERE codigo = '516' ";

            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "erro ao alterar";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar turma: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = " DELETE FROM turma "
                       + " WHERE id = " + id;

            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "erro ao excluir turma";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar turma: " + e);
            return e.toString();
        }
    }
    
     public String excluirTeste(String id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = " DELETE FROM turmaTeste "
                       + " WHERE codigo = '" + id + "' ";

            int resultado = st.executeUpdate(sql);

            if (resultado != 0) {
                return null;
            } else {
                return "erro ao excluir turma";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar turma: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Object> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> consultar(String criterio) {
        ArrayList<Object> turmas = new ArrayList<>();

        try {
            //Statement st = bilhetario.Bilhetario.conexao.createStatement();
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM turma");

            if (resultado.isBeforeFirst()) {
                while (resultado.next()) {
                    // captura dados do ResultSet
                    Turma turma = new Turma();
                    
                    turma.setId(resultado.getInt("id"));
                    turma.setCodigo(resultado.getString("codigo"));
                    turma.setQuantidadeAlunos(resultado.getInt("quant_alunos"));
                    turma.setDisciplina(resultado.getInt("disciplina_id"));
                    turma.setTurno(resultado.getString("turno"));
                    turma.setRegime(resultado.getString("regime"));
                    turma.setProfessor(resultado.getString("professor"));
                    turma.setDataInicio(resultado.getString("datainivigencia"));
                    turma.setDataFim(resultado.getString("datafimvigencia"));


                    turmas.add(turma);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro consultar turmas = " + e);
        }
        return turmas;
    }

    @Override
    public Object consultarId(int id) {
        try {

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM turma "
                    + "WHERE id = " + id;

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
                Turma turma = new Turma();
               turma.setId(resultado.getInt("id"));
               turma.setCodigo(resultado.getString("codigo"));
               turma.setQuantidadeAlunos(resultado.getInt("quant_alunos"));
               turma.setDisciplina(resultado.getInt("disciplina_id"));
               turma.setTurno(resultado.getString("turno"));
               turma.setRegime(resultado.getString("regime"));
               turma.setProfessor(resultado.getString("professor"));
               turma.setDataInicio(resultado.getString("datainivigencia"));
               turma.setDataFim(resultado.getString("datafimvigencia"));
               return turma;
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar turma: " + e);
            return null;
        }
    }
    
    public Object consultarIdTeste(String id) {
        try {

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM turmaTeste "
                    + "WHERE codigo = '" + id + "' ";

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
                Turma turma = new Turma();
               turma.setId(resultado.getInt("id"));
               turma.setCodigo(resultado.getString("codigo"));
               turma.setQuantidadeAlunos(resultado.getInt("quant_alunos"));
               turma.setDisciplina(resultado.getInt("disciplina_id"));
               turma.setTurno(resultado.getString("turno"));
               turma.setRegime(resultado.getString("regime"));
               turma.setProfessor(resultado.getString("professor"));
               turma.setDataInicio(resultado.getString("datainivigencia"));
               turma.setDataFim(resultado.getString("datafimvigencia"));
               return "ok";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar turma: " + e);
            return null;
        }
    }

    public String consultarNomeTeste() {
        try {

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM turmaTeste "
                    + "WHERE professor = 'Professor Atualizado' ";

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
               return "ok";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar turma: " + e);
            return null;
        }
    }

    public void popularTabela(JTable tblTurma, String text) {
                ResultSet resultadoQ;

        // dados da tblAluno
        Object[][] dadosTabela = null;

        // cabecalho da tblAluno
        Object[] cabecalho = new Object[10];
        cabecalho[0] = "ID";
        cabecalho[1] = "Codigo";
        cabecalho[2] = "Quant. Alunos";
        cabecalho[3] = "Disciplina";
        cabecalho[4] = "ID Disciplina";
        cabecalho[5] = "Turno";
        cabecalho[6] = "Regime";
        cabecalho[7] = "Professor";
        cabecalho[8] = "Inicio";
        cabecalho[9] = "Fim";
        
        // cria matriz de acordo com nº de registros da tblTurma
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM turma "
                    + "WHERE codigo ILIKE '%" + text +"%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][10];

        } catch (Exception e) {
            System.out.println("Erro ao consultar turma: " + e);
        }

        int lin = 0;

        // efetua consulta na tblTurma
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + " SELECT t.id, t.codigo, t.quant_alunos, d.nome, t.disciplina_id, t.turno, t.regime, t.professor, t.datainivigencia, t.datafimvigencia " 
                    + " FROM turma t, disciplina d"
                    + " WHERE t.codigo ILIKE '%" + text
                    + "%' AND t.disciplina_id = d.id ORDER BY id ASC");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getObject("id");
                dadosTabela[lin][1] = resultadoQ.getObject("codigo");
                dadosTabela[lin][2] = resultadoQ.getObject("quant_alunos");
                dadosTabela[lin][3] = resultadoQ.getObject("nome");
                dadosTabela[lin][4] = resultadoQ.getObject("disciplina_id");
                dadosTabela[lin][5] = resultadoQ.getObject("turno");
                dadosTabela[lin][6] = resultadoQ.getObject("regime");
                dadosTabela[lin][7] = resultadoQ.getObject("professor");
                dadosTabela[lin][8] = resultadoQ.getObject("datainivigencia");
                dadosTabela[lin][9] = resultadoQ.getObject("datafimvigencia");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tblTurma...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tblAluno
        tblTurma.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
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

        // permite seleção de apenas uma linha da tblTurma
        tblTurma.setSelectionMode(0);

        // redimensiona as colunas de uma tblTurma
        TableColumn column = null;
        for (int i = 0; i < tblTurma.getColumnCount(); i++) {
            column = tblTurma.getColumnModel().getColumn(i);
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
