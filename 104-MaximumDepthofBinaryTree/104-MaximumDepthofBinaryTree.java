// Last updated: 16/2/2026, 2:35:44 pm
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
17    public boolean isSymmetric(TreeNode root) {
18        
19        return root == null || isSymmetricH(root.left, root.right);
20    }
21    public static boolean isSymmetricH(TreeNode left, TreeNode right){
22        if(left == null || right == null){
23            return left == right;
24        }
25        if(left.val != right.val){
26            return false;
27        }
28        return isSymmetricH(left.right, right.left) && isSymmetricH(left.left, right.right);
29
30    }
31}