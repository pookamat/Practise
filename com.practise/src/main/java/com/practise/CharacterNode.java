package com.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pkama on 9/18/2016.
 */
public class CharacterNode {

    private char _char;
    private List<CharacterNode> _nexts;

    public CharacterNode(char char_){

        _char = char_;
        _nexts = new ArrayList<CharacterNode>();
    }

    public char getCharacter(){
        return _char;
    }

    public void setNext(List<CharacterNode> next_){
        _nexts = next_;
    }

    public List<CharacterNode> getNext(){

        return _nexts;
    }

}
