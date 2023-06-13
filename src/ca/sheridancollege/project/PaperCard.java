/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author michelle
 */
import java.util.Random;
public class PaperCard extends Card{

    public PaperCard() {
        super();
    }

    public PaperCard(String suit, String rank) {
        super(suit, rank);
    }
    
    
    public static PaperCard[] generateHand(int numCards) {
        PaperCard[] hand = new PaperCard[numCards];
        Random random = new Random();
                
        for(int i =0 ; i< hand.length; i++)
        {
            int numValues = PaperCard.Rank.values().length; //how many possible values
            String value = PaperCard.Rank.values()[random.nextInt(numValues)].name();

            int numSuits = PaperCard.Suit.values().length;//how many suits
            String suit = PaperCard.Suit.values()[random.nextInt(numSuits)].name();
            
            PaperCard card = new PaperCard(suit,value);
            hand[i] = card;//put card into hand
        }
        return hand;//may have duplicates
    }
    
    @Override
    public String toString(){
        String result = this.suit + " " + this.rank;
        return result;
    }
}
