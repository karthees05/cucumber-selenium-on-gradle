package com.kar.steps.Programs;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
public class WeightSort {

    public static String orderWeight(String strng) {
        if(strng.equals(""))
            return "";

        String[] s = strng.split(" ");

        if(s.length == 1)
            return strng;

        // parallel arrays
        int[] tempArray =  new int[s.length];
        for(int i=0; i<s.length; i++) {
            try{
                tempArray[i] = Integer.parseInt(s[i]);
            }
            catch(NumberFormatException e){
                return strng;
            }
        }
        int[] weightArray = new int[tempArray.length];

        //find weight
        for(int i=0; i<tempArray.length; i++){
            int weight = 0;
            int temp = tempArray[i];
            while (temp > 0) {
                weight += temp % 10;
                temp = temp / 10;
            }

            weightArray[i] = weight;

        }

        //sort both arrays by increasing weight
        int n = weightArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++) {
                int compare =String.valueOf(tempArray[j]).compareTo(String.valueOf(tempArray[j+1]));

                if (weightArray[j] > weightArray[j+1] || (weightArray[j] == weightArray[j+1] && compare > 0))
                {
                    // swap temp and weightArray[i]
                    int temp = weightArray[j];
                    weightArray[j] = weightArray[j+1];
                    weightArray[j+1] = temp;

                    //swap temp2 and tempArray[i]
                    int temp2 = tempArray[j];
                    tempArray[j] = tempArray[j+1];
                    tempArray[j+1] = temp2;
                }
            }

        String result = "";
        for(int i=0; i<tempArray.length; i++){
            //System.out.println(tempArray[i]);
            result += tempArray[i];
            if(i!=tempArray.length-1){
                result += " ";
            }
        }
        return result;
    }

    @Test
    public void orderTest_1(){
        String expectedResult = "100 180 90 56 65 74 68 86 99";
        assertThat("",orderWeight( "56 65 74 100 99 68 86 180 90").equals(expectedResult));
        System.out.println(orderWeight( "56 65 74 100 99 68 86 180 90"));
    }
}