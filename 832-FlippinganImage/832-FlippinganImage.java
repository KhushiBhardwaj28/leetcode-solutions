// Last updated: 29/9/2025, 1:12:03 pm
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0; i<n; i++){
            int k = 0;
            int l = image[0].length-1;
            while(k<=l){
                int t = image[i][l] ^ 1;
                image[i][l] = image[i][k] ^ 1;
                image[i][k] = t;
                k++;
                l--;
            }
        }
        return image;
    }
}