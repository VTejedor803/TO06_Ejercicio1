/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victor
 */
public class PuertaAnd2Test {
    
    public PuertaAnd2Test() {
    }

    /**
     * Test of equals method, of class PuertaAnd2.
     */
    @Test
    public void testEqualsTrue() {
        System.out.println("testEqualsTrue");
        PuertaAnd2 puertaAnd = new PuertaAnd2 (true);
        PuertaAnd2 instance = new PuertaAnd2(true);
        boolean expResult = true;
        boolean result = instance.equals(puertaAnd);
        assertEquals(expResult, result);
    }
    /**
     * Test of equals method, of class PuertaAnd2.
     */
    @Test
    public void testEqualsFalse() {
        System.out.println("testEqualsFalse");
        PuertaAnd2 puertaAnd = new PuertaAnd2 (true);
        PuertaAnd2 instance = new PuertaAnd2(false);
        boolean expResult = false;
        boolean result = instance.equals(puertaAnd);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSalida method, of class PuertaAnd2.
     */
    @Test
    public void testGetSalida00() {
        System.out.println("getSalida");
        PuertaAnd2 instance = new PuertaAnd2(false, false);
        boolean expResult = false;
        boolean result = instance.getSalida();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getSalida method, of class PuertaAnd2.
     */
    @Test
    public void testGetSalida01() {
        System.out.println("getSalida");
        PuertaAnd2 instance = new PuertaAnd2(false, true);
        boolean expResult = false;
        boolean result = instance.getSalida();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getSalida method, of class PuertaAnd2.
     */
    @Test
    public void testGetSalida10() {
        System.out.println("getSalida");
        PuertaAnd2 instance = new PuertaAnd2(true, false);
        boolean expResult = false;
        boolean result = instance.getSalida();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getSalida method, of class PuertaAnd2.
     */
    @Test
    public void testGetSalida11() {
        System.out.println("getSalida");
        PuertaAnd2 instance = new PuertaAnd2(true, true);
        boolean expResult = true;
        boolean result = instance.getSalida();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class PuertaAnd2.
     */
    @Test
    public void testToString() {
        System.out.println("toStringTest");
        PuertaAnd2 instance = new PuertaAnd2(false);
        String expResult = "A: false B: false";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
