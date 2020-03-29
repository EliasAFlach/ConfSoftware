/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apoio;

import javax.swing.JLabel;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elias
 */
public class ValidacaoTest {
    
    public ValidacaoTest() {
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
     * Test of validarCPF method, of class Validacao.
     */
    @Test
    public void testValidarCPF() {
        System.out.println("validarCPF");
        String cpf = "03788657065";
        boolean expResult = true;
        boolean result = Validacao.validarCPF(cpf);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarCNPJ method, of class Validacao.
     */
    @Test
    public void testValidarCNPJ() {
        System.out.println("validarCNPJ");
        String cnpj = "57884722000173";
        boolean expResult = true;
        boolean result = Validacao.validarCNPJ(cnpj);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarDataDMA method, of class Validacao.
     */
    @Test
    public void testValidarDataDMA() {
        System.out.println("validarDataDMA");
        int d = 21;
        int m = 9;
        int a = 2020;
        boolean expResult = true;
        boolean result = Validacao.validarDataDMA(d, m, a);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarDataFormatada method, of class Validacao.
     */
    @Test
    public void testValidarDataFormatada() {
        System.out.println("validarDataFormatada");
        String dataComFormato = "10/01/2020";
        boolean expResult = true;
        boolean result = Validacao.validarDataFormatada(dataComFormato);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarNumbersOnly method, of class Validacao.
     */
}
