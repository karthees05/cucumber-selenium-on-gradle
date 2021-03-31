package com.kar.steps.Programs;

interface PI1 {
    // default method
    default void show() {
        System.out.println("Default PI1");
    }
}

interface PI2 {
    // Default method
    default void show() {
        System.out.println("Default PI2");
    }
}

public class MultipleInheritance implements PI1, PI2 {

    public void show() {
        PI1.super.show();
        PI2.super.show();
    }

    public static void main(String[] args) {
        MultipleInheritance d = new MultipleInheritance();
        d.show();
    }
}
