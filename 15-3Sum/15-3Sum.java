// Last updated: 15/1/2026, 10:54:01 pm
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i = 0; i<nums.length; i++){
6            if(i>0 && nums[i] == nums[i-1]){
7                continue;
8            }
9            int j = i+1;
10            int k = nums.length - 1;
11            while(j<k){
12                int sum = nums[i]+nums[j]+nums[k];
13                if(sum<0){
14                    j++;
15                }else if(sum>0){
16                    k--;
17                }else{
18                    List<Integer> temp = new ArrayList<>();
19                    temp.add(nums[i]);
20                    temp.add(nums[j]);
21                    temp.add(nums[k]);
22                    ans.add(temp);
23                    j++;
24                    k--;
25                    while(j<k && nums[j] == nums[j-1]){
26                        j++;
27                    }
28                    while(j<k && nums[k] == nums[k+1]){
29                        k--;
30                    }
31                }
32            }
33        }
34        return ans;
35    }
36}