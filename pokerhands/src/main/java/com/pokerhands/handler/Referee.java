package com.pokerhands.handler;

public class Referee {

    public String getBestPlayer(Player playerA,Player playerB){
        if(playerA==null||playerB==null)return null;
        if(playerA.getCards()==null||playerB.getCards()==null)return null;
        Integer cardsASize=playerA.getCards().size();
        Integer cardsBSize=playerB.getCards().size();
        if(cardsASize == 1 && cardsBSize == 1){
            if(playerA.getCards().get(0).getPoint() > playerB.getCards().get(0).getPoint()){
                return "playerA";
            }else if(playerA.getCards().get(0).getPoint() < playerB.getCards().get(0).getPoint()){
                return "playerB";
            }
        }
        if(cardsASize >= 2 && cardsBSize >= 2){
            if(playerA.getLevel() > playerB.getLevel()){
                return "playerA";
            }else if(playerA.getLevel() < playerB.getLevel()){
                return "playerB";
            }else{
                for(int i=0 ; i<2 ; i++){
                    if(playerA.getPoints().get(i) > playerB.getPoints().get(i))return "playerA";
                    else if(playerA.getPoints().get(i) < playerB.getPoints().get(i))return "playerB";
                }
            }
        }
        return "play even";
    }


}
