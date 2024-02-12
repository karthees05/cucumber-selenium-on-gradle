package com.kar.steps.Programs.String;

import java.util.Arrays;
import java.util.List;

public class StringArrayToArrayList {
    public static void main(String[] args) {

//        String of arrays to list
        String[] nums = {"One", "Two", "Three", "Four", "Five"};
        for (String i : nums) {
            System.out.println(i);
        }
        List<String> strList = Arrays.asList(nums);
        System.out.println(strList);

//      String of integer to List
        Integer[] numInt = {10, 20, 30, 40, 50};
        List<Integer> intList = Arrays.asList(numInt);
        System.out.println(intList);

//      List of integer to array of integer
        Integer[] arrayInt = new Integer[intList.size()];
        intList.toArray(arrayInt);
        for (int i : intList) {
            System.out.println(i);
        }

//      List of string to array of string
        String[] arrayStr = new String[strList.size()];
        strList.toArray(arrayStr);
        for (String s : strList) {
            System.out.println(s);
        }
    }
}
