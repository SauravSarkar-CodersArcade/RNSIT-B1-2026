package com.dsa.dataStructures.trees.interviewQuestions.evenGrandparentSum;
class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class Main {
    public static void dfs(Tree node, Tree parent, Tree grandParent, int[] sum){
        if(node == null) return;
        if(grandParent != null && grandParent.data %2 == 0){
            sum[0] += node.data;
        }
        dfs(node.left, node, parent, sum);
        dfs(node.right, node, parent, sum);
    }
    public static int sumEvenGrandparent(Tree root){
        int[] sum = new int[1];
        dfs(root, null, null, sum);
        return sum[0];
    }

    public static void main(String[] args) {
        Tree root = new Tree(6);
        root.left = new Tree(7);
        root.right = new Tree(8);
        root.left.left = new Tree(2);
        root.left.right = new Tree(7);
        root.right.left = new Tree(1);
        root.right.right = new Tree(3);
        root.left.left.left = new Tree(9);
        root.left.right.left = new Tree(1);
        root.left.right.right = new Tree(4);
        root.right.right.right = new Tree(5);
        System.out.println(sumEvenGrandparent(root));
    }
}
