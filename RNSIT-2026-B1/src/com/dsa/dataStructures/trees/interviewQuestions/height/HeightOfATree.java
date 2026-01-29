package com.dsa.dataStructures.trees.interviewQuestions.height;
class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class HeightOfATree {
    static int findHeight(Tree root){
        // Base case : empty tree - height 0
        if(root == null){
            return 0;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.right.right = new Tree(4);
        System.out.println(findHeight(root));
    }
}
