package com.kar.steps.JacksonYMLRead;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class AppConfig {
    public static void main(String[] args) throws IOException {


        // Loading the YAML file from the /resources folder
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource("test.yml")).getFile());

        // Instantiating a new ObjectMapper as a YAMLFactory
        ObjectMapper om = new ObjectMapper(new YAMLFactory());

        // Mapping the employee from the YAML file to the Employee class
        Employee employee = om.readValue(file, Employee.class);

        // Printing out the information
        System.out.println("Employee info " + employee.toString());

        // Access the first element of the list and print it as well
        System.out.println("Accessing first element: " + employee.getColleagues().get(0).toString());
    }
}
