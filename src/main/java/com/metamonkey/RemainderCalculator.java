package com.metamonkey;

public class RemainderCalculator {
    public int calRemainder(int n1, int n2){
        CheckZero(n1, n2);
        return n1%n2;
    }

    private static void CheckZero(int n1, int n2) {
        if(n1 % n2 ==0){
            throw new IllegalArgumentException("나머지는 0이될 수 없습니다.");
        }
    }
}
