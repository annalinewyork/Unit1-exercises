package nyc.c4q.annalinewyork.Loops_Exercise;

/**
 * Created by c4q-nali on 4/18/15.
 * 8. Write a method that takes in an int n and a String s and prints out s on its own line, n times.
 * If n is negative, print "".
 * 9. Modify the method to print out the string concatenated with itself n times.
 * 10. Write a method that prints the first ten Fibonnaci numbers.
 * 11. Modify the method to sum the first ten Fibonnaci numbers.
 * 12. Modify the method to take in an int n and sum the first n Fibonnaci numbers.
 */
public class Exercise8910 {
    public static void main(String[] args) {
        repeat(-1, "nice");
        repeat(4, "nice");
        System.out.println("--------------");
        repeatAgain(5, "best");
        System.out.println();
        repeatAgain(-2, "best");
        System.out.println("--------------");
        fibo(10);
        System.out.println("--------------");
        fiboSum(5);
        System.out.println("--------------");
        sumOfFiboByN(3);
        sumOfFiboByN(20);
        sumOfFiboByN(25);
    }

    //exercise 8
    public static void repeat(int n, String s) {

        for (int i = 1; i <= n; i++) {
            System.out.println(s);
        }
        if (n < 0) {
            System.out.println("white space");
        }
    }

    //exercise 9
    public static void repeatAgain(int n, String s) {
        for (int i = 1; i <= n; i++) {
            System.out.print(s);
        }
        if (n < 0) {
            System.out.println("white space again~~");
        }
    }

    //exercise 10
    public static void fibo(int countTime) {

        if (countTime == 0) {
            System.out.println("0");
        } else if (countTime == 1) {
            System.out.println("0,1");
        } else {

            System.out.println("0");
            System.out.println("1");
            int a = 0;
            int b = 1;

            for (int i = 0; i < countTime - 2; i++) {
                //the first two count "0" and "1" have already print out, so here should - 2 times.
                int nextNumber = a + b;
                System.out.println(nextNumber);
                a = b;
                b = nextNumber;
            }
        }
    }

    //exercise 11
    public static void fiboSum(int sum) {

        int a = 0;
        int b = 1;
        sum = 0;
        for (int i = 0; i < 10-2; i++) {
            //10-2 means count 10 time, from 0-9 is 10 times, "0" and "1" gonna missing, it should be count as 2 times already
            int nextNumber = a + b;
            sum = sum + nextNumber;

            a = b;
            b = nextNumber;
        }
        System.out.println(sum + 1);
        //at the beginning of fibo, there is "0,1,1", since sum starts from the sceond "1", so should add another "1". s

    }
    //exercise 12
    public static void sumOfFiboByN (int n){
        int a =0;
        int b =1;
        int sum = 0;

        for (int i=0; i<n-2; i++){
            int nextNumber = a + b;
            sum = sum+nextNumber;

            a=b;
            b=nextNumber;
        }
        System.out.println(sum+1);
    }

}
