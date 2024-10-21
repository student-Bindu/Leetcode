/**
 * Definition for a binary tree nod
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
         List<Integer> preorder = new ArrayList<>();

        // If the root is null, return
        // an empty traversal result
        if (root == null) {
            return preorder;
        }

        // Create a stack to store
        // nodes during traversal
        Stack<TreeNode> st = new Stack<>();
        // Push the root node
        // onto the stack
        st.push(root);

        // Perform iterative preorder traversal
        while (!st.empty()) {
            // Get the current node
            // from the top of the stack
            root = st.pop();

            // Add the node's value to
            // the preorder traversal result
            preorder.add(root.val);

            // Push the right child
            // onto the stack if exists
            if (root.right != null) {
                st.push(root.right);
            }

            // Push the left child onto
            // the stack if exists
            if (root.left != null) {
                st.push(root.left);
            }
        }

        // Return the preorder
        // traversal result
        return preorder;
    }
}
 