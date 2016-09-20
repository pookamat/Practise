package com.practise;

/**
 * Created by pkama on 9/19/2016.
 */
public class StringManipulationStrategy implements StringStrategy {

    private static StringManipulationStrategy _instance;

    public StringManipulationStrategy(){


    }

    public static StringManipulationStrategy getInstance(){
        if(_instance == null){
            _instance = new StringManipulationStrategy();
        }
        return _instance;
    }

    
    public void changeCase(StringBuilder s) {
        int i;
       /* StringBuilder temp = new StringBuilder(s);
        s.replace(0,s.length(),"");*/
        if(s== null){
            throw new NullPointerException("String is null");
        }
        else {
            for (i = 0; i < s.length(); i++) {
                int ch = s.charAt(i);
                if (ch > 64 && ch < 91) {
                    ch = ch + 32;
                    s.setCharAt(i,(char) ch);
                } else if (ch > 96 && ch < 123) {
                    ch = ch - 32;
                    s.setCharAt(i,(char) ch);
                }
                if (ch == 32)
                    s.setCharAt(i,(char) ch);
            }
        }
    }
}
