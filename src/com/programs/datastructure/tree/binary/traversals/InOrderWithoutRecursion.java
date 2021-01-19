package com.programs.datastructure.tree.binary.traversals;


import java.util.Stack;

public class InOrderWithoutRecursion {

    BinaryTreeNode root;

    InOrderWithoutRecursion(){
        root = null;
    }

    private void printInOrderWithoutRecursion() {
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode tempNode = root;
        while (tempNode != null || stack.size()>0){
            while (tempNode != null) {
                stack.push(tempNode);
                tempNode = tempNode.left;
            }
            tempNode = stack.pop();
            System.out.println(tempNode.data);
            tempNode = tempNode.right;
        }
    }

    public static void main(String[] args) {
        InOrderWithoutRecursion tree = new InOrderWithoutRecursion();
        tree.root = new BinaryTreeNode(1);
        tree.root.left = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(3);
        tree.root.left.left = new BinaryTreeNode(4);
        tree.root.left.right = new BinaryTreeNode(5);
        tree.printInOrderWithoutRecursion();
    }

}
