package nyc.c4q.annalinewyork.Method;

import java.util.Scanner;

/**
 * Created by c4q-nali on 4/16/15.
 * Write a method called prettyInteger that takes an int as a parameter and
 * prints the integer surrounded by asterisks with the length of each side equal to the given integer.
 */
public class PrettyInt {

    public static void main(String[] args) {
        System.out.println("input a number.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        prettyInteger(number);

    }

    public static void prettyInteger (int a){

        String star = "";
        char x = '*';
        for (int i =1; i <=a; i++){
            star = star+x;
        }
        System.out.println(star+ " "+a+ " "+ star);
    }
}
