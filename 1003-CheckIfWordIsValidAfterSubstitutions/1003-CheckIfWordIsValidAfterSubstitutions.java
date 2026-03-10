// Last updated: 10/3/2026, 11:18:27 am
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left = 0;
4        int zero = 0;
5        int maxLen = 0;
6        for(int i = 0; i<nums.length; i++){
7            if(nums[i] == 0){
8                zero++;
9            }
10        
11            while(zero>k){
12                if(nums[left] == 0){
13                    zero--;
14                }
15                left++;
16            }
17            maxLen = Math.max(maxLen, i - left +1);
18        }
19        return maxLen;
20    }
21}