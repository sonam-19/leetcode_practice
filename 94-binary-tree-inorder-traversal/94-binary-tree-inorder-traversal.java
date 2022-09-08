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
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if(root==null)
        return result;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
 
    while(!stack.isEmpty()){
        TreeNode top = stack.peek();
        if(top.left!=null){
            stack.push(top.left);
            top.left=null;
        }else{
            result.add(top.val);
            stack.pop();
            if(top.right!=null){
                stack.push(top.right);
            }
        }
    }
 
    return result;
}
}