// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree

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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        return treeCreation(0, nums.length-1, nums);
    }
    
    public TreeNode treeCreation(int start, int end, int[] arr) {
         
         if(start>end) {
             return null;
         }
        
         int mid = (start+end)/2;
         TreeNode newNode = new TreeNode(arr[mid]);
         
         newNode.left = treeCreation(start, mid-1, arr);
         newNode.right = treeCreation(mid+1, end, arr);
         return newNode;
    }
}