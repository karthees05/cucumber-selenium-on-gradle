package com.kar.steps.Programs.String;

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
        int digit = 0;
        while (input != 0) {
            digit = input % 10;
            reverse = reverse * 10 + digit;
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

    private static String reverse(String str) {
        if (str.length() == 0)
            return "";
        return str.charAt(str.length() - 1)
                + reverse(str.substring(0, str.length() - 1));
    }

    @Test
    public void reverseTest() {
        assertThat("Reverse Success", reverseInteger(123) == 321);
        assertThat("Reverse Success", reverseInteger(-123) == -321);
        assertThat("Reverse Success", reverseInteger(+123) == 321);

        assertThat("Reverse Success", reverseWordCharacters("test").equals("tset"));
        assertThat("Reverse Success", reverseWordCharacters1().equals("tset"));
        assertThat("Reverse Success", reverse("test").equals("tset"));

    }

    public static void main(String[] args) {
        String str = "Saket Saurav";
        char[] chars = str.toCharArray();  // converted to character array and printed in reverse order
        for (int i = chars.length - 1; i >=0; i--) {
            System.out.print(chars[i]);
        }
    }
}
