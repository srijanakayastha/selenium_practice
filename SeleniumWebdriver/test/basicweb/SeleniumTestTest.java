/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicweb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author srijana
 */
public class SeleniumTestTest {
    
    public SeleniumTestTest() {
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
     * Test of setUp method, of class SeleniumTest.
     */
    @Test
    public void testSetUp() throws Exception {
        System.out.println("setUp");
        SeleniumTest instance = new SeleniumTest();
        instance.setUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testSelenium method, of class SeleniumTest.
     */
    @Test
    public void testTestSelenium() throws Exception {
        System.out.println("testSelenium");
        SeleniumTest instance = new SeleniumTest();
        instance.testSelenium();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tearDown method, of class SeleniumTest.
     */
    @Test
    public void testTearDown() throws Exception {
        System.out.println("tearDown");
        SeleniumTest instance = new SeleniumTest();
        instance.tearDown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
