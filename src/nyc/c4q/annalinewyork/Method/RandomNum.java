package nyc.c4q.annalinewyork.Method;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by c4q-nali on 4/16/15.
 * Write a method called random that takes 2 ints as parameters and returns a random int within that range.
 */
public class RandomNum {
    public static void main(String[] args) {
        System.out.println("input two integers.");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        random(firstNum,secondNum);

    }

    public static void random(int a, int b) {

       Random number = new Random();
       int ramdonNum = number.nextInt(b)+a;

        System.out.println(ramdonNum);

       /* for (int i = a; i <= b; i++){
            int number = (int)(Math.random()*b);

        }
        //create some random numbers. not just one random number
*/
    }
}
