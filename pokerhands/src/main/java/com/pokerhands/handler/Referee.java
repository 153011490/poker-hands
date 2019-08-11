package com.pokerhands.handler;

public class Referee {

    public String getBestPlayer(Player playerA,Player playerB){
        if(playerA==null||playerB==null)return null;
        if(playerA.getCards()==null||playerB.getCards()==null)return null;
        Integer cardsASize=playerA.getCards().size();
        Integer cardsBSize=playerB.getCards().size();
        if(cardsASize == 1 && cardsBSize == 1){
            return playerA.getCards().get(0).getPoint() > playerB.getCards().get(0).getPoint() ? "playerA" : "playerB";
        }
        return "play even";
    }


}
