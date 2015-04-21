package nyc.c4q.annalinewyork.Loops_Exercise;

/**
 * Created by c4q-nali on 4/18/15.
 * 4. Write a method that takes in an int n and prints the even numbers 2 through n.
 * 5. Write a method that prints the sum of 1 through 10 using a loop.
 * 6. Write a method that takes in an int n and prints the sum of the numbers 1 through n using a loop.
 * 7. Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
 */
public class Exercise4567 {

    public static void main(String[] args) {
        printEven();
        System.out.println("-----------");
        sum1to10();
        System.out.println("-----------");
        print1toN(100);
        System.out.println("-----------");
        print1toN(10000);

    }
    //exercise 4
    public static void printEven() {
        int n = 2;
        System.out.println(n);
    }
    //exercise 5
    public static void sum1to10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    //exercise 6
    public static void print1toN (int n){
        int sum = 0;
        for (int i =1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }

}
    //exercise 7 is just call method of exercise 6 in the main method.
