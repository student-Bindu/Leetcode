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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();  // List to store the result
        preorderHelper(root, result);  // Helper function to perform traversal
        return result;
    }
    
    // Helper function to recursively traverse the tree in preorder
    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        
        result.add(node.val);  // Visit the root
        preorderHelper(node.left, result);  // Traverse the left subtree
        preorderHelper(node.right, result);  // Traverse the right subtree
    }
}
