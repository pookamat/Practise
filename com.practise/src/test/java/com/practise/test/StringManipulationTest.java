package com.practise.test;

import com.practise.SelectionSortStrategy;
import com.practise.SortingUtil;
import com.practise.StringManipulationStrategy;
import com.practise.StringManipulationUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by pkama on 9/19/2016.
 */
public class StringManipulationTest {

    @Test
    public void stringManipulationNullTest(){
        Exception ex =null;
        try{
            StringManipulationUtil stringManipulationUtil = new StringManipulationUtil(StringManipulationStrategy.getInstance());
            StringManipulationUtil.changeCase(null);
        }
        catch (Exception e){
            ex=e;
        }
        Assert.assertTrue(ex!=null && ex instanceof NullPointerException && ex.getMessage().equals("String is null"));
    }

    @Test
    public void changeCaseTest(){
    StringBuilder s1= new StringBuilder("Pooja");
        StringBuilder s2= new StringBuilder("pOOJA");
        StringManipulationUtil stringManipulationUtil = new StringManipulationUtil(StringManipulationStrategy.getInstance());
        stringManipulationUtil.changeCase(s1);
        assertEquals(s1.toString(),s2.toString());

    }
}
