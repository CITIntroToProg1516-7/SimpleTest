/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.programming.simpletest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author cmneville
 */
public class MainTestTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    
    public MainTestTest() {
    }

    /**
     * Test of main method, of class MainTest.
     */
    @Before
    public void setStream(){
        System.setOut(new PrintStream(out));
    }
    
    @After
    public void cleanStream(){
        System.setOut(null);
    }
    
  
    
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainTest.main(args);
        assertEquals("hello world", out.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
