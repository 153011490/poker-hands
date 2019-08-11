package com.pokerhands.handler;

import com.pokerhands.entity.Card;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RefereeTest {
    private Referee referee;

    @Before
    public void init(){
        referee = new Referee();
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2H_3D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"H")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playEven_when_call_getBestPlayer_then_give_3H_3D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(3,"H")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("play even",result);
    }
}