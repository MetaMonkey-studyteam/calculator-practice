package com.metamonkey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Multiply {
    private Multiply divideCalc;

    @BeforeEach
    public void Setup(){
        this.divideCalc = new Multiply();
    }
    //검증내용
    // 1. 10과 2를 나누면 5가 나오는지 확인
    // 2. 20과 3을 나누면 6이 나오는지 확인
    // 3. 나눌 수를 0으로 하면 illigalArgumentExcpetion 이 발생하는지 확인
    @Test
    @DisplayName("나눌 수가 0이면 예외 발생하는지 확인")
    public void testZeroArgument(){
        //given
        int num1 = 10;
        int num2 = 0;

        //when
        Assertions.assertThrows(IllegalArgumentException.class,()->divideCalc.MultiplyTwoNumbers(num1,num2));
        //then
    }

    private void MultiplyTwoNumbers(int num1, int num2) {
    }

}