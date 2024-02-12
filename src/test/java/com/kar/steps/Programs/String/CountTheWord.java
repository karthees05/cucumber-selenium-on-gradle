package com.kar.steps.Programs.String;

import java.util.HashMap;
import java.util.Map;

public class CountTheWord {
    public static void main(String[] args) {
        String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String s : split) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}
