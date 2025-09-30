// Last updated: 30/9/2025, 11:21:46 am
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i =0;
        int  j  = 0;
        List<int[]> ll = new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i][0] == nums2[j][0]){
                int val = nums1[i][1] + nums2[j][1];
                int[] arr = new int[2];
                arr[0] = nums1[i][0];
                arr[1] = val;
                ll.add(arr);
                i++;
                j++;
            }else if(nums1[i][0]<nums2[j][0]){
                ll.add(nums1[i]);
                i++;
            }else{
                ll.add(nums2[j]);
                j++;
            }

        }
        while(i<n){
                ll.add(nums1[i]);
                i++;
        }
        while(j<m){
                ll.add(nums2[j]);
                j++;
        }
        int[][] ans = new int[ll.size()][2];
        for(int k = 0; k<ll.size(); k++){
            ans[k] = ll.get(k);
        }
        return ans;
    }
}