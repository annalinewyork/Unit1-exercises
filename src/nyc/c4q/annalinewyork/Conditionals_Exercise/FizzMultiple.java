package nyc.c4q.annalinewyork.Conditionals_Exercise;

import java.util.Scanner;

/**
 * Created by c4q-nali on 4/16/15.
 * Write a method fizzMultipleofThree that takes in an int n and
 * prints "Fizz" if n is a multiple of three, and prints n otherwise.
 */
public class FizzMultiple {
    public static void main(String[] args) {
        System.out.println("input an integer, true if it a multiple, false if not.");
        Scanner input = new Scanner(System.in);
        int userinput = input.nextInt();
        ifzzMultipleOfThree(userinput);

    }

    public static void ifzzMultipleOfThree (int n){
        if (n % 3 == 0){
            System.out.println("Fizz");
        }else{
            System.out.println("n");
        }

    }
}
