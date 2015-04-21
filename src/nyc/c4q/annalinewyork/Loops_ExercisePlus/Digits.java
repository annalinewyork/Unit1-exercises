package nyc.c4q.annalinewyork.Loops_ExercisePlus;

/**
 * Created by c4q-nali on 4/19/15.
 * Use nested for loops to generate a list of all the positive two digit numbers.
 * Display the numbers, and the sums of their digits.
 */
public class Digits {

    public static void main(String[] args) {

        for (int firstRow =1; firstRow<=9; firstRow++){

            for (int secRow = 0; secRow<=9; secRow++){
                System.out.print(firstRow);
                System.out.print(secRow + " ,");
                int sum = firstRow+secRow;
                System.out.println(" "+firstRow+"+"+secRow+"="+sum);
                continue;
            }
        }


    }
}
