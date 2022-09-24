class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return res;
        dfs(root, targetSum, new ArrayList<>());
        return res;
    }
    void dfs(TreeNode node, int targetSum, ArrayList<Integer> path) {
        if(node == null)
            return;
            path.add(node.val);
            targetSum -= node.val;
        
        if(targetSum == 0 && node.left == null && node.right == null)
            res.add(path);
        
        dfs(node.left, targetSum, new ArrayList<>(path));
        dfs(node.right, targetSum, new ArrayList<>(path));
    }
}