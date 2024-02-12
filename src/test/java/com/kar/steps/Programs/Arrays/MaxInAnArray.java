package com.kar.steps.Programs.Arrays;

import org.junit.Test;

public class MaxInAnArray {
    @Test
    public void maxTest() {
        int[] a = {2, 5, 3, 7, 8, 10};
        System.out.println(findMaxInAnArray(a));
    }

    private int findMaxInAnArray(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
