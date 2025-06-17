package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ClassUnderTestDiffblueTest {
    /**
     * Test {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}.
     * <ul>
     *   <li>Given {@code diffy}.</li>
     *   <li>Then return {@code true}.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}
     */
    @Test
    @DisplayName("Test ifFullNameIsDiffy(DTOClass); given 'diffy'; then return 'true'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClassUnderTest.ifFullNameIsDiffy(DTOClass)"})
    void testIfFullNameIsDiffy_givenDiffy_thenReturnTrue() {
        // Arrange
        ClassUnderTest classUnderTest = new ClassUnderTest();
        DTOClass dto = mock(DTOClass.class);
        when(dto.getFullName()).thenReturn("diffy");

        // Act
        boolean actualIfFullNameIsDiffyResult = classUnderTest.ifFullNameIsDiffy(dto);

        // Assert
        verify(dto).getFullName();
        assertTrue(actualIfFullNameIsDiffyResult);
    }

    /**
     * Test {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}.
     * <ul>
     *   <li>Given {@code FORBIDDENdiffy}.</li>
     *   <li>Then return {@code false}.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}
     */
    @Test
    @DisplayName("Test ifFullNameIsDiffy(DTOClass); given 'FORBIDDENdiffy'; then return 'false'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClassUnderTest.ifFullNameIsDiffy(DTOClass)"})
    void testIfFullNameIsDiffy_givenFORBIDDENdiffy_thenReturnFalse() {
        // Arrange
        ClassUnderTest classUnderTest = new ClassUnderTest();
        DTOClass dto = mock(DTOClass.class);
        when(dto.getFullName()).thenReturn("FORBIDDENdiffy");

        // Act
        boolean actualIfFullNameIsDiffyResult = classUnderTest.ifFullNameIsDiffy(dto);

        // Assert
        verify(dto).getFullName();
        assertFalse(actualIfFullNameIsDiffyResult);
    }
}
