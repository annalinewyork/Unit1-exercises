package nyc.c4q.annalinewyork.Conditionals_ExercisePlus;

/**
* Created by c4q-nali on 4/18/15.
* You are driving a little too fast, and a police officer stops you. Write code to compute the
* result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or
* less, the result is 0. If speed is between 61 and 80 inclusive, the result is
* 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day,
* your speed can be 5 higher in all cases.
*/
public class CaughtSpeeding {

    public static void main (String [] args) {

       // System.out.println(isBirthday(true));

        System.out.println(overspeed(88,false));
    }

    public static int overspeed (int overSP,boolean isBirthday) {

        if (overSP <= 60 && !isBirthday) {
            return 0;
        } else if (overSP >= 61 && overSP <= 80 && !isBirthday) {
            return 1;
        } else if (overSP >= 81 && !isBirthday) {
            return 2;
        }else
            return 0;
    }

}
