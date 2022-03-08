package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Counters counter = new Counters();

        do {
            for (int i = 0; i < 10; i++) {
                counter.makeCounter();
                counter.guessCounter();
            }

            System.out.println("You got " + (counter.getPoints()) + " points.");
            System.out.println("Would you like to play again? y/n ");
            Scanner input = new Scanner(System.in);
            String option = input.next();
            if (option.equals("y")) {
            }
            else {
                System.out.println("Bye.");
                break;
            }
        } while (true);
    }
}
