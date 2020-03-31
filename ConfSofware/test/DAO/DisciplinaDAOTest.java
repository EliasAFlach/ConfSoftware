/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Disciplina;
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
        Object o = null;
        Disciplina disciplina = new Disciplina();
        DisciplinaDAO instance = new DisciplinaDAO();
        disciplina.setId(100);
        disciplina.setNome("Extreme Programming");
        disciplina.setCarga(60);
        
        String expResult = null;
        String result = instance.salvarTeste(disciplina);
        assertEquals(expResult, result);
    }
}