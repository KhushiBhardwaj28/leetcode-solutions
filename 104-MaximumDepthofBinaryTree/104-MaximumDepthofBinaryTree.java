// Last updated: 16/2/2026, 2:18:52 pm
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
17    public boolean isBalanced(TreeNode root) {
18        return dfsHeight(root) != -1;
19    }
20    private static int dfsHeight(TreeNode root){
21        if(root == null){
22            return 0;
23        }
24        int lh = dfsHeight(root.left);
25        if(lh == -1) return -1;
26        int rh = dfsHeight(root.right);
27        if(rh == -1) return -1;
28        if(Math.abs(lh-rh)>1) return -1;
29        return Math.max(lh,rh)+1;
30    }
31}