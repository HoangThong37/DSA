package _150_interview_leetcode.array_string;

import java.util.Map;

public class _121_Best_Time_to_Buy_and_Sell_Stock {

    // solution 2.
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrices = prices[0];
        int max = 0;

        for (int i = 1; i < n; i++) {
            if (minPrices > prices[i]) {
                minPrices = prices[i];
            } else {
                max = Math.max(max, prices[i] - minPrices);
            }

        }
        return max;
    }

/*    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int value = prices[j] - prices[i];
                if (value > max) {
                    max = value;
                }
            }
        }

        return max;
    }*/

    public static void main(String[] args) {
        int[] a = {7,6,4,3,1};
        int n = maxProfit(a);
    }
}



/*
Example 1:

        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        Example 2:

        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.

*/
