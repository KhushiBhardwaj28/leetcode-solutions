// Last updated: 1/10/2025, 10:39:45 am
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum = prices[0]+prices[1];
        if(money-sum>=0){
            return money-sum;
        }
        else{
            return money;
        }
    }
}