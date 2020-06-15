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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;


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

    @Test
    @Order(1)
    public void testSalvarTeste2() {
       System.out.println("inserir dado para futura exclusão");
        Object o = null;
        Turma turma = new Turma();
        TurmaDAO instance = new TurmaDAO();
        turma.setCodigo("530");
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

    

    @Test
    @Order(3)
    public void testAtualizarNomeTeste() {
       System.out.println("consultar pelo nome atualizado no teste anterior (2)");
        Object o = null;
        TurmaDAO instance = new TurmaDAO();
        String expResult = "ok";
        String result = instance.consultarNomeTeste();
        assertEquals(expResult, result);
    }

       /**
     * Test of consultarIdTeste method, of class TurmaDAO.
     */
    @Test
    @Order(4)
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
    @Order(5)
    public void testExcluirTeste() {
        System.out.println("excluir o teste inserido para exclusão anteriormente");
        String codigo = "530";
        TurmaDAO instance = new TurmaDAO();
        String expResult = null;
        String result = instance.excluirTeste(codigo);
        assertEquals(expResult, result);
   }

    @Test
    @Order(2)
    public void testAtualizarTeste() {
       System.out.println("atualizar nome da disciplina inserida no teste anterior (1)");
        Object o = null;
        Turma turma = new Turma();
        TurmaDAO instance = new TurmaDAO();
        String expResult = null;
        String result = instance.atualizarTeste(turma);
        assertEquals(expResult, result);
    }
  }
