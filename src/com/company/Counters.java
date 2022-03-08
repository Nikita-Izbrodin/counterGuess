package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Counters {

    String colour;
    int points;

    public int getPoints() {
        return points;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Counters{" +
                "colour='" + colour + '\'' +
                '}';
    }

    void makeCounter(){
        Random random = new Random();
        int number = random.nextInt(3);
        if (number == 0) {
            String colour = "r";
            this.setColour(colour);
        }
        if (number == 1) {
            String colour = "g";
            this.setColour(colour);
        }
        if (number == 2) {
            String colour = "b";
            this.setColour(colour);
        }
        //System.out.println(this.getColour());
    }

    void guessCounter() {
        System.out.println("Guess a colour r/b/g ");
        Scanner input = new Scanner(System.in);
        String guess = input.next().toLowerCase(Locale.ROOT);
        if (guess.equals(this.colour)) {
            points = points +3;
        }
        else {
            points = points -1;
        }
    }
}
