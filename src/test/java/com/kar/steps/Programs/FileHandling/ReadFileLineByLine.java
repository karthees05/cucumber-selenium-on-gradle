package com.kar.steps.Programs.FileHandling;


import org.junit.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\vijayarupha\\IdeaProjects\\cucumber-selenium-on-gradle\\src\\test\\resources\\lines.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
