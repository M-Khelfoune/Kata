package com.hbdriod.kata;

import java.util.StringTokenizer;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class Calculator {

    public int add(String numbers) {
        int sum = 0;
        boolean exist_delimiter = false;

        if (numbers.length()>1){
            if ((numbers.charAt(0)=='/') && (numbers.charAt(1)=='/')){


//                    && (numbers.charAt(1))){
//                exist_delimeter = true;
            }
        }


        StringTokenizer sl = new StringTokenizer(numbers, "\n");
        while (sl.hasMoreElements()) {
            numbers = sl.nextElement().toString();
            if (!(numbers.length() == 0)) {
                if (numbers.indexOf(',') < 0) {
                    sum = Integer.valueOf(numbers);
                } else {
                    StringTokenizer st = new StringTokenizer(numbers, ",");
                    while (st.hasMoreElements()) {
                        sum += Integer.valueOf(st.nextElement().toString());
                    }
                }
            }
        }
        return sum;
    }
}
