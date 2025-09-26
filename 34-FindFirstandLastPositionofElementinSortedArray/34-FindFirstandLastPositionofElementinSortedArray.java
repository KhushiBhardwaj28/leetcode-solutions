// Last updated: 26/9/2025, 11:08:02 pm
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = first_occur(nums.length,target,nums);
        arr[1] = last_occur(nums.length,target,nums);
        return arr;
        
    }
    public int last_occur(int n, int key, int[] v){
        int start = 0;
        int end = n - 1;
        int res = -1;

        while (start <= end) {
          int mid = start + (end - start) / 2;
          if (v[mid] == key) {
            res = mid;
            start = mid + 1;

          } else if (key < v[mid]) {
            end = mid - 1;
          } else {
            start = mid + 1;
          }
        }
        return res;
    }
    public int first_occur(int n, int key, int[] v){
        int start = 0;
        int end = n - 1;
        int res = -1;

        while (start <= end) {
          int mid = start + (end - start) / 2;
          if (v[mid] == key) {
            res = mid;
            end = mid - 1;

          } else if (v[mid] < key) {
            start = mid+1;
          } else {
            end = mid-1;
          }
        }
        return res;
    }

}