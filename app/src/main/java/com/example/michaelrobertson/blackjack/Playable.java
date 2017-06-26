package com.example.michaelrobertson.blackjack;

import java.util.ArrayList;

/**
 * Created by michaelrobertson on 23/06/2017.
 */

public interface Playable {
    void drawCard(Card card);

    int getTotal();

    void showHand();


}