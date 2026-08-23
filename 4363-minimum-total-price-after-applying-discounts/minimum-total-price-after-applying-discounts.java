class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int n = prices.length;
        int m= discounts.length;
        double s=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        for(int i=0;i<n;i++){
            if((m-i-1)>=0){
                s+=(double) (prices[n-i-1]*(100-discounts[m-i-1])/100.00);
            }
            else{
                s+=(double)prices[n-i-1];
            }
        }
        return s;
    }
}