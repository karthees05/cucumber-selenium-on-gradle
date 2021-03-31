package com.kar.steps.Programs;


import java.util.HashMap;
import java.util.Map;

public class GFG
{
    public static int maxNonIntersecting(int[] nums) {
        Map<Integer, Integer> indexes = new HashMap<>();
        int prev = 0;
        for (int i = 1; i < nums.length; i++) {
            int s = nums[i - 1] + nums[i];
            if (s == prev) {
                prev = Integer.MIN_VALUE;
                continue;
            }
            prev = s;
            indexes.put(s, indexes.getOrDefault(s, 0) + 1);
        }

        return indexes.values().stream().mapToInt(k -> k).max().getAsInt();
    }

    public static void main(String[] args) {

        int[] arr = { 10,1,3,1,2,2,1,0,4 };
//        int[] arr[] = { 5,3,1,3,2,3 };
        int ans = maxNonIntersecting(arr);
        System.out.println("Max Length :: " + ans);
    }
}