/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Xiaoyi Zhang  Meichao Zhao
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class GoFishPlayer extends Player {
    
    public static void main(String[] args){
        GoFishPlayer myPlayer = new GoFishPlayer();
        myPlayer.play();
    }
    
    public void play(){
       dealer();
       
    }
    public String dealer(){
        String myReqment;
        String[][] myCards = {{"CLUBS","ONE"},{"DIAMONDS","ONE"},{"CLUBS","THREE"},{"DIAMONDS","FOUR"},
                             {"HEARTS","FIVE"}};
       ArrayList<String> myArray = new ArrayList<>();
       for(String[] myRow: myCards)
           for (String myCol: myRow)
               myArray.add(myCol);
        for(int i = 0; i < myArray.size(); i += 1){
            //System.out.print("The element to be deleted: " + myArray.get(i) + "\n");
           myArray.remove(i);
        }
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        for (int i = 0; i< myArray.size(); i ++){
            if (myMap.containsKey(myArray.get(i))){
                int temp = myMap.get(myArray.get(i));
                myMap.put(myArray.get(i),temp + 1);
            }
            else
                myMap.put(myArray.get(i), 1);
        }

        Collection<Integer> count = myMap.values();
        int maxCount = Collections.max(count);
        String maxString = " ";
        for(Map.Entry<String, Integer> entry: myMap.entrySet()){
            if (maxCount == entry.getValue()){
                maxString = entry.getKey();
            }
            
        }
        myReqment = maxString;
        System.out.println("Initial Mappings are: " + myMap);
        System.out.println("The occurence of element " + maxString + " is: " + maxCount);
        return myReqment;
    }
    public void play2(String maxString){
        
    }
}
