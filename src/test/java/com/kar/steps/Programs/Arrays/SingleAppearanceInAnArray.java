package com.kar.steps.Programs.Arrays;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleAppearanceInAnArray {

    public int getSingleTimeNumberInArray(int[] arr) {

        Map<Integer, Long> numberCounts = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int singleNumber = numberCounts.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No single number found"));

        System.out.println("The number that appears only once is: " + singleNumber);
        return singleNumber;
    }

    public static int getSingleTimeNumberInArray1(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }
    public static int[] getSingleTimeNumbers(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            int count = map.getOrDefault(j, 0);
            map.put(j, count + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }


    @Test
    public void testSingleAppearanceInAnArray() {
        int arr[]  = {1,4,2,3,3,2};
        System.out.println(getSingleTimeNumberInArray(arr));

    }
    @Test
    public void testSingleAppearanceInAnArray1() {
        int arr[]  = {1,5,4,2,3,3,2};
//        System.out.println(getSingleTimeNumberInArray1(arr));
//        System.out.println(Arrays.toString(getSingleTimeNumbers(arr)));
        System.out.println(Arrays.toString(getSingleTimeNumbers1(arr)));

    }

    public static int[] getSingleTimeNumbers1(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                list.add(arr[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
