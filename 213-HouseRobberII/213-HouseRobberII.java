// Last updated: 3/12/2025, 6:41:04 pm
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int[] lis = new int[nums.length];
4        Arrays.fill(lis, 1);
5        for(int i = 1; i<lis.length; i++){
6            for(int j = i-1; j>=0; j--){
7                if(nums[j]<nums[i]){
8                    int l = lis[j];
9                    lis[i] = Math.max(lis[i],l+1);
10                }
11            }
12        }
13        int maxi = lis[0];
14        for(int i = 1; i<nums.length; i++){
15            maxi = Math.max(lis[i],maxi);
16        }
17        return maxi;
18    }
19}