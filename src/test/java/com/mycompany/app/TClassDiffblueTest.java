package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TClassDiffblueTest {
  /**
   * Method under test: {@link TClass#ifYes(String)}
   */
  @Test
  void testIfYes() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYes("foo"));
    assertTrue((new TClass()).ifYes("Yes"));
  }

  /**
   * Method under test: {@link TClass#ifYes2(String)}
   */
  @Test
  void testIfYes2() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYes2("foo"));
    assertTrue((new TClass()).ifYes2("ifYes2"));
  }

  /**
   * Method under test: {@link TClass#ifYes3(String)}
   */
  @Test
  void testIfYes3() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYes3("foo"));
    assertTrue((new TClass()).ifYes3("ifYes3"));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link TClass}
   *   <li>{@link TClass#toString()}
   * </ul>
   */
  @Test
  void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("com.mycompany.app.TClass", (new TClass()).toString());
  }

  /**
   * Method under test: {@link TClass#ifYe4(String)}
   */
  @Test
  void testIfYe4() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYe4("foo"));
    assertTrue((new TClass()).ifYe4("ifYe4"));
  }

  /**
   * Method under test: {@link TClass#ifYes5(String)}
   */
  @Test
  void testIfYes5() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYes5("foo"));
    assertTrue((new TClass()).ifYes5("ifYes5"));
  }

  /**
   * Method under test: {@link TClass#ifYes6(String)}
   */
  @Test
  void testIfYes6() {
    // Arrange, Act and Assert
    assertFalse((new TClass()).ifYes6("foo"));
    assertTrue((new TClass()).ifYes6("ifYes6"));
  }
}
