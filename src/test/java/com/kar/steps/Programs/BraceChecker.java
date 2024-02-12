package com.kar.steps.Programs;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Stack;

public class BraceChecker {

    public boolean isValid(String str) {
        if (str.charAt(0) == '{')
            return false;

        Stack<Character> stack = new Stack<Character>();

        char c;
        for(int i=0; i < str.length(); i++) {
            c = str.charAt(i);

            if(c == '(')
                stack.push(c);
            else if(c == '{')
                stack.push(c);
            else if(c == ')')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if(c == '}')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '{')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();

    }
    @Test
    public void braceTest_1(){
        assertThat(String.valueOf(true),isValid( "(){}[]"));
        System.out.println(isValid( "(){}[]"));
    }
    @Test
    public void braceTest_2(){
        assertThat(String.valueOf(false),isValid( "]]"));
        System.out.println(isValid( "(}"));
    }
    @Test
    public void braceTest_3(){
        assertThat(String.valueOf(false),isValid( "[(])"));
        System.out.println(isValid( "[(])"));
    }
    @Test
    public void braceTest_4(){
        assertThat(String.valueOf(true),isValid( "([{}])"));
        System.out.println(isValid( "([{}])"));
    }

}