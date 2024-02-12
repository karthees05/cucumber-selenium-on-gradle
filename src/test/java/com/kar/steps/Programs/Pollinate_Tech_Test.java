package com.kar.steps.Programs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;

public class Pollinate_Tech_Test {

    private final Logger logger = Logger.getLogger(Pollinate_Tech_Test.class.getName());

    public List<Integer> getSquareValues(List<Integer> numberList) {
        return numberList.stream().map(x -> x * x)
                .collect(Collectors.toList());
    }

    public List<Integer> getListOfNumbersDivisibleByGivenValue(List<Integer> numberList, int divider) {
        return numberList.stream().filter(i -> i % divider == 0).distinct().collect(Collectors.toList());
    }

    public List<Integer> getListOfAdjacentSumValues(List<Integer> numberList) {
        List<Integer> adjacentSumList = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            if (i == 0 && numberList.get(i) != null && numberList.get(i + 1) != null) {
                adjacentSumList.add(i, numberList.get(i) + numberList.get(i + 1));
            }
            if (i > 0 && i < numberList.size() - 1 && numberList.get(i) != null && numberList.get(i + 1) != null && numberList.get(i - 1) != null) {
                adjacentSumList.add(i, numberList.get(i) + numberList.get(i + 1) + numberList.get(i - 1));
            }
        }
        return adjacentSumList;
    }

    @Test
    public void testSquareValues() {
        List<Integer> originalList = Arrays.asList(3, 6, 7, 8, 9, 12, 15, 17, 359);
        List<Integer> originalSquare = Arrays.asList(9, 36, 49, 64, 81, 144, 225, 289, 128881);
        logger.info("List of each Square values from the given ORIGINAL list ::: " + getSquareValues(originalList));
        assertThat("Wrong square value is available in the list", getSquareValues(originalList).equals(originalSquare));
    }

    @Test
    public void testDivisibleByThree() {
        List<Integer> originalList = Arrays.asList(3, 6, 7, 8, 9, 12, 15, 17, 359);
        List<Integer> originalDivisibleByThree = Arrays.asList(3, 6, 9, 12, 15);
        logger.info("List of values divisible by 3 from the given ORIGINAL list ::: " + getListOfNumbersDivisibleByGivenValue(originalList, 3));
        assertThat("Wrong value is available in the divisible by 3 list", getListOfNumbersDivisibleByGivenValue(originalList, 3).equals(originalDivisibleByThree));
    }

    @Test
    public void testAdjacentSumValues() {
        List<Integer> originalList = Arrays.asList(3, 6, 7, 8, 9, 12, 15, 17, 359);
        List<Integer> originalDivisibleByThree = Arrays.asList(9, 16, 21, 24, 29, 36, 44, 391);
        logger.info("List of sum of adjacent integers values from the given ORIGINAL list ::: " + getListOfAdjacentSumValues(originalList));
        assertThat("Wrong sum of adjacent integers values are available in the list ", getListOfAdjacentSumValues(originalList).equals(originalDivisibleByThree));
    }
}
