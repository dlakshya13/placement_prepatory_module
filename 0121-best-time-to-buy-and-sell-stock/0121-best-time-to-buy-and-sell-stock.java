class Solution {
    public int maxProfit(int[] prices) {
        
         
        int max = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
         int min = prices[0];
        for(int i =0; i<prices.length; i++)
        {
            max = Math.max(prices[i], max);
            if(prices[i]-min>ans)
            ans = prices[i]-min;
            min=Math.min(min,prices[i]);
        }
        
        return ans;
    }
}