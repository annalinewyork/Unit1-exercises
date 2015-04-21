package nyc.c4q.annalinewyork.Loops_ExercisePlus;

/**
 * Created by c4q-nali on 4/19/15.
 * Given a string and a non-empty word string, return a string made of each char just before
 * and just after every appearance of the word in the string. Ignore cases where there is no
 * char before or after the word, and a char may be included twice if it is between two words.
 * <p/>
 * wordEnds("abcXY123XYijk", "XY") → "c13i"
 * wordEnds("XY123XY", "XY") → "13"
 * wordEnds("XY1XY", "XY") → "11"
 */
public class BetweenWords {

    public static void main(String[] args) {

        System.out.println(betweenWords("abcXY123XYijk", "XY"));
    }

    public static String betweenWords(String input, String findWord) {

        String before;
        String after;
        String result = "";

        int b = input.indexOf(findWord);

        while (true) {
            if (input.contains(findWord)) {
                before = input.substring((b) - 1, b);
                after = input.substring(b + findWord.length(), b + findWord.length() + 1);
                result = result + before + after;
            }
            else
                break;
        }

        return result;
    }

}
//while (true) {
//        //keep checking for the substring by resetting your before, after, and your-new-variable
//        if (input includes findWord) {
//        before = input.substring(indexOf(findWord) - 1, indexOf(findWord));
//        after = input.substring(indexOf(findWord) + findWord.length(), indexOf(findWord) + findWord.length()+1);
//        result += before;
//        result += after;
//        } else {
//        break;
//        }