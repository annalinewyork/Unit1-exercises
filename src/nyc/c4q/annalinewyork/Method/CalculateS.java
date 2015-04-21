package nyc.c4q.annalinewyork.Method;

import java.util.Scanner;

/**
 * Created by c4q-nali on 4/16/15.
 * Write a method called calculateSquare that takes an int as a parameter and returns the square of that integer.
 */
public class CalculateS {
    public static void main (String [] args){
        System.out.println("Input an integer, I will give back it's square");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        System.out.println("the number you input is " + x + " , it's square is "+ calculateSquare(x));
;    }

    public static double calculateSquare (int a){
        return a*a;
    }
}
//what is I wanna use "IF" statement to avoid the user did not input an integer.....
