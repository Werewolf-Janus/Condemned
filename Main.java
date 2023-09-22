import java.lang.Math;
import java.util.Arrays;
import java.lang.*;
public class Main {
    public static int n = 10;

    public static void cycle(int n) {
        int sum = 0;
        int mid = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        mid = sum / n;
        System.out.println("1: summ: " +sum);
        System.out.println("1: mid: "+ mid);
    }

    public static void whiler(int n) {
        int min = 0;
        int max = 0;
        int sum = 0;
        int i = 0;
        while (i < n) {
            sum = sum + i;
            if (min > i)
                min = i;
            if (max < i)
                max = i;
            i++;

        }
        System.out.println("2 summ: "+sum);
        System.out.println("2 min: "+min);
        System.out.println("2 max: "+max);
    }

    public static void scribe(String[] args ) {
        int n = 10;
        int f = 0;
        System.out.print("3 The  series is: ");
        for (int i = 0; i < n; i++) {
            f = i;
            System.out.println(f);
        }
    }
    public static void harmony (String[] args){
        int n = 10;
        double number = 1.0;
        String finNum;
        System.out.print("4 The harmonic series is: ");
        while (n > 0){
            String numfin = String.valueOf(number/ n);
            n--;
            System.out.println(String.valueOf(numfin));
        }

    }
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args){
        cycle(n);
        whiler(n);
        scribe(args);
        harmony(args);
        System.out.println("5 factorial: " +factorial(n));


    }

}



