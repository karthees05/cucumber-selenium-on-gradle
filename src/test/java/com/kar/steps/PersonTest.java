//package com.kar.steps;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
//import org.junit.Test;
//
//public class PersonTest {
//
//    private Person person;
//
//    @Before
//    public void begin() {
//        person = new Person("Alan", "Turing", 2,5.3f);
//// The main class parameters are 'Person(String, String, int, float)' is defined but from this step we cannot be applied to '(String,String, double)'
//    }
//
//    @Test // Need to import the proper junit Test package org.junit.Test
//    public void testHeight() {
//        float height = person.getHeight();
//        Assert.assertEquals(height, 5.3f);
//    }
//
//    @Test // Need to import the proper junit Test package org.junit.Test
//    public void testGrow1() {
//        person.grow(0.1f);
//        float height = person.getHeight();
//        Assertions.assertEquals(height, 5.4f);
//    }
//
//    @Test // Need to import the proper junit Test package org.junit.Test
//    public void testGrow2() {
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            person.grow(2.1f);
//        });
//    }
//
//    public void testGrow3() { // Test annotation should be there to execute this test
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            person.grow(0.9f);
//        });
//    }
//
//    @Test // Need to import the proper junit Test package org.junit.Test
//    public void testEquals() {
//        Person person2 = new Person("Alan", "Turning", 2, 5.3f);
//        // 'person2' is not defined, we have to define Person person2 and then pass parameters
//        Assert.assertEquals(person, person2); // Define the 'person2' object and then use that in this assertion
//    }
//
//}
