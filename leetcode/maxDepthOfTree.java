// https://leetcode.com/problems/maximum-depth-of-binary-tree/

class Solution {
    int depth = 0;
    public int maxDepth(TreeNode root) {
        return depthFinder(root, 1);
    }
    public int depthFinder(TreeNode root, int lvl) {
        if(root == null) {
            return lvl-1;
        }
        return Math.max(depthFinder(root.left, lvl+1), depthFinder(root.right, lvl+1));
    }
}