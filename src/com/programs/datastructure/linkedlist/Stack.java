package com.programs.datastructure.linkedlist;

public class Stack {

    LinkedListNode top;

    Stack(){
        top = null;
    }

    public void push(int data){
        LinkedListNode tempNode = new LinkedListNode(data);
        tempNode.next = top;
        top = tempNode;
    }

    public void pop(){
        top = top.next;
    }

    public void printStack(Stack stack){
        LinkedListNode node = stack.top;
        System.out.println("Printing:");
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack(stack);
        stack.pop();
        stack.printStack(stack);
        stack.push(4);
        stack.printStack(stack);
        stack.pop();
        stack.printStack(stack);
    }
}
