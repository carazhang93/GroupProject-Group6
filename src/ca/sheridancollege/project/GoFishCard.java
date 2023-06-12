/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Xiaoyi Zhang
 */
public class GoFishCard extends Card{
    
    public GoFishCard(){
        
    }
    
    public GoFishCard(String suit, String rank){
        this.suit=suit;
        this.rank=rank;
    }
    
    @Override
    public String toString(){
        return suit+" "+rank;
    }  
}
