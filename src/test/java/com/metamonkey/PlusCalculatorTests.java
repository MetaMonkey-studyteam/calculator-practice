package com.metamonkey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlusCalculatorTests {

    @DisplayName("10과 15를 더하면 25가 나오는지")
    @Test
    public void testSumTwoNumbers() {
        PlusCalculator plusCalc = new PlusCalculator();
        int plusResult = plusCalc.sumTwoNumbers(10, 15);
        Assertions.assertEquals(25, plusResult);


    }
}
