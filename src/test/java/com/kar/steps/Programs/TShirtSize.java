package com.kar.steps.Programs;

import java.util.*;

public class TShirtSize {
    private static final Comparator<String> sizeComparator = new Comparator<String>() {

        private final Map<String, Integer> sizes = new HashMap<>();
        {
            int i = 0;
            for (String size : new String[]{"XS", "S", "M", "L", "XL", "XXL"}) {
                sizes.put(size, i++);
            }
        }

        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(sizes.get(o1), sizes.get(o2));
        }
    };

    public static void main(String[] args) {
        List<String> list = Arrays.asList("L", "M", "XL", "XS", "S", "XXL");
        System.out.println(list);
        list.sort(sizeComparator);
        System.out.println(list);
    }

}
