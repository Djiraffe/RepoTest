//Yet another line added.
package ca.sheridancollege.week2.cardexample;

/**
 * A simple java card class.
 * @author Ali Hassan
 */
public class card {
    private String suit;
    private int value;

    /**
     * A constructor to create card class.
     * @param suit
     * @param value 
     */
    public card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        
        if(suit.equals("Spades")||suit.equals("Diamond")||
                suit.equals("Clubs")||suit.equals("Hearts"))
            this.suit = suit;
        else{
            System.out.println("Incorrect suit. Please enter a valid suit");
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value>0 && value<14)
            this.value = value;
        else
            System.out.println("Incorrect value. Please enter a value card value.");
    }
    
    
}
