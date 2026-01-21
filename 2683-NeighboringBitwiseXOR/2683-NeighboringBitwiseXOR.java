// Last updated: 21/1/2026, 12:14:12 pm
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1 = 0, xor2 = 0;
4        for(int x: arr1){
5            xor1^=x;
6        }
7        for(int x: arr2){
8            xor2^=x;
9        }
10        return xor1 & xor2;
11        
12    }
13}