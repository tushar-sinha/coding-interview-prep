/**
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100
 */

import java.util.Collections.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> al = new ArrayList<>();
        boolean rev = true;
        while(!q.isEmpty()) {
            TreeNode temp = q.remove();
            if(temp == null) {
                if(al.size() == 0) break;
                rev = !rev;
                q.add(null);
                List<Integer> list = new ArrayList<>(al);
                if(rev) Collections.reverse(list);
                res.add(list);
                al.clear();
            } else {
                al.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        return res;
    }
}

// ======================== Recursive =============================

import java.util.Collections.*;
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root == null) return res;
        
        traverse(root, 0);
        return res;
    }
    
    public void traverse(TreeNode node, int level) {
        if(res.size() == level) {
            res.add(new ArrayList<Integer>());
        }
        if(level%2 == 0) {
            res.get(level).add(node.val);
        } else {
            res.get(level).add(0, node.val);
        }
        if(node.left != null) traverse(node.left, level+1);
        if(node.right != null) traverse(node.right, level+1);
    }
}