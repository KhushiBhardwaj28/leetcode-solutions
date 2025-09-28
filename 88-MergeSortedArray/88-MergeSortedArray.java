// Last updated: 28/9/2025, 12:40:41 pm
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        long lo = 0;
        long hi = num/2;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            if(mid*mid == num){
                return true;
            }else if(mid*mid<num){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return false;
    }
}