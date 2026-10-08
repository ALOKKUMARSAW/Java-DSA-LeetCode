# Best Time to Buy and Sell Stock

## 📌 Problem

Given an array `prices` where `prices[i]` represents the price of a stock on day `i`, find the maximum profit that can be achieved by choosing **one day to buy** and a **later day to sell**.

If no profit can be made, return `0`.

---

## 📝 Example 1

```text
Input:
prices = [7, 1, 5, 3, 6, 4]

Output:
5

Explanation
Buy the stock at price 1 and sell it at price 6.
Profit = 6 - 1 = 5

📝 Example 2
Input:
prices = [7, 6, 4, 3, 1]

Output:
0

Explanation
The stock price keeps decreasing, so no profitable transaction is possible.
Therefore, the answer is 0.
💡 Approach
We use a one-pass greedy approach.
Maintain two variables:
minPrice  → Minimum stock price seen so far
maxProfit → Maximum profit found so far

For every price:
1. Calculate the profit if we sell on the current day.
2. Update maxProfit.
3. Update minPrice if the current price is smaller.
Formula
profit = currentPrice - minPrice

☕ Java Implementation
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);

            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}

🔍 Dry Run
For:
prices = [7, 1, 5, 3, 6, 4]

Price	Minimum Price	Current Profit	Maximum Profit
7	7	-	0
1	1	-6	0
5	1	4	4
3	1	2	4
6	1	5	5
4	1	3	5


Final answer:
Maximum Profit = 5

⏱️ Complexity
Time Complexity
O(n)

We traverse the array only once.
Space Complexity
O(1)

Only two variables are used regardless of the input size.
🎯 Interview Explanation
"I use a greedy one-pass approach. I maintain the minimum price seen so far and calculate the profit by selling at the current price. For every element, I update the maximum profit and minimum price. This gives O(n) time complexity and O(1) space complexity."

📂 Project Structure
BestTimeToBuyAndSellStock/
│
├── BestTimeToBuyAndSellStock.java
└── README.md

🔗 LeetCode
Problem: Best Time to Buy and Sell Stock
LeetCode: #121
📚 Key Learning
- One-pass array traversal
- Greedy approach
- Tracking minimum value
- Maximum profit calculation
- Time complexity optimization
- Space complexity optimization
🏷️ Tags
Java DSA Arrays Greedy One Pass LeetCode Interview Preparation
```