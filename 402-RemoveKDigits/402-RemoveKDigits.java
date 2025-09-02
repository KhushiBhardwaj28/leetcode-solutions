// Last updated: 2/9/2025, 8:15:18 pm
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Integer prev = null;
    int minDis = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return minDis;
    }
    private void inorder(TreeNode node){
        if(node == null){
            return;
        }
        inorder(node.left);
        if(prev != null){
            minDis = Math.min(minDis, node.val - prev);
        }
        prev = node.val;
        inorder(node.right);
    }
}