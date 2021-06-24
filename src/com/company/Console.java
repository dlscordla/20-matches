package com.company;

public class Console {

    public static void messageBegin(int allMatches) {
        System.out.println("Игра начинается. На столе лежит " + allMatches + " спичек.");
    }

    public static void messageActivePlayer(boolean active) {
        if (active) {
            System.out.print(" - Ваш ход. Тяните 1, 2 или 3 спички. ");
        } else {
            System.out.print(" - Ход компьютера.");
        }
    }

    public static void messageMatchesAI(int matchesAI) {
        System.out.println(" Количество выбранных компьютером спичек = " + matchesAI + ".");
    }

    public static void messageLeftover(int leftover) {
        System.out.println("На столе осталось " + leftover + " спичек.");
    }

    public static void messageError() {
        System.out.println("Вы ввели неверное число. Попробуйте еще раз.");
    }

    public static void messageEndOfGame() {
        System.out.println("Вам досталась последняя спичка. Вы проиграли!");
    }
}