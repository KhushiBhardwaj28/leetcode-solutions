// Last updated: 21/11/2025, 12:09:07 pm
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
    int count, answer;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        count = k;
        answer = -1;
        recurse(root);
        return answer;
        
    }
    public void recurse(TreeNode root){
        if(root == null){
            return;
        }
        recurse(root.left);
        count--;
        if(count == 0){
            answer = root.val;
            
        }
        
        recurse(root.right);
    }
}