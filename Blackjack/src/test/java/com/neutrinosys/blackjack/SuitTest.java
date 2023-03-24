package com.neutrinosys.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    void hearPrintsHeart(){
        assertEquals("\u2665", Suit.HEARTS.toString());
    }

}