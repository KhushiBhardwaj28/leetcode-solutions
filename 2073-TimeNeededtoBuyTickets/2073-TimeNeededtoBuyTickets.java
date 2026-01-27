// Last updated: 27/1/2026, 5:00:46 pm
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int ans = 0;
4        int x = tickets[k];
5        for(int i = 0; i<=k; i++){
6            ans += Math.min(x, tickets[i]);
7        }
8        for(int i = k+1; i<tickets.length; i++){
9            ans+= Math.min(tickets[i],x-1);
10        }
11        return ans;
12
13    }
14}