// Last updated: 3/10/2025, 10:37:46 am
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));
        if(intervals.length == 0) return 0;
        int arr = 1;
        int arrPos = intervals[0][1];
        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0]>=arrPos){
                arr++;
                arrPos = intervals[i][1];
            }
        }
        return intervals.length-arr;
    }
}
    