package com.kar.steps.Programs.Arrays;

public class SmallestIntegerFromAnArray {

    public int solution(int[] A) {
        int n = 0;
        while (contains(A, ++n)) ;
        return n;
    }

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SmallestIntegerFromAnArray s = new SmallestIntegerFromAnArray();
        int[] intArray = new int[]{1, 2, 6, 4, 1, 8};
        System.out.println(s.solution(intArray));
    }
}

