package Day17;

public class StockProblem {

	public static void main(String[] args) {
		
//		    Best Time to Buy and Sell Stock
//		    Say you have an array for which the ith element is the price of a given stock on day i.
		//
//		    If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
		//
//		    Note that you cannot sell a stock before you buy one.
		//
//		            Example 1:
		//
//		    Input: [7,1,5,3,6,4]
//		    Output: 5
//		    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//		    Not 7-1 = 6, as selling price needs to be larger than buying price.
//		    Example 2:
		//
//		    Input: [7,6,4,3,1]
//		    Output: 0
//		    Explanation: In this case, no transaction is done, i.e. max profit = 0.

		
			
			int[] prices =new int [] {7,1,5,3,6,4};
			int buy=Integer.MAX_VALUE;
			int maxProfit=0;
			
			for(int p: prices) {
//				System.out.println(p);
				
				
				
				buy=Math.min(buy,p);
				maxProfit=Math.max(maxProfit, p-buy);
			}
	
				System.out.println(buy);
				System.out.println(maxProfit);
			
//			for(int p=0; p < prices.length; p++) {
//				
//				System.out.println(prices[p]);

		    }
	}


