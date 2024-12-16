package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TClass2Test {

    /**
     * Method under test: {@link TClass#ifYes2(String)}
     */
    @Test
    void testIfYes2() {
        // Arrange, Act and Assert
        assertFalse((new TClass()).ifYes2("foo2"));
        assertTrue((new TClass()).ifYes2("No"));
    }
}