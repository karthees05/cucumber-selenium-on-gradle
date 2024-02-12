package com.kar.steps.Programs.GetterSetter;

import org.junit.Test;

public class CallForSetNumber {
    public int callSetter(int num) {
        GetValue getValue = new GetValue();
        getValue.setNumber(num);
        return getValue.getNumber();
    }

    @Test
    public void test1() {
        System.out.println(callSetter(20));

    }
}
