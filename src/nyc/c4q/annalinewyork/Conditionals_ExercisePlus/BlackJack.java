package nyc.c4q.annalinewyork.Conditionals_ExercisePlus;

/**
 * Created by c4q-nali on 4/18/15.
 * Given 2 int values greater than 0, return whichever value is nearest to 21
 * without going over. Return 0 if they both go over.
 * <p/>
 * blackjack(19, 21) → 21
 * blackjack(21, 19) → 21
 * blackjack(19, 22) → 19
 */
public class BlackJack {

    public static void main(String[] args) {
        System.out.println(result(19, 21));
    }

    public static int result(int a, int b) {

        if (a > 21 && b <= 21) {
            return b;
        } else if (a <= 21 && b > 21) {
            return a;
        } else if (a <= 21 && b <= 21 && a > b) {
            return a;
        } else if (a <= 21 && b <= 21 && b > a) {
            return b;
        } else
            return 0;
    }
}
