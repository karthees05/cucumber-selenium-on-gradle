package com.kar.steps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class Person {

    public String firstName;
    public String lastName;
    int age;
    public float height;

    public Person(String firstName, String lastName, int age, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public int getHeight() {
        return (int) height;
    }

    public void grow(float height) {
        float newHeight = this.height + height;
        if (newHeight < 1 && newHeight > 6.0f) {
            throw new IllegalArgumentException("height");
        }
        height += height;
    }

    @Test // Need to import the proper junit Test package org.junit.Test
    public void testHeight() {
        float height = getHeight();
        Assert.assertEquals(height, 5.3f);
    }
}

class PersonTest {

    private Person person;

    @Before
    public void begin() {
        Person person = new Person("Alan", "Turing", 2, 5.3f);
    }


    @Test // Need to import the proper junit Test package org.junit.Test
    public void testHeight() {
        float height = person.getHeight();
        Assert.assertEquals(height, 5.3f);
    }

    @Test // Need to import the proper junit Test package org.junit.Test
    public void testGrow1() {
        person.grow(0.1f);
        float height = person.getHeight();
        Assert.assertEquals(height, 5.4f);
    }

    @Test // Need to import the proper junit Test package org.junit.Test
    public void testGrow2() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            person.grow(2.1f);
        });
    }

    public void testGrow3() { // Test annotation should be there to execute this test
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            person.grow(0.9f);
        });
    }

    @Test // Need to import the proper junit Test package org.junit.Test
    public void testEquals() {
        Person person2 = new Person("Alan", "Turning", 2, 5.3f);
        // 'person2' is not defined, we have to define Person person2 and then pass parameters
        Assert.assertEquals(person, person2); // Define the 'person2' object and then use that in this assertion
    }

}
