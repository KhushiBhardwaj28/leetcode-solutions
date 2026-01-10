// Last updated: 10/1/2026, 9:22:04 pm
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> ans = new ArrayList<>();
4		List<String> ll = new ArrayList<>();
5		Partitioning(s,ll,ans);
6		return ans;
7    }
8    public static void Partitioning(String ques, List<String> ll, List<List<String>> ans) {
9		if(ques.length() == 0) {
10//			System.out.println(ans);
11			ans.add(new ArrayList<String>(ll));
12			return;
13		}
14		for(int cut = 1; cut<= ques.length(); cut++) {
15			String s = ques.substring(0,cut);
16			
17			if(isPalindromic(s)) {
18				ll.add(s);
19				Partitioning(ques.substring(cut),ll,ans);
20				ll.remove(ll.size()-1);
21			}
22			
23		}
24	}
25	public static boolean isPalindromic(String s) {
26		int i = 0;
27		int j = s.length()-1;
28		while(i<j) {
29			if(s.charAt(i)!=s.charAt(j)) {
30				return false;				
31			}
32			i++;
33			j--;
34		}
35		return true;
36	}
37}