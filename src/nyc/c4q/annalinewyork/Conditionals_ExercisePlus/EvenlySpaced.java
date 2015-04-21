package nyc.c4q.annalinewyork.Conditionals_ExercisePlus;

/**
 * Created by c4q-nali on 4/18/15.
 * Given three ints, a b c, one of them is small, one is medium and one is large.
 * Return true if the three values are evenly spaced, so the difference between small and
 * medium is the same as the difference between medium and large.
 * <p/>
 * evenlySpaced(2, 4, 6) → true
 * evenlySpaced(4, 6, 2) → true
 * evenlySpaced(4, 6, 3) → false
 */
public class EvenlySpaced {
    public static void main(String[] args) {
        System.out.println(isEven(3, 1, 5));
        System.out.println(isEven(3, 5, 1));
        System.out.println(isEven(1, 3, 5));
        System.out.println(isEven(1, 5, 3));
        System.out.println(isEven(5, 1, 3));
        System.out.println(isEven(5, 3, 1));

    }

    public static boolean isEven(int a, int b, int c) {

        if (Math.abs(a - b) == Math.abs(b - c)) {
            return true;
        }
        else if (Math.abs(b - a) == Math.abs(c - a)) {
            return true;
        }
        else if (Math.abs(a-c) == Math.abs(b-c)){
            return true;
        }
        else {
            return false;
        }

    }
}
