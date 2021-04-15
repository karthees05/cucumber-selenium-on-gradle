package com.kar.steps.Programs;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzz {

    public void getFizzBuzz(int num){
        for (int i = 1; i <= num; i++)
        {
            if (((i % 5) == 0) && ((i % 7) == 0)) // Is it a multiple of 5 & 7?
                System.out.println("fizzbuzz - "+i);
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.println("fizz - "+i);
            else if ((i % 7) == 0) // Is it a multiple of 7?
                System.out.println("buzz - "+i);
            else
                System.out.println(i); // Not a multiple of 5 or 7
        }
    }
    @Test
    public void testFizzBuzz(){
//        assertThat("Reverse Success", reverseInteger(123) == 321);
        getFizzBuzz(50);

    }
}
