package com.pluralsight.binarytreetbaa;
//Node class for the DoubleLInked List, DoubleLinked List uses <Object>
public class Node <T extends Comparable<T>>{

    T element;
    Node<T> previous;
    Node<T> next;

    public Node(){

    }

    public Node (T el, Node<T> p, Node<T> n){
        element = el;
        next=n;
        previous = p;
    }

    public Node(T el){
        this(el, null, null);
    }

    public T getElement(){
        return element;
    }

//    @Override
//    public String toString(){
//        Result res = (R)
//    }
}
