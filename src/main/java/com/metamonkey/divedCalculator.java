package com.metamonkey;

public class divedCalculator {
    public int diviTwoNum(int num1,int num2) {
        checkNum(num2);
        int result=num1/num2;
        resultZero(result);
        return result;
    }

    private static void resultZero(int result) {
        if(result ==0){
            throw  new IllegalArgumentException("몫이 0입니다");
        }
    }

    private static void checkNum(int num2) {
        if(num2 ==0){
            throw new IllegalArgumentException("나누는 수가 0이 되면 안됩니다");
        }
    }
}
