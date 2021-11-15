//1. Write a Java program to test the equality of two arrays.

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4,5};


        checkEquality(arr1, arr2);
    }

    private static void checkEquality(int[] arr1, int[] arr2) {
        if(Arrays.equals(arr1,arr2)){
            System.out.println("The two arrays are equal.");
        }else{
            System.out.println("The two arrays are NOT equal.");
        }
    }
}
