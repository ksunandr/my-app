package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TClass2Test {
    /**
     * Method under test: {@link TClass2#ifYes3(String)}
     */
    @Test
    void testIfYes3() {
        // Arrange, Act and Assert
        assertFalse((new TClass2()).ifYes3("foo"));
        assertTrue((new TClass2()).ifYes3("ifYes3"));
    }
}
