

import java.time.*;

public class calculator {

    private Double x;
    private Double y;
    private Double result;
    LocalTime timePoint;
    LocalDate datePoint;

    public calculator() {
        timePoint = LocalTime.now();
        datePoint = LocalDate.now();
    }

    public void all(Double x, Double y){
        this.add(x, y);
        this.sub(x, y);
        this.mul(x, y);
        this.div(x, y);
    }
    public void add(Double x, Double y){
        result = x+y;
        System.out.println("add: " + result);
    }
    public void sub(Double x, Double y){
        result = x-y;
        System.out.println("sub: " + result);
    }
    public void mul(Double x, Double y){
        result = x*y;
        System.out.println("mul: " + result);
    }
    public void div(Double x, Double y){
        if(y!=0){
            result = x/y;
            System.out.println("div: " + result);
        }
        else{
            System.out.println("div: by 0 - not legal!!");
        }
    }


    public void info() {
        System.out.println("\n");
        System.out.println("Dziś jest: 2019.01.18");
        System.out.println("\n");
        System.out.println("Jestem programem: kalkólutator, wersja z błedami, ortograficznymi");
        System.out.println("Lepszym nie będę, jakkolwiek, będę próbował :)");
        System.out.println("\n");
    }
    public void get_start_time() {
        System.out.println("rozpocząłeś pracę o:");
        System.out.println(" " + datePoint );
        System.out.println(" " + timePoint + "\n");
    }
}
