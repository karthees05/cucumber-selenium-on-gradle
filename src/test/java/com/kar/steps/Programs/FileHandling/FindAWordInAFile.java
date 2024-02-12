package com.kar.steps.Programs.FileHandling;


import org.junit.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAWordInAFile {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\vijayarupha\\IdeaProjects\\cucumber-selenium-on-gradle\\src\\test\\resources\\lines.txt";

        //read file into stream, try-with-resources
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {

            List<String> filteredLines = lines
                    .collect(Collectors.toList());

            boolean test = filteredLines.stream().anyMatch(s->s.contains("hold"));
            System.out.println(test);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
