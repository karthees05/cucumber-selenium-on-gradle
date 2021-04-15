package com.kar.steps.Programs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Java Program to solve FizzBuzz problem * * @author WINDOWS 8 *
 */
public class FizzBuzzTest {
    /**
     * Java Method to solve FizzBuzz problem, which states that program * should print fizz if number is multiple of 3, * print buzz if number is multiple * of 5, and print fizzbuzz if number is multiple of both 3 and 5 * * @param number * @return
     */
    public static String fizzBuzz(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "fizzbuzz";
            } else {
                return "fizz";
            }
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }

    /**
     * An improved version of earlier solution, much cleaner than previous * version because we have tested for divisible by 3 and 5 first. * It avoid duplication also.
     */
    public static String fizzBuzz2(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("fizz", fizzBuzz(3));
        assertEquals("buzz", fizzBuzz(5));
        assertEquals("fizzbuzz", fizzBuzz(15));
        assertEquals("2", fizzBuzz(2));
    }

    @Test
    public void testFizzBuzzV2() {
        assertEquals("fizz", fizzBuzz2(3));
        assertEquals("buzz", fizzBuzz2(5));
        assertEquals("fizzbuzz", fizzBuzz2(15));
        assertEquals("2", fizzBuzz2(2));
    }
}
