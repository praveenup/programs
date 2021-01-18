package com.programs.datastructure.tree.binary.traversals;


public class Traversal {

    BinaryTreeNode root;

    Traversal(){
        root = null;
    }

    public void inOrder(BinaryTreeNode root) {
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void postOrder(BinaryTreeNode root) {
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public void preOrder(BinaryTreeNode root) {
        if(root==null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    private void printPreOrder() {
        preOrder(root);
    }

    private void printPostOrder() {
        postOrder(root);
    }

    private void printInOrder() {
        inOrder(root);
    }

    public static void main(String[] args) {
	    Traversal tree = new Traversal();
        tree.root.left = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(3);
        tree.root.left.left = new BinaryTreeNode(4);
        tree.root.left.right = new BinaryTreeNode(5);


        System.out.println("InOrder:");
        tree.printInOrder();
        System.out.println("\nPostOrder:");
        tree.printPostOrder();
        System.out.println("\nPreOrder:");
        tree.printPreOrder();
    }
}
