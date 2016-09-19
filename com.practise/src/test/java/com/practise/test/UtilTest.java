package com.practise.test;

import com.practise.Util;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by pkama on 9/18/2016.
 */
public class UtilTest {

    @Test
    public void insertionSortNullTest() {
        Exception ex=null;
        try {
            Util.insertionSort(null);
        } catch (Exception e) {
            ex=e;
        }
        Assert.assertTrue(ex!=null && ex instanceof IllegalArgumentException && ex.getMessage().equals("Array is null"));
    }

    @Test
    public void insertionSortTest(){
        int[] array1={1, 9, 0, 4, 12, 34, 6, 23, 2};
        int[] array2={0, 1, 2, 4, 6, 9, 12, 23, 34};
        Util.insertionSort(array1);
        Assert.assertTrue(Arrays.equals(array1,array2));
    }

    @Test
    public void insertionSortDuplicatedValueTest(){
        int[] array1={2, 1, 0 , 2, 8, 7, 2};
        int[] array2={0, 1, 2, 2, 2, 7, 8};
        Util.insertionSort(array1);
        Assert.assertTrue(Arrays.equals(array1,array2));
    }


}
