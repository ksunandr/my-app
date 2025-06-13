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
     *   <li>Given createDTOClass.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}
     */
    @Test
    @DisplayName("Test ifFullNameIsDiffy(DTOClass); given createDTOClass")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClassUnderTest.ifFullNameIsDiffy(DTOClass)"})
    void testIfFullNameIsDiffy_givenCreateDTOClass() {
        // Arrange
        ClassUnderTest classUnderTest = new ClassUnderTest();
        DTOClass dto = mock(DTOClass.class);
        when(dto.createDTOClass()).thenReturn(Factory.createDTOClass());

        // Act
        boolean actualIfFullNameIsDiffyResult = classUnderTest.ifFullNameIsDiffy(dto);

        // Assert
        verify(dto).createDTOClass();
        assertFalse(actualIfFullNameIsDiffyResult);
    }

    /**
     * Test {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}.
     * <ul>
     *   <li>Given {@link DTOClass} {@link DTOClass#getFullName()} return {@code diffy4}.</li>
     *   <li>Then calls {@link DTOClass#getFullName()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}
     */
    @Test
    @DisplayName("Test ifFullNameIsDiffy(DTOClass); given DTOClass getFullName() return 'diffy4'; then calls getFullName()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClassUnderTest.ifFullNameIsDiffy(DTOClass)"})
    void testIfFullNameIsDiffy_givenDTOClassGetFullNameReturnDiffy4_thenCallsGetFullName() {
        // Arrange
        ClassUnderTest classUnderTest = new ClassUnderTest();
        DTOClass dtoClass = mock(DTOClass.class);
        when(dtoClass.getFullName()).thenReturn("diffy4");
        DTOClass dto = mock(DTOClass.class);
        when(dto.createDTOClass()).thenReturn(dtoClass);

        // Act
        boolean actualIfFullNameIsDiffyResult = classUnderTest.ifFullNameIsDiffy(dto);

        // Assert
        verify(dto).createDTOClass();
        verify(dtoClass).getFullName();
        assertFalse(actualIfFullNameIsDiffyResult);
    }

    /**
     * Test {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}.
     * <ul>
     *   <li>Given {@link DTOClass} {@link DTOClass#getFullName()} return {@code diffy}.</li>
     *   <li>Then return {@code true}.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}
     */
    @Test
    @DisplayName("Test ifFullNameIsDiffy(DTOClass); given DTOClass getFullName() return 'diffy'; then return 'true'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClassUnderTest.ifFullNameIsDiffy(DTOClass)"})
    void testIfFullNameIsDiffy_givenDTOClassGetFullNameReturnDiffy_thenReturnTrue() {
        // Arrange
        ClassUnderTest classUnderTest = new ClassUnderTest();
        DTOClass dtoClass = mock(DTOClass.class);
        when(dtoClass.getFullName()).thenReturn("diffy");
        DTOClass dto = mock(DTOClass.class);
        when(dto.createDTOClass()).thenReturn(dtoClass);

        // Act
        boolean actualIfFullNameIsDiffyResult = classUnderTest.ifFullNameIsDiffy(dto);

        // Assert
        verify(dto).createDTOClass();
        verify(dtoClass).getFullName();
        assertTrue(actualIfFullNameIsDiffyResult);
    }

    /**
     * Test {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}.
     * <ul>
     *   <li>When createDTOClass.</li>
     *   <li>Then return {@code false}.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClassUnderTest#ifFullNameIsDiffy(DTOClass)}
     */
    @Test
    @DisplayName("Test ifFullNameIsDiffy(DTOClass); when createDTOClass; then return 'false'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClassUnderTest.ifFullNameIsDiffy(DTOClass)"})
    void testIfFullNameIsDiffy_whenCreateDTOClass_thenReturnFalse() {
        // Arrange
        ClassUnderTest classUnderTest = new ClassUnderTest();

        // Act and Assert
        assertFalse(classUnderTest.ifFullNameIsDiffy(Factory.createDTOClass()));
    }
}
