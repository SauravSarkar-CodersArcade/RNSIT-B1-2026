package com.dsa.dataStructures.trees.interviewQuestions.identicalTrees;
class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class IdenticalTrees {
    static boolean areIdentical(Tree t1, Tree t2){
        // If both are empty
        if(t1 == null && t2 == null){
            return true;
        }
        // If any one is empty
        if(t1 == null || t2 == null){
            return false;
        }
        // If the data in the root is different
        if(t1.data != t2.data){
            return false;
        }
        return (areIdentical(t1.left, t2.left) &&
                areIdentical(t1.right, t2.right));
    }
    public static void main(String[] args) {
        Tree t1 = new Tree(1);
        t1.left = new Tree(2);
        t1.right = new Tree(3);

        Tree t2 = new Tree(1);
        t2.left = new Tree(2);
        t2.right = new Tree(3);

        Tree t3 = new Tree(1);
        t3.left = new Tree(2);
        t3.right = new Tree(3);

        Tree t4 = new Tree(1);
        t4.left = new Tree(2);
        t4.right = new Tree(5);
        System.out.println(areIdentical(t1,t2));
        System.out.println(areIdentical(t3,t4));
    }
}
