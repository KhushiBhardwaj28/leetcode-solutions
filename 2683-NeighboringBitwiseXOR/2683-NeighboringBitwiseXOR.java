// Last updated: 21/1/2026, 11:36:04 am
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        int xor = 0;
4        for(int d: derived){
5            xor^= d;
6        }
7        return xor == 0;
8    }
9}