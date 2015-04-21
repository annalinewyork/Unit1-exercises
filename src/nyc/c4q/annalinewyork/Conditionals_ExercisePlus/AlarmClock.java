package nyc.c4q.annalinewyork.Conditionals_ExercisePlus;

/**
 * Created by c4q-nali on 4/18/15.
 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating
 * if we are on vacation, return a string of the form "7:00" indicating when the alarm clock
 * should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
 * Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
 */
public class AlarmClock {
    public static void main(String[] args) {
        System.out.println(alarm(true, true));
    }


    public static String alarm(boolean isVacation, boolean isWeekdays) {

        if (!isVacation && isWeekdays) {
            return "7:00";
        } else if (!isVacation && !isWeekdays) {
            return "10:00";
        } else if (isVacation && isWeekdays) {
            return "10:00";
        } else if (isVacation && !isWeekdays) {
            return "off";
        } else
            return "please enter a correct answer.";
    }
}