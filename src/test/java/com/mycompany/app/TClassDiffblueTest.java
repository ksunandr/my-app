package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TClassDiffblueTest {
/**
     * Test {@link TClass#ifYes(String)}.
     * <ul>
     *   <li>When {@code foo}.</li>
     *   <li>Then return {@code false}.</li>
     * </ul>
     * <p>
     * Method under test: {@link TClass#ifYes(String)}
     */
    @Test
    @DisplayName("Test ifYes(String); when 'foo'; then return 'false'")
    @Tag("MaintainedByDiffblue")
    void testIfYes_whenFoo_thenReturnFalse() {
        // Arrange, Act and Assert
        assertFalse((new TClass()).ifYes("foo"));
    }

    /**
     * Test {@link TClass#ifYes(String)}.
     * <ul>
     *   <li>When {@code Yes}.</li>
     *   <li>Then return {@code true}.</li>
     * </ul>
     * <p>
     * Method under test: {@link TClass#ifYes(String)}
     */
    @Test
    @DisplayName("Test ifYes(String); when 'Yes'; then return 'true'")
    @Tag("MaintainedByDiffblue")
    void testIfYes_whenYes_thenReturnTrue() {
        // Arrange, Act and Assert
        assertTrue((new TClass()).ifYes("Yes"));
    }
}
