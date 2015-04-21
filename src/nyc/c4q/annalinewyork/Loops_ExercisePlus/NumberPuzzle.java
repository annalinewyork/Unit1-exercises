package nyc.c4q.annalinewyork.Loops_ExercisePlus;

/**
* Created by c4q-nali on 4/19/15.
* Use nested for loops to generate a list of all the pairs of positive two digit
* numbers whose sum is 60, and whose difference is 14.
*/
public class NumberPuzzle {

    public static void main(String[] args) {


        for (int i = 0; i <= 99; i++) {
            for (int j =0; j<=99; j++) {
                int result1 = i + j;
                int result2 = i - j;

                if (result1 == 60) {
                    System.out.print("Sum "+i+" ");
                    System.out.println(j);
                }
                else if (Math.abs(result2)== 14){
                    System.out.print("Difference "+i+" ");
                    System.out.println(j);
                }


            }


        }
    }
}