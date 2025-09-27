// Last updated: 27/9/2025, 2:40:17 pm
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char ch=pq.poll();
            int fre=map.get(ch);
            while(fre-->0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}