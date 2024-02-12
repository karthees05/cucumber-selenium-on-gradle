// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import org.junit.Test;

class Solution1111 {
    public int solution(int[] A) {
        for (int k : A) {

            // Initialize count to 0
            int count = 0;

            for (int value : A) {

                // Count the frequency
                // of the element
                if (k == value) {
                    count++;
                }
            }

            // if the frequency of the
            // element is one
            if (count == 1) {
                return k;
            }
        }

        // if no element exist at most once
        return -1;
    }

    @Test
    public void test111() {
        int[] a = {2, 4, 5, 4, 2};
        System.out.println(solution(a));

    }
}
