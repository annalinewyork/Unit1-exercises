import java.util.Scanner;

/**
 * Created by c4q-nali on 4/16/15.
 * Write a method called isMultiple that takes 2 int parameters and determines
 * if the second is a multiple of the first.
*/
public class multiple {
    public static void main (String [] args){
        System.out.println("input two integers");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        //int firstNumber = 6;
        //int secondNumber = 3;

        System.out.println(isMultiple(firstNumber,secondNumber));
    }

    public static boolean isMultiple (int a, int b){

        if (b % a ==0){
            return true;
        }
        return false;

    }
}
