// Last updated: 16/1/2026, 11:48:41 am
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int m = nums1.length;
4        int n = nums2.length;
5        int i = m-1;
6        int j = n-1;
7        int[] nums3 = new int[m+n];
8        int k = m+n-1;
9        while(i>=0 && j>=0){
10            if(nums1[i] <= nums2[j]){
11                nums3[k] = nums2[j];
12                k--;
13                j--; 
14            }
15            else{
16                nums3[k] = nums1[i];
17                k--;
18                i--;
19            }
20        }
21        while(j>=0){
22            nums3[k] = nums2[j];
23            k--;
24            j--;  
25        }
26        while(i>=0){
27            nums3[k] = nums1[i];
28            k--;
29            i--;  
30        }
31        int len = nums3.length;
32        if(len%2 == 0){
33            return ((nums3[(len/2)]+ nums3[(len)/2-1])/2.00);
34        }else{
35            return nums3[len/2];
36        }
37
38    }
39}