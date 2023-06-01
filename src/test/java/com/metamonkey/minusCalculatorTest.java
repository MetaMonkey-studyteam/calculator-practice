package com.metamonkey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class minusCalculatorTest {

    @DisplayName("10과 15를 넣었을 때 5라는 결과가 계산되는지 확인")
    @Test
    public void testMinusTwoNumbers() {

        //given
        int num1 = 30;
        int num2 = 10;

        //when
        MinusCalculator minusCalc = new MinusCalculator();

        int minusResult = minusCalc.minusTwoNumbers(num1, num2);

        //then (verify)
        Assertions.assertEquals(20, minusResult);
    }
}
