package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Class1Test {
    /**
     * Method under test: {@link Class1#ifYes(String)}
     */
    @Test
    void testIfYes() {
        assertFalse((new Class1()).ifYes("foo"));
        assertTrue((new Class1()).ifYes("Yes"));
    }

    /**
     * Method under test: {@link Class1#ifYes1(String)}
     */
    @Test
    void testIfYes1() {
        assertFalse((new Class1()).ifYes1("foo"));
        assertTrue((new Class1()).ifYes1("Yes"));
    }

    /**
     * Method under test: {@link Class1#ifYes2(String)}
     */
    @Test
    void testIfYes2() {
        assertFalse((new Class1()).ifYes2("foo"));
        assertTrue((new Class1()).ifYes2("Yes"));
    }

    /**
     * Method under test: {@link Class1#ifYes3(String)}
     */
    @Test
    void testIfYes3() {
        assertFalse((new Class1()).ifYes3("foo"));
        assertTrue((new Class1()).ifYes3("Yes"));
    }

    /**
     * Method under test: {@link Class1#ifYes4(String)}
     */
    @Test
    void testIfYes4() {
        assertFalse((new Class1()).ifYes4("foo"));
        assertTrue((new Class1()).ifYes4("Yes"));
    }

    /**
     * Method under test: {@link Class1#ifYes5(String)}
     */
    @Test
    void testIfYes5() {
        assertFalse((new Class1()).ifYes5("foo"));
        assertTrue((new Class1()).ifYes5("Yes"));
    }

    /**
     * Method under test: {@link Class1#ifYes6(String)}
     */
    @Test
    void testIfYes6() {
        assertFalse((new Class1()).ifYes6("foo"));
        assertTrue((new Class1()).ifYes6("Yes"));
    }

    /**
     * Method under test: {@link Class1#ifYes7(String)}
     */
    @Test
    void testIfYes7() {
        assertFalse((new Class1()).ifYes7("foo"));
        assertTrue((new Class1()).ifYes7("Yes"));
    }
}

