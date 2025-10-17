// Last updated: 17/10/2025, 12:49:46 pm
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<nums2.length; i++){
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                nextGreater[st.pop()] = nums2[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nextGreater[st.pop()] = -1;
        }
        int[] ans = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    ans[i] = nextGreater[j];
                    break;
                }
            }
        }
        return ans;

    }
}