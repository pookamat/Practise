package com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pkama on 9/18/2016.
 */
public class Dictionary {
//    private List<CharacterNode> _roots;
    private HashMap<Character,CharacterNode> _rootMap;

    public Dictionary(List<String> ListofStrings){
    	_rootMap = new HashMap<Character,CharacterNode>();
        for(String string : ListofStrings){
            char[] arr= string.toCharArray();

            CharacterNode previousCharacterNode = null;
            for(int i=0; i<arr.length; i++)
            {
                CharacterNode currentCharNode=null;
                char currentCharacter = arr[i];
                Map<Character,CharacterNode> nodesToBeSearched = null;
                if(previousCharacterNode == null){
                    nodesToBeSearched= _rootMap;
                }
                else {
                    nodesToBeSearched=previousCharacterNode.getNext();
                }

                if(nodesToBeSearched.containsKey(currentCharacter)){
                	currentCharNode = nodesToBeSearched.get(currentCharacter);
                    
                }
                else
                {
                	currentCharNode= new CharacterNode(currentCharacter);
                	nodesToBeSearched.put(currentCharacter,currentCharNode);
                	
                }/*
                    for(CharacterNode characterNode : nodesToBeSearched){
                        if(characterNode.getCharacter()== currentCharacter){
                            currentCharNode = characterNode;
                            break;
                        }
                    }
                    if(currentCharNode == null){
                        currentCharNode= new CharacterNode(currentCharacter);
                        nodesToBeSearched.add(currentCharNode);
                    }*/
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
            Map<Character,CharacterNode> nodesToBeSearched = null;
            if(previousCharacterNode == null){
                nodesToBeSearched= _rootMap;
            }
            else {
                nodesToBeSearched=previousCharacterNode.getNext();
            }

            if(nodesToBeSearched.containsKey(currentCharacter)){
            	currentCharNode = nodesToBeSearched.get(currentCharacter);
                
            }
           
            /*for(CharacterNode characterNode : nodesToBeSearched){
                if(characterNode.getCharacter()== currentCharacter){
                    currentCharNode = characterNode;
                    break;
                }
            }*/
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
            for(CharacterNode childNode : characterNode_.getNext().values()){
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
