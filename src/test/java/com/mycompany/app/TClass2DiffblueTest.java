package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TClass2DiffblueTest {
  /**
   * Test {@link TClass2#ifYes(String)}.
   * <ul>
   *   <li>When {@code KSAN}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes(String)}
   */
  @Test
  @DisplayName("Test ifYes(String); when 'KSAN'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes(String)"})
  void testIfYes_whenKsan_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes("KSAN"));
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
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes(String)"})
  void testIfYes_whenYes_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes("Yes"));
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
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes2(String)"})
  void testIfYes2_whenIfYes2_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes2("ifYes2"));
  }

  /**
   * Test {@link TClass2#ifYes2(String)}.
   * <ul>
   *   <li>When {@code KSAN}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes2(String)}
   */
  @Test
  @DisplayName("Test ifYes2(String); when 'KSAN'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes2(String)"})
  void testIfYes2_whenKsan_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes2("KSAN"));
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
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes3(String)"})
  void testIfYes3_whenIfYes3_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes3("ifYes3"));
  }

  /**
   * Test {@link TClass2#ifYes3(String)}.
   * <ul>
   *   <li>When {@code KSAN}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes3(String)}
   */
  @Test
  @DisplayName("Test ifYes3(String); when 'KSAN'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes3(String)"})
  void testIfYes3_whenKsan_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes3("KSAN"));
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
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYe4(String)"})
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
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYe4(String)"})
  void testIfYe4_whenIfYe4_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYe4("ifYe4"));
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
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes5(String)"})
  void testIfYes5_whenIfYes5_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes5("ifYes5"));
  }

  /**
   * Test {@link TClass2#ifYes5(String)}.
   * <ul>
   *   <li>When {@code KSAN}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes5(String)}
   */
  @Test
  @DisplayName("Test ifYes5(String); when 'KSAN'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes5(String)"})
  void testIfYes5_whenKsan_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes5("KSAN"));
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
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes6(String)"})
  void testIfYes6_whenIfYes6_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes6("ifYes6"));
  }

  /**
   * Test {@link TClass2#ifYes6(String)}.
   * <ul>
   *   <li>When {@code KSAN}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes6(String)}
   */
  @Test
  @DisplayName("Test ifYes6(String); when 'KSAN'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes6(String)"})
  void testIfYes6_whenKsan_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes6("KSAN"));
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
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes7(String)"})
  void testIfYes7_whenIfYes7_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new TClass2()).ifYes7("ifYes7"));
  }

  /**
   * Test {@link TClass2#ifYes7(String)}.
   * <ul>
   *   <li>When {@code KSAN}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TClass2#ifYes7(String)}
   */
  @Test
  @DisplayName("Test ifYes7(String); when 'KSAN'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TClass2.ifYes7(String)"})
  void testIfYes7_whenKsan_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new TClass2()).ifYes7("KSAN"));
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
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TClass2.<init>()", "String TClass2.toString()"})
  void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("com.mycompany.app.TClass2", (new TClass2()).toString());
  }
}
