// Last updated: 16/2/2026, 2:24:26 pm
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
18        return helper(root) != -1; 
19
20    }
21    public int helper(TreeNode root){
22        if(root == null){
23            return 0;
24        }
25        int lh = helper(root.left);
26        if(lh == -1){
27            return -1;
28        }
29        int rh = helper(root.right);
30        if(rh == -1){
31            return -1;
32        }
33        if(Math.abs(lh-rh)>1) return -1;
34        return Math.max(lh, rh)+1;
35    }
36}