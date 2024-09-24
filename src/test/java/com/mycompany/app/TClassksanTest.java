package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TClassksanTest {

    @Test
    void testIfYes() {
        assertFalse((new TClass()).ifYes("foo"));
        assertTrue((new TClass()).ifYes("Yes"));
    }
}
