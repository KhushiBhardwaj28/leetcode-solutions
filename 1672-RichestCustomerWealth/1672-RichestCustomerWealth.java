// Last updated: 29/9/2025, 1:47:25 pm
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    idx = j;
                }
            }
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<matrix.length; j++){
                if(matrix[j][idx]>max){
                    max = matrix[j][idx];
                }
            }
            if(min == max){
                l.add(min);
            }

        }
        return l;
    }
    
}