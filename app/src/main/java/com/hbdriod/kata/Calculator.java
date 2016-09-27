package com.hbdriod.kata;

import java.util.StringTokenizer;

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
            return sum;
        }
        StringTokenizer st = new StringTokenizer(numbers, ",");
        if (st.countTokens()==2) {
            sum = Integer.valueOf(st.nextElement().toString());
            sum += Integer.valueOf(st.nextElement().toString());
            return sum;
        }
        while (st.hasMoreElements()) {
          sum += Integer.valueOf(st.nextElement().toString());
        }
        return  sum;
    }
}
