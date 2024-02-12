package com.kar.steps.Programs;

import org.junit.Test;

/*
An investor has saved some money and wants to invest in the stock market.
There are a number of stocks to choose from,
and they want to buy at most 1 share in any company.
The total invested cannot exceed the funds available.
A friend who is a stock market expert has predicted the values of each stock after 1 year.
Determine the maximum profit that can be earned at the end of the year assuming the predictions come true.

Example:-
saving = 250
currentValue = [175, 133, 109, 210, 97]
futureValue = [200, 125, 128, 228, 133)


saving - 30
arry size - 4
CV - {1,2,4,6}
FV-{4,5,3,5}


To maximize profits, the investor should buy stocks at indices 2 and 4 for an investment of 109 +97 = 206.
At the end of the year the stocks are sold for 128 + 133 = 261, so total profit is 261 -206 = 55
1+2=3
5+4=9
6

1+6=7
4+5=9
2

2+6=8
5+5=10
2

4+6
3+5

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


//saving - 30
//        arry size - 4
//        CV - {1,2,4,6}
//        FV-{4,5,3,5}

public class Solution2 {

    static Integer[][] mem;

    public static int max_profit(int[] current_price, int[] profit, int saving, int index) {
//        [1,2,4,6], [3,3,-1,-1], 27,2
        if (index == current_price.length || saving <= 0)
            return 0;
        if (mem[index][saving] != null)
            return mem[index][saving];
        int include = saving - current_price[index] >= 0 ? profit[index]
//                29-2>=0
                + max_profit(current_price, profit, saving - current_price[index], index + 1) : Integer.MIN_VALUE;
        int exclude = max_profit(current_price, profit, saving, index + 1);
        mem[index][saving] = Math.max(include, exclude);
        return mem[index][saving];
    }

    public static int max_stock(int[] current_price, int[] future_price, int saving) {
        int n = current_price.length;
        int[] profit = new int[n];
        mem = new Integer[n][saving + 1];
        for (int i = 0; i < n; i++)
            profit[i] = future_price[i] - current_price[i];
        return max_profit(current_price, profit, saving, 0);
    }

    @Test
    public void test() {
        int[] current_price = {175, 133, 109, 210, 97};
        int[] future_price = {200, 125, 128, 228, 133};
        int saving = 250;
        System.out.println(max_stock(current_price, future_price, saving));
    }

    @Test
    public void test1() {
        int[] current_price = {1, 2, 4, 6};
        int[] future_price = {4, 5, 3, 5};
        int saving = 30;
        System.out.println(max_stock(current_price, future_price, saving));
    }

    //saving - 30
//        arry size - 4
//        CV - {1,2,4,6}
//        FV-{4,5,3,5}

    /*public static void main(String[] args) throws Exception {
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
    }*/

}