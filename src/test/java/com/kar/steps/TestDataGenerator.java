package com.kar.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestDataGenerator {

    public static void main(String[] args) {
        // Create an instance of your data model class
        DataModel dataModel = new DataModel();

        // Set the properties of the data model to random values
        setRandomValues(dataModel);

        // Print the generated data model
        System.out.println(dataModel.toString());
    }

    public static void setRandomValues(DataModel dataModel) {
        Random random = new Random();

        // Generate random values for each property of the data model
        dataModel.setProperty1(random.nextInt(100));
        dataModel.setProperty2(random.nextDouble());
        dataModel.setProperty3("Random String " + random.nextInt(100));

        List<Integer> property4List = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            property4List.add(random.nextInt(100));
        }
        dataModel.setProperty4(property4List);
    }

    // Your data model class
    static class DataModel {
        private int property1;
        private double property2;
        private String property3;
        private List<Integer> property4;

        // Getters and setters for the properties
        public int getProperty1() { return property1; }
        public void setProperty1(int property1) { this.property1 = property1; }
        public double getProperty2() { return property2; }
        public void setProperty2(double property2) { this.property2 = property2; }
        public String getProperty3() { return property3; }
        public void setProperty3(String property3) { this.property3 = property3; }
        public List<Integer> getProperty4() { return property4; }
        public void setProperty4(List<Integer> property4) { this.property4 = property4; }

        // Override the toString method to print the data model
        @Override
        public String toString() {
            return "DataModel{" +
                    "property1=" + property1 +
                    ", property2=" + property2 +
                    ", property3='" + property3 + '\'' +
                    ", property4=" + property4 +
                    '}';
        }
    }
}