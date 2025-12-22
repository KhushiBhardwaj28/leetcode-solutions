// Last updated: 22/12/2025, 2:33:36 pm
1class Solution {
2    public String alphabetBoardPath(String target) {
3        StringBuilder sb = new StringBuilder();
4
5        int currR = 0, currC = 0;
6
7        for (char ch : target.toCharArray()) {
8            int targetR = (ch - 'a') / 5;
9            int targetC = (ch - 'a') % 5;
10            //up
11            while (currR > targetR) {
12                sb.append('U');
13                currR--;
14            }
15            //left
16            while (currC > targetC) {
17                sb.append('L');
18                currC--;
19            }
20            //down
21            while (currR < targetR) {
22                sb.append('D');
23                currR++;
24            }
25            //right
26            while (currC< targetC) {
27                sb.append('R');
28                currC++;
29            }
30            sb.append('!');
31        }
32
33        return sb.toString();
34    }
35}