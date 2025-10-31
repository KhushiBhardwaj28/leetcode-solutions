// Last updated: 31/10/2025, 1:45:38 pm
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] s1_fre=new int[26];
        int[] s2_fre=new int[26];
        for(int i=0;i<n;i++){
            s1_fre[s1.charAt(i)-'a']++;
        }
        int i=0;
        int j=0;
        while(j<m){
            s2_fre[s2.charAt(j)-'a']++;

            while((j-i+1)>n){ //shrink the window 
                s2_fre[s2.charAt(i)-'a']--;
                i++;
            }
             // Check if the current window's frequency matches s1's frequency
            if (Arrays.equals(s1_fre, s2_fre)) {
                return true;
            }
            j++;

        }
        return false;
    }
}