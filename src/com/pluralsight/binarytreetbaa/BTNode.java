package com.pluralsight.binarytreetbaa;

//Node class for Binary Tree
public class BTNode<T> {
    private Object element;
    private BTNode leftChild;
    private BTNode rightChild;

    //creates a new instance of BTNode
    public BTNode(Object theValue){
        element = theValue;
        leftChild=null;
        rightChild=null;
    }


//check if the node is a leaf, i.e. a child on the end of a branch with no sibling
    public boolean isLeaf(){
        return ((leftChild == null) && (rightChild == null));
    }

    public Object getElement(){
        return element;
    }

    public void setLeft(BTNode theNode ){
        leftChild = theNode;
    }

    public void setRight(BTNode theNode) {
        rightChild = theNode;
    }

    public BTNode getLeft( ){
        return leftChild;
    }

    public BTNode getRight() {
        return rightChild;
    }


}
