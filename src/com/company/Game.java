package com.company;

public class Game {

    private static boolean active;
    static int currentAmountOfMatches = 20;

    private static int activePlayer(boolean active) {
        if (active) {
            return Human.makeMoveHuman(currentAmountOfMatches);
        } else {
            return Computer.makeMoveAI(currentAmountOfMatches);
        }
    }

    private static boolean switchActive(boolean active) {
        return !active;
    }

    public static void main(String[] args) {
        Console.messageBegin(currentAmountOfMatches);
        while (currentAmountOfMatches > 1) {
            Console.messageActivePlayer(active);
            currentAmountOfMatches = activePlayer(active);
            Console.messageLeftover(currentAmountOfMatches);
            active = switchActive(active);
        }
        Console.messageEndOfGame();
    }
}