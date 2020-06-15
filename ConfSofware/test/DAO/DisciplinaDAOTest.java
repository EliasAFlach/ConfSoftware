/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Apoio.ConexaoBD;
import Entidade.Disciplina;
import Entidade.Turma;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Order;

/**
 *
 * @author elias
 */
public class DisciplinaDAOTest {
        
    public DisciplinaDAOTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of salvarTeste method, of class DisciplinaDAO.
     */
    @Test
    @Order(1)
    public void testSalvarTeste() {
       System.out.println("salvar");
        String disciplinaTest = "Extreme programming";

        Object o = null;
        Disciplina disciplina = new Disciplina();
        DisciplinaDAO instance = new DisciplinaDAO();
        disciplina.setId(100);
        disciplina.setNome(disciplinaTest);
        disciplina.setCarga(60);
        
        String expResult = null;
        String result = instance.salvarTeste(disciplina);
        assertEquals(expResult, result);
    }
    
    //testa selecionar a disciplina do id anterior
    
    @Test
    @Order(2)
    public void testSelect() throws SQLException
    {
        System.out.println("testar nome da disciplina inserida no teste anterior (1)");
        String disciplinaTest_name = "Extreme programming";
        int disciplinaTest_carga_horaria = 60;

        String expResult = null;
        
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM disciplina "
                    + "WHERE id = 100";

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
               Disciplina disciplina = new Disciplina();
               disciplina.setId(resultado.getInt("id"));
               disciplina.setNome(resultado.getString("nome"));
               disciplina.setCarga(resultado.getInt("carga_horaria"));
               expResult = disciplina.getNome();
            } else {
                System.out.println("oi");
            }
        assertEquals(disciplinaTest_name, expResult);     
    }

    @Test
    @Order(3)
    public void testCargaHoraria() throws SQLException
    {
        System.out.println("testar carga horária da disciplina inserida no teste (1)");
        String disciplinaTest = "Extreme programming";
        int disciplinaTest_carga_horaria = 60;

        int expResult = 0;
        
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM disciplina "
                    + "WHERE id = 100";

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
               Disciplina disciplina = new Disciplina();
               disciplina.setId(resultado.getInt("id"));
               disciplina.setNome(resultado.getString("nome"));
               disciplina.setCarga(resultado.getInt("carga_horaria"));
               expResult = disciplina.getCarga();
            } else {
                System.out.println("oi");
            }
        assertEquals(disciplinaTest_carga_horaria, expResult);     
    }
    
    
    }