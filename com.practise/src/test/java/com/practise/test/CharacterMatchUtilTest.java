package com.practise.test;

import com.practise.Dictionary;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pkama on 9/18/2016.
 */
public class CharacterMatchUtilTest {

    @Test
    public void getCharacterTest(){

    }

    @Test
    public void setNextCharacterTest(){

        List<String> listofStrings = new ArrayList<String>();
        listofStrings.add("pooja");
        listofStrings.add("pot");
        listofStrings.add("pomogrenate");
        listofStrings.add("polio");
        listofStrings.add("popeye");
        listofStrings.add("sam");
        listofStrings.add("shailesh");

        Dictionary dictionary = new Dictionary(listofStrings);
        List<String> outputStrings =  dictionary.findStartWith("po");
        Assert.assertTrue(outputStrings != null && outputStrings.size()==5);
        Assert.assertTrue(outputStrings.contains("pooja"));
        Assert.assertTrue(outputStrings.contains("pot"));

        outputStrings =  dictionary.findStartWith("s");
        Assert.assertTrue(outputStrings != null && outputStrings.size()==2);

        outputStrings =  dictionary.findStartWith("sh");
        Assert.assertTrue(outputStrings != null && outputStrings.size()==1);

        outputStrings =  dictionary.findStartWith("sam");
        Assert.assertTrue(outputStrings != null && outputStrings.size()==1);

        outputStrings =  dictionary.findStartWith("sami");
        Assert.assertTrue(outputStrings != null && outputStrings.size()==0);

        outputStrings =  dictionary.findStartWith("x");
        Assert.assertTrue(outputStrings != null && outputStrings.size()==0);
    }

    @Test
    public void findStartWith(){

    }
}
