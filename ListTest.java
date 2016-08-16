/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MacBookPro
 */
public class ListTest {
    
    public ListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of size method, of class List.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        List instance = new ListImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class List.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        List instance = new ListImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class List.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        List instance = new ListImpl();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class List.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        List instance = new ListImpl();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class List.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        List instance = new ListImpl();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class List.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class List.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class List.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class List.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class List.
     */
    @Test
    public void testRemove_GenericType() {
        System.out.println("remove");
        Object value = null;
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.remove(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class List.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object value = null;
        List instance = new ListImpl();
        instance.add(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class List.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class List.
     */
    @Test
    public void testGet_0args() {
        System.out.println("get");
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class List.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object value = null;
        List instance = new ListImpl();
        boolean expResult = false;
        boolean result = instance.contains(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class List.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object value = null;
        List instance = new ListImpl();
        int expResult = 0;
        int result = instance.indexOf(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastIndexOf method, of class List.
     */
    @Test
    public void testLastIndexOf() {
        System.out.println("lastIndexOf");
        Object value = null;
        List instance = new ListImpl();
        int expResult = 0;
        int result = instance.lastIndexOf(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class List.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int i = 0;
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class List.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int i = 0;
        Object o = null;
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.set(i, o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class List.
     */
    @Test
    public void testAdd_int_GenericType() {
        System.out.println("add");
        int i = 0;
        Object o = null;
        List instance = new ListImpl();
        instance.add(i, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class List.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int i = 0;
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.remove(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class List.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        List instance = new ListImpl();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ListImpl implements List {

        public int size() {
            return 0;
        }

        public boolean isEmpty() {
            return false;
        }

        public void clear() {
        }

        public void addFirst(E value) {
        }

        public void addLast(E value) {
        }

        public E getFirst() {
            return null;
        }

        public E getLast() {
            return null;
        }

        public E removeFirst() {
            return null;
        }

        public E removeLast() {
            return null;
        }

        public E remove(E value) {
            return null;
        }

        public void add(E value) {
        }

        public E remove() {
            return null;
        }

        public E get() {
            return null;
        }

        public boolean contains(E value) {
            return false;
        }

        public int indexOf(E value) {
            return 0;
        }

        public int lastIndexOf(E value) {
            return 0;
        }

        public E get(int i) {
            return null;
        }

        public E set(int i, E o) {
            return null;
        }

        public void add(int i, E o) {
        }

        public E remove(int i) {
            return null;
        }

        public Iterator<E> iterator() {
            return null;
        }
    }
    
}
