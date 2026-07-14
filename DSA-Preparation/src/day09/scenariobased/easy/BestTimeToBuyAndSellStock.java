package day09.scenariobased.easy;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Update minimum buying price
            if (prices[i] < min) {
                min = prices[i];
            }
            // Calculate profit if sold today
            else {
                int profit = prices[i] - min;

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        // Directly initialized input
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit = " + result);
    }
}