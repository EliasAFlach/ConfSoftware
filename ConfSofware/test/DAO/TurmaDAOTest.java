/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Turma;
import java.util.ArrayList;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Order;

/**
 *
 * @author elias
 */
public class TurmaDAOTest {
    
    public TurmaDAOTest() {
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
     * Test of salvarTeste method, of class TurmaDAO.
     */
    @Test
    @Order(1)
    public void testSalvarTeste() {
       System.out.println("salvar");
        Object o = null;
        Turma turma = new Turma();
        TurmaDAO instance = new TurmaDAO();
        turma.setCodigo("516");
        turma.setQuantidadeAlunos(24);
        turma.setDisciplina(1);
        turma.setTurno("Matutino");
        turma.setRegime("EAD");
        turma.setProfessor("Fabricio Pretto");
        turma.setDataInicio("10/01/2020");
        turma.setDataFim("20/06/2020");
   
        
        String expResult = null;
        String result = instance.salvarTeste(turma);
        assertEquals(expResult, result);
    }
    
       /**
     * Test of consultarIdTeste method, of class TurmaDAO.
     */
    @Test
    @Order(2)
    public void testConsultarIdTeste() {
        System.out.println("consultarId");
        String id = "520";
        Turma turma = new Turma();
        TurmaDAO instance = new TurmaDAO();
        Object expResult = "ok";
        Object result = instance.consultarIdTeste(id);
        assertEquals(expResult, result);
    }

     /**
     * Test of excluirTeste method, of class TurmaDAO.
     */
    @Test
    @Order(3)
    public void testExcluirTeste() {
        System.out.println("excluir");
        String codigo = "516";
        TurmaDAO instance = new TurmaDAO();
        String expResult = null;
        String result = instance.excluirTeste(codigo);
        assertEquals(expResult, result);
    }
  }
