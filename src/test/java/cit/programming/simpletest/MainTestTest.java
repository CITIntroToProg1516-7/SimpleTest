/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.programming.simpletest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cmneville
 */
public class MainTestTest {
    
    public MainTestTest() {
    }

    /**
     * Test of main method, of class MainTest.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainTest.main(args);
        assertEquals(1,1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
