package com.example.michaelrobertson.blackjack;

import java.util.ArrayList;

/**
 * Created by michaelrobertson on 23/06/2017.
 */

public class House implements Playable {

    private ArrayList<Card> houseHand;

    public House() {
        this.houseHand = new ArrayList<>();
    }

    public int handCount() {
        return houseHand.size();
    }

    public void drawCard(Card card){
        houseHand.add(card);
    }

    public void getHand() {

    }

    public int getTotal() {
        int total = 0;
        for (Card card : houseHand) {
            total += card.getValue();
        }
        return total;
    }

    public void showHand() {

    }
}