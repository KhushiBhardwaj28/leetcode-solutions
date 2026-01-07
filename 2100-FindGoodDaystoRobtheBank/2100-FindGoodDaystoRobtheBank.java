// Last updated: 7/1/2026, 8:09:12 pm
1class Solution {
2    public List<Integer> goodDaysToRobBank(int[] security, int time) {
3        int n = security.length;
4        List<Integer> result = new ArrayList<>();
5
6        if (time == 0) {
7            for (int i = 0; i < n; i++) result.add(i);
8            return result;
9        }
10
11        int[] nonInc = new int[n];
12        int[] nonDec = new int[n];
13
14        //non increasing
15        for (int i = 1; i < n; i++) {
16            if (security[i] <= security[i - 1]) {
17                nonInc[i] = nonInc[i - 1] + 1;
18            }
19        }
20
21        //non decreasing
22        for (int i = n - 2; i >= 0; i--) {
23            if (security[i] <= security[i + 1]) {
24                nonDec[i] = nonDec[i + 1] + 1;
25            }
26        }
27
28        //good days
29        for (int i = time; i < n - time; i++) {
30            if (nonInc[i] >= time && nonDec[i] >= time) {
31                result.add(i);
32            }
33        }
34
35        return result;
36    }
37}