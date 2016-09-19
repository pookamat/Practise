package com.practise;

/**
 * Created by pkama on 9/19/2016.
 */
public class SelectionSortStrategy implements SortingStrategy {

    private static SelectionSortStrategy _instance;

    private SelectionSortStrategy(){

    }

    public static SelectionSortStrategy getInstance(){
        if(_instance == null){
            _instance = new SelectionSortStrategy();
        }
        return _instance;
    }

    public void sort(int[] arr) {
        if(arr == null){
            throw new IllegalArgumentException("Array is null");
        }
        else {


            for (int i = 0; i < arr.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < arr.length; j++)
                    if (arr[j] < arr[index])
                        index = j;

                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;
                printNumbers(arr);
            }
        }
    }

    private void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }


}
