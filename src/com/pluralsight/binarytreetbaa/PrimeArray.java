package com.pluralsight.binarytreetbaa;

import java.util.Arrays;

public class PrimeArray {



    //wuth array
    public int[] primeArrayRecursive(int[] arr, int index) {

//if the index parameter reaches the end of the array this returns an empty array
        if(index==arr.length){
            int[] noResultArray = new int[0];
            return noResultArray;
        }
//a storage array that runs the recursive argument
        int[] recursionArray = primeArrayRecursive(arr, index +1 );
//if the element matches the recursive argument
            if (arr[index] % 2 != 0) {
                int[] resultArray = new int[recursionArray.length + 1];
//puts the number into a new result array
                resultArray[0] = arr[index];
                for (int j = 0; j < recursionArray.length; j++) {
//shifts elements of the storage array one to right and puts them into result array
                    resultArray[j + 1] = recursionArray[j];
                }
                return resultArray;

        }else{
                return recursionArray;
            }

    }//end of method


    public int primeArrayIterative(int[] arr, int index) {
        int prime = 0;
        int l;
//loop to iterate through the array and mathc the content at the index to the prime number check
        for (l = 0; l < arr.length; l++) {
            if (arr[index] % 2 != 0) {
                prime = arr[index];
//prints the result within the for loop
                System.out.println("Iterative Method Prime Number is: " + prime);
            }
            index++;
        }//end of method
        return prime;
    }//end of method

}