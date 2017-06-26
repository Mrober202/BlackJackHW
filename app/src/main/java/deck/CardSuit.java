package deck;

/**
 * Created by michaelrobertson on 23/06/2017.
 */

public enum CardSuit {
    SPADES("Spades"),
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds");

    private String type;

    CardSuit(String type){
        this.type = type;
    }

    public String getSuit() {
        return type;
    }
}


