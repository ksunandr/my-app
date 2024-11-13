package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TClass2DiffblueTest {
  /**
   * Test {@link TClass2#ifYes(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes(String)}
   */
  @Test
  @DisplayName("Test ifYes(String); when 'foo'; then return 'false'")
  void testIfYes_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes("foo"));
  }

  /**
   * Test {@link TClass2#ifYes(String)}.
   * <ul>
   *   <li>When {@code Yes}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes(String)}
   */
  @Test
  @DisplayName("Test ifYes(String); when 'Yes'; then return 'true'")
  void testIfYes_whenYes_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes("Yes"));
  }

  /**
   * Test {@link TClass2#ifYes2(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes2(String)}
   */
  @Test
  @DisplayName("Test ifYes2(String); when 'foo'; then return 'false'")
  void testIfYes2_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes2("foo"));
  }

  /**
   * Test {@link TClass2#ifYes2(String)}.
   * <ul>
   *   <li>When {@code ifYes2}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes2(String)}
   */
  @Test
  @DisplayName("Test ifYes2(String); when 'ifYes2'; then return 'true'")
  void testIfYes2_whenIfYes2_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes2("ifYes2"));
  }

  /**
   * Test {@link TClass2#ifYes3(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes3(String)}
   */
  @Test
  @DisplayName("Test ifYes3(String); when 'foo'; then return 'false'")
  void testIfYes3_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes3("foo"));
  }

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
    assertTrue((new TClass2()).ifYes3("ifYes3"));
  }

  /**
   * Test {@link TClass2#ifYe4(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYe4(String)}
   */
  @Test
  @DisplayName("Test ifYe4(String); when 'foo'; then return 'false'")
  void testIfYe4_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYe4("foo"));
  }

  /**
   * Test {@link TClass2#ifYe4(String)}.
   * <ul>
   *   <li>When {@code ifYe4}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYe4(String)}
   */
  @Test
  @DisplayName("Test ifYe4(String); when 'ifYe4'; then return 'true'")
  void testIfYe4_whenIfYe4_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYe4("ifYe4"));
  }

  /**
   * Test {@link TClass2#ifYes5(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes5(String)}
   */
  @Test
  @DisplayName("Test ifYes5(String); when 'foo'; then return 'false'")
  void testIfYes5_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes5("foo"));
  }

  /**
   * Test {@link TClass2#ifYes5(String)}.
   * <ul>
   *   <li>When {@code ifYes5}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes5(String)}
   */
  @Test
  @DisplayName("Test ifYes5(String); when 'ifYes5'; then return 'true'")
  void testIfYes5_whenIfYes5_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes5("ifYes5"));
  }

  /**
   * Test {@link TClass2#ifYes6(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes6(String)}
   */
  @Test
  @DisplayName("Test ifYes6(String); when 'foo'; then return 'false'")
  void testIfYes6_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes6("foo"));
  }

  /**
   * Test {@link TClass2#ifYes6(String)}.
   * <ul>
   *   <li>When {@code ifYes6}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes6(String)}
   */
  @Test
  @DisplayName("Test ifYes6(String); when 'ifYes6'; then return 'true'")
  void testIfYes6_whenIfYes6_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes6("ifYes6"));
  }

  /**
   * Test {@link TClass2#ifYes7(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes7(String)}
   */
  @Test
  @DisplayName("Test ifYes7(String); when 'foo'; then return 'false'")
  void testIfYes7_whenFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes7("foo"));
  }

  /**
   * Test {@link TClass2#ifYes7(String)}.
   * <ul>
   *   <li>When {@code ifYes7}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes7(String)}
   */
  @Test
  @DisplayName("Test ifYes7(String); when 'ifYes7'; then return 'true'")
  void testIfYes7_whenIfYes7_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes7("ifYes7"));
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link TClass2}
   *   <li>{@link TClass2#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("com.mycompany.app.TClass2", (new TClass2()).toString());
  }
}
