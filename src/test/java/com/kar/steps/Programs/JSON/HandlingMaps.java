package com.kar.steps.Programs.JSON;


import java.util.HashMap;
import java.util.Map;

public class HandlingMaps {

    public static void main(String[] args) {
        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(1, "name1");
        newMap.put(2, "name2");
        newMap.put(3, "name3");

        for (Map.Entry<Integer, String> entry : newMap.entrySet()) {
            if (entry.getKey() == 1)
                System.out.println("Keys---" + entry.getKey() + "    Values ---" + entry.getValue());
        }
    }


}
