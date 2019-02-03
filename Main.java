

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // ctrl + alt + l

        Scanner LineReader = new Scanner(System.in);
        calculator C1 = new calculator();
        String StartStop = "no";

        C1.info();
        C1.get_start_time();

        Double liczba1 = 0.0;
        Double liczba2 = 0.0;

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

            C1.all(liczba1, liczba2);

            System.out.println("\ncont. (no/yes): ");
            StartStop = LineReader.next();

        } while (StartStop == "yes");
    }
}
