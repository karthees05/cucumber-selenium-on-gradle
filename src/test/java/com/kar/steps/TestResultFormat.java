package com.kar.steps;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestResultFormat {

    public static Set<String> listFilesUsingJavaIO(String dir) {

        return Stream.of(Objects.requireNonNull(new File(dir).listFiles()))
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .filter(f -> f.endsWith(".txt"))
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        String folderName = "C:/Users/vijayarupha/Downloads/QA_SDET Home Challenge 2021/tm-challenge/";

        Set<String> listOfTestResultFiles = listFilesUsingJavaIO(folderName);

        List<String> listOfLines;


        for (String fileNames : listOfTestResultFiles) {
            System.out.println("------------------------------------------------------------------ ");
            System.out.println(("Executed Test File --> " + fileNames));
            listOfLines = listFileLines(folderName, fileNames);

            String fileNameWithoutExtension = getFileNameWithoutExtension(fileNames);


            String overAllScenarioStatus = checkOverAllScenarioStatus(listOfLines);
            System.out.println("------------------------------------------------------------------ ");
            System.out.println("The overall status of the Scenario -> " + fileNameWithoutExtension + " is ===> " + overAllScenarioStatus);
            System.out.println("------------------------------------------------------------------ ");

            System.out.println("The Passed Tests are ::: ");
            List<String> listOfPassedTestsStatus;
            System.out.println("---------------------------");
            String passText = "--- PASS";
            listOfPassedTestsStatus = getTestStatusForAScenario(passText, listOfLines);
            if (listOfPassedTestsStatus.size() > 0) {
                listOfPassedTestsStatus.forEach(value -> System.out.println(value + " "));
                listOfPassedTestsStatus.clear();
            } else {
                System.out.println("There is no Passed Tests are available");
            }

            System.out.println("The Failed Tests are ::: ");
            List<String> listOfFailedTestsStatus;
            System.out.println("---------------------------");
            String failText = "--- FAIL";
            listOfFailedTestsStatus = getTestStatusForAScenario(failText, listOfLines);
            if (listOfFailedTestsStatus.size() > 0) {
                listOfFailedTestsStatus.forEach(value -> System.out.println(value + " "));
                listOfFailedTestsStatus.clear();
            } else {
                System.out.println("There is no Failed Tests are available");
            }

            System.out.println("The Skipped Tests are ::: ");
            List<String> listOfSkippedTestsStatus;
            System.out.println("---------------------------");
            String skipText = "--- SKIP";
            listOfSkippedTestsStatus = getTestStatusForAScenario(skipText, listOfLines);
            if (listOfSkippedTestsStatus.size() > 0) {
                listOfSkippedTestsStatus.forEach(value -> System.out.println(value + " "));
                listOfSkippedTestsStatus.clear();
            } else {
                System.out.println("There is no Skipped Tests are available");
            }
            System.out.println("\n");
        }
    }

    private static List<String> getTestStatusForAScenario(String status, List<String> listOfLines) {
        List<String> testsStatus = new ArrayList<>();
        for (String lines : listOfLines) {
            if (lines.contains(status)) {
                String[] testLine = lines.split(": ");
                assert false;
                testsStatus.add(testLine[1]);
            }
        }
        return testsStatus;
    }

    private static String checkOverAllScenarioStatus(List<String> listOfLines) {
        String scenarioStatus = "";
        if (listOfLines.get(listOfLines.size() - 1).equals("PASS")) {
            scenarioStatus = "PASS";
        } else if (listOfLines.get(listOfLines.size() - 1).equals("FAIL")) {
            scenarioStatus = "FAIL";
        } else {
            scenarioStatus = "SKIPPED";
        }
        return scenarioStatus;
    }

    private static String getFileNameWithoutExtension(String fileNames) {
        String[] finaNameWithoutExtension = fileNames.split("\\.");
        return finaNameWithoutExtension[0];
    }

    private static List<String> listFileLines(String folderName, String fileNames) {
        List<String> filteredLines = null;
        try (Stream<String> lines = Files.lines(Paths.get(folderName + fileNames))) {
            filteredLines = lines
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filteredLines;
    }
}
