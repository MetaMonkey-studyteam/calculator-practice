package com.metamonkey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class divedtest {
    divedCalculator diviedC=new divedCalculator();
    @DisplayName("나누는 수가 0일떄")
    @Test
    public void num2Zero(){
        //given
        int num1=20;
        int num2=0;
        //when
        System.out.println(Assertions.assertThrows(
                IllegalArgumentException.class,()->diviedC.diviTwoNum(num1,num2)
        ));


        //then

    }
    @DisplayName("몫이 0일때")
    @Test
    public void resultZero(){
        //given
        int num1=20;
        int num2=30;
        //when
        Assertions.assertThrows(
                IllegalArgumentException.class,()->diviedC.diviTwoNum(num1,num2)
        );
//

        //then

//
    }
}
