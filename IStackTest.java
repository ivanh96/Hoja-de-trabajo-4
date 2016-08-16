/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MacBookPro
 */
public class IStackTest {
    
    public IStackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of push method, of class IStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;
        IStack instance = new IStackImpl();
        instance.push(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class IStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        IStack instance = new IStackImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class IStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        IStack instance = new IStackImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class IStack.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        IStack instance = new IStackImpl();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class IStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        IStack instance = new IStackImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class IStack.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        IStack instance = new IStackImpl();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class IStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        IStack instance = new IStackImpl();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IStackImpl implements IStack {

        public void push(E element) {
        }

        public E pop() {
            return null;
        }

        public boolean isEmpty() {
            return false;
        }

        public E getLast() {
            return null;
        }

        public int size() {
            return 0;
        }

        public void clear() {
        }

        public E peek() {
            return null;
        }
    }
    
}
