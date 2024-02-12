package com.kar.steps.Programs.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MinimumInAnArray {

    @Test
    public void minimumValueTest() {
        int[] a = {2, 1, 1, 4, 3, 6, 8};
        Assert.assertEquals(1, findMinValFromAnArray(a));
//        System.out.println(findMinValFromAnArray(a));
    }

    private int findMinValFromAnArray(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
