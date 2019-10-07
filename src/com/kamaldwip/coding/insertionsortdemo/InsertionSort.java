package com.kamaldwip.coding.insertionsortdemo;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {20, -45, 55, -2, 13, -25, 8, 32};
        System.out.println("Input Array is : "+ Arrays.toString(arr));
        doInsertionSort(arr);
    }

    private static void doInsertionSort(int[] arr) {

       for(int firstUnsortedIndex = 1;firstUnsortedIndex < arr.length; firstUnsortedIndex ++){
           int newElement = arr[firstUnsortedIndex];

           int i;

           for(i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i--){
               arr[i] = arr[i-1];
           }
           arr[i] = newElement;
       }
        System.out.println("Sorted Array is : "+Arrays.toString(arr));
    }
}
