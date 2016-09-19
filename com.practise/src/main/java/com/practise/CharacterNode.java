package com.practise;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pkama on 9/18/2016.
 */
public class CharacterNode {

    private char _char;
    private Map<Character,CharacterNode> _nexts;

    public CharacterNode(char char_){

        _char = char_;
        _nexts = new HashMap<Character,CharacterNode>();
    }

    public char getCharacter(){
        return _char;
    }

    public void setNext(Map<Character,CharacterNode> next_){
        _nexts = next_;
    }

    public Map<Character,CharacterNode> getNext(){

        return _nexts;
    }

}
