package nyc.c4q.annalinewyork.Loops_Exercise;

/**
 * Created by c4q-nali on 4/18/15.
 * 1. Write a method that prints the numbers 1 through 10 using a loop.
 * 2. Write a method that prints the numbers 1 through 10 using a different kind of loop.
 * 3. Write a method that takes in an int n and prints the numbers 1 through n.
 */
public class Exercise123 {
    public static void main(String[] args) {
        sum1to10();
        System.out.println("---------------");//this is a line used for separate each exercises.
        sum1to10SecondWay();
        System.out.println("---------------");
        printN();
        System.out.println("---------------");

    }
    //exercise 1
    public static void sum1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    //exercise 2
    public static void sum1to10SecondWay() {
        int i = 1;
        do {
            System.out.println(i);
            i = i + 1;
        }
        while ((i <= 10));
    }
    //exercise 3
    public static void printN (){
        int n =1;
        System.out.println(n);
    }
}
