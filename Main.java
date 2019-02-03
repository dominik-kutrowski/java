package com.industry.math;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // ctrl + alt + l

        Double liczba1 = 0.0;
        Double liczba2 = 0.0;

        Scanner LineReader = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String startstop = "no";

        calculator.info();

        //dane wejściowe:
        do {
            Exception exception;
            do {
                exception = null;
                System.out.println("podaj liczbie 1: ");
                try {
                    liczba1 = LineReader.nextDouble();
                } catch (InputMismatchException e) {
                    LineReader.next();
                    exception = e;
                }
            } while (exception != null);
            do {
                exception = null;
                System.out.println("podaj liczbie 2: ");
                try {
                    liczba2 = LineReader.nextDouble();
                } catch (InputMismatchException e) {
                    LineReader.next();
                    exception = e;
                }
            } while (exception != null);

            //obliczenia:
            System.out.printf("\n\n add: " + calculator.add(liczba1, liczba2) +"\n");
            System.out.printf(" sub: " + calculator.sub(liczba1, liczba2) +"\n");
            System.out.printf(" mul: " + calculator.mul(liczba1, liczba2) +"\n");
            if(liczba2!=0) System.out.printf(" div: " + calculator.div(liczba1, liczba2) +"\n");
            else{System.out.printf(" div by 0 - maybe next time :)");}

            //koniec?
            System.out.println("\ncont. (no/yes): ");
            startstop = LineReader.next();

        } while (startstop == "yes");
    }
}
