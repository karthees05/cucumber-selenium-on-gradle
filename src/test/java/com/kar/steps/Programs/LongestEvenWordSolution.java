package com.kar.steps.Programs;

import org.junit.Test;

import java.util.ArrayList;


public class LongestEvenWordSolution {

    public static String longestEvenWord(String sentence) {
        String words = "";
        String[] word = sentence.split(" ");
        ArrayList<String> evenWords = new ArrayList<>();
        for (String ev : word) {
            if (ev.length() % 2 == 0) {
                evenWords.add(ev);
            }
        }
        if (evenWords.isEmpty()) {
            words = "00";
        } else {
            for (String wd : evenWords) {
                if (words.length() < wd.length()) {
                    words = wd;
                }
            }
        }
        if (sentence == "") {
            words = "00";
        }
        return words;


    }

    @Test
    public void test() {
        System.out.println(longestEvenWord("Time to write"));
    }
}
