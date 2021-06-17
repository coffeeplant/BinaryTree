package com.pluralsight.binarytreetbaa;
//interface for the binary tree, this contains a set of rules which the binary tree implments
//this class extandes the comparable Student
public interface Tree <Object> extends Comparable<Student>{
    boolean isEmpty();
    void insertNode(BTNode startNode, BTNode theNewNode);

    double maxAverage(BTNode theStart);
    double minAverage(BTNode theStart);
    int countNodes(BTNode theStart);
    void inOrderTraversal(BTNode theStart);



}
