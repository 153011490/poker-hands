package com.pokerhands.entity;

public class Card {
    private int point;
    private String type;

    public Card(int point, String type) {
        this.point = point;
        this.type = type;
    }

    public int getPoint() {
        return point;
    }

    public String getType() {
        return type;
    }
}
