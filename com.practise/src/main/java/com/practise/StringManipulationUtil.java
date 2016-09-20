package com.practise;

/**
 * Created by pkama on 9/19/2016.
 */
public class StringManipulationUtil {

    private static StringManipulationStrategy _stringManipulationStrategy;

    public StringManipulationUtil(StringManipulationStrategy stringManipulationStrategy_) {
        _stringManipulationStrategy=stringManipulationStrategy_;
    }

    public static void changeCase(StringBuilder s) {
        _stringManipulationStrategy.changeCase(s);
    }
}
