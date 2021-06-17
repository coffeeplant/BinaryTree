package com.pluralsight.binarytreetbaa;

import java.sql.SQLOutput;

public class Output {

    public static void main(String[] args) {
        //declare variables
        double avg;

//-------------Q1. LINKED LIST
        //declare objects
        Result r = new Result();
        BinaryTree bst = new BinaryTree();
        //creates new double linked list
        List<Result> res = new DoubleLinkedList<>();
        //add objects to the linked list related to the Results Object
        res.add(new Result("Java", 50));
        res.add(new Result("Maths", 78));
        res.add(new Result("English", 40));
        res.add(new Result("History", 50));
        //add a new student object to the binary tree and adds the above linked list to the object
        //BTNode theNode2 = new BTNode("Bebhinn", 38, 1000, res);
        //creates a new blank linked list for the next student
        res= new DoubleLinkedList<>();


//--------------Q2. STUDENT & BINARY TREE
//        to calculate avg and put avg into Student as variable in order to be used as comparator within comparable method
        avg = res.getAverage(res);
        avg = Math.round(avg);
        System.out.println(res.getAverage(res));
        r.setAvg(avg);
//  5 new students being added to nodes for the Binary Tree
        BTNode theNode1 = new BTNode(new Student("Bebhinn", 38, 1000, res));
        BTNode theNode2 = new BTNode(new Student("Diana", 30, 1001, res));
        BTNode theNode3 = new BTNode(new Student("Derek", 21, 1002, res));
        BTNode theNode4 = new BTNode(new Student("Karuna", 35, 1003, res));
        BTNode theNode5 = new BTNode(new Student("Rory", 48, 1004, res));

//adding the new nodes to the tree
        bst.insertNode(bst.theRoot, theNode1);
        bst.insertNode(bst.theRoot, theNode2);
        bst.insertNode(bst.theRoot, theNode3);
        bst.insertNode(bst.theRoot, theNode4);
        bst.insertNode(bst.theRoot, theNode5);

//code to run in-order traversal method
        System.out.println("Demo of in=oder traversal, the list of nodes: ");
        bst.inOrderTraversal(bst.theRoot);
//code to print a count of the nodes
        System.out.println("The count of all Nodes is: "+ bst.countNodes(bst.theRoot));


//Q.3 -------- PRIME NUMBER
        //initialising the array of numbers to be checked for prime numbers
        int[] nums;
        nums = new int[] {3,5,34,56,71,113,139,234};
        //declare objects
        PrimeArray p = new PrimeArray();

//creating new array with result of recuraive array method
        int result[]=p.primeArrayRecursive(nums, 0);
//for loop to iterate through the array to print it
        for(int i=0; i<result.length; i++){
            System.out.println("Recursive Method Prime Number is "+(i+1)+ ": "+ result[i] +" ");
        }
//calling method for iterative method, print method is within the array loop in the PrimeArray class
        int result2=p.primeArrayIterative(nums, 0);
   }
}
