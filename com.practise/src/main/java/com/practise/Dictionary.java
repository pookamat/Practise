package com.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pkama on 9/18/2016.
 */
public class Dictionary {
    private List<CharacterNode> _roots;

    public Dictionary(List<String> ListofStrings){
        _roots = new ArrayList<CharacterNode>();
        for(String string : ListofStrings){
            char[] arr= string.toCharArray();

            CharacterNode previousCharacterNode = null;
            for(int i=0; i<arr.length; i++)
            {
                CharacterNode currentCharNode=null;
                char currentCharacter = arr[i];
                List<CharacterNode> nodesToBeSearched = null;
                if(previousCharacterNode == null){
                    nodesToBeSearched= _roots;
                }
                else {
                    nodesToBeSearched=previousCharacterNode.getNext();
                }

                    for(CharacterNode characterNode : nodesToBeSearched){
                        if(characterNode.getCharacter()== currentCharacter){
                            currentCharNode = characterNode;
                            break;
                        }
                    }
                    if(currentCharNode == null){
                        currentCharNode= new CharacterNode(currentCharacter);
                        nodesToBeSearched.add(currentCharNode);
                    }
                previousCharacterNode = currentCharNode;
            }
        }

    }

    public List<String> findStartWith(String str){
        List<String> returnList = new ArrayList<String>();
        char[] arr= str.toCharArray();
        CharacterNode previousCharacterNode = null;
        for(int i=0; i<arr.length; i++)
        {
            CharacterNode currentCharNode=null;
            char currentCharacter = arr[i];
            List<CharacterNode> nodesToBeSearched = null;
            if(previousCharacterNode == null){
                nodesToBeSearched= _roots;
            }
            else {
                nodesToBeSearched=previousCharacterNode.getNext();
            }

            for(CharacterNode characterNode : nodesToBeSearched){
                if(characterNode.getCharacter()== currentCharacter){
                    currentCharNode = characterNode;
                    break;
                }
            }
            previousCharacterNode = currentCharNode;
        }
        if(previousCharacterNode!=null){
            List<String> suffixes = getPossibleString(previousCharacterNode);
            for(String suffix : suffixes){
                returnList.add(new StringBuilder(str.substring(0,str.length()-1)).append(suffix).toString());
            }
        }
        return returnList;
    }

    private List<String> getPossibleString(CharacterNode characterNode_){
        List<String> possibleString =new ArrayList<String>();
        if(characterNode_.getNext()!= null && characterNode_.getNext().size()>0){
            for(CharacterNode childNode : characterNode_.getNext()){
                List<String> possibleChildStrings = getPossibleString(childNode);
                if(possibleChildStrings != null && possibleChildStrings.size()>0){
                    for(String str : possibleChildStrings){
                        possibleString.add(new StringBuilder().append(characterNode_.getCharacter()).append(str).toString());
                    }
                }else{
                    possibleString.add(new StringBuilder().append(characterNode_.getCharacter()).toString());
                }
            }
        }else{
            possibleString.add(new StringBuilder().append(characterNode_.getCharacter()).toString());
        }
        return possibleString;
    }
}
