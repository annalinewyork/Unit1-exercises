package nyc.c4q.annalinewyork.Conditionals_ExercisePlus;


/**
 * Created by c4q-nali on 4/16/15.
 * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is
 * the weekend, in which case there is no upper bound on the number of cigars. Write a method called cigarParty
 * that takes an int (the number of cigars) and boolean (whether or not it is the weekend)
 * as parameters, and returns true if the party with the given values is successful, or false otherwise.
 */
public class CigarParty {

    public static void main(String[] args) {

        System.out.println(party(1,true));

    }

    public static boolean party(int cigars, boolean isWeekend) {

        if (cigars>=40 && cigars <=60 && !isWeekend){
            return true;
        }
        else{
            return false;
        }


    }
}
