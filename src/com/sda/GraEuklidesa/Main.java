package com.sda.GraEuklidesa;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random gen = new Random();
        int tokenA = gen.nextInt(1000);
        int tokenB = gen.nextInt(1000);
        int counter = 0;

        System.out.println("Startowa ilość żetonów gracza A: "
                           + tokenA + " i gracza B: " + tokenB);

        while (tokenA != tokenB) {
            if (tokenA > tokenB) {
                tokenA = tokenA - tokenB;
            } else tokenB = tokenB - tokenA;
            counter++;
            System.out.println("Wynik po rozdaniu nr: "
                    + counter
                    + " wynosi: tokenA = "
                    + tokenA
                    + " tokenB = "
                    + tokenB);
        }
        System.out.println("Łączna liczba żetonów po zakończeniu gry: " + (tokenA+tokenB));
    }
}
