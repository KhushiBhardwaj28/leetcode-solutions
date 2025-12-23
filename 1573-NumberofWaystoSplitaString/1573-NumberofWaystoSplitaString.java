// Last updated: 23/12/2025, 2:53:47 pm
1class Solution {
2    public String generateTag(String caption) {
3        String[] words = caption.trim().split("\\s+");
4        StringBuilder tag = new StringBuilder("#");
5        for (int i = 0; i < words.length; i++) {
6            String word = words[i].toLowerCase();
7            if (word.length() == 0) continue;
8            if (i == 0) {
9                tag.append(word);
10            } else {
11                tag.append(Character.toUpperCase(word.charAt(0)));
12                tag.append(word.substring(1));
13            }
14        }
15        StringBuilder cleanTag = new StringBuilder();
16        for (int i = 0; i < tag.length(); i++) {
17            char ch = tag.charAt(i);
18            if (ch == '#' || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
19                cleanTag.append(ch);
20            }
21        }
22        if (cleanTag.length() > 100) {
23            return cleanTag.substring(0, 100);
24        }
25
26        return cleanTag.toString();
27    }
28}
29