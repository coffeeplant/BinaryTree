package com.pluralsight.binarytreetbaa;

// Binary Tree implementation of the Tree interface. also brought in Comparable in an effort to
//solve the issue with comaprables in insertNode()
public class BinaryTree<T> implements Tree<T>, Comparable<Student> {

    public BTNode theRoot;

    /**
     * Creates a new instance of BinaryTree
     */
    public BinaryTree() {
        theRoot = null;
    }

    //return the root of the tree
    public BTNode root() {
        return theRoot;
    }

    @Override
    //check if the tree is empty
    public boolean isEmpty() {
        if (theRoot == null)
            return true;
        else
            return false;
    }

//insertNode metod, working on the comparables as the binary tree checks the value of the node in order to
// place the new node to the left or right, throwing an error that I left to last, tyring to resolve by
// casting to Comparable but not working
    @Override
    public void insertNode(BTNode startNode, BTNode theNewNode) {
        // if the tree is empty theNewNode becames the root of the tree
        if (theRoot == null) {
            theRoot = theNewNode;
        } else
        // find the location and insert theNewNode in the non-empty tree
        {
            Student s =new Student();
            int comp1 = startNode.compareTo(theNewNode);
            if (((Comparable) theNewNode.getElement()).compareTo((Comparable) startNode.getElement())) {
                //insert theNewNode on the right side of the startNode
                if (startNode.getRight() == null) {
                    //the startNode has no right child, so theNewNode will become the right child
                    startNode.setRight(theNewNode);
                } else {
                    //the startNode has a right child / right side sub-tree, so insert theNewNode in the right side sub-tree
                    insertNode(startNode.getRight(), theNewNode);
                }
            } else if (((Comparable) theNewNode.getElement()).compareTo((Comparable) startNode.getElement()))
            //insert theNewNode on the left side of the startNode
            {
                if (startNode.getLeft() == null) {
                    //the startNode has no left child, so theNewNode will become the left child
                    startNode.setLeft(theNewNode);
                } else {
                    //the startNode has a left child / left side sub-tree, so insert theNewNode in the left side sub-tree
                    insertNode(startNode.getLeft(), theNewNode);
                }
            } else if (theNewNode.getElement() == startNode.getElement())
                System.out.println("The node " + startNode.getElement() + " was already inserted");
        }
    }
//finds the max avg t grades, uses the Student object as avg grade has been set in there as the comparator
    @Override
    public double maxAverage(BTNode theStart) {
        int max = 0;
        int temp;

        Student r = (Student) theStart.getElement();
        temp = (Integer) theStart.getElement();
        inOrderTraversal(theStart.getLeft());
        System.out.println("Node: " + theStart.getElement());
        inOrderTraversal(theStart.getRight());
        if (temp > max) {
            max = temp;

        }

        return max;
    }
//finds the min avg Student grade,
    @Override
    public double minAverage(BTNode theStart) {
        int min = 0;
        int temp;

        Student r = (Student) theStart.getElement();
        temp = (Integer) theStart.getElement();
        inOrderTraversal(theStart.getLeft());
        System.out.println("Node: " + theStart.getElement());
        inOrderTraversal(theStart.getRight());
        if (temp < min) {
            min = temp;

        }

        return min;
    }

//searches and print the binary tree from bottom left to root to bottom right
    public void inOrderTraversal(BTNode theStart) {
        if (theStart == null) {
            return;
        } else {
            inOrderTraversal(theStart.getLeft());
            System.out.println("Node: " + theStart.getElement());
            inOrderTraversal(theStart.getRight());
        }
    }
//counts the number of nodes in the tree
    public int countNodes(BTNode theStart) {
        if (theStart == null)
            return 0;
        else
            return 1 + countNodes(theStart.getLeft())
                    + countNodes(theStart.getRight());
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }



}