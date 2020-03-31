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
 * @author Lucas
 */
public class FormatacaoTest {
 
    
    public FormatacaoTest() {
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
    
    @Test
    public void TestAjustaDataDMA()
    {
        System.out.println("AjustaDataDMA");
        
        String data = "1994-08-03";
        String expResult = "03/08/1994";
        String result = Formatacao.ajustaDataDMA(data);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void TestAjustaDataAMD()
    {  
        System.out.println("AjustaDataAMD");
        String data = "03/08/1994";
        String expResult = "1994-08-03";
        String result = Formatacao.ajustaDataAMD(data);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestIsNumeric()
    {
        System.out.println("isNumeric");
        String number = "1723128378";
        boolean expResult = true;
        boolean result = Formatacao.isNumeric(number);
        assertEquals(expResult, result);
    }

    @Test
    public void TestRemoverFormatacao()
    {
        System.out.println("removerFormatacao");
        String formatted = "030.864.470-01";
        String expResult = "03086447001";
        String result = Formatacao.removerFormatacao(formatted);
        assertEquals(expResult,result);
              
    }
    
}

