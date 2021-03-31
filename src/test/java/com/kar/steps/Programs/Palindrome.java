package com.kar.steps.Programs;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class Palindrome {
    private String reverse(String input) {
        /*StringBuilder str = new StringBuilder(input);
        return str.reverse().toString();*/

        if (input.length() == 1) {
            return input;
        }
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

    private String revers(String s) {
        StringBuilder ss = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            ss.append(s.charAt(i));
        }
        return ss.toString();
    }

    @Test
    public void testPalindrome1() {
        assertThat("Result is Palindrome", revers("hello").equals("olleh"));
    }

    @Test
    public void testPalindrome() {
        assertThat("Result is Palindrome", reverse("hello").equals("olleh"));
    }

    //    number reverse
    @Test
    public void testIntegerPalindrome() {
        assertThat("Result is Palindrome", integerPalindrome(121));
    }

    int r, sum = 0, temp;

    public Boolean integerPalindrome(int n) {
        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
            return true;
        } else {
            System.out.println("not palindrome");
            return false;
        }
    }

}
