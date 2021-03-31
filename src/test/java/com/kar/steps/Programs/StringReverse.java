package com.kar.steps.Programs;

import org.junit.Test;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;

public class StringReverse {
    /*public static void main(String[] args) {
        System.out.println(reverseInteger(123));

    }*/

    private static int reverseInteger(int input) {
        int reverse = 0;
        while (input != 0) {
            reverse = reverse * 10 + input % 10;
            input = input / 10;
        }
        return reverse;
    }

    private static String reverseWordCharacters1() {
        StringBuilder strb = new StringBuilder("test");
        return String.valueOf(strb.reverse());
    }

    public static String reverseWordCharacters(String str) {
        return Pattern.compile(" +").splitAsStream(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

    @Test
    public void reverseTest() {
        assertThat("Reverse Success", reverseInteger(123) == 321);
        assertThat("Reverse Success", reverseInteger(-123) == -321);
        assertThat("Reverse Success", reverseInteger(+123) == 321);

        assertThat("Reverse Success", reverseWordCharacters("test").equals("tset"));
        assertThat("Reverse Success", reverseWordCharacters1().equals("tset"));

    }
}
