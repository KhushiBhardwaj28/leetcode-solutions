// Last updated: 27/9/2025, 2:23:55 pm
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        ArrayList<Map.Entry<Character, Integer>> ll = new ArrayList<>(map.entrySet());
        ll.sort((a,b)->b.getValue() - a.getValue());
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<ll.size(); i++){
            char ch = ll.get(i).getKey();
            int freq = ll.get(i).getValue();
            while(freq-->0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

   
}