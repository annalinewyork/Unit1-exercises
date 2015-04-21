package nyc.c4q.annalinewyork.Loops_ExercisePlus;

import java.lang.*;

/**
 * Created by c4q-nali on 4/19/15.
 * Given a string, return a string where every appearance of the lowercase word "is"
 * has been replaced with "is not". The word "is" should not be immediately preceeded
 * or followed by a letter -- so for example the "is" in "this" does not count.
 * (Note: Character.isLetter(char) tests if a char is a letter.)
 * <p/>
 * notReplace("is test") → "is not test"
 * notReplace("is-is") → "is not-is not"
 * notReplace("This is right") → "This is not right"
 */
public class IsNot {
    public static void main(String[] args) {
        System.out.println(replace("this is a cat."));
        //   System.out.println();

    }

    public static String replace(String userinput) {
        String target = " is ";
        String targetFind = " is not ";
        while (userinput.contains(target)) {
            userinput = userinput.replace(target, targetFind);
            break;
        }

        return userinput;
    }
}

