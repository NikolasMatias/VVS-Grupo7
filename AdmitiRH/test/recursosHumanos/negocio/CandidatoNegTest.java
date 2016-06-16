/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursosHumanos.negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import recursosHumanos.entidade.Candidato;

/**
 *
 * @author Nikolas
 */
public class CandidatoNegTest {
    
    public CandidatoNegTest() {
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
     * Test of validaNome method, of class CandidatoNeg.
     */
    @Test
    public void testValidaNome() throws Exception {
        System.out.println("validaNome");
        Candidato candidato = null;
        CandidatoNeg instance = new CandidatoNeg();
        boolean expResult = false;
        boolean result = instance.validaNome(candidato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaDataNascimento method, of class CandidatoNeg.
     */
    @Test
    public void testValidaDataNascimento() throws Exception {
        System.out.println("validaDataNascimento");
        Candidato candidato = null;
        CandidatoNeg instance = new CandidatoNeg();
        boolean expResult = false;
        boolean result = instance.validaDataNascimento(candidato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCPF method, of class CandidatoNeg.
     */
    @Test
    public void testValidarCPF() throws Exception {
        System.out.println("validarCPF");
        Candidato candidato = null;
        CandidatoNeg instance = new CandidatoNeg();
        boolean expResult = false;
        boolean result = instance.validarCPF(candidato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaIdade method, of class CandidatoNeg.
     */
    @Test
    public void testValidaIdade() throws Exception {
        System.out.println("validaIdade");
        Candidato candidato = null;
        CandidatoNeg instance = new CandidatoNeg();
        boolean expResult = false;
        boolean result = instance.validaIdade(candidato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaPassaporte method, of class CandidatoNeg.
     */
    @Test
    public void testValidaPassaporte() throws Exception {
        System.out.println("validaPassaporte");
        Candidato candidato = null;
        CandidatoNeg instance = new CandidatoNeg();
        boolean expResult = false;
        boolean result = instance.validaPassaporte(candidato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaSexo method, of class CandidatoNeg.
     */
    @Test
    public void testValidaSexo() throws Exception {
        System.out.println("validaSexo");
        Candidato candidato = null;
        CandidatoNeg instance = new CandidatoNeg();
        boolean expResult = false;
        boolean result = instance.validaSexo(candidato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaNecessidadeReservista method, of class CandidatoNeg.
     */
    @Test
    public void testValidaNecessidadeReservista() {
        System.out.println("validaNecessidadeReservista");
        Candidato candidato = null;
        CandidatoNeg instance = new CandidatoNeg();
        boolean expResult = false;
        boolean result = instance.validaNecessidadeReservista(candidato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaDocumentoReservista method, of class CandidatoNeg.
     */
    @Test
    public void testValidaDocumentoReservista() throws Exception {
        System.out.println("validaDocumentoReservista");
        Candidato candidato = null;
        CandidatoNeg instance = new CandidatoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoReservista(candidato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaCandidato method, of class CandidatoNeg.
     */
    @Test
    public void testValidaCandidato() throws Exception {
        System.out.println("validaCandidato");
        Candidato candidato = null;
        CandidatoNeg instance = new CandidatoNeg();
        boolean expResult = false;
        boolean result = instance.validaCandidato(candidato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
