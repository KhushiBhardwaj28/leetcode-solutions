// Last updated: 16/1/2026, 11:05:55 am
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        for(int i = 0; i<n; i++){
5            while(nums[i]>=1 && nums[i]<=n && nums[nums[i]-1] != nums[i]){
6                int correctPos = nums[i]-1;
7                int temp = nums[i];
8                nums[i] = nums[correctPos];
9                nums[correctPos] = temp;
10            }
11        }
12        for(int i = 0; i<n; i++){
13            if(nums[i] != i+1){
14                return i+1;
15            }
16        }
17        return n+1;
18    }
19}