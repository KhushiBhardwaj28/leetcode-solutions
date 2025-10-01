// Last updated: 1/10/2025, 10:47:50 am
class Solution {
    public int buyChoco(int[] prices, int money) {
        // Arrays.sort(prices);
        // int sum = prices[0]+prices[1];
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int x: prices){
            if(x<min){
                secMin = min;
                min = x;
            }else if(secMin>x){
                secMin = x;
            }

        }
        if(min+secMin>money){
            return money;
        }
        return money-(min+secMin);
    }
}