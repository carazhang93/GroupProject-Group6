/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 *
 * @author Xiaoyi Zhang
 */
public class GoFishPlayer extends Player {
    private ArrayList<Card> cardsOnHand;//num of cards on each player's hand
    private Player[] groupPlayers;
    private GroupOfCards cardsGroup;
    private String role;
    public static final int FISRSTHAND =5;
    
    public GoFishPlayer(String name, int size){
        super(name);
        this.cardsOnHand= new ArrayList<>();
        this.groupPlayers = new GoFishPlayer[numOfPlayer()];
        this.cardsGroup = new GroupOfCards(size);
    }
    
    public void setGroupPlayers(){
        cardsGroup.shuffle();
        for(int i =0; i<numOfPlayer();i++){
            GoFishPlayer player = new GoFishPlayer(groupPlayers[i].getName(), 1); 
            for(int count=0; count<FISRSTHAND;count++){
               Card card = cardsGroup.getCards().remove(0);
               player.addPlayerCards(card);
               
            }
        }    
    }
    
    public void addPlayerCards(Card card){
            this.cardsOnHand.add(card);   
    }
    
    public void removePlayerCards(Card card){
            this.cardsOnHand.remove(card);
    }
    
    public ArrayList<Card> getPlayerCards(){
        return this.cardsOnHand;
    }
    
    public void setRole(String role){
        this.role=role;
    }
    
    public String getRole(){
        return this.role;
    }
    
    public int numCards(){
     return cardsOnHand.size();
    }
    
    public String maxCard(){
        String maxCard=null;
        int maxCount=0;
        
        for(int i =0; i<cardsOnHand.size(); i++){
            int count=0;
            for(int j=0; j<cardsOnHand.size(); j++){
                if(cardsOnHand.get(i).getCardRank().equals(cardsOnHand.get(j).getCardRank())){
                
                    count++;
                }
            }
            if (count>maxCount){
                maxCount=count;
                maxCard=cardsOnHand.get(i).getCardRank();
            }
        }
        
        return maxCard;
    }
    
    
    public void play(){
        if(getRole().equals("player")){
            for(Player player:names){
            
            }
        }else if(getRole().equals("competitor")){
        
        
        }else{
        
            System.out.println("Game ends.");
        }
    }
}
