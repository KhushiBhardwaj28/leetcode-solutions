// Last updated: 27/8/2025, 7:46:12 am
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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = findHeightLeft(root);
        int rh = findHeightRight(root);
        if (lh == rh) {
            return (1 << lh) - 1; 
        }
     
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
    // Function to find the left height of a tree
    private int findHeightLeft(TreeNode node) {
        int height = 0;
        // Traverse left child until
        // reaching the leftmost leaf
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }
    private int findHeightRight(TreeNode node) {
        int height = 0;
        // Traverse right child until
        // reaching the rightmost leaf
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
}