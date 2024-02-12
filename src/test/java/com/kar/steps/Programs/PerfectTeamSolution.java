package com.kar.steps.Programs;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class PerfectTeamSolution {

    public static int perfectTeam(String skills) {
        Map<Character, Integer> skillCount = new HashMap<>();

        for (Character skill : skills.toCharArray()) {
            if (skillCount.containsKey(skill)) {
                skillCount.put(skill, skillCount.get(skill) + 1);
            } else {
                skillCount.put(skill, 1);
            }
        }

        // if there is no 5 skills, then no groups can be formed
        if (skillCount.size() < 5) return 0;

        int maxPossibleGroup = Integer.MAX_VALUE;

        for (int count : skillCount.values()) {

            if (count < maxPossibleGroup) {
                maxPossibleGroup = count;
            }
        }
        return maxPossibleGroup == Integer.MAX_VALUE ? 0 : maxPossibleGroup;

    }

    @Test
    public void test() {
        System.out.println(perfectTeam("pcmbzpcmbz"));
    }
}
