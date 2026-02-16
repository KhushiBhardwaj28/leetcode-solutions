// Last updated: 16/2/2026, 3:46:03 pm
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List<List<Integer>> ans = new ArrayList<>();
19        List<Integer> curr = new ArrayList<>();
20        path(root, targetSum, ans, curr);
21        return ans;
22    }
23    public void path(TreeNode root, int target, List<List<Integer>> ans, List<Integer> curr){
24        
25        if(root == null){
26            return;
27        }
28        curr.add(root.val);
29        if(root.left == null && root.right == null && target == root.val){
30            ans.add(new ArrayList<>(curr));
31        }
32        path(root.left, target-root.val, ans, curr);
33        path(root.right, target-root.val, ans, curr);
34
35        curr.remove(curr.size()-1);
36    }
37}