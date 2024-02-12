package com.kar.steps.Programs.Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class SmallestMissingInteger {
    public int solution(int[] A) {
        int n = 0;
        while (contains(A, ++n)) ;
        return n;
    }

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        SmallestMissingInteger s = new SmallestMissingInteger();
        int token1;
        Scanner inFile1 = new Scanner(new File("C:\\Users\\vijayarupha\\IdeaProjects\\cucumber-selenium-on-gradle\\src\\test\\java\\com\\kar\\steps\\myNumbers")).useDelimiter(",\\s*");
        List<Integer> temps = new ArrayList<Integer>();

        while (inFile1.hasNext()) {
            token1 = Integer.parseInt(inFile1.next());
            temps.add(token1);
        }
        inFile1.close();

        Integer[] tempsArray = temps.toArray(new Integer[0]);
        int[] intArray = Arrays.stream(tempsArray).mapToInt(Integer::intValue).toArray();
        System.out.println(s.solution(intArray));
    }
}

