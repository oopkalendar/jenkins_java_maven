package com.mycompany.jenkins_java_maven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of sum method, of class Calculator.
     */
    @org.junit.Test
    public void testSumPositive() {
        System.out.println("sum positive arguments");
        int a = 1;
        int b = 2;
        Calculator instance = new Calculator();
        int expResult = 3;
        int result = instance.sum(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testSumZero() {
        System.out.println("sum zero arguments");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.sum(a, b);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testSub() {
        System.out.println("subtract with positive arguments where the first argument is bigger than the second");
        int a = 10;
        int b = 2;
        Calculator instance = new Calculator();
        int expResult = 8;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);
    }

}
