/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioentornos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diurno
 */
public class CambiaLongitudTest {
    
    public CambiaLongitudTest() {
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
     * Test of modificar method, of class CambiaLongitud.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        int[] vector = null;
        int LongitudActual = 0;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.modificar(vector, LongitudActual, posicion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrar method, of class CambiaLongitud.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        int[] vector = null;
        int LongitudActual = 0;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.borrar(vector, LongitudActual, posicion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class CambiaLongitud.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        int[] vector = null;
        int LongitudActual = 0;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.insertar(vector, LongitudActual, posicion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of Visualizar method, of class CambiaLongitud.
     */
    @Test
    public void testVisualizar() {
        System.out.println("Visualizar");
        int[] vector = null;
        CambiaLongitud instance = new CambiaLongitud();
        int expResult = 0;
        int result = instance.Visualizar(vector);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class CambiaLongitud.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        CambiaLongitud instance = new CambiaLongitud();
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class CambiaLongitud.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int valor = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.setValor(valor);
        fail("The test case is a prototype.");
    }
    
}
