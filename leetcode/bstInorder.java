// https://leetcode.com/problems/binary-tree-inorder-traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        return in(root,al);
    }
    public List<Integer> in(TreeNode node, List<Integer> al) {
        if(node == null) {return al;}
        in(node.left, al);
        al.add(node.val);
        in(node.right, al);
        return al;
    }
}