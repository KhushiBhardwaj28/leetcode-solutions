// Last updated: 15/9/2025, 7:55:27 am
class Solution {
    public int splitArray(int[] nums, int k) {
        int lo = nums[0];
        int hi = 0;
        for(int i = 0; i<nums.length; i++){
            lo = Math.max(lo, nums[i]);
            hi += nums[i];
        }

        while(lo<= hi){
            int mid = (lo+hi)/2;
            int parts = countPart(nums, mid);

            if(parts>k){
                lo = mid+1;
            }
            else{
                hi = mid -1;
            }
        }
        return lo;
    }
    private int countPart(int[] a, int maxSum){
        int n = a.length;
        int parts = 1;
        long subarraySum = 0;

        for(int i = 0; i<n; i++){
            if(subarraySum + a[i] <= maxSum){
                subarraySum += a[i];

            }
            else{
                parts++;
                subarraySum = a[i];
            }
        }
        return parts;
    }
}