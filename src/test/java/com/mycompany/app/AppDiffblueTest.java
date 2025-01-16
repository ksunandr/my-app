package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppDiffblueTest {
    /**
     * Test {@link App#ifYes(String)}.
     * <ul>
     *   <li>When {@code foo}.</li>
     *   <li>Then return {@code false}.</li>
     * </ul>
     * <p>
     * Method under test: {@link App#ifYes(String)}
     */
    @Test
    @DisplayName("Test ifYes(String); when 'foo'; then return 'false'")
    void testIfYes_whenFoo_thenReturnFalse() {
        // Arrange, Act and Assert
        assertFalse((new App()).ifYes("foo"));
    }

    /**
     * Test {@link App#ifYes(String)}.
     * <ul>
     *   <li>When {@code Yes}.</li>
     *   <li>Then return {@code true}.</li>
     * </ul>
     * <p>
     * Method under test: {@link App#ifYes(String)}
     */
    @Test
    @DisplayName("Test ifYes(String); when 'Yes'; then return 'true'")
    void testIfYes_whenYes_thenReturnTrue() {
        // Arrange, Act and Assert
        assertTrue((new App()).ifYes("Yes"));
    }
}
