package com.pokerhands.handler;

import com.pokerhands.entity.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Player {

    private List<Card> cards = new ArrayList<Card>();
    private static final Integer GENERIC = 1;
    private static final Integer PAIR = 2;
    private static final Integer DOUBLE_PAIR = 3;
    private static final Integer THREE_SAME = 4;
    private static final Integer STRAIGH =5;
    private static final Integer SAME_TYPE = 6;
    private static final Integer THREE_SAME_TWO_PAIR= 7;
    private static final Integer FOUR_SAME = 8;
    private static final Integer STRAIGH_SAME_TYPE = 9;

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Integer getLevel(){
        List<Integer> points = getPoints();
        Map<Integer,List<Integer>> pointsMap = points.stream().collect(Collectors.groupingBy(x -> x));
        List<List<Integer>> tempList=pointsMap.values().stream().sorted((a,b)->b.size()-a.size()).collect(Collectors.toList());
        if(tempList.size()==5){
            if(isStraigh())return STRAIGH;
            return GENERIC;
        }
        if(tempList.size()==4){
            return PAIR;
        }
        if(tempList.size()==3){
            if(tempList.get(0).size()==3){
                return THREE_SAME;
            }
            return DOUBLE_PAIR;
        }
        Integer level = tempList.get(0).size();
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

    private boolean isStraigh(){
        List<Integer> points = this.getPoints();
        for(int i=0;i<points.size()-1;i++){
            if(points.get(i)-points.get(i+1)!=1)return false;
        }
        return true;
    }



}
