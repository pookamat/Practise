package com.practise;

/**
 * Created by pkama on 9/18/2016.
 */
public class Util {

    public static void insertionSort(int array[]) {
        if(array==null){
            throw new IllegalArgumentException("Array is null");
        }
        else {
            int n = array.length;

            for (int j = 1; j < n; j++) {
                int key = array[j];
                int i = j - 1;
                while ((i > -1) && (array[i] > key)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;
                printNumbers(array);
            }
        }
    }

    private static void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }


}
