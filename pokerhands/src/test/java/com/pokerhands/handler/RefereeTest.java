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

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2H3H_3D3S(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"H"),new Card(3,"H")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D"),new Card(3,"S")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playEven_when_call_getBestPlayer_then_give_3C3H_3D3S(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(3,"C"),new Card(3,"H")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D"),new Card(3,"S")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("play even",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C3H4C7H8C_2D3S4D8S9D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"H"),new Card(4,"C"),new Card(7,"H"),new Card(8,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(2,"D"),new Card(3,"S"),new Card(4,"D"),new Card(8,"S"),new Card(9,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

}