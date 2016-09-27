package com.hbdriod.kata;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class Calculator {

    public int add(String numbers){
        int sum = 0;
        if (numbers.length()==0){
            return 0;
        }
        if (numbers.indexOf(',')<0){
            sum = Integer.valueOf(numbers);

        }
        return  sum;
    }
}
