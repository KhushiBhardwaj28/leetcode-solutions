// Last updated: 8/10/2025, 11:20:44 am
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return b.getValue() - a.getValue();
            }else{
                return a.getKey().compareTo(b.getKey());
            }
        });
        pq.addAll(map.entrySet());
        List<String> l = new ArrayList<>();
        for(int i = 0; i<k && !pq.isEmpty(); i++){
            l.add(pq.poll().getKey());
        }
        return l;
    }
}