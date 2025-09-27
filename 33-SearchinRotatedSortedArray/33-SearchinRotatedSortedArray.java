// Last updated: 27/9/2025, 2:57:16 pm
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        int lo = 1;
        int hi = max;
        int ans = 0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isPossible(piles, h, mid)){
                ans=mid;
                hi=mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] piles, int hr, int mid){
        int h=0;
        for(int i=0;i<piles.length; i++){
            h += (piles[i]+mid-1)/mid;
            if(h > hr){
                return false;
            }
        }
        return true;
    }
}