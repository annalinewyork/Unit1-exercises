package nyc.c4q.annalinewyork.Conditionals_ExercisePlus;
import java.lang.*;

/**
 * Created by c4q-nali on 4/18/15.
 * You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different
 * from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of
 * the numbers are the same, the result is 10. Write a method that takes 3 ints as parameters and
 * returns the correct result.
 */
public class LotteryTicket {
    public static void main(String[] args) {
        System.out.println(money("123"));

    }
    public static int money (String rightNumber) {


        String Lucky = "123";

        if (rightNumber.equals(Lucky)){
            return 20;
        }
        else if (rightNumber.contains("1")&&rightNumber.contains("2")){
            return 10;
        }else if (rightNumber.contains("1")&&rightNumber.contains("3")){
            return 10;
        }else if (rightNumber.contains("2")&&rightNumber.contains("3")){
            return 10;
        } else
            return 0;
    }
}
