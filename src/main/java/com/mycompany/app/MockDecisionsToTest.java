package com.mycompany.app;

import com.diffblue.cover.annotations.InTestsMock;
import com.diffblue.cover.annotations.MockDecision;
import java.util.Locale;

public class MockDecisionsToTest {

    /**
     * Validate that cover will mock Number class to generate a working test when annotated with
     * REQUIRED
     */
    @InTestsMock(value = Number.class, decision = MockDecision.REQUIRED)
    public static String mockRequiredExpectedToMock(Number number) {
        return String.valueOf(number.intValue());
    }

    /**
     * Validate that cover will mock Number class to generate a working test when annotated with
     * RECOMMENDED, even though it does not need to mock it to generate good coverage
     */
    @InTestsMock(value = Number.class)
    public static String mockRecommendedExpectedToMock(Number number) {
        return String.valueOf(number.intValue());
    }



}
