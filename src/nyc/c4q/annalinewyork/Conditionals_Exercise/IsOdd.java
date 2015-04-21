package nyc.c4q.annalinewyork.Conditionals_Exercise;

import java.util.Scanner;

/**
 * Created by c4q-nali on 4/16/15.
 * Write a method isOdd that takes in an int n. Returns a true if n is odd, and false otherwise.
 */
public class IsOdd {
    public static void main(String[] args) {
        System.out.println("input an integer.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(isOdd(number));
    }

    public static boolean isOdd(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
