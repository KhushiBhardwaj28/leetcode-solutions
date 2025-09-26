// Last updated: 26/9/2025, 1:30:15 pm
class Solution {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch - '0' >= 0 && ch-'0'<=9){
                int num = ch-'0';
                if(num>max){
                    sec = max;
                    max = num;
                }
                else if(num>sec && num!=max){
                    sec = num;
                }

            }
        }
        if(sec == Integer.MIN_VALUE){
            return -1;
        }
        return sec;
    }
    
}