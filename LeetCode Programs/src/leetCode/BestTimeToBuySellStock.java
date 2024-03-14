package leetCode;

public class BestTimeToBuySellStock {

	public static void main(String[] args) {
		
		int prices[] = {7,1,5,3,6,4};
		
		int prof = maxProfit(prices);
		System.out.println(prof);

	}
	
public static int maxProfit(int[] prices) {
        
        int minValue = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            minValue = Math.min(minValue, prices[i]);
            profit = Math.max(profit, prices[i] - minValue);
        }
        
        return profit;
    }

}
