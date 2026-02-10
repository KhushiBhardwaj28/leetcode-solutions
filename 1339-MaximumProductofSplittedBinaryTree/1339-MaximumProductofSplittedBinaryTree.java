// Last updated: 10/2/2026, 3:18:58 pm
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
17    long ans = 0;
18    int MOD = 1000000007;
19    public int maxProduct(TreeNode root) {
20        int totalSum = sum(root);
21        helper(root, totalSum);
22        return (int)(ans % MOD);
23        
24    }
25    public void helper(TreeNode root, int totalSum){
26        if(root == null){
27            return;
28        }
29        int x = totalSum - root.val;
30        ans = Math.max(ans, (long) x*root.val);
31        helper(root.left, totalSum);
32        helper(root.right, totalSum);
33    }
34    public int sum(TreeNode root){
35        if(root == null){
36            return 0;
37        }
38        root.val = root.val + sum(root.left) + sum(root.right);
39        return root.val;
40    }
41}