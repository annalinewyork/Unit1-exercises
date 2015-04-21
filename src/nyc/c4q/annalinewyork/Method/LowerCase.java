package nyc.c4q.annalinewyork.Method; /**
 * Created by c4q-nali on 4/16/15.
 * Write a method called toLowerCase that takes a String as a parameter and returns the String in lower case.
 */

import java.util.Scanner;

public class LowerCase {
    public static void main (String [] args){

        System.out.println("please input some words.");
        Scanner input = new Scanner (System.in);
        String userinput = input.nextLine();

        System.out.println(toLowerCase(userinput));


    }

    public static String toLowerCase (String words){
        return words.toLowerCase();
    }
}
