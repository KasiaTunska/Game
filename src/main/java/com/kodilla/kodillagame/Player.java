package com.kodilla.kodillagame;

public enum Player {
    USER, COMPUTER;

    public Player opposite() {
        switch (this) {
            case USER:
                return COMPUTER;
            case COMPUTER:
                return USER;
            default:
                throw new IllegalStateException("This should never happen");
        }
    }

}
