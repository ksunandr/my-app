package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AppDiffblueTest {
  /**
   * Method under test: {@link App#ifYes(String)}
   */
  @Test
  void testIfYes() {
    // Arrange, Act and Assert
    assertFalse((new App()).ifYes("foo"));
    assertTrue((new App()).ifYes("Yes"));
  }
}
