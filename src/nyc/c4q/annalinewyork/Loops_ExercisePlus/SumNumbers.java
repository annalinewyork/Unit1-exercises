package nyc.c4q.annalinewyork.Loops_ExercisePlus;

import java.lang.*;

/**
 * Created by c4q-nali on 4/18/15.
 * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
 * A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char)
 * tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts
 * a string to an int.)
 * sumNumbers("abc123xyz") → 123
 * sumNumbers("aa11b33") → 44
 * sumNumbers("7 11") → 18
 */
public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNum("ab135good"));

    }

    public static int sumOfNum(String input) {

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char findChar = input.charAt(i);

            if (Character.isDigit(findChar)) {

                String a = Character.toString(findChar);
                sum = Integer.parseInt(a) + sum;
                // System.out.println(sum);
            }
        }
        return sum;
    }
}
