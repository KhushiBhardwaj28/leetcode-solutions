// Last updated: 26/9/2025, 1:55:04 pm
class Solution {
    public void sortColors(int[] arr) {
        int lo = 0;
        int mid = 0; 
        int hi = arr.length-1;
        while(mid<=hi){
            if(arr[mid] == 0){
                swap(arr,lo,mid);
                lo++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,hi);
                hi--;
                
            }
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}