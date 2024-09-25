package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TClassksanTest2 {

    @Test
    void testIfYes() {
        assertFalse((new TClass()).ifYes7("foo"));
        assertTrue((new TClass()).ifYes7("ifYes7"));
    }
}
