package com.metamonkey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class RemainderTest
{
    private RemainderCalculator remaindercalc;
    @BeforeEach
    public void setup(){
        this.remaindercalc=new RemainderCalculator();
    }

    @DisplayName("나머지가 잘 나오는지 확인")
    @Test
    public void testRemainder(){
        int num1=20;
        int num2=15;

        int result = remaindercalc.calRemainder(num1,num2);
        Assertions.assertEquals(5,result);
    }

    @DisplayName("나머지가 0인경우 확인")
    @Test
    public void testZerocheck(){
        int num1=20;
        int num2=10;

        //int result=remaindercalc.calRemainder(num1,num2);
        //Assertions.assertEquals(0,result );
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> remaindercalc.calRemainder(num1,num2)
        );
    }
}