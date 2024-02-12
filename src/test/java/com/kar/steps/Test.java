package com.kar.steps;

public class Test {


    public static void main(String[] args) {
        System.out.println(transform("abbcbbb"));
    }
    public static String transform(String input) {
        return input.replaceAll("(?s)(.)\\1+", "$1");
    }
}
