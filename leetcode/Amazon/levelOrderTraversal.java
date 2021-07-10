/**
 * 
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000

 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        while(!q.isEmpty()) {
            TreeNode temp = q.remove();
            
            if(temp != null) a.add(temp.val);
            
            System.out.println(a);
            //System.out.println(temp.val);
            if(temp == null) {
                q.add(null);
                if(a.size() == 0) break;
                List<Integer> t = new ArrayList<>(a);
                al.add(t);
                a.clear();
            } else {
                if(temp.left != null)  q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        return al;
    }
}

// =========================== Recursive =====================

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return res;
        traverseBFS(root, 0);
        return res;
    }
    public void traverseBFS(TreeNode node, int level) {
        if(res.size() == level) {
            res.add(new ArrayList<Integer>());
        }
        
        res.get(level).add(node.val);
        
        if(node.left != null) traverseBFS(node.left, level+1);
        if(node.right != null) traverseBFS(node.right, level+1);
    }
}
