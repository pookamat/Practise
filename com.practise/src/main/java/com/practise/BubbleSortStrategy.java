package com.practise;

/**
 * Created by pkama on 9/19/2016.
 */
public class BubbleSortStrategy implements SortingStrategy {

    private static BubbleSortStrategy _instance;

    private BubbleSortStrategy(){

    }

    public static BubbleSortStrategy getInstance(){
        if(_instance==null){
            _instance= new BubbleSortStrategy();
        }
        return _instance;
    }
    
    public void sort(int[] array) {
        if(array==null){
            throw new IllegalArgumentException("Array is null");
        }
        else{
        int n= array.length;
        int temp=0;

        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                if(array[j-1]>array[j]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    printNumbers(array);
                }
            }
        }

        }

    }

    public void printNumbers(int[] input){
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
        }
    }

