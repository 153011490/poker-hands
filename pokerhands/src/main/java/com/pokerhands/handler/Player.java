package com.pokerhands.handler;

import com.pokerhands.entity.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Player {

    private List<Card> cards = new ArrayList<Card>();

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Integer getLevel(){
        List<Integer> points = getPoints();
        Map<Integer,List<Integer>> pointsMap = points.stream().collect(Collectors.groupingBy(x -> x));
        Integer level = pointsMap.values().stream().sorted((a,b)->b.size()-a.size()).collect(Collectors.toList()).get(0).size();
        return level;
    }

    public List<Integer> getPoints(){
        if(this.cards == null)return null;
        List<Integer> points = new ArrayList<>();
        this.cards.stream().forEach(item -> {
            points.add(item.getPoint());
        });
        return points.stream().sorted((a,b)->b-a).collect(Collectors.toList());
    }
}
