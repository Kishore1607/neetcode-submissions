class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int value = 0;
        for(int i=0; i<prices.length-1; i++){
            System.out.println("low = " + low + " value = " + value);
            if(low >= prices[i+1]){
                System.out.println("Case 1");
                low=prices[i+1];
                System.out.println("low = " + low);
            }else{
                System.out.println("Case 2");
                int currentvalue = prices[i+1] - low;
                value = (currentvalue > value)? currentvalue : value;
                System.out.println("currentvalue = " + currentvalue + " value = " + value);
            }
        }
        return value;
    }
}
