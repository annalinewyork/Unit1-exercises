package nyc.c4q.annalinewyork.Conditionals_Exercise;

import java.util.Scanner;
//import java.lang.*;

/**
 * Created by c4q-nali on 4/16/15.
 * Write a method isOddAndIsMultipleOfThree2 - if you used isOdd and isMultipleofThree in your
 * last solution, don't use it this time. If you did not, write this method building on
 * your last methods.
 */

public class IsOddAndMultipleByThree2 {
    public static void main(String[] args) {
        System.out.println("input an integer.");
        Scanner input = new Scanner(System.in);
        int userinput = input.nextInt();

        String answer1, answer2;
        answer1 = Boolean.toString(isOdd(userinput));
        answer2 = Boolean.toString(isMultiple(userinput));

        if (answer1.equals(answer2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        //System.out.println(isOdd(userinput));
        //System.out.println(isMultiple(userinput));

    }

    public static boolean isOdd(int n) {
        return IsOdd.isOdd(n);
    }

    public static boolean isMultiple(int m) {
        return IsMultipleOfThree.isMultipleOfThree(m);
    }
}
