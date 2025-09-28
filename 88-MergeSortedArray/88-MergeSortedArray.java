// Last updated: 28/9/2025, 12:32:46 pm
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> hp = new PriorityQueue<>();
        for(int i = 0; i<nums.length; i++){
            hp.add(nums[i]);
            if(hp.size()>k){
                hp.poll();
            }
        }
        return hp.peek();
    }
}