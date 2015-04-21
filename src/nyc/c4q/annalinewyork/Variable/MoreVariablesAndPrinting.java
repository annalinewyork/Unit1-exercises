package nyc.c4q.annalinewyork.Variable;

/**
 * Created by c4q-nali on 4/14/15.
 */
public class MoreVariablesAndPrinting {
    public static void main (String [] args){
        String herName,herEyes,herTeeth,herHair;
        int herAge,herHeight,herWeight;
        double herHeightInCM,herWeightInKG;

        herName = "Zed A. Shaw";
        herAge = 35;
        herHeight = 74;
        herWeight = 180;
        herEyes = "Blue";
        herTeeth = "White";
        herHair = "Brown";

        herHeightInCM = herHeight*2.54;
        herWeightInKG = herWeight*0.4536;


        //1POUND=0.4536KG

        System.out.println("Let's talk about " + herName + " .");
        System.out.println("He's "+herHeight + " inches (or " +herHeightInCM + " cm )  tall.");
        System.out.println("He's " + herWeight +" pounds (or " +herWeightInKG + " kg ) heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got "+herEyes + " eyes and " + herHair + " hair.");
        System.out.println("His teeth are usually "+ herTeeth + " depending on the coffee. ");

        System.out.println("If I add "+ herAge +" ,"+herHeight+ " ,and "+ herWeight + " I get " + (herAge+herHeight+herWeight) + " .");
        //Math.round(1.7333);
        //How can I round a floating point number?
        //You can use the round() function like this: Math.round(1.7333).

    }
}
