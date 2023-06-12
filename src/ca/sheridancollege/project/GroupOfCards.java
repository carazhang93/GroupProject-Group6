/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards{

    //The group of cards, stored in an ArrayList
    ArrayList<Card> cards;
    private int size;//the size of the grouping
    protected Card card;

    enum Suit {CLUBS,DIAMONDS,HEARTS,SPADES};
    enum Rank {ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,JACK,QUEEN,KING};
    Suit[] suits=Suit.values();
    Rank[] ranks=Rank.values();
    
    public GroupOfCards(int size) {
        
        this.size = size;
        this.cards =new ArrayList<>(); 
        
        for(int i=0;i<suits.length;i++){
            for(int j=0; j<ranks.length;j++){
                card = new GoFishCard(suits[i].name(),ranks[j].name());
                cards.add(card);
            }
        }  
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}//end class
