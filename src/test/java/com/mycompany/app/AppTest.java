package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest {
    /**
     * Method under test: {@link App#ifYes(String)}
     */
    @Test
    void testIfYes() {
        assertFalse((new App()).ifYes("foo"));
        assertTrue((new App()).ifYes("Yes"));
    }

    /**
     * Method under test: {@link App#ifYes1(String)}
     */
    @Test
    void testIfYes1() {
        assertFalse((new App()).ifYes1("foo"));
        assertTrue((new App()).ifYes1("Yes"));
    }

    /**
     * Method under test: {@link App#ifYes2(String)}
     */
    @Test
    void testIfYes2() {
        assertFalse((new App()).ifYes2("foo"));
        assertTrue((new App()).ifYes2("Yes"));
    }

    /**
     * Method under test: {@link App#ifYes3(String)}
     */
    @Test
    void testIfYes3() {
        assertFalse((new App()).ifYes3("foo"));
        assertTrue((new App()).ifYes3("Yes"));
    }

    /**
     * Method under test: {@link App#ifYes4(String)}
     */
    @Test
    void testIfYes4() {
        assertFalse((new App()).ifYes4("foo"));
        assertTrue((new App()).ifYes4("Yes"));
    }

    /**
     * Method under test: {@link App#ifYes5(String)}
     */
    @Test
    void testIfYes5() {
        assertFalse((new App()).ifYes5("foo"));
        assertTrue((new App()).ifYes5("Yes"));
    }

    /**
     * Method under test: {@link App#ifYes6(String)}
     */
    @Test
    void testIfYes6() {
        assertFalse((new App()).ifYes6("foo"));
        assertTrue((new App()).ifYes6("Yes"));
    }

    /**
     * Method under test: {@link App#ifYes7(String)}
     */
    @Test
    void testIfYes7() {
        assertFalse((new App()).ifYes7("foo"));
        assertTrue((new App()).ifYes7("Yes"));
    }
}

