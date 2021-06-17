package com.pluralsight.binarytreetbaa;
// Implementation of List
public class DoubleLinkedList<Object> implements List<Object> {
//enables identification of first and last nodes. Last is neeed in double linked list implementation
    private Node <Object> first;
    private Node <Object> last;

    public DoubleLinkedList(){
        first = null;
    }


//add method adds to end of list
    @Override
    public void add(Object e) {
        if(isEmpty()){
            first=new Node<Object>(e, null, null);
            last=first;
        }
        else{
            last.next = new Node<Object>(e, last, null);
            last = last.next;
        }

    }
//return true if the list is empty
    @Override
    public boolean isEmpty() {
        return first == null;
    }
//return the size of the list
    @Override
    public int size() {
        int count = 0;
        Node<Object> current = first;
        while (current!= null){
            count++;
            current = current.next;
        }
        return count;
    }

// method for removing the target String of Student name
    public int remove(String target) {

        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        Node<Object> current = first;
        int index = 0;
//iterates through the list to find the matching value, uses .equals as we are looking for a String
        while (current != null && !current.element.equals(target)){
            current = current.next;
            index ++;
        }
//removes the node at the index in which the match is found, the search stops here, this method finds the
//first matching element and does not continue
        if (current != null && current.element.equals(target)){
            return remove(index);
        }
        return null;
    }
//getAverage method to get the avg grades of the Result object
    @Override
    public double getAverage(List list) {
        double avg=0;
        int temp = 0;
        Node<Object> current = first;
        while(current!= first){
//creates an instance of the Results object and casts the current element to Result object
            Result r = (Result) current.element;
            for(int i=0; i<list.size(); i++){
// adds the value on the left to the value on the right
                temp = temp+r.getGrade();
            }
            avg = (temp/list.size());

        }
        return avg;
    }


}
