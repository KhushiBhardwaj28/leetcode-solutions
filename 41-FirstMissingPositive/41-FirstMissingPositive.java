// Last updated: 26/9/2025, 2:10:11 pm
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            if(x>0){
                set.add(x);
            }
        }
        int i = 1;
        while(true){
            if(!set.contains(i)){
                return i;
            }
            i++; 
        }
    }
}