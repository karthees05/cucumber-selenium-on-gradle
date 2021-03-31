package com.kar.steps.Programs;

public class StringToInt {

    public static void main(String[] args) {
        convert("123");
    }

    public static int myStringToInteger(String str) {
        int answer = 0, factor = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            answer += (str.charAt(i) - '0') * factor;
            factor *= 10;
        }
        return answer;
    }

    //    another way
//    Approach: The idea is to use the ASCII value of the digits from 0 to 9 start from 48 – 57.
//    Therefore, to change the numeric character to an integer subtract 48 from the ASCII value of the character will given the corresponding digit for the given character.
    public static void convert(String s) {

        int num = 0;
        for (int i = 0; i < s.length(); i++)
            num = num * 10 + ((int) s.charAt(i) - 48);
        System.out.print(num);
    }

}
