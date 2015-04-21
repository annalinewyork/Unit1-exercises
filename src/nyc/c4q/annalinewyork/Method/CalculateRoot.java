package nyc.c4q.annalinewyork.Method;

import java.util.Scanner;

/**
 * Created by c4q-nali on 4/16/15.
 * Write a method called calculateSquareRoot that takes an int as a parameter and returns the square root of that integer.
 */
public class CalculateRoot {

    public static void main (String [] args){
        System.out.println("put input an integer, I will calculate its' square root.");
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();

        System.out.println(calculateSquareRoot(c));


    }

    public static double calculateSquareRoot (double a){
        return Math.sqrt(a);
    }
}
