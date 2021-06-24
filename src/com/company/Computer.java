package com.company;

public class Computer {

    public static int makeMoveAI(int leftover) {
        if (Game.currentAmountOfMatches == 20) {
            Console.messageMatchesAI(3);
            return 17;
        }
        int matchesAI = (leftover - 1) % 4;
        Console.messageMatchesAI(matchesAI);
        return leftover - matchesAI;
    }
}
