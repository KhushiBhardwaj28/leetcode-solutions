// Last updated: 3/10/2025, 11:26:19 am
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int minBoat = 0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                
            }
            j--;
            minBoat++;
        }
        return minBoat;
    }
}