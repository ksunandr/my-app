package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TClass2DiffblueTest {

    /**
     * Test {@link TClass2#ifYes3(String)}.
     * <ul>
     *   <li>When {@code ifYes3}.</li>
     *   <li>Then return {@code true}.</li>
     * </ul>
     * <p>
     * Method under test: {@link TClass2#ifYes3(String)}
     */
    @Test
    @DisplayName("Test ifYes3(String); when 'ifYes3'; then return 'true'")
    void testIfYes3_whenIfYes3_thenReturnTrue() {
        // Arrange, Act and Assert
        assertTrue((new TClass2()).ifYes3("ifYes"));
    }

}
