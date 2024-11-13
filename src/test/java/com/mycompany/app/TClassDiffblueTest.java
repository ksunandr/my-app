package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
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
  void testIfYes_whenYes_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass()).ifYes("Yes"));
  }

  /**
   * Test {@link TClass#ifYes2(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYes2(String)}
   */
  @Test
  @DisplayName("Test ifYes2(String); when 'foo'; then return 'false'")
  void testIfYes2_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYes2("foo"));
  }

  /**
   * Test {@link TClass#ifYes2(String)}.
   * <ul>
   *   <li>When {@code ifYes2}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYes2(String)}
   */
  @Test
  @DisplayName("Test ifYes2(String); when 'ifYes2'; then return 'true'")
  void testIfYes2_whenIfYes2_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass()).ifYes2("ifYes2"));
  }

  /**
   * Test {@link TClass#ifYes3(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYes3(String)}
   */
  @Test
  @DisplayName("Test ifYes3(String); when 'foo'; then return 'false'")
  void testIfYes3_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYes3("foo"));
  }

  /**
   * Test {@link TClass#ifYes3(String)}.
   * <ul>
   *   <li>When {@code ifYes3}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYes3(String)}
   */
  @Test
  @DisplayName("Test ifYes3(String); when 'ifYes3'; then return 'true'")
  void testIfYes3_whenIfYes3_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass()).ifYes3("ifYes3"));
  }

  /**
   * Test {@link TClass#ifYe4(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYe4(String)}
   */
  @Test
  @DisplayName("Test ifYe4(String); when 'foo'; then return 'false'")
  void testIfYe4_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYe4("foo"));
  }

  /**
   * Test {@link TClass#ifYe4(String)}.
   * <ul>
   *   <li>When {@code ifYe4}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYe4(String)}
   */
  @Test
  @DisplayName("Test ifYe4(String); when 'ifYe4'; then return 'true'")
  void testIfYe4_whenIfYe4_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass()).ifYe4("ifYe4"));
  }

  /**
   * Test {@link TClass#ifYes5(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYes5(String)}
   */
  @Test
  @DisplayName("Test ifYes5(String); when 'foo'; then return 'false'")
  void testIfYes5_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYes5("foo"));
  }

  /**
   * Test {@link TClass#ifYes5(String)}.
   * <ul>
   *   <li>When {@code ifYes5}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYes5(String)}
   */
  @Test
  @DisplayName("Test ifYes5(String); when 'ifYes5'; then return 'true'")
  void testIfYes5_whenIfYes5_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass()).ifYes5("ifYes5"));
  }

  /**
   * Test {@link TClass#ifYes6(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYes6(String)}
   */
  @Test
  @DisplayName("Test ifYes6(String); when 'foo'; then return 'false'")
  void testIfYes6_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYes6("foo"));
  }

  /**
   * Test {@link TClass#ifYes6(String)}.
   * <ul>
   *   <li>When {@code ifYes6}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYes6(String)}
   */
  @Test
  @DisplayName("Test ifYes6(String); when 'ifYes6'; then return 'true'")
  void testIfYes6_whenIfYes6_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass()).ifYes6("ifYes6"));
  }

  /**
   * Test {@link TClass#ifYes7(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYes7(String)}
   */
  @Test
  @DisplayName("Test ifYes7(String); when 'foo'; then return 'false'")
  void testIfYes7_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYes7("foo"));
  }

  /**
   * Test {@link TClass#ifYes7(String)}.
   * <ul>
   *   <li>When {@code ifYes7}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass#ifYes7(String)}
   */
  @Test
  @DisplayName("Test ifYes7(String); when 'ifYes7'; then return 'true'")
  void testIfYes7_whenIfYes7_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass()).ifYes7("ifYes7"));
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link TClass}
   *   <li>{@link TClass#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("com.mycompany.app.TClass", (new TClass()).toString());
  }
}
