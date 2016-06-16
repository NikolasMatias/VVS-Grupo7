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
