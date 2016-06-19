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
import recursosHumanos.entidade.Cargo;
import recursosHumanos.enumeradores.EnumTipoDocumentoHabilitacao;

/**
 *
 * @author Nikolas
 */
public class CargoNegTest {
    
    public CargoNegTest() {
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
    
    /** Nikolas Matias
     * Caso de teste 23 - Documento Igual a Null
     */
    @Test
    public void CT23() throws Exception {
        System.out.println("Documento Igual a Null");
        Cargo cargo = null;
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDescricao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /** Nikolas Matias
     * Caso de teste 24 - Documento não preenchido
     */
    @Test
    public void CT24() throws Exception {
        System.out.println("Documento não preenchido.");
        EnumTipoDocumentoHabilitacao Documento;
        Cargo cargo = new Cargo("Engenheiro",12000,Documento,50);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /** Nikolas Matias
     * Caso de teste 25 - Documento Incorreto.
     */
    @Test
    public void CT25() throws Exception {
        System.out.println("Documento Incorreto.");
        Cargo cargo = new Cargo("Médico",12000,EnumTipoDocumentoHabilitacao.CNH,10);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /** Nikolas Matias
     * Caso de teste 26 - Documento Incorreto.
     */
    @Test
    public void CT26() throws Exception {
        System.out.println("Documento Incorreto.");
        Cargo cargo = new Cargo("Médico",12000,EnumTipoDocumentoHabilitacao.CREA,10);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /** Nikolas Matias
     * Caso de teste 27 - Documento Igual a null.
     */
    @Test
    public void CT27() throws Exception {
        System.out.println("Documento igual a null.");
        EnumTipoDocumentoHabilitacao documento = null;
        Cargo cargo = new Cargo("Médico",12000,documento,10);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /** Nikolas Matias
     * Caso de teste 28 - Documento Incorreto.
     */
    @Test
    public void CT28() throws Exception {
        System.out.println("Documento não preenchido.");
        EnumTipoDocumentoHabilitacao documento;
        Cargo cargo = new Cargo("Médico",12000,documento,10);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /** Nikolas Matias
     * Caso de teste 29 - Documento não necessário.
     */
    @Test
    public void CT29() throws Exception {
        System.out.println("Documento não necessário.");
        Cargo cargo = new Cargo("Técnico em Informática",12000,EnumTipoDocumentoHabilitacao.CNH,20);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /** Nikolas Matias
     * Caso de teste 30 - Documento não necessário..
     */
    @Test
    public void CT30() throws Exception {
        System.out.println("Documento não necessário.");
        Cargo cargo = new Cargo("Técnico em Informática",12000,EnumTipoDocumentoHabilitacao.CREA,20);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /** Nikolas Matias
     * Caso de teste 31 - Documento igual a null.
     */
    @Test
    public void CT31() throws Exception {
        System.out.println("Documento igual a null.");
        EnumTipoDocumentoHabilitacao documento = null;
        Cargo cargo = new Cargo("Técnico em Informática",12000,documento,20);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /** Nikolas Matias
     * Caso de teste 32 - Documento não necessário..
     */
    @Test
    public void CT32() throws Exception {
        System.out.println("Documento não necessário.");
        Cargo cargo = new Cargo("Técnico em Informática",12000,EnumTipoDocumentoHabilitacao.CRM,20);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /** Nikolas Matias
     * Caso de teste 33 - Documento não Preenchido.
     */
    @Test
    public void CT33() throws Exception {
        System.out.println("Documento não Preenchido.");
        EnumTipoDocumentoHabilitacao documento;
        Cargo cargo = new Cargo("Motorista",12000,documento,15);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /** Nikolas Matias
     * Caso de teste 34 - Documento Incorreto.
     */
    @Test
    public void CT34() throws Exception {
        System.out.println("Documento Incorreto.");
        Cargo cargo = new Cargo("Motorista",12000,EnumTipoDocumentoHabilitacao.CREA,15);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /** Nikolas Matias
     * Caso de teste 35 - Documento não necessário..
     */
    @Test
    public void CT35() throws Exception {
        System.out.println("Documento Igual a null.");
        EnumTipoDocumentoHabilitacao documento = null;
        Cargo cargo = new Cargo("Motorista",12000,documento,15);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /** Nikolas Matias
     * Caso de teste 36 - Documento não necessário..
     */
    @Test
    public void CT36() throws Exception {
        System.out.println("Documento Incorreto.");
        Cargo cargo = new Cargo("Motorista",12000,EnumTipoDocumentoHabilitacao.CRM,15);
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of validaDescricao method, of class CargoNeg.
     */
    @Test
    public void testValidaDescricao() throws Exception {
        System.out.println("validaDescricao");
        Cargo cargo = null;
        CargoNeg instance = new CargoNeg();
        boolean expResult = true;
        boolean result = instance.validaDescricao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaDocumentoHabilitacao method, of class CargoNeg.
     */
    @Test
    public void testValidaDocumentoHabilitacao() throws Exception {
        System.out.println("validaDocumentoHabilitacao");
        Cargo cargo = null;
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaDocumentoHabilitacao(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaSalario method, of class CargoNeg.
     */
    @Test
    public void testValidaSalario() throws Exception {
        System.out.println("validaSalario");
        Cargo cargo = null;
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaSalario(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ocupaVaga method, of class CargoNeg.
     */
    @Test
    public void testOcupaVaga() throws Exception {
        System.out.println("ocupaVaga");
        Cargo cargo = null;
        Candidato candidato = null;
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.ocupaVaga(cargo, candidato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configuraQuantidadeVagas method, of class CargoNeg.
     */
    @Test
    public void testConfiguraQuantidadeVagas() throws Exception {
        System.out.println("configuraQuantidadeVagas");
        Cargo cargo = null;
        CargoNeg instance = new CargoNeg();
        instance.configuraQuantidadeVagas(cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaQuantidadeVagas method, of class CargoNeg.
     */
    @Test
    public void testValidaQuantidadeVagas() throws Exception {
        System.out.println("validaQuantidadeVagas");
        Cargo cargo = null;
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaQuantidadeVagas(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaCargo method, of class CargoNeg.
     */
    @Test
    public void testValidaCargo() throws Exception {
        System.out.println("validaCargo");
        Cargo cargo = null;
        CargoNeg instance = new CargoNeg();
        boolean expResult = false;
        boolean result = instance.validaCargo(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
