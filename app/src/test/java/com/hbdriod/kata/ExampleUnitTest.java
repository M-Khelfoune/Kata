package com.hbdriod.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void test_string_null() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void test_string_one_number() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(13, calculator.add("13"));
    }

    @Test
    public void test_string_two_number() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(37, calculator.add("13,24"));
    }

    @Test
    public void test_string_many_number() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(55, calculator.add("8,10,13,24"));
    }

    @Test
    public void test_many_line_many_number() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add("1\n1,2"));
    }

}