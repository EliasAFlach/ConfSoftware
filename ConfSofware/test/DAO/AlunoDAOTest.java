/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Apoio.ConexaoBD;
import Entidade.Aluno;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Order;

/**
 *
 */
public class AlunoDAOTest {
    
    public AlunoDAOTest() {
    
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
     * Test of salvarTeste method, of class AlunoDAO.
     */
    @Test
    @Order(1)
    public void testSalvarteste() {
       System.out.println("salvar");
        String alunoTest = "lukinha";

        Object o = null;
        Aluno aluno = new Aluno();
        AlunoDAO instance = new AlunoDAO();
        aluno.setId(100);
        aluno.setNome(alunoTest);
        
        String expResult = null;
        String result = instance.salvar(aluno);
        assertEquals(expResult, result);
    }
    
    
    
    //teste para assegurar que o novo insert está como default MATRICULADO
    @Test
    @Order(2)
    public void testMatricula() throws SQLException {
       System.out.println("salvar");
        String alunoTest_situacao = "Matriculado";

        System.out.println("testar status do aluno inserido no (1)");

        String expResult = null;
        
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM aluno "
                    + "WHERE id = 100 AND status = 'Matriculado'";

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
               Aluno aluno = new Aluno();
               aluno.setId(resultado.getInt("id"));
               aluno.setNome(resultado.getString("nome"));
               aluno.setSituacao(resultado.getString("status"));
               expResult = aluno.getSituacao();
            } else {
                System.out.println("oi");
            }
            
        assertEquals(alunoTest_situacao, expResult);     
    }
    
    
    //teste cpf
    @Test
    @Order(3)
    public void testCPF() throws SQLException {
       System.out.println("salvar");
        String cpf = null;

        System.out.println("testar cpf do aluno inserido no (1)");

        String expResult = "03086447001";
        
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM aluno "
                    + "WHERE id = 100";

            ResultSet resultado = st.executeQuery(sql);

            if (resultado.next()) {
               Aluno aluno = new Aluno();
               aluno.setId(resultado.getInt("id"));
               aluno.setNome(resultado.getString("nome"));
               aluno.setSituacao(resultado.getString("status"));
               aluno.setCpf(resultado.getString("cpf"));
               cpf = aluno.getCpf();
            } else {
                System.out.println("oi");
            }
            
        assertEquals(expResult,cpf);     
    }

    @Test
    @Order(4)
    public void testConsultarLogin() {
        System.out.println("teste da consulta do login");
        String cpf = "03788657065";
        String codigo = "123456";

        String expResult = "ok";

        Aluno aluno = new Aluno();
        AlunoDAO instance = new AlunoDAO();
        Object result = instance.consultarLoginTeste(codigo, cpf);
        assertEquals(expResult, result);
    }
    
    
}