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
import com.sun.glass.events.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.*;
import java.util.Date;
import java.util.Locale;
import javax.swing.*;
import javax.swing.text.*;
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

    @Test
    public void TestgetDataAtual() {
        System.out.println("teste se a função está pegando a data correta");
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dataHoje = df.format(now);

        String expResult = dataHoje;
        String result = Formatacao.getDataAtual();
        assertEquals(expResult,result);
    } 

    @Test
    public void TestgetHoraAtual() {
        System.out.println("teste se a função está pegando a hora correta");
         Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataHoje = df.format(now);

        String expResult = dataHoje;
        String result = Formatacao.getDataHoraAtual();
        assertEquals(expResult,result);
    } 
}

