package com.kar.steps.Programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestSentense {

        public static String solution(Scanner scan) {
            StringBuilder sentence = new StringBuilder();
            while (scan.hasNext()) {
                sentence.append(scan.next());
                if (sentence.toString().contains(".")) break;
            }
            return sentence.toString();

        }

    public static String getLongestSentence() throws FileNotFoundException {
        String longestSentence = "";
        String currentSentence = "";
        Scanner scan = new Scanner(new File("C:\\Users\\vijayarupha\\IdeaProjects\\cucumber-selenium-on-gradle\\src\\test\\java\\com\\kar\\steps\\test-input.txt"));
        while (scan.hasNext()) {
            currentSentence = String.valueOf(solution(scan));
            if (currentSentence.length() > longestSentence.length()) {
                longestSentence = currentSentence;
            }

        }
        scan.close();
        return longestSentence;
    }
    public static void main(String[] args) throws FileNotFoundException {
        getLongestSentence();
    }
}
