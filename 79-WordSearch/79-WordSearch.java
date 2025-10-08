// Last updated: 8/10/2025, 11:44:11 am
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> fre=new HashMap<>();
        int maxfre=0,j=0,res=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre.put(ch,fre.getOrDefault(ch,0)+1);
            maxfre=Math.max(maxfre,fre.get(ch));

            while((i-j+1)-maxfre>k){
                char c=s.charAt(j);
                fre.put(c,fre.get(c)-1);
                j++;
            }
            res=Math.max(res,i-j+1);
        }
        return res;
    }
}