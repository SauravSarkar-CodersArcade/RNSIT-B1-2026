package com.dsa.dataStructures.trees.interviewQuestions.mirror;
public class Tree {
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        this.left = this.right = null;
    }
    private static void inOrder(Tree root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    private static Tree mirrorTree(Tree root){
        if(root == null){
            return root;
        }
        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;
        // recursively swap the left & right subtrees
        if(root.right != null){
            mirrorTree(root.right);
        }
        if(root.left != null){
            mirrorTree(root.left);
        }
        return root;
    }
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);

        System.out.println("InOrder-Original: ");
        inOrder(root);
        System.out.println();
        root = mirrorTree(root);
        System.out.println("InOrder-Mirror: ");
        inOrder(root);
    }
}
