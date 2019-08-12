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

    @Test
    public void should_return_playEven_when_call_getBestPlayer_then_give_2C3H4C7H8C_2D3S4D7S8D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"H"),new Card(4,"C"),new Card(7,"H"),new Card(8,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(2,"D"),new Card(3,"S"),new Card(4,"D"),new Card(7,"S"),new Card(8,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("play even",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C3H4C7H8C_2D3S4D7S7D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"H"),new Card(4,"C"),new Card(7,"H"),new Card(8,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(2,"D"),new Card(3,"S"),new Card(4,"D"),new Card(7,"S"),new Card(7,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playEven_when_call_getBestPlayer_then_give_2C3H4C7H7C_2D3S4D7S7D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"H"),new Card(4,"C"),new Card(7,"H"),new Card(7,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(2,"D"),new Card(3,"S"),new Card(4,"D"),new Card(7,"S"),new Card(7,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("play even",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C3H4C7H7C_2D3S5D7S7D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"H"),new Card(4,"C"),new Card(7,"H"),new Card(8,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(2,"D"),new Card(3,"S"),new Card(5,"D"),new Card(7,"S"),new Card(7,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C3H3C4H4C_2D3S3D5S5D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"H"),new Card(3,"C"),new Card(4,"H"),new Card(4,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(2,"D"),new Card(3,"S"),new Card(3,"D"),new Card(5,"S"),new Card(5,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C4H4C5H5C_3D4S4D5S5D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(4,"H"),new Card(4,"C"),new Card(5,"H"),new Card(5,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D"),new Card(4,"S"),new Card(4,"D"),new Card(5,"S"),new Card(5,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C4H4C5H6C_3D4S4D5S5D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(4,"H"),new Card(4,"C"),new Card(5,"H"),new Card(6,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D"),new Card(4,"S"),new Card(4,"D"),new Card(5,"S"),new Card(5,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C3H4C5H7C_3D4S4D5S5D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"H"),new Card(4,"C"),new Card(5,"H"),new Card(7,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D"),new Card(4,"S"),new Card(4,"D"),new Card(5,"S"),new Card(5,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C3H3C5H5C_3D4S5D5S5D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"H"),new Card(3,"C"),new Card(5,"H"),new Card(5,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D"),new Card(4,"S"),new Card(5,"D"),new Card(5,"S"),new Card(5,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playerA_when_call_getBestPlayer_then_give_2C3H4C5H6C_3D4S5D5S5D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"H"),new Card(4,"C"),new Card(5,"H"),new Card(6,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D"),new Card(4,"S"),new Card(5,"D"),new Card(5,"S"),new Card(5,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerA",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C3H4C5H6C_3D4S5D6S7D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"H"),new Card(4,"C"),new Card(5,"H"),new Card(6,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D"),new Card(4,"S"),new Card(5,"D"),new Card(6,"S"),new Card(7,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playerA_when_call_getBestPlayer_then_give_2C3C4C5C9C_3D4S5D6S7D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"C"),new Card(4,"C"),new Card(5,"C"),new Card(9,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D"),new Card(4,"S"),new Card(5,"D"),new Card(6,"S"),new Card(7,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerA",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C3C4C5C9C_3D4D5D6D9D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"C"),new Card(4,"C"),new Card(5,"C"),new Card(9,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"D"),new Card(4,"D"),new Card(5,"D"),new Card(6,"D"),new Card(9,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playerA_when_call_getBestPlayer_then_give_2C2D3H3S3D_4D5D6D7D9D(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(2,"D"),new Card(3,"H"),new Card(3,"S"),new Card(3,"D")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(4,"D"),new Card(5,"D"),new Card(6,"D"),new Card(7,"D"),new Card(9,"D")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerA",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C2D3H3S3D_4D4C5D5C5H(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(2,"D"),new Card(3,"H"),new Card(3,"S"),new Card(3,"D")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(4,"D"),new Card(4,"C"),new Card(5,"D"),new Card(5,"C"),new Card(5,"H")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playerA_when_call_getBestPlayer_then_give_2C3S3H3S3D_4D4C5D5C5H(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"S"),new Card(3,"H"),new Card(3,"S"),new Card(3,"D")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(4,"D"),new Card(4,"C"),new Card(5,"D"),new Card(5,"C"),new Card(5,"H")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerA",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C3S3H3S3D_4D5S5D5C5H(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"S"),new Card(3,"H"),new Card(3,"S"),new Card(3,"D")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(4,"D"),new Card(5,"S"),new Card(5,"D"),new Card(5,"C"),new Card(5,"H")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

    @Test
    public void should_return_playerA_when_call_getBestPlayer_then_give_2C3C4C5C6C_4D5S5D5C5H(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"C"),new Card(4,"C"),new Card(5,"C"),new Card(6,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(4,"D"),new Card(5,"S"),new Card(5,"D"),new Card(5,"C"),new Card(5,"H")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerA",result);
    }

    @Test
    public void should_return_playerB_when_call_getBestPlayer_then_give_2C3C4C5C6C_3H4H5H6H7H(){
        //given
        Player playerA = new Player();
        playerA.setCards(Arrays.asList(new Card(2,"C"),new Card(3,"C"),new Card(4,"C"),new Card(5,"C"),new Card(6,"C")));
        Player playerB = new Player();
        playerB.setCards(Arrays.asList(new Card(3,"H"),new Card(4,"H"),new Card(5,"H"),new Card(6,"H"),new Card(7,"H")));
        //when
        String result = referee.getBestPlayer(playerA,playerB);
        //then
        Assert.assertEquals("playerB",result);
    }

}