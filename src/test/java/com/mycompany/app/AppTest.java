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
}

