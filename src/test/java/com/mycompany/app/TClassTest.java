package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TClassTest {
    /**
     * Method under test: {@link TClass#ifYes(String)}
     */
    @Test
    void testIfYes() {
        // Arrange, Act and Assert
        assertFalse((new TClass()).ifYes("foo"));
        assertTrue((new TClass()).ifYes("Yes"));
    }
}
