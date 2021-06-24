package com.company;

import java.util.Scanner;

public class Human {

    public static int makeMoveHuman(int leftover) {
        Scanner scanNumber = new Scanner(System.in);
        int matchesHuman = scanNumber.nextInt();
        while (matchesHuman > 3 || matchesHuman < 1) {
            Console.messageError();
            matchesHuman = scanNumber.nextInt();
        }
        return leftover - matchesHuman;
    }
}
