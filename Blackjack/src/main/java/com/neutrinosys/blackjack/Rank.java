package com.neutrinosys.blackjack;

// enum - is a special form of a class
    // have a few methods and properties in them, such as ordinal
    // ordinal - is a numerical position of each enumeration
// this is basically an order number of constants
public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private int value;
    private String favoriteSong;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() { // if face card use *case* else use default
//        return switch(this){ // this - the instance of the object we are working with
//            case JACK, QUEEN, KING -> 10;
//            default -> ordinal() + 1;
            //this is essentially the same?
            return value;
        };
//        return this.rank == Rank.JACK ? 10 : this.rank.ordinal() + 1;
    }
// }

