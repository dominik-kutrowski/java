package com.industry.math;

//import java.time.*;

public class Calculator {

    private Double x;
    private Double y;
    /*private LocalTime timePoint;
    private LocalDate datePoint;*/

    public Calculator() {
        // zgodnie z SRP, być poniższego nie powinno, czy przesadzam?
        //timePoint = LocalTime.now();
        //datePoint = LocalDate.now();
    }

    public Double add(Double x, Double y){ return x+y; }
    public Double sub(Double x, Double y){ return x-y; }
    public Double mul(Double x, Double y){ return x*y; }
    public Double div(Double x, Double y){ return x/y; }

    public void info() {
        System.out.println("\n");
        System.out.println("Dziś jest: 2019.01.18");
        System.out.println("\n");
        System.out.println("Jestem klasą: kalkólutator, wersja z błedami, ortograficznymi");
        System.out.println("Lepszą nie będę, jakkolwiek, będę próbowała :)");
        System.out.println("\n");
    }
    /*
    public void get_start_time() {
        System.out.println("rozpocząłeś pracę o:");
        System.out.println(" " + datePoint );
        System.out.println(" " + timePoint + "\n");
    }
    */
}
