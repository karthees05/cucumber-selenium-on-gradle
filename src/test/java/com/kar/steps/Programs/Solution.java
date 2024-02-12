package com.kar.steps.Programs;

import org.junit.Test;

/*
There are two types of characters in a particular language:
special and normal. A character is special if its value is 1 and normal if its value is 0.
Given string s, return the longest substring of s that contains at most k normal characters.
Whether a character is normal is determined by a 26-digit bit string named charValue.
Each digit in charValue corresponds to a lowercase letter in the English alphabet.

Example:

s = 'abcde'

alphabet = abcdefghijklmnopqrstuvwxyz

charValue = 10101111111111111111111111

For clarity, the alphabet is aligned with charValue below:

alphabet = abcdefghijklmnopqrstuvwxyz

charValue = 10101111111111111111111111

The only normal characters in the language (according to charValue) are b and d.
The string s contains both of these characters.
For k = 2, the longest substring of s that contains at most k = 2
normal characters is 5 characters long, abcde,
so the return value is 5. If k = 1 instead,
then the possible substrings are ['b', 'd', 'ab', 'bc', 'cd', 'de', 'abc', 'cde'].
The longest substrings are 3 characters long, which would mean a return value of 3.


String s = "abcdxxxxef";
        int k = 4;
        String charValue = "00000011111111111111111111";
        alphabet = abcdefghijklmnopqrstuvwxyz
a, b, c, d,e, f,  , abcdf, abcd  ,



 */
public class Solution {


    public static int getSpecialSubstring(String str, int k, String charValue) {
        int len = str.length();
        if (len <= 0)
            return 0;
        int maxSubstringLen = 0;
        int windowStart = 0;
        int count = 0;
        for (int windowEnd = 0; windowEnd < len; windowEnd++) {
            int pos = str.charAt(windowEnd) - 'a';
            if (charValue.charAt(pos) == '0')
                count++;
            while (count > k && windowStart <= windowEnd) {
                pos = str.charAt(windowStart) - 'a';
                if (charValue.charAt(pos) == '0')
                    count--;
                windowStart++;
            }
            maxSubstringLen = Math.max(maxSubstringLen, windowEnd - windowStart + 1);
        }
        return maxSubstringLen;
    }

    @Test
    public void test1() {
        String s = "abcde";
        int k = 2;
        String charValue = "10101111111111111111111111";
        int result = getSpecialSubstring(s, k, charValue);
        System.out.println(result);
    }

    @Test
    public void test2() {
        String s = "abcde";
        int k = 1;
        String charValue = "10101111111111111111111111";
        int result = getSpecialSubstring(s, k, charValue);
        System.out.println(result);
    }

    @Test
    public void test3() {
        String s = "abcdxxxxef";
        int k = 4;
        String charValue = "00000011111111111111111111";
        int result = getSpecialSubstring(s, k, charValue);
        System.out.println(result);
    }
}

/*public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String s = bufferedReader.readLine();
        String s = "abcde";
//        String s = "giraffe";

//        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int k = 2;
//        String charValue = bufferedReader.readLine();
        String charValue = "10101111111111111111111111";

        int result = Result.getSpecialSubstring(s, k, charValue);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }*/
