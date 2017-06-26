package deck;

/**
 * Created by michaelrobertson on 23/06/2017.
 */

public enum CardNumber {

    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(11);

    private int number;

    CardNumber (int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}
