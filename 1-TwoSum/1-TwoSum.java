// Last updated: 9/10/2025, 8:23:18 pm
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            int complement = target - num;
            if(mp.containsKey(complement)){
                return new int[]{mp.get(complement), i};
            }
            mp.put(num, i);
        }
        return new int[]{-1,-1};
    }
}