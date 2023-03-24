package com.neutrinosys.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void canGetValueOfATwoCard() {
        Card card2 = new Card(Suit.DIAMONDS, Rank.TWO);
        assertEquals(2, card2.getValue());
    }
    @Test
    void canGetValueOfAThreeCard() {
        Card card3 = new Card(Suit.DIAMONDS, Rank.THREE);
        assertEquals(3, card3.getValue());
    }
    @Test
    void canGetValueOfAAceCard() {
        Card cardAce = new Card(Suit.DIAMONDS, Rank.ACE);
        assertEquals(1, cardAce.getValue());
    }
    @Test
    void canGetValueOfAJackCard() {
        Card cardJack = new Card(Suit.DIAMONDS, Rank.JACK);
        assertEquals(10, cardJack.getValue());
    }
    @Test
    void canGetValueOfAKingCard() {
        Card cardKing = new Card(Suit.DIAMONDS, Rank.KING);
        assertEquals(10, cardKing.getValue());
    }

}