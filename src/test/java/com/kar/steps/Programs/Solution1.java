package com.kar.steps.Programs;

import org.junit.Test;
import java.util.*;
import java.lang.*;
import java.io.*;

/*
An investor has saved some money and wants to invest in the stock market. There are a number of stocks to choose from, and they want to buy at most 1 share in any company. The total invested cannot exceed the funds available. A friend who is a stock market expert has predicted the values of each stock after 1 year. Determine the maximum profit that can be earned at the end of the year assuming the predictions come true.

Example:-
saving = 250
currentValue = [175, 133, 109, 210, 97]
futureValue = [200, 125, 128, 228, 133)

To maximize profits, the investor should buy stocks at indices 2 and 4 for an investment of 109 +97 = 206. At the end of the year the stocks are sold for 128 + 133 = 261, so total profit is 261 -206 = 55

Function Description
Complete the function selectStock in the editor below. The function should return an integer that denotes the maximum profit after one year.

selectStock has the following parameter(s):
int saving: amount available for investment
int currentValue[n]: the current stock values
int futureValue[n]: the values of the stocks after one year

Constraints
0<n<100
0<Savings<30000
0<= currrentValue[i], futureValuel[i]<=300


 */
public class Solution1 {

    static Integer[][] mem;

    public static int max_profit(int[] current_price, int[] profit, int fund, int index) {

        if (index == current_price.length || fund <= 0)
            return 0;

        if (mem[index][fund] != null)
            return mem[index][fund];

        int include = fund - current_price[index] >= 0 ? profit[index] + max_profit(current_price, profit, fund - current_price[index], index + 1) : Integer.MIN_VALUE;

        int exclude = max_profit(current_price, profit, fund, index + 1);

        mem[index][fund] = Math.max(include, exclude);

        return mem[index][fund];
    }

    public static int max_stock(int[] current_price, int[] future_price, int fund) {

        int n = current_price.length;

        int[] profit = new int[n];

        mem = new Integer[n][fund + 1];

        for (int i = 0; i < n; i++)
            profit[i] = future_price[i] - current_price[i];


        return max_profit(current_price, profit, fund, 0);

    }

    @Test
    public void test(){

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] current_price, future_price;
        current_price = new int[n];
        future_price = new int[n];

        for (int i = 0; i < n; i++)
            current_price[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            future_price[i] = sc.nextInt();

        int fund = sc.nextInt();

        System.out.println(max_stock(current_price, future_price, fund));
    }

}