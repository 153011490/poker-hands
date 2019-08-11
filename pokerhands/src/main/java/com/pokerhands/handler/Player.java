package com.pokerhands.handler;

import com.pokerhands.entity.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> cards = new ArrayList<Card>();

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
