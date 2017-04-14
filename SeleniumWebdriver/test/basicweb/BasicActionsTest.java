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
public class BasicActionsTest {
    
    public BasicActionsTest() {
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
     * Test of setUp method, of class BasicActions.
     */
    @Test
    public void testSetUp() throws Exception {
        System.out.println("setUp");
        BasicActions instance = new BasicActions();
        instance.setUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of test method, of class BasicActions.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        BasicActions instance = new BasicActions();
        instance.test();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tearDown method, of class BasicActions.
     */
    @Test
    public void testTearDown() throws Exception {
        System.out.println("tearDown");
        BasicActions instance = new BasicActions();
        instance.tearDown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
