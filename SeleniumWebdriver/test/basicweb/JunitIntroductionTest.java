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
public class JunitIntroductionTest {
    
    public JunitIntroductionTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpBeforeClass method, of class JunitIntroduction.
     */
    @Test
    public void testSetUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
        JunitIntroduction.setUpBeforeClass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tearDownAfterClass method, of class JunitIntroduction.
     */
    @Test
    public void testTearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass");
        JunitIntroduction.tearDownAfterClass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUp method, of class JunitIntroduction.
     */
    @Test
    public void testSetUp() throws Exception {
        System.out.println("setUp");
        JunitIntroduction instance = new JunitIntroduction();
        instance.setUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tearDown method, of class JunitIntroduction.
     */
    @Test
    public void testTearDown() throws Exception {
        System.out.println("tearDown");
        JunitIntroduction instance = new JunitIntroduction();
        instance.tearDown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of test1 method, of class JunitIntroduction.
     */
    @Test
    public void testTest1() {
        System.out.println("test1");
        JunitIntroduction instance = new JunitIntroduction();
        instance.test1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of test2 method, of class JunitIntroduction.
     */
    @Test
    public void testTest2() {
        System.out.println("test2");
        JunitIntroduction instance = new JunitIntroduction();
        instance.test2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
