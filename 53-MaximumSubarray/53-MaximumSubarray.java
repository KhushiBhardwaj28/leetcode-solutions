// Last updated: 31/10/2025, 1:43:48 pm
import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        int n = p.length();
        int m = s.length();
        
        if (m < n) return result; // edge case
        
        int[] pFreq = new int[26];
        int[] sFreq = new int[26];
        for (int i = 0; i < n; i++) {
            pFreq[p.charAt(i) - 'a']++;
        }
        
        int i = 0;
        for (int j = 0; j < m; j++) {  
            sFreq[s.charAt(j) - 'a']++;
            
            // shrink window if size > n
            if (j - i + 1 > n) {
                sFreq[s.charAt(i) - 'a']--;
                i++;
            }
            // freq matches → record index
            if (j - i + 1 == n && Arrays.equals(pFreq, sFreq)) {
                result.add(i);
            }
        }
        
        return result;
    }
}