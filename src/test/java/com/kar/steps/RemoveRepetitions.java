package com.kar.steps;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepetitions {
    public static String transform(String input) {
        char[] chars = input.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(RemoveRepetitions.transform("abbcbbb"));
    }
}

