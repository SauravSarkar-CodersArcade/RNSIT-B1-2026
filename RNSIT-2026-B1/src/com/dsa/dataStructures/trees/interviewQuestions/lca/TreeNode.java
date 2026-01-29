package com.dsa.dataStructures.trees.interviewQuestions.lca;
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right, p,q);
        // Both left & right are not null - return root
        if(left != null && right != null){
            return root;
        }
        // Otherwise return the non-null child
        return left != null ? left : right;
    }
}