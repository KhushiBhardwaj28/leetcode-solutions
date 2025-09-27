// Last updated: 27/9/2025, 10:06:39 pm
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = nums.length;
        int[] ans = new int[l-k+1];
        if(k==1){
            return nums;
        }
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i = 0; i<k; i++){
            int n = nums[i];
            if(n>=max){
                idx = i;
                max = n;
            }
        }
        ans[0] = max;
        int end = 0;
        for(int i = 1; i<ans.length; i++){
            end = i+k-1;
            if(i<=idx){
                if(nums[end]>=max){
                    max = nums[end];
                    idx = end;
                }
            }else{
                if(nums[end]>=max-1){
                    max = nums[end];
                    idx = end;
                }else if(nums[i]>=max-1){
                    max = nums[i];
                    idx = i;
                }else{
                    max = Integer.MIN_VALUE;
                    for(int j = i; j<=end; j++){
                        if(nums[j]>=max){
                            max = nums[j];
                            idx = j;
                        }
                    }
                }
            }
            ans[i] = max;
        }
        return ans;
    }
}