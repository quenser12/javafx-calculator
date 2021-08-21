package com.tunguia.javafxcalculator;

public class Operator {

    public int calculate(int a, int b, String operator){
        if(operator.contentEquals("add")){
            return a + b;
        }else{
            return 0;
        }

    }

}
