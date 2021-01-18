package com.programs.datastructure.tree.binary;

public class Traversal {

    public void inOrder(Node root) {
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public void preOrder(Node root) {
        if(root==null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
	    Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Traversal tree = new Traversal();
        System.out.println("InOrder:");
        tree.inOrder(root);
        System.out.println("\nPostOrder:");
        tree.postOrder(root);
        System.out.println("\nPreOrder:");
        tree.preOrder(root);
    }
}
