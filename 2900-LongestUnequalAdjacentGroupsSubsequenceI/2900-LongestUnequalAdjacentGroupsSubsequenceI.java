// Last updated: 5/1/2026, 4:04:16 pm
1class Solution {
2    public int longestStrChain(String[] words) {
3        Arrays.sort(words, (a, b) -> a.length() - b.length());
4        Map<String, Integer> dp = new HashMap<>();
5        int maxLen = 1;
6        for (String word : words) {
7            int best = 1;
8            for (int i = 0; i < word.length(); i++) {
9                String prev = word.substring(0, i) + word.substring(i + 1);
10                if (dp.containsKey(prev)) {
11                    best = Math.max(best, dp.get(prev) + 1);
12                }
13            }
14            dp.put(word, best);
15            maxLen = Math.max(maxLen, best);
16        }
17        return maxLen;
18    }
19}