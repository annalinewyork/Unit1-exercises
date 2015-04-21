package nyc.c4q.annalinewyork.Conditionals_Exercise;

import java.util.Scanner;

/**
 * Created by c4q-nali on 4/16/15.
 * Write a method isMultipleOfThree that takes in an int n. Returns true
 * if n is a multiple of three, and false otherwise.
 */
public class IsMultipleOfThree {
    public static void main (String [] args){
        System.out.println("input an integer, true if it a multiple, false if not.");
        Scanner input = new Scanner(System.in);
        int userinput = input.nextInt();

        System.out.println(isMultipleOfThree(userinput));

    }
    public static boolean isMultipleOfThree (int n){
        if (n % 3 == 0){
            return true;
        }else {
            return false;
        }
    }
}
