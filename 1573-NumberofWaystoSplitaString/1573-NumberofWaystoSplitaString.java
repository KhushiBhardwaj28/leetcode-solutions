// Last updated: 23/12/2025, 3:00:23 pm
1class Solution {
2    public String arrangeWords(String text) {
3        String[] words = text.toLowerCase().split(" ");
4        List<String> list = Arrays.asList(words);
5        Collections.sort(list,(a,b)-> a.length() - b.length());
6        StringBuilder ans = new StringBuilder();
7        String one = list.get(0);
8        ans.append(Character.toUpperCase(one.charAt(0))).append(one.substring(1));
9
10        for(int i = 1; i<list.size(); i++){
11            ans.append(" ").append(list.get(i));
12        }
13        return ans.toString();
14    }
15}