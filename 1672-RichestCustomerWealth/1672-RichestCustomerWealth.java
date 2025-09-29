// Last updated: 29/9/2025, 1:18:34 pm
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for(int i = 0; i<accounts.length; i++){
            int wealth = 0;
            for(int j = 0; j<accounts[0].length; j++){
                wealth += accounts[i][j];
            }
            maxwealth = Math.max(maxwealth, wealth);
        }
        return maxwealth;
    }
}