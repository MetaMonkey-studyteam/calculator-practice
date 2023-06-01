package com.metamonkey;

public class MinusCalculator {
    public int minusTwoNumbers(int num1, int num2) {

        int result = num1 - num2;

        if(result < 0) {
            result = Math.abs(result);
        }
        return result;
    }
}
