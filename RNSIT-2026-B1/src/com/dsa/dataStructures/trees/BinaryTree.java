package com.dsa.dataStructures.trees;
class Tree {
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        this.left = this.right = null;
    }
    static void preOrderTree(Tree root){ // DLR
        if(root != null){
            System.out.print(root.data + " ");
            preOrderTree(root.left);
            preOrderTree(root.right);
        }
    }
    static void inOrderTree(Tree root){ // LDR
        if(root != null){
            inOrderTree(root.left);
            System.out.print(root.data + " ");
            inOrderTree(root.right);
        }
    }
    static void postOrderTree(Tree root){ // LRD
        if(root != null){
            postOrderTree(root.left);
            postOrderTree(root.right);
            System.out.print(root.data + " ");
        }
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        // L0
        Tree root = new Tree(1);
        // L1
        root.left = new Tree(2);
        root.right = new Tree(3);
        // L2
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        // L3
        root.left.right.left = new Tree(9);
        root.right.right.left = new Tree(15);
        System.out.println("PreOrder: ");
        Tree.preOrderTree(root);
        System.out.println();
        System.out.println("InOrder: ");
        Tree.inOrderTree(root);
        System.out.println();
        System.out.println("PostOrder: ");
        Tree.postOrderTree(root);
    }
}
