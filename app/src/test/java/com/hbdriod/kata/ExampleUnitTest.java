package com.hbdriod.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Calculator calculator = new Calculator();
        //assertEquals(0, calculator.add(""));
//        assertEquals(13, calculator.add("13"));
        assertEquals(37, calculator.add("13,24"));
    }
}